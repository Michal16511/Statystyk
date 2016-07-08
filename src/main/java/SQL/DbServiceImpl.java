package SQL;

import Postacie.Zawodnik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michal on 2016-07-07.
 */
public class DbServiceImpl implements DbService{



    public List<Zawodnik> findAllZawodnik() throws Exception {
        Connection connection = Connector.setConnection();
        Statement statement = connection.createStatement();

        String sqlQuery = "SELECT * FROM `zawodnik`";
        ResultSet resultSet = statement.executeQuery(sqlQuery);


        LinkedList<Zawodnik> zawodniks =  new LinkedList<Zawodnik>();
        while(resultSet.next()){
            String imie = resultSet.getString("imie");
            String nazwisko = resultSet.getString("nazwisko");
            String narodowosc = resultSet.getString("narodowosc");
            String wiek = resultSet.getString("wiek");
            String wzrost = resultSet.getString("wzrost");
            String waga = resultSet.getString("waga");
            String liczbaMeczy = resultSet.getString("liczba_meczy");
            String liczbaGoli = resultSet.getString("liczba_goli");
            String liczbaKartek = resultSet.getString("liczba_kartek");
            String liczbaMinut = resultSet.getString("liczba_minut");
            Zawodnik zawodnik = new Zawodnik();

            zawodniks.add(zawodnik);
        }
        return null;
    }

}
