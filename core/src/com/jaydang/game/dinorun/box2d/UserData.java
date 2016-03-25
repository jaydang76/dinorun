package com.jaydang.game.dinorun.box2d;

import com.jaydang.game.dinorun.enums.UserDataType;

/**
 * Created by ThinhDP1 on 3/23/2016.
 */
public abstract class UserData {
    protected UserDataType userDataType;
    protected float width;
    protected float height;

    public UserData() {

    }

    public UserData(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public UserDataType getUserDataType() {
        return userDataType;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
