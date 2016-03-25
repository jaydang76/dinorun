package com.jaydang.game.dinorun.box2d;

import com.jaydang.game.dinorun.enums.UserDataType;

/**
 * Created by ThinhDP1 on 3/23/2016.
 */
public class GroundUserData extends UserData{

    public GroundUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.GROUND;
    }
}
