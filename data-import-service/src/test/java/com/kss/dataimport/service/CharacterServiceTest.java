package com.kss.dataimport.service;

import com.arangodb.springframework.core.template.ArangoTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kss.dataimport.BaseTest;
import com.kss.dataimport.entity.Character;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:57
 * @Description:
 */
public class CharacterServiceTest extends BaseTest {
    @Autowired
    private CharacterService characterService;

    @Autowired
    private ArangoTemplate arangoTemplate;

    @Test
    public void testCount() throws JsonProcessingException {
        Assert.assertTrue(characterService.count() > 0);

        Iterable<Character> list = arangoTemplate.findAll(Character.class);
        Assert.assertTrue(list != null && list.iterator().hasNext());
        Optional<Character> db = arangoTemplate.find(list.iterator().next().getId(), Character.class);
        Assert.assertTrue(db.isPresent());

        System.out.println(new ObjectMapper().writeValueAsString(db.get()));
    }

}
