package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.roadrunner.delivery.state.StateV3$AcceptData$OrderItem$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessDialoglambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Dialoglambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final String name;
    public final List orderItemsExtras;
    public final String quantity;
    public static final StateV3$AcceptData$OrderItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$OrderItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessDialoglambda0 accessdialoglambda0 = accessDialoglambda0.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 65;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
            return accessdialoglambda0;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(16))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$OrderItem$Companion] */
    static {
        int i = read + 125;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.quantity;
            int i4 = 6 / 0;
        } else {
            str = this.quantity;
        }
        int i5 = i2 + 85;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.orderItemsExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.name;
        }
        throw null;
    }

    public /* synthetic */ Dialoglambda0(int i, String str, String str2, List list) {
        if (3 == (i & 3)) {
            this.quantity = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.orderItemsExtras = null;
                int i2 = RemoteActionCompatParcelizer + 27;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.orderItemsExtras = list;
            int i4 = serializer + 65;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessDialoglambda0.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("OrderItem(quantity=", this.quantity, ", name=", this.name, ", orderItemsExtras="), this.orderItemsExtras, ")");
            int i3 = RemoteActionCompatParcelizer + 19;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 82 / 0;
            }
            return str;
        }
        MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("OrderItem(quantity=", this.quantity, ", name=", this.name, ", orderItemsExtras="), this.orderItemsExtras, ")");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c A[PHI: r1 r2
  0x004c: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r2v10 java.util.List) = (r2v2 java.util.List), (r2v13 java.util.List) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        List list;
        int i;
        int iHashCode;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 95;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.quantity.hashCode() % 91, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, this.name);
            list = this.orderItemsExtras;
            if (list == null) {
                i = serializer + 7;
                int i6 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i6;
                if (i % 2 != 0) {
                    iHashCode = 1;
                } else {
                    iHashCode = 0;
                }
                i2 = i6 + 5;
                i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                iHashCode = list.hashCode();
                i2 = RemoteActionCompatParcelizer + 91;
                i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.quantity.hashCode() * 31, 31, this.name);
            list = this.orderItemsExtras;
            if (list == null) {
                i = serializer + 7;
                int i7 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i7;
                if (i % 2 != 0) {
                    iHashCode = 1;
                } else {
                    iHashCode = 0;
                }
                i2 = i7 + 5;
                i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                iHashCode = list.hashCode();
                i2 = RemoteActionCompatParcelizer + 91;
                i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
        }
        serializer = i3;
        int i8 = i2 % 2;
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dialoglambda0)) {
            return false;
        }
        Dialoglambda0 dialoglambda0 = (Dialoglambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.quantity, dialoglambda0.quantity}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, dialoglambda0.name}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 15;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderItemsExtras, dialoglambda0.orderItemsExtras}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 15;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 11;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
