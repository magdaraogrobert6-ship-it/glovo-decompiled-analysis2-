package o;

import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateMetadataToJsonlambda4<T> implements Iterator<T> {
    private int RemoteActionCompatParcelizer = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer == 0;
    }

    public abstract Pair write();

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            return null;
        }
        this.RemoteActionCompatParcelizer++;
        return (T) write();
    }
}
