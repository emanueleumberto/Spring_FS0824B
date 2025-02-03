package com.epicode.demoSpring.configurationComponent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("UserComponent")
@Scope("prototype")
public class UserComponent {

    private String name;
    private String lastname;


}
