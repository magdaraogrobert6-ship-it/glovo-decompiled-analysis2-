package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class setDpTouchBoundsExpansion extends getDpTouchBoundsExpansion {
    public int read;
    public final /* synthetic */ HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 serializer;
    public final Object write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.serializer;
        Map mapRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.get(this.write);
        }
        RemoteActionCompatParcelizer();
        int i = this.read;
        if (i == -1) {
            return null;
        }
        return hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.serializer()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.serializer;
        Map mapRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
        Object obj2 = this.write;
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.put(obj2, obj);
        }
        RemoteActionCompatParcelizer();
        int i = this.read;
        if (i == -1) {
            hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.put(obj2, obj);
            return null;
        }
        Object obj3 = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.serializer()[i];
        hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.serializer()[this.read] = obj;
        return obj3;
    }

    public setDpTouchBoundsExpansion(HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1, int i) {
        this.serializer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1;
        Object obj = HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer;
        this.write = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.read()[i];
        this.read = i;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.read;
        Object obj = this.write;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.serializer;
        if (i != -1 && i < hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.size()) {
            if (FeatureFlagProvider.write(obj, hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.read()[this.read])) {
                return;
            }
        }
        Object obj2 = HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer;
        this.read = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer(obj);
    }
}
