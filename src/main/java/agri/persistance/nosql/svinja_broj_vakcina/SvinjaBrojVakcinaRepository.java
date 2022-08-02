package agri.persistance.nosql.svinja_broj_vakcina;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SvinjaBrojVakcinaRepository extends CassandraRepository<SvinjaBrojVakcina, String> {

   @Query("update svinja_broj_vakcina "
            + "set broj_vakcina=broj_vakcina-1 where tetovir_broj_svinje=?0")
    void undoUpdateBrojVakcina(String tetovir_broj_svinje);

    SvinjaBrojVakcina findOneByTetovirBrojSvinje (String tetovir_broj_svinje);
}
