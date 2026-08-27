package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getAfterhoxUOeE extends AbstractMap {
    public transient AbstractSet IconCompatParcelizer;
    public transient AbstractCollection RemoteActionCompatParcelizer;
    public final /* synthetic */ Serializable read;
    public final /* synthetic */ int serializer;
    public final transient Map write;

    public /* synthetic */ getAfterhoxUOeE(Serializable serializable, Map map, int i) {
        this.serializer = i;
        this.read = serializable;
        this.write = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = this.serializer;
        Map map = this.write;
        Serializable serializable = this.read;
        if (i != 0) {
            getPointerIconService getpointericonservice = (getPointerIconService) serializable;
            if (map != getpointericonservice.IconCompatParcelizer) {
                findOverridingAncestorNode findoverridingancestornode = new findOverridingAncestorNode(this);
                while (findoverridingancestornode.hasNext()) {
                    findoverridingancestornode.next();
                    findoverridingancestornode.remove();
                }
                return;
            }
            HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 = getpointericonservice.IconCompatParcelizer;
            Iterator it = hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.values().iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).clear();
            }
            hoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1.clear();
            return;
        }
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) serializable;
        getFillWidthannotations getfillwidthannotations = getlambda641200809ui.serializer;
        if (map != getfillwidthannotations) {
            getLefthoxUOeE getlefthoxuoee = new getLefthoxUOeE(this);
            while (getlefthoxuoee.hasNext()) {
                getlefthoxuoee.next();
                getlefthoxuoee.remove();
            }
            return;
        }
        Iterator it2 = getfillwidthannotations.values().iterator();
        while (it2.hasNext()) {
            ((Collection) it2.next()).clear();
        }
        getfillwidthannotations.clear();
        getlambda641200809ui.read = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.serializer;
        Serializable serializable = this.read;
        Map map = this.write;
        if (i != 0) {
            map.getClass();
            try {
                obj3 = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                obj3 = null;
            }
            Collection collection = (Collection) obj3;
            if (collection == null) {
                return null;
            }
            getPointerIconService getpointericonservice = (getPointerIconService) serializable;
            getpointericonservice.getClass();
            List list = (List) collection;
            return list instanceof RandomAccess ? new getTouchBoundsExpansionRZrCHBk(getpointericonservice, obj, list, null) : new getBeyondBoundsLayout(getpointericonservice, obj, list, (getBeyondBoundsLayout) null);
        }
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused2) {
            obj2 = null;
        }
        Collection collection2 = (Collection) obj2;
        if (collection2 == null) {
            return null;
        }
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) serializable;
        getlambda641200809ui.getClass();
        List list2 = (List) collection2;
        return list2 instanceof RandomAccess ? new BeyondBoundsLayoutProviderModifierNode(getlambda641200809ui, obj, list2, null) : new getBeyondBoundsLayout(getlambda641200809ui, obj, list2, (getBeyondBoundsLayout) null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        int i = this.serializer;
        Serializable serializable = this.read;
        if (i != 0) {
            return ((getPointerIconService) serializable).read();
        }
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) serializable;
        getAbovehoxUOeE getabovehoxuoee = getlambda641200809ui.IconCompatParcelizer;
        if (getabovehoxuoee != null) {
            return getabovehoxuoee;
        }
        getAbovehoxUOeE getabovehoxuoee2 = new getAbovehoxUOeE(getlambda641200809ui, getlambda641200809ui.serializer);
        getlambda641200809ui.IconCompatParcelizer = getabovehoxuoee2;
        return getabovehoxuoee2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.serializer;
        Map map = this.write;
        if (i != 0) {
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused2) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        int i = this.serializer;
        Map map = this.write;
        Serializable serializable = this.read;
        if (i != 0) {
            getPointerIconService getpointericonservice = (getPointerIconService) serializable;
            Collection collection = (Collection) map.remove(obj);
            if (collection == null) {
                return null;
            }
            getpointericonservice.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.addAll(collection);
            collection.size();
            collection.clear();
            return arrayList;
        }
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) serializable;
        Collection collection2 = (Collection) map.remove(obj);
        if (collection2 == null) {
            return null;
        }
        getlambda641200809ui.getClass();
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.addAll(collection2);
        getlambda641200809ui.read -= collection2.size();
        collection2.clear();
        return arrayList2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.serializer != 0) {
            onExit onexit = (onExit) this.IconCompatParcelizer;
            if (onexit != null) {
                return onexit;
            }
            onExit onexit2 = new onExit(this);
            this.IconCompatParcelizer = onexit2;
            return onexit2;
        }
        getBelowhoxUOeE getbelowhoxuoee = (getBelowhoxUOeE) this.IconCompatParcelizer;
        if (getbelowhoxuoee != null) {
            return getbelowhoxuoee;
        }
        getBelowhoxUOeE getbelowhoxuoee2 = new getBelowhoxUOeE(this);
        this.IconCompatParcelizer = getbelowhoxuoee2;
        return getbelowhoxuoee2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.serializer != 0 ? this.write.hashCode() : this.write.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.serializer != 0 ? this.write.size() : this.write.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.serializer != 0 ? this.write.toString() : this.write.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        boolean z = false;
        if (this.serializer != 0) {
            getFillHeightannotations getfillheightannotations = (getFillHeightannotations) this.RemoteActionCompatParcelizer;
            if (getfillheightannotations != null) {
                return getfillheightannotations;
            }
            getFillHeightannotations getfillheightannotations2 = new getFillHeightannotations(this, 2, z);
            this.RemoteActionCompatParcelizer = getfillheightannotations2;
            return getfillheightannotations2;
        }
        getFillHeightannotations getfillheightannotations3 = (getFillHeightannotations) this.RemoteActionCompatParcelizer;
        if (getfillheightannotations3 != null) {
            return getfillheightannotations3;
        }
        getFillHeightannotations getfillheightannotations4 = new getFillHeightannotations(this, 3, z);
        this.RemoteActionCompatParcelizer = getfillheightannotations4;
        return getfillheightannotations4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this.serializer != 0) {
            return this == obj || this.write.equals(obj);
        }
        return this == obj || this.write.equals(obj);
    }
}
