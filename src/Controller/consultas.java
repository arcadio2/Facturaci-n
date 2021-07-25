

package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.HashSet;
import javax.swing.JOptionPane;


public class consultas {
    
    public static Connection getConnection(){
       String url, username, password;
       url="jdbc:mysql://localhost/facturacion";
       username="root";
       password="n0m3l0";
       Connection con = null;
       
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance(); //registra controlador d JDBC
           con = DriverManager.getConnection(url, username, password);
           System.out.println("Conexion Exitosa!");
       }catch(Exception e){
           System.out.println("Conexion fallida!!");
           System.out.println(e.getMessage());
       }
        return con;
    }
    
    public static int Guardarus(Usuario e){
        int fin = 0;
            try{
                Connection con = consultas.getConnection();
                 String sql="insert into cliente"
                    + "(apellido_p,apellido_m,id_sex,id_edo,tel_cel,fecha_nac,email,nombre, RFC)"
                    + " values(?,?,?,?,?,?,?,?,?)"; 
                PreparedStatement set = con.prepareStatement(sql);
              
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date fechaDate =   formato.parse(e.getFecha());
                java.sql.Date sqlDate = new java.sql.Date(fechaDate.getTime());
                
                set.setString(1, e.getAppat());
                set.setString(2, e.getApmat());
                set.setInt(3, e.getSexo());
                set.setInt(4, e.getEstadoCivil()); 
                set.setString(5, e.getTelefono());
                set.setDate(6, sqlDate);
                set.setString(7, e.getCorreo());
                set.setString(8, e.getNombre());
                set.setString(9, e.getRFC());
                fin=set.executeUpdate();
                
                con.close(); 
                 
            }catch(Exception f){
                //fin=1; 
                System.out.println("Ha ocurrido un error al registrar");
                System.out.println(f.getMessage());
            }
        return fin; 
    }

    //Metodo que retorna arraylist de tipo Productos
    public ArrayList<Productos> getproductos(){
        
        ArrayList<Productos> productos= new ArrayList<>(); 
        Connection con=null; 
        PreparedStatement pr=null; //Preparar el estado
        ResultSet rs=null; //Resultado del sql
        String sql;
        //Productos producto = new Productos(); 
        try{
            //Obtiene conexion de esta misma clase 
            con = consultas.getConnection();
            //consulta
            sql="SELECT id_producto, nombre_product, precio FROM producto";
            //Prepara el estado
            pr=con.prepareStatement(sql);
            //obtiene resultados
            rs=pr.executeQuery();
            
            while(rs.next()){
                Productos producto = new Productos(); //Crea nuevo objeto de productis en cada iteracion
                producto.setId_producto(rs.getInt("id_producto")); //Manda a los setters el resultset
                producto.setProducto(rs.getString("nombre_product"));//rs obtiene de la base de datos
                producto.setPrecio(rs.getInt("precio"));
                productos.add(producto);//añade al arraylist
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getCause());
            productos=null;
        }finally{
            try{
                rs.close();
                pr.close();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        return productos; //retorna arraylist
    }
    
    public Cliente getCliente(int idCliente){
         Connection con=null; 
        PreparedStatement pr=null;
        ResultSet rs=null;
        String sql;
        Cliente cliente=new Cliente();
        try{
            System.out.println("EL CLIENTE CON ID "+idCliente);
            con = consultas.getConnection();
            sql="Select * from cliente where id_cliente = ?";
            pr=con.prepareStatement(sql);
            pr.setInt(1, idCliente);
            rs=pr.executeQuery();
          
            if(rs.next()){
                cliente.setId_cliente(rs.getInt("id_cliente"));  
                cliente.setNombre(rs.getString("nombre"));
                cliente.setAppat(rs.getString("apellido_p"));
                cliente.setApmat(rs.getString("apellido_m"));
                cliente.setCorreo(rs.getString("email"));
                cliente.setExiste(true);
                //factura.setCategoria(rs.getString("categoria"));
            }else{
                cliente.setExiste(false);
                System.out.println("NO EXISTE");
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
            cliente=null;
        }finally{
            try{
                rs.close();
                pr.close();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return cliente; 
    }
    
    public static Factura getFactura(int idFactura){
 
        Connection con=null; 
        PreparedStatement pr=null;
        PreparedStatement pr2=null;
        ResultSet rs=null;
        ResultSet rs2=null;
        String sql;
        String sql2;
        Factura factura=new Factura();
        try{
            con = consultas.getConnection();
            sql="call ConsultarFactura(?)";
            sql2="select subtotal,descuento,IVA,total_neto from facturar where id_factura = ?"; 
            pr=con.prepareStatement(sql);
            pr2=con.prepareStatement(sql2); 
            pr.setInt(1, idFactura);
            pr2.setInt(1, idFactura);
            rs=pr.executeQuery();
            rs2=pr2.executeQuery();
          
            if(rs.next() && rs2.next()){
                factura.setId_cliente(rs.getInt("id_cliente"));
                factura.setId_factura(rs.getInt("id_factura"));
                factura.setNombre(rs.getString("nombre"));
                factura.setApellido_p(rs.getString("apellido_p"));
                factura.setApellido_m(rs.getString("apellido_m"));
                factura.setFecha_facturacion(rs.getString("fecha_fact"));
                factura.setCorreo(rs.getString("email"));
                factura.setRFC(rs.getString("RFC"));
                factura.setSubtotal(rs2.getFloat("subtotal"));
                factura.setDescuento(rs2.getFloat("descuento"));
                factura.setIVA(rs2.getFloat("IVA"));
                factura.setTOTAL(rs2.getFloat("total_neto"));
                factura.setExiste(true);
                //factura.setCategoria(rs.getString("categoria"));
            }else{
                factura.setExiste(false);
                System.out.println("NO EXISTE");
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
            factura=null;
        }finally{
            try{
                rs.close();
                pr.close();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return factura;
    }
    
    public ArrayList<Allfacturas>  getAllFacturas(int idCliente){
        ArrayList<Allfacturas> facturas = new ArrayList<>(); 
        Connection con=null; 
        PreparedStatement pr=null;
        ResultSet rs=null;
        String sql;
        
        try{
            con = consultas.getConnection();
            sql="call facts_cliente(?)";
            pr=con.prepareStatement(sql);
            pr.setInt(1, idCliente);
            rs=pr.executeQuery();
            //if(rs.next()){
            try{
                while(rs.next()){
                   
                    Allfacturas factura=new Allfacturas();
                    factura.setId_factura(rs.getInt("id_factura"));
                    factura.setFecha_factura(rs.getString("fecha_fact"));
                    //factura.setFecha_factura(rs.getString("fecha_fact"));
                    factura.setRFC(rs.getString("RFC"));
                    facturas.add(factura); 
                }
            }catch(Exception e){
                facturas =null; 
               
            }
                
            //}else{
              //  System.out.println("No entra");
               // facturas = null;
            //}
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
            facturas=null;
        }finally{
            try{
                rs.close();
                pr.close();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        
        return facturas; 
    }
    
    public static ArrayList<Detalle> getDetalles(int idFactura){
        //
        ArrayList<Detalle> detalles = new ArrayList<>(); 
        Connection con=null; 
        PreparedStatement pr=null;
        ResultSet rs=null;
        String sql;
        //Productos producto = new Productos(); 
        try{
            con = consultas.getConnection();
            sql="select * from detalle_factura natural join producto where id_factura = ?";
            pr=con.prepareStatement(sql);
            pr.setInt(1, idFactura);
            rs=pr.executeQuery();
            while(rs.next()){
                Detalle detalle = new Detalle(); 
                detalle.setId_producto(rs.getInt("id_producto"));
                detalle.setProducto(rs.getString("nombre_product"));
                detalle.setCategoria(rs.getString("categoria"));
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecio(rs.getFloat("precio"));
                detalle.setImporte(rs.getFloat("importe"));
                detalles.add(detalle);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getCause());
            detalles=null;
        }finally{
            try{
                rs.close();
                pr.close();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        return detalles;
    }
    
    public static int Crear_factura(int idCliente){
        int fin = 0;
         ResultSet rs=null;
            try{
                Connection con = consultas.getConnection();
                String sql="call crear_factura(?)"; 
                PreparedStatement set = con.prepareStatement(sql);
                    set.setInt(1, idCliente);
                    rs = set.executeQuery(); 
                    if(rs.next()){
                        fin = rs.getInt(1);
                    }
                    
                con.close(); 
            }catch(Exception f){
                //fin=1; 
                System.out.println("Ha ocurrido un error al registrar");
                System.out.println(f.getMessage());
            }
        return fin; 
    }
    
    public static int Comprar(ArrayList<Compra> compras){
        int fin = 0;
            try{
                for(Compra a:compras){
                    System.out.println("ID_factura "+ a.getId_factura());
                    System.out.println("Cantidad:"+a.getCantidad());
                    System.out.println("Prodcuto:"+a.getId_producto());
                }
                Connection con = consultas.getConnection();
                String sql="call CompraDeProductos(?,?,?)"; 
                PreparedStatement set = con.prepareStatement(sql);
                for(Compra compra:compras){
                    set.setInt(1, compra.getId_factura());
                    set.setInt(2, compra.getId_producto());
                    set.setInt(3, compra.getCantidad());
                    
                    fin=set.executeUpdate();
                   
                 }
                con.close(); 
                 
            }catch(Exception f){
                //fin=1; 
                JOptionPane.showMessageDialog(null, "No existe la factura");
                System.out.println("Ha ocurrido un error al registrar");
               
            }
        return fin; 
    }

public int formaPago(int idPago, int idFactura){
    int valido = 0; 
    try{
                Connection con = consultas.getConnection();
                String sql="UPDATE facturar SET id_pago = ? WHERE id_factura = ?"; 
                PreparedStatement set = con.prepareStatement(sql);
                    set.setInt(1, idPago);
                    set.setInt(2, idFactura);
 
                    valido=set.executeUpdate();
                 
                con.close(); 
            }catch(Exception f){
                //fin=1; 
                System.out.println("Ha ocurrido un error al registrar");
                System.out.println(f.getMessage());
       }        
         
        
    
    return valido; 
}    
    
    
public int getIdProducto(String producto){
        Connection con=null; 
        PreparedStatement pr=null;
        ResultSet rs=null;
        String sql;
        int id_producto = 0; 
        try{
            con = consultas.getConnection();
            sql="select id_producto from producto where nombre_product = ?";
            pr=con.prepareStatement(sql);
            pr.setString(1, producto);
            rs=pr.executeQuery();
            if(rs.next()){
                id_producto = rs.getInt("id_producto");
                //factura.setCategoria(rs.getString("categoria"));
            }else{
                
                System.out.println("NO EXISTE");
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
         
        }finally{
            try{
                rs.close();
                pr.close();
                con.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return id_producto;
    }
    
}
