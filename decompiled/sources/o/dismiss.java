package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.MagicLinkRequest$Companion;
import kotlinx.serialization.Serializable;
import o.expanddefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class dismiss {
    public static final MagicLinkRequest$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.MagicLinkRequest$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 65;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                expanddefault expanddefaultVar = expanddefault.IconCompatParcelizer;
                throw null;
            }
            expanddefault expanddefaultVar2 = expanddefault.IconCompatParcelizer;
            int i3 = read + 41;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 16 / 0;
            }
            return expanddefaultVar2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String countryCode;
    public final String grantType;
    public final String hash;
    public final String userId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.MagicLinkRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 49;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public /* synthetic */ dismiss(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.grantType = str;
            this.countryCode = str2;
            this.userId = str3;
            this.hash = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, expanddefault.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("MagicLinkRequest(grantType=", this.grantType, ", countryCode=", this.countryCode, ", userId="), this.userId, ", hash=", this.hash, ")");
        int i4 = serializer + 89;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.hash.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.grantType.hashCode() * 31, 31, this.countryCode), 31, this.userId);
        int i4 = serializer + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public dismiss(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.grantType = "implicit";
        this.countryCode = str;
        this.userId = str2;
        this.hash = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof dismiss)) {
                return false;
            }
            dismiss dismissVar = (dismiss) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.grantType, dismissVar.grantType}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, dismissVar.countryCode}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, dismissVar.userId}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hash, dismissVar.hash}, getCieXyz.write())).booleanValue();
                }
                int i2 = RemoteActionCompatParcelizer + 9;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i3 = serializer + 125;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        int i4 = RemoteActionCompatParcelizer + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
