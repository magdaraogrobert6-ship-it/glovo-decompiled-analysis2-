package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaPlccRZq9cp6b7Y9IHZu8w6Bc8w extends r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 {
    public final r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 IconCompatParcelizer;
    public r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw MediaBrowserCompatMediaItem;
    public int RemoteActionCompatParcelizer;
    public int read;

    public r8lambdaPlccRZq9cp6b7Y9IHZu8w6Bc8w(r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0, int i) {
        super(i, r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.read);
        this.IconCompatParcelizer = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0;
        this.RemoteActionCompatParcelizer = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.write();
        this.read = -1;
        write();
    }

    public final void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == this.IconCompatParcelizer.write()) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void write() {
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = this.IconCompatParcelizer;
        Object[] objArr = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.IconCompatParcelizer;
        if (objArr == null) {
            this.MediaBrowserCompatMediaItem = null;
            return;
        }
        int i = (r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.read - 1) & (-32);
        int i2 = this.serializer;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.serializer / 5) + 1;
        r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw r8lambdansjhjtxwqfruzzej6o8pq2689pw = this.MediaBrowserCompatMediaItem;
        if (r8lambdansjhjtxwqfruzzej6o8pq2689pw == null) {
            this.MediaBrowserCompatMediaItem = new r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw(objArr, i2, i, i3);
            return;
        }
        r8lambdansjhjtxwqfruzzej6o8pq2689pw.serializer = i2;
        r8lambdansjhjtxwqfruzzej6o8pq2689pw.write = i;
        r8lambdansjhjtxwqfruzzej6o8pq2689pw.read = i3;
        if (r8lambdansjhjtxwqfruzzej6o8pq2689pw.IconCompatParcelizer.length < i3) {
            r8lambdansjhjtxwqfruzzej6o8pq2689pw.IconCompatParcelizer = new Object[i3];
        }
        r8lambdansjhjtxwqfruzzej6o8pq2689pw.IconCompatParcelizer[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        r8lambdansjhjtxwqfruzzej6o8pq2689pw.RemoteActionCompatParcelizer = r6;
        r8lambdansjhjtxwqfruzzej6o8pq2689pw.write(i2 - r6, 1);
    }

    @Override // o.r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0, java.util.ListIterator
    public final void add(Object obj) {
        IconCompatParcelizer();
        int i = this.serializer;
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = this.IconCompatParcelizer;
        r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.add(i, obj);
        this.serializer++;
        this.write = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.write();
        this.read = -1;
        write();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        IconCompatParcelizer();
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        this.read = i;
        r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw r8lambdansjhjtxwqfruzzej6o8pq2689pw = this.MediaBrowserCompatMediaItem;
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = this.IconCompatParcelizer;
        if (r8lambdansjhjtxwqfruzzej6o8pq2689pw == null) {
            Object[] objArr = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.MediaBrowserCompatMediaItem;
            this.serializer = i + 1;
            return objArr[i];
        }
        if (r8lambdansjhjtxwqfruzzej6o8pq2689pw.hasNext()) {
            this.serializer++;
            return r8lambdansjhjtxwqfruzzej6o8pq2689pw.next();
        }
        Object[] objArr2 = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.MediaBrowserCompatMediaItem;
        int i2 = this.serializer;
        this.serializer = i2 + 1;
        return objArr2[i2 - r8lambdansjhjtxwqfruzzej6o8pq2689pw.write];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        IconCompatParcelizer();
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        int i2 = i - 1;
        this.read = i2;
        r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw r8lambdansjhjtxwqfruzzej6o8pq2689pw = this.MediaBrowserCompatMediaItem;
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = this.IconCompatParcelizer;
        if (r8lambdansjhjtxwqfruzzej6o8pq2689pw == null) {
            Object[] objArr = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.MediaBrowserCompatMediaItem;
            this.serializer = i2;
            return objArr[i2];
        }
        int i3 = r8lambdansjhjtxwqfruzzej6o8pq2689pw.write;
        if (i <= i3) {
            this.serializer = i2;
            return r8lambdansjhjtxwqfruzzej6o8pq2689pw.previous();
        }
        Object[] objArr2 = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.MediaBrowserCompatMediaItem;
        int i4 = i - 1;
        this.serializer = i4;
        return objArr2[i4 - i3];
    }

    @Override // o.r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        IconCompatParcelizer();
        int i = this.read;
        if (i == -1) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = this.IconCompatParcelizer;
        r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.IconCompatParcelizer(i);
        int i2 = this.read;
        if (i2 < this.serializer) {
            this.serializer = i2;
        }
        this.write = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.write();
        this.read = -1;
        write();
    }

    @Override // o.r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0, java.util.ListIterator
    public final void set(Object obj) {
        IconCompatParcelizer();
        int i = this.read;
        if (i == -1) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = this.IconCompatParcelizer;
        r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.set(i, obj);
        this.RemoteActionCompatParcelizer = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.write();
        write();
    }
}
