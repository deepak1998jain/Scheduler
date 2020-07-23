package com.paytmmoney.sip.sipDemo.Controller;
import com.paytmmoney.sip.sipDemo.Service.SipService;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Optional;

@Controller
public class SipController {

     @Autowired
     private SipService sipservice;


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
         List<SipEntity> newList = sipservice.getAllEntities();

         return newList;
    }

    @ResponseBody
    @GetMapping(value = "/getAllById/{id}")
    public Optional<SipEntity> findByID(@PathVariable (value = "id") Long id)
    {
        Optional<SipEntity> newEntityList = sipservice.getAllEntitiesById(id);
        return newEntityList;
    }
}
