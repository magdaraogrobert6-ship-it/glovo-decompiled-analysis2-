package o;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.tasks.zzc;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OnFirstVisibleNode extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public volatile getViewportBounds IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public getViewportBounds MediaDescriptionCompat;
    public zzdf MediaMetadataCompat;
    public volatile getViewportBounds MediaSessionCompatQueueItem;
    public final Object ParcelableVolumeInfo;
    public volatile boolean RatingCompat;
    public final ConcurrentHashMap read;
    public getViewportBounds serializer;
    public volatile getViewportBounds write;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return false;
    }

    public final void RemoteActionCompatParcelizer(getViewportBounds getviewportbounds, boolean z, long j) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getHasPremeasured gethaspremeasured = lookaheadScopeKtLookaheadScope221.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        gethaspremeasured.read(SystemClock.elapsedRealtime());
        boolean z2 = getviewportbounds != null && getviewportbounds.serializer;
        triggerCallback triggercallback = lookaheadScopeKtLookaheadScope221.MediaSessionCompatToken;
        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
        if (!triggercallback.write.RemoteActionCompatParcelizer(j, z2, z) || getviewportbounds == null) {
            return;
        }
        getviewportbounds.serializer = false;
    }

    public final void read(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.read.put(Integer.valueOf(zzdfVar.serializer), new getViewportBounds(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final getViewportBounds IconCompatParcelizer(zzdf zzdfVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.serializer);
        ConcurrentHashMap concurrentHashMap = this.read;
        getViewportBounds getviewportbounds = (getViewportBounds) concurrentHashMap.get(numValueOf);
        if (getviewportbounds == null) {
            String strIconCompatParcelizer = IconCompatParcelizer(zzdfVar.read);
            onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            getViewportBounds getviewportbounds2 = new getViewportBounds(null, strIconCompatParcelizer, onlayoutrectchangeddefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            concurrentHashMap.put(numValueOf, getviewportbounds2);
            getviewportbounds = getviewportbounds2;
        }
        return this.MediaSessionCompatQueueItem != null ? this.MediaSessionCompatQueueItem : getviewportbounds;
    }

    public final getViewportBounds IconCompatParcelizer(boolean z) {
        serializer();
        MediaSessionCompatToken();
        getViewportBounds getviewportbounds = this.serializer;
        return (z && getviewportbounds == null) ? this.MediaDescriptionCompat : getviewportbounds;
    }

    public final String IconCompatParcelizer(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        if (length > 0) {
            str2 = strArrSplit[length - 1];
        } else {
            str2 = "";
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int length2 = str2.length();
        lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
        if (length2 <= 500) {
            return str2;
        }
        lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
        return str2.substring(0, Constant.ERROR_UNKNOWN);
    }

    public final void write(String str, getViewportBounds getviewportbounds, boolean z) {
        getViewportBounds getviewportbounds2 = getviewportbounds;
        getViewportBounds getviewportbounds3 = this.IconCompatParcelizer == null ? this.write : this.IconCompatParcelizer;
        if (getviewportbounds2.write == null) {
            getviewportbounds2 = new getViewportBounds(getviewportbounds2.read, str != null ? IconCompatParcelizer(str) : null, getviewportbounds2.IconCompatParcelizer, getviewportbounds2.RemoteActionCompatParcelizer, getviewportbounds2.RatingCompat);
        }
        getViewportBounds getviewportbounds4 = getviewportbounds2;
        this.write = this.IconCompatParcelizer;
        this.IconCompatParcelizer = getviewportbounds4;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new getMinDurationMs(this, getviewportbounds4, getviewportbounds3, jElapsedRealtime, z));
    }

    public OnFirstVisibleNode(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.ParcelableVolumeInfo = new Object();
        this.read = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public final void read(getViewportBounds getviewportbounds, getViewportBounds getviewportbounds2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        boolean z3 = getviewportbounds.RemoteActionCompatParcelizer;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        boolean z4 = false;
        if (getviewportbounds2 != null) {
            if (getviewportbounds2.IconCompatParcelizer == getviewportbounds.IconCompatParcelizer && Objects.equals(getviewportbounds2.write, getviewportbounds.write) && Objects.equals(getviewportbounds2.read, getviewportbounds.read)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.serializer != null) {
            z4 = true;
        }
        if (z2) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            onLayoutRectChangeddefault.IconCompatParcelizer(getviewportbounds, bundle3, true);
            if (getviewportbounds2 != null) {
                String str2 = getviewportbounds2.read;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = getviewportbounds2.write;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", getviewportbounds2.IconCompatParcelizer);
            }
            if (z4) {
                triggerCallback triggercallback = lookaheadScopeKtLookaheadScope221.MediaSessionCompatToken;
                LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                toAndroidRect toandroidrect = triggercallback.write;
                long j2 = j - toandroidrect.write;
                toandroidrect.write = j;
                if (j2 > 0) {
                    onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    onlayoutrectchangeddefault.write(bundle3, j2);
                }
            }
            if (!lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != z3) {
                str = "auto";
            } else {
                str = "app";
            }
            String str4 = str;
            lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j3 = getviewportbounds.RatingCompat;
                if (j3 != 0) {
                    jCurrentTimeMillis = j3;
                }
            }
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.write(jCurrentTimeMillis, bundle3, str4, "_vs");
        }
        if (z4) {
            RemoteActionCompatParcelizer(this.serializer, true, j);
        }
        this.serializer = getviewportbounds;
        if (z3) {
            this.MediaDescriptionCompat = getviewportbounds;
        }
        setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
        setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
        setviewportboundsMediaDescriptionCompat.serializer();
        setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new zzc(setviewportboundsMediaDescriptionCompat, getviewportbounds));
    }
}
