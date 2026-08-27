package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getAutoClearFocusBehavior4UtRPd4 {
    public final String IconCompatParcelizer;
    public final setParentCompositionContext write;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + this.write.hashCode();
    }

    public getAutoClearFocusBehavior4UtRPd4(setParentCompositionContext setparentcompositioncontext, String str) {
        this.write = setparentcompositioncontext;
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getAutoClearFocusBehavior4UtRPd4)) {
            return false;
        }
        getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4 = (getAutoClearFocusBehavior4UtRPd4) obj;
        return hashCode() == getautoclearfocusbehavior4utrpd4.hashCode() && this.write.equals(getautoclearfocusbehavior4utrpd4.write) && this.IconCompatParcelizer.equals(getautoclearfocusbehavior4utrpd4.IconCompatParcelizer);
    }
}
