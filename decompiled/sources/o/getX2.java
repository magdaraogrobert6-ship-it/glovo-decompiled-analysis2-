package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ChatEnded$Companion;
import kotlinx.serialization.Serializable;
import o.getX1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_CHAT_ENDED")
public final class getX2 extends getY2 {
    public static final BridgeMessage$ChatEnded$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ChatEnded$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return getX1.write;
        }
    };
    public final String bridgeMessageID;
    public final PathNodeLineTo payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getX2)) {
            return false;
        }
        getX2 getx2 = (getX2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, getx2.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getx2.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ChatEnded(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getX2(int i, String str, String str2, String str3, PathNodeLineTo pathNodeLineTo) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = pathNodeLineTo;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getX1.write.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getX2(String str, PathNodeLineTo pathNodeLineTo) {
        super(str, "HELPCENTER_CHAT_ENDED", 0);
        pathNodeLineTo.getClass();
        this.bridgeMessageID = str;
        this.payload = pathNodeLineTo;
    }
}
