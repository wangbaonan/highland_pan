package pog.highlandpan.domain.request;

import lombok.Data;

@Data
public class ContigsQueryRequest {
    private String gene;
    private String chr;
    private String population;
    private Long calcStart;
    private Long calcEnd;
    private String annotation;
    private String category;
    private Integer eorINumberSort;
}