package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInViewNodelaunchAnimation21 extends awaitHorizontalPointerSlopOrCancellationgDDlDlE implements displayInAppMessagelambda11 {
    public final relocationOffsetfbGrOKE serializer;

    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.serializer.serializer(obj);
    }

    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection
    public final void clear() {
        this.serializer.serializer();
    }

    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new verifyOrientationStatuslambda0(this);
    }

    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.serializer.write(obj);
    }

    public ContentInViewNodelaunchAnimation21(relocationOffsetfbGrOKE relocationoffsetfbgroke) {
        super(relocationoffsetfbgroke);
        this.serializer = relocationoffsetfbgroke;
    }

    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.serializer;
        relocationoffsetfbgroke.getClass();
        int i = relocationoffsetfbgroke.write;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            relocationoffsetfbgroke.RemoteActionCompatParcelizer(it.next());
        }
        return i != relocationoffsetfbgroke.write;
    }

    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.serializer;
        relocationoffsetfbgroke.getClass();
        int i = relocationoffsetfbgroke.write;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            relocationoffsetfbgroke.read(it.next());
        }
        return i != relocationoffsetfbgroke.write;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:5:0x0017->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[EDGE_INSN: B:24:0x0059->B:18:0x0059 BREAK  A[LOOP:0: B:5:0x0017->B:17:0x0056], SYNTHETIC] */
    @Override // o.awaitHorizontalPointerSlopOrCancellationgDDlDlE, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.serializer;
        relocationoffsetfbgroke.getClass();
        Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
        int i = relocationoffsetfbgroke.write;
        long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!onContentCardDismissed.write(collection, objArr[i5])) {
                                relocationoffsetfbgroke.RemoteActionCompatParcelizer(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != relocationoffsetfbgroke.write;
    }
}
