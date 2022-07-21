package agri.persistance.stavka;

import agri.persistance.faktura.Faktura;
import agri.persistance.narudzbina.Narudzbina;
import agri.persistance.tip_proizvoda.TipProizvoda;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the stavka database table.
 * 
 */
@Entity
@NamedQuery(name="Stavka.findAll", query="SELECT s FROM Stavka s")
public class Stavka implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STAVKA_ID_GENERATOR", sequenceName="STAVKA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STAVKA_ID_GENERATOR")
	private Integer id;

	@Column(name="jedinica_mere")
	private String jedinicaMere;

	private Integer kolicina;

	@Column(name="obracunata_cena")
	private BigDecimal obracunataCena;

	//bi-directional many-to-one association to Faktura
	@ManyToOne
	@JoinColumn(name="faktura")
	private Faktura faktura;

	//bi-directional many-to-one association to Narudzbina
	@ManyToOne
	@JoinColumn(name="narudzbina")
	private Narudzbina narudzbina;

	//bi-directional many-to-one association to TipProizvoda
	@ManyToOne
	@JoinColumn(name="tip_proizvoda")
	private TipProizvoda tipProizvoda;

	public Stavka() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJedinicaMere() {
		return this.jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}

	public Integer getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(Integer kolicina) {
		this.kolicina = kolicina;
	}

	public BigDecimal getObracunataCena() {
		return this.obracunataCena;
	}

	public void setObracunataCena(BigDecimal obracunataCena) {
		this.obracunataCena = obracunataCena;
	}

	public Faktura getFaktura() {
		return this.faktura;
	}

	public void setFaktura(Faktura faktura) {
		this.faktura = faktura;
	}

	public Narudzbina getNarudzbina() {
		return this.narudzbina;
	}

	public void setNarudzbina(Narudzbina narudzbina) {
		this.narudzbina = narudzbina;
	}

	public TipProizvoda getTipProizvoda() {
		return this.tipProizvoda;
	}

	public void setTipProizvoda(TipProizvoda tipProizvoda) {
		this.tipProizvoda = tipProizvoda;
	}

}