package com.kss.dataimport.service;

import com.arangodb.ArangoCursor;
import com.kss.dataimport.entity.Character;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 14:38
 * @Description:
 */
public interface CharacterService extends ArangoBaseService<Character, String> {
    Iterable<Character> findBySurname(String surname);

    Collection<Character> findTop2DistinctBySurnameIgnoreCaseOrderByAgeDesc(String surname);

    List<Character> findBySurnameEndsWithAndAgeBetweenAndNameInAllIgnoreCase(
            String suffix,
            int lowerBound,
            int upperBound,
            String[] nameList);

    Optional<Character> findByNameAndSurname(String name, String surname);

    Integer countByAliveTrue();

    void removeBySurnameNotLikeOrAliveFalse(String surname);

    Iterable<Character> findByChildsName(String name);

    Iterable<Character> findByChildsAgeBetween(int lowerBound, int upperBound);

    Iterable<Character> getOlderThan(int value);

    Iterable<Character> getWithSurname(String value);

    ArangoCursor<Character> getWithSurnameOlderThan(int value, Map<String, Object> bindvars);

    Set<Character> getAllChildsAndGrandchilds(String id, Class<?> edgeCollection);
}
