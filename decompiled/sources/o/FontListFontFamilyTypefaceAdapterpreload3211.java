package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$Status$Companion;
import kotlinx.serialization.Serializable;
import o.FontListFontFamilyTypefaceAdapterpreload3;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontListFontFamilyTypefaceAdapterpreload3211 {
    public static final QrCodePaymentTask$Status$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$Status$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 31;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return FontListFontFamilyTypefaceAdapterpreload3.IconCompatParcelizer;
            }
            int i3 = 19 / 0;
            return FontListFontFamilyTypefaceAdapterpreload3.IconCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final preloadlambda1 statusMessage;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$Status$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 43;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final preloadlambda1 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        preloadlambda1 preloadlambda1Var = this.statusMessage;
        int i4 = i3 + 117;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return preloadlambda1Var;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public /* synthetic */ FontListFontFamilyTypefaceAdapterpreload3211(int i, String str, preloadlambda1 preloadlambda1Var) {
        int i2;
        if ((i & 1) == 0) {
            this.value = null;
            int i3 = read + 9;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                this.statusMessage = preloadlambda1Var;
                return;
            }
            i2 = IconCompatParcelizer + 87;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.statusMessage = null;
            } else {
                this.statusMessage = null;
                int i4 = 99 / 0;
            }
        }
        this.value = str;
        int i5 = read + 69;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        if ((i & 2) == 0) {
            this.statusMessage = preloadlambda1Var;
            return;
        }
        i2 = IconCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.statusMessage = null;
        } else {
            this.statusMessage = null;
            int i8 = 99 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 59;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i2 + 79;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        preloadlambda1 preloadlambda1Var = this.statusMessage;
        if (preloadlambda1Var != null) {
            iHashCode2 = preloadlambda1Var.hashCode();
            int i6 = IconCompatParcelizer + 119;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Status(value=" + this.value + ", statusMessage=" + this.statusMessage + ")";
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof FontListFontFamilyTypefaceAdapterpreload3211) {
                FontListFontFamilyTypefaceAdapterpreload3211 fontListFontFamilyTypefaceAdapterpreload3211 = (FontListFontFamilyTypefaceAdapterpreload3211) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, fontListFontFamilyTypefaceAdapterpreload3211.value}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.statusMessage, fontListFontFamilyTypefaceAdapterpreload3211.statusMessage}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = IconCompatParcelizer + 21;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                int i3 = IconCompatParcelizer + 19;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = read + 49;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = IconCompatParcelizer + 61;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
