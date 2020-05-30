package com.example.demo090.control;

import com.example.demo090.control.param.CommodityReq;
import com.example.demo090.control.param.UserReq;
import com.example.demo090.dao.entity.ChangeIDWithStatus;
import com.example.demo090.dao.entity.CommodityEntity;
//import com.example.demo090.dao.entity.UnHandledCommunityEntity;
import com.example.demo090.dao.repository.CommodityRepository;
//import com.example.demo090.dao.repository.UnHandledCommodityRepository;
import com.example.demo090.domain.Commodity;
import com.example.demo090.service.CommodityService;
import com.example.demo090.utils.JsonXMLUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 未处理商品控制类，用户发布商品后，首先进到此类
 */
@RestController
@RequestMapping("/unhandled")
public class UnHandledComHandler {

    //@Autowired
    //UnHandledCommodityRepository unHandledCommodityRepository;

    @Autowired
    CommodityRepository commodityRepository;

    /**
     * 找到商品状态为unchecked的商品
     * @return
     */
    @GetMapping("/findall")
    public List<CommodityEntity> findAll(){
        return commodityRepository.findByComStatus("unchecked");
    }

    /**
     * 修改物品状态为已发布
     * @param
     * @return
     */
    @PostMapping("/changestatus")
    public CommodityEntity changeStatus(@RequestBody ChangeIDWithStatus changeIDWithStatus){
        System.out.println(changeIDWithStatus.getComID());
        CommodityEntity commodityEntity = commodityRepository.findByComID(changeIDWithStatus.getComID());
        commodityEntity.setComStatus("released");
        commodityRepository.save(commodityEntity);
        return commodityEntity;
    }


    /**
     *error
     * @param models
     * @return
     * @throws Exception
     */

}
