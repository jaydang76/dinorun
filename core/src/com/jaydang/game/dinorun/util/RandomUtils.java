package com.jaydang.game.dinorun.util;

import com.jaydang.game.dinorun.enums.EnemyType;

import java.util.Random;

/**
 * Created by ThinhDP1 on 3/24/2016.
 */
public class RandomUtils {
    public static EnemyType getRandomEnemyType() {
        RandomEnum<EnemyType> randomEnum = new RandomEnum<EnemyType>(EnemyType.class);
        return randomEnum.random();
    }

    /**
     * @see [Stack Overflow](http://stackoverflow.com/a/1973018)
     * @param <E>
     */

    private static class RandomEnum<E extends Enum> {

        private static final Random RND = new Random();
        private final E[] values;

        public RandomEnum(Class<E> token) {
            values = token.getEnumConstants();
        }

        public E random() {
            return values[RND.nextInt(values.length)];
        }
    }

}
