package com.lucas.placeservice.api;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(@NotBlank String name, @NotBlank String state) {
}
