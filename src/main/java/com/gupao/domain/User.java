package com.gupao.domain;

import com.gupao.validation.constraints.ValidCardNumber;
import reactor.util.annotation.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 *用户模型
 */
public class User {

    //@NotNull
    //设置字段最大值不能超过10000，如果前台传过来的值超过10000会报错
    @Max(value = 10000)
    private long id;

    @NonNull
    private String name;

    //卡号    Gupao-1123456789
    @NotNull
    @ValidCardNumber  //(message = "cardNumber must begin with Gupao prefix and end up with number suffix")
    private String cardNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
