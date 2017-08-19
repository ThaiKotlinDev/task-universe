package io.github.thaikotlindev.taskuniverse.presentation.extension

import android.graphics.Color
import android.graphics.PorterDuff
import android.widget.ImageView

fun ImageView.applyRedFilter() = setColorFilter(Color.RED, PorterDuff.Mode.LIGHTEN)

