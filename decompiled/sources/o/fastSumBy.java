package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$Payment$Companion;
import kotlinx.serialization.Serializable;
import o.fastCbrt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "payment")
public final class fastSumBy implements fastAny {
    public static final Deliveries$Delivery$DeliveriesComponent$Payment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$Payment$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 65;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return fastCbrt.serializer;
            }
            fastCbrt fastcbrt = fastCbrt.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String amount;
    public final String info;
    public final String note;
    public final throwNoSuchElementException tip;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$Payment$Companion] */
    static {
        int i = write + 23;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ fastSumBy(int i, String str, String str2, String str3, String str4, throwNoSuchElementException thrownosuchelementexception) {
        if (3 == (i & 3)) {
            this.title = str;
            this.info = str2;
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = str3;
            }
            if ((i & 8) != 0) {
                this.note = str4;
                int i2 = RemoteActionCompatParcelizer + 103;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                int i4 = read + 11;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    this.note = null;
                } else {
                    this.note = null;
                    throw null;
                }
            }
            int i5 = 2 % 2;
            if ((i & 16) == 0) {
                int i6 = RemoteActionCompatParcelizer + 123;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.tip = null;
                return;
            }
            this.tip = thrownosuchelementexception;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastCbrt.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Payment(title=", this.title, ", info=", this.info, ", amount=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.amount, ", note=", this.note, ", tip=");
        sbM.append(this.tip);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.info);
        String str = this.amount;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 111;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.note;
        if (str2 == null) {
            int i4 = read + 85;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        throwNoSuchElementException thrownosuchelementexception = this.tip;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (thrownosuchelementexception != null ? thrownosuchelementexception.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fastSumBy)) {
            int i2 = read + 115;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        fastSumBy fastsumby = (fastSumBy) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fastsumby.title}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 107;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.info, fastsumby.info}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amount, fastsumby.amount}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 61;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.note, fastsumby.note}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tip, fastsumby.tip}, getCieXyz.write())).booleanValue();
        }
        int i8 = RemoteActionCompatParcelizer + 107;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
