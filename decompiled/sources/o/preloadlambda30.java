package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrPaymentDetails$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetAsyncTypefaceCachep;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class preloadlambda30 {
    public static final QrCodePaymentTask$QrPaymentDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrPaymentDetails$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 35;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return accessgetAsyncTypefaceCachep.IconCompatParcelizer;
            }
            int i3 = 64 / 0;
            return accessgetAsyncTypefaceCachep.IconCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String type;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask$QrPaymentDetails$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        int i3 = 75 / 0;
        return this.type;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ preloadlambda30(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.type = str;
            this.value = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessgetAsyncTypefaceCachep.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("QrPaymentDetails(type=", this.type, ", value=", this.value, ")");
        int i4 = read + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode() + (this.type.hashCode() * 31);
        int i4 = read + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof preloadlambda30) {
            preloadlambda30 preloadlambda30Var = (preloadlambda30) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, preloadlambda30Var.type}, getCieXyz.write())).booleanValue()) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, preloadlambda30Var.value}, getCieXyz.write())).booleanValue() ^ true);
            }
            int i2 = serializer + 79;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
