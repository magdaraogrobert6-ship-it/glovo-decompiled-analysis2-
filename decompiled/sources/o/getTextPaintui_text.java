package o;

import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getTextPaintui_text extends getPlaceholderRects {
    public static final HostMessage$HostAppProvidesChatConfig$Companion Companion = new HostMessage$HostAppProvidesChatConfig$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String messageType;
    public final paintLG529CI payload;

    static {
        int i = RemoteActionCompatParcelizer + 57;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.messageType;
        int i5 = i3 + 35;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getTextPaintui_text(int i, paintLG529CI paintlg529ci, String str) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.payload = paintlg529ci;
            if ((i & 2) == 0) {
                this.messageType = "HOST_APP_PROVIDES_CHAT_CONFIG";
                int i2 = serializer + 45;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.messageType = str;
            int i3 = IconCompatParcelizer + 115;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getTextLocaleui_text.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.messageType.hashCode() >> (this.payload.hashCode() % 59);
        } else {
            iHashCode = (this.payload.hashCode() * 31) + this.messageType.hashCode();
        }
        int i3 = serializer + 15;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HostAppProvidesChatConfig(payload=" + this.payload + ", messageType=" + this.messageType + ")";
        int i2 = serializer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return str;
    }

    public getTextPaintui_text(paintLG529CI paintlg529ci) {
        this.payload = paintlg529ci;
        this.messageType = "HOST_APP_PROVIDES_CHAT_CONFIG";
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 5;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getTextPaintui_text)) {
            return false;
        }
        getTextPaintui_text gettextpaintui_text = (getTextPaintui_text) obj;
        Object[] objArr = {this.payload, gettextpaintui_text.payload};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 45;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr2 = {this.messageType, gettextpaintui_text.messageType};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = serializer + 15;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return true;
    }
}
