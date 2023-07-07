package pe.company.ec1bryanliza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.company.ec1bryanliza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addCamera.setOnClickListener{

        }
    }
}