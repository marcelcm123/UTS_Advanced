package ac.id.ubaya.a160419053_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ac.id.ubaya.a160419053_uts.R
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRegist.setOnClickListener {
            val user= txtUsername.text.toString()
            val pass = txtPassword.text.toString()
            val action = RegisterFragmentDirections.actionLoginn(user,pass)
            Navigation.findNavController(it).navigate(action)
        }
    }
}