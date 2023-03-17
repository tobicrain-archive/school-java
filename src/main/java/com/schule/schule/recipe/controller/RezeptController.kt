package com.schule.schule.recipe.controller

import com.schule.schule.recipe.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

//@RestController("rezept")
//class RezeptController {
//
//    @Autowired
//    lateinit var rezeptRepository: RezeptRepository
//
//    @Autowired
//    lateinit var zutatRepository: ZutatRepository
//
//    @Autowired
//    lateinit var lebensmittelRepository: LebensmittelRepository
//
//    @Autowired
//    lateinit var portionRepository: PortionRepository
//
//    @Autowired
//    lateinit var naehrwertRepository: NaehrwertRepository
//
//    @Autowired
//    lateinit var userRepository: UserRepository
//
//
//    private fun createRandomRecipe(name: String): Rezept {
//        return rezeptRepository.save(Rezept().apply {
//            this.name = name
//            this.description = "$name description"
//        })
//    }
//
//    @GetMapping("create")
//    fun createRezept() {
//
//        // think about 10 recipes
//        val recipes = (1..10).map { createRandomRecipe("Recipe $it") }
//        // think about 10 lebensmittel
//        val lebensmittel = (1..30).map { lebensmittelRepository.save(Lebensmittel().apply {
//            name = "Lebensmittel $it"
//            naehrwert = naehrwertRepository.save(Naehrwert().apply {
//                energie = 100f
//                protein = 100f
//                fett = 100f
//                kohlenhydrate = 100f
//            })
//        }) }
//        // think about 10 portions
//        val portions = (1..50).map { portionRepository.save(Portion().apply {
//            name = "Portion $it"
//            amount = 100f
//        }) }
//
//        // think about 10 users
//        val users = (1..20).map { userRepository.save(User().apply {
//            name = "User $it"
//        }) }
//
//        // think about 10 zutaten
//        val zutaten = (1..100).map { zutatRepository.save(Zutat().apply {
//            this.lebensmittel = lebensmittel.random()
//            portion = portions.random()
//            amount = 100f
//            rezept = recipes.random()
//        }) }
//
//        // add 1-3 random zutaten to each recipe
//        recipes.forEach { rezept ->
//            rezept.zutaten = mutableSetOf(zutaten.random(), zutaten.random(), zutaten.random())
//            rezeptRepository.save(rezept)
//        }
//    }
// }