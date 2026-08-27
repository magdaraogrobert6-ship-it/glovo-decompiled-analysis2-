package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeRelativeQuadTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_LOCATION_MESSAGE_CLICK")
public final class PathNodeRelativeReflectiveQuadTo extends getY2 {
    public static final BridgeMessage$ClientNotifiesLocationMessageClick$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeRelativeQuadTo.RemoteActionCompatParcelizer;
        }
    };
    public final String bridgeMessageID;
    public final getDy payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathNodeRelativeReflectiveQuadTo)) {
            return false;
        }
        PathNodeRelativeReflectiveQuadTo pathNodeRelativeReflectiveQuadTo = (PathNodeRelativeReflectiveQuadTo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, pathNodeRelativeReflectiveQuadTo.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, pathNodeRelativeReflectiveQuadTo.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ClientNotifiesLocationMessageClick(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNodeRelativeReflectiveQuadTo(int i, String str, String str2, String str3, getDy getdy) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = getdy;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, PathNodeRelativeQuadTo.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathNodeRelativeReflectiveQuadTo(String str, getDy getdy) {
        super(str, "CLIENT_CHAT_NOTIFIES_ABOUT_LOCATION_MESSAGE_CLICK", 0);
        getdy.getClass();
        this.bridgeMessageID = str;
        this.payload = getdy;
    }
}
