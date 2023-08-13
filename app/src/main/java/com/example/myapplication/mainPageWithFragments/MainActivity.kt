package com.example.myapplication.mainPageWithFragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.mainPageWithFragments.bottom_fragments.patientPages.PatientFragment
import com.example.myapplication.mainPageWithFragments.bottom_fragments.priceListPages.PriceListFragment
import com.example.myapplication.mainPageWithFragments.bottom_fragments.schedulePages.ScheduleFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.patient_bottom ->{
                    replaceFragments(PatientFragment())
                    true
                }
                R.id.price_list_bottom ->{
                    replaceFragments(PriceListFragment())
                    true
                }
                R.id.schedule_bottom ->{
                    replaceFragments(ScheduleFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragments(PatientFragment())
    }
    private fun replaceFragments(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}