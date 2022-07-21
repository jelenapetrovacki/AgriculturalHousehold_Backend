package agri.api.nacin_uplate;

public class NacinUplateModel {
    private int id;
    private String nacin_uplate;

    public NacinUplateModel() {
    }

    public NacinUplateModel(int id, String nacin_uplate) {
        this.id = id;
        this.nacin_uplate = nacin_uplate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacin_uplate() {
        return nacin_uplate;
    }

    public void setNacin_uplate(String nacin_uplate) {
        this.nacin_uplate = nacin_uplate;
    }
}
