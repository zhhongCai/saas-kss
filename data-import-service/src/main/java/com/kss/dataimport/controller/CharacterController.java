package com.kss.dataimport.controller;

import com.kss.dataimport.entity.Character;
import com.kss.dataimport.service.CharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-25 11:32
 * @Description:
 */
@RestController("/character")
public class CharacterController {

    private static Logger logger = LoggerFactory.getLogger(CharacterController.class);

    @Autowired
    private CharacterService characterService;

    @GetMapping("findOne")
    @ResponseBody
    public Character findOne(String surname) {
        logger.info("surname=" + surname);
        Iterable<Character> c = characterService.findBySurname(surname);
        return c.iterator().next();
    }
}
