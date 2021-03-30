package com.unitedsoftek.recipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.todkars.shimmer.ShimmerRecyclerView


class RecipesFragment : Fragment() {

    lateinit var recyclerView:ShimmerRecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_recipes, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.showShimmer()

        return view
    }

}