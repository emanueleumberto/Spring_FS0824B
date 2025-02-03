package com.epicode.demoSpring.configurationComponent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("UserComponent")
@Scope("prototype")
public class UserComponent {

    private String name;
    private String lastname;

}
