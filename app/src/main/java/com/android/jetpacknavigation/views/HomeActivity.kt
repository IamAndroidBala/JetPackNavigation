package com.android.jetpacknavigation.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.android.jetpacknavigation.R
import kotlinx.android.synthetic.main.layout_home.*
import kotlinx.android.synthetic.main.toolbar.view.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_home)

        val host = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment? ?: return
        val navController = host.navController

        NavigationUI.setupActionBarWithNavController(this, navController, container)


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(Navigation.findNavController(this,R.id.nav_host),container)
    }

}