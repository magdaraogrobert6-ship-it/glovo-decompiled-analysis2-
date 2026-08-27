package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class SVGParseException {
    public final byte[] data;
    public int limit;
    public SVGParseException next;
    public final boolean owner;
    public int pos;
    public SVGParseException prev;
    public boolean shared;

    public final SVGParseException serializer() {
        this.shared = true;
        return new SVGParseException(this.data, this.pos, this.limit, true, false);
    }

    public SVGParseException(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final void IconCompatParcelizer(SVGParseException sVGParseException) {
        sVGParseException.getClass();
        sVGParseException.prev = this;
        sVGParseException.next = this.next;
        SVGParseException sVGParseException2 = this.next;
        sVGParseException2.getClass();
        sVGParseException2.prev = sVGParseException;
        this.next = sVGParseException;
    }

    public final void RemoteActionCompatParcelizer(SVGParseException sVGParseException, int i) {
        sVGParseException.getClass();
        byte[] bArr = sVGParseException.data;
        if (!sVGParseException.owner) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("only owner can write");
            return;
        }
        int i2 = sVGParseException.limit;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sVGParseException.shared) {
                DrawableTransformation.write();
                return;
            }
            int i4 = sVGParseException.pos;
            if (i3 - i4 > 8192) {
                DrawableTransformation.write();
                return;
            } else {
                onContentCardClicked.IconCompatParcelizer(bArr, i4, bArr, i2, 2);
                sVGParseException.limit -= sVGParseException.pos;
                sVGParseException.pos = 0;
            }
        }
        int i5 = sVGParseException.limit;
        int i6 = this.pos;
        onContentCardClicked.write(this.data, i5, bArr, i6, i6 + i);
        sVGParseException.limit += i;
        this.pos += i;
    }

    public final SVGParseException read() {
        SVGParseException sVGParseException = this.next;
        if (sVGParseException == this) {
            sVGParseException = null;
        }
        SVGParseException sVGParseException2 = this.prev;
        sVGParseException2.getClass();
        sVGParseException2.next = this.next;
        SVGParseException sVGParseException3 = this.next;
        sVGParseException3.getClass();
        sVGParseException3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return sVGParseException;
    }

    public SVGParseException() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }
}
