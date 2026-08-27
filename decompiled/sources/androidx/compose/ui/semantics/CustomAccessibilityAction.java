package androidx.compose.ui.semantics;

import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 action;
    private final String label;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.label.hashCode() * 31);
    }

    public CustomAccessibilityAction(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.label = str;
        this.action = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, customAccessibilityAction.label}, getCieXyz.write())).booleanValue() && this.action == customAccessibilityAction.action;
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
