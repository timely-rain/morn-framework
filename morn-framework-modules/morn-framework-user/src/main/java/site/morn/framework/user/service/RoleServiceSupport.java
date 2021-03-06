package site.morn.framework.user.service;

import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import site.morn.boot.data.CrudServiceSupport;
import site.morn.core.CriteriaMap;
import site.morn.framework.user.entity.Role;
import site.morn.framework.user.entity.User;
import site.morn.framework.user.repository.RoleRepository;

/**
 * 角色服务实现
 *
 * @author timely-rain
 * @since 1.0.0, 2019/1/9
 */
@Service
public class RoleServiceSupport extends CrudServiceSupport<Role, Long, RoleRepository> implements
    RoleService {

  @Override
  protected Specification<Role> searchSpecification(Role model, CriteriaMap attach) {
    return null;
  }

  @Override
  public List<Role> roles(User user) {
    return repository().findAllByUsersId(user.getId());
  }
}
