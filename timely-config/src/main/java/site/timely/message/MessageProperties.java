package site.timely.message;

import org.springframework.beans.factory.annotation.Value;

/**
 * 国际化属性
 *
 * @author timely-rain
 * @version 1.0.0, 2018/5/9
 * @since 1.0-SNAPSHOT
 */
public class MessageProperties {

  /**
   * 解释器类型
   *
   * @apiNote 决定用户语言的获取方式
   * @see MessageHolder
   */
  @Value("resolver:" + Constant.DEFAULT_RESOLVER)
  private String resolver;

  /**
   * 默认语言
   */
  @Value("${language:" + Constant.DEFAULT_LANGUAGE + "}")
  private String language;

  /**
   * cookie有效期
   */
  @Value("${cookieMaxAge:" + Constant.DEFAULT_COOKIE_MAX_AGE + "}")
  private Integer cookieMaxAge;

  public String getResolver() {
    return resolver;
  }

  public void setResolver(String resolver) {
    this.resolver = resolver;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Integer getCookieMaxAge() {
    return cookieMaxAge;
  }

  public void setCookieMaxAge(Integer cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
  }
}
