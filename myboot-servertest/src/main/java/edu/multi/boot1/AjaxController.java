package edu.multi.boot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {


@RequestMapping("/helloajax")
public MemberDTO test() {
   return new MemberDTO("세윤","반가우요!");//json자동변환(스프링부트내장)
}
}
