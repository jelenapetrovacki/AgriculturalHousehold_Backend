package agri.persistance.svrha;

import agri.persistance.faktura.Faktura;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the svrha database table.
 * 
 */
@Entity
@NamedQuery(name="Svrha.findAll", query="SELECT s FROM Svrha s")
public class Svrha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SVRHA_ID_GENERATOR", sequenceName="SVRHA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SVRHA_ID_GENERATOR")
	private Integer id;

	private String opis;

	//bi-directional many-to-one association to Faktura
	@OneToMany(mappedBy="svrha")
	private List<Faktura> fakturas;

	public Svrha() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public List<Faktura> getFakturas() {
		return this.fakturas;
	}

	public void setFakturas(List<Faktura> fakturas) {
		this.fakturas = fakturas;
	}

	public Faktura addFaktura(Faktura faktura) {
		getFakturas().add(faktura);
		faktura.setSvrha(this);

		return faktura;
	}

	public Faktura removeFaktura(Faktura faktura) {
		getFakturas().remove(faktura);
		faktura.setSvrha(null);

		return faktura;
	}

}