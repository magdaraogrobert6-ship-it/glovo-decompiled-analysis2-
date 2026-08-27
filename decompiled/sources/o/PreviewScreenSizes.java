package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentDetails$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentType;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getCount;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PreviewScreenSizes {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final QrPaymentTaskUiItem$QrPaymentType type;
    public final String value;
    public static final QrPaymentTaskUiItem$QrPaymentDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentDetails$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 75;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getCount getcount = getCount.RemoteActionCompatParcelizer;
                throw null;
            }
            getCount getcount2 = getCount.RemoteActionCompatParcelizer;
            int i3 = write + 65;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getcount2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(13)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentDetails$Companion] */
    static {
        int i = write + 123;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    public /* synthetic */ PreviewScreenSizes(int i, QrPaymentTaskUiItem$QrPaymentType qrPaymentTaskUiItem$QrPaymentType, String str) {
        if (3 == (i & 3)) {
            this.type = qrPaymentTaskUiItem$QrPaymentType;
            this.value = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getCount.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.value.hashCode() / (this.type.hashCode() >>> 63);
        }
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    public PreviewScreenSizes(QrPaymentTaskUiItem$QrPaymentType qrPaymentTaskUiItem$QrPaymentType, String str) {
        str.getClass();
        this.type = qrPaymentTaskUiItem$QrPaymentType;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 53;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PreviewScreenSizes)) {
            int i4 = read + 9;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        PreviewScreenSizes previewScreenSizes = (PreviewScreenSizes) obj;
        if (this.type == previewScreenSizes.type) {
            Object[] objArr = {this.value, previewScreenSizes.value};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 65;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 105;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 19 / 0;
            }
            return false;
        }
        int i11 = IconCompatParcelizer + 3;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QrPaymentDetails(type=" + this.type + ", value=" + this.value + ")";
        int i2 = IconCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
