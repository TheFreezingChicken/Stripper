package me.thefreezingchicken.stripper.compose

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable


@SuppressLint("ComposableNaming")
@Composable
fun _ComposableStripper(stripThis: @Composable () -> (Unit)) {
    stripThis()
}