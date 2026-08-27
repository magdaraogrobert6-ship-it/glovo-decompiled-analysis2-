package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$Payment$Tip$Companion;
import kotlinx.serialization.Serializable;
import o.fastIsFinite;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class throwNoSuchElementException {
    public static final Deliveries$Delivery$DeliveriesComponent$Payment$Tip$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$Payment$Tip$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 7;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return fastIsFinite.RemoteActionCompatParcelizer;
            }
            fastIsFinite fastisfinite = fastIsFinite.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String amount;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$Payment$Tip$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 45;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ throwNoSuchElementException(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.amount = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastIsFinite.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tip(title=", this.title, ", amount=", this.amount, ")");
            int i3 = IconCompatParcelizer + 125;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tip(title=", this.title, ", amount=", this.amount, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.amount.hashCode() % (this.title.hashCode() << 43);
        } else {
            iHashCode = this.amount.hashCode() + (this.title.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        boolean z = true;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 87;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof throwNoSuchElementException)) {
            return false;
        }
        throwNoSuchElementException thrownosuchelementexception = (throwNoSuchElementException) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, thrownosuchelementexception.title}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amount, thrownosuchelementexception.amount}, getCieXyz.write())).booleanValue()) {
                int i3 = IconCompatParcelizer + 39;
                int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i4;
                z = i3 % 2 == 0;
                int i5 = i4 + 73;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            return z;
        }
        int i7 = IconCompatParcelizer + 53;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
