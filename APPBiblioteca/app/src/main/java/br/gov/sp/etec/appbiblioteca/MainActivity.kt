package br.gov.sp.etec.appbiblioteca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list_livros)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnCadastroUser = findViewById<Button>(R.id.cad_User)
        btnCadastroUser.setOnClickListener{
            //Toast.makeText(this, "Você clicou no cadastro de usuário", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Usuarioactivity::class.java)
            startActivity(intent)
        }

        val btnCadastroLivro = findViewById<Button>(R.id.cad_Livro)
        btnCadastroLivro.setOnClickListener{
            //Toast.makeText(this, "Você clicou no cadastro de livro", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Lista_Livros::class.java)
            startActivity(intent)
        }
    }
}