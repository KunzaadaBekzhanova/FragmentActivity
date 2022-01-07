package kg.tutorialapp.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), FragmentAListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }
    private fun setup(){
        val button= findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val et_text = findViewById<EditText>(R.id.ed_text)
            val text = et_text.toString()
            val fragment = FragmentA()
            val args = Bundle()
            args.putString("String",text)
            fragment.arguments = args
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit()
        }
    }
     override fun showToast(){
        Toast.makeText(this, "Fragment A",Toast.LENGTH_LONG).show()
    }
}