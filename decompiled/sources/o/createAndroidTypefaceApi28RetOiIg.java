package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.setFontVariationSettings;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class createAndroidTypefaceApi28RetOiIg extends createAndroidTypefaceUsingTypefaceStyleRetOiIg {
    public static final StepComponent$Map$PinComponent$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$Unknown$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 15;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return setFontVariationSettings.IconCompatParcelizer;
            }
            int i3 = 16 / 0;
            return setFontVariationSettings.IconCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final Location address;
    public final boolean highlighted;
    public final int order;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$PinComponent$Unknown$Companion] */
    static {
        int i = serializer + 103;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    public /* synthetic */ createAndroidTypefaceApi28RetOiIg(int i, Location location, boolean z, int i2, String str) {
        int i3;
        int i4;
        if ((i & 1) == 0) {
            location = new Location(0.0d, 0.0d);
            int i5 = 2 % 2;
        }
        this.address = location;
        if ((i & 2) != 0) {
            this.highlighted = z;
            int i6 = write + 65;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
            if ((i & 4) == 0) {
                i3 = IconCompatParcelizer + 55;
                int i8 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i8;
                if (i3 % 2 != 0) {
                    this.order = 1;
                } else {
                    this.order = 0;
                }
                i4 = i8 + 69;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i9 = 2 / 4;
                } else {
                    int i10 = 2 % 2;
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
        this.highlighted = false;
        int i11 = 2 % 2;
        if ((i & 4) == 0) {
            i3 = IconCompatParcelizer + 55;
            int i12 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i12;
            if (i3 % 2 != 0) {
                this.order = 1;
            } else {
                this.order = 0;
            }
            i4 = i12 + 69;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i13 = 2 / 4;
            } else {
                int i14 = 2 % 2;
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
}
