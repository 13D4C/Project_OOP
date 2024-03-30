package project;

import java.sql.*;

public class DBConnect {
    public Connection con = null;
    public Statement pre;
    public PreparedStatement preS;
    public ResultSet rs;
    
    private String url = "jdbc:mysql://localhost:3306/oop";
    private String username = "root";
    private String password = "1234";
    
    public DBConnect() {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Sucessful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet getLog(String sql, String name, String pass) {
        try {
            preS = con.prepareStatement(sql);
            preS.setString(1, name);
            preS.setString(2, pass);
            rs = preS.executeQuery();
            System.out.println("Sucessfully Selected!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public String getKey(String name, String pass) {
        try {
            preS = con.prepareStatement(String.format("SELECT key_Login FROM login WHERE Username = '%s' and Password = '%s'", name, pass));
            ResultSet rf = preS.executeQuery();
            if (rf.next()) {
                String keyLogin = rf.getString("key_Login");
                System.out.println("key_Login: " + keyLogin);
                return keyLogin;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public String getName(String key) {
        try {
            preS = con.prepareStatement(String.format("SELECT Customer FROM project WHERE ID = '%s' ", key));
            ResultSet rf = preS.executeQuery();
            if (rf.next()) {
                String name = rf.getString("Customer");
                System.out.println("key_Login: " + name);
                return name;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public ResultSet getProject(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT Customer, Telephone, Responsibility, ProjectName, Date_Project, Status FROM project WHERE key_log = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet getQuote(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT Waiting, Accepted, ProjectDone FROM quotation WHERE quotation_id = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet getReminder(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT reminder FROM quotation WHERE quotation_id = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
 
    public ResultSet getMonthSale(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT jan, feb, mar, apr, may, june, july, aug, sept, octo, nov, dece FROM item WHERE item_id = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet getNameItem(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT item, sales FROM item WHERE item_id = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public void getNewUser(String sql, String name, String pass) {
        try {
            preS = con.prepareStatement(sql);
            preS.setString(1, name);
            preS.setString(2, pass);
            preS.executeUpdate();
            System.out.println("Sucessfully Selected!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getAnnualReport(String key, String year) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT income, expense, year FROM profit WHERE profit_key = ? and year = ?");
            preS.setString(1, key);
            preS.setString(2, year);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet getMonthIncome(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT jan_income, feb_income, mar_income, apr_income, may_income, june_income, july_income, aug_income, sep_income, oct_income, nov_income, dec_income FROM profit WHERE profit_key = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet getMonthExpense(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT jan_expense, feb_expense, mar_expense, apr_expense, may_expense, june_expense, july_expense, aug_expense, sep_expense, oct_expense, nov_expense, dec_expense FROM profit WHERE profit_key = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet getItemExpense(String key) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT name, year, expense FROM operating WHERE op_id = ?");
            preS.setString(1, key);
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet getItemExpenseByYear(String key, int lastYear) {
        try {
            PreparedStatement preS = con.prepareStatement("SELECT name, year, expense FROM operating WHERE op_id = ? and year = ?");
            preS.setString(1, key);
            preS.setString(2, String.valueOf(lastYear));
            ResultSet resultSet = preS.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateReminder(String userKey, String reminderText) throws SQLException {
        try {
            String sql = "UPDATE quotation SET reminder = ? WHERE quotation_id = ?";
            PreparedStatement preS = con.prepareStatement(sql);
            preS.setString(1, reminderText);
            preS.setString(2, userKey);
            preS.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            if (preS != null) {
                preS.close();
            }
        }
}
    
    public void disconnectPre() {
        try {
            preS.close();
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
        Connection connect = null;
        PreparedStatement pre = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop", "root", "1234");
            String sql = "SELECT * FROM login WHERE Username = ? ";
            pre = connect.prepareStatement(sql);
            pre.setString(1, "admin");
            System.out.println("Done it");
        } catch (Exception e) {
            e.printStackTrace();
        }
    public void disconnect() {
        try {
            pre.close();
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getUpdate(String sql) {
        try {
            pre = con.createStatement();
            pre.execute(sql);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet getConnect(String sql) {
        try {
            pre = con.createStatement();
            rs = pre.executeQuery(sql);
            System.out.println("Sucessfully Selected!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
*/
