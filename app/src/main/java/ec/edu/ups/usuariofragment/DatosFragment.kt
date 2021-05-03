package ec.edu.ups.usuariofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import ec.edu.ups.usuariofragment.databinding.FragmentDatosBinding

class DatosFragment : Fragment() {

    private lateinit var binding : FragmentDatosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_datos, container, false)
        binding.btnNavigate.setOnClickListener {
            view : View ->
            run {
                //view.findNavController().navigate(R.id.action_datosFragment_to_fragmentSaludo)

                val objDatosDirection = DatosFragmentDirections.actionDatosFragmentToFragmentSaludo()
                objDatosDirection.nombre = binding.txtNombre.text.toString()
                objDatosDirection.apellido = binding.txtApellido.text.toString()
                objDatosDirection.direccion = binding.txtCiudad.text.toString()
                view.findNavController().navigate(objDatosDirection)
            }
        }
        return binding.root
    }

}