package o;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setDebounceMillis implements Runnable {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ NoWindowInsetsAnimation write;

    public /* synthetic */ setDebounceMillis(NoWindowInsetsAnimation noWindowInsetsAnimation, int i) {
        this.serializer = i;
        this.write = noWindowInsetsAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.serializer;
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        if (i == 0) {
            noWindowInsetsAnimation.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            return;
        }
        if (i == 1) {
            noWindowInsetsAnimation.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            return;
        }
        if (i != 2) {
            noWindowInsetsAnimation.MediaSessionCompatToken();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            setScopeCoordinates setscopecoordinates = lookaheadScopeKt.PlaybackStateCompatCustomAction;
            if (setscopecoordinates.read()) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            }
            LookaheadScopeImpl lookaheadScopeImpl = lookaheadScopeKt.ParcelableVolumeInfo;
            long jRemoteActionCompatParcelizer = lookaheadScopeImpl.RemoteActionCompatParcelizer();
            lookaheadScopeImpl.serializer(1 + jRemoteActionCompatParcelizer);
            if (jRemoteActionCompatParcelizer >= 5) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                setscopecoordinates.serializer(true);
                return;
            } else {
                if (noWindowInsetsAnimation.ComponentActivity == null) {
                    noWindowInsetsAnimation.ComponentActivity = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope221, 2);
                }
                noWindowInsetsAnimation.ComponentActivity.RemoteActionCompatParcelizer(0L);
                return;
            }
        }
        coil3.memory.MemoryCacheService memoryCacheService = noWindowInsetsAnimation.read;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        NoWindowInsetsAnimation noWindowInsetsAnimation2 = lookaheadScopeKtLookaheadScope222.ComponentActivity;
        LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope222.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        if (memoryCacheService.MediaMetadataCompat()) {
            if (memoryCacheService.MediaDescriptionCompat()) {
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                lookaheadScopeKt2.ComponentActivity.IconCompatParcelizer(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(com.adjust.sdk.Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                bundle.putLong("_cc", 1L);
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
                noWindowInsetsAnimation2.RemoteActionCompatParcelizer("auto", "_cmpx", bundle);
            } else {
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt2.ComponentActivity;
                String strRatingCompat = r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat();
                if (TextUtils.isEmpty(strRatingCompat)) {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.write.RemoteActionCompatParcelizer("Cache still valid but referrer not found");
                    str = null;
                } else {
                    long jRemoteActionCompatParcelizer2 = lookaheadScopeKt2.ResultReceiver.RemoteActionCompatParcelizer() / 3600000;
                    Uri uri = Uri.parse(strRatingCompat);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str2 : uri.getQueryParameterNames()) {
                        bundle2.putString(str2, uri.getQueryParameter(str2));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jRemoteActionCompatParcelizer2 - 1) * 3600000);
                    Object obj = pair.first;
                    String str3 = obj == null ? "app" : (String) obj;
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
                    noWindowInsetsAnimation2.RemoteActionCompatParcelizer(str3, "_cmp", (Bundle) pair.second);
                    str = null;
                }
                r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(str);
            }
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
            lookaheadScopeKt2.ResultReceiver.serializer(0L);
        }
    }
}
