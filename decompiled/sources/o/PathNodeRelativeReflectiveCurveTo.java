package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesMessageSent$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeRelativeVerticalTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_MESSAGE_SENT")
public final class PathNodeRelativeReflectiveCurveTo extends getY2 {
    public static final BridgeMessage$ClientNotifiesMessageSent$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesMessageSent$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeRelativeVerticalTo.read;
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
        if (!(obj instanceof PathNodeRelativeReflectiveCurveTo)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((PathNodeRelativeReflectiveCurveTo) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ClientNotifiesMessageSent(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNodeRelativeReflectiveCurveTo(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, PathNodeRelativeVerticalTo.read.getDescriptor());
            throw null;
        }
    }

    public PathNodeRelativeReflectiveCurveTo(String str) {
        super(str, "CLIENT_CHAT_NOTIFIES_ABOUT_MESSAGE_SENT", 0);
        this.bridgeMessageID = str;
    }
}
