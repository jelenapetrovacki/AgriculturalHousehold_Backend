package agri.persistance.klijent;

import agri.persistance.narudzbina.Narudzbina;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the klijent database table.
 * 
 */
@Entity
@NamedQuery(name="Klijent.findAll", query="SELECT k FROM Klijent k")
public class Klijent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="KLIJENT_ID_GENERATOR", sequenceName="KLIJENT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="KLIJENT_ID_GENERATOR")
	private Integer id;

	private String adresa;

	private String kontakt;

	private String mejl;

	private String naziv;

	private Integer pib;

	//bi-directional many-to-one association to Narudzbina
	@JsonIgnore
	@OneToMany(mappedBy="klijent")
	private List<Narudzbina> narudzbinas;

	public Klijent() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getKontakt() {
		return this.kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}

	public String getMejl() {
		return this.mejl;
	}

	public void setMejl(String mejl) {
		this.mejl = mejl;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getPib() {
		return this.pib;
	}

	public void setPib(Integer pib) {
		this.pib = pib;
	}

	public List<Narudzbina> getNarudzbinas() {
		return this.narudzbinas;
	}

	public void setNarudzbinas(List<Narudzbina> narudzbinas) {
		this.narudzbinas = narudzbinas;
	}

	public Narudzbina addNarudzbina(Narudzbina narudzbina) {
		getNarudzbinas().add(narudzbina);
		narudzbina.setKlijent(this);

		return narudzbina;
	}

	public Narudzbina removeNarudzbina(Narudzbina narudzbina) {
		getNarudzbinas().remove(narudzbina);
		narudzbina.setKlijent(null);

		return narudzbina;
	}

}