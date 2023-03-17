package com.schule.schule.recipe

import jakarta.persistence.*

@Entity
class Rezept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    var name: String = ""

    var description: String = ""

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "ersteller_id")
    var ersteller: User? = null

    @OneToMany(mappedBy = "rezept")
    var zutaten: MutableSet<Zutat> = mutableSetOf()
}