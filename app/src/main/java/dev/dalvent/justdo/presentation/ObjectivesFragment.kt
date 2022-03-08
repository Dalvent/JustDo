package dev.dalvent.justdo.presentation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import dagger.android.support.AndroidSupportInjection
import dev.dalvent.justdo.R
import dev.dalvent.justdo.di.ViewModelFactory
import javax.inject.Inject

class ObjectivesFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel: ObjectivesViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this, viewModelFactory)[ObjectivesViewModel::class.java]
        viewModel.objective.observe(viewLifecycleOwner) {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_objectives, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val objectivesRecyclerView = view.findViewById<RecyclerView>(R.id.objectives_recycler_view)
        val objectivesAdapter = ObjectivesAdapter()
        objectivesRecyclerView.adapter = objectivesAdapter

        viewModel.objective.observe(viewLifecycleOwner) {
            objectivesAdapter.objectives = it
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ObjectivesFragment()
    }
}