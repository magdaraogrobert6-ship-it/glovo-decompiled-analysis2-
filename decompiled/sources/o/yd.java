package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import com.roadrunner.order.history.data.database.entity.Delivery$Item$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.yg;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class yd {
    public static final Delivery$Item$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Item$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            yg ygVar = yg.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 113;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return ygVar;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final boolean available;
    public final long id;
    public final String name;
    public final double price;
    public final float quantity;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Item$Companion] */
    static {
        int i = IconCompatParcelizer + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 52 / 0;
        }
    }

    public /* synthetic */ yd(int i, long j, String str, double d, float f, boolean z) {
        if (27 != (i & 27)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 27, yg.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.id = j;
        this.name = str;
        if ((i & 4) == 0) {
            this.price = 0.0d;
            int i2 = write + 45;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            this.quantity = f;
            this.available = z;
            int i3 = RemoteActionCompatParcelizer + 77;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.price = d;
        int i5 = 2 % 2;
        this.quantity = f;
        this.available = z;
        int i6 = RemoteActionCompatParcelizer + 77;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.available) + af$$ExternalSyntheticOutline1.m(this.quantity, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.price, af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name), 31), 31);
        int i4 = write + 51;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public yd(long j, String str, double d, float f, boolean z) {
        str.getClass();
        this.id = j;
        this.name = str;
        this.price = d;
        this.quantity = f;
        this.available = z;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Item(id=", ", name=", this.id, this.name);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(")");
        String string = sb.toString();
        int i4 = write + 85;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof yd)) {
                return false;
            }
            yd ydVar = (yd) obj;
            if (this.id != ydVar.id) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, ydVar.name}, getCieXyz.write())).booleanValue() || Double.compare(this.price, ydVar.price) != 0 || Float.compare(this.quantity, ydVar.quantity) != 0) {
                return false;
            }
            if (this.available != ydVar.available) {
                int i5 = write + 97;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i6;
                z = i5 % 2 != 0;
                int i7 = i6 + 119;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 87 / 0;
                }
            }
            return z;
        }
        int i9 = i2 + 79;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 46 / 0;
        }
        return true;
    }
}
