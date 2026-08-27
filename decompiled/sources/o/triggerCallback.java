package o;

import android.os.Looper;
import coil3.Extras$Key;
import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public final class triggerCallback extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public final zzbv IconCompatParcelizer;
    public boolean RatingCompat;
    public getBackEK5gGoQ read;
    public final Extras$Key serializer;
    public final toAndroidRect write;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return false;
    }

    public final void MediaSessionCompatQueueItem() {
        MediaSessionCompatToken();
        if (this.read == null) {
            this.read = new getBackEK5gGoQ(Looper.getMainLooper(), 3);
        }
    }

    public triggerCallback(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.RatingCompat = true;
        this.serializer = new Extras$Key(25, this);
        this.write = new toAndroidRect(this);
        this.IconCompatParcelizer = new zzbv((Object) this, false, 7);
    }
}
