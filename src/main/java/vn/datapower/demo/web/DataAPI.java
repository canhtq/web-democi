package vn.datapower.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author canhthieu
 */
@RestController
public class DataAPI {
    private static final Logger logger = Logger.getLogger(DataAPI.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.service.api-demo}")
    private String apiDemo;
    @GetMapping("/data/v1.0/analytic")
    public ResponseEntity<Resource> downloadFile() throws IOException {
        String apiUrl = apiDemo + "/data/v1.0/analytic";
        logger.info("callService=" + apiUrl);
        ResponseEntity<Resource> responseEntity = restTemplate.getForEntity(apiUrl, Resource.class);
        return responseEntity;
    }
}
