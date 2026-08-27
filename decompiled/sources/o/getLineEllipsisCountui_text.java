package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Companion;
import kotlinx.serialization.Serializable;
import o.getLineBaseline;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_ENCOUNTERED_ERROR")
public final class getLineEllipsisCountui_text extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$HelpCenterEncounteredError$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 77;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getLineBaseline.read;
            }
            int i3 = 65 / 0;
            return getLineBaseline.read;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String bridgeMessageId;
    public final getLineForVerticalPosition payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Companion] */
    static {
        int i = IconCompatParcelizer + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.bridgeMessageId;
        int i5 = i3 + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getLineEllipsisCountui_text(int i, String str, String str2, getLineForVerticalPosition getlineforverticalposition) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = getlineforverticalposition;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getLineBaseline.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.payload.hashCode() % (this.bridgeMessageId.hashCode() % 110);
        }
        return this.payload.hashCode() + (this.bridgeMessageId.hashCode() * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLineEllipsisCountui_text(String str, getLineForVerticalPosition getlineforverticalposition) {
        super("HELPCENTER_ENCOUNTERED_ERROR", 0);
        getlineforverticalposition.getClass();
        this.bridgeMessageId = str;
        this.payload = getlineforverticalposition;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HelpCenterEncounteredError(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = RemoteActionCompatParcelizer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 27;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getLineEllipsisCountui_text)) {
            return false;
        }
        getLineEllipsisCountui_text getlineellipsiscountui_text = (getLineEllipsisCountui_text) obj;
        Object[] objArr = {this.bridgeMessageId, getlineellipsiscountui_text.bridgeMessageId};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.payload, getlineellipsiscountui_text.payload};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
