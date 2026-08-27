package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitStarted$Companion;
import kotlinx.serialization.Serializable;
import o.getOffsetForPositionk4lQ0M;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_INIT_STARTED")
public final class getOverflowgIe3tQ8 extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$InitStarted$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitStarted$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 123;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getOffsetForPositionk4lQ0M getoffsetforpositionk4lq0m = getOffsetForPositionk4lQ0M.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getOffsetForPositionk4lQ0M getoffsetforpositionk4lq0m2 = getOffsetForPositionk4lQ0M.serializer;
            int i3 = write + 15;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getoffsetforpositionk4lq0m2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String bridgeMessageId;
    public final getMaxIntrinsicWidth payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitStarted$Companion] */
    static {
        int i = write + 109;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.bridgeMessageId;
        int i5 = i2 + 97;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getOverflowgIe3tQ8(int i, String str, String str2, getMaxIntrinsicWidth getmaxintrinsicwidth) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = getmaxintrinsicwidth;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getOffsetForPositionk4lQ0M.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.payload.supportedMessageTypes.hashCode() - (this.bridgeMessageId.hashCode() + 31);
        }
        return this.payload.supportedMessageTypes.hashCode() + (this.bridgeMessageId.hashCode() * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOverflowgIe3tQ8(String str, getMaxIntrinsicWidth getmaxintrinsicwidth) {
        super("HELPCENTER_INIT_STARTED", 0);
        getmaxintrinsicwidth.getClass();
        this.bridgeMessageId = str;
        this.payload = getmaxintrinsicwidth;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InitStarted(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOverflowgIe3tQ8)) {
            return false;
        }
        getOverflowgIe3tQ8 getoverflowgie3tq8 = (getOverflowgIe3tQ8) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageId, getoverflowgie3tq8.bridgeMessageId}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getoverflowgie3tq8.payload}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        int i3 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
