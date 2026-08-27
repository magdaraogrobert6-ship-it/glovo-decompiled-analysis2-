package o;

import android.database.ContentObserver;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyEvent extends ContentObserver {
    public final /* synthetic */ getKeyUpCS__XNY read;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        getKeyUpCS__XNY getkeyupcs__xny = this.read;
        synchronized (getkeyupcs__xny.MediaBrowserCompatMediaItem) {
            getkeyupcs__xny.MediaDescriptionCompat = null;
            getkeyupcs__xny.IconCompatParcelizer.run();
        }
        synchronized (getkeyupcs__xny) {
            Iterator it = getkeyupcs__xny.MediaMetadataCompat.iterator();
            if (it.hasNext()) {
                m1$$ExternalSyntheticOutline0.m(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyEvent(getKeyUpCS__XNY getkeyupcs__xny) {
        super(null);
        this.read = getkeyupcs__xny;
    }
}
