package adam.dziennik.repository;

import adam.dziennik.Student;
import adam.dziennik.ZestawienieJoin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
List<Student> findAll();

//    @Query("SELECT new adam.dziennik.ZestawienieJoin(s.imie, s.nazwisko, o.matematyka, o.polski ) FROM Student s JOIN s.ocenyList o")
//    List<ZestawienieJoin> FindAllWithDescriptionQuery();
}
