package com.schule.schule.recipe

import jakarta.persistence.*

@Entity
class Naehrwert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    var energie: Float = 0f

    var fett: Float = 0f

    var kohlenhydrate: Float = 0f

    var protein: Float = 0f

    @OneToOne(mappedBy = "naehrwert")
    var lebensmittel: Lebensmittel? = null
}