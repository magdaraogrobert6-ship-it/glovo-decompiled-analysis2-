package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientCriticalContentRendered$Companion;
import kotlinx.serialization.Serializable;
import o.getDx2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CRITICAL_CONTENT_RENDERED")
public final class PathNodeRelativeCurveTo extends getY2 {
    public static final BridgeMessage$ClientCriticalContentRendered$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientCriticalContentRendered$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return getDx2.RemoteActionCompatParcelizer;
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
        if (!(obj instanceof PathNodeRelativeCurveTo)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((PathNodeRelativeCurveTo) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ClientCriticalContentRendered(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNodeRelativeCurveTo(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getDx2.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public PathNodeRelativeCurveTo(String str) {
        super(str, "CLIENT_CRITICAL_CONTENT_RENDERED", 0);
        this.bridgeMessageID = str;
    }
}
