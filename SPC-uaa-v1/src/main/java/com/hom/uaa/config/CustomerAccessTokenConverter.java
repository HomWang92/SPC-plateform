package com.hom.uaa.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.DefaultUserAuthenticationConverter;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 自定义AccessTokenConverter转换<br/>
 * 不定义这个类，那么自定义的字段的值不会取到（实际上是传过来了）；<br/>
 * 所以，这里主要的操作就是把传过来的自定义的值保存下来。<br/>
 * 关于内部类CustomerUserAuthenticationConverter中的重写方法和私有方法getAuthorities，都是仿照父类DefaultUserAuthenticationConverter来写的，
 * 在debug模式下，跟下代码就知道为什么这么设置值了
 *
 * @author FYK<br /> 2019年8月14日
 * @version 1.0
 * @since JDK：1.8
 */
public class CustomerAccessTokenConverter extends DefaultAccessTokenConverter {

    public CustomerAccessTokenConverter() {
        super.setUserTokenConverter(new CustomerUserAuthenticationConverter());
    }

    private class CustomerUserAuthenticationConverter extends DefaultUserAuthenticationConverter {

        @Override
        public Authentication extractAuthentication(Map<String, ?> map) {
            return new UsernamePasswordAuthenticationToken(map, "N/A", this.getAuthorities(map));
        }

        private Collection<? extends GrantedAuthority> getAuthorities(Map<String, ?> map) {
            if (!map.containsKey(AUTHORITIES)) {
                return AuthorityUtils.commaSeparatedStringToAuthorityList(StringUtils
                        .arrayToCommaDelimitedString(new String[]{}));
            }
            Object authorities = map.get(AUTHORITIES);
            if (authorities instanceof String) {
                return AuthorityUtils.commaSeparatedStringToAuthorityList((String) authorities);
            }
            if (authorities instanceof Collection) {
                return AuthorityUtils.commaSeparatedStringToAuthorityList(
                        StringUtils.collectionToCommaDelimitedString((Collection<?>) authorities));
            }
            throw new IllegalArgumentException("Authorities must be either a String or a Collection");
        }
    }
}
