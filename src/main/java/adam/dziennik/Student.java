package adam.dziennik;

import javax.persistence.*;
import java.util.List;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String klasa;
    private String imie;
    private String nazwisko;

    public Student() {
    }

    public Student(Integer id, String imie, String nazwisko, String klasa) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
    }

    public Student(String imie, String nazwisko, String klasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
    }

//    public List<Oceny> getOcenyList() {
//        return ocenyList;
//    }
//
//    public void setOcenyList(List<Oceny> ocenyList) {
//        this.ocenyList = ocenyList;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", klasa='" + klasa + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
