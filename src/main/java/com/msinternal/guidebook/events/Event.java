package com.msinternal.guidebook.events;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.websocket.OnMessage;

//@Entity
@Getter @Setter @Builder
public class Event {

    //@Id private long id;
    @NotNull()
    private GuideType guideType;

    private String guideUrl;

}
