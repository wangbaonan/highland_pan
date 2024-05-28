package pog.highlandpan.common;


import lombok.Data;

@Data
public class PageResponse<T> extends BaseResponse{
    private long total;
    private Integer page;
    private Integer size;

    public PageResponse(int code, Object data, String message,  String description, long total, Integer page, Integer size) {
        super(code, data, message, description);
        this.total = total;
        this.page = page;
        this.size = size;
    }
}
