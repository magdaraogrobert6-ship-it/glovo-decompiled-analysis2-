package androidx.compose.ui.semantics;

import o.getCieXyz;
import o.isInvalidIndex;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityAction<T extends isInvalidIndex> {
    public static final int $stable = 0;
    private final T action;
    private final String label;

    public final T getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public AccessibilityAction(String str, T t) {
        this.label = str;
        this.action = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, accessibilityAction.label}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, accessibilityAction.action}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = str != null ? str.hashCode() : 0;
        T t = this.action;
        return (iHashCode * 31) + (t != null ? t.hashCode() : 0);
    }
}
