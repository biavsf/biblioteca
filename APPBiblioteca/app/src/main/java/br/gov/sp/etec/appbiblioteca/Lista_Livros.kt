package br.gov.sp.etec.appbiblioteca

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lista_Livros : AppCompatActivity() {

    private lateinit var listaLivrosView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_livros)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list_livros)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listaLivro = listOf("Diário de uma banana", "O cortiço", "Diario de uma garota nada popular", "Pinóquio")

        listaLivrosView = findViewById(R.id.list_livros)
        listaLivrosView.adapter = ArrayAdapter (this, android.R.layout.activity_list_item,
                                                android.R.id.text1,
                                                listaLivro)
    }
}