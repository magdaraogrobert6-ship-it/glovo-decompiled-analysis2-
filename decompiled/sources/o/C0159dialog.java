package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.LogoutUserRequest$Companion;
import kotlinx.serialization.Serializable;
import o.disabled;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: renamed from: o.dialog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class C0159dialog {
    public static final LogoutUserRequest$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.LogoutUserRequest$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 39;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            disabled disabledVar = disabled.read;
            int i4 = write + 31;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return disabledVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String accessToken;
    public final String countryCode;
    public final String deviceToken;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.LogoutUserRequest$Companion] */
    static {
        int i = write + 11;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    public /* synthetic */ C0159dialog(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.accessToken = str;
            this.deviceToken = str2;
            this.countryCode = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, disabled.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.countryCode.hashCode() + af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.deviceToken);
        int i4 = IconCompatParcelizer + 79;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("LogoutUserRequest(accessToken=", this.accessToken, ", deviceToken=", this.deviceToken, ", countryCode="), this.countryCode, ")");
            int i3 = IconCompatParcelizer + 73;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("LogoutUserRequest(accessToken=", this.accessToken, ", deviceToken=", this.deviceToken, ", countryCode="), this.countryCode, ")");
        obj.hashCode();
        throw null;
    }

    public C0159dialog(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.accessToken = str;
        this.deviceToken = str2;
        this.countryCode = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0159dialog) {
            C0159dialog c0159dialog = (C0159dialog) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, c0159dialog.accessToken}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, c0159dialog.deviceToken}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, c0159dialog.countryCode}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer + 77;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return false;
    }
}
