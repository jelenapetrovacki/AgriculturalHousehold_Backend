package agri.persistance.faktura;

import agri.persistance.narudzbina.Narudzbina;
import agri.persistance.stavka.Stavka;
import agri.persistance.svrha.Svrha;
import agri.persistance.uplata.Uplata;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the faktura database table.
 * 
 */
@Entity
@NamedQuery(name="Faktura.findAll", query="SELECT f FROM Faktura f")
public class Faktura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAKTURA_ID_GENERATOR", sequenceName="FAKTURA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAKTURA_ID_GENERATOR")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_izdavanja")
	private Date datumIzdavanja;

	private BigDecimal iznos;

	//bi-directional many-to-one association to Narudzbina
	@ManyToOne
	@JoinColumn(name="narudzbina")
	private Narudzbina narudzbina;

	//bi-directional many-to-one association to Svrha
	@ManyToOne
	@JoinColumn(name="svrha")
	private Svrha svrha;

	//bi-directional many-to-one association to Stavka
	@JsonIgnore
	@OneToMany(mappedBy="faktura")
	private List<Stavka> stavkas;

	//bi-directional many-to-one association to Uplata
	@OneToMany(mappedBy="faktura")
	private List<Uplata> uplatas;

	public Faktura() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatumIzdavanja() {
		return this.datumIzdavanja;
	}

	public void setDatumIzdavanja(Date datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public BigDecimal getIznos() {
		return this.iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}

	public Narudzbina getNarudzbina() {
		return this.narudzbina;
	}

	public void setNarudzbina(Narudzbina narudzbina) {
		this.narudzbina = narudzbina;
	}

	public Svrha getSvrha() {
		return this.svrha;
	}

	public void setSvrha(Svrha svrha) {
		this.svrha = svrha;
	}

	public List<Stavka> getStavkas() {
		return this.stavkas;
	}

	public void setStavkas(List<Stavka> stavkas) {
		this.stavkas = stavkas;
	}

	public Stavka addStavka(Stavka stavka) {
		getStavkas().add(stavka);
		stavka.setFaktura(this);

		return stavka;
	}

	public Stavka removeStavka(Stavka stavka) {
		getStavkas().remove(stavka);
		stavka.setFaktura(null);

		return stavka;
	}

	public List<Uplata> getUplatas() {
		return this.uplatas;
	}

	public void setUplatas(List<Uplata> uplatas) {
		this.uplatas = uplatas;
	}

	public Uplata addUplata(Uplata uplata) {
		getUplatas().add(uplata);
		uplata.setFaktura(this);

		return uplata;
	}

	public Uplata removeUplata(Uplata uplata) {
		getUplatas().remove(uplata);
		uplata.setFaktura(null);

		return uplata;
	}

}