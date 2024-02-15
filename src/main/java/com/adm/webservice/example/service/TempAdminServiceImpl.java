package com.adm.webservice.example.service;

import com.adm.webservice.example.entity.VO.TempAdminVO;
import com.adm.webservice.example.repository.TempAdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TempAdminServiceImpl implements TempAdminService {


    @Autowired
    TempAdminRepository tempAdminRepository;

    @Override
    public boolean createUser(TempAdminVO tempAdminVO) {

        try {
            tempAdminRepository.save(tempAdminVO);
            return true;
        } catch (Exception e) {
            log.error("*** failed to save with error, userName : {}, e : {}",
                    tempAdminVO.userName(), e.toString());
            return false;
        }
    }

    @Override
    public boolean UpdateUser() {
        return false;
    }

    @Override
    public TempAdminVO getByUserName(String userName) {
        return tempAdminRepository.getByUserName(userName);
    }

    @Override
    public boolean deleteUser(String uid) {

        try {
            tempAdminRepository.deleteByUid(uid);
            return true;
        } catch (Exception e) {
            log.error("*** failed to delete with error, uid : {}, e : {}",
                    uid, e.toString());
            return false;
        }
    }

}
