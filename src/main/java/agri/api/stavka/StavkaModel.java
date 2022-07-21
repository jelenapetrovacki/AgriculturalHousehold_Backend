package agri.api.stavka;

import agri.api.faktura.FakturaModel;
import agri.api.narudzbina.NarudzbinaModel;
import agri.api.tip_proizvoda.TipProizvodaModel;
import agri.persistance.klijent.Klijent;

import java.util.Date;

public class StavkaModel {

    private int id;
    private int kolicina;
    private String jedinica_mere;
    private double obracunata_cena;
    private NarudzbinaModel narudzbina;
    private TipProizvodaModel tip_proizvoda;
    private FakturaModel faktura;

    public StavkaModel() {
    }

	public StavkaModel(int id, int kolicina, String jedinica_mere, double obracunata_cena, NarudzbinaModel narudzbina,
			TipProizvodaModel tip_proizvoda, FakturaModel faktura) {
		super();
		this.id = id;
		this.kolicina = kolicina;
		this.jedinica_mere = jedinica_mere;
		this.obracunata_cena = obracunata_cena;
		this.narudzbina = narudzbina;
		this.tip_proizvoda = tip_proizvoda;
		this.faktura = faktura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public String getJedinica_mere() {
		return jedinica_mere;
	}

	public void setJedinica_mere(String jedinica_mere) {
		this.jedinica_mere = jedinica_mere;
	}

	public double getObracunata_cena() {
		return obracunata_cena;
	}

	public void setObracunata_cena(double obracunata_cena) {
		this.obracunata_cena = obracunata_cena;
	}

	public NarudzbinaModel getNarudzbina() {
		return narudzbina;
	}

	public void setNarudzbina(NarudzbinaModel narudzbina) {
		this.narudzbina = narudzbina;
	}

	public TipProizvodaModel getTip_proizvoda() {
		return tip_proizvoda;
	}

	public void setTip_proizvoda(TipProizvodaModel tip_proizvoda) {
		this.tip_proizvoda = tip_proizvoda;
	}

	public FakturaModel getFaktura() {
		return faktura;
	}

	public void setFaktura(FakturaModel faktura) {
		this.faktura = faktura;
	}

    
}
