package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Metadata$Companion;
import kotlinx.serialization.Serializable;
import o.lambdaremoveGlobalPartnerParameter27;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class lambdasendPreinstallReferrer18 {
    public static final RealtimeMessage$DeliveryUpdated$Metadata$Companion Companion = new Object() { // from class: com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Metadata$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 77;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            lambdaremoveGlobalPartnerParameter27 lambdaremoveglobalpartnerparameter27 = lambdaremoveGlobalPartnerParameter27.IconCompatParcelizer;
            int i4 = write + 51;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return lambdaremoveglobalpartnerparameter27;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String eventType;
    public final String source;
    public final String timestamp;
    public final String version;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Metadata$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ lambdasendPreinstallReferrer18(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.eventType = str;
            this.timestamp = str2;
            this.source = str3;
            this.version = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, lambdaremoveGlobalPartnerParameter27.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Metadata(eventType=", this.eventType, ", timestamp=", this.timestamp, ", source="), this.source, ", version=", this.version, ")");
        int i4 = read + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.version.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.eventType.hashCode() * 31, 31, this.timestamp), 31, this.source);
        int i4 = read + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasendPreinstallReferrer18)) {
            int i4 = i2 + 105;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        lambdasendPreinstallReferrer18 lambdasendpreinstallreferrer18 = (lambdasendPreinstallReferrer18) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eventType, lambdasendpreinstallreferrer18.eventType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, lambdasendpreinstallreferrer18.timestamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, lambdasendpreinstallreferrer18.source}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, lambdasendpreinstallreferrer18.version}, getCieXyz.write())).booleanValue();
    }
}
