package adam.dziennik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;


@SpringBootApplication
public class DziennikApplication {

    public static void main(String[] args) {
        SpringApplication.run(DziennikApplication.class, args);
        System.setProperty("java.awt.headless", "false");

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Okienko okienko = new Okienko();
                okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                okienko.setVisible(true);
            }
            });
    }


}
