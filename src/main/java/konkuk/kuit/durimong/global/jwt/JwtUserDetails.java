package konkuk.kuit.durimong.global.jwt;

import konkuk.kuit.durimong.global.exception.CustomException;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

import static konkuk.kuit.durimong.global.exception.ErrorCode.UNAUTHORIZED;

@Getter
public class JwtUserDetails implements UserDetails {

    private Long usIdx;

    public JwtUserDetails(Long usIdx) {
        if (usIdx == null) {
            throw new CustomException(UNAUTHORIZED, "UserDetails 생성에 실패했습니다.");
        }
        this.usIdx = usIdx;
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return usIdx.toString();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

}
