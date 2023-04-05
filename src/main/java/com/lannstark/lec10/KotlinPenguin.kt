package com.lannstark.lec10

class KotlinPenguin(species: String) : Animal(species, 2), KotlinSwimable, KotlinFlyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<KotlinFlyable>.act()
        super<KotlinFlyable>.act()
    }
}