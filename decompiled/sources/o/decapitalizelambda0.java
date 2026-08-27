package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$AppliedFilters$Companion;
import kotlinx.serialization.Serializable;
import o.decapitalize;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class decapitalizelambda0 {
    public static final ManifestResponse$AppliedFilters$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$AppliedFilters$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 65;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            decapitalize decapitalizeVar = decapitalize.read;
            int i4 = write + 59;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return decapitalizeVar;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String devUserId;
    public final String entityId;
    public final String env;
    public final Boolean isCapeEnabled;
    public final String platform;
    public final String region;
    public final String serviceType;
    public final String variant;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$AppliedFilters$Companion] */
    static {
        int i = IconCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ decapitalizelambda0(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.devUserId = null;
        } else {
            this.devUserId = str;
        }
        if ((i & 2) == 0) {
            this.entityId = null;
            int i2 = 2 % 2;
        } else {
            this.entityId = str2;
        }
        if ((i & 4) == 0) {
            int i3 = RemoteActionCompatParcelizer + 77;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.env = null;
            int i5 = 2 % 2;
        } else {
            this.env = str3;
        }
        if ((i & 8) == 0) {
            int i6 = RemoteActionCompatParcelizer + 47;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            this.isCapeEnabled = null;
        } else {
            this.isCapeEnabled = bool;
        }
        if ((i & 16) == 0) {
            int i8 = write + 21;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.platform = null;
        } else {
            this.platform = str4;
        }
        if ((i & 32) == 0) {
            this.region = null;
            int i10 = 2 % 2;
        } else {
            this.region = str5;
        }
        if ((i & 64) == 0) {
            int i11 = RemoteActionCompatParcelizer + 35;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                this.serviceType = null;
                throw null;
            }
            this.serviceType = null;
            int i12 = 2 % 2;
        } else {
            this.serviceType = str6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.variant = null;
        } else {
            this.variant = str7;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AppliedFilters(devUserId=", this.devUserId, ", entityId=", this.entityId, ", env=");
        sbM.append(this.env);
        sbM.append(", isCapeEnabled=");
        sbM.append(this.isCapeEnabled);
        sbM.append(", platform=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.platform, ", region=", this.region, ", serviceType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serviceType, ", variant=", this.variant, ")");
        int i4 = RemoteActionCompatParcelizer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof decapitalizelambda0)) {
            return false;
        }
        decapitalizelambda0 decapitalizelambda0Var = (decapitalizelambda0) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.devUserId, decapitalizelambda0Var.devUserId}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entityId, decapitalizelambda0Var.entityId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.env, decapitalizelambda0Var.env}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isCapeEnabled, decapitalizelambda0Var.isCapeEnabled}, getCieXyz.write())).booleanValue()) {
                int i4 = RemoteActionCompatParcelizer + 45;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platform, decapitalizelambda0Var.platform}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.region, decapitalizelambda0Var.region}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serviceType, decapitalizelambda0Var.serviceType}, getCieXyz.write())).booleanValue()) {
                    int i6 = write + 93;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variant, decapitalizelambda0Var.variant}, getCieXyz.write())).booleanValue();
            }
            int i8 = RemoteActionCompatParcelizer + 117;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = RemoteActionCompatParcelizer + 119;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    public final int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int i2;
        int iHashCode3;
        int i3 = 2 % 2;
        int i4 = write + 101;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            str = this.devUserId;
            if (str == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
                i2 = RemoteActionCompatParcelizer + 15;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i5 = 2 / 4;
                }
            }
        } else {
            str = this.devUserId;
            if (str == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
                i2 = RemoteActionCompatParcelizer + 15;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i6 = 2 / 4;
                }
            }
        }
        String str2 = this.entityId;
        if (str2 == null) {
            int i7 = write + 69;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
            int i9 = write + 1;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        String str3 = this.env;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isCapeEnabled;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str4 = this.platform;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.region;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.serviceType;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.variant;
        if (str7 != null) {
            iHashCode = str7.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
    }
}
