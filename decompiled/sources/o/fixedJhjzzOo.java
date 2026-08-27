package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$ActionCardUiItem$Companion;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.fitPrioritizingHeightZbe2FdA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class fixedJhjzzOo extends fixedWidthOenEA2s {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final UtccComponentUiItem$ActionCardUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$ActionCardUiItem$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 117;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fitPrioritizingHeightZbe2FdA fitprioritizingheightzbe2fda = fitPrioritizingHeightZbe2FdA.read;
            int i4 = serializer + 53;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fitprioritizingheightzbe2fda;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final Map availableStates;
    public final ConstraintsKt currentState;
    public final restrictConstraintsxF2OJ5Q currentStateType;
    public final String id;
    public final boolean isEnabled;
    public final boolean isLoading;
    public final List requiredSteps;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$ActionCardUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(28)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(29))};
        int i = RemoteActionCompatParcelizer + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.fixedWidthOenEA2s
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.fixedWidthOenEA2s
    public final List read() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.requiredSteps;
        }
        throw null;
    }

    public /* synthetic */ fixedJhjzzOo(int i, String str, String str2, List list, Map map) {
        if (3 == (i & 3)) {
            this.id = str;
            this.title = str2;
            if ((i & 4) == 0) {
                this.requiredSteps = instance_delegatelambda0.write;
            } else {
                this.requiredSteps = list;
                int i2 = IconCompatParcelizer + 7;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 8) != 0) {
                this.availableStates = map;
            } else {
                int i5 = IconCompatParcelizer + 59;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    this.availableStates = SimpleItemTouchHelperCallback.serializer;
                    int i6 = 15 / 0;
                } else {
                    this.availableStates = SimpleItemTouchHelperCallback.serializer;
                }
                int i7 = IconCompatParcelizer + 99;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
            this.currentState = null;
            this.currentStateType = restrictConstraintsxF2OJ5Q.NOT_INITIATED;
            this.isEnabled = true;
            this.isLoading = false;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fitPrioritizingHeightZbe2FdA.read.getDescriptor());
        throw null;
    }

    public static fixedJhjzzOo read(fixedJhjzzOo fixedjhjzzoo, ConstraintsKt constraintsKt, restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q, boolean z, boolean z2, int i) {
        restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q2;
        boolean z3;
        boolean z4;
        restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q3;
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String str = fixedjhjzzoo.id;
        String str2 = fixedjhjzzoo.title;
        List list = fixedjhjzzoo.requiredSteps;
        Map map = fixedjhjzzoo.availableStates;
        ConstraintsKt constraintsKt2 = (i & 16) != 0 ? fixedjhjzzoo.currentState : constraintsKt;
        if ((i & 32) != 0) {
            int i6 = i3 + 33;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                restrictconstraintsxf2oj5q3 = fixedjhjzzoo.currentStateType;
                int i7 = 88 / 0;
            } else {
                restrictconstraintsxf2oj5q3 = fixedjhjzzoo.currentStateType;
            }
            restrictconstraintsxf2oj5q2 = restrictconstraintsxf2oj5q3;
        } else {
            restrictconstraintsxf2oj5q2 = restrictconstraintsxf2oj5q;
        }
        if ((i & 64) != 0) {
            int i8 = i3 + 101;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                boolean z5 = fixedjhjzzoo.isEnabled;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            z3 = fixedjhjzzoo.isEnabled;
        } else {
            z3 = z;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i9 = IconCompatParcelizer + 23;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z4 = fixedjhjzzoo.isLoading;
        } else {
            z4 = z2;
        }
        str.getClass();
        list.getClass();
        map.getClass();
        restrictconstraintsxf2oj5q2.getClass();
        return new fixedJhjzzOo(str, str2, list, map, constraintsKt2, restrictconstraintsxf2oj5q2, z3, z4);
    }

    public fixedJhjzzOo(String str, String str2, List list, Map map, ConstraintsKt constraintsKt, restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        restrictconstraintsxf2oj5q.getClass();
        this.id = str;
        this.title = str2;
        this.requiredSteps = list;
        this.availableStates = map;
        this.currentState = constraintsKt;
        this.currentStateType = restrictconstraintsxf2oj5q;
        this.isEnabled = z;
        this.isLoading = z2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.id.hashCode();
        String str = this.title;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = IconCompatParcelizer + 3;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(this.requiredSteps, ((iHashCode2 * 31) + iHashCode) * 31, 31), this.availableStates, 31);
        ConstraintsKt constraintsKt = this.currentState;
        if (constraintsKt == null) {
            int i4 = serializer + 29;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode3 = constraintsKt.hashCode();
            int i5 = IconCompatParcelizer + 57;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return Boolean.hashCode(this.isLoading) + d$$ExternalSyntheticOutline0.m((this.currentStateType.hashCode() + ((iRemoteActionCompatParcelizer + iHashCode3) * 31)) * 31, 31, this.isEnabled);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ActionCardUiItem(id=", this.id, ", title=", this.title, ", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(", availableStates=");
        sbM.append(this.availableStates);
        sbM.append(", currentState=");
        sbM.append(this.currentState);
        sbM.append(", currentStateType=");
        sbM.append(this.currentStateType);
        sbM.append(", isEnabled=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sbM, this.isEnabled, ", isLoading=", this.isLoading, ")");
        int i4 = serializer + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public /* synthetic */ fixedJhjzzOo(String str, String str2, List list, safeSetClipToOutline safesetcliptooutline) {
        this(str, str2, list, safesetcliptooutline, null, restrictConstraintsxF2OJ5Q.NOT_INITIATED, true, false);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fixedJhjzzOo)) {
            return false;
        }
        fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) obj;
        Object[] objArr = {this.id, fixedjhjzzoo.id};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = serializer + 105;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr2 = {this.title, fixedjhjzzoo.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 43;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 105;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        Object[] objArr3 = {this.requiredSteps, fixedjhjzzoo.requiredSteps};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.availableStates, fixedjhjzzoo.availableStates};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.currentState, fixedjhjzzoo.currentState};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue() || this.currentStateType != fixedjhjzzoo.currentStateType || this.isEnabled != fixedjhjzzoo.isEnabled) {
            return false;
        }
        if (this.isLoading == fixedjhjzzoo.isLoading) {
            return true;
        }
        int i9 = IconCompatParcelizer + 121;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
