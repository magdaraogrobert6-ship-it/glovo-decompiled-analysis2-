package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$DeliveryNotesComponent$Folding$Companion;
import kotlinx.serialization.Serializable;
import o.onKeyUp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "folding")
public final class setSecurePolicy extends _init_disableClipping {
    public static final Instruction$DeliveryNotes$DeliveryNotesComponent$Folding$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$DeliveryNotesComponent$Folding$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 91;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onKeyUp onkeyup = onKeyUp.IconCompatParcelizer;
            int i4 = serializer + 83;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onkeyup;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String lessText;
    public final String moreText;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$DeliveryNotesComponent$Folding$Companion] */
    static {
        int i = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setSecurePolicy(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.lessText = null;
        } else {
            this.lessText = str;
            int i2 = read + 37;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            this.moreText = str2;
            return;
        }
        this.moreText = null;
        int i5 = write + 53;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Folding(lessText=", this.lessText, ", moreText=", this.moreText, ")");
        int i4 = read + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.lessText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.moreText;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = write + 99;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setSecurePolicy) {
            setSecurePolicy setsecurepolicy = (setSecurePolicy) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lessText, setsecurepolicy.lessText}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.moreText, setsecurepolicy.moreText}, getCieXyz.write())).booleanValue();
            }
            int i2 = write + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i3 = write + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
