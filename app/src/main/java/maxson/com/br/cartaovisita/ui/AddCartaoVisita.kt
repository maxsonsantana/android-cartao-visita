package maxson.com.br.cartaovisita.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import maxson.com.br.cartaovisita.databinding.ActivityAddCartaoVisitaBinding


class AddCartaoVisita : AppCompatActivity() {

    private val binding by lazy {
        ActivityAddCartaoVisitaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener(){
        binding.buttonClose.setOnClickListener {
            finish()
        }

        binding.btnConfirmar.setOnClickListener {
            finish()
        }
    }

}