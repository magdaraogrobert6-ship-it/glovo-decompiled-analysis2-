package o;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzpg;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class setMinDurationMs extends getOnGloballyPositioned {
    public final LookaheadScopeImpl IconCompatParcelizer;
    public final HashMap MediaMetadataCompat;
    public final LookaheadScopeImpl RatingCompat;
    public final LookaheadScopeImpl RemoteActionCompatParcelizer;
    public final LookaheadScopeImpl read;
    public final LookaheadScopeImpl serializer;
    public final LookaheadScopeImpl write;

    @Override // o.getOnGloballyPositioned
    public final void read() {
    }

    public final Pair serializer(String str) {
        setLastViewport setlastviewport;
        AdvertisingIdClient.Info advertisingIdInfo;
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        accessgettvinputcomposite1cp.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.MediaMetadataCompat;
        setLastViewport setlastviewport2 = (setLastViewport) map.get(str);
        if (setlastviewport2 != null && jElapsedRealtime < setlastviewport2.write) {
            return new Pair(setlastviewport2.serializer, Boolean.valueOf(setlastviewport2.IconCompatParcelizer));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer(str, premeasure0kLqBqw.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat);
            } catch (PackageManager.NameNotFoundException unused) {
                if (setlastviewport2 != null && jElapsedRealtime < setlastviewport2.write + setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer(str, premeasure0kLqBqw.onCreatePanelMenu)) {
                    return new Pair(setlastviewport2.serializer, Boolean.valueOf(setlastviewport2.IconCompatParcelizer));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            setlastviewport = id != null ? new setLastViewport(id, jRemoteActionCompatParcelizer, advertisingIdInfo.isLimitAdTrackingEnabled()) : new setLastViewport("", jRemoteActionCompatParcelizer, advertisingIdInfo.isLimitAdTrackingEnabled());
            map.put(str, setlastviewport);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(setlastviewport.serializer, Boolean.valueOf(setlastviewport.IconCompatParcelizer));
        } catch (Exception e) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatToken.serializer(e, "Unable to get advertising id");
            setlastviewport = new setLastViewport("", jRemoteActionCompatParcelizer, false);
        }
    }

    public setMinDurationMs(zzpg zzpgVar) {
        super(zzpgVar);
        this.MediaMetadataCompat = new HashMap();
        LookaheadScopeKt lookaheadScopeKt = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        this.IconCompatParcelizer = new LookaheadScopeImpl(lookaheadScopeKt, "last_delete_stale", 0L);
        LookaheadScopeKt lookaheadScopeKt2 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
        this.write = new LookaheadScopeImpl(lookaheadScopeKt2, "last_delete_stale_batch", 0L);
        LookaheadScopeKt lookaheadScopeKt3 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt3);
        this.serializer = new LookaheadScopeImpl(lookaheadScopeKt3, "backoff", 0L);
        LookaheadScopeKt lookaheadScopeKt4 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt4);
        this.read = new LookaheadScopeImpl(lookaheadScopeKt4, "last_upload", 0L);
        LookaheadScopeKt lookaheadScopeKt5 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt5);
        this.RemoteActionCompatParcelizer = new LookaheadScopeImpl(lookaheadScopeKt5, "last_upload_attempt", 0L);
        LookaheadScopeKt lookaheadScopeKt6 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt6);
        this.RatingCompat = new LookaheadScopeImpl(lookaheadScopeKt6, "midnight_offset", 0L);
    }

    public final String IconCompatParcelizer(String str, boolean z) {
        MediaSessionCompatToken();
        String str2 = z ? (String) serializer(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestSerializer = onLayoutRectChangeddefault.serializer();
        if (messageDigestSerializer == null) {
            return null;
        }
        return String.format(java.util.Locale.US, "%032X", new BigInteger(1, messageDigestSerializer.digest(str2.getBytes())));
    }
}
