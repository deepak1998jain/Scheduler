package com.paytmmoney.sip.sipDemo.repository.mysql;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SipRepository extends JpaRepository<SipEntity,Long>{

    List<SipEntity> findByUserId(long UserId, Pageable pageableRequest);

    List<SipEntity> findByUserId(long UserId);
}
