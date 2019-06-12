package com.kesso.er.detector.detector.nativeDetector

import android.app.Activity
import com.kesso.mylibrary.EmotionClassifier

interface INativeDetector {
    val activity: Activity
    val device: EmotionClassifier.Device

    fun load()
    fun detect(face: ByteArray): String
    fun stop()
    fun resume()
    fun pause()
}