# Stripper
This Android library written in Kotlin allows you to easily write debug code blocks by calling a simple function that will be stripped by ProGuard automatically in your release builds.
It's just 12 lines of code (with the ProGuard consumer file), so you may even consider just copying and pasting them 🤷‍♂️

## How to use
Use the BOM to add the library to your dependencies:
```
dependencies {
    def stripperBom = platform('me.thefreezingchicken.stripper:stripper-bom:2023.05.03')

    implementation stripperBom

    // Add this line if you want to use "_stripper"
    implementation 'me.thefreezingchicken.stripper:stripper-core'

    // Add this line if you want to use "_ComposableStripper" or "_LaunchedEffectStripper"
    implementation 'me.thefreezingchicken.stripper:stripper-compose'
}
```

For the blocks to be removed you need ProGuard enabled, as described in the ["Enable shrinking, obfuscation, and optimization"](https://developer.android.com/build/shrink-code#enable) section of the official Android documentation (resource shrinking is not necessary). If for some reason your project requires your release builds to have it disabled then this library will be completely useless to you.

After enabling that, you simply call this function:
```
_stripper {
  // Your debug code here.
}
```

## Jetpack Compose
If you use Compose, in the stripper-compose module there's a composable function you can use to strip away composables in release builds:
```
_ComposableStripper {
  Text("We are in debug.")
}
```

This is very useful if you want some info to be shown directly on the UI when you're debugging (for example, I have a text in the bottom bar telling me the navigation route).

<br>
<br>

There's also a set of `_LaunchedEffectStripper` functions, to have a `LaunchedEffect` that gets stripped. It's a shortcut to avoid having to cascade a `_ComposableStripper` and a `LaunchedEffect`.
```
_LaunchedEffectStripper(key1 = youKeyObject) {
  // Debug code
}
```

## Why the underscore naming?
Having code that gets thrown in or out depending on factors that are outside the runtime scope of your app is very dangerous business, so the least you can do is make that kind of code stand out. I think putting an underscore in front of the function name is enough to make those calls more readable, and won't interfere on naming conventions in a significant way. In addition to that, Android Studio smart completion still picks up the function even if you start typing it without the underscore (I don't know about other IDEs).
If you don't like this, it doesn't take much to change it... Again, the library is literally 12 lines of code 😑
