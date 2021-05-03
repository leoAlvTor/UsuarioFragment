package ec.edu.ups.usuariofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import ec.edu.ups.usuariofragment.databinding.FragmentSaludoBinding

class FragmentSaludo : Fragment() {

    private lateinit var binding : FragmentSaludoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_saludo, container, false)

        val args : FragmentSaludoArgs by navArgs()

        Toast.makeText(activity, "Nombre: " + args.nombre + ", Apellido: " + args.apellido + ", Direccion: " + args.direccion, Toast.LENGTH_SHORT).show()
        return binding.root
    }
}