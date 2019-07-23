package com.kss.dataimport.service;

import com.kss.dataimport.entity.Location;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoPage;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.geo.Polygon;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:43
 * @Description:
 */
public interface LocationService extends ArangoBaseService<Location, String> {

    GeoPage<Location> findByLocationNear(Point location, Pageable pageable);

    GeoResults<Location> findByLocationWithin(Point location, Distance distance);

    Iterable<Location> findByLocationWithin(Point location, Range<Double> distanceRange);

    Iterable<Location> findByLocationWithin(Polygon polygon);
}
