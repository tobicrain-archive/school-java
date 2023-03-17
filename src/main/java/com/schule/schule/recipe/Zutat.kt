package com.schule.schule.recipe

import jakarta.persistence.*

@Entity
class Zutat {
    @Id
    @Column(nullable = false)
    var id: Int = 0

    @ManyToOne
    @JoinColumn(name = "lebensmittel_id")
    var lebensmittel: Lebensmittel? = null

    @ManyToOne
    @JoinColumn(name = "portion_id")
    var portion: Portion? = null

    @Column(nullable = false)
    var amount: Float = 0f

    @ManyToOne
    @JoinColumn(name = "rezept_id")
    var rezept: Rezept? = null
}