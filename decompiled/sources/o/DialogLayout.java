package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$OrderItemExtra$Companion;
import kotlinx.serialization.Serializable;
import o.Dialog;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DialogLayout {
    public static final StateV3$AcceptData$OrderItemExtra$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$OrderItemExtra$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            Dialog dialog;
            int i = 2 % 2;
            int i2 = read + 29;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                dialog = Dialog.serializer;
                int i3 = 17 / 0;
            } else {
                dialog = Dialog.serializer;
            }
            int i4 = read + 25;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return dialog;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String name;
    public final String quantity;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$OrderItemExtra$Companion] */
    static {
        int i = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.name;
            int i4 = 5 / 0;
        } else {
            str = this.name;
        }
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 91;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.quantity;
            int i4 = 49 / 0;
        } else {
            str = this.quantity;
        }
        int i5 = i2 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ DialogLayout(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.quantity = str;
            this.name = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Dialog.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OrderItemExtra(quantity=", this.quantity, ", name=", this.name, ")");
            int i3 = 28 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OrderItemExtra(quantity=", this.quantity, ", name=", this.name, ")");
        }
        int i4 = write + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode() + (this.quantity.hashCode() * 31);
        int i4 = read + 25;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 39;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 99;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof DialogLayout)) {
            int i6 = i4 + 43;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        DialogLayout dialogLayout = (DialogLayout) obj;
        Object[] objArr = {this.quantity, dialogLayout.quantity};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.name, dialogLayout.name};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = write + 1;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
