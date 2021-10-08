package com.ir.dp.behavior.template;

import com.ir.dp.behavior.template.core.BasketBall;
import com.ir.dp.behavior.template.core.FootBall;
import com.ir.dp.behavior.template.core.Game;

/**
 * @author i-rain
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Game game = new BasketBall();
        game.play();
        game = new FootBall();
        game.play();
    }
}
