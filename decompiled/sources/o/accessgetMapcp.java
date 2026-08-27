package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetMapcp implements Iterator {
    public Iterator IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ AbstractMap read;
    public int serializer;
    public boolean write;

    public /* synthetic */ accessgetMapcp(NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1) {
        this.RemoteActionCompatParcelizer = 2;
        Objects.requireNonNull(nestedScrollDispatcherdispatchPreFling1);
        this.read = nestedScrollDispatcherdispatchPreFling1;
        this.serializer = -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 0) {
            this.write = true;
            int i2 = this.serializer + 1;
            this.serializer = i2;
            GenderCompanion genderCompanion = (GenderCompanion) abstractMap;
            return i2 < genderCompanion.RemoteActionCompatParcelizer.size() ? (Map.Entry) genderCompanion.RemoteActionCompatParcelizer.get(this.serializer) : (Map.Entry) RemoteActionCompatParcelizer().next();
        }
        if (i == 1) {
            this.write = true;
            int i3 = this.serializer + 1;
            this.serializer = i3;
            getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations = (getDualFloatInfinityBaseannotations) abstractMap;
            return i3 < getdualfloatinfinitybaseannotations.serializer.size() ? (Map.Entry) getdualfloatinfinitybaseannotations.serializer.get(this.serializer) : (Map.Entry) read().next();
        }
        if (i != 2) {
            this.write = true;
            int i4 = this.serializer + 1;
            this.serializer = i4;
            performSave performsave = (performSave) abstractMap;
            return i4 < performsave.RemoteActionCompatParcelizer.size() ? (Map.Entry) performsave.RemoteActionCompatParcelizer.get(this.serializer) : (Map.Entry) read().next();
        }
        this.write = true;
        int i5 = this.serializer + 1;
        this.serializer = i5;
        NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1 = (NestedScrollDispatcherdispatchPreFling1) abstractMap;
        return i5 < nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer ? (NestedScrollElement) nestedScrollDispatcherdispatchPreFling1.read[i5] : (Map.Entry) write().next();
    }

    public Iterator read() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i != 1) {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = ((performSave) abstractMap).MediaBrowserCompatMediaItem.entrySet().iterator();
            }
            return this.IconCompatParcelizer;
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = ((getDualFloatInfinityBaseannotations) abstractMap).MediaMetadataCompat.entrySet().iterator();
        }
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 0) {
            GenderCompanion genderCompanion = (GenderCompanion) abstractMap;
            if (this.serializer + 1 >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                return !genderCompanion.read.isEmpty() && RemoteActionCompatParcelizer().hasNext();
            }
            return true;
        }
        if (i == 1) {
            getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations = (getDualFloatInfinityBaseannotations) abstractMap;
            if (this.serializer + 1 >= getdualfloatinfinitybaseannotations.serializer.size()) {
                return !getdualfloatinfinitybaseannotations.MediaMetadataCompat.isEmpty() && read().hasNext();
            }
            return true;
        }
        if (i != 2) {
            performSave performsave = (performSave) abstractMap;
            if (this.serializer + 1 >= performsave.RemoteActionCompatParcelizer.size()) {
                return !performsave.MediaBrowserCompatMediaItem.isEmpty() && read().hasNext();
            }
            return true;
        }
        NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1 = (NestedScrollDispatcherdispatchPreFling1) abstractMap;
        if (this.serializer + 1 >= nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer) {
            return !nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer.isEmpty() && write().hasNext();
        }
        return true;
    }

    public Iterator RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = ((GenderCompanion) this.read).read.entrySet().iterator();
        }
        return this.IconCompatParcelizer;
    }

    public Iterator write() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = ((NestedScrollDispatcherdispatchPreFling1) this.read).IconCompatParcelizer.entrySet().iterator();
        }
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.read;
        if (i == 0) {
            GenderCompanion genderCompanion = (GenderCompanion) abstractMap;
            if (!this.write) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("remove() was called before next()");
                return;
            }
            this.write = false;
            int i2 = GenderCompanion.write;
            genderCompanion.IconCompatParcelizer();
            if (this.serializer >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                RemoteActionCompatParcelizer().remove();
                return;
            }
            int i3 = this.serializer;
            this.serializer = i3 - 1;
            genderCompanion.serializer(i3);
            return;
        }
        if (i == 1) {
            getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations = (getDualFloatInfinityBaseannotations) abstractMap;
            if (!this.write) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("remove() was called before next()");
                return;
            }
            this.write = false;
            int i4 = getDualFloatInfinityBaseannotations.IconCompatParcelizer;
            getdualfloatinfinitybaseannotations.IconCompatParcelizer();
            if (this.serializer >= getdualfloatinfinitybaseannotations.serializer.size()) {
                read().remove();
                return;
            }
            int i5 = this.serializer;
            this.serializer = i5 - 1;
            getdualfloatinfinitybaseannotations.read(i5);
            return;
        }
        if (i == 2) {
            if (!this.write) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("remove() was called before next()");
                return;
            }
            this.write = false;
            NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1 = (NestedScrollDispatcherdispatchPreFling1) abstractMap;
            nestedScrollDispatcherdispatchPreFling1.write();
            int i6 = this.serializer;
            if (i6 >= nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer) {
                write().remove();
                return;
            } else {
                this.serializer = i6 - 1;
                nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer(i6);
                return;
            }
        }
        performSave performsave = (performSave) abstractMap;
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("remove() was called before next()");
            return;
        }
        this.write = false;
        int i7 = performSave.write;
        performsave.RemoteActionCompatParcelizer();
        if (this.serializer >= performsave.RemoteActionCompatParcelizer.size()) {
            read().remove();
            return;
        }
        int i8 = this.serializer;
        this.serializer = i8 - 1;
        performsave.IconCompatParcelizer(i8);
    }

    public /* synthetic */ accessgetMapcp(AbstractMap abstractMap, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = abstractMap;
        this.serializer = -1;
    }
}
