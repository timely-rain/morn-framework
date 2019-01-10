package site.morn.services.base.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.morn.services.base.domain.User;
import site.morn.services.base.repository.UserRepository;


@Service
@Transactional
public class SimpleUserService extends SimpleCrudService<User, Long, UserRepository> implements
    UserService {

  public SimpleUserService(UserRepository dao) {
    super(dao);
  }

  @Override
  public User findByUsername(String username) {
    return getDao().findByUsername(username);
  }

  @Override
  public void deleteByUsername(String username) {
    getDao().deleteByUsername(username);
  }

  @Override
  public List<String> getPrivilegeCodes(User user) {

    List<String> list = new ArrayList<>();
//        if (ConstantUtils.isAdmin(user.getUsername()))
//        {
//            list = privilegeService.getAllCodes();
//        }
//        else
//        {
//            user = userDao.findOne(user.getId());
//            Set<Role> roles = user.getRoles();
//            for (Role role : roles)
//            {
//                Set<Privilege> privileges = role.getPrivileges();
//                for (Privilege privilege : privileges)
//                {
//                    list.add(privilege.getPrivilegeCode());
//                }
//            }
//        }

    return list;
  }
}

