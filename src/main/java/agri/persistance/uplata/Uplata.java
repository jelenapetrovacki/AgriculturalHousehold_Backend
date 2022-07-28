package agri.persistance.uplata;

import agri.persistance.faktura.Faktura;
import agri.persistance.nacin_uplate.NacinUplate;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uplata database table.
 * 
 */
@Entity
@NamedQuery(name="Uplata.findAll", query="SELECT u FROM Uplata u")
public class Uplata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UPLATA_ID_GENERATOR", sequenceName="UPLATA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UPLATA_ID_GENERATOR")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_uplate")
	private Date datumUplate;

	//bi-directional many-to-one association to Faktura
	@ManyToOne
	@JoinColumn(name="faktura")
	private Faktura faktura;

	@ManyToOne
	@JoinColumn(name="nacin_uplate")
	private NacinUplate nacinUplate;

	public Uplata() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatumUplate() {
		return this.datumUplate;
	}

	public void setDatumUplate(Date datumUplate) {
		this.datumUplate = datumUplate;
	}

	public Faktura getFaktura() {
		return this.faktura;
	}

	public void setFaktura(Faktura faktura) {
		this.faktura = faktura;
	}

	public NacinUplate getNacinUplate() {
		return nacinUplate;
	}

	public void setNacinUplate(NacinUplate nacinUplate) {
		this.nacinUplate = nacinUplate;
	}
}