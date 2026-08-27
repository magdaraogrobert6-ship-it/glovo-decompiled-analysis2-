package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getMinWidthimpl;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMaxHeightimpl implements uiMode {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final double amount;
    public final isZeroannotations cardUiItem;
    public final restrictConstraintsxF2OJ5Qdefault cashUiItem;
    public final String currency;
    public final String formattedAmount;
    public final boolean isDone;
    public final boolean isOptional;
    public final TapToPayTaskUiItem$PaymentType paymentType;
    public final String taskId;
    public final String title;
    public static final TapToPayTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 31;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getMinWidthimpl getminwidthimpl = getMinWidthimpl.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getMinWidthimpl getminwidthimpl2 = getMinWidthimpl.serializer;
            int i3 = write + 77;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getminwidthimpl2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(24)), null, null, null, null, null, null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$Companion] */
    static {
        Object obj = null;
        int i = read + 79;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.taskId;
        }
        int i3 = 96 / 0;
        return this.taskId;
    }

    @Override // o.uiMode
    public final boolean read() {
        boolean z;
        int i = 2 % 2;
        int i2 = serializer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            z = this.isOptional;
            int i4 = 74 / 0;
        } else {
            z = this.isOptional;
        }
        int i5 = i3 + 13;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TapToPayTaskUiItem$PaymentType serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType = this.paymentType;
        int i4 = i2 + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return tapToPayTaskUiItem$PaymentType;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.isDone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getMaxHeightimpl(int i, String str, TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType, double d, String str2, String str3, restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault, isZeroannotations iszeroannotations, String str4, boolean z, boolean z2) {
        if (415 == (i & 415)) {
            this.title = str;
            this.paymentType = tapToPayTaskUiItem$PaymentType;
            this.amount = d;
            this.currency = str2;
            this.formattedAmount = str3;
            if ((i & 32) == 0) {
                this.cashUiItem = null;
                int i2 = serializer + 95;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.cashUiItem = restrictconstraintsxf2oj5qdefault;
            }
            if ((i & 64) == 0) {
                this.cardUiItem = null;
                int i4 = RemoteActionCompatParcelizer + 3;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } else {
                this.cardUiItem = iszeroannotations;
            }
            this.taskId = str4;
            this.isOptional = z;
            if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
                this.isDone = true;
                return;
            } else {
                this.isDone = z2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 415, getMinWidthimpl.serializer.getDescriptor());
        throw null;
    }

    public static getMaxHeightimpl write(getMaxHeightimpl getmaxheightimpl, TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType) {
        int i = 2 % 2;
        String str = getmaxheightimpl.title;
        double d = getmaxheightimpl.amount;
        String str2 = getmaxheightimpl.currency;
        String str3 = getmaxheightimpl.formattedAmount;
        restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault = getmaxheightimpl.cashUiItem;
        isZeroannotations iszeroannotations = getmaxheightimpl.cardUiItem;
        String str4 = getmaxheightimpl.taskId;
        boolean z = getmaxheightimpl.isOptional;
        boolean z2 = getmaxheightimpl.isDone;
        getmaxheightimpl.getClass();
        str.getClass();
        tapToPayTaskUiItem$PaymentType.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        getMaxHeightimpl getmaxheightimpl2 = new getMaxHeightimpl(str, tapToPayTaskUiItem$PaymentType, d, str2, str3, restrictconstraintsxf2oj5qdefault, iszeroannotations, str4, z, z2);
        int i2 = serializer + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return getmaxheightimpl2;
    }

    public getMaxHeightimpl(String str, TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType, double d, String str2, String str3, restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault, isZeroannotations iszeroannotations, String str4, boolean z, boolean z2) {
        af$$ExternalSyntheticOutline0.m3978m(str, str3, str4);
        this.title = str;
        this.paymentType = tapToPayTaskUiItem$PaymentType;
        this.amount = d;
        this.currency = str2;
        this.formattedAmount = str3;
        this.cashUiItem = restrictconstraintsxf2oj5qdefault;
        this.cardUiItem = iszeroannotations;
        this.taskId = str4;
        this.isOptional = z;
        this.isDone = z2;
    }

    public /* synthetic */ getMaxHeightimpl(String str, TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType, double d, String str2, String str3, restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault, isZeroannotations iszeroannotations, String str4, boolean z) {
        this(str, tapToPayTaskUiItem$PaymentType, d, str2, str3, restrictconstraintsxf2oj5qdefault, iszeroannotations, str4, z, true);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.amount, (this.paymentType.hashCode() + (this.title.hashCode() * 31)) * 31, 31), 31, this.currency), 31, this.formattedAmount);
        restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault = this.cashUiItem;
        int iHashCode2 = 0;
        if (restrictconstraintsxf2oj5qdefault == null) {
            iHashCode = 0;
        } else {
            iHashCode = restrictconstraintsxf2oj5qdefault.hashCode();
            int i2 = RemoteActionCompatParcelizer + 59;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        isZeroannotations iszeroannotations = this.cardUiItem;
        if (iszeroannotations != null) {
            iHashCode2 = iszeroannotations.hashCode();
            int i4 = RemoteActionCompatParcelizer + 87;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return Boolean.hashCode(this.isDone) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + iHashCode2) * 31, 31, this.taskId), 31, this.isOptional);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMaxHeightimpl)) {
            return false;
        }
        getMaxHeightimpl getmaxheightimpl = (getMaxHeightimpl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getmaxheightimpl.title}, getCieXyz.write())).booleanValue() || this.paymentType != getmaxheightimpl.paymentType || Double.compare(this.amount, getmaxheightimpl.amount) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, getmaxheightimpl.currency}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.formattedAmount, getmaxheightimpl.formattedAmount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cashUiItem, getmaxheightimpl.cashUiItem}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cardUiItem, getmaxheightimpl.cardUiItem}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, getmaxheightimpl.taskId}, getCieXyz.write())).booleanValue())) {
                    return this.isOptional == getmaxheightimpl.isOptional && this.isDone == getmaxheightimpl.isDone;
                }
                int i2 = RemoteActionCompatParcelizer + 65;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = serializer + 35;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = RemoteActionCompatParcelizer + 93;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TapToPayTaskUiItem(title=" + this.title + ", paymentType=" + this.paymentType + ", amount=" + this.amount + ", currency=" + this.currency + ", formattedAmount=" + this.formattedAmount + ", cashUiItem=" + this.cashUiItem + ", cardUiItem=" + this.cardUiItem + ", taskId=" + this.taskId + ", isOptional=" + this.isOptional + ", isDone=" + this.isDone + ")";
        int i2 = serializer + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
