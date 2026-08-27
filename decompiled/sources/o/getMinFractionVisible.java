package o;

import com.google.android.gms.tasks.zzc;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class getMinFractionVisible implements Runnable {
    public final /* synthetic */ OnFirstVisibleNode RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ getViewportBounds serializer;

    public getMinFractionVisible(OnFirstVisibleNode onFirstVisibleNode, getViewportBounds getviewportbounds, long j) {
        this.serializer = getviewportbounds;
        this.read = j;
        Objects.requireNonNull(onFirstVisibleNode);
        this.RemoteActionCompatParcelizer = onFirstVisibleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.read;
        OnFirstVisibleNode onFirstVisibleNode = this.RemoteActionCompatParcelizer;
        onFirstVisibleNode.RemoteActionCompatParcelizer(this.serializer, false, j);
        onFirstVisibleNode.serializer = null;
        setViewportBounds setviewportboundsMediaDescriptionCompat = ((LookaheadScopeKtLookaheadScope221) onFirstVisibleNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
        setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
        setviewportboundsMediaDescriptionCompat.serializer();
        setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new zzc(setviewportboundsMediaDescriptionCompat, null));
    }
}
