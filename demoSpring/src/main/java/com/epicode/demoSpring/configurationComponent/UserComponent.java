package com.epicode.demoSpring.configurationComponent;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component("UserComponent")
@Scope("prototype")
public class UserComponent {

    private String name;
    private String lastname;


}
