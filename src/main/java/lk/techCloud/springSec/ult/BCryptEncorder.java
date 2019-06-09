package lk.techCloud.springSec.ult;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BCryptEncorder {
    public static void main(String[] args) {

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("client");
        System.out.println(encode);
    }

}
