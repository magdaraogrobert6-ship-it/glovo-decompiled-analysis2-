package o;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomLeftannotations implements SourceInformationKt, androidx.compose.ui.platform.InspectableValue {
    public final float read;

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return MediaSessionCompatQueueItem.serializer(new StringBuilder(), this.read, '%');
    }

    public final int hashCode() {
        return Float.hashCode(this.read);
    }

    public getBottomLeftannotations(float f) {
        this.read = f;
        if (f < 0.0f || f > 100.0f) {
            TriStateCheckbox.read("The percent should be in the range of [0, 100]");
        }
    }

    @Override // o.SourceInformationKt
    public final float IconCompatParcelizer(long j, androidx.compose.ui.unit.Density density) {
        return (this.read / 100.0f) * androidx.compose.ui.geometry.Size.m545getMinDimensionimpl(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getBottomLeftannotations) && Float.compare(this.read, ((getBottomLeftannotations) obj).read) == 0;
    }

    public final String toString() {
        return "CornerSize(size = " + this.read + "%)";
    }
}
