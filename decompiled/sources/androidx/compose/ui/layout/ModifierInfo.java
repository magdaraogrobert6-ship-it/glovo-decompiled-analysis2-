package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierInfo {
    public static final int $stable = 8;
    private final LayoutCoordinates coordinates;
    private final Object extra;
    private final Modifier modifier;

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final Object getExtra() {
        return this.extra;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ModifierInfo(");
        sb.append(this.modifier);
        sb.append(", ");
        sb.append(this.coordinates);
        sb.append(", ");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.extra, ')');
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, layoutCoordinates, (i & 4) != 0 ? null : obj);
    }
}
