import java.util.ArrayList;

public class Administraator {
    private int id_admin;
    private String name_admin;
    private String sur_admin;
    private String otdelenie;
    private int id_path;
    private String name_path;
    private String surname_path;
    private String otchestvo_path;
    private String tel_path;
    private String num_polis;
    private int id_spech;
    private int id_talon;
    private String time;



    public void addPath(int id_path, String name_path, String surname_path, String otchestvo_path, String tel_path, String num_polis, ArrayList<Pathient> Path){
        Pathient path = new Pathient();
        path.setId_path(id_path);
        path.setName_path(name_path);
        path.setSurname_path(surname_path);
        path.setOtchestvo_path(otchestvo_path);
        path.setTel_path(tel_path);
        path.setNum_polis(num_polis);
        Path.add(path);

    }
    public void DelTalon(int id_talon, ArrayList<Talon> Tal){
        for (int i = 0; i<Tal.size(); i++){
            if (id_talon == Tal.get(i).getId_talon()){
                Tal.remove(i);
            }
        }
    }
    public void DelPath(int id_path, ArrayList<Pathient> Path){
        for (int i = 0; i<Path.size(); i++){
            if (id_path == Path.get(i).getId_path()){
                Path.remove(i);
            }
        }
    }
    public void addTal(int id_talon, int id_path, int id_spech,
                       String time, ArrayList<Talon> Tal){
        Talon talon = new Talon();
        talon.getId_talon(id_talon);
        talon.getId_path(id_path);
        talon.getId_spech(id_spech);
        talon.getTime(time);
        Tal.add(talon);
    }
    public void setId_path(int id_path) {
        this.id_path = id_path;
    }

    public int getId_path() {
        return id_path;
    }

    public void setId_spech(int id_spech) {
        this.id_spech = id_spech;
    }

    public int getId_spech() {
        return id_spech;
    }

    public void setTel_path(String tel_path) {
        this.tel_path = tel_path;
    }

    public void setNum_polis(String num_polis) {
        this.num_polis = num_polis;
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

    public String getSurname_path() {
        return surname_path;
    }

    public void setName_path(String name_path) {
        this.name_path = name_path;
    }


    public void setOtchestvo_path(String otchestvo_path) {
        this.otchestvo_path = otchestvo_path;
    }

    public void setSurname_path(String surname_path) {
        this.surname_path = surname_path;
    }


    public int getId_admin() {
        return id_admin;
    }

    public String getName_admin() {
        return name_admin;
    }

    public String getOtdelenie() {
        return otdelenie;
    }

    public String getSur_admin() {
        return sur_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public void setName_admin(String name_admin) {
        this.name_admin = name_admin;
    }

    public void setOtdelenie(String otdelenie) {
        this.otdelenie = otdelenie;
    }

    public void setSur_admin(String sur_admin) {
        this.sur_admin = sur_admin;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setId_talon(int id_talon) {
        this.id_talon = id_talon;
    }

    public int getId_talon() {
        return id_talon;
    }
}
