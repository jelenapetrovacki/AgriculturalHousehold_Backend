package agri.persistance.narudzbina;

import agri.persistance.faktura.Faktura;
import agri.persistance.stavka.Stavka;
import agri.persistance.klijent.Klijent;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the narudzbina database table.
 * 
 */
@Entity
@NamedQuery(name="Narudzbina.findAll", query="SELECT n FROM Narudzbina n")
public class Narudzbina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NARUDZBINA_ID_GENERATOR", sequenceName="NARUDZBINA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NARUDZBINA_ID_GENERATOR")
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date datum;

	private BigDecimal iznos;

	//bi-directional many-to-one association to Faktura
	@JsonIgnore
	@OneToMany(mappedBy="narudzbina")
	private List<Faktura> fakturas;

	//bi-directional many-to-one association to Klijent
	@ManyToOne
	@JoinColumn(name="klijent")
	private Klijent klijent;

	//bi-directional many-to-one association to Stavka
	@OneToMany(mappedBy="narudzbina")
	private List<Stavka> stavkas;

	public Narudzbina() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public BigDecimal getIznos() {
		return this.iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}

	public List<Faktura> getFakturas() {
		return this.fakturas;
	}

	public void setFakturas(List<Faktura> fakturas) {
		this.fakturas = fakturas;
	}

	public Faktura addFaktura(Faktura faktura) {
		getFakturas().add(faktura);
		faktura.setNarudzbina(this);

		return faktura;
	}

	public Faktura removeFaktura(Faktura faktura) {
		getFakturas().remove(faktura);
		faktura.setNarudzbina(null);

		return faktura;
	}

	public Klijent getKlijent() {
		return this.klijent;
	}

	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}

	public List<Stavka> getStavkas() {
		return this.stavkas;
	}

	public void setStavkas(List<Stavka> stavkas) {
		this.stavkas = stavkas;
	}

	public Stavka addStavka(Stavka stavka) {
		getStavkas().add(stavka);
		stavka.setNarudzbina(this);

		return stavka;
	}

	public Stavka removeStavka(Stavka stavka) {
		getStavkas().remove(stavka);
		stavka.setNarudzbina(null);

		return stavka;
	}

}