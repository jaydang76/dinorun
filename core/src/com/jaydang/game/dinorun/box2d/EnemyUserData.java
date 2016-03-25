package com.jaydang.game.dinorun.box2d;

import com.badlogic.gdx.math.Vector2;
import com.jaydang.game.dinorun.enums.UserDataType;
import com.jaydang.game.dinorun.util.Constants;

/**
 * Created by ThinhDP1 on 3/24/2016.
 */
public class EnemyUserData extends UserData {
    private Vector2 linearVelocity;
    private String[] textureRegions;

    public EnemyUserData(float width, float height, String[] textureRegions) {
        super(width, height);
        userDataType = UserDataType.ENEMY;
        linearVelocity = Constants.ENEMY_LINEAR_VELOCITY;
        this.textureRegions = textureRegions;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }

    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }

    public String[] getTextureRegions() {
            return textureRegions;
    }
}
