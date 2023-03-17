package com.schule.schule.recipe

import jakarta.persistence.*

@Entity
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    var name: String = ""

    var email: String = ""

    var password: String = ""

    @OneToMany(mappedBy = "ersteller")
    var rezepte: MutableList<Rezept> = mutableListOf()
}