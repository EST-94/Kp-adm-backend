package com.adm.webservice.example.repository;

import com.adm.webservice.example.entity.VO.TempAdminVO;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class TempAdminRepository {

    private static List<TempAdminVO> adminVOList = Arrays.asList(
            new TempAdminVO("AID-0000", "super"),
            new TempAdminVO("AID-0001", "normalUser")
    );

    public TempAdminVO getByUserName(String userName) {
        return adminVOList.stream()
                .filter(tempAdminVO -> adminVOList.contains(userName))
                .findFirst()
                .orElse(null);
    }

    public void deleteByUid(String uid) {
        assert uid != null;

        adminVOList.remove(adminVOList.indexOf(uid));
    }

    public void save(TempAdminVO tempAdminVO) {

        adminVOList.add(tempAdminVO);
        log.info("*** VO added : {}", tempAdminVO);
        log.info("*** Current adminList : {}", adminVOList);
    }

}
