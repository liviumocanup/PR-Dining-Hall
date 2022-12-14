package com.restaurant.DiningHall.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientSubOrderRequest {
    @JsonAlias("restaurant_id")
    private Integer restaurantId;

    private List<Integer> items = new ArrayList<>();

    private Integer priority;

    @JsonAlias("created_time")
    private Long createdTime;

    @JsonAlias("max_wait")
    private Double maximumWaitTime;

    public ClientSubOrderRequest(){
        this.createdTime = Instant.now().toEpochMilli();
    }
}
