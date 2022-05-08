package com.example.exchange_app.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.VisibleForTesting
import androidx.compose.material.MaterialTheme


import com.example.exchange_app.ui.root.RootViewModel
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @VisibleForTesting
    internal val viewModel: RootViewModel by viewModels()
//    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        firebaseAnalytics = Firebase.analytics
//
//        val bundle = Bundle()
//        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "MainActivity")
//        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "MainActivity")
//        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "view")
//        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, bundle)

        setContent {
//            CompositionLocalProvider(LocalCoilImageLoader provides viewModel.imageLoader) {
            MaterialTheme {
                MainScreen()
            }
//        }
    }
}
}