package maxson.com.br.cartaovisita.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import maxson.com.br.cartaovisita.R
import maxson.com.br.cartaovisita.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener() {
        binding.btnAdd.setOnClickListener {
            val intent = Intent(this@MainActivity, AddCartaoVisita::class.java)
            startActivity(intent)
        }
    }

}