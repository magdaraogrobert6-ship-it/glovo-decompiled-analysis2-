package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$Companion;
import kotlinx.serialization.Serializable;
import o.convert;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isInline {
    public static final CashPaymentTaskUiItem$TransferChangeItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 101;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return convert.IconCompatParcelizer;
            }
            int i3 = 59 / 0;
            return convert.IconCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final boolean isEnabled;
    public final boolean isRequired;
    public final boolean isTransferChangeSuccessful;
    public final contextOf successData;
    public final isCall taskData;
    public final String title;
    public final String uid;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$Companion] */
    static {
        int i = read + 49;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ isInline(int i, String str, boolean z, String str2, boolean z2, isCall iscall, contextOf contextof, boolean z3) {
        if (127 == (i & 127)) {
            this.uid = str;
            this.isRequired = z;
            this.title = str2;
            this.isTransferChangeSuccessful = z2;
            this.taskData = iscall;
            this.successData = contextof;
            this.isEnabled = z3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, convert.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public isInline(String str, boolean z, String str2, boolean z2, isCall iscall, contextOf contextof, boolean z3) {
        str.getClass();
        str2.getClass();
        this.uid = str;
        this.isRequired = z;
        this.title = str2;
        this.isTransferChangeSuccessful = z2;
        this.taskData = iscall;
        this.successData = contextof;
        this.isEnabled = z3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("TransferChangeItem(uid=", this.uid, ", isRequired=", ", title=", this.isRequired);
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.title, ", isTransferChangeSuccessful=", ", taskData=", sbM, this.isTransferChangeSuccessful);
        sbM.append(this.taskData);
        sbM.append(", successData=");
        sbM.append(this.successData);
        sbM.append(", isEnabled=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.isEnabled, ")");
        int i4 = serializer + 61;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.uid.hashCode() * 31, 31, this.isRequired), 31, this.title), 31, this.isTransferChangeSuccessful);
        isCall iscall = this.taskData;
        int iHashCode2 = 0;
        if (iscall == null) {
            int i2 = serializer + 5;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = iscall.hashCode();
        }
        contextOf contextof = this.successData;
        if (contextof != null) {
            iHashCode2 = contextof.hashCode();
            int i3 = serializer + 107;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return Boolean.hashCode(this.isEnabled) + ((((iM + iHashCode) * 31) + iHashCode2) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 51;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof isInline)) {
            int i3 = IconCompatParcelizer + 97;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        isInline isinline = (isInline) obj;
        Object[] objArr = {this.uid, isinline.uid};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.isRequired != isinline.isRequired) {
            return false;
        }
        Object[] objArr2 = {this.title, isinline.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.isTransferChangeSuccessful != isinline.isTransferChangeSuccessful) {
            return false;
        }
        Object[] objArr3 = {this.taskData, isinline.taskData};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 89;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        Object[] objArr4 = {this.successData, isinline.successData};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isEnabled == isinline.isEnabled) {
            return true;
        }
        int i7 = serializer + 115;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
