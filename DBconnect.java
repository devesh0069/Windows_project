import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;
public class DBconnect {
    public Connection con;
   public ResultSet rs;
    public DBconnect()throws SQLException
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_oxygen_bank","root","");
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog((Component) this.con,e);
        }
    }
    public int Insert(PreparedStatement pt)
    {
        int i=0;
        try
        {
         i=pt.executeUpdate();
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog((Component) this.con,e);
        }        
        return i;    
    }
    public int Update(PreparedStatement pt)
    {
        int i=0;
        try
        {
                         // JOptionPane.showMessageDialog((Component) this,"upd");
        i=pt.executeUpdate();
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog((Component) this.con,e);
        }        
        return i;    
    }
    public int Delete(PreparedStatement pt)
    {
        int i=0;
        try
        {
         i=pt.executeUpdate();
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog((Component) this.con,e);
        }        
        return i;    
    }
    public int View(PreparedStatement pt)
    { 
        try
        {
            rs=pt.executeQuery();
            
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog((Component)this.con,e);
        }        
        return 1;    
    }     

    /**
     *
     * @param pt
     * @return
     */
    public ResultSet view(PreparedStatement pt)
    { 
        try
        {
            rs=pt.executeQuery();
            
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog((Component)this.con,e);
        }        
        return rs;    
    }     

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
