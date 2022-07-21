package agri.api.faktura;

import agri.api.narudzbina.NarudzbinaModel;
import agri.api.svrha.SvrhaModel;
import agri.api.tip_proizvoda.TipProizvodaModel;

import java.util.Date;

public class FakturaModel {
    private int id;
    private double iznos;
    private Date datum_izdavanja;
    private SvrhaModel svrha;
    private NarudzbinaModel narudzbina;
    
    
    
	public FakturaModel() {
		
	}



	public FakturaModel(int id, double iznos, Date datum_izdavanja, SvrhaModel svrha, NarudzbinaModel narudzbina) {
		super();
		this.id = id;
		this.iznos = iznos;
		this.datum_izdavanja = datum_izdavanja;
		this.svrha = svrha;
		this.narudzbina = narudzbina;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getIznos() {
		return iznos;
	}



	public void setIznos(double iznos) {
		this.iznos = iznos;
	}



	public Date getDatum_izdavanja() {
		return datum_izdavanja;
	}



	public void setDatum_izdavanja(Date datum_izdavanja) {
		this.datum_izdavanja = datum_izdavanja;
	}



	public SvrhaModel getSvrha() {
		return svrha;
	}



	public void setSvrha(SvrhaModel svrha) {
		this.svrha = svrha;
	}



	public NarudzbinaModel getNarudzbina() {
		return narudzbina;
	}



	public void setNarudzbina(NarudzbinaModel narudzbina) {
		this.narudzbina = narudzbina;
	}

   
}

