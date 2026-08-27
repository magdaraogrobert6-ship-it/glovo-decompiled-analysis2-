package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Order$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getOffsetnOccac;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidDialog_androidKt {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String dropoffInstructions;
    public final List orderItems;
    public final String pickupInstructions;
    public final String serial;
    public final String title;
    public static final StateV3$AcceptData$Order$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Order$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 65;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getOffsetnOccac getoffsetnoccac = getOffsetnOccac.write;
            int i4 = read + 79;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return getoffsetnoccac;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(14)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Order$Companion] */
    static {
        int i = IconCompatParcelizer + 5;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.dropoffInstructions;
        int i5 = i3 + 5;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 89;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serial;
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = write + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        List list = this.orderItems;
        int i5 = i3 + 19;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.pickupInstructions;
        }
        int i3 = 77 / 0;
        return this.pickupInstructions;
    }

    public /* synthetic */ AndroidDialog_androidKt(int i, String str, String str2, String str3, String str4, List list) {
        Object obj = null;
        if (7 == (i & 7)) {
            this.serial = str;
            this.title = str2;
            this.orderItems = list;
            if ((i & 8) == 0) {
                this.pickupInstructions = null;
                int i2 = write + 9;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.pickupInstructions = str3;
            }
            if ((i & 16) != 0) {
                this.dropoffInstructions = str4;
                return;
            }
            int i4 = read + 17;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.dropoffInstructions = null;
                return;
            } else {
                this.dropoffInstructions = null;
                obj.hashCode();
                throw null;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getOffsetnOccac.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Order(serial=", this.serial, ", title=", this.title, ", orderItems=");
        sbM.append(this.orderItems);
        sbM.append(", pickupInstructions=");
        sbM.append(this.pickupInstructions);
        sbM.append(", dropoffInstructions=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.dropoffInstructions, ")");
        int i4 = write + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.orderItems, af$$ExternalSyntheticOutline0.m(this.serial.hashCode() * 31, 31, this.title), 31);
        String str = this.pickupInstructions;
        if (str == null) {
            int i4 = read + 121;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.dropoffInstructions;
        return ((iM + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = read + 47;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 3;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof AndroidDialog_androidKt)) {
            int i6 = write + 85;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 123;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        AndroidDialog_androidKt androidDialog_androidKt = (AndroidDialog_androidKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serial, androidDialog_androidKt.serial}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidDialog_androidKt.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderItems, androidDialog_androidKt.orderItems}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pickupInstructions, androidDialog_androidKt.pickupInstructions}, getCieXyz.write())).booleanValue()) {
            int i10 = write + 25;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 51 / 0;
            }
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dropoffInstructions, androidDialog_androidKt.dropoffInstructions}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i12 = write + 93;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i12 % 2 == 0;
    }
}
