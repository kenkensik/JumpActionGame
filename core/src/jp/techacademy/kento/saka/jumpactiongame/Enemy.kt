package jp.techacademy.kento.saka.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {

        // 横幅、高さ
        val ENEMY_WIDTH = 1.5f
        val ENEMY_HEIGHT = 1.5f

    }

    init {
        setSize(Enemy.ENEMY_WIDTH, Enemy.ENEMY_HEIGHT)

    }
}