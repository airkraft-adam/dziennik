package adam.dziennik;

public class ZestawienieJoin {

    String imie;
    String nazwisko;
    Integer matematyka;
    Integer polski;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getMatematyka() {
        return matematyka;
    }

    public void setMatematyka(Integer matematyka) {
        this.matematyka = matematyka;
    }

    public Integer getPolski() {
        return polski;
    }

    public void setPolski(Integer polski) {
        this.polski = polski;
    }

    public ZestawienieJoin() {
    }

    public ZestawienieJoin(String imie, String nazwisko, Integer matematyka, Integer polski) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.matematyka = matematyka;
        this.polski = polski;
    }


}
