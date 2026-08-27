package o;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyEventTypeCompanion extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        isAltPressedZmokQxo.IconCompatParcelizer.incrementAndGet();
    }

    public KeyEventTypeCompanion(Handler handler) {
        super(handler);
    }
}
