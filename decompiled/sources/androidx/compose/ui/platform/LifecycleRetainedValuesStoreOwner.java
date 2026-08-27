package androidx.compose.ui.platform;

import androidx.lifecycle.ViewModel;
import java.util.concurrent.CancellationException;
import o.ContentInViewNode;
import o.DragAndDropTransferData;
import o.VerticalScrollableClipShape;
import o.animateToWithDecay;
import o.createFromParcel;
import o.getBirthDateMonth;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleRetainedValuesStoreOwner extends ViewModel {
    public static final int $stable = 8;
    private final animateToWithDecay scopes;

    public interface FrameEndScheduler {
        getBirthDateMonth scheduleFrameEndCallback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static final class RetainedValuesStoreEntry {
        public static final int $stable = 8;
        private final LifecycleRetainedValuesStore _retainedValuesStore;
        private getBirthDateMonth endRetainCancellationHandle;
        private boolean isInUse;
        private final DragAndDropTransferData retainedValuesStore;

        public final DragAndDropTransferData getRetainedValuesStore() {
            return this.retainedValuesStore;
        }

        public final boolean isInUse() {
            return this.isInUse;
        }

        public final void onCleared() {
            setEndRetainCancellationHandle(null);
            this._retainedValuesStore.dispose();
        }

        public final void release() {
            this.isInUse = false;
        }

        public final void setInUse(boolean z) {
            this.isInUse = z;
        }

        public final void startRetainingExitedValues() {
            if (this._retainedValuesStore.isRetainingExitedValues()) {
                setEndRetainCancellationHandle(null);
            } else {
                this._retainedValuesStore.startLifecycleTransition();
            }
        }

        public final void stopRetainingExitedValues(FrameEndScheduler frameEndScheduler) {
            getBirthDateMonth getbirthdatemonthScheduleFrameEndCallback;
            if (this._retainedValuesStore.isRetainingExitedValues()) {
                try {
                    getbirthdatemonthScheduleFrameEndCallback = frameEndScheduler.scheduleFrameEndCallback(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m2756invoke() {
                            this.this$0._retainedValuesStore.endLifecycleTransition();
                        }

                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m2756invoke();
                            return createFromParcel.INSTANCE;
                        }
                    });
                } catch (CancellationException unused) {
                    this._retainedValuesStore.endLifecycleTransition();
                    getbirthdatemonthScheduleFrameEndCallback = null;
                }
                setEndRetainCancellationHandle(getbirthdatemonthScheduleFrameEndCallback);
            }
        }

        private final void setEndRetainCancellationHandle(getBirthDateMonth getbirthdatemonth) {
            getBirthDateMonth getbirthdatemonth2 = this.endRetainCancellationHandle;
            if (getbirthdatemonth2 != null) {
                getbirthdatemonth2.RemoteActionCompatParcelizer();
            }
            this.endRetainCancellationHandle = getbirthdatemonth;
        }

        public RetainedValuesStoreEntry() {
            LifecycleRetainedValuesStore lifecycleRetainedValuesStore = new LifecycleRetainedValuesStore(null, 1, null);
            this._retainedValuesStore = lifecycleRetainedValuesStore;
            this.retainedValuesStore = lifecycleRetainedValuesStore;
        }
    }

    public final RetainedValuesStoreEntry getOrCreateRetainedValuesStoreEntry(int i) {
        Object obj;
        animateToWithDecay animatetowithdecay = this.scopes;
        Object objSerializer = animatetowithdecay.serializer(i);
        if (objSerializer == null) {
            objSerializer = new ContentInViewNode(1);
            animatetowithdecay.IconCompatParcelizer(i, objSerializer);
        }
        ContentInViewNode contentInViewNode = (ContentInViewNode) objSerializer;
        Object[] objArr = contentInViewNode.read;
        int i2 = contentInViewNode.IconCompatParcelizer;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                obj = null;
                break;
            }
            obj = objArr[i3];
            if (!((RetainedValuesStoreEntry) obj).isInUse()) {
                break;
            }
            i3++;
        }
        RetainedValuesStoreEntry retainedValuesStoreEntry = (RetainedValuesStoreEntry) obj;
        if (retainedValuesStoreEntry == null) {
            retainedValuesStoreEntry = new RetainedValuesStoreEntry();
            contentInViewNode.read(retainedValuesStoreEntry);
        }
        retainedValuesStoreEntry.setInUse(true);
        return retainedValuesStoreEntry;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        animateToWithDecay animatetowithdecay = this.scopes;
        int[] iArr = animatetowithdecay.serializer;
        Object[] objArr = animatetowithdecay.IconCompatParcelizer;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        ContentInViewNode contentInViewNode = (ContentInViewNode) objArr[i4];
                        Object[] objArr2 = contentInViewNode.read;
                        int i6 = contentInViewNode.IconCompatParcelizer;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((RetainedValuesStoreEntry) objArr2[i7]).onCleared();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public LifecycleRetainedValuesStoreOwner() {
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        this.scopes = new animateToWithDecay();
    }
}
