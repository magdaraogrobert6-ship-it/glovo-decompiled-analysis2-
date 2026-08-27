package o;

import android.os.Bundle;
import android.os.SystemClock;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class toAndroidRect {
    public long IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final Object serializer;
    public long write;

    public void IconCompatParcelizer(Object obj, Object obj2, RectHelper_androidKt rectHelper_androidKt) {
        RectHelper_androidKt rectHelper_androidKt2 = (RectHelper_androidKt) obj2;
        ((getCenterF1C5BW0ui_graphics) this.read).read.write((accessgetPointscp) obj, rectHelper_androidKt2.read, rectHelper_androidKt2.RemoteActionCompatParcelizer, rectHelper_androidKt2.serializer);
    }

    public boolean RemoteActionCompatParcelizer(long j, boolean z, boolean z2) {
        triggerCallback triggercallback = (triggerCallback) this.read;
        triggercallback.MediaSessionCompatToken();
        triggercallback.serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        boolean zWrite = lookaheadScopeKtLookaheadScope221.write();
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        if (zWrite) {
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            LookaheadScopeImpl lookaheadScopeImpl = lookaheadScopeKt.MediaSessionCompatQueueItem;
            lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            lookaheadScopeImpl.serializer(System.currentTimeMillis());
        }
        long j2 = j - this.IconCompatParcelizer;
        if (!z && j2 < 1000) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.write;
            this.write = j;
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean zMediaSessionCompatResultReceiverWrapper = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper();
        OnFirstVisibleNode onFirstVisibleNode = lookaheadScopeKtLookaheadScope221.ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        onLayoutRectChangeddefault.IconCompatParcelizer(onFirstVisibleNode.IconCompatParcelizer(!zMediaSessionCompatResultReceiverWrapper), bundle, true);
        if (!z2) {
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.RemoteActionCompatParcelizer("auto", "_e", bundle);
        }
        this.IconCompatParcelizer = j;
        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = (MeasuringIntrinsicsDefaultIntrinsicMeasurable) this.serializer;
        measuringIntrinsicsDefaultIntrinsicMeasurable.IconCompatParcelizer();
        measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(((Long) premeasure0kLqBqw.getNavigationEventDispatcher.IconCompatParcelizer(null)).longValue());
        return true;
    }

    public void write(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.serializer;
        while (RemoteActionCompatParcelizer() > j) {
            if (linkedHashMap.isEmpty()) {
                if (RemoteActionCompatParcelizer() == 0) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) onContentCardDismissed.IconCompatParcelizer((Iterable) linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.write = RemoteActionCompatParcelizer() - serializer(key, value);
                IconCompatParcelizer(key, value, null);
            }
        }
    }

    public toAndroidRect(getCenterF1C5BW0ui_graphics getcenterf1c5bw0ui_graphics, long j) {
        this.read = getcenterf1c5bw0ui_graphics;
        this.serializer = new LinkedHashMap(0, 0.75f, true);
        this.IconCompatParcelizer = j;
        if (j > 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxSize <= 0");
        throw null;
    }

    public long serializer(Object obj, Object obj2) throws Exception {
        try {
            long j = ((RectHelper_androidKt) obj2).serializer;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.write = -1L;
            throw e;
        }
    }

    public long RemoteActionCompatParcelizer() {
        if (this.write == -1) {
            long jSerializer = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.serializer).entrySet()) {
                jSerializer += serializer(entry.getKey(), entry.getValue());
            }
            this.write = jSerializer;
        }
        return this.write;
    }

    public toAndroidRect(triggerCallback triggercallback) {
        this.read = triggercallback;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.serializer = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(this, lookaheadScopeKtLookaheadScope221);
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.IconCompatParcelizer = jElapsedRealtime;
        this.write = jElapsedRealtime;
    }
}
