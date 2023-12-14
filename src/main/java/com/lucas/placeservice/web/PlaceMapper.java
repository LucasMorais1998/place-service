package com.lucas.placeservice.web;

import com.lucas.placeservice.api.PlaceResponse;
import com.lucas.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(
                place.name(),
                place.slug(),
                place.state(),
                place.createdAt(),
                place.createdAt());
    }
}
