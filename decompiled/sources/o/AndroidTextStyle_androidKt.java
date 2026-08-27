package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.createPlatformTextStyle;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidTextStyle_androidKt {
    public static final HostMessage$HostLoadingPerformanceMeasurement$Payload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Payload$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 57;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return createPlatformTextStyle.IconCompatParcelizer;
            }
            createPlatformTextStyle createplatformtextstyle = createPlatformTextStyle.IconCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final toLayoutBreakStrategyxImikfE breakdown;
    public final boolean isPreRendered;
    public final toLayoutTextGranularityduNsdkg timestamps;
    public final int totalDuration;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Payload$Companion] */
    static {
        int i = serializer + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidTextStyle_androidKt(int i, int i2, boolean z, toLayoutBreakStrategyxImikfE tolayoutbreakstrategyximikfe, toLayoutTextGranularityduNsdkg tolayouttextgranularitydunsdkg) {
        if (15 == (i & 15)) {
            this.totalDuration = i2;
            this.isPreRendered = z;
            this.breakdown = tolayoutbreakstrategyximikfe;
            this.timestamps = tolayouttextgranularitydunsdkg;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, createPlatformTextStyle.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public AndroidTextStyle_androidKt(int i, boolean z, toLayoutBreakStrategyxImikfE tolayoutbreakstrategyximikfe, toLayoutTextGranularityduNsdkg tolayouttextgranularitydunsdkg) {
        this.totalDuration = i;
        this.isPreRendered = z;
        this.breakdown = tolayoutbreakstrategyximikfe;
        this.timestamps = tolayouttextgranularitydunsdkg;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.totalDuration) * 31, 31, this.isPreRendered);
        int iHashCode = this.timestamps.hashCode() + ((this.breakdown.hashCode() + iM) * 31);
        int i4 = write + 103;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof AndroidTextStyle_androidKt) {
                AndroidTextStyle_androidKt androidTextStyle_androidKt = (AndroidTextStyle_androidKt) obj;
                if (this.totalDuration == androidTextStyle_androidKt.totalDuration) {
                    if (this.isPreRendered != androidTextStyle_androidKt.isPreRendered) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.breakdown, androidTextStyle_androidKt.breakdown}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamps, androidTextStyle_androidKt.timestamps}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = IconCompatParcelizer + 119;
                    int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i3;
                    boolean z = i2 % 2 != 0;
                    int i4 = i3 + 85;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return z;
                    }
                    throw null;
                }
                int i5 = write + 83;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = write + 97;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = IconCompatParcelizer + 37;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Payload(totalDuration=" + this.totalDuration + ", isPreRendered=" + this.isPreRendered + ", breakdown=" + this.breakdown + ", timestamps=" + this.timestamps + ")";
        int i2 = IconCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
