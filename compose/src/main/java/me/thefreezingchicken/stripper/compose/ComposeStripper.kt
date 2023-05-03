/************************************************************************************************************
 * MIT License ( https://thefreezingchicken.mit-license.org/ )                                              *
 *                                                                                                          *
 * Copyright (c) 2023 Stefano Poletto, The Freezing Chicken <thefreezingchicken+license@gmail.com>          *
 *                                                                                                          *
 * Permission is hereby granted, free of charge, to any person obtaining a                                  *
 * copy of this software and associated documentation files (the “Software”),                               *
 * to deal in the Software without restriction, including without limitation                                *
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,                                 *
 * and/or sell copies of the Software, and to permit persons to whom the                                    *
 * Software is furnished to do so, subject to the following conditions:                                     *
 *                                                                                                          *
 * The above copyright notice and this permission notice shall be included in                               *
 * all copies or substantial portions of the Software.                                                      *
 *                                                                                                          *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR                               *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,                                 *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL                                  *
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER                               *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,                            *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE                            *
 * SOFTWARE.                                                                                                *
 ************************************************************************************************************/

@file:Suppress("ComposableNaming")

package me.thefreezingchicken.stripper.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NonRestartableComposable
import kotlinx.coroutines.CoroutineScope

/** Use this function to add a Stripper Composable code block that will be removed on release if you enable ProGuard. */
@Composable
fun _ComposableStripper(stripThis: @Composable () -> (Unit)) {
    stripThis()
}

/** Use this function to add a Stripper Launched Effect that will be removed on release if you enable ProGuard. */
@Composable
@NonRestartableComposable
fun _LaunchedEffectStripper(vararg keys: Any?, block: suspend CoroutineScope.() -> Unit) {
    LaunchedEffect(keys = keys, block = block)
}

/** Use this function to add a Stripper Launched Effect that will be removed on release if you enable ProGuard. */
@Composable
@NonRestartableComposable
fun _LaunchedEffectStripper(key1: Any?, block: suspend CoroutineScope.() -> Unit) {
    LaunchedEffect(key1 = key1, block = block)
}

/** Use this function to add a Stripper Launched Effect that will be removed on release if you enable ProGuard. */
@Composable
@NonRestartableComposable
fun _LaunchedEffectStripper(key1: Any?, key2: Any?, block: suspend CoroutineScope.() -> Unit) {
    LaunchedEffect(key1 = key1, key2 = key2, block = block)
}

/** Use this function to add a Stripper Launched Effect that will be removed on release if you enable ProGuard. */
@Composable
@NonRestartableComposable
fun _LaunchedEffectStripper(key1: Any?, key2: Any?, key3: Any?, block: suspend CoroutineScope.() -> Unit) {
    LaunchedEffect(key1 = key1, key2 = key2, key3 = key3, block = block)
}
