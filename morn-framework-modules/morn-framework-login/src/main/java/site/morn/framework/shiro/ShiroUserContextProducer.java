package site.morn.framework.shiro;

import java.util.Optional;
import org.apache.shiro.SecurityUtils;
import site.morn.bean.annotation.Tag;
import site.morn.framework.context.UserContextProducer;
import site.morn.framework.user.entity.User;
import site.morn.util.TypeUtils;

/**
 * Shiro用户适配器
 *
 * @author timely-rain
 * @since 0.0.1-SNAPSHOT, 2019/4/16
 */
@Tag
public class ShiroUserContextProducer implements UserContextProducer<User> {

  @Override
  public User getCurrent() {
    Object principal = SecurityUtils.getSubject().getPrincipal();
    return TypeUtils.cast(principal);
  }

  @Override
  public String getCurrentUsername() {
    return Optional.ofNullable(getCurrent()).map(User::getUsername).orElse(null);
  }
}
