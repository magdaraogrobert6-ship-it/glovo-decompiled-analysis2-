package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$InitStarted$Payload$Companion;
import java.util.List;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class accessgetRootScaleYp {
    public final List supportedMessageTypes;
    public static final BridgeMessage$InitStarted$Payload$Companion Companion = new BridgeMessage$InitStarted$Payload$Companion();
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0)};

    public final int hashCode() {
        return this.supportedMessageTypes.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetRootScaleYp)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.supportedMessageTypes, ((accessgetRootScaleYp) obj).supportedMessageTypes}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("Payload(supportedMessageTypes="), this.supportedMessageTypes, ')');
    }

    public /* synthetic */ accessgetRootScaleYp(int i, List list) {
        if (1 == (i & 1)) {
            this.supportedMessageTypes = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, onEndChanges.read.getDescriptor());
            throw null;
        }
    }
}
