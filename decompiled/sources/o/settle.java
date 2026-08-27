package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class settle implements accessanimateToThreshold {
    public final androidx.compose.foundation.lazy.LazyListState serializer;

    @Override // o.accessanimateToThreshold
    public final int IconCompatParcelizer() {
        return ((androidx.compose.foundation.lazy.LazyListMeasureResult) this.serializer.serializer()).PlaybackStateCompatCustomAction;
    }

    @Override // o.accessanimateToThreshold
    public final boolean read() {
        return !((androidx.compose.foundation.lazy.LazyListMeasureResult) this.serializer.serializer()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.isEmpty();
    }

    @Override // o.accessanimateToThreshold
    public final int serializer() {
        return Math.max(0, this.serializer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem());
    }

    @Override // o.accessanimateToThreshold
    public final int write() {
        int i;
        androidx.compose.foundation.lazy.LazyListState lazyListState = this.serializer;
        int size = 0;
        if (((androidx.compose.foundation.lazy.LazyListMeasureResult) lazyListState.serializer()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.isEmpty()) {
            return 0;
        }
        int iSerializer = getSuspendingTransactionContext.serializer(lazyListState.serializer());
        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult = (androidx.compose.foundation.lazy.LazyListMeasureResult) lazyListState.serializer();
        List list = lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i2 = 0;
            while (size < size2) {
                i2 += ((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) list.get(size))).ComponentActivity;
                size++;
            }
            size = (i2 / list.size()) + lazyListMeasureResult.MediaDescriptionCompat;
        }
        if (size != 0 && (i = iSerializer / size) >= 1) {
            return i;
        }
        return 1;
    }

    public settle(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        this.serializer = lazyListState;
    }

    @Override // o.accessanimateToThreshold
    public final int RemoteActionCompatParcelizer() {
        return Math.min(IconCompatParcelizer() - 1, ((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) onContentCardDismissed.MediaDescriptionCompat(((androidx.compose.foundation.lazy.LazyListMeasureResult) this.serializer.serializer()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY))).MediaMetadataCompat);
    }
}
