package lk.techCloud.springSec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class,args);
    }

    @Bean
    public PasswordEncoder encoder(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(17);
        return passwordEncoder;
    }
}
