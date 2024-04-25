package SwingDBTable;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class CityManager {

    private Connection connection = null;
    DBHelper helper = new DBHelper();

    public ArrayList<Citys> getCities(String inputCityID, String inputCityName, String inputCountryID) {
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Citys> cities = null;
        String where = "where ";
        if (inputCityID.isEmpty() && inputCityName.isEmpty() && inputCountryID.isEmpty()) {
            where = "";
        }
        String query = "select city_id,city,country_id from city " + where + inputCityID + inputCityName + inputCountryID;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            cities = new ArrayList<Citys>();
            cities.clear();
            while (resultSet.next()) {
                cities.add(new Citys(
                        resultSet.getInt("city_id"),
                        resultSet.getString("city"),
                        resultSet.getInt("country_id")));
            }
        } catch (SQLException ex) {
            helper.showErrorMessage(ex);
        } finally {
            try{
                connection.close();
            statement.close();
            resultSet.close();
            } catch (SQLException ex) {
                helper.showErrorMessage(ex);
            }catch(NullPointerException ex){
                System.out.println("Error -> " + ex);
            }
            return cities;
        }
    }
    public void addCity(String name,String countryID){
        connection = null;
        PreparedStatement preparedStatement = null;
        String query = "insert into city (city,country_id) values ";
        query = query + "('" + name + "', " + countryID + ")";
        try{
            connection = helper.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            
        }catch(SQLException ex){
            helper.showErrorMessage(ex);
        } finally {
            try{
                connection.close();
                preparedStatement.close();
            } catch (SQLException ex) {
                helper.showErrorMessage(ex);
            }catch(NullPointerException ex){
                System.out.println("Error -> " + ex);
            }
        }
    }
    public void deleteCity(String cityID){
        connection = null;
        PreparedStatement preparedStatement = null;
        String query = "delete from city where city_id=" + cityID;
        try{
            connection = helper.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        }catch(SQLException ex){
            helper.showErrorMessage(ex);
        } finally {
            try{
                connection.close();
                preparedStatement.close();
            } catch (SQLException ex) {
                helper.showErrorMessage(ex);
            }catch(NullPointerException ex){
                System.out.println("Error -> " + ex);
            }
        }
    }

    public ArrayList<Citys> citiesFilterName(String inputCityName) {
        String defaultCityID = "";
        String defaultCountryID = "";
        inputCityName = "city = '" + inputCityName + "'";
        
        return getCities(defaultCityID, inputCityName, defaultCountryID);
    }

    public ArrayList<Citys> citiesFilterCountryID(String inputCountryID) {
        String defaultCityID = "";
        String defaultCityName = "";
        inputCountryID = "country_id=" + inputCountryID;
        return getCities(defaultCityID, defaultCityName, inputCountryID);
    }

    public ArrayList<Citys> citiesFilterCityID(String inputCityID) {
        String defaultCityName = "";
        String defaultCountryID = "";
        inputCityID = "city_id=" + inputCityID;
        return getCities(inputCityID, defaultCityName, defaultCountryID);
    }

    public ArrayList<Citys> getCities() {
        String defaultCityID = "";
        String defaultCityName = "";
        String defaultCountryyID = "";
        return getCities(defaultCityID, defaultCityName, defaultCountryyID);
    }
}
