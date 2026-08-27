package o;

import android.annotation.SuppressLint;
import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4 implements Iterator<Object> {
    public static int MediaMetadataCompat;
    public static int MediaSessionCompatQueueItem;
    final /* synthetic */ r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 MediaDescriptionCompat;
    Object RemoteActionCompatParcelizer;
    final int serializer;
    final int write;
    int IconCompatParcelizer = 0;
    int read = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !read();
    }

    @SuppressLint
    private boolean read() {
        r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4 = this.MediaDescriptionCompat;
        int i = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        int i3 = this.write;
        if (i3 == i && i2 == r8lambdaid4jozuplgwksgkjox8hlmlmsd4.write) {
            return this.read == i3 && this.IconCompatParcelizer == i2;
        }
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i3, "curBlockIndex=", ", mCurBlockIndex=");
        sbM.append(r8lambdaid4jozuplgwksgkjox8hlmlmsd4.RemoteActionCompatParcelizer);
        sbM.append(", curBlockOffset=");
        sbM.append(i2);
        sbM.append(", mCurBlockOffset=");
        sbM.append(r8lambdaid4jozuplgwksgkjox8hlmlmsd4.write);
        throw new ConcurrentModificationException(sbM.toString());
    }

    public r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4(r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4) {
        this.MediaDescriptionCompat = r8lambdaid4jozuplgwksgkjox8hlmlmsd4;
        this.write = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.RemoteActionCompatParcelizer;
        this.serializer = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.write;
        ArrayList<Object> arrayList = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = arrayList.size() > 0 ? arrayList.get(0) : null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        if (read()) {
            return null;
        }
        Object obj = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4 = this.MediaDescriptionCompat;
        Object obj2 = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.read(obj, i2);
        int i3 = this.IconCompatParcelizer + 1;
        this.IconCompatParcelizer = i3;
        if (i3 == r8lambdaid4jozuplgwksgkjox8hlmlmsd4.serializer && (i = this.read) < this.write) {
            this.IconCompatParcelizer = 0;
            int i4 = i + 1;
            this.read = i4;
            this.RemoteActionCompatParcelizer = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.IconCompatParcelizer.get(i4);
        }
        return obj2;
    }

    public static int serializer() {
        int i = MediaMetadataCompat;
        int i2 = i % 9658708;
        MediaMetadataCompat = i + 1;
        if (i2 != 0) {
            return MediaSessionCompatQueueItem;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        MediaSessionCompatQueueItem = i3;
        return i3;
    }
}
