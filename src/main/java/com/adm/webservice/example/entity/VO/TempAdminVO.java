package com.adm.webservice.example.entity.VO;

import java.util.Arrays;
import java.util.List;

public record TempAdminVO(String uid, String userName) {

    /*

    TO PERFORM
    - authority
    - relations with admin service

     */

    private static List<TempAdminVO> adminVOList = Arrays.asList(
            new TempAdminVO("AID-0000", "super"),
            new TempAdminVO("AID-0001", "normalUser")
    );
}
