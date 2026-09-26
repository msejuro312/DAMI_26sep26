package com.cibertec.ticketaula

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cibertec.ticketaula.databinding.ActivityMainBinding
import com.cibertec.ticketaula.ui.ListaFragment
import com.cibertec.ticketaula.ui.RegistroFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRegistro.setOnClickListener {
            mostrarFragmento(RegistroFragment())
        }

        binding.buttonLista.setOnClickListener {
            abrirLista()
        }

        if (savedInstanceState == null) {
            mostrarFragmento(RegistroFragment())
        }
    }

    fun abrirLista() {
        mostrarFragmento(ListaFragment())
    }

    private fun mostrarFragmento(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
