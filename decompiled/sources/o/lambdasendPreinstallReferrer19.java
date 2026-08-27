package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class lambdasendPreinstallReferrer19 implements lambdaremoveGlobalPartnerParameters31 {
    public static final RealtimeMessage$DeliveryUpdated$Companion Companion = new RealtimeMessage$DeliveryUpdated$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final lambdasendPreinstallReferrer18 metadata;
    public final lambdasendReftagReferrer16 payload;
    public final String version;

    static {
        int i = serializer + 69;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    public /* synthetic */ lambdasendPreinstallReferrer19(int i, lambdasendPreinstallReferrer18 lambdasendpreinstallreferrer18, lambdasendReftagReferrer16 lambdasendreftagreferrer16, String str) {
        if (7 == (i & 7)) {
            this.metadata = lambdasendpreinstallreferrer18;
            this.payload = lambdasendreftagreferrer16;
            this.version = str;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, lambdaremoveGlobalPartnerParameters30.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode = this.metadata.hashCode();
            return this.version.hashCode() << ((this.payload.hashCode() << (iHashCode + 113)) * 36);
        }
        int iHashCode2 = this.metadata.hashCode();
        return this.version.hashCode() + ((this.payload.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeliveryUpdated(metadata=");
        sb.append(this.metadata);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", version=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.version, ")");
        int i2 = read + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasendPreinstallReferrer19)) {
            return false;
        }
        lambdasendPreinstallReferrer19 lambdasendpreinstallreferrer19 = (lambdasendPreinstallReferrer19) obj;
        Object[] objArr = {this.metadata, lambdasendpreinstallreferrer19.metadata};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 29;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr2 = {this.payload, lambdasendpreinstallreferrer19.payload};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.version, lambdasendpreinstallreferrer19.version};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = IconCompatParcelizer + 45;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
