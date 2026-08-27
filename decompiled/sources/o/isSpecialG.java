package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class isSpecialG implements isPQishui_graphics {
    public final isHLGishui_graphics read;
    public Bitmap.Config serializer;
    public int write;

    @Override // o.isPQishui_graphics
    public final void RemoteActionCompatParcelizer() {
        this.read.RemoteActionCompatParcelizer(this);
    }

    public final void RemoteActionCompatParcelizer(int i, Bitmap.Config config) {
        this.write = i;
        this.serializer = config;
    }

    public final String toString() {
        return TransferParametersKt.serializer(this.write, this.serializer);
    }

    public isSpecialG(isHLGishui_graphics ishlgishui_graphics) {
        this.read = ishlgishui_graphics;
    }

    public final int hashCode() {
        int i = this.write;
        Bitmap.Config config = this.serializer;
        return (i * 31) + (config != null ? config.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isSpecialG)) {
            return false;
        }
        isSpecialG isspecialg = (isSpecialG) obj;
        return this.write == isspecialg.write && Fill.IconCompatParcelizer(this.serializer, isspecialg.serializer);
    }
}
