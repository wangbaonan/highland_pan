package pog.highlandpan.service;

import pog.highlandpan.domain.Contigs;
import com.baomidou.mybatisplus.extension.service.IService;
import pog.highlandpan.domain.request.ContigsQueryRequest;

import java.util.List;

/**
* @author pgg_m
* @description 针对表【contigs】的数据库操作Service
* @createDate 2024-05-27 17:40:07
*/
public interface ContigsService extends IService<Contigs> {
    List<Contigs> findContigsByCriteria(ContigsQueryRequest request);
}
