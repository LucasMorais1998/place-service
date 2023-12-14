package com.lucas.placeservice.domain;

import com.lucas.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(
                null,
                placeRequest.name(),
                placeRequest.slug(),
                placeRequest.state(),
                placeRequest.createdAt(),
                placeRequest.createdAt());

        return placeRepository.save(place);
    }
}
