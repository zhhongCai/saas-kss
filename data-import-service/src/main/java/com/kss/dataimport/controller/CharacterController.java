package com.kss.dataimport.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kss.dataimport.entity.Character;
import com.kss.dataimport.service.CharacterService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("findOne")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "error")
    public String findOne(String surname) throws JsonProcessingException {
        logger.info("surname=" + surname);
        Iterable<Character> c = characterService.findBySurname(surname);
        return objectMapper.writeValueAsString(c.iterator().next());
    }

    public String error(String surname) {
        return surname + "not found";
    }
}
