package adam.dziennik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.awt.*;


@SpringBootApplication
public class DziennikApplication {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        ConfigurableApplicationContext ctx = SpringApplication.run(DziennikApplication.class, args);
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Okienko okienko = ctx.getBean(Okienko.class);
                okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                okienko.setVisible(true);

            }
        });
    }
}