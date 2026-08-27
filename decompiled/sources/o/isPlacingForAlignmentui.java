package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class isPlacingForAlignmentui implements AbstractComposeViewExternalSyntheticLambda0 {
    public volatile Set read;
    public volatile Set serializer;

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        if (this.read == null) {
            synchronized (this) {
                if (this.read == null) {
                    this.read = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator it = this.serializer.iterator();
                        while (it.hasNext()) {
                            this.read.add(((AbstractComposeViewExternalSyntheticLambda0) it.next()).write());
                        }
                        this.serializer = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.read);
    }
}
