package config;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHandler {
    // ------------------------------------------------ CREATE

    public void adaugaAfectiune(String denumire, String descriere) {
        String sql = "insert into afectiune values (null, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
            statement.setString(1, denumire);
            statement.setString(2, descriere);
            statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void adaugaMedic(String nume, String prenume, String specializare) {
        String sql = "insert into medic values (null, ?, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
            statement.setString(1, nume);
            statement.setString(2, prenume);
            statement.setString(3, specializare);
            statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void adaugaPacient(String nume, String prenume, String data) {
        String sql = "insert into pacient values (null, ?, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
            statement.setString(1, nume);
            statement.setString(2, prenume);
            statement.setString(3, data);
            statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void adaugaTratament(String denumire, String descriere, int pret) {
        String sql = "insert into tratament values (null, ?, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
            statement.setString(1, denumire);
            statement.setString(2, descriere);
            statement.setInt(3, pret);
            statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    // ------------------------------------------------ READ

    public void afiseazaAfectiuni() {
        String sql = "select * from afectiune";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                int id = result.getInt(1);
                String denumire = result.getString("denumire");
                String descriere = result.getString("descriere");

                System.out.println(id + ". " +
                        denumire + " - " +
                        descriere);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void afiseazaMedici() {
        String sql = "select * from medic";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                int id = result.getInt(1);
                String nume = result.getString("nume");
                String prenume = result.getString("prenume");
                String specializare = result.getString("specializare");

                System.out.println(id + ". " +
                        nume + " " +
                        prenume + " - " +
                        specializare);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void afiseazaPacienti() {
        String sql = "select * from pacient";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                int id = result.getInt(1);
                String nume = result.getString("nume");
                String prenume = result.getString("prenume");
                String data = result.getString("data");

                System.out.println(id + ". " +
                        nume + " " +
                        prenume + " - " +
                        data);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void afiseazaTratamente() {
        String sql = "select * from tratament";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                int id = result.getInt(1);
                String denumire = result.getString("denumire");
                String descriere = result.getString("descriere");
                int pret = result.getInt("pret");

                System.out.println(id + ". " +
                        denumire + " - " +
                        descriere + " - " +
                        pret);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    // ------------------------------------------------ UPDATE


    // ------------------------------------------------ DELETE
}
