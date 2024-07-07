package Meta_Coding.chatting.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("api/test")
    public String hello(){
        return "테스트입니다";
    }
    @GetMapping("")
    public String m(){
        return "main 화면입니다";
    }

}
