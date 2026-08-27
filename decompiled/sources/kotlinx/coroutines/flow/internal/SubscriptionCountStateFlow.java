package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.IInAppMessageViewWrapper;

/* JADX INFO: loaded from: classes4.dex */
final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object read() {
        int iIntValue;
        synchronized (this) {
            Object[] objArr = this.serializer;
            objArr.getClass();
            iIntValue = ((Number) objArr[((int) ((this.MediaBrowserCompatMediaItem + ((long) ((int) ((MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer)) - this.MediaBrowserCompatMediaItem)))) - 1)) & (objArr.length - 1)]).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public final void read(int i) {
        synchronized (this) {
            Object[] objArr = this.serializer;
            objArr.getClass();
            write(Integer.valueOf(((Number) objArr[((int) ((this.MediaBrowserCompatMediaItem + ((long) ((int) ((MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer)) - this.MediaBrowserCompatMediaItem)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }

    public SubscriptionCountStateFlow(int i, int i2, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(i, i2, iInAppMessageViewWrapper);
    }
}
