package com.example.mylibrary

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import com.example.mylibrary.ui.main.MainFragment
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = "src/main/AndroidManifest.xml")
class MainFragmentTest {
    @Test
    fun test() {
        val fragmentArgs = bundleOf("test" to "arg")
        val scenario = launchFragmentInContainer<MainFragment>(fragmentArgs)
    }
}