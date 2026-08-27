package o;

import coil3.Extras$Key;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class OnFirstVisibleNodeupdateViewport1 implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ triggerCallback write;

    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        triggerCallback triggercallback = this.write;
        if (i != 0) {
            triggercallback.MediaSessionCompatToken();
            triggercallback.MediaSessionCompatQueueItem();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
            long j = this.serializer;
            zzgsVar.serializer(Long.valueOf(j), "Activity paused, time");
            zzbv zzbvVar = triggercallback.IconCompatParcelizer;
            triggerCallback triggercallback2 = (triggerCallback) zzbvVar.RemoteActionCompatParcelizer;
            ((LookaheadScopeKtLookaheadScope221) triggercallback2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            OnFirstVisibleNodestartTimer1 onFirstVisibleNodestartTimer1 = new OnFirstVisibleNodestartTimer1(zzbvVar, System.currentTimeMillis(), j);
            zzbvVar.write = onFirstVisibleNodestartTimer1;
            triggercallback2.read.postDelayed(onFirstVisibleNodestartTimer1, ConstantKt.DEFAULT_REQUEST_TIMEOUT);
            if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()) {
                ((MeasuringIntrinsicsDefaultIntrinsicMeasurable) triggercallback.write.serializer).IconCompatParcelizer();
                return;
            }
            return;
        }
        toAndroidRect toandroidrect = triggercallback.write;
        triggercallback.MediaSessionCompatToken();
        triggercallback.MediaSessionCompatQueueItem();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        zzgs zzgsVar2 = getlookaheaddelegate2.PlaybackStateCompat;
        long j2 = this.serializer;
        zzgsVar2.serializer(Long.valueOf(j2), "Activity resumed, time");
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope222.PlaybackStateCompat;
        if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onBackPressedDispatcher_delegatelambda0)) {
            if (setcomposedwithreusablecontenthost.MediaSessionCompatResultReceiverWrapper() || triggercallback.RatingCompat) {
                ((triggerCallback) toandroidrect.read).MediaSessionCompatToken();
                ((MeasuringIntrinsicsDefaultIntrinsicMeasurable) toandroidrect.serializer).IconCompatParcelizer();
                toandroidrect.IconCompatParcelizer = j2;
                toandroidrect.write = j2;
            }
        } else if (setcomposedwithreusablecontenthost.MediaSessionCompatResultReceiverWrapper()) {
            ((triggerCallback) toandroidrect.read).MediaSessionCompatToken();
            ((MeasuringIntrinsicsDefaultIntrinsicMeasurable) toandroidrect.serializer).IconCompatParcelizer();
            toandroidrect.IconCompatParcelizer = j2;
            toandroidrect.write = j2;
        } else {
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope222.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper.read()) {
                ((triggerCallback) toandroidrect.read).MediaSessionCompatToken();
                ((MeasuringIntrinsicsDefaultIntrinsicMeasurable) toandroidrect.serializer).IconCompatParcelizer();
                toandroidrect.IconCompatParcelizer = j2;
                toandroidrect.write = j2;
            }
        }
        zzbv zzbvVar2 = triggercallback.IconCompatParcelizer;
        triggerCallback triggercallback3 = (triggerCallback) zzbvVar2.RemoteActionCompatParcelizer;
        triggercallback3.MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) triggercallback3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        OnFirstVisibleNodestartTimer1 onFirstVisibleNodestartTimer2 = (OnFirstVisibleNodestartTimer1) zzbvVar2.write;
        if (onFirstVisibleNodestartTimer2 != null) {
            triggercallback3.read.removeCallbacks(onFirstVisibleNodestartTimer2);
        }
        LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
        NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope223.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
        lookaheadScopeKt2.MediaSessionCompatResultReceiverWrapper.serializer(false);
        triggercallback3.MediaSessionCompatToken();
        triggercallback3.RatingCompat = false;
        if (lookaheadScopeKtLookaheadScope223.PlaybackStateCompat.write(null, premeasure0kLqBqw.onBackPressedDispatcher_delegatelambda010)) {
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            if (noWindowInsetsAnimation.MediaSessionCompatToken) {
                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.PlaybackStateCompat.RemoteActionCompatParcelizer("Retrying trigger URI registration in foreground");
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                noWindowInsetsAnimation.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        }
        Extras$Key extras$Key = triggercallback.serializer;
        triggerCallback triggercallback4 = (triggerCallback) extras$Key.IconCompatParcelizer;
        triggercallback4.MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) triggercallback4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (lookaheadScopeKtLookaheadScope224.write()) {
            lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            extras$Key.IconCompatParcelizer(System.currentTimeMillis());
        }
    }

    public OnFirstVisibleNodeupdateViewport1(triggerCallback triggercallback, long j, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i != 1) {
            this.serializer = j;
            Objects.requireNonNull(triggercallback);
            this.write = triggercallback;
        } else {
            this.serializer = j;
            Objects.requireNonNull(triggercallback);
            this.write = triggercallback;
        }
    }
}
