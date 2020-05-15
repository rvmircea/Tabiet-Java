package Pachet1;

public class AppUser2 {

    private Integer userId;

    private String nume;

    private String prenume;

    private String email;

    private String cnp;

    private String telefon;

    private String parola;

    private Integer contorTabiet;

    public AppUser2(Integer userId, String nume, String prenume, String email, String cnp, String telefon, String parola, Integer contorTabiet) {
        this.userId = userId;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.cnp = cnp;
        this.telefon = telefon;
        this.parola = parola;
        this.contorTabiet = contorTabiet;
    }

    public AppUser2(){};

    public AppUser2(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Integer getContorTabiet() {
        return contorTabiet;
    }

    public void setContorTabiet(Integer contorTabiet) {
        this.contorTabiet = contorTabiet;
    }
}
