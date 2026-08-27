package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ChatPayload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class PathNodeLineTo {
    public static final BridgeMessage$ChatPayload$Companion Companion = new BridgeMessage$ChatPayload$Companion();
    public final String chatId;

    public final int hashCode() {
        return this.chatId.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathNodeLineTo)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatId, ((PathNodeLineTo) obj).chatId}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ChatPayload(chatId="), this.chatId, ')');
    }

    public /* synthetic */ PathNodeLineTo(int i, String str) {
        if (1 == (i & 1)) {
            this.chatId = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PathNodeMoveTo.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }
}
