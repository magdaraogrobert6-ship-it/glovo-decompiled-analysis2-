package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentStatus$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PreviewWrapperProvider;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Wallpaper {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final mapTreeWithStitching statusMessage;
    public final QrPaymentTaskUiItem$PaymentStatus value;
    public static final QrPaymentTaskUiItem$QrPaymentStatus$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentStatus$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PreviewWrapperProvider previewWrapperProvider = PreviewWrapperProvider.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return previewWrapperProvider;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(15)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentStatus$Companion] */
    static {
        int i = IconCompatParcelizer + 91;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    public /* synthetic */ Wallpaper(int i, QrPaymentTaskUiItem$PaymentStatus qrPaymentTaskUiItem$PaymentStatus, mapTreeWithStitching maptreewithstitching) {
        if (3 == (i & 3)) {
            this.value = qrPaymentTaskUiItem$PaymentStatus;
            this.statusMessage = maptreewithstitching;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PreviewWrapperProvider.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        QrPaymentTaskUiItem$PaymentStatus qrPaymentTaskUiItem$PaymentStatus = this.value;
        if (qrPaymentTaskUiItem$PaymentStatus == null) {
            int i5 = i3 + 57;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = qrPaymentTaskUiItem$PaymentStatus.hashCode();
        }
        mapTreeWithStitching maptreewithstitching = this.statusMessage;
        int iHashCode2 = (iHashCode * 31) + (maptreewithstitching != null ? maptreewithstitching.hashCode() : 0);
        int i7 = read + 121;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public Wallpaper(QrPaymentTaskUiItem$PaymentStatus qrPaymentTaskUiItem$PaymentStatus, mapTreeWithStitching maptreewithstitching) {
        this.value = qrPaymentTaskUiItem$PaymentStatus;
        this.statusMessage = maptreewithstitching;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Wallpaper) {
            Wallpaper wallpaper = (Wallpaper) obj;
            if (this.value == wallpaper.value) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.statusMessage, wallpaper.statusMessage}, getCieXyz.write())).booleanValue();
            }
            int i2 = read + 33;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QrPaymentStatus(value=" + this.value + ", statusMessage=" + this.statusMessage + ")";
        int i2 = read + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
