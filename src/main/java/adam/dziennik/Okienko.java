package adam.dziennik;

import adam.dziennik.controler.Controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

//@SpringBootApplication
@Controller
public class Okienko extends JFrame implements ActionListener {

    @Autowired
    Controler controler;

    JComboBox<String> lista;
    TextField jeden;
    TextField dwa;
    TextField trzy;
    String imie;
    String nazwisko;
    String klasa;
    TextField id;


    public Okienko() {
        setLayout(null);
        setSize(900, 500);
        setTitle("E_dziennik");

        lista = new JComboBox<String>();
        lista.setBounds(50, 150, 100, 20);
        lista.addItem("dodaj ucznia");
        lista.addItem("wstaw ocene");
        lista.addActionListener(this);


        ImageIcon imgicon = new ImageIcon("c:/ws/dziennik/images.jpg");
        JLabel image = new JLabel(imgicon);
        image.setBounds(500, 10, 350, 200);
        add(image);


        Label hedder = new Label("Dziennik elektroniczny");
        hedder.setBounds(100, 0, 400, 30);
        hedder.setVisible(true);
        Font fontBold = new Font("TimesNewRoman", Font.BOLD, 28);
        hedder.setFont(fontBold);
        Label opis = new Label("Api dla nauczyciela");
        opis.setBounds(100, 40, 300, 30);
        opis.setVisible(true);
        Font font = new Font("Courier", Font.ITALIC, 22);
        opis.setFont(font);

        id = new TextField();
        id.setBounds(10, 80, 30, 30);
        jeden = new TextField();
        jeden.setBounds(50, 80, 100, 30);
        dwa = new TextField();
        dwa.setBounds(175, 80, 100, 30);
        trzy = new TextField();
        trzy.setBounds(300, 80, 100, 30);
        trzy.setFont(new Font("", Font.BOLD | Font.CENTER_BASELINE, 18));

        JButton button1 = new JButton("OK");
        button1.setBounds(350, 250, 80, 20);
        button1.addActionListener(this);

        JButton button2 = new JButton("Pokaż");
        button2.setBounds(350, 300, 300, 20);
        button2.addActionListener(this);
        add(id);
        add(dwa);
        add(trzy);
        add(jeden);
        add(opis);
        add(hedder);
        add(lista);
        add(button1);
        add(button2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String wykres = (String) lista.getSelectedItem();
//        Integer Id = Integer.valueOf(id.getText());
        String imie = jeden.getText();
        String nazwisko = dwa.getText();
        String klasa = trzy.getText();
//        System.out.println(imie + " " + nazwisko + " " + klasa);
        Student stud = new Student(imie, nazwisko, klasa);
//        System.out.println(stud);


//        controler.addStudent(stud);
//controler.getAllStud();


    }
}