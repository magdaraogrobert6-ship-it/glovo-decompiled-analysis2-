package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$InitWillStart$Companion;
import kotlinx.serialization.Serializable;
import o.VectorComponent;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_INIT_WILL_START")
public final class accessdoInvalidate extends getY2 {
    public static final BridgeMessage$InitWillStart$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$InitWillStart$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComponent.serializer;
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
        if (!(obj instanceof accessdoInvalidate)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((accessdoInvalidate) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("InitWillStart(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accessdoInvalidate(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, VectorComponent.serializer.getDescriptor());
            throw null;
        }
    }

    public accessdoInvalidate(String str) {
        super(str, "HELPCENTER_INIT_WILL_START", 0);
        this.bridgeMessageID = str;
    }
}
