package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.markOnScreenCardsAsRead;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long write = markOnScreenCardsAsRead.serializer.objectFieldOffset(StateFlowImpl.class.getDeclaredField("_state$volatile"));
    public int RemoteActionCompatParcelizer;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    final class AnonymousClass1 extends ContinuationImpl {
        public Object IconCompatParcelizer;
        public /* synthetic */ Object MediaBrowserCompatMediaItem;
        public int MediaDescriptionCompat;
        public FlowCollector RemoteActionCompatParcelizer;
        public Object read;
        public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 serializer;
        public Object write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatMediaItem = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            return StateFlowImpl.this.collect(null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] RatingCompat() {
        return new StateFlowSlot[2];
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean write(Object obj) {
        IconCompatParcelizer(obj);
        return true;
    }

    public final boolean write(Object obj, Object obj2) {
        int i;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Symbol symbol;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, obj}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, obj2}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.RemoteActionCompatParcelizer;
            if ((i2 & 1) != 0) {
                this.RemoteActionCompatParcelizer = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.RemoteActionCompatParcelizer = i3;
            AbstractSharedFlowSlot[] abstractSharedFlowSlotArr2 = this.PlaybackStateCompat;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) abstractSharedFlowSlotArr2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            AtomicReference atomicReference = stateFlowSlot.IconCompatParcelizer;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (symbol = StateFlowKt.serializer)) {
                                    break;
                                }
                                Symbol symbol2 = StateFlowKt.RemoteActionCompatParcelizer;
                                if (obj4 != symbol2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, symbol2)) {
                                            ((CancellableContinuationImpl) obj4).resumeWith(createFromParcel.INSTANCE);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, symbol)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.RemoteActionCompatParcelizer;
                    if (i == i3) {
                        this.RemoteActionCompatParcelizer = i3 + 1;
                        return true;
                    }
                    abstractSharedFlowSlotArr = this.PlaybackStateCompat;
                }
                abstractSharedFlowSlotArr2 = abstractSharedFlowSlotArr;
                i3 = i;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void IconCompatParcelizer(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.RemoteActionCompatParcelizer;
        }
        write(null, obj);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot RemoteActionCompatParcelizer() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final Object read() {
        read.getClass();
        Object objectVolatile = markOnScreenCardsAsRead.serializer.getObjectVolatile(this, write);
        if (objectVolatile == NullSurrogateKt.RemoteActionCompatParcelizer) {
            return null;
        }
        return objectVolatile;
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        IconCompatParcelizer(obj);
        return createFromParcel.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void IconCompatParcelizer() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x010e A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0040, B:36:0x00a6, B:38:0x00ae, B:41:0x00b5, B:42:0x00b9, B:44:0x00bc, B:54:0x00dd, B:57:0x00ed, B:58:0x0107, B:64:0x0117, B:61:0x010e, B:63:0x0114, B:46:0x00c2, B:50:0x00c9, B:19:0x0058, B:35:0x0097), top: B:80:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0126 A[LOOP:0: B:58:0x0107->B:71:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r18, o.ShortNewsContentCardView r19) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
        Symbol symbol = NullSurrogateKt.RemoteActionCompatParcelizer;
        if (obj == null) {
            obj = symbol;
        }
        if (obj2 == null) {
            obj2 = symbol;
        }
        return write(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return (((i < 0 || i >= 2) && i != -2) || iInAppMessageViewWrapper != IInAppMessageViewWrapper.DROP_OLDEST) ? SharedFlowKt.IconCompatParcelizer(this, textAnnouncementContentCardView, i, iInAppMessageViewWrapper) : this;
    }
}
