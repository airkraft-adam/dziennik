package adam.dziennik;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Oceny {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private Integer IdUcznia;
    private Integer polski;
    private Integer matematyka;
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="idUcznia")
//    private Student student;

    public Oceny() {    }

    public Oceny(Integer idUcznia, Integer polski, Integer matematyka) {
        IdUcznia = idUcznia;
        this.polski = polski;
        this.matematyka = matematyka;
    }

    public Oceny(Integer id, Integer idUcznia, Integer polski, Integer matematyka) {
        this.id = id;
        this.IdUcznia = idUcznia;
        this.polski = polski;
        this.matematyka = matematyka;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUcznia() {
        return IdUcznia;
    }

    public void setIdUcznia(Integer idUcznia) {
        IdUcznia = idUcznia;
    }

    public Integer getPolski() {
        return polski;
    }

    public void setPolski(Integer polski) {
        this.polski = polski;
    }

    public Integer getMatematyka() {
        return matematyka;
    }

    public void setMatematyka(Integer matematyka) {
        this.matematyka = matematyka;
    }
}
