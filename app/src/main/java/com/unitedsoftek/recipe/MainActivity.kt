package com.unitedsoftek.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.unitedsoftek.recipe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         navController = findNavController(R.id.navHostFragment)
        val appBarConfigration = AppBarConfiguration(
            setOf(
                R.id.recipesFragment, R.id.favoriteRecipesFragment, R.id.foodJokeFragment
            )
        )

        binding.bottomNav.setupWithNavController(navController)

        setupActionBarWithNavController(navController,appBarConfigration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() ||  super.onSupportNavigateUp()

    }
}