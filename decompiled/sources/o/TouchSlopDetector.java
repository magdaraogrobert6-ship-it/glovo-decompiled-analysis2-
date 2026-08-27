package o;

/* JADX INFO: loaded from: classes.dex */
public final class TouchSlopDetector {
    public final Arrangement IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    public TouchSlopDetector(Arrangement arrangement, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = arrangement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchSlopDetector)) {
            return false;
        }
        TouchSlopDetector touchSlopDetector = (TouchSlopDetector) obj;
        return this.read.equals(touchSlopDetector.read) && this.IconCompatParcelizer.equals(touchSlopDetector.IconCompatParcelizer);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.read + ", animationSpec=" + this.IconCompatParcelizer + ')';
    }
}
