package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody$Issues$Companion;
import kotlinx.serialization.Serializable;
import o.AsyncFontListLoaderloadWithTimeoutOrNull1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class AsyncFontListLoaderload2typeface1 {
    public static final AcceptDeliveryRequestBody$Issues$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody$Issues$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            AsyncFontListLoaderloadWithTimeoutOrNull1 asyncFontListLoaderloadWithTimeoutOrNull1;
            int i = 2 % 2;
            int i2 = read + 21;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                asyncFontListLoaderloadWithTimeoutOrNull1 = AsyncFontListLoaderloadWithTimeoutOrNull1.write;
                int i3 = 24 / 0;
            } else {
                asyncFontListLoaderloadWithTimeoutOrNull1 = AsyncFontListLoaderloadWithTimeoutOrNull1.write;
            }
            int i4 = RemoteActionCompatParcelizer + 53;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return asyncFontListLoaderloadWithTimeoutOrNull1;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String paymentType;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody$Issues$Companion] */
    static {
        int i = read + 9;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AsyncFontListLoaderload2typeface1(int i, String str) {
        if ((i & 1) != 0) {
            this.paymentType = str;
            int i2 = IconCompatParcelizer + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.paymentType = null;
        int i4 = IconCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.paymentType;
        if (str == null) {
            int i2 = serializer + 23;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = serializer + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = serializer + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m("Issues(paymentType=", this.paymentType, ")");
            int i3 = 10 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("Issues(paymentType=", this.paymentType, ")");
        }
        int i4 = serializer + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 33;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof AsyncFontListLoaderload2typeface1) {
            Object[] objArr = {this.paymentType, ((AsyncFontListLoaderload2typeface1) obj).paymentType};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = IconCompatParcelizer + 3;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 71;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
