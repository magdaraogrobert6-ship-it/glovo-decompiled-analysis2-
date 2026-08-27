package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$DownloadPolicy$Companion;
import kotlinx.serialization.Serializable;
import o.getLocalAnnotationsdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class normalizedParagraphStyles {
    public static final ManifestResponse$Config$DownloadPolicy$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$DownloadPolicy$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 41;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getLocalAnnotationsdefault getlocalannotationsdefault = getLocalAnnotationsdefault.write;
            int i4 = serializer + 85;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getlocalannotationsdefault;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final Boolean deferInDataSaverMode;
    public final Boolean deferInPowerSaveMode;
    public final Integer maxConcurrentDownloads;
    public final Integer minBatteryPercent;
    public final Integer minFreeDiskMb;
    public final String preferredNetwork;
    public final Boolean respectThermalThrottling;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$DownloadPolicy$Companion] */
    static {
        int i = write + 115;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ normalizedParagraphStyles(int i, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, Boolean bool3) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.deferInDataSaverMode = null;
            int i2 = 2 % 2;
        } else {
            this.deferInDataSaverMode = bool;
        }
        if ((i & 2) == 0) {
            int i3 = serializer + 111;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.deferInPowerSaveMode = null;
            int i5 = 2 % 2;
        } else {
            this.deferInPowerSaveMode = bool2;
        }
        if ((i & 4) == 0) {
            this.maxConcurrentDownloads = null;
        } else {
            this.maxConcurrentDownloads = num;
        }
        if ((i & 8) == 0) {
            this.minBatteryPercent = null;
            int i6 = 2 % 2;
        } else {
            this.minBatteryPercent = num2;
        }
        if ((i & 16) == 0) {
            int i7 = serializer + 113;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            this.minFreeDiskMb = null;
            int i9 = 2 % 2;
        } else {
            this.minFreeDiskMb = num3;
        }
        if ((i & 32) == 0) {
            int i10 = read + 27;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                this.preferredNetwork = null;
                obj.hashCode();
                throw null;
            }
            this.preferredNetwork = null;
        } else {
            this.preferredNetwork = str;
        }
        if ((i & 64) != 0) {
            this.respectThermalThrottling = bool3;
            return;
        }
        this.respectThermalThrottling = null;
        int i11 = serializer + 85;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DownloadPolicy(deferInDataSaverMode=");
        sb.append(this.deferInDataSaverMode);
        sb.append(", deferInPowerSaveMode=");
        sb.append(this.deferInPowerSaveMode);
        sb.append(", maxConcurrentDownloads=");
        sb.append(this.maxConcurrentDownloads);
        sb.append(", minBatteryPercent=");
        sb.append(this.minBatteryPercent);
        sb.append(", minFreeDiskMb=");
        sb.append(this.minFreeDiskMb);
        sb.append(", preferredNetwork=");
        sb.append(this.preferredNetwork);
        sb.append(", respectThermalThrottling=");
        String strM = c8$$ExternalSyntheticOutline0.m(sb, ")", this.respectThermalThrottling);
        int i2 = read + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Boolean bool = this.deferInDataSaverMode;
        if (bool == null) {
            int i2 = read + 89;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Boolean bool2 = this.deferInPowerSaveMode;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.maxConcurrentDownloads;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.minBatteryPercent;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.minFreeDiskMb;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        String str = this.preferredNetwork;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Boolean bool3 = this.respectThermalThrottling;
        int iHashCode7 = (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        int i4 = serializer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode7;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof normalizedParagraphStyles) {
            normalizedParagraphStyles normalizedparagraphstyles = (normalizedParagraphStyles) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deferInDataSaverMode, normalizedparagraphstyles.deferInDataSaverMode}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deferInPowerSaveMode, normalizedparagraphstyles.deferInPowerSaveMode}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.maxConcurrentDownloads, normalizedparagraphstyles.maxConcurrentDownloads}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.minBatteryPercent, normalizedparagraphstyles.minBatteryPercent}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.minFreeDiskMb, normalizedparagraphstyles.minFreeDiskMb}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.preferredNetwork, normalizedparagraphstyles.preferredNetwork}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.respectThermalThrottling, normalizedparagraphstyles.respectThermalThrottling}, getCieXyz.write())).booleanValue() ^ true);
                }
                int i2 = read + 13;
                int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 87;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i6 = read;
            int i7 = i6 + 71;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 53;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 54 / 0;
            }
            return false;
        }
        int i11 = read + 37;
        int i12 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 21;
        read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return false;
    }
}
