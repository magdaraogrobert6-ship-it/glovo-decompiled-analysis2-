package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$CashCollection$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.ye;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class yb {
    public static final Delivery$CashCollection$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$CashCollection$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 107;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ye yeVar = ye.IconCompatParcelizer;
            int i4 = serializer + 83;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return yeVar;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final long collectAtDropOff;
    public final long payAtPickup;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$CashCollection$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 109;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ yb(long j, long j2, int i) {
        if ((i & 1) == 0) {
            this.collectAtDropOff = 0L;
            int i2 = IconCompatParcelizer + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.collectAtDropOff = j;
        }
        if ((i & 2) != 0) {
            this.payAtPickup = j2;
            return;
        }
        int i5 = IconCompatParcelizer + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            this.payAtPickup = 0L;
        } else {
            this.payAtPickup = 0L;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.payAtPickup) >>> (Long.hashCode(this.collectAtDropOff) + 66);
        }
        return (Long.hashCode(this.collectAtDropOff) * 31) + Long.hashCode(this.payAtPickup);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = c8$$ExternalSyntheticOutline0.m(this.payAtPickup, ")", c8$$ExternalSyntheticOutline0.m(this.collectAtDropOff, "CashCollection(collectAtDropOff=", ", payAtPickup="));
        int i4 = read + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public yb(long j, long j2) {
        this.collectAtDropOff = j;
        this.payAtPickup = j2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 105;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof yb) {
            yb ybVar = (yb) obj;
            return this.collectAtDropOff == ybVar.collectAtDropOff && this.payAtPickup == ybVar.payAtPickup;
        }
        int i4 = IconCompatParcelizer + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
