package com.paytmmoney.sip.sipDemo.Controller;
import com.paytmmoney.sip.sipDemo.Service.SipService;
import com.paytmmoney.sip.sipDemo.dto.MfIsInSipDto;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SipController {

     @Autowired
     private SipService sipService;


    @ResponseBody
    @GetMapping(value="/")
    public String home()
    {
        return "Hello";
    }


    @ResponseBody
    @GetMapping(value = "/getAllEntities")
    public List<SipEntity> getAllEntities()
    {
         List<SipEntity> newList = sipService.getAllEntities();
         return newList;
    }

    @ResponseBody
    @GetMapping(value = "/getAllByUserId/{userid}")
    public List<SipEntity> findByID(@PathVariable (value = "userid") Long userid)
    {
         List <SipEntity> newEntityList = sipService.getAllEntitiesByUserId(userid);
        return newEntityList;
    }

    @ResponseBody
    @GetMapping(value = "v2/getAllByUserId/{userid}")
    public List<MfIsInSipDto> findByIDV2(@PathVariable (value = "userid") Long userid, @RequestParam(value = "pageNumber",required = false,defaultValue = "1")Integer pageNumber, @RequestParam(value = "pageSize",required = false,defaultValue = "10")Integer pageSize)
    {
        pageNumber--;
        List<MfIsInSipDto> mfIsInSipDtoLister = sipService.getAllEntitiesByUserIdV2(userid,pageNumber,pageSize);
        return mfIsInSipDtoLister;
    }
}
