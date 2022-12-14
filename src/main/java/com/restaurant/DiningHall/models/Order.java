package com.restaurant.DiningHall.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    @JsonAlias("order_id")
    private int orderId;

    @JsonAlias("table_id")
    private int tableId;

    @JsonAlias("waiter_id")
    private int waiterId;

    @JsonAlias("items")
    private List<Integer> items;

    @JsonAlias("priority")
    private int priority;

    @JsonAlias("max_wait")
    private double maxWait;

    @JsonAlias("pick_up_time")
    private long pickUpTime;

    @JsonIgnore
    private static AtomicInteger idCounter = new AtomicInteger();

    public Order(int tableId, List<Integer> items, int priority, Double maxWait, long pickUpTime) {
        this.orderId = idCounter.incrementAndGet();
        this.tableId = tableId;
        this.items = items;
        this.priority = priority;
        this.maxWait = maxWait;
        this.pickUpTime = pickUpTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", tableId=" + tableId +
                ", waiterId=" + waiterId +
                ", items=" + items +
                ", priority=" + priority +
                ", maxWait=" + maxWait +
                ", pickUpTime=" + pickUpTime +
                '}';
    }

    public Order(List<Integer> items){
        this.orderId = idCounter.incrementAndGet();
        this.items = items;
    }
}
