package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$EntrancePin$Companion;
import kotlinx.serialization.Serializable;
import o.loadNamedFromTypefaceCacheOrNullRetOiIg;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "entrance")
public final class createAndroidTypefaceApi28RetOiIgdefault extends createAndroidTypefaceUsingTypefaceStyleRetOiIg {
    public static final StepComponent$Map$PinComponent$EntrancePin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$EntrancePin$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 101;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                loadNamedFromTypefaceCacheOrNullRetOiIg loadnamedfromtypefacecacheornullretoiig = loadNamedFromTypefaceCacheOrNullRetOiIg.RemoteActionCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            loadNamedFromTypefaceCacheOrNullRetOiIg loadnamedfromtypefacecacheornullretoiig2 = loadNamedFromTypefaceCacheOrNullRetOiIg.RemoteActionCompatParcelizer;
            int i3 = read + 111;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 1 / 0;
            }
            return loadnamedfromtypefacecacheornullretoiig2;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final Location address;
    public final boolean highlighted;
    public final int order;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$EntrancePin$Companion] */
    static {
        int i = write + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
    }

    public /* synthetic */ createAndroidTypefaceApi28RetOiIgdefault(int i, Location location, boolean z, int i2, String str) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, loadNamedFromTypefaceCacheOrNullRetOiIg.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.address = location;
        if ((i & 2) == 0) {
            this.highlighted = false;
            int i3 = serializer + 41;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            this.highlighted = z;
        }
        int i5 = 2 % 2;
        if ((i & 4) == 0) {
            this.order = 0;
            int i6 = read + 79;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
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
        int i2 = serializer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
        int i4 = read + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 71;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createAndroidTypefaceApi28RetOiIgdefault)) {
            int i4 = i2 + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
            }
            return false;
        }
        createAndroidTypefaceApi28RetOiIgdefault createandroidtypefaceapi28retoiigdefault = (createAndroidTypefaceApi28RetOiIgdefault) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, createandroidtypefaceapi28retoiigdefault.address}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 99;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.highlighted != createandroidtypefaceapi28retoiigdefault.highlighted || this.order != createandroidtypefaceapi28retoiigdefault.order) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, createandroidtypefaceapi28retoiigdefault.style}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EntrancePin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
        int i2 = serializer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
