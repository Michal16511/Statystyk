package SQL;

import Postacie.Zawodnik;

import java.util.List;

/**
 * Created by Michal on 2016-07-07.
 */
public interface DbService {

    public List<Zawodnik> findAllZawodnik() throws Exception;
}
