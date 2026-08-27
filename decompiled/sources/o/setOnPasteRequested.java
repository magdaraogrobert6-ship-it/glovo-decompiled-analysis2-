package o;

import com.huawei.location.lite.common.util.NetworkUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class setOnPasteRequested implements Runnable {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setOnPasteRequested(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.read;
        if (i != 0) {
            setOnCopyRequested.IconCompatParcelizer().MediaDescriptionCompat = (setOnAutofillRequested) obj;
        } else {
            ((com.huawei.location.callback.d2) obj).serializer(onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read()), NetworkUtil.RemoteActionCompatParcelizer(placeAtf8xVGno.read()));
        }
    }
}
