package o;

/* JADX INFO: loaded from: classes.dex */
public final class ParseException implements SourceInformationKt, androidx.compose.ui.platform.InspectableValue {
    public final float IconCompatParcelizer;

    @Override // o.SourceInformationKt
    public final float IconCompatParcelizer(long j, androidx.compose.ui.unit.Density density) {
        return this.IconCompatParcelizer;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return this.IconCompatParcelizer + "px";
    }

    public final int hashCode() {
        return Float.hashCode(this.IconCompatParcelizer);
    }

    public ParseException(float f) {
        this.IconCompatParcelizer = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParseException) && Float.compare(this.IconCompatParcelizer, ((ParseException) obj).IconCompatParcelizer) == 0;
    }

    public final String toString() {
        return "CornerSize(size = " + this.IconCompatParcelizer + ".px)";
    }
}
