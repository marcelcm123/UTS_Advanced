package ac.id.ubaya.a160419053_uts.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ac.id.ubaya.a160419053_uts.R
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.btnRegist


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLoginn.setOnClickListener {
            val user = LoginFragmentArgs.fromBundle(requireArguments()).username
            val pass = LoginFragmentArgs.fromBundle(requireArguments()).password
            val action = LoginFragmentDirections.actionIndex()
            Navigation.findNavController(it).navigate(action)
        }
    }
}