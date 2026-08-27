package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesChatClose$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeRelativeHorizontalTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_CHAT_CLOSE")
public final class getDx extends getY2 {
    public static final BridgeMessage$ClientNotifiesChatClose$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesChatClose$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeRelativeHorizontalTo.read;
        }
    };
    public final String bridgeMessageID;

    public final int hashCode() {
        return this.bridgeMessageID.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDx)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((getDx) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ClientNotifiesChatClose(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getDx(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, PathNodeRelativeHorizontalTo.read.getDescriptor());
            throw null;
        }
    }

    public getDx(String str) {
        super(str, "CLIENT_CHAT_NOTIFIES_ABOUT_CHAT_CLOSE", 0);
        this.bridgeMessageID = str;
    }
}
