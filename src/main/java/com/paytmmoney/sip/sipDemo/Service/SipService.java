    package com.paytmmoney.sip.sipDemo.Service;
    import com.paytmmoney.sip.sipDemo.dto.MfIsInSipDto;
    import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
    import com.paytmmoney.sip.sipDemo.repository.mysql.SipRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.domain.PageRequest;
    import org.springframework.data.domain.Pageable;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    @Service
    public class SipService {

        @Autowired
        private SipRepository sipRepository;

        public List<SipEntity> getAllEntities() {
            List<SipEntity> sipList = sipRepository.findAll();

            return sipList;
        }

        public List<SipEntity> getAllEntitiesByUserId(Long userid) {
            List<SipEntity> sipList = sipRepository.findByUserId(userid);
            return sipList;
        }

        public HashMap<String, List<SipEntity>> getMapGroupedByIsIn(Long userid, Integer pageNumber, Integer pageSize) {

            Pageable pageableRequest = PageRequest.of(pageNumber, pageSize);
            List<SipEntity> sipList = sipRepository.findByUserId(userid, pageableRequest);
            HashMap<String, List<SipEntity>> sipMap = new HashMap<String, List<SipEntity>>();
            for (SipEntity sipEntity : sipList) {
                List<SipEntity> sipDtoList = null;
                if (sipMap.containsKey(sipEntity.getIsIn())) {
                    sipDtoList = sipMap.get(sipEntity.getIsIn());
                    sipDtoList.add(sipEntity);
                    sipMap.put(sipEntity.getIsIn(), sipDtoList);
                } else {
                    sipDtoList = new ArrayList<SipEntity>();
                    sipDtoList.add(sipEntity);
                    sipMap.put(sipEntity.getIsIn(), sipDtoList);
                }

            }
            return sipMap;
        }

        public List<MfIsInSipDto> getAllEntitiesByUserIdV2(Long userid, Integer pageNumber, Integer pageSize) {
            List<MfIsInSipDto> mfIsInSipDtoLister = new ArrayList<>();
            HashMap<String, List<SipEntity>> sipMap = getMapGroupedByIsIn(userid, pageNumber, pageSize);
            for (Map.Entry<String, List<SipEntity>> e : sipMap.entrySet()) {
                MfIsInSipDto mfIsInSipDto = new MfIsInSipDto();
                mfIsInSipDto.setIsin(e.getKey());
                mfIsInSipDto.setSipInfoList(e.getValue());
                mfIsInSipDtoLister.add(mfIsInSipDto);
            }
            return mfIsInSipDtoLister;
        }

    }