package org.jire.netrune.codec.osrs.game.outgoing

import org.jire.netrune.codec.OutPacket

interface Heatmap : OutPacket {

    val isEnabled: Boolean

}
