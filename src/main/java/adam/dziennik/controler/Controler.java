package adam.dziennik.controler;

import adam.dziennik.*;
import adam.dziennik.repository.OcenyRepo;
import adam.dziennik.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping(path = "/Student")
public class Controler {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    OcenyRepo ocenyRepo;

    @GetMapping("/add/{imie}_{nazwisko}_{klasa}")
    @ResponseBody
    public String addStudent(@PathVariable String imie, @PathVariable String nazwisko, @PathVariable String klasa) {
        Student stud = new Student();
        stud.setImie(imie);
        stud.setNazwisko(nazwisko);
        stud.setKlasa(klasa);
        studentRepository.save(stud);
        return "dodano Studenta: " + imie + " " + nazwisko;
    }

    @GetMapping("/all")
    public String getAllStudents(Model model) {
model.addAttribute("all",studentRepository.findAll());
        return "dziennik";
    }

    @GetMapping("/hello")

    public String ssy() {
        return "dziennik";
    }

    @GetMapping("/oceny")
    public List<ZestawienieJoin> getAllNotes() {
        return studentRepository.FindAllWithDescriptionQuery();
    }

    @GetMapping("/oceny/{iducznia}_{polski}_{matematyka}")
    @ResponseBody
    public String addStudent(@PathVariable Integer iducznia, @PathVariable Integer polski, @PathVariable Integer matematyka) {
        Oceny oceny = new Oceny();
        oceny.setIdUcznia(iducznia);
        oceny.setPolski(polski);
        oceny.setMatematyka(matematyka);
        ocenyRepo.save(oceny);
        return "dodano ocene";
    }
}
