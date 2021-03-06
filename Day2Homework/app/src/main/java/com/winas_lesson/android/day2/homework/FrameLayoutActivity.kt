package com.winas_lesson.android.day2.homework

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.winas_lesson.android.day2.homework.databinding.FrameLayoutActivityBinding

class FrameLayoutActivity: AbstractActivity(), ViewBindable {
    override lateinit var binding: ViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FrameLayoutActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
