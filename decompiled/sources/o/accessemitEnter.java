package o;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class accessemitEnter extends AbstractSet {
    public final /* synthetic */ ImageKt serializer;

    public accessemitEnter(ImageKt imageKt) {
        this.serializer = imageKt;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new MutatorMutexMutator(this.serializer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.serializer.MediaMetadataCompat;
    }
}
