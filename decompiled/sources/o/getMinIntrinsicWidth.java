package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitIsDone$Companion;
import kotlinx.serialization.Serializable;
import o.getMaxLines;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_INIT_IS_DONE")
public final class getMinIntrinsicWidth extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$InitIsDone$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitIsDone$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 119;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getMaxLines getmaxlines = getMaxLines.serializer;
            int i4 = write + 101;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getmaxlines;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String bridgeMessageId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitIsDone$Companion] */
    static {
        int i = read + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 103;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.bridgeMessageId;
        int i5 = i2 + 35;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getMinIntrinsicWidth(int i, String str, String str2) {
        super(str);
        if (7 == (i & 7)) {
            this.bridgeMessageId = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getMaxLines.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.bridgeMessageId.hashCode();
        int i4 = write + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("InitIsDone(bridgeMessageId=", this.bridgeMessageId, ")");
        int i4 = write + 113;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getMinIntrinsicWidth(String str) {
        super("HELPCENTER_INIT_IS_DONE", 0);
        this.bridgeMessageId = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof getMinIntrinsicWidth) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageId, ((getMinIntrinsicWidth) obj).bridgeMessageId}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = serializer + 17;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 23;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            return false;
        }
        int i10 = i3 + 85;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }
}
