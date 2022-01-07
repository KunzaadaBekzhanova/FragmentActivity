package kg.tutorialapp.fragmentactivity

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class FragmentA : Fragment(R.layout.fragment_a) {
    private lateinit var listener: FragmentAListener


    override fun onViewCreated(view: View,
        savedInstanceState: Bundle?){
        super.onViewCreated(view,savedInstanceState)
        val textFromArgument = arguments?.getString("String")
        val tv_text = (R.id.tv_text) as TextView
        tv_text.text = textFromArgument

        val button2 = R.id.button2 as Button
        button2.setOnClickListener{
            listener.showToast()}


    }
    override fun onAttach(context: Context){
        super.onAttach(context)
        if (context is FragmentAListener) listener = context

    }


    companion object {
        const val TAG = "A"
    }

    }


