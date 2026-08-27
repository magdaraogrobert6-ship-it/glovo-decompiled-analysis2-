package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentScaleCompanionInside1 extends getCrop {
    public final transient int read;
    public final transient Object[] serializer;
    public final transient int write = 1;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    @Override // java.util.List
    public final Object get(int i) {
        UrlUtils.write(i, this.write);
        Object obj = this.serializer[i + i + this.read];
        obj.getClass();
        return obj;
    }

    public ContentScaleCompanionInside1(int i, Object[] objArr) {
        this.serializer = objArr;
        this.read = i;
    }
}
