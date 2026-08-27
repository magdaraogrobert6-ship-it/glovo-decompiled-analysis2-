package o;

import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostIsReady$Payload$Companion;
import java.util.List;
import kotlinx.serialization.Serializable;
import o.VectorComposeKtGroup4;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtPath11 {
    public final boolean isFullScreen;
    public final List supportedMessageTypes;
    public static final HostMessage$HostIsReady$Payload$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostIsReady$Payload$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComposeKtGroup4.write;
        }
    };
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), null};

    public final int hashCode() {
        return Boolean.hashCode(this.isFullScreen) + (this.supportedMessageTypes.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComposeKtPath11)) {
            return false;
        }
        VectorComposeKtPath11 vectorComposeKtPath11 = (VectorComposeKtPath11) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.supportedMessageTypes, vectorComposeKtPath11.supportedMessageTypes}, getCieXyz.write())).booleanValue() && this.isFullScreen == vectorComposeKtPath11.isFullScreen;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(supportedMessageTypes=");
        sb.append(this.supportedMessageTypes);
        sb.append(", isFullScreen=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isFullScreen, ')');
    }

    public /* synthetic */ VectorComposeKtPath11(List list, boolean z, int i) {
        if (3 == (i & 3)) {
            this.supportedMessageTypes = list;
            this.isFullScreen = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, VectorComposeKtGroup4.write.getDescriptor());
            throw null;
        }
    }

    public VectorComposeKtPath11(List list) {
        list.getClass();
        this.supportedMessageTypes = list;
        this.isFullScreen = true;
    }
}
