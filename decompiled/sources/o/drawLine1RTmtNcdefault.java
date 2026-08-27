package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class drawLine1RTmtNcdefault extends rotateRadRg1IO4cdefault {
    public final long IconCompatParcelizer;
    public Bitmap read;
    public final int serializer;
    public final Handler write;

    @Override // o.rotateRadRg1IO4cdefault
    public final void write(Drawable drawable) {
        this.read = null;
    }

    @Override // o.rotateRadRg1IO4cdefault
    public final void IconCompatParcelizer(Object obj) {
        this.read = (Bitmap) obj;
        Handler handler = this.write;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.IconCompatParcelizer);
    }

    public drawLine1RTmtNcdefault(Handler handler, int i, long j) {
        this.write = handler;
        this.serializer = i;
        this.IconCompatParcelizer = j;
    }
}
