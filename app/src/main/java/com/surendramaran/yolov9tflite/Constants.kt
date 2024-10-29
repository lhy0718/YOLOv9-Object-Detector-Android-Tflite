package com.surendramaran.yolov9tflite

object Constants {
    const val MODEL_PATH = "yolov9t_full_integer_quant_320.tflite"
//    const val MODEL_PATH = "yolov9t_float32_320.tflite"
    val LABELS_PATH: String? = null // provide your labels.txt file if the metadata not present in the model
}
