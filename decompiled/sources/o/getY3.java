package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientAsksForChatConfig$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeRelativeArcTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_ASKS_FOR_CHAT_CONFIG")
public final class getY3 extends getY2 {
    public static final BridgeMessage$ClientAsksForChatConfig$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientAsksForChatConfig$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeRelativeArcTo.IconCompatParcelizer;
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
        if (!(obj instanceof getY3)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((getY3) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ClientAsksForChatConfig(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getY3(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, PathNodeRelativeArcTo.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public getY3(String str) {
        super(str, "CLIENT_ASKS_FOR_CHAT_CONFIG", 0);
        this.bridgeMessageID = str;
    }
}
