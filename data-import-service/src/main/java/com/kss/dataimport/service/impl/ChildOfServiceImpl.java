package com.kss.dataimport.service.impl;

import com.arangodb.springframework.repository.ArangoRepository;
import com.kss.dataimport.entity.ChildOf;
import com.kss.dataimport.repository.ChildOfRepository;
import com.kss.dataimport.service.ChildOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:43
 * @Description:
 */
@Service
public class ChildOfServiceImpl extends ArangoBaseServiceImpl<ChildOf, String> implements ChildOfService {
    @Autowired
    private ChildOfRepository childOfRepository;

    @Override
    public ArangoRepository getArangoRepository() {
        return childOfRepository;
    }
}
