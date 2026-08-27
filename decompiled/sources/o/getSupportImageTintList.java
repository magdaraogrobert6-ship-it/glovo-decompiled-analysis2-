package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportImageTintList extends getTextClassifier implements Iterator {
    public final /* synthetic */ getSuperCaller RemoteActionCompatParcelizer;
    public boolean read = true;
    public getSupportImageTintMode write;

    public getSupportImageTintList(getSuperCaller getsupercaller) {
        this.RemoteActionCompatParcelizer = getsupercaller;
    }

    @Override // o.getTextClassifier
    public final void a_(getSupportImageTintMode getsupportimagetintmode) {
        getSupportImageTintMode getsupportimagetintmode2 = this.write;
        if (getsupportimagetintmode == getsupportimagetintmode2) {
            getSupportImageTintMode getsupportimagetintmode3 = getsupportimagetintmode2.read;
            this.write = getsupportimagetintmode3;
            this.read = getsupportimagetintmode3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.read) {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer != null;
        }
        getSupportImageTintMode getsupportimagetintmode = this.write;
        return (getsupportimagetintmode == null || getsupportimagetintmode.RemoteActionCompatParcelizer == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.read) {
            this.read = false;
            this.write = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        } else {
            getSupportImageTintMode getsupportimagetintmode = this.write;
            this.write = getsupportimagetintmode != null ? getsupportimagetintmode.RemoteActionCompatParcelizer : null;
        }
        return this.write;
    }
}
