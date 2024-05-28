package pog.highlandpan.utils;

import org.springframework.beans.BeanUtils;
import pog.highlandpan.domain.request.ContigsQueryRequest;

public class ContigsQueryRequestUtil {
    public static ContigsQueryRequest createValidRequest(ContigsQueryRequest originalRequest) {
        ContigsQueryRequest validRequest = new ContigsQueryRequest();

        // 复制所有属性
        BeanUtils.copyProperties(originalRequest, validRequest);

        // 对于字符串属性，如果为空字符串，则置为null
        if (validRequest.getGene() != null && validRequest.getGene().isEmpty()) {
            validRequest.setGene(null);
        }
        if (validRequest.getChr() != null && validRequest.getChr().isEmpty()) {
            validRequest.setChr(null);
        }
        if (validRequest.getPopulation() != null && validRequest.getPopulation().isEmpty()) {
            validRequest.setPopulation(null);
        }
        if (validRequest.getAnnotation() != null && validRequest.getAnnotation().isEmpty()) {
            validRequest.setAnnotation(null);
        }
        if (validRequest.getCategory() != null && validRequest.getCategory().isEmpty()) {
            validRequest.setCategory(null);
        }

        // 如果 calcStart 或 calcEnd 为 null，则设置为 0
        if (validRequest.getCalcStart() == null) {
            validRequest.setCalcStart(0L);
        }
        if (validRequest.getCalcEnd() == null) {
            validRequest.setCalcEnd(0L);
        }

        return validRequest;
    }
}