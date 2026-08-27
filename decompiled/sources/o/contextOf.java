package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$SuccessData$Companion;
import kotlinx.serialization.Serializable;
import o.parentGroup;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class contextOf {
    public static final CashPaymentTaskUiItem$TransferChangeItem$SuccessData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$SuccessData$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            parentGroup parentgroup;
            int i = 2 % 2;
            int i2 = read + 99;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                parentgroup = parentGroup.write;
                int i3 = 97 / 0;
            } else {
                parentgroup = parentGroup.write;
            }
            int i4 = serializer + 93;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return parentgroup;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String description;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$SuccessData$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 99;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ contextOf(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.description = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, parentGroup.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("SuccessData(title=", this.title, ", description=", this.description, ")");
        int i4 = read + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.description.hashCode() << (this.title.hashCode() * 99);
        } else {
            iHashCode = (this.title.hashCode() * 31) + this.description.hashCode();
        }
        int i3 = serializer + 53;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public contextOf(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 53;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof contextOf)) {
            int i4 = i2 + 113;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i2 + 67;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        contextOf contextof = (contextOf) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, contextof.title}, getCieXyz.write())).booleanValue()) {
            int i8 = read + 43;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, contextof.description}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i9 = serializer + 71;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
