package com.ali.toasterlibrary

import android.content.Context
import android.widget.Toast

object ToasterMessage {

    fun errorMessage(context: Context) {
        Toast.makeText(context, "${R.string.error_message}", Toast.LENGTH_LONG).show()
    }

}