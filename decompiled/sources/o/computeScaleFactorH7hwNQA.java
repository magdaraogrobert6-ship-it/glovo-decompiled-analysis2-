package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class computeScaleFactorH7hwNQA implements Iterator {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getFillWidthannotations MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ getFillWidthannotations serializer;
    public int write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write >= 0;
    }

    public computeScaleFactorH7hwNQA(getFillWidthannotations getfillwidthannotations, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = getfillwidthannotations;
        this.MediaMetadataCompat = getfillwidthannotations;
        this.read = getfillwidthannotations.RatingCompat;
        this.write = getfillwidthannotations.isEmpty() ? -1 : 0;
        this.RemoteActionCompatParcelizer = -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object contentScale;
        getFillWidthannotations getfillwidthannotations = this.MediaMetadataCompat;
        if (getfillwidthannotations.RatingCompat != this.read) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write;
        this.RemoteActionCompatParcelizer = i;
        int i2 = this.IconCompatParcelizer;
        getFillWidthannotations getfillwidthannotations2 = this.serializer;
        if (i2 == 0) {
            Object[] objArr = getfillwidthannotations2.read;
            objArr.getClass();
            contentScale = objArr[i];
        } else if (i2 != 1) {
            Object[] objArr2 = getfillwidthannotations2.serializer;
            objArr2.getClass();
            contentScale = objArr2[i];
        } else {
            contentScale = new ContentScale(getfillwidthannotations2, i);
        }
        int i3 = this.write + 1;
        if (i3 >= getfillwidthannotations.MediaDescriptionCompat) {
            i3 = -1;
        }
        this.write = i3;
        return contentScale;
    }

    @Override // java.util.Iterator
    public final void remove() {
        getFillWidthannotations getfillwidthannotations = this.MediaMetadataCompat;
        int i = getfillwidthannotations.RatingCompat;
        int i2 = this.read;
        if (i != i2) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no calls to next() since the last call to remove()");
            return;
        }
        this.read = i2 + 32;
        Object[] objArr = getfillwidthannotations.read;
        objArr.getClass();
        getfillwidthannotations.remove(objArr[i3]);
        this.write--;
        this.RemoteActionCompatParcelizer = -1;
    }
}
