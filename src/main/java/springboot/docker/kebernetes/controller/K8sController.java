package springboot.docker.kebernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2019/4/23 14:20
 */

@RestController
@RequestMapping("/kebernetes")
public class K8sController {

    @GetMapping("/test")
    public Map getResult() {

        HashMap<String, Object> resultMap = new HashMap<String, Object>();

        resultMap.put("result", "successful");

        return resultMap;
    }

}
