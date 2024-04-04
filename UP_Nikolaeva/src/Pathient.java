public class Pathient {
    private int id_path;
    private String name_path;
    private String surname_path;
    private String otchestvo_path;
    private String tel_path;
    private String num_polis;
    private String prichina;



    public void setId_path(int id_path) {
        this.id_path = id_path;
    }

    public int getId_path() {
        return id_path;
    }

    public String getNum_polis() {
        return num_polis;
    }

    public String getTel_path() {
        return tel_path;
    }

    public String getName_path() {
        return name_path;
    }

    public String getOtchestvo_path() {
        return otchestvo_path;
    }

    public String getPrichina() {
        return prichina;
    }

    public String getSurname_path() {
        return surname_path;
    }

    public void setName_path(String name_path) {
        this.name_path = name_path;
    }

    public void setNum_polis(String num_polis) {
        this.num_polis = num_polis;
    }

    public void setOtchestvo_path(String otchestvo_path) {
        this.otchestvo_path = otchestvo_path;
    }

    public void setPrichina(String prichina) {
        this.prichina = prichina;
    }

    public void setSurname_path(String surname_path) {
        this.surname_path = surname_path;
    }

    public void setTel_path(String tel_path) {
        this.tel_path = tel_path;
    }

}
