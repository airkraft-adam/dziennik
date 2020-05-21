package adam.dziennik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.awt.*;


@SpringBootApplication
public class DziennikApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(DziennikApplication.class, args);

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                Okienko okienko = new Okienko();
                okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                okienko.setVisible(true);
            }
            });
    }
//    public static void main(String[] args) {
//        SpringApplicationBuilder ctx = new SpringApplicationBuilder(Okienko.class);
//        ctx.headless(false).run(args);
//
//
//        EventQueue.invokeLater(() -> {
//
//            var ex = ctx.getBean(DziennikApplication.class);
//            ex.setVisible(true);
//        });
//    }

}
