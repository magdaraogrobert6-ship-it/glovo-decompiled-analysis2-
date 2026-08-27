package o;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.stats.zza;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OnFirstVisibleNodestartTimer1 implements Runnable {
    public final /* synthetic */ zzbv IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long write;

    @Override // java.lang.Runnable
    public final void run() {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) ((triggerCallback) this.IconCompatParcelizer.RemoteActionCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new zza(22, this));
    }

    public OnFirstVisibleNodestartTimer1(zzbv zzbvVar, long j, long j2) {
        Objects.requireNonNull(zzbvVar);
        this.IconCompatParcelizer = zzbvVar;
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
    }
}
