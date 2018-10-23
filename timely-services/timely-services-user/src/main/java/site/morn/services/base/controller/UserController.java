package site.morn.services.base.controller;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.MessageSource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.morn.message.MessageHolder;
import site.morn.services.base.domain.User;
import site.morn.services.base.service.UserService;

/**
 * 用户控制器
 *
 * @author timely-rain
 * @version 1.0.0, 2017/9/28
 * @since 1.0-SNAPSHOT
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

  @Resource
  private UserService service;

  @Resource
  private MessageHolder messageHolder;

  @Resource
  private MessageSource messageSource;

  @PostMapping
  public Object add(@Validated User user) {
//        if (result.hasErrors()) {
//            List<FieldError> fieldErrors = result.getFieldErrors();
//            List<String> messages = new ArrayList<>();
//            for (FieldError fieldError : fieldErrors) {
//                String message = messageSource.getMessage(fieldError, messageHolder.currentLocale());
//                String fieldPath = fieldError.getObjectName() + "." + fieldError.getField();
//                String fieldName = messageSource.getMessage(fieldPath, null, fieldPath, messageHolder.currentLocale());
//                messages.add(fieldName + message);
//            }
//            String s = StringUtils.collectionToCommaDelimitedString(messages);
//            return Rests.error().message(s);
//        }
    return new HashMap<>();
  }

  @PostMapping("datatable")
  public List<User> datatable() {
    List<User> all = service.findAll();
    return all;
  }
}