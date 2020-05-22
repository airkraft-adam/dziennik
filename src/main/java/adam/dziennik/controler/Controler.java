package adam.dziennik.controler;

import adam.dziennik.*;
import adam.dziennik.repository.StudentRepository;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(path = "/Student")
public class Controler {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        System.out.println("Student: " + student);
        Student stud = new Student();
        stud.setId(student.getId());
        stud.setImie(student.getImie());
        stud.setNazwisko(student.getNazwisko());
        stud.setKlasa(student.getKlasa());
        Student save = studentRepository.save(stud);
        return "redirect:/Student/all";
    }

    @GetMapping("/all")
    public String getAllStudents(Model model) {
        model.addAttribute("all", czas());
        model.addAttribute("addStudent", new Student());
        return "dziennik";
    }


    public List<Student> getAllStud() {
        return studentRepository.findAll();
    }

    public List<Student> czas() {
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return new CompareToBuilder()
                        .append(o1.getKlasa(), o2.getKlasa())
                        .build();
            }
        };
        List<Student> all = studentRepository.findAll();
        Collections.sort(all, studentComparator);
        return all;
    }
}