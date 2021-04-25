package net.codejava;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JavaWebApplication.Model.MyDb;

public class CategoryDAO 
{
	MyDb newconn = new MyDb();
	
    
    public List<Category> categories() throws SQLException
    {
        List<Category> listCategory = new ArrayList<>();
         
        try (Connection connection = newconn.getCon()) 
        {
            String sql = "SELECT * FROM doctor ORDER BY name";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) 
            {
                int id = result.getInt("Doc_id");
                String name = result.getString("Name");
                Category category = new Category(id, name);
                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listCategory;
    }
}