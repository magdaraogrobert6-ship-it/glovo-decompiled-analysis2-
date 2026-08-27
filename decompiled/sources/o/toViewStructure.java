package o;

import io.reactivex.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class toViewStructure implements getAddressCountry {
    public final Object RemoteActionCompatParcelizer;
    public final AnchoredDraggableKt read = new AnchoredDraggableKt();
    public final ContentInViewNode IconCompatParcelizer = new ContentInViewNode();

    @Override // o.getAddressCountry
    public final Object getCurrent() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getAddressCountry
    public final void insertBottomUp(int i, Object obj) {
        AnchoredDraggableKt anchoredDraggableKt = this.read;
        anchoredDraggableKt.IconCompatParcelizer(5);
        anchoredDraggableKt.IconCompatParcelizer(i);
        this.IconCompatParcelizer.read(obj);
    }

    @Override // o.getAddressCountry
    public final void insertTopDown(int i, Object obj) {
        AnchoredDraggableKt anchoredDraggableKt = this.read;
        anchoredDraggableKt.IconCompatParcelizer(6);
        anchoredDraggableKt.IconCompatParcelizer(i);
        this.IconCompatParcelizer.read(obj);
    }

    @Override // o.getAddressCountry
    public final void move(int i, int i2, int i3) {
        AnchoredDraggableKt anchoredDraggableKt = this.read;
        anchoredDraggableKt.IconCompatParcelizer(3);
        anchoredDraggableKt.IconCompatParcelizer(i);
        anchoredDraggableKt.IconCompatParcelizer(i2);
        anchoredDraggableKt.IconCompatParcelizer(i3);
    }

    @Override // o.getAddressCountry
    public final void remove(int i, int i2) {
        AnchoredDraggableKt anchoredDraggableKt = this.read;
        anchoredDraggableKt.IconCompatParcelizer(2);
        anchoredDraggableKt.IconCompatParcelizer(i);
        anchoredDraggableKt.IconCompatParcelizer(i2);
    }

    public final void RemoteActionCompatParcelizer(getAddressCountry getaddresscountry, firstDescendantOrNull firstdescendantornull) {
        int i;
        Exception e;
        int i2;
        AnchoredDraggableKt anchoredDraggableKt = this.read;
        int i3 = anchoredDraggableKt.RemoteActionCompatParcelizer;
        ContentInViewNode contentInViewNode = new ContentInViewNode();
        getaddresscountry.onBeginChanges();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ContentInViewNode contentInViewNode2 = this.IconCompatParcelizer;
            if (i5 >= i3) {
                if (i4 != contentInViewNode2.IconCompatParcelizer) {
                    getCreditCardExpirationDay.read("Applier operation size mismatch");
                }
                contentInViewNode2.IconCompatParcelizer();
                anchoredDraggableKt.RemoteActionCompatParcelizer = 0;
                getaddresscountry.onEndChanges();
                return;
            }
            i = i5 + 1;
            try {
                try {
                    switch (anchoredDraggableKt.RemoteActionCompatParcelizer(i5)) {
                        case 0:
                            getaddresscountry.up();
                            i5 = i;
                            break;
                        case 1:
                            getaddresscountry.down(contentInViewNode2.RemoteActionCompatParcelizer(i4));
                            i4++;
                            i5 = i;
                            break;
                        case 2:
                            int i6 = i5 + 2;
                            i5 += 3;
                            getaddresscountry.remove(anchoredDraggableKt.RemoteActionCompatParcelizer(i), anchoredDraggableKt.RemoteActionCompatParcelizer(i6));
                            break;
                        case 3:
                            int i7 = i5 + 2;
                            try {
                                int i8 = i5 + 3;
                                try {
                                    i5 += 4;
                                    getaddresscountry.move(anchoredDraggableKt.RemoteActionCompatParcelizer(i), anchoredDraggableKt.RemoteActionCompatParcelizer(i7), anchoredDraggableKt.RemoteActionCompatParcelizer(i8));
                                } catch (Exception e2) {
                                    e = e2;
                                    i = i8;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i = i7;
                            }
                            break;
                        case 4:
                            getaddresscountry.clear();
                            i5 = i;
                            break;
                        case 5:
                            i5 += 2;
                            i2 = i4 + 1;
                            getaddresscountry.insertBottomUp(anchoredDraggableKt.RemoteActionCompatParcelizer(i), contentInViewNode2.RemoteActionCompatParcelizer(i4));
                            i4 = i2;
                            break;
                        case 6:
                            i5 += 2;
                            try {
                                i2 = i4 + 1;
                                getaddresscountry.insertTopDown(anchoredDraggableKt.RemoteActionCompatParcelizer(i), contentInViewNode2.RemoteActionCompatParcelizer(i4));
                                i4 = i2;
                            } catch (Exception e4) {
                                e = e4;
                                i = i5;
                            }
                            break;
                        case 7:
                            Object objRemoteActionCompatParcelizer = contentInViewNode2.RemoteActionCompatParcelizer(i4);
                            objRemoteActionCompatParcelizer.getClass();
                            pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, objRemoteActionCompatParcelizer}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
                            int i9 = i4 + 2;
                            getaddresscountry.IconCompatParcelizer((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objRemoteActionCompatParcelizer, contentInViewNode2.RemoteActionCompatParcelizer(i4 + 1));
                            i4 = i9;
                            i5 = i;
                            break;
                        case 8:
                            Object current = getaddresscountry.getCurrent();
                            if (current instanceof getAddressStreet) {
                                getAddressStreet getaddressstreet = (getAddressStreet) current;
                                if (((onCreateVirtualViewTranslationRequests) firstdescendantornull.write).RemoteActionCompatParcelizer(getaddressstreet)) {
                                    getaddressstreet.onDeactivate();
                                }
                            }
                            contentInViewNode.read(current);
                            getaddresscountry.reuse();
                            i5 = i;
                            break;
                        default:
                            i5 = i;
                            break;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th) {
                getaddresscountry.onEndChanges();
                throw th;
            }
            e = e4;
            i = i5;
            throw new androidx.compose.runtime.ComposePausableCompositionException(contentInViewNode2, contentInViewNode, anchoredDraggableKt, i - 1, e);
        }
    }

    @Override // o.getAddressCountry
    public final void IconCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj) {
        this.read.IconCompatParcelizer(7);
        ContentInViewNode contentInViewNode = this.IconCompatParcelizer;
        contentInViewNode.read(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        contentInViewNode.read(obj);
    }

    @Override // o.getAddressCountry
    public final void clear() {
        this.read.IconCompatParcelizer(4);
    }

    @Override // o.getAddressCountry
    public final void down(Object obj) {
        this.read.IconCompatParcelizer(1);
        this.IconCompatParcelizer.read(obj);
    }

    @Override // o.getAddressCountry
    public final void up() {
        this.read.IconCompatParcelizer(0);
    }

    public final void RemoteActionCompatParcelizer() {
        this.read.IconCompatParcelizer(9);
    }

    @Override // o.getAddressCountry
    public final void reuse() {
        this.read.IconCompatParcelizer(8);
    }

    public toViewStructure(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }
}
