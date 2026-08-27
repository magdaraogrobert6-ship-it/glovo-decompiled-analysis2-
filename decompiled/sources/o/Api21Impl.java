package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtSimpleStack112;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Api21Impl {
    public static final StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 113;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return AndroidPopup_androidKtSimpleStack112.serializer;
            }
            AndroidPopup_androidKtSimpleStack112 androidPopup_androidKtSimpleStack112 = AndroidPopup_androidKtSimpleStack112.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String actionButtonText;
    public final String body;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    public /* synthetic */ Api21Impl(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.title = null;
            int i2 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = null;
        } else {
            this.body = str2;
        }
        int i3 = 2 % 2;
        if ((i & 4) != 0) {
            this.actionButtonText = str3;
            return;
        }
        int i4 = read + 107;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        if (i4 % 2 == 0) {
            this.actionButtonText = null;
            int i6 = 20 / 0;
        } else {
            this.actionButtonText = null;
        }
        int i7 = i5 + 85;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 24 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DialogMessage(title=", this.title, ", body=", this.body, ", actionButtonText="), this.actionButtonText, ")");
        int i4 = IconCompatParcelizer + 37;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.title;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = read + 125;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str2 = this.body;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.actionButtonText;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            int i6 = read + 79;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 15;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof Api21Impl)) {
            return false;
        }
        Api21Impl api21Impl = (Api21Impl) obj;
        Object[] objArr = {this.title, api21Impl.title};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.body, api21Impl.body};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {this.actionButtonText, api21Impl.actionButtonText};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = read + 13;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 5;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = IconCompatParcelizer + 9;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
