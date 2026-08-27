package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.entities.softpos.SoftPosResponse$Companion;
import kotlinx.serialization.Serializable;
import o.Typeface;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidPreloadedFont {
    public static final SoftPosResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.entities.softpos.SoftPosResponse$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 103;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                Typeface typeface = Typeface.RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            Typeface typeface2 = Typeface.RemoteActionCompatParcelizer;
            int i3 = write + 69;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return typeface2;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final FontFamily paymentFailedResult;
    public final int status;
    public final accessgetPlatformFontLoaderp transaction;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.entities.softpos.SoftPosResponse$Companion] */
    static {
        int i = write + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final FontFamily IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.paymentFailedResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final accessgetPlatformFontLoaderp RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetPlatformFontLoaderp accessgetplatformfontloaderp = this.transaction;
        int i5 = i2 + 47;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetplatformfontloaderp;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 39;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.status;
        int i6 = i2 + 83;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidPreloadedFont(int i, int i2, accessgetPlatformFontLoaderp accessgetplatformfontloaderp, FontFamily fontFamily) {
        if (1 == (i & 1)) {
            this.status = i2;
            if ((i & 2) == 0) {
                this.transaction = null;
            } else {
                this.transaction = accessgetplatformfontloaderp;
                int i3 = serializer + 121;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i6 = read + 35;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.paymentFailedResult = null;
                return;
            }
            this.paymentFailedResult = fontFamily;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, Typeface.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.status);
        accessgetPlatformFontLoaderp accessgetplatformfontloaderp = this.transaction;
        if (accessgetplatformfontloaderp == null) {
            int i4 = read + 75;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accessgetplatformfontloaderp.hashCode();
        }
        FontFamily fontFamily = this.paymentFailedResult;
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + (fontFamily != null ? fontFamily.hashCode() : 0);
        int i6 = read + 77;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidPreloadedFont) {
            AndroidPreloadedFont androidPreloadedFont = (AndroidPreloadedFont) obj;
            if (this.status != androidPreloadedFont.status) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.transaction, androidPreloadedFont.transaction}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentFailedResult, androidPreloadedFont.paymentFailedResult}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read;
            int i3 = i2 + 83;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = serializer + 1;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SoftPosResponse(status=" + this.status + ", transaction=" + this.transaction + ", paymentFailedResult=" + this.paymentFailedResult + ")";
        int i2 = serializer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
