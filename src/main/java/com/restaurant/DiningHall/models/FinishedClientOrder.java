package com.restaurant.DiningHall.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class FinishedClientOrder {
    @JsonAlias("order_id")
    private Integer orderId;

    @JsonAlias("is_ready")
    private Boolean isReady = false;

    @JsonAlias("estimated_waiting_time")
    private Double estimatedWaitingTime;

    private Integer priority = 0;

    @JsonAlias("max_wait")
    private Double maximumWaitTime;

    @JsonAlias("created_time")
    private Long createdTime;

    @JsonAlias("registered_time")
    private Long registeredTime;

    @JsonAlias("prepared_time")
    private Long preparedTime;

    @JsonAlias("cooking_time")
    private Long cookingTime;

    @JsonAlias("cooking_details")
    private List<CookingDetails> cookingDetails;
}
