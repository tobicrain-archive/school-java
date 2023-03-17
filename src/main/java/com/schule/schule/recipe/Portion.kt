package com.schule.schule.recipe

import jakarta.persistence.*

@Entity(name = "portion")
class Portion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    var name: String = ""

    var amount: Float = 0f
}