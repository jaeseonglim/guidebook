package com.msinternal.guidebook.events;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URI;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Controller
public class EventController {
    @GetMapping("/guide/api")
    public ResponseEntity getGuideBook(Event event){

        System.out.println("event: "+ event.getGuideType());
        System.out.println("GuideType.CRASH:" + GuideType.CRASH);
        if(event.getGuideType() == (GuideType.CRASH)){
            event.setGuideUrl("https://www.naver.com");
        }else{
            event.setGuideUrl("https://www.daum.net");
        }

        URI createUri = linkTo(Event.class).slash(event.getGuideUrl()).toUri();
        return ResponseEntity.created(createUri).body(event);
    }
}
