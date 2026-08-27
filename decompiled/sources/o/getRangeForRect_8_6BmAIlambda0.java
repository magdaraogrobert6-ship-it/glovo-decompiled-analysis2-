package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Companion;
import kotlinx.serialization.Serializable;
import o.getBidiRunDirection;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_LOCATION_MESSAGE_CLICK")
public final class getRangeForRect_8_6BmAIlambda0 extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientNotifiesLocationMessageClick$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 55;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getBidiRunDirection.write;
            }
            int i3 = 31 / 0;
            return getBidiRunDirection.write;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String bridgeMessageId;
    public final hasSpan payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Companion] */
    static {
        int i = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.bridgeMessageId;
        int i5 = i3 + 37;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getRangeForRect_8_6BmAIlambda0(int i, String str, String str2, hasSpan hasspan) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = hasspan;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getBidiRunDirection.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 19;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.bridgeMessageId.hashCode();
            iHashCode = this.payload.hashCode();
            i = iHashCode2 >>> 66;
        } else {
            int iHashCode3 = this.bridgeMessageId.hashCode();
            iHashCode = this.payload.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = serializer + 51;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRangeForRect_8_6BmAIlambda0(String str, hasSpan hasspan) {
        super("CLIENT_CHAT_NOTIFIES_ABOUT_LOCATION_MESSAGE_CLICK", 0);
        hasspan.getClass();
        this.bridgeMessageId = str;
        this.payload = hasspan;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ClientNotifiesLocationMessageClick(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 37;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 21;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof getRangeForRect_8_6BmAIlambda0) {
            getRangeForRect_8_6BmAIlambda0 getrangeforrect_8_6bmailambda0 = (getRangeForRect_8_6BmAIlambda0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageId, getrangeforrect_8_6bmailambda0.bridgeMessageId}, getCieXyz.write())).booleanValue()) {
                int i8 = read + 49;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getrangeforrect_8_6bmailambda0.payload}, getCieXyz.write())).booleanValue();
        }
        int i10 = i4 + 79;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }
}
