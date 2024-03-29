package techcourse.myblog.user.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserLoginDto {
    @Email(message = "올바른 email 형식이 아닙니다.")
    private String email;

    @Pattern(regexp = ".*(?=^.{8,}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*",
            message = "올바른 비밀번호 형식이 아닙니다.")
    private String password;
}
