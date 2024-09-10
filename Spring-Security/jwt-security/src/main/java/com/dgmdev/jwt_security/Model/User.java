package com.dgmdev.jwt_security.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String userId;
    private String name;
    private String email;

}
