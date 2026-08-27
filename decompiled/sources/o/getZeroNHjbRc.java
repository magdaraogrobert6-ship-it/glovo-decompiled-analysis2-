package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getZeroNHjbRc extends androidx.lifecycle.ViewModel {
    public static final getZeroNHjbRcannotations write = new getZeroNHjbRcannotations();
    public final boolean MediaDescriptionCompat;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public final HashMap IconCompatParcelizer = new HashMap();
    public final HashMap MediaBrowserCompatMediaItem = new HashMap();
    public boolean serializer = false;
    public boolean read = false;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            toString();
        }
        this.serializer = true;
    }

    public final void read(String str, boolean z) {
        div7Ah8Wj8.RemoteActionCompatParcelizer(3);
        RemoteActionCompatParcelizer(str, z);
    }

    public final void RemoteActionCompatParcelizer(String str, boolean z) {
        HashMap map = this.IconCompatParcelizer;
        getZeroNHjbRc getzeronhjbrc = (getZeroNHjbRc) map.get(str);
        if (getzeronhjbrc != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(getzeronhjbrc.IconCompatParcelizer.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    getzeronhjbrc.read((String) it.next(), true);
                }
            }
            getzeronhjbrc.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.MediaBrowserCompatMediaItem;
        getFilterQualityfv9h1I getfilterqualityfv9h1i = (getFilterQualityfv9h1I) map2.get(str);
        if (getfilterqualityfv9h1i != null) {
            getfilterqualityfv9h1i.read();
            map2.remove(str);
        }
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.MediaBrowserCompatMediaItem.hashCode() + ((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.RemoteActionCompatParcelizer.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.IconCompatParcelizer.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.MediaBrowserCompatMediaItem.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public getZeroNHjbRc(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final void IconCompatParcelizer(androidx.fragment.app.Fragment fragment) {
        if (this.read) {
            div7Ah8Wj8.RemoteActionCompatParcelizer(2);
        } else {
            if (this.RemoteActionCompatParcelizer.remove(fragment.getViewModelStore) == null || !div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                return;
            }
            fragment.toString();
        }
    }

    public final void write(androidx.fragment.app.Fragment fragment) {
        if (this.read) {
            div7Ah8Wj8.RemoteActionCompatParcelizer(2);
            return;
        }
        String str = fragment.getViewModelStore;
        HashMap map = this.RemoteActionCompatParcelizer;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.getViewModelStore, fragment);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getZeroNHjbRc.class != obj.getClass()) {
            return false;
        }
        getZeroNHjbRc getzeronhjbrc = (getZeroNHjbRc) obj;
        return this.RemoteActionCompatParcelizer.equals(getzeronhjbrc.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(getzeronhjbrc.IconCompatParcelizer) && this.MediaBrowserCompatMediaItem.equals(getzeronhjbrc.MediaBrowserCompatMediaItem);
    }
}
