package com.luismedinaweb

import java.io.Serializable

class LinkerPacket(val type: Int, val content: String? = null) : Serializable {

    override fun toString(): String {
        return "$type;$content"
    }

    val isValid: Boolean = type > 0

    companion object {
        const val ACK = 1
        const val NACK = 2
        const val TERMINATE = 3
        const val CLIENTHELLO = 4
        const val SERVERHELLO = 5
        const val LINK = 6
    }
}