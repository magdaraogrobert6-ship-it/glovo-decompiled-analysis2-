package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.overdue.data.model.IssueRequestBody$IssueRequestBodyV2WithEstimation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.TextGeometricTransform;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TextForegroundStyleExternalSyntheticLambda0 extends from8_81llA {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final IssueRequestBody$IssueRequestBodyV2WithEstimation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.overdue.data.model.IssueRequestBody$IssueRequestBodyV2WithEstimation$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 57;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            TextGeometricTransform textGeometricTransform = TextGeometricTransform.serializer;
            int i4 = IconCompatParcelizer + 41;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return textGeometricTransform;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String category;
    public final List deliveryIds;
    public final String message;
    public final List paymentEstimationAmounts;
    public final List paymentEstimationIds;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.overdue.data.model.IssueRequestBody$IssueRequestBodyV2WithEstimation$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(6)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(7)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(8))};
        int i = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ TextForegroundStyleExternalSyntheticLambda0(int i, String str, String str2, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
            int i2 = write + 11;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.category = null;
        } else {
            this.category = str2;
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & 4) == 0) {
            int i5 = write + 109;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                this.deliveryIds = instance_delegatelambda0Var;
                throw null;
            }
            this.deliveryIds = instance_delegatelambda0Var;
            int i6 = 2 % 2;
        } else {
            this.deliveryIds = list;
        }
        if ((i & 8) == 0) {
            this.paymentEstimationIds = instance_delegatelambda0Var;
        } else {
            this.paymentEstimationIds = list2;
        }
        if ((i & 16) != 0) {
            this.paymentEstimationAmounts = list3;
            return;
        }
        int i7 = read + 115;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        this.paymentEstimationAmounts = instance_delegatelambda0Var;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("IssueRequestBodyV2WithEstimation(message=", this.message, ", category=", this.category, ", deliveryIds=");
        sbM.append(this.deliveryIds);
        sbM.append(", paymentEstimationIds=");
        sbM.append(this.paymentEstimationIds);
        sbM.append(", paymentEstimationAmounts=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.paymentEstimationAmounts, ")");
        int i4 = read + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public TextForegroundStyleExternalSyntheticLambda0(String str, String str2, List list, List list2, List list3) {
        this.message = str;
        this.category = str2;
        this.deliveryIds = list;
        this.paymentEstimationIds = list2;
        this.paymentEstimationAmounts = list3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.message;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.category;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List list = this.deliveryIds;
        if (list == null) {
            int i2 = write;
            int i3 = i2 + 111;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 % 5;
            }
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List list2 = this.paymentEstimationIds;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.paymentEstimationAmounts;
        if (list3 != null) {
            iHashCode2 = list3.hashCode();
            int i7 = read + 105;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 103;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextForegroundStyleExternalSyntheticLambda0)) {
            int i4 = i2 + 123;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        TextForegroundStyleExternalSyntheticLambda0 textForegroundStyleExternalSyntheticLambda0 = (TextForegroundStyleExternalSyntheticLambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, textForegroundStyleExternalSyntheticLambda0.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.category, textForegroundStyleExternalSyntheticLambda0.category}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 67;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryIds, textForegroundStyleExternalSyntheticLambda0.deliveryIds}, getCieXyz.write())).booleanValue()) {
            int i8 = write + 51;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentEstimationIds, textForegroundStyleExternalSyntheticLambda0.paymentEstimationIds}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentEstimationAmounts, textForegroundStyleExternalSyntheticLambda0.paymentEstimationAmounts}, getCieXyz.write())).booleanValue();
        }
        int i10 = write + 39;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
