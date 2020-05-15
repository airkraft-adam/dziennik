package adam.dziennik.repository;

import adam.dziennik.Oceny;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OcenyRepo extends CrudRepository<Oceny, Integer> {
        List<Oceny> findAll();


        }