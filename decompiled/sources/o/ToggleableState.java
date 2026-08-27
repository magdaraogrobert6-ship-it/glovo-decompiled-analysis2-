package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientCriticalContentRendered$Companion;
import kotlinx.serialization.Serializable;
import o.constructTextLayout;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CRITICAL_CONTENT_RENDERED")
public final class ToggleableState extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientCriticalContentRendered$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientCriticalContentRendered$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 81;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                constructTextLayout constructtextlayout = constructTextLayout.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            constructTextLayout constructtextlayout2 = constructTextLayout.write;
            int i3 = RemoteActionCompatParcelizer + 93;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return constructtextlayout2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String bridgeMessageId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientCriticalContentRendered$Companion] */
    static {
        int i = read + 101;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.bridgeMessageId;
        }
        int i3 = 79 / 0;
        return this.bridgeMessageId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToggleableState(int i, String str, String str2) {
        super(str);
        if (7 == (i & 7)) {
            this.bridgeMessageId = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, constructTextLayout.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.bridgeMessageId.hashCode();
            throw null;
        }
        int iHashCode = this.bridgeMessageId.hashCode();
        int i3 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("ClientCriticalContentRendered(bridgeMessageId=", this.bridgeMessageId, ")");
        int i4 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public ToggleableState(String str) {
        super("CLIENT_CRITICAL_CONTENT_RENDERED", 0);
        this.bridgeMessageId = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this != obj) {
            if (obj instanceof ToggleableState) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageId, ((ToggleableState) obj).bridgeMessageId}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 37;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i3 + 37;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
