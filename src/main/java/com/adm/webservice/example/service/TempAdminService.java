package com.adm.webservice.example.service;

import com.adm.webservice.example.entity.VO.TempAdminVO;
import org.springframework.stereotype.Service;

@Service
public interface TempAdminService {

    boolean createUser(TempAdminVO tempAdminVO);

    boolean UpdateUser();

    TempAdminVO getByUserName(String userName);

    boolean deleteUser(String uid);
}
