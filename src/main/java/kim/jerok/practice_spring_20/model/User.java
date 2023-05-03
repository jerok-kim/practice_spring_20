package kim.jerok.practice_spring_20.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String username;  // kakao_
    private String password;  // UUID
    private String email;  // jerok.kim@gmail.com
    private String provider;  // me, kakao, naver
}
