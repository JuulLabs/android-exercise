package com.juullabs.exercise.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juullabs.exercise.R
import com.juullabs.exercise.annotations.Argument
import com.juullabs.exercise.annotations.Exercise
import kotlinx.android.synthetic.main.subclass.bottomTextView
import kotlinx.android.synthetic.main.subclass.topTextView

@Exercise(Argument("subclassString", String::class))
class SubclassFragment : SuperclassFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.subclass, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        topTextView.text = "value(superclassString): ${args.superclassString}"
        bottomTextView.text = "value(subclassString): ${args.subclassString}"
    }
}
