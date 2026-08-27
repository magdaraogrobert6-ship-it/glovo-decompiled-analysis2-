package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptNoOrders$Companion;
import kotlinx.serialization.Serializable;
import o.doubleFromBits;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept_result_no_orders")
public final class unpackAbsFloat2 extends fastRoundToInt {
    public static final AutoAcceptV2Data$AutoAcceptNoOrders$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptNoOrders$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 115;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            doubleFromBits doublefrombits = doubleFromBits.read;
            int i4 = serializer + 67;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return doublefrombits;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String message;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.AutoAcceptV2Data$AutoAcceptNoOrders$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 15;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.message;
        int i4 = i2 + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ unpackAbsFloat2(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.message = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, doubleFromBits.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptNoOrders(title=", this.title, ", message=", this.message, ")");
            int i3 = write + 23;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptNoOrders(title=", this.title, ", message=", this.message, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.message.hashCode() + (this.title.hashCode() * 31);
        int i4 = serializer + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof unpackAbsFloat2))) {
            unpackAbsFloat2 unpackabsfloat2 = (unpackAbsFloat2) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, unpackabsfloat2.title}, getCieXyz.write())).booleanValue()) {
                int i5 = write + 81;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, unpackabsfloat2.message}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i7 = i2 + 73;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
