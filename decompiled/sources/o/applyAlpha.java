package o;

import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.customerchat.eventTracking.data.UserProperties$Companion;
import fwfd.com.fwfsdk.util.FWFHelper;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class applyAlpha {
    public final String appVersion;
    public final String deviceManufacturer;
    public final String deviceName;
    public final String deviceType;
    public final String hostApp;
    public final String osVersion;
    public final String sdkConsumerVersion;
    public final String sdkType;
    public final String sdkVersion;
    public final resolveLockHardwareCanvasMethod userType;
    public static final UserProperties$Companion Companion = new UserProperties$Companion();
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {new EnumSerializer("com.deliveryhero.contract.model.UserType", (Enum[]) resolveLockHardwareCanvasMethod.values()), null, null, null, null, null, null, null, null, null};

    public final int hashCode() {
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = this.userType;
        int iM = af$$ExternalSyntheticOutline0.m((resolvelockhardwarecanvasmethod == null ? 0 : resolvelockhardwarecanvasmethod.hashCode()) * 31, 31, this.deviceType);
        String str = this.deviceName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.deviceManufacturer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.osVersion;
        int iM2 = af$$ExternalSyntheticOutline0.m((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.sdkType);
        String str4 = this.sdkVersion;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.hostApp;
        int iHashCode4 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.appVersion;
        int iHashCode5 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sdkConsumerVersion;
        return ((((((iM2 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof applyAlpha)) {
            return false;
        }
        applyAlpha applyalpha = (applyAlpha) obj;
        if (this.userType != applyalpha.userType) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceType, applyalpha.deviceType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceName, applyalpha.deviceName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceManufacturer, applyalpha.deviceManufacturer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.osVersion, applyalpha.osVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkType, applyalpha.sdkType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkVersion, applyalpha.sdkVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hostApp, applyalpha.hostApp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.appVersion, applyalpha.appVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkConsumerVersion, applyalpha.sdkConsumerVersion}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProperties(userType=");
        sb.append(this.userType);
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", deviceName=");
        sb.append(this.deviceName);
        sb.append(", deviceManufacturer=");
        sb.append(this.deviceManufacturer);
        sb.append(", osVersion=");
        sb.append(this.osVersion);
        sb.append(", sdkType=");
        sb.append(this.sdkType);
        sb.append(", sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", hostApp=");
        sb.append(this.hostApp);
        sb.append(", appVersion=");
        sb.append(this.appVersion);
        sb.append(", sdkConsumerVersion=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.sdkConsumerVersion, ')');
    }

    public /* synthetic */ applyAlpha(int i, resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if ((i & 1) == 0) {
            this.userType = null;
        } else {
            this.userType = resolvelockhardwarecanvasmethod;
        }
        if ((i & 2) == 0) {
            this.deviceType = "mobile";
        } else {
            this.deviceType = str;
        }
        if ((i & 4) == 0) {
            this.deviceName = null;
        } else {
            this.deviceName = str2;
        }
        if ((i & 8) == 0) {
            this.deviceManufacturer = null;
        } else {
            this.deviceManufacturer = str3;
        }
        if ((i & 16) == 0) {
            this.osVersion = null;
        } else {
            this.osVersion = str4;
        }
        if ((i & 32) == 0) {
            this.sdkType = FWFHelper.fwfDeviceOS;
        } else {
            this.sdkType = str5;
        }
        if ((i & 64) == 0) {
            this.sdkVersion = null;
        } else {
            this.sdkVersion = str6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.hostApp = null;
        } else {
            this.hostApp = str7;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.appVersion = null;
        } else {
            this.appVersion = str8;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.sdkConsumerVersion = null;
        } else {
            this.sdkConsumerVersion = str9;
        }
    }

    public applyAlpha(resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod, String str, String str2, int i) {
        String str3 = Build.MODEL;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.VERSION.RELEASE;
        resolvelockhardwarecanvasmethod = (i & 1) != 0 ? null : resolvelockhardwarecanvasmethod;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        String str6 = (i & 64) != 0 ? null : "7.3.52";
        str = (i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? null : str;
        str2 = (i & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? null : str2;
        this.userType = resolvelockhardwarecanvasmethod;
        this.deviceType = "mobile";
        this.deviceName = str3;
        this.deviceManufacturer = str4;
        this.osVersion = str5;
        this.sdkType = FWFHelper.fwfDeviceOS;
        this.sdkVersion = str6;
        this.hostApp = str;
        this.appVersion = str2;
        this.sdkConsumerVersion = null;
    }
}
