package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$Companion;
import kotlinx.serialization.Serializable;
import o.getLocalAnnotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class filterRanges {
    public static final ManifestResponse$Config$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            getLocalAnnotations getlocalannotations;
            int i = 2 % 2;
            int i2 = read + 31;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getlocalannotations = getLocalAnnotations.RemoteActionCompatParcelizer;
                int i3 = 8 / 0;
            } else {
                getlocalannotations = getLocalAnnotations.RemoteActionCompatParcelizer;
            }
            int i4 = read + 97;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getlocalannotations;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final boolean cacheEnabled;
    public final normalizedParagraphStyles downloadPolicy;
    public final String minNativeVersion;
    public final int pollIntervalSeconds;
    public final Integer pollJitterSeconds;
    public final getLocalParagraphStyles staleManifestBehavior;
    public final Integer telemetryIntervalSeconds;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
    }

    public final getLocalParagraphStyles RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 53;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getLocalParagraphStyles getlocalparagraphstyles = this.staleManifestBehavior;
        int i5 = i2 + 103;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getlocalparagraphstyles;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 105;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.pollIntervalSeconds;
        int i6 = i2 + 19;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.minNativeVersion;
        int i5 = i2 + 119;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = write + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.cacheEnabled;
        }
        int i3 = 2 / 0;
        return this.cacheEnabled;
    }

    public /* synthetic */ filterRanges(int i, boolean z, normalizedParagraphStyles normalizedparagraphstyles, String str, int i2, Integer num, getLocalParagraphStyles getlocalparagraphstyles, Integer num2) {
        Object obj = null;
        if (11 != (i & 11)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, getLocalAnnotations.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.cacheEnabled = z;
        this.downloadPolicy = normalizedparagraphstyles;
        if ((i & 4) == 0) {
            this.minNativeVersion = null;
        } else {
            this.minNativeVersion = str;
            int i3 = serializer + 59;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.pollIntervalSeconds = i2;
        if ((i & 16) == 0) {
            int i6 = write + 91;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                this.pollJitterSeconds = null;
                obj.hashCode();
                throw null;
            }
            this.pollJitterSeconds = null;
            int i7 = 2 % 2;
        } else {
            this.pollJitterSeconds = num;
        }
        if ((i & 32) == 0) {
            this.staleManifestBehavior = null;
        } else {
            this.staleManifestBehavior = getlocalparagraphstyles;
            int i8 = write + 7;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        }
        if ((i & 64) == 0) {
            this.telemetryIntervalSeconds = null;
            return;
        }
        this.telemetryIntervalSeconds = num2;
        int i10 = write + 79;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.cacheEnabled);
        int iHashCode4 = this.downloadPolicy.hashCode();
        String str = this.minNativeVersion;
        int iHashCode5 = 0;
        int iM = af$$ExternalSyntheticOutline0.m(this.pollIntervalSeconds, (((iHashCode4 + (iHashCode3 * 31)) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.pollJitterSeconds;
        if (num == null) {
            int i2 = serializer + 11;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        getLocalParagraphStyles getlocalparagraphstyles = this.staleManifestBehavior;
        if (getlocalparagraphstyles == null) {
            int i4 = serializer + 107;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getlocalparagraphstyles.hashCode();
        }
        Integer num2 = this.telemetryIntervalSeconds;
        if (num2 != null) {
            iHashCode5 = num2.hashCode();
            int i6 = write + 99;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Config(cacheEnabled=");
        sb.append(this.cacheEnabled);
        sb.append(", downloadPolicy=");
        sb.append(this.downloadPolicy);
        sb.append(", minNativeVersion=");
        sb.append(this.minNativeVersion);
        sb.append(", pollIntervalSeconds=");
        sb.append(this.pollIntervalSeconds);
        sb.append(", pollJitterSeconds=");
        sb.append(this.pollJitterSeconds);
        sb.append(", staleManifestBehavior=");
        sb.append(this.staleManifestBehavior);
        sb.append(", telemetryIntervalSeconds=");
        String strWrite = IconCompatParcelizer.write(this.telemetryIntervalSeconds, ")", sb);
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strWrite;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof filterRanges)) {
                return false;
            }
            filterRanges filterranges = (filterRanges) obj;
            if (this.cacheEnabled == filterranges.cacheEnabled) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.downloadPolicy, filterranges.downloadPolicy}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.minNativeVersion, filterranges.minNativeVersion}, getCieXyz.write())).booleanValue() || this.pollIntervalSeconds != filterranges.pollIntervalSeconds) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pollJitterSeconds, filterranges.pollJitterSeconds}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.staleManifestBehavior, filterranges.staleManifestBehavior}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.telemetryIntervalSeconds, filterranges.telemetryIntervalSeconds}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = write + 71;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                int i3 = write + 35;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = serializer + 37;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = write + 117;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
