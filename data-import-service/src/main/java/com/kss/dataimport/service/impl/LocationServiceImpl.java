package com.kss.dataimport.service.impl;

import com.arangodb.springframework.repository.ArangoRepository;
import com.kss.dataimport.entity.Location;
import com.kss.dataimport.repository.LocationRepository;
import com.kss.dataimport.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoPage;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.geo.Polygon;
import org.springframework.stereotype.Service;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:45
 * @Description:
 */
@Service
public class LocationServiceImpl extends ArangoBaseServiceImpl<Location, String> implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public ArangoRepository getArangoRepository() {
        return locationRepository;
    }

    @Override
    public GeoPage<Location> findByLocationNear(Point location, Pageable pageable) {
        return locationRepository.findByLocationNear(location, pageable);
    }

    @Override
    public GeoResults<Location> findByLocationWithin(Point location, Distance distance) {
        return locationRepository.findByLocationWithin(location, distance);
    }

    @Override
    public Iterable<Location> findByLocationWithin(Point location, Range<Double> distanceRange) {
        return locationRepository.findByLocationWithin(location, distanceRange);
    }

    @Override
    public Iterable<Location> findByLocationWithin(Polygon polygon) {
        return locationRepository.findByLocationWithin(polygon);
    }
}
