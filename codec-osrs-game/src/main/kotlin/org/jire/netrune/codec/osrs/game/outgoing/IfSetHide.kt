package org.jire.netrune.codec.osrs.game.outgoing

import org.jire.netrune.codec.OutPacket
import org.jire.netrune.codec.osrs.game.Widget

interface IfSetHide : OutPacket {

    val widget: Widget

    val isHidden: Boolean

}
