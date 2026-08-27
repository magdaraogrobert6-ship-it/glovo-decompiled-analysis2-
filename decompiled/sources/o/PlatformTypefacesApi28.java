package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$ParkingPin$Companion;
import kotlinx.serialization.Serializable;
import o.PlatformTypefaces_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "parking")
public final class PlatformTypefacesApi28 extends createAndroidTypefaceUsingTypefaceStyleRetOiIg {
    public static final StepComponent$Map$PinComponent$ParkingPin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$ParkingPin$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 125;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PlatformTypefaces_androidKt platformTypefaces_androidKt = PlatformTypefaces_androidKt.serializer;
            int i4 = RemoteActionCompatParcelizer + 89;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return platformTypefaces_androidKt;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final Location address;
    public final boolean highlighted;
    public final int order;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$ParkingPin$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 47;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    public /* synthetic */ PlatformTypefacesApi28(int i, Location location, boolean z, int i2, String str) {
        int i3;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PlatformTypefaces_androidKt.serializer.getDescriptor());
            throw null;
        }
        this.address = location;
        if ((i & 2) == 0) {
            this.highlighted = false;
            int i4 = serializer + 121;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
            }
            if ((i & 4) == 0) {
                int i5 = write + 91;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.order = 0;
            } else {
                this.order = i2;
                int i7 = write + 39;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.style = str;
                return;
            }
            i3 = write + 67;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.style = "";
            } else {
                this.style = "";
                throw null;
            }
        }
        this.highlighted = z;
        int i10 = 2 % 2;
        if ((i & 4) == 0) {
            int i11 = write + 91;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            this.order = 0;
        } else {
            this.order = i2;
            int i13 = write + 39;
            serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.style = str;
            return;
        }
        i3 = write + 67;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.style = "";
        } else {
            this.style = "";
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
        int i4 = serializer + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlatformTypefacesApi28) {
            PlatformTypefacesApi28 platformTypefacesApi28 = (PlatformTypefacesApi28) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, platformTypefacesApi28.address}, getCieXyz.write())).booleanValue()) {
                if (this.highlighted != platformTypefacesApi28.highlighted) {
                    int i2 = serializer + 73;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                if (this.order != platformTypefacesApi28.order) {
                    int i3 = write + 41;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, platformTypefacesApi28.style}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = write + 95;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = serializer + 9;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = serializer + 91;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ParkingPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
        int i2 = write + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
