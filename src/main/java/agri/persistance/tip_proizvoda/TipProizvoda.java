package agri.persistance.tip_proizvoda;

import agri.persistance.stavka.Stavka;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the tip_proizvoda database table.
 * 
 */
@Entity
@Table(name="tip_proizvoda")
@NamedQuery(name="TipProizvoda.findAll", query="SELECT t FROM TipProizvoda t")
public class TipProizvoda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIP_PROIZVODA_ID_GENERATOR", sequenceName="TIP_PROIZVODA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIP_PROIZVODA_ID_GENERATOR")
	private Integer id;

	private Boolean aktuelan;

	@Column(name="jedinicna_cena")
	private BigDecimal jedinicnaCena;

	@Column(name="naziv_tipa")
	private String nazivTipa;

	//bi-directional many-to-one association to Stavka
	@JsonIgnore
	@OneToMany(mappedBy="tipProizvoda")
	private List<Stavka> stavkas;

	public TipProizvoda() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAktuelan() {
		return this.aktuelan;
	}

	public void setAktuelan(Boolean aktuelan) {
		this.aktuelan = aktuelan;
	}

	public BigDecimal getJedinicnaCena() {
		return this.jedinicnaCena;
	}

	public void setJedinicnaCena(BigDecimal jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public String getNazivTipa() {
		return this.nazivTipa;
	}

	public void setNazivTipa(String nazivTipa) {
		this.nazivTipa = nazivTipa;
	}

	public List<Stavka> getStavkas() {
		return this.stavkas;
	}

	public void setStavkas(List<Stavka> stavkas) {
		this.stavkas = stavkas;
	}

	public Stavka addStavka(Stavka stavka) {
		getStavkas().add(stavka);
		stavka.setTipProizvoda(this);

		return stavka;
	}

	public Stavka removeStavka(Stavka stavka) {
		getStavkas().remove(stavka);
		stavka.setTipProizvoda(null);

		return stavka;
	}

}