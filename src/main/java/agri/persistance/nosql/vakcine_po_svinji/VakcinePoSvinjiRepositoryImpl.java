package agri.persistance.nosql.vakcine_po_svinji;

import agri.persistance.svinja_broj_vakcina.SvinjaBrojVakcina;
import agri.persistance.svinja_broj_vakcina.SvinjaBrojVakcinaRepository;
import com.datastax.oss.driver.api.core.uuid.Uuids;
import org.springframework.data.cassandra.core.CassandraBatchOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.repository.query.CassandraEntityInformation;
import org.springframework.data.cassandra.repository.support.SimpleCassandraRepository;


public abstract class VakcinePoSvinjiRepositoryImpl extends SimpleCassandraRepository<VakcinePoSvinji, String>
        implements VakcinePoSvinjiRepository{

    private final CassandraTemplate cassandraTemplate;
    private final SvinjaBrojVakcinaRepository svinjaBrojVakcinaRepository;

    public VakcinePoSvinjiRepositoryImpl(
            final CassandraEntityInformation<VakcinePoSvinji, String> metadata,
            final CassandraTemplate cassandraTemplate,
            final SvinjaBrojVakcinaRepository svinjaBrojVakcinaRepository) {
        super(metadata, cassandraTemplate);
        this.cassandraTemplate = cassandraTemplate;
        this.svinjaBrojVakcinaRepository = svinjaBrojVakcinaRepository;
    }

    @Override
    public <S extends VakcinePoSvinji> S insert(final S vakcinaPoSvinji) {
        vakcinaPoSvinji.setSifraDavanjaVakcine(Uuids.timeBased());
        final CassandraBatchOperations batchOps = cassandraTemplate.batchOps();
        SvinjaBrojVakcina svinjaBrojVakcina = svinjaBrojVakcinaRepository.findOneByTetovirBrojSvinje(vakcinaPoSvinji.getTetovirBrojSvinje());
        svinjaBrojVakcina.setBrojVakcina(svinjaBrojVakcina.getBrojVakcina()+1);
        batchOps.update();
        batchOps.insert(vakcinaPoSvinji);
        batchOps.execute();
        return vakcinaPoSvinji;
    }


}
