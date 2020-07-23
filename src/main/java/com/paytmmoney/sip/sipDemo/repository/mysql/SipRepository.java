package com.paytmmoney.sip.sipDemo.repository.mysql;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface SipRepository extends JpaRepository<SipEntity,Integer>{

}
