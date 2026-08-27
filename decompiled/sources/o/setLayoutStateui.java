package o;

import com.google.android.gms.dynamite.zzj;
import com.google.android.play.core.appupdate.zzz;

/* JADX INFO: loaded from: classes2.dex */
public final class setLayoutStateui {
    public static final setLayoutStateui IconCompatParcelizer;
    public static final setLayoutStateui write;
    public final setDetachedFromParentLookaheadPlacementui RemoteActionCompatParcelizer;

    public setLayoutStateui(setDetachedFromParentLookaheadPassui setdetachedfromparentlookaheadpassui) {
        if (getLayoutNode.IconCompatParcelizer()) {
            this.RemoteActionCompatParcelizer = new setCoordinatesAccessedDuringPlacement(setdetachedfromparentlookaheadpassui, 0);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.RemoteActionCompatParcelizer = new zzz(setdetachedfromparentlookaheadpassui);
        } else {
            this.RemoteActionCompatParcelizer = new setCoordinatesAccessedDuringPlacement(setdetachedfromparentlookaheadpassui, 1);
        }
    }

    static {
        int i = 26;
        IconCompatParcelizer = new setLayoutStateui(new setRoundRectOutlineTNW_H78default(i));
        write = new setLayoutStateui(new accessgetWcp(i));
        new setLayoutStateui(new io.sentry.hints.PlaybackStateCompatCustomAction(i));
        new setLayoutStateui(new getIntentArrayWithConfiguredBackStacklambda4(i));
        new setLayoutStateui(new accessgetVcp(i));
        new setLayoutStateui(new zzj(i));
        new setLayoutStateui(new speculativeHit(i));
    }
}
