package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Companion;
import kotlinx.serialization.Serializable;
import o.getDx1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_CALL_BUTTON_CLICK")
public final class getDy1 extends getY2 {
    public static final BridgeMessage$ClientNotifiesCallButtonClick$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return getDx1.serializer;
        }
    };
    public final String bridgeMessageID;
    public final getDx3 payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDy1)) {
            return false;
        }
        getDy1 getdy1 = (getDy1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, getdy1.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getdy1.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ClientNotifiesCallButtonClick(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getDy1(int i, String str, String str2, String str3, getDx3 getdx3) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = getdx3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getDx1.serializer.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDy1(String str, getDx3 getdx3) {
        super(str, "CLIENT_CHAT_NOTIFIES_ABOUT_CALL_BUTTON_CLICK", 0);
        getdx3.getClass();
        this.bridgeMessageID = str;
        this.payload = getdx3;
    }
}
