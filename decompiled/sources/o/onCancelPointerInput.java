package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class onCancelPointerInput extends AbstractSet {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 RemoteActionCompatParcelizer;

    public /* synthetic */ onCancelPointerInput(HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.IconCompatParcelizer;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.clear();
        } else {
            hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.IconCompatParcelizer;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.containsKey(obj);
        }
        Map mapRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer(entry.getKey());
            if (iRemoteActionCompatParcelizer != -1 && FeatureFlagProvider.write(hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.serializer()[iRemoteActionCompatParcelizer], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.IconCompatParcelizer;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            Map mapRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
            return mapRemoteActionCompatParcelizer != null ? mapRemoteActionCompatParcelizer.keySet().iterator() : new setOverrideDescendants(hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1, 0);
        }
        Map mapRemoteActionCompatParcelizer2 = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
        return mapRemoteActionCompatParcelizer2 != null ? mapRemoteActionCompatParcelizer2.entrySet().iterator() : new setOverrideDescendants(hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.IconCompatParcelizer;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RemoteActionCompatParcelizer;
        return i != 0 ? hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.size() : hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.IconCompatParcelizer;
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            Map mapRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
            if (mapRemoteActionCompatParcelizer != null) {
                return mapRemoteActionCompatParcelizer.keySet().remove(obj);
            }
            return hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.IconCompatParcelizer(obj) != HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer;
        }
        Map mapRemoteActionCompatParcelizer2 = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer2 != null) {
            return mapRemoteActionCompatParcelizer2.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.IconCompatParcelizer()) {
            return false;
        }
        int iMediaSessionCompatQueueItem = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaSessionCompatQueueItem();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.serializer;
        Objects.requireNonNull(obj2);
        int iWrite = FwFDataQueriesdeleteItem1.write(key, value, iMediaSessionCompatQueueItem, obj2, hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.write(), hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.read(), hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.serializer());
        if (iWrite == -1) {
            return false;
        }
        hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.write(iWrite, iMediaSessionCompatQueueItem);
        hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaSessionCompatQueueItem--;
        hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.MediaBrowserCompatMediaItem += 32;
        return true;
    }
}
