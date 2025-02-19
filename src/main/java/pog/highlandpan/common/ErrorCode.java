package pog.highlandpan.common;

/**
 * 错误码
 */
public enum ErrorCode {

    SUCCESS(0, "OK", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    NULL_ERROR(40001, "请求数据为空", ""),
    NOT_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", ""),
    //用户未激活
    USER_NOT_ACTIVATED(40002, "用户未激活", ""),
    USER_LOGIN_ERROR(40003, "用户名或密码错误", ""),
    //文件已存在
    FILE_EXIST(40004, "文件已存在", ""),
    //文件上传失败
    FILE_UPLOAD_ERROR(40005, "文件上传失败", "");


    private final int code;

    /**
     * 状态码信息
     */
    private final String message;

    /**
     * 状态码描述（详情）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}

