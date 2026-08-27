package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class MeasuringIntrinsics implements Runnable {
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ NoWindowInsetsAnimation read;

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // java.lang.Runnable
    public final void run() {
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.read;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        boolean zWrite = lookaheadScopeKtLookaheadScope221.write();
        boolean z = lookaheadScopeKtLookaheadScope221.IconCompatParcelizer != null && lookaheadScopeKtLookaheadScope221.IconCompatParcelizer.booleanValue();
        boolean z2 = this.RemoteActionCompatParcelizer;
        lookaheadScopeKtLookaheadScope221.IconCompatParcelizer = Boolean.valueOf(z2);
        if (z == z2) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(Boolean.valueOf(z2), "Default data collection state already set to");
        }
        if (lookaheadScopeKtLookaheadScope221.write() != zWrite) {
            if (lookaheadScopeKtLookaheadScope221.write() != (lookaheadScopeKtLookaheadScope221.IconCompatParcelizer != null && lookaheadScopeKtLookaheadScope221.IconCompatParcelizer.booleanValue())) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.RatingCompat.serializer("Default data collection is different than actual status", Boolean.valueOf(z2), Boolean.valueOf(zWrite));
            }
        } else {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.RatingCompat.serializer("Default data collection is different than actual status", Boolean.valueOf(z2), Boolean.valueOf(zWrite));
        }
        noWindowInsetsAnimation.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
    }

    public MeasuringIntrinsics(NoWindowInsetsAnimation noWindowInsetsAnimation, boolean z) {
        this.RemoteActionCompatParcelizer = z;
        Objects.requireNonNull(noWindowInsetsAnimation);
        this.read = noWindowInsetsAnimation;
    }
}
