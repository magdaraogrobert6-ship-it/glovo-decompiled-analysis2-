package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda54BeH8ZsBru0CXI2CCSP2syNys extends ArrayList {
    public final /* synthetic */ r8lambda7IJBVrN0sHyidCAZufWEJFc7yY serializer;

    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys(r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy) {
        this.serializer = r8lambda7ijbvrn0shyidcazufwejfc7yy;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        view.getClass();
        Iterator it = this.serializer.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((write) it.next()).IconCompatParcelizer(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        for (write writeVar : this.serializer.IconCompatParcelizer) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                writeVar.IconCompatParcelizer((View) it.next(), true);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = super.remove(i);
        objRemove.getClass();
        View view = (View) objRemove;
        Iterator it = this.serializer.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((write) it.next()).IconCompatParcelizer(view, false);
        }
        return view;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }
}
