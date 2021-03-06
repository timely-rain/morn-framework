package site.morn.framework.context;

import lombok.experimental.UtilityClass;

/**
 * 通用常量
 *
 * @author timely-rain
 * @since 1.0.0, 2019/1/17
 */
@UtilityClass
public class CommonConstant {

  /**
   * 管理员账号
   */
  public static final String ADMIN = "admin";

  /**
   * 缓存
   */
  @UtilityClass
  public class Caches {

    /**
     * 当前账户缓存组
     */
    public static final String ACCOUNT_GROUP = "account";

    /**
     * 当前激活机构缓存
     */
    public static final String ACTIVE_DEPARTMENT = "activeDepartment";

    /**
     * 当前所属机构缓存
     */
    public static final String DEPARTMENT = "department";

    /**
     * 当前用户缓存
     */
    public static final String USER = "user";

    /**
     * 当前角色缓存
     */
    public static final String ROLES = "roles";
  }

  /**
   * 上下文常量
   */
  @UtilityClass
  public class Context {

    /**
     * 激活的组织机构
     */
    public static final String ACTIVE_DEPARTMENT = "activeDepartment";
  }

  /**
   * 错误码
   */
  @UtilityClass
  public class Errors {

    /**
     * 新增失败
     */
    public static final String ADD_FAILURE = "common.add-failure";

    /**
     * 数据重复
     */
    public static final String PARAMS_DUPLICATION = "common.params-duplication";
  }

  /**
   * 数值/字符串值
   */
  @UtilityClass
  public class Values {

    /**
     * 假
     */
    public static final int FALSE_VALUE = 0;

    /**
     * 假
     */
    public static final String FALSE_STRING = "false";

    /**
     * 真
     */
    public static final int TRUE_VALUE = 1;

    /**
     * 真
     */
    public static final String TRUE_STRING = "true";

    /**
     * 获取布尔整数值
     *
     * @param flag 真/假
     * @return 整数值
     */
    public static int getBoolean(boolean flag) {
      return flag ? TRUE_VALUE : FALSE_VALUE;
    }
  }
}
