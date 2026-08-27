package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getFillHeightannotations extends AbstractCollection {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final AbstractMap read;

    public /* synthetic */ getFillHeightannotations(AbstractMap abstractMap, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 0) {
            ((getFillWidthannotations) abstractMap).clear();
            return;
        }
        if (i == 1) {
            ((HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1) abstractMap).clear();
        } else if (i != 2) {
            ((getAfterhoxUOeE) abstractMap).clear();
        } else {
            ((getAfterhoxUOeE) abstractMap).clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 0) {
            return ((getFillWidthannotations) abstractMap).size();
        }
        if (i != 1) {
            return i != 2 ? ((getAfterhoxUOeE) abstractMap).write.size() : ((getAfterhoxUOeE) abstractMap).write.size();
        }
        return ((HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1) abstractMap).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 0) {
            getFillWidthannotations getfillwidthannotations = (getFillWidthannotations) abstractMap;
            Map mapSerializer = getfillwidthannotations.serializer();
            return mapSerializer != null ? mapSerializer.values().iterator() : new computeScaleFactorH7hwNQA(getfillwidthannotations, 2);
        }
        if (i != 1) {
            return i != 2 ? new zzkh(((getAfterhoxUOeE) abstractMap).entrySet().iterator(), 3) : new zzkh(((getAfterhoxUOeE) abstractMap).entrySet().iterator(), 2);
        }
        HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = (HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1) abstractMap;
        Map mapRemoteActionCompatParcelizer = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.RemoteActionCompatParcelizer();
        return mapRemoteActionCompatParcelizer != null ? mapRemoteActionCompatParcelizer.values().iterator() : new setOverrideDescendants(hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 2) {
            getAfterhoxUOeE getafterhoxuoee = (getAfterhoxUOeE) abstractMap;
            collection.getClass();
            try {
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : getafterhoxuoee.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return ((getPointerIconService) getafterhoxuoee.read).read().removeAll(hashSet);
            }
        }
        if (i != 3) {
            return super.removeAll(collection);
        }
        getAfterhoxUOeE getafterhoxuoee2 = (getAfterhoxUOeE) abstractMap;
        collection.getClass();
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused2) {
            HashSet hashSet2 = new HashSet();
            for (Map.Entry entry2 : getafterhoxuoee2.entrySet()) {
                if (collection.contains(entry2.getValue())) {
                    hashSet2.add(entry2.getKey());
                }
            }
            return ((getLambda641200809ui) getafterhoxuoee2.read).IconCompatParcelizer().removeAll(hashSet2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 2) {
            getAfterhoxUOeE getafterhoxuoee = (getAfterhoxUOeE) abstractMap;
            collection.getClass();
            try {
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : getafterhoxuoee.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return ((getPointerIconService) getafterhoxuoee.read).read().retainAll(hashSet);
            }
        }
        if (i != 3) {
            return super.retainAll(collection);
        }
        getAfterhoxUOeE getafterhoxuoee2 = (getAfterhoxUOeE) abstractMap;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused2) {
            HashSet hashSet2 = new HashSet();
            for (Map.Entry entry2 : getafterhoxuoee2.entrySet()) {
                if (collection.contains(entry2.getValue())) {
                    hashSet2.add(entry2.getKey());
                }
            }
            return ((getLambda641200809ui) getafterhoxuoee2.read).IconCompatParcelizer().retainAll(hashSet2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 2) {
            getAfterhoxUOeE getafterhoxuoee = (getAfterhoxUOeE) abstractMap;
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : getafterhoxuoee.entrySet()) {
                    if (FeatureFlagProvider.write(obj, entry.getValue())) {
                        getafterhoxuoee.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }
        if (i != 3) {
            return super.remove(obj);
        }
        getAfterhoxUOeE getafterhoxuoee2 = (getAfterhoxUOeE) abstractMap;
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused2) {
            for (Map.Entry entry2 : getafterhoxuoee2.entrySet()) {
                if (decodeInitialData.write(obj, entry2.getValue())) {
                    getafterhoxuoee2.remove(entry2.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 2) {
            return i != 3 ? super.contains(obj) : ((getAfterhoxUOeE) this.read).containsValue(obj);
        }
        return ((getAfterhoxUOeE) this.read).containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 2) {
            return i != 3 ? super.isEmpty() : ((getAfterhoxUOeE) this.read).isEmpty();
        }
        return ((getAfterhoxUOeE) this.read).isEmpty();
    }

    public /* synthetic */ getFillHeightannotations(AbstractMap abstractMap, int i, boolean z) {
        this.RemoteActionCompatParcelizer = i;
        this.read = abstractMap;
    }
}
