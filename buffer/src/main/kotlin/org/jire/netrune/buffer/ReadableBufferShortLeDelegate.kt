package org.jire.netrune.buffer

import kotlin.reflect.KProperty

class ReadableBufferShortLeDelegate : ReadableBufferDelegate {

    var value = Int.MIN_VALUE

    override fun read(buffer: ReadableBuffer) {
        value = buffer.shortLe()
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

}
