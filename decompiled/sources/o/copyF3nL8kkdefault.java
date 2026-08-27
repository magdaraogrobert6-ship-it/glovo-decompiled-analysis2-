package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$VendorPin$Companion;
import kotlinx.serialization.Serializable;
import o.getWeightSuffixForFallbackFamilyName;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "vendor")
public final class copyF3nL8kkdefault extends createAndroidTypefaceUsingTypefaceStyleRetOiIg {
    public static final StepComponent$Map$PinComponent$VendorPin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$VendorPin$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 113;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getWeightSuffixForFallbackFamilyName getweightsuffixforfallbackfamilyname = getWeightSuffixForFallbackFamilyName.write;
            int i4 = RemoteActionCompatParcelizer + 59;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return getweightsuffixforfallbackfamilyname;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final Location address;
    public final boolean highlighted;
    public final int order;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$VendorPin$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 39;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    public /* synthetic */ copyF3nL8kkdefault(int i, Location location, boolean z, int i2, String str) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getWeightSuffixForFallbackFamilyName.write.getDescriptor());
            throw null;
        }
        this.address = location;
        if ((i & 2) == 0) {
            this.highlighted = false;
            int i3 = 2 % 2;
        } else {
            this.highlighted = z;
        }
        if ((i & 4) == 0) {
            int i4 = write;
            int i5 = i4 + 107;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.order = 0;
            int i7 = i4 + 39;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 3;
            } else {
                int i9 = 2 % 2;
            }
        } else {
            this.order = i2;
        }
        if ((i & 8) == 0) {
            this.style = "";
        } else {
            this.style = str;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
        int i4 = IconCompatParcelizer + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyF3nL8kkdefault)) {
            return false;
        }
        copyF3nL8kkdefault copyf3nl8kkdefault = (copyF3nL8kkdefault) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, copyf3nl8kkdefault.address}, getCieXyz.write())).booleanValue()) {
            if (this.highlighted != copyf3nl8kkdefault.highlighted) {
                return false;
            }
            if (this.order == copyf3nl8kkdefault.order) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, copyf3nl8kkdefault.style}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = write + 17;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = write + 45;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i7 = IconCompatParcelizer + 79;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
        int i2 = IconCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
