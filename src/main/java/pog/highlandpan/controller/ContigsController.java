package pog.highlandpan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pog.highlandpan.common.BaseResponse;
import pog.highlandpan.common.ResultUtils;
import pog.highlandpan.domain.Contigs;
import pog.highlandpan.domain.request.ContigsQueryRequest;
import pog.highlandpan.service.ContigsService;
import pog.highlandpan.utils.ContigsQueryRequestUtil;

import java.util.List;

@RestController
public class ContigsController {

    private final ContigsService contigsService;

    @Autowired
    public ContigsController(ContigsService contigsService) {
        this.contigsService = contigsService;
    }

    @PostMapping("/contigs")
    public BaseResponse<List<Contigs>> findContigsByCriteria(@RequestBody ContigsQueryRequest request) {
        //ContigsQueryRequest validRequest = ContigsQueryRequestUtil.createValidRequest(request);

        return ResultUtils.success(contigsService.findContigsByCriteria(request));
    }
}