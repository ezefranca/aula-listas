package com.example.listasfecap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minhaLista = findViewById<RecyclerView>(R.id.rvLista)
        minhaLista.layoutManager = LinearLayoutManager(this)

        val harryPotter = Filme("Harry Potter")
        val senhorDosAneis = Filme("Senhor dos Anéis")
        val rambo = Filme("Rambo")
        val frozen = Filme("Frozen")
        val velozesFuriosos = Filme("Velozes e Furiosos")

        val items = listOf(harryPotter, senhorDosAneis, rambo, frozen, velozesFuriosos)

        minhaLista.adapter = ItemAdapter(items)

    }
}