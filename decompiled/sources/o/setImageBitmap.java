package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class setImageBitmap extends getTextClassifier implements Iterator {
    public getSupportImageTintMode RemoteActionCompatParcelizer;
    public getSupportImageTintMode read;

    public abstract getSupportImageTintMode IconCompatParcelizer(getSupportImageTintMode getsupportimagetintmode);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read != null;
    }

    public abstract getSupportImageTintMode serializer(getSupportImageTintMode getsupportimagetintmode);

    @Override // java.util.Iterator
    public final Object next() {
        getSupportImageTintMode getsupportimagetintmode = this.read;
        getSupportImageTintMode getsupportimagetintmode2 = this.RemoteActionCompatParcelizer;
        this.read = (getsupportimagetintmode == getsupportimagetintmode2 || getsupportimagetintmode2 == null) ? null : IconCompatParcelizer(getsupportimagetintmode);
        return getsupportimagetintmode;
    }

    public setImageBitmap(getSupportImageTintMode getsupportimagetintmode, getSupportImageTintMode getsupportimagetintmode2) {
        this.RemoteActionCompatParcelizer = getsupportimagetintmode2;
        this.read = getsupportimagetintmode;
    }

    @Override // o.getTextClassifier
    public final void a_(getSupportImageTintMode getsupportimagetintmode) {
        getSupportImageTintMode getsupportimagetintmodeIconCompatParcelizer = null;
        if (this.RemoteActionCompatParcelizer == getsupportimagetintmode && getsupportimagetintmode == this.read) {
            this.read = null;
            this.RemoteActionCompatParcelizer = null;
        }
        getSupportImageTintMode getsupportimagetintmode2 = this.RemoteActionCompatParcelizer;
        if (getsupportimagetintmode2 == getsupportimagetintmode) {
            this.RemoteActionCompatParcelizer = serializer(getsupportimagetintmode2);
        }
        getSupportImageTintMode getsupportimagetintmode3 = this.read;
        if (getsupportimagetintmode3 == getsupportimagetintmode) {
            getSupportImageTintMode getsupportimagetintmode4 = this.RemoteActionCompatParcelizer;
            if (getsupportimagetintmode3 != getsupportimagetintmode4 && getsupportimagetintmode4 != null) {
                getsupportimagetintmodeIconCompatParcelizer = IconCompatParcelizer(getsupportimagetintmode3);
            }
            this.read = getsupportimagetintmodeIconCompatParcelizer;
        }
    }
}
