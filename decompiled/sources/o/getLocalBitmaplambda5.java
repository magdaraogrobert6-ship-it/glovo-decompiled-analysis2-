package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmaplambda5 extends AbstractSet {
    public final /* synthetic */ int read;
    public final /* synthetic */ getLocalBitmaplambda7 write;

    public /* synthetic */ getLocalBitmaplambda5(getLocalBitmaplambda7 getlocalbitmaplambda7, int i) {
        this.read = i;
        this.write = getlocalbitmaplambda7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.read;
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.write;
        if (i != 0) {
            getlocalbitmaplambda7.clear();
        } else {
            getlocalbitmaplambda7.clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer;
        Object obj2;
        Object value;
        int i = this.read;
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.write;
        if (i == 0) {
            return getlocalbitmaplambda7.containsKey(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        getLocalBitmaplambda8 getlocalbitmaplambda8 = null;
        if (key != null) {
            try {
                getlocalbitmaplambda8IconCompatParcelizer = getlocalbitmaplambda7.IconCompatParcelizer(key, false);
            } catch (ClassCastException unused) {
                getlocalbitmaplambda8IconCompatParcelizer = null;
            }
        } else {
            getlocalbitmaplambda8IconCompatParcelizer = null;
        }
        if (getlocalbitmaplambda8IconCompatParcelizer != null && ((obj2 = getlocalbitmaplambda8IconCompatParcelizer.MediaSessionCompatQueueItem) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
            getlocalbitmaplambda8 = getlocalbitmaplambda8IconCompatParcelizer;
        }
        return getlocalbitmaplambda8 != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.read;
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.write;
        return i != 0 ? new getPixelsFromDensityAndDp(getlocalbitmaplambda7, 1) : new getPixelsFromDensityAndDp(getlocalbitmaplambda7, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.read;
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.write;
        return i != 0 ? getlocalbitmaplambda7.MediaBrowserCompatMediaItem : getlocalbitmaplambda7.MediaBrowserCompatMediaItem;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer;
        Object obj2;
        Object value;
        int i = this.read;
        getLocalBitmaplambda7 getlocalbitmaplambda7 = this.write;
        getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer2 = null;
        if (i == 0) {
            if (obj != null) {
                try {
                    getlocalbitmaplambda8IconCompatParcelizer2 = getlocalbitmaplambda7.IconCompatParcelizer(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (getlocalbitmaplambda8IconCompatParcelizer2 != null) {
                getlocalbitmaplambda7.RemoteActionCompatParcelizer(getlocalbitmaplambda8IconCompatParcelizer2, true);
            }
            return getlocalbitmaplambda8IconCompatParcelizer2 != null;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (key != null) {
                try {
                    getlocalbitmaplambda8IconCompatParcelizer = getlocalbitmaplambda7.IconCompatParcelizer(key, false);
                } catch (ClassCastException unused2) {
                    getlocalbitmaplambda8IconCompatParcelizer = null;
                }
            } else {
                getlocalbitmaplambda8IconCompatParcelizer = null;
            }
            if (getlocalbitmaplambda8IconCompatParcelizer != null && ((obj2 = getlocalbitmaplambda8IconCompatParcelizer.MediaSessionCompatQueueItem) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                getlocalbitmaplambda8IconCompatParcelizer2 = getlocalbitmaplambda8IconCompatParcelizer;
            }
            if (getlocalbitmaplambda8IconCompatParcelizer2 != null) {
                getlocalbitmaplambda7.RemoteActionCompatParcelizer(getlocalbitmaplambda8IconCompatParcelizer2, true);
                return true;
            }
        }
        return false;
    }
}
