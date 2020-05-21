package adam.dziennik.controler;

import adam.dziennik.*;
import adam.dziennik.repository.OcenyRepo;
import adam.dziennik.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.swing.*;
import java.util.List;

@Controller
@RequestMapping(path = "/Student")
public class Controler {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    OcenyRepo ocenyRepo;
//    @Autowired
//    Okienko okienko;


    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        System.out.println("Student: "+ student);
        Student stud = new Student();
        stud.setId(student.getId());
        stud.setImie(student.getImie());
        stud.setNazwisko(student.getNazwisko());
        stud.setKlasa(student.getKlasa());
        System.out.println("Stud:" + stud);
        System.out.println("Repo: " + studentRepository);
        Student save = studentRepository.save(stud);
        return "redirect:/Student/all";
    }

    @GetMapping("/all")
    public String getAllStudents(Model model) {
model.addAttribute("all",studentRepository.findAll());
model.addAttribute("addStudent", new Student());
        return "dziennik";
    }


//    @GetMapping("/hello")
//@ResponseBody
//    public String ssy() {
//        return "hi";
//    }

//    @GetMapping("/oceny")
//    public List<ZestawienieJoin> getAllNotes() {
//        return studentRepository.FindAllWithDescriptionQuery();
//    }
//
//    public void  getAllStud(){
//        System.out.println(studentRepository.findAll());
//    }
//    @GetMapping("ad/{imie}_{nazwisko}_{klasa}")
//    public String addStuden(@PathVariable String imie, @PathVariable String nazwisko,@PathVariable String klasa) {
//        Student stud = new Student();
//        stud.setImie(imie);
//        stud.setNazwisko(nazwisko);
//        stud.setKlasa(klasa);
//        studentRepository.save(stud);
//        return "dodano: "+imie+" "+nazwisko+" "+klasa;
//    }
}
