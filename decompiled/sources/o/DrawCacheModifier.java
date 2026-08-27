package o;

import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;

/* JADX INFO: loaded from: classes.dex */
public final class DrawCacheModifier extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.layout.ParentDataModifier {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final ClipKt read;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(androidx.compose.ui.unit.Density density, Object obj) {
        return new getOnDraw(this.read, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        DrawCacheModifier drawCacheModifier = obj instanceof DrawCacheModifier ? (DrawCacheModifier) obj : null;
        return this.IconCompatParcelizer == (drawCacheModifier != null ? drawCacheModifier.IconCompatParcelizer : null);
    }

    public DrawCacheModifier(ClipKt clipKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new MapboxNavigation$notification$1$1(clipKt, 1, r8lambdaunavo3sxub_pc9xroryotnrlvsm) : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo());
        this.read = clipKt;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
