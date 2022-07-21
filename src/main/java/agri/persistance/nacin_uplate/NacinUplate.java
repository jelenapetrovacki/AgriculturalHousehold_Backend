package agri.persistance.nacin_uplate;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nacin_uplate database table.
 * 
 */
@Entity
@Table(name="nacin_uplate")
@NamedQuery(name="NacinUplate.findAll", query="SELECT n FROM NacinUplate n")
public class NacinUplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NACIN_UPLATE_ID_GENERATOR", sequenceName="NACIN_UPLATE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NACIN_UPLATE_ID_GENERATOR")
	private Integer id;

	@Column(name="nacin_uplate")
	private String nacinUplate;

	public NacinUplate() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNacinUplate() {
		return this.nacinUplate;
	}

	public void setNacinUplate(String nacinUplate) {
		this.nacinUplate = nacinUplate;
	}

}