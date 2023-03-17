package com.schule.schule.recipe

import jakarta.persistence.*

@Entity
class Lebensmittel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    var name: String = ""

    var bild: String = ""

    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "naehrwert_id", unique = true)
    var naehrwert: Naehrwert? = null
}