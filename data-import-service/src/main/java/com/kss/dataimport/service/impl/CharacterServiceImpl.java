package com.kss.dataimport.service.impl;

import com.arangodb.ArangoCursor;
import com.arangodb.springframework.repository.ArangoRepository;
import com.kss.dataimport.entity.Character;
import com.kss.dataimport.repository.CharacterRepository;
import com.kss.dataimport.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:35
 * @Description:
 */
@Service
public class CharacterServiceImpl extends ArangoBaseServiceImpl<Character, String> implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public ArangoRepository getArangoRepository() {
        return characterRepository;
    }

    @Override
    public Iterable<Character> findBySurname(String surname) {
        return characterRepository.findBySurname(surname);
    }

    @Override
    public Collection<Character> findTop2DistinctBySurnameIgnoreCaseOrderByAgeDesc(String surname) {
        return characterRepository.findTop2DistinctBySurnameIgnoreCaseOrderByAgeDesc(surname);
    }

    @Override
    public List<Character> findBySurnameEndsWithAndAgeBetweenAndNameInAllIgnoreCase(String suffix, int lowerBound, int upperBound, String[] nameList) {
        return characterRepository.findBySurnameEndsWithAndAgeBetweenAndNameInAllIgnoreCase(suffix, lowerBound, upperBound, nameList);
    }

    @Override
    public Optional<Character> findByNameAndSurname(String name, String surname) {
        return characterRepository.findByNameAndSurname(name, surname);
    }

    @Override
    public Integer countByAliveTrue() {
        return characterRepository.countByAliveTrue();
    }

    @Override
    public void removeBySurnameNotLikeOrAliveFalse(String surname) {
        characterRepository.removeBySurnameNotLikeOrAliveFalse(surname);
    }

    @Override
    public Iterable<Character> findByChildsName(String name) {
        return characterRepository.findByChildsName(name);
    }

    @Override
    public Iterable<Character> findByChildsAgeBetween(int lowerBound, int upperBound) {
        return characterRepository.findByChildsAgeBetween(lowerBound, upperBound);
    }

    @Override
    public Iterable<Character> getOlderThan(int value) {
        return characterRepository.getOlderThan(value);
    }

    @Override
    public Iterable<Character> getWithSurname(String value) {
        return characterRepository.getWithSurname(value);
    }

    @Override
    public ArangoCursor<Character> getWithSurnameOlderThan(int value, Map<String, Object> bindvars) {
        return characterRepository.getWithSurnameOlderThan(value, bindvars);
    }

    @Override
    public Set<Character> getAllChildsAndGrandchilds(String id, Class<?> edgeCollection) {
        return characterRepository.getAllChildsAndGrandchilds(id, edgeCollection);
    }
}
