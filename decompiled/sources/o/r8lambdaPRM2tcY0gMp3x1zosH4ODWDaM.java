package o;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaPRM2tcY0gMp3x1zosH4ODWDaM extends ArrayList {
    public final /* synthetic */ r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE RemoteActionCompatParcelizer;

    public r8lambdaPRM2tcY0gMp3x1zosH4ODWDaM(r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE r8lambda82hocc3vgqgccaaps2recpeh8ye) {
        this.RemoteActionCompatParcelizer = r8lambda82hocc3vgqgccaaps2recpeh8ye;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        view.getClass();
        Iterator it = this.RemoteActionCompatParcelizer.write.iterator();
        while (it.hasNext()) {
            ((random_delegatelambda0) it.next()).serializer(view, true);
        }
        return super.add(view);
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

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = super.remove(i);
        objRemove.getClass();
        View view = (View) objRemove;
        Iterator it = this.RemoteActionCompatParcelizer.write.iterator();
        while (it.hasNext()) {
            ((random_delegatelambda0) it.next()).serializer(view, false);
        }
        return view;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }
}
