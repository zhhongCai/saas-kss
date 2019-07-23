package com.kss.dataimport.service;

import com.kss.dataimport.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:57
 * @Description:
 */
public class CharacterServiceTest extends BaseTest {
    @Autowired
    private CharacterService characterService;

    @Test
    public void testCount() {
        Assert.assertTrue(characterService.count() > 0);
    }

}
