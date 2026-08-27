package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeChain implements Iterable {
    public final int serializer;
    public final long write;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CommonDomainCompanion(this);
    }

    public NodeChain(int i) {
        int i2 = i + 1;
        int iFloor = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
        this.serializer = iFloor;
        this.write = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i2);
    }
}
