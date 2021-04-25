package net.codejava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.JavaWebApplication.Model.MyDb;

public class AppDAO 
{
	MyDb newconn = new MyDb();
    public List<App> apps() throws SQLException
    {
        List<App> listCategory = new ArrayList<>();
        try (Connection connection = newconn.getCon()) 
        {
            String sql = "SELECT * FROM appointment ORDER BY date"; 
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) 
            {
                int id = result.getInt("Doc_id");
                String name = result.getString("Aname");
                String dat = result.getString("Datee");
                String slot = result.getString("Slot");
                App app = new App(id, name,dat,slot);
                     
                listCategory.add(app);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listCategory;
    }
}