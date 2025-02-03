package com.epicode.demoSpring.configurationClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserConfiguration {

    private String name;
    private String lastname;

}
