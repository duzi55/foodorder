package com.gzq.foodorder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodOrder {
    @Id
    @GeneratedValue
    private long FOId;//订单id
    private int foodNum;//食物数量
    private String foodTeste;//食物口味
    private long foodId;
    private long userId;

    public long getFOId() {
        return FOId;
    }

    public void setFOId(long FOId) {
        this.FOId = FOId;
    }

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public String getFoodTeste() {
        return foodTeste;
    }

    public void setFoodTeste(String foodTeste) {
        this.foodTeste = foodTeste;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
