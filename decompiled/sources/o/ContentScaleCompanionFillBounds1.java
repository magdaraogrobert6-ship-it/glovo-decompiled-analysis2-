package o;

import io.sentry.util.UrlUtils;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentScaleCompanionFillBounds1 extends getCrop {
    public final /* synthetic */ getFit write;

    public ContentScaleCompanionFillBounds1(getFit getfit) {
        this.write = getfit;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        getFit getfit = this.write;
        UrlUtils.write(i, getfit.write);
        int i2 = i + i;
        Object[] objArr = getfit.serializer;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write.write;
    }
}
