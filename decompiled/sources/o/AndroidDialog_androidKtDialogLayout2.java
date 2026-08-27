package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$PaymentOptions$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidDialog_androidKtDialogdialogId11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidDialog_androidKtDialogLayout2 {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List availablePaymentOptions;
    public final String defaultPaymentOptionId;
    public final String selectedPaymentOption;
    public static final StateV3$AcceptData$PaymentOptions$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$PaymentOptions$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 59;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidDialog_androidKtDialogdialogId11 androidDialog_androidKtDialogdialogId11 = AndroidDialog_androidKtDialogdialogId11.write;
            int i4 = serializer + 95;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return androidDialog_androidKtDialogdialogId11;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(18)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$PaymentOptions$Companion] */
    static {
        int i = serializer + 67;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.selectedPaymentOption;
            int i4 = 61 / 0;
        } else {
            str = this.selectedPaymentOption;
        }
        int i5 = i2 + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = read + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.defaultPaymentOptionId;
        int i5 = i3 + 41;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        List list = this.availablePaymentOptions;
        int i5 = i3 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return list;
    }

    public /* synthetic */ AndroidDialog_androidKtDialogLayout2(int i, String str, String str2, List list) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.availablePaymentOptions = list;
            this.defaultPaymentOptionId = str;
            if ((i & 4) == 0) {
                this.selectedPaymentOption = str;
                int i2 = IconCompatParcelizer + 69;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.selectedPaymentOption = str2;
            int i3 = IconCompatParcelizer + 5;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidDialog_androidKtDialogdialogId11.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.defaultPaymentOptionId.hashCode() >>> (this.availablePaymentOptions.hashCode() >> 71);
        } else {
            iHashCode = (this.availablePaymentOptions.hashCode() * 31) + this.defaultPaymentOptionId.hashCode();
        }
        int i3 = read + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PaymentOptions(availablePaymentOptions=" + this.availablePaymentOptions + ", defaultPaymentOptionId=" + this.defaultPaymentOptionId + ")";
        int i2 = read + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidDialog_androidKtDialogLayout2)) {
            int i5 = i3 + 123;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        AndroidDialog_androidKtDialogLayout2 androidDialog_androidKtDialogLayout2 = (AndroidDialog_androidKtDialogLayout2) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.availablePaymentOptions, androidDialog_androidKtDialogLayout2.availablePaymentOptions}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.defaultPaymentOptionId, androidDialog_androidKtDialogLayout2.defaultPaymentOptionId}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = IconCompatParcelizer + 91;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        int i8 = read;
        int i9 = i8 + 1;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = i8 + 107;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
