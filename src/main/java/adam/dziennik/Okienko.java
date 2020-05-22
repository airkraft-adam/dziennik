package adam.dziennik;

import adam.dziennik.controler.Controler;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class Okienko extends JFrame implements ActionListener {

    //    @Autowired
    Controler controler;ł


    JComboBox<String> lista;
    TextField jeden;
    TextField dwa;
    TextField trzy;
    String imie;
    String nazwisko;
    String klasa;


    public Okienko(Controler contr) {
        controler = contr;
        setLayout(null);
        setSize(900, 800);
        setTitle("E_dziennik");

        lista = new JComboBox<String>();
        lista.setBounds(50, 150, 100, 20);
        lista.addItem("dodaj ucznia");
        lista.addItem("wstaw ocene");


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


        jeden = new TextField();
        jeden.setBounds(50, 80, 100, 30);
        jeden.setText("imie");
        dwa = new TextField();
        dwa.setText("nazwisko");
        dwa.setBounds(175, 80, 100, 30);
        trzy = new TextField();
        trzy.setText("klasa");
        trzy.setBounds(300, 80, 100, 30);
        trzy.setFont(new Font("", Font.BOLD | Font.CENTER_BASELINE, 18));

        JButton button1 = new JButton("OK");
        button1.setBounds(350, 250, 80, 20);
        button1.addActionListener(this);


        DefaultTableModel defaultTableModel = new DefaultTableModel();
        JTable tabela = new JTable(defaultTableModel);

        defaultTableModel.addColumn("id");
        defaultTableModel.addColumn("imie");
        defaultTableModel.addColumn("nazwisko");
        defaultTableModel.addColumn("klasa");

        for (Student stud : controler.getAllStud()) {
            defaultTableModel.addRow(new Object[]{
                            stud.getId(),
                            stud.getImie(),
                            stud.getNazwisko(),
                            stud.getKlasa()
                    }
            );
        }
        JScrollPane jScrollPane = new JScrollPane(tabela);
        jScrollPane.setBounds(100, 350, 700, 200);
        add(jScrollPane);


        add(dwa);
        add(trzy);
        add(jeden);
        add(opis);
        add(hedder);
        add(lista);
        add(button1);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String imie = jeden.getText();
        String nazwisko = dwa.getText();
        String klasa = trzy.getText();
        Student stud = new Student(imie, nazwisko, klasa);
        controler.addStudent(stud);


    }
}
