package o;

import androidx.collection.ObjectList$toString$1;

/* JADX INFO: loaded from: classes.dex */
public final class getWindow implements getShouldCreateCompositionOnAttachedToWindow {
    public final androidx.compose.ui.unit.Density IconCompatParcelizer;
    public final long read;

    @Override // o.IconButtonKt
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment) {
        return modifier.then(new FloatingActionButtonlFWlFE(alignment, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new ObjectList$toString$1(7, alignment) : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    public final int hashCode() {
        return androidx.compose.ui.unit.Constraints.m3629hashCodeimpl(this.read) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public final float read() {
        long j = this.read;
        if (!androidx.compose.ui.unit.Constraints.m3622getHasBoundedWidthimpl(j)) {
            return androidx.compose.ui.unit.Dp.Companion.m3692getInfinityD9Ej5fM();
        }
        return this.IconCompatParcelizer.mo45toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j));
    }

    public final float serializer() {
        long j = this.read;
        if (!androidx.compose.ui.unit.Constraints.m3621getHasBoundedHeightimpl(j)) {
            return androidx.compose.ui.unit.Dp.Companion.m3692getInfinityD9Ej5fM();
        }
        return this.IconCompatParcelizer.mo45toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j));
    }

    public getWindow(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        this.IconCompatParcelizer = subcomposeMeasureScope;
        this.read = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWindow)) {
            return false;
        }
        getWindow getwindow = (getWindow) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getwindow.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && androidx.compose.ui.unit.Constraints.m3619equalsimpl0(this.read, getwindow.read);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.IconCompatParcelizer + ", constraints=" + ((Object) androidx.compose.ui.unit.Constraints.m3631toStringimpl(this.read)) + ')';
    }
}
