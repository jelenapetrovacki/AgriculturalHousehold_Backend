package agri.api.svrha;

public class SvrhaModel {

    private int id;
    private String opis;

    public SvrhaModel(int id, String opis) {
        this.id = id;
        this.opis = opis;
    }

    public SvrhaModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
