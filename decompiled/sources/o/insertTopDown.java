package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$InitStarted$Companion;
import kotlinx.serialization.Serializable;
import o.VectorApplier;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_INIT_STARTED")
public final class insertTopDown extends getY2 {
    public static final BridgeMessage$InitStarted$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$InitStarted$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorApplier.write;
        }
    };
    public final String bridgeMessageID;
    public final accessgetRootScaleYp payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof insertTopDown)) {
            return false;
        }
        insertTopDown inserttopdown = (insertTopDown) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, inserttopdown.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, inserttopdown.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "InitStarted(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ insertTopDown(int i, String str, String str2, String str3, accessgetRootScaleYp accessgetrootscaleyp) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = accessgetrootscaleyp;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, VectorApplier.write.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public insertTopDown(String str, accessgetRootScaleYp accessgetrootscaleyp) {
        super(str, "HELPCENTER_INIT_STARTED", 0);
        accessgetrootscaleyp.getClass();
        this.bridgeMessageID = str;
        this.payload = accessgetrootscaleyp;
    }
}
