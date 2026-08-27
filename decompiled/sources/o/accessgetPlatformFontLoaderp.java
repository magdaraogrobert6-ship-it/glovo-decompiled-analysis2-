package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.entities.softpos.detail.Transaction$Companion;
import kotlinx.serialization.Serializable;
import o.Typefacedefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessgetPlatformFontLoaderp {
    public static final Transaction$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.entities.softpos.detail.Transaction$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 39;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return Typefacedefault.serializer;
            }
            Typefacedefault typefacedefault = Typefacedefault.serializer;
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final AndroidTypeface_androidKt receipt;
    public final String responseCodeValue;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.entities.softpos.detail.Transaction$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    public final AndroidTypeface_androidKt serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 95;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        AndroidTypeface_androidKt androidTypeface_androidKt = this.receipt;
        int i5 = i2 + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return androidTypeface_androidKt;
        }
        throw null;
    }

    public /* synthetic */ accessgetPlatformFontLoaderp(int i, String str, AndroidTypeface_androidKt androidTypeface_androidKt) {
        if (3 == (i & 3)) {
            this.responseCodeValue = str;
            this.receipt = androidTypeface_androidKt;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Typefacedefault.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.receipt.hashCode() / (this.responseCodeValue.hashCode() - 102);
        } else {
            iHashCode = this.receipt.hashCode() + (this.responseCodeValue.hashCode() * 31);
        }
        int i3 = read + 29;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Transaction(responseCodeValue=" + this.responseCodeValue + ", receipt=" + this.receipt + ")";
        int i2 = serializer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetPlatformFontLoaderp)) {
            return false;
        }
        accessgetPlatformFontLoaderp accessgetplatformfontloaderp = (accessgetPlatformFontLoaderp) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseCodeValue, accessgetplatformfontloaderp.responseCodeValue}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.receipt, accessgetplatformfontloaderp.receipt}, getCieXyz.write())).booleanValue();
        }
        int i4 = serializer + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
