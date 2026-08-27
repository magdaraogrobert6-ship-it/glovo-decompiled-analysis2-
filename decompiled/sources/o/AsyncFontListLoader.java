package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody$Companion;
import kotlinx.serialization.Serializable;
import o.AsyncFontListLoaderload1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class AsyncFontListLoader {
    public static final AcceptDeliveryRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return AsyncFontListLoaderload1.read;
            }
            AsyncFontListLoaderload1 asyncFontListLoaderload1 = AsyncFontListLoaderload1.read;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final AsyncFontListLoaderload2typeface1 issues;
    public final String paymentEstimationId;
    public final double paymentEstimationTotal;
    public final String status;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody$Companion] */
    static {
        int i = serializer + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public /* synthetic */ AsyncFontListLoader(int i, String str, AsyncFontListLoaderload2typeface1 asyncFontListLoaderload2typeface1, String str2, double d) {
        if (8 != (i & 8)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 8, AsyncFontListLoaderload1.read.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            this.issues = null;
            int i3 = read + 87;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
            }
            if ((i & 4) == 0) {
                int i4 = IconCompatParcelizer + 81;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                this.paymentEstimationId = null;
                int i6 = 2 % 2;
            } else {
                this.paymentEstimationId = str2;
            }
            this.paymentEstimationTotal = d;
        }
        this.issues = asyncFontListLoaderload2typeface1;
        int i7 = 2 % 2;
        if ((i & 4) == 0) {
            int i8 = IconCompatParcelizer + 81;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.paymentEstimationId = null;
            int i10 = 2 % 2;
        } else {
            this.paymentEstimationId = str2;
        }
        this.paymentEstimationTotal = d;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.status;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        AsyncFontListLoaderload2typeface1 asyncFontListLoaderload2typeface1 = this.issues;
        if (asyncFontListLoaderload2typeface1 == null) {
            iHashCode = 0;
        } else {
            iHashCode = asyncFontListLoaderload2typeface1.hashCode();
            int i5 = IconCompatParcelizer + 19;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        String str2 = this.paymentEstimationId;
        if (str2 == null) {
            i = read + 81;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            iHashCode2 = str2.hashCode();
            i = IconCompatParcelizer + 11;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i7 = i % 2;
        int iHashCode4 = Double.hashCode(this.paymentEstimationTotal) + (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31);
        int i8 = read + 71;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AcceptDeliveryRequestBody(status=" + this.status + ", issues=" + this.issues + ", paymentEstimationId=" + this.paymentEstimationId + ", paymentEstimationTotal=" + this.paymentEstimationTotal + ")";
        int i2 = IconCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncFontListLoader)) {
            int i2 = read + 57;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        AsyncFontListLoader asyncFontListLoader = (AsyncFontListLoader) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, asyncFontListLoader.status}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 95;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.issues, asyncFontListLoader.issues}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentEstimationId, asyncFontListLoader.paymentEstimationId}, getCieXyz.write())).booleanValue()) {
            return Double.compare(this.paymentEstimationTotal, asyncFontListLoader.paymentEstimationTotal) == 0;
        }
        int i6 = read + 31;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return false;
    }
}
