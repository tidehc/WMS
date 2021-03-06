package com.it.sys.common;

/**
 * @Author : Brave
 * @Version : 1.0
 * @Date : 2019/12/23 16:17
 */
public class Constast {

    /**
     * 状态码
     */
    public static final Integer OK = 200;
    public static final Integer ERROR = -1;

    /**
     *  用户默认密码
     */
    public static final String USER_DEFAULT_PWD = "123456";

    /**
     * 菜单权限类型
     */
    public static final String TYPE_MNEU = "menu";
    public static final String TYPE_PERMISSION = "permission";

    /**
     * 可用状态    1
     * 不可用状态  0
     */
    public static final Object AVAILABLE_TRUE = 1;
    public static final Object AVAILABLE_FALSE = 0;

    /**
     * 用户类型
     * 超级管理员  0
     * 普通用户    1
     */
    public static final Integer USER_TYPE_SUPER = 0;
    public static final Integer USER_TYPE_NORMAL = 1;

    /**
     * 展开类型
     */
    public static final Integer OPEN_TRUE = 1;
    public static final Integer OPEN_FALSE = 0;

    /**
     * 商品默认图片
     */
    public static final String IMAGES_DEFAULTHOODSIMG_PNG = "images/defaultgoodsimg.png";

}
