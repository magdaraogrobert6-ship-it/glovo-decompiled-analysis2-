package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ChatStarted$Companion;
import kotlinx.serialization.Serializable;
import o.setBottomRight;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_CHAT_STARTED")
public final class getLastInvokeMillis extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ChatStarted$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ChatStarted$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 3;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return setBottomRight.read;
            }
            setBottomRight setbottomright = setBottomRight.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String bridgeMessageId;
    public final ThrottledCallbacksEntry payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ChatStarted$Companion] */
    static {
        int i = IconCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.bridgeMessageId;
        int i4 = i3 + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getLastInvokeMillis(int i, String str, String str2, ThrottledCallbacksEntry throttledCallbacksEntry) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = throttledCallbacksEntry;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setBottomRight.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.bridgeMessageId.hashCode();
            iHashCode = this.payload.chatId.hashCode();
            i = iHashCode2 - 52;
        } else {
            int iHashCode3 = this.bridgeMessageId.hashCode();
            iHashCode = this.payload.chatId.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = RemoteActionCompatParcelizer + 35;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLastInvokeMillis(String str, ThrottledCallbacksEntry throttledCallbacksEntry) {
        super("HELPCENTER_CHAT_STARTED", 0);
        throttledCallbacksEntry.getClass();
        this.bridgeMessageId = str;
        this.payload = throttledCallbacksEntry;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ChatStarted(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = RemoteActionCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLastInvokeMillis)) {
            return false;
        }
        getLastInvokeMillis getlastinvokemillis = (getLastInvokeMillis) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageId, getlastinvokemillis.bridgeMessageId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getlastinvokemillis.payload}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
