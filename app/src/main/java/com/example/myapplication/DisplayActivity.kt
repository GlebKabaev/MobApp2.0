package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager

import com.example.myapplication.databinding.ActivityMainBinding

class DisplayActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button>(R.id.frag1button)
        val button2 = findViewById<Button>(R.id.frag2button)

//        val calend=findViewById<CalendarView>(R.id.CalendarView)
        supportFragmentManager.beginTransaction().replace(R.id.frame, BlackFrag.newInstance())
            .commit()

//        calend.setOnDateChangeListener { _, year, month, dayOfMonth ->
//            // Месяцы в CalendarView начинаются с 0, поэтому добавляем 1
//            val selectedDate = "$dayOfMonth.${month + 1}.$year"
//
//            // Показываем Toast с выбранной датой
//            Toast.makeText(this, "Вы выбрали: $selectedDate", Toast.LENGTH_SHORT).show()
//        }
        button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame, BlackFrag.newInstance())
                .commit()
//            calend.setOnDateChangeListener{view,year,month,dayOfMonth->
//                val selectDate ="$dayOfMonth"
//                Toast.makeText(this,"", Toast.LENGTH_LONG).show()}
//
//        }
            button2.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame, WhiteFrag.newInstance())
                    .commit()
            }

        }

    }

}













//ZVZVZVZVOZOOVOOOooo