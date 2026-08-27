package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ChatStarted$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeHorizontalTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_CHAT_STARTED")
public final class PathNodeQuadTo extends getY2 {
    public static final BridgeMessage$ChatStarted$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ChatStarted$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeHorizontalTo.read;
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
        if (!(obj instanceof PathNodeQuadTo)) {
            return false;
        }
        PathNodeQuadTo pathNodeQuadTo = (PathNodeQuadTo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, pathNodeQuadTo.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, pathNodeQuadTo.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ChatStarted(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNodeQuadTo(int i, String str, String str2, String str3, PathNodeLineTo pathNodeLineTo) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = pathNodeLineTo;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, PathNodeHorizontalTo.read.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathNodeQuadTo(String str, PathNodeLineTo pathNodeLineTo) {
        super(str, "HELPCENTER_CHAT_STARTED", 0);
        pathNodeLineTo.getClass();
        this.bridgeMessageID = str;
        this.payload = pathNodeLineTo;
    }
}
