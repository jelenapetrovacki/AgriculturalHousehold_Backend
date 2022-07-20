package agri.persistance;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fakturisana_stavka database table.
 * 
 */
@Entity
@Table(name="fakturisana_stavka")
@NamedQuery(name="FakturisanaStavka.findAll", query="SELECT f FROM FakturisanaStavka f")
public class FakturisanaStavka implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAKTURISANA_STAVKA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAKTURISANA_STAVKA_ID_GENERATOR")
	private Integer id;

	private Integer faktura;

	private Integer stavka;

	public FakturisanaStavka() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFaktura() {
		return this.faktura;
	}

	public void setFaktura(Integer faktura) {
		this.faktura = faktura;
	}

	public Integer getStavka() {
		return this.stavka;
	}

	public void setStavka(Integer stavka) {
		this.stavka = stavka;
	}

}