package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$CustomerPin$Companion;
import kotlinx.serialization.Serializable;
import o.createAndroidTypefaceUsingTypefaceStyleRetOiIgdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "customer")
public final class optionalOnDeviceFontFamilyByName78DK7lM extends createAndroidTypefaceUsingTypefaceStyleRetOiIg {
    public static final StepComponent$Map$PinComponent$CustomerPin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$CustomerPin$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 25;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                createAndroidTypefaceUsingTypefaceStyleRetOiIgdefault createandroidtypefaceusingtypefacestyleretoiigdefault = createAndroidTypefaceUsingTypefaceStyleRetOiIgdefault.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            createAndroidTypefaceUsingTypefaceStyleRetOiIgdefault createandroidtypefaceusingtypefacestyleretoiigdefault2 = createAndroidTypefaceUsingTypefaceStyleRetOiIgdefault.write;
            int i3 = serializer + 23;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
            }
            return createandroidtypefaceusingtypefacestyleretoiigdefault2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final Location address;
    public final boolean highlighted;
    public final int order;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$CustomerPin$Companion] */
    static {
        int i = read + 43;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ optionalOnDeviceFontFamilyByName78DK7lM(int i, Location location, boolean z, int i2, String str) {
        if (1 == (i & 1)) {
            this.address = location;
            if ((i & 2) == 0) {
                this.highlighted = false;
            } else {
                this.highlighted = z;
                int i3 = serializer + 65;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            }
            if ((i & 4) != 0) {
                this.order = i2;
            } else {
                int i5 = write + 23;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.order = 0;
            }
            if ((i & 8) != 0) {
                this.style = str;
                int i7 = serializer + 57;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i8 = serializer + 15;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                this.style = "";
                int i9 = 78 / 0;
                return;
            } else {
                this.style = "";
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, createAndroidTypefaceUsingTypefaceStyleRetOiIgdefault.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
        int i4 = write + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 97;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof optionalOnDeviceFontFamilyByName78DK7lM) {
            optionalOnDeviceFontFamilyByName78DK7lM optionalondevicefontfamilybyname78dk7lm = (optionalOnDeviceFontFamilyByName78DK7lM) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, optionalondevicefontfamilybyname78dk7lm.address}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.highlighted == optionalondevicefontfamilybyname78dk7lm.highlighted) {
                if (this.order == optionalondevicefontfamilybyname78dk7lm.order) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, optionalondevicefontfamilybyname78dk7lm.style}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    int i4 = write + 63;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return true;
                }
                int i6 = write + 11;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 != 0;
            }
            int i7 = write + 113;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = serializer + 61;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
        int i2 = serializer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
