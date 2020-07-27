    package com.paytmmoney.sip.sipDemo.Service;
    import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
    import com.paytmmoney.sip.sipDemo.repository.mysql.SipRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.Optional;

    @Service
    public class SipService {

        @Autowired
        private SipRepository sipRepository;

        public List<SipEntity> getAllEntities()
        {
            List<SipEntity> sipList = sipRepository.findAll();

            return sipList;
        }
/*
        public List<SipEntity> getAllEntities()
        {
            List<SipEntity> sipList = sipRepository.findAll();

            return sipList;
        }

        public Optional<SipEntity> getAllEntitiesById(Long id)
        {
            Optional<SipEntity> sipList1 = sipRepository.findById(id);

            return sipList1;
        }
*/
    }
