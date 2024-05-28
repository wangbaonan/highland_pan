package pog.highlandpan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import pog.highlandpan.domain.Contigs;
import pog.highlandpan.domain.request.ContigsQueryRequest;
import pog.highlandpan.service.ContigsService;
import pog.highlandpan.mapper.ContigsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author pgg_m
* @description 针对表【contigs】的数据库操作Service实现
* @createDate 2024-05-27 17:40:07
*/
@Service
public class ContigsServiceImpl extends ServiceImpl<ContigsMapper, Contigs>
    implements ContigsService{
    private final ContigsMapper contigsMapper;

    @Autowired
    public ContigsServiceImpl(ContigsMapper contigsMapper) {
        this.contigsMapper = contigsMapper;
    }
    @Override
    public List<Contigs> findContigsByCriteria(ContigsQueryRequest request) {
        return contigsMapper.findContigsByCriteria(request);
    }
}




