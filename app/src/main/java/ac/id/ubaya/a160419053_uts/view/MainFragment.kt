package ac.id.ubaya.a160419053_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ac.id.ubaya.a160419053_uts.R
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
var user=""
var pass = ""

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRegister.setOnClickListener{
            val action = MainFragmentDirections.actionRegister()
            Navigation.findNavController(it).navigate(action)
        }
        btnLogin.setOnClickListener {
            val action = MainFragmentDirections.actionLogin(user,pass)
            Navigation.findNavController(it).navigate(action)
        }
    }
}