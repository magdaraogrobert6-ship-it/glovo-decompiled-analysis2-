package o;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeHostDefaultProvider extends HandlerThread {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewTreeHostDefaultProvider(String str, int i) {
        super(str);
        this.IconCompatParcelizer = i;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        if (this.IconCompatParcelizer != 0) {
            super.onLooperPrepared();
        } else {
            super.onLooperPrepared();
        }
    }
}
