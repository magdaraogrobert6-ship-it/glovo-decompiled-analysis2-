package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.RefreshTokenRequest$Companion;
import kotlinx.serialization.Serializable;
import o.error;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class dismissdefault {
    public static final RefreshTokenRequest$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.RefreshTokenRequest$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 91;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                error errorVar = error.read;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            error errorVar2 = error.read;
            int i3 = read + 105;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
            return errorVar2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String accessToken;
    public final String countryCode;
    public final String deviceToken;
    public final String refreshToken;
    public final String sessionId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.RefreshTokenRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 111;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ dismissdefault(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 == (i & 31)) {
            this.accessToken = str;
            this.refreshToken = str2;
            this.deviceToken = str3;
            this.countryCode = str4;
            this.sessionId = str5;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, error.read.getDescriptor());
        throw null;
    }

    public dismissdefault(String str, String str2, String str3, String str4, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.accessToken = str;
        this.refreshToken = str2;
        this.deviceToken = str3;
        this.countryCode = str4;
        this.sessionId = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RefreshTokenRequest(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", deviceToken=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.deviceToken, ", countryCode=", this.countryCode, ", sessionId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.sessionId, ")");
        int i4 = RemoteActionCompatParcelizer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.sessionId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.deviceToken), 31, this.countryCode);
        int i4 = RemoteActionCompatParcelizer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dismissdefault)) {
            return false;
        }
        dismissdefault dismissdefaultVar = (dismissdefault) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, dismissdefaultVar.accessToken}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, dismissdefaultVar.refreshToken}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, dismissdefaultVar.deviceToken}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, dismissdefaultVar.countryCode}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, dismissdefaultVar.sessionId}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = RemoteActionCompatParcelizer + 65;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = RemoteActionCompatParcelizer + 13;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            return false;
        }
        int i8 = read + 87;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
