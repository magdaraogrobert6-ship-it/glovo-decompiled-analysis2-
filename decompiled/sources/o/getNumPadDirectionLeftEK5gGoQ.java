package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadDirectionLeftEK5gGoQ implements Iterator {
    public final /* synthetic */ int IconCompatParcelizer;
    public Iterable serializer;
    public int write;

    public getNumPadDirectionLeftEK5gGoQ(getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq) {
        this.IconCompatParcelizer = 0;
        this.serializer = getnumpaddirectionupek5ggoq;
        this.write = 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.IconCompatParcelizer != 0) {
            accesstoPx0680j_4jd accesstopx0680j_4jd = (accesstoPx0680j_4jd) ((accesstoPxR2X_6ojd) this.serializer).RemoteActionCompatParcelizer.get(this.write);
            this.write++;
            return accesstopx0680j_4jd;
        }
        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq = (getNumPadDirectionUpEK5gGoQ) this.serializer;
        int i = this.write;
        int iMediaSessionCompatQueueItem = getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem();
        int i2 = this.write;
        if (i < iMediaSessionCompatQueueItem) {
            this.write = i2 + 1;
            return getnumpaddirectionupek5ggoq.IconCompatParcelizer(i2);
        }
        DrawableTransformation.write(d$$ExternalSyntheticOutline0.m(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.IconCompatParcelizer != 0) {
            return this.write < ((accesstoPxR2X_6ojd) this.serializer).RemoteActionCompatParcelizer.size();
        }
        return this.write < ((getNumPadDirectionUpEK5gGoQ) this.serializer).MediaSessionCompatQueueItem();
    }
}
