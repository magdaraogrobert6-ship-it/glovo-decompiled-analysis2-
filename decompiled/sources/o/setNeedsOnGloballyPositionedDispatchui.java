package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setNeedsOnGloballyPositionedDispatchui extends setOnDetachui {
    public final int read;
    public final int serializer;

    @Override // o.setOnDetachui, o.setOnAttachui
    public final int IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.setOnDetachui
    public final int write() {
        return this.serializer;
    }

    @Override // o.setOnDetachui, o.setOnAttachui
    public final byte RemoteActionCompatParcelizer(int i) {
        int i2 = this.read;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.RatingCompat[this.serializer + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(c8$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(af$$ExternalSyntheticOutline0.m(i, "Index > length: ", i2, ", "));
    }

    @Override // o.setOnDetachui, o.setOnAttachui
    public final void serializer(int i, byte[] bArr) {
        System.arraycopy(this.RatingCompat, this.serializer, bArr, 0, i);
    }

    @Override // o.setOnDetachui, o.setOnAttachui
    public final byte IconCompatParcelizer(int i) {
        return this.RatingCompat[this.serializer + i];
    }

    public setNeedsOnGloballyPositionedDispatchui(byte[] bArr, int i, int i2) {
        super(bArr);
        setOnAttachui.IconCompatParcelizer(i, i + i2, bArr.length);
        this.serializer = i;
        this.read = i2;
    }
}
