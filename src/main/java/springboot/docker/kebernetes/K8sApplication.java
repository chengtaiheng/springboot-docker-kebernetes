package springboot.docker.kebernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: 程泰恒
 * @date: 2019/4/23 14:18
 */

@SpringBootApplication
public class K8sApplication {
    public static void main(String[] args) {
        SpringApplication.run(K8sApplication.class, args);
    }
}
