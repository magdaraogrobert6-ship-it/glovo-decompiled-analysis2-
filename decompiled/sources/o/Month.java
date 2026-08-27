package o;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Month implements Iterator {
    public int IconCompatParcelizer;
    public Iterator RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ AbstractMap write;

    public Month(GenderCompanion genderCompanion) {
        this.write = genderCompanion;
        this.IconCompatParcelizer = genderCompanion.RemoteActionCompatParcelizer.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.serializer;
        AbstractMap abstractMap = this.write;
        if (i != 0) {
            if (RemoteActionCompatParcelizer().hasNext()) {
                return (Map.Entry) RemoteActionCompatParcelizer().next();
            }
            List list = ((performSave) abstractMap).RemoteActionCompatParcelizer;
            int i2 = this.IconCompatParcelizer - 1;
            this.IconCompatParcelizer = i2;
            return (Map.Entry) list.get(i2);
        }
        if (IconCompatParcelizer().hasNext()) {
            return (Map.Entry) IconCompatParcelizer().next();
        }
        List list2 = ((GenderCompanion) abstractMap).RemoteActionCompatParcelizer;
        int i3 = this.IconCompatParcelizer - 1;
        this.IconCompatParcelizer = i3;
        return (Map.Entry) list2.get(i3);
    }

    public Iterator IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = ((GenderCompanion) this.write).MediaMetadataCompat.entrySet().iterator();
        }
        return this.RemoteActionCompatParcelizer;
    }

    public Iterator RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = ((performSave) this.write).MediaDescriptionCompat.entrySet().iterator();
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.serializer;
        AbstractMap abstractMap = this.write;
        if (i != 0) {
            int i2 = this.IconCompatParcelizer;
            return (i2 > 0 && i2 <= ((performSave) abstractMap).RemoteActionCompatParcelizer.size()) || RemoteActionCompatParcelizer().hasNext();
        }
        int i3 = this.IconCompatParcelizer;
        return (i3 > 0 && i3 <= ((GenderCompanion) abstractMap).RemoteActionCompatParcelizer.size()) || IconCompatParcelizer().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.serializer == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public Month(performSave performsave) {
        this.write = performsave;
        this.IconCompatParcelizer = performsave.RemoteActionCompatParcelizer.size();
    }
}
