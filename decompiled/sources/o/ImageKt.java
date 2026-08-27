package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ImageKt extends processDragGesture implements Map {
    public Image read;
    public accessemitEnter serializer;
    public MutatorMutexmutateWith2 write;

    public ImageKt(ImageKt imageKt) {
        super(0);
        RemoteActionCompatParcelizer(imageKt);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        serializer(map.size() + this.MediaMetadataCompat);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final boolean write(Collection collection) {
        int i = this.MediaMetadataCompat;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.MediaMetadataCompat;
    }

    public final boolean read(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        accessemitEnter accessemitenter = this.serializer;
        if (accessemitenter != null) {
            return accessemitenter;
        }
        accessemitEnter accessemitenter2 = new accessemitEnter(this);
        this.serializer = accessemitenter2;
        return accessemitenter2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        Image image = this.read;
        if (image != null) {
            return image;
        }
        Image image2 = new Image(this);
        this.read = image2;
        return image2;
    }

    public final boolean serializer(Collection collection) {
        int i = this.MediaMetadataCompat;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(IconCompatParcelizer(i2))) {
                RemoteActionCompatParcelizer(i2);
            }
        }
        return i != this.MediaMetadataCompat;
    }

    @Override // java.util.Map
    public final Collection values() {
        MutatorMutexmutateWith2 mutatorMutexmutateWith2 = this.write;
        if (mutatorMutexmutateWith2 != null) {
            return mutatorMutexmutateWith2;
        }
        MutatorMutexmutateWith2 mutatorMutexmutateWith3 = new MutatorMutexmutateWith2(this);
        this.write = mutatorMutexmutateWith3;
        return mutatorMutexmutateWith3;
    }

    public ImageKt() {
        super(0);
    }

    public ImageKt(int i) {
        super(i);
    }
}
