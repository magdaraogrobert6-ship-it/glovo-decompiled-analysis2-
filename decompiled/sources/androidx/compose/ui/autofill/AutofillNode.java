package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class AutofillNode {
    public static final int $stable = 8;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onFill;

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnFill() {
        return this.onFill;
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode();
        Rect rect = this.boundingBox;
        int iHashCode2 = rect != null ? rect.hashCode() : 0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onFill;
        return (((iHashCode * 31) + iHashCode2) * 31) + (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.id = SemanticsModifierKt.generateSemanticsId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.autofillTypes, autofillNode.autofillTypes}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.boundingBox, autofillNode.boundingBox}, getCieXyz.write())).booleanValue() && this.onFill == autofillNode.onFill;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? instance_delegatelambda0.write : list, (i & 2) != 0 ? null : rect, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
