package konkuk.kuit.durimong.domain.user.dto.request.signup;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEmailReq {
    @Email
    @Schema(description = "이메일", example = "dlwjddus1112@naver.com")
    private String email;
}
