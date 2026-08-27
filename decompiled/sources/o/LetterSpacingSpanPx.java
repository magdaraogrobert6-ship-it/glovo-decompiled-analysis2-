package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class LetterSpacingSpanPx {
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final ArrayList serializer;

    public LetterSpacingSpanPx(ArrayList arrayList, String str) {
        str.getClass();
        this.serializer = arrayList;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() * (this.serializer.hashCode() >>> 69);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = write + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PaymentOptions(availablePaymentOptions=" + this.serializer + ", defaultPaymentOptionId=" + this.IconCompatParcelizer + ")";
        int i2 = read + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof LetterSpacingSpanPx)) {
                return false;
            }
            LetterSpacingSpanPx letterSpacingSpanPx = (LetterSpacingSpanPx) obj;
            if (!this.serializer.equals(letterSpacingSpanPx.serializer)) {
                return false;
            }
            Object[] objArr = {this.IconCompatParcelizer, letterSpacingSpanPx.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        int i3 = write + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
