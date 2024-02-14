package az.ingress.demo.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
@ConfigurationProperties("az.ms.app")
@Data
public class Config {

    public String name;
    private String version;
    private String header;
    public List<String> list;
    Map<String,Integer> map;
   // public List<StudentDto> students;


}

