package pog.highlandpan.mapper;

import org.apache.ibatis.annotations.Mapper;
import pog.highlandpan.domain.Contigs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pog.highlandpan.domain.request.ContigsQueryRequest;

import java.util.List;

/**
* @author pgg_m
* @description 针对表【contigs】的数据库操作Mapper
* @createDate 2024-05-27 17:40:07
* @Entity generator.domain.Contigs
*/
@Mapper
public interface ContigsMapper extends BaseMapper<Contigs> {

    List<Contigs> findContigsByCriteria(ContigsQueryRequest request);
}




