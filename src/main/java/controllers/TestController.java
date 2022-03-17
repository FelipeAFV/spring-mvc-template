package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @ResponseBody
    @RequestMapping("")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Controller works!!", HttpStatus.OK);
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
