package kotlinx.coroutines.flow;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onTouchEnded;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;
import o.setCloseButton;

/* JADX INFO: loaded from: classes4.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final IInAppMessageViewWrapper IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public final int read;
    public Object[] serializer;
    public long write;

    public static final class Emitter implements setAndStartAnimation {
        public final long RemoteActionCompatParcelizer;
        public final Object read;
        public final CancellableContinuationImpl serializer;
        public final SharedFlowImpl write;

        @Override // o.setAndStartAnimation
        public final void RemoteActionCompatParcelizer() {
            SharedFlowImpl sharedFlowImpl = this.write;
            synchronized (sharedFlowImpl) {
                if (this.RemoteActionCompatParcelizer < sharedFlowImpl.MediaDescriptionCompat()) {
                    return;
                }
                Object[] objArr = sharedFlowImpl.serializer;
                objArr.getClass();
                long j = this.RemoteActionCompatParcelizer;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                SharedFlowKt.serializer(objArr, j, SharedFlowKt.write);
                sharedFlowImpl.write();
            }
        }

        public Emitter(SharedFlowImpl sharedFlowImpl, long j, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
            this.write = sharedFlowImpl;
            this.RemoteActionCompatParcelizer = j;
            this.read = obj;
            this.serializer = cancellableContinuationImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends ContinuationImpl {
        public FlowCollector IconCompatParcelizer;
        public /* synthetic */ Object RatingCompat;
        public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 RemoteActionCompatParcelizer;
        public SharedFlowImpl read;
        public SharedFlowSlot serializer;
        public int write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.RatingCompat = obj;
            this.write |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(SharedFlowImpl.this, null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void IconCompatParcelizer() {
        synchronized (this) {
            long jMediaDescriptionCompat = MediaDescriptionCompat();
            write(this.RemoteActionCompatParcelizer + jMediaDescriptionCompat, this.write, MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer), MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer) + ((long) this.MediaMetadataCompat));
        }
    }

    public final List MediaSessionCompatQueueItem() {
        synchronized (this) {
            int iMediaDescriptionCompat = (int) ((MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer)) - this.MediaBrowserCompatMediaItem);
            if (iMediaDescriptionCompat == 0) {
                return instance_delegatelambda0.write;
            }
            ArrayList arrayList = new ArrayList(iMediaDescriptionCompat);
            Object[] objArr = this.serializer;
            objArr.getClass();
            for (int i = 0; i < iMediaDescriptionCompat; i++) {
                arrayList.add(objArr[((int) (this.MediaBrowserCompatMediaItem + ((long) i))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] RatingCompat() {
        return new SharedFlowSlot[2];
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        return collect$suspendImpl(this, flowCollector, shortNewsContentCardView);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return SharedFlowKt.IconCompatParcelizer(this, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.ShortNewsContentCardView[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final ShortNewsContentCardView[] write(ShortNewsContentCardView[] shortNewsContentCardViewArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        CancellableContinuationImpl cancellableContinuationImpl;
        int length = shortNewsContentCardViewArr.length;
        if (this.MediaSessionCompatQueueItem != 0 && (abstractSharedFlowSlotArr = this.PlaybackStateCompat) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot == null || (cancellableContinuationImpl = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).IconCompatParcelizer) == null || read(sharedFlowSlot) < 0) {
                    shortNewsContentCardViewArr = shortNewsContentCardViewArr;
                } else {
                    if (length >= shortNewsContentCardViewArr.length) {
                        shortNewsContentCardViewArr = shortNewsContentCardViewArr;
                        shortNewsContentCardViewArr = shortNewsContentCardViewArr;
                        shortNewsContentCardViewArr = Arrays.copyOf((Object[]) shortNewsContentCardViewArr, Math.max(2, shortNewsContentCardViewArr.length * 2));
                    }
                    shortNewsContentCardViewArr = shortNewsContentCardViewArr;
                    shortNewsContentCardViewArr = shortNewsContentCardViewArr;
                    ((ShortNewsContentCardView[]) shortNewsContentCardViewArr)[length] = cancellableContinuationImpl;
                    sharedFlowSlot.IconCompatParcelizer = null;
                    length++;
                }
                i++;
                shortNewsContentCardViewArr = shortNewsContentCardViewArr;
            }
            shortNewsContentCardViewArr = shortNewsContentCardViewArr;
        }
        return (ShortNewsContentCardView[]) shortNewsContentCardViewArr;
    }

    public final void MediaBrowserCompatMediaItem() {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Object[] objArr = this.serializer;
        objArr.getClass();
        SharedFlowKt.serializer(objArr, MediaDescriptionCompat(), null);
        this.RemoteActionCompatParcelizer--;
        long jMediaDescriptionCompat = MediaDescriptionCompat() + 1;
        if (this.MediaBrowserCompatMediaItem < jMediaDescriptionCompat) {
            this.MediaBrowserCompatMediaItem = jMediaDescriptionCompat;
        }
        if (this.write < jMediaDescriptionCompat) {
            if (this.MediaSessionCompatQueueItem != 0 && (abstractSharedFlowSlotArr = this.PlaybackStateCompat) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                        long j = sharedFlowSlot.write;
                        if (j >= 0 && j < jMediaDescriptionCompat) {
                            sharedFlowSlot.write = jMediaDescriptionCompat;
                        }
                    }
                }
            }
            this.write = jMediaDescriptionCompat;
        }
    }

    public final long MediaDescriptionCompat() {
        return Math.min(this.write, this.MediaBrowserCompatMediaItem);
    }

    public final Object RemoteActionCompatParcelizer(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        ShortNewsContentCardView[] shortNewsContentCardViewArrSerializer = AbstractSharedFlowKt.serializer;
        synchronized (this) {
            long j = read(sharedFlowSlot);
            if (j < 0) {
                obj = SharedFlowKt.write;
            } else {
                long j2 = sharedFlowSlot.write;
                Object[] objArr = this.serializer;
                objArr.getClass();
                Object obj2 = objArr[((int) j) & (objArr.length - 1)];
                if (obj2 instanceof Emitter) {
                    obj2 = ((Emitter) obj2).read;
                }
                sharedFlowSlot.write = j + 1;
                Object obj3 = obj2;
                shortNewsContentCardViewArrSerializer = serializer(j2);
                obj = obj3;
            }
        }
        for (ShortNewsContentCardView shortNewsContentCardView : shortNewsContentCardViewArrSerializer) {
            if (shortNewsContentCardView != null) {
                shortNewsContentCardView.resumeWith(createFromParcel.INSTANCE);
            }
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot RemoteActionCompatParcelizer() {
        SharedFlowSlot sharedFlowSlot = new SharedFlowSlot();
        sharedFlowSlot.write = -1L;
        return sharedFlowSlot;
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        int i = this.RemoteActionCompatParcelizer + this.MediaMetadataCompat;
        Object[] objArrRemoteActionCompatParcelizer = this.serializer;
        if (objArrRemoteActionCompatParcelizer == null) {
            objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, 2, null);
        } else if (i >= objArrRemoteActionCompatParcelizer.length) {
            objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, objArrRemoteActionCompatParcelizer.length * 2, objArrRemoteActionCompatParcelizer);
        }
        SharedFlowKt.serializer(objArrRemoteActionCompatParcelizer, MediaDescriptionCompat() + ((long) i), obj);
    }

    public final Object[] RemoteActionCompatParcelizer(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.serializer = objArr2;
        if (objArr != null) {
            long jMediaDescriptionCompat = MediaDescriptionCompat();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jMediaDescriptionCompat;
                SharedFlowKt.serializer(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, ShortNewsContentCardView shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        synchronized (this) {
            if (read(sharedFlowSlot) < 0) {
                sharedFlowSlot.IconCompatParcelizer = cancellableContinuationImpl;
            } else {
                cancellableContinuationImpl.resumeWith(createFromParcel.INSTANCE);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createFromParcel.INSTANCE;
    }

    public final long read(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.write;
        if (j < MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer)) {
            return j;
        }
        if (this.read <= 0 && j <= MediaDescriptionCompat() && this.MediaMetadataCompat != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public final boolean serializer(Object obj) {
        int i;
        long jMediaDescriptionCompat;
        long j;
        long j2;
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = this.MediaDescriptionCompat;
        if (i2 != 0) {
            int i4 = this.RemoteActionCompatParcelizer;
            int i5 = this.read;
            if (i4 >= i5 && this.write <= this.MediaBrowserCompatMediaItem) {
                int i6 = WhenMappings.read[this.IconCompatParcelizer.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        RemoteActionCompatParcelizer(obj);
                        i = this.RemoteActionCompatParcelizer + 1;
                        this.RemoteActionCompatParcelizer = i;
                        if (i > i5) {
                            MediaBrowserCompatMediaItem();
                        }
                        jMediaDescriptionCompat = MediaDescriptionCompat();
                        j = this.RemoteActionCompatParcelizer;
                        j2 = this.MediaBrowserCompatMediaItem;
                        if (((int) ((jMediaDescriptionCompat + j) - j2)) > i3) {
                            write(j2 + 1, this.write, ((long) this.RemoteActionCompatParcelizer) + MediaDescriptionCompat(), MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer) + ((long) this.MediaMetadataCompat));
                            return true;
                        }
                    }
                }
                return false;
            }
            RemoteActionCompatParcelizer(obj);
            i = this.RemoteActionCompatParcelizer + 1;
            this.RemoteActionCompatParcelizer = i;
            if (i > i5) {
                MediaBrowserCompatMediaItem();
            }
            jMediaDescriptionCompat = MediaDescriptionCompat();
            j = this.RemoteActionCompatParcelizer;
            j2 = this.MediaBrowserCompatMediaItem;
            if (((int) ((jMediaDescriptionCompat + j) - j2)) > i3) {
                write(j2 + 1, this.write, ((long) this.RemoteActionCompatParcelizer) + MediaDescriptionCompat(), MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer) + ((long) this.MediaMetadataCompat));
                return true;
            }
        } else if (i3 != 0) {
            RemoteActionCompatParcelizer(obj);
            int i7 = this.RemoteActionCompatParcelizer + 1;
            this.RemoteActionCompatParcelizer = i7;
            if (i7 > i3) {
                MediaBrowserCompatMediaItem();
            }
            this.write = MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer);
            return true;
        }
        return true;
    }

    public final ShortNewsContentCardView[] serializer(long j) {
        long j2;
        long j3;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        long j4 = this.write;
        ShortNewsContentCardView[] shortNewsContentCardViewArr = AbstractSharedFlowKt.serializer;
        if (j <= j4) {
            long jMediaDescriptionCompat = MediaDescriptionCompat();
            long j5 = ((long) this.RemoteActionCompatParcelizer) + jMediaDescriptionCompat;
            int i = this.read;
            if (i == 0 && this.MediaMetadataCompat > 0) {
                j5++;
            }
            if (this.MediaSessionCompatQueueItem != 0 && (abstractSharedFlowSlotArr = this.PlaybackStateCompat) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        long j6 = ((SharedFlowSlot) abstractSharedFlowSlot).write;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.write) {
                long jMediaDescriptionCompat2 = MediaDescriptionCompat() + ((long) this.RemoteActionCompatParcelizer);
                int i2 = this.MediaSessionCompatQueueItem;
                int iMin = this.MediaMetadataCompat;
                if (i2 > 0) {
                    iMin = Math.min(iMin, i - ((int) (jMediaDescriptionCompat2 - j5)));
                }
                long j7 = ((long) this.MediaMetadataCompat) + jMediaDescriptionCompat2;
                Symbol symbol = SharedFlowKt.write;
                if (iMin > 0) {
                    shortNewsContentCardViewArr = new ShortNewsContentCardView[iMin];
                    Object[] objArr = this.serializer;
                    objArr.getClass();
                    long j8 = jMediaDescriptionCompat2;
                    long j9 = j8;
                    int i3 = 0;
                    while (true) {
                        if (j9 >= j7) {
                            j2 = j7;
                            break;
                        }
                        j2 = j7;
                        Object obj = objArr[((int) j9) & (objArr.length - 1)];
                        if (obj != symbol) {
                            obj.getClass();
                            Emitter emitter = (Emitter) obj;
                            int i4 = i3 + 1;
                            shortNewsContentCardViewArr[i3] = emitter.serializer;
                            SharedFlowKt.serializer(objArr, j9, symbol);
                            SharedFlowKt.serializer(objArr, j8, emitter.read);
                            j3 = 1;
                            j8++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i3 = i4;
                        } else {
                            j3 = 1;
                        }
                        j9 += j3;
                        j7 = j2;
                    }
                    jMediaDescriptionCompat2 = j8;
                } else {
                    j2 = j7;
                }
                ShortNewsContentCardView[] shortNewsContentCardViewArr2 = shortNewsContentCardViewArr;
                int i5 = (int) (jMediaDescriptionCompat2 - jMediaDescriptionCompat);
                long j10 = this.MediaSessionCompatQueueItem == 0 ? jMediaDescriptionCompat2 : j5;
                long jMax = Math.max(this.MediaBrowserCompatMediaItem, jMediaDescriptionCompat2 - ((long) Math.min(this.MediaDescriptionCompat, i5)));
                if (i == 0 && jMax < j2) {
                    Object[] objArr2 = this.serializer;
                    objArr2.getClass();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objArr2[((int) jMax) & (objArr2.length - 1)], symbol}, getCieXyz.write())).booleanValue()) {
                        jMediaDescriptionCompat2++;
                        jMax++;
                    }
                }
                write(jMax, j10, jMediaDescriptionCompat2, j2);
                write();
                return shortNewsContentCardViewArr2.length == 0 ? shortNewsContentCardViewArr2 : write(shortNewsContentCardViewArr2);
            }
        }
        return shortNewsContentCardViewArr;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean write(Object obj) {
        int i;
        boolean z;
        ShortNewsContentCardView[] shortNewsContentCardViewArrWrite = AbstractSharedFlowKt.serializer;
        synchronized (this) {
            if (serializer(obj)) {
                shortNewsContentCardViewArrWrite = write(shortNewsContentCardViewArrWrite);
                z = true;
            } else {
                z = false;
            }
        }
        for (ShortNewsContentCardView shortNewsContentCardView : shortNewsContentCardViewArrWrite) {
            if (shortNewsContentCardView != null) {
                shortNewsContentCardView.resumeWith(createFromParcel.INSTANCE);
            }
        }
        return z;
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[IInAppMessageViewWrapper.values().length];
            try {
                iArr[IInAppMessageViewWrapper.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IInAppMessageViewWrapper.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IInAppMessageViewWrapper.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public SharedFlowImpl(int i, int i2, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        this.MediaDescriptionCompat = i;
        this.read = i2;
        this.IconCompatParcelizer = iInAppMessageViewWrapper;
    }

    public final void write(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jMediaDescriptionCompat = MediaDescriptionCompat(); jMediaDescriptionCompat < jMin; jMediaDescriptionCompat++) {
            Object[] objArr = this.serializer;
            objArr.getClass();
            SharedFlowKt.serializer(objArr, jMediaDescriptionCompat, null);
        }
        this.MediaBrowserCompatMediaItem = j;
        this.write = j2;
        this.RemoteActionCompatParcelizer = (int) (j3 - jMin);
        this.MediaMetadataCompat = (int) (j4 - j3);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:17:0x0041, B:35:0x008f, B:37:0x0097, B:41:0x00aa, B:44:0x00b1, B:45:0x00b5, B:46:0x00b6), top: B:54:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6 A[EDGE_INSN: B:66:0x00c6->B:48:0x00c6 BREAK  A[LOOP:0: B:35:0x008f->B:67:0x008f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (o.createFromParcel.INSTANCE == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.coroutines.intrinsics.CoroutineSingletons collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, o.ShortNewsContentCardView r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    public final void write() {
        if (this.read != 0 || this.MediaMetadataCompat > 1) {
            Object[] objArr = this.serializer;
            objArr.getClass();
            while (this.MediaMetadataCompat > 0) {
                long jMediaDescriptionCompat = MediaDescriptionCompat();
                int i = this.RemoteActionCompatParcelizer;
                int i2 = this.MediaMetadataCompat;
                if (objArr[((int) ((jMediaDescriptionCompat + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != SharedFlowKt.write) {
                    return;
                }
                this.MediaMetadataCompat = i2 - 1;
                SharedFlowKt.serializer(objArr, MediaDescriptionCompat() + ((long) (this.RemoteActionCompatParcelizer + this.MediaMetadataCompat)), null);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Emitter emitter;
        if (write(obj)) {
            return createFromParcel.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        ShortNewsContentCardView[] shortNewsContentCardViewArrWrite = AbstractSharedFlowKt.serializer;
        synchronized (this) {
            try {
                if (serializer(obj)) {
                    cancellableContinuationImpl.resumeWith(createFromParcel.INSTANCE);
                    shortNewsContentCardViewArrWrite = write(shortNewsContentCardViewArrWrite);
                    emitter = null;
                } else {
                    Emitter emitter2 = new Emitter(this, ((long) (this.RemoteActionCompatParcelizer + this.MediaMetadataCompat)) + MediaDescriptionCompat(), obj, cancellableContinuationImpl);
                    RemoteActionCompatParcelizer(emitter2);
                    this.MediaMetadataCompat++;
                    if (this.read == 0) {
                        shortNewsContentCardViewArrWrite = write(shortNewsContentCardViewArrWrite);
                    }
                    emitter = emitter2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = 0;
        if (emitter != null) {
            cancellableContinuationImpl.IconCompatParcelizer((onTouchEnded) new setCloseButton(i, emitter));
        }
        int length = shortNewsContentCardViewArrWrite.length;
        while (i < length) {
            ShortNewsContentCardView shortNewsContentCardView2 = shortNewsContentCardViewArrWrite[i];
            if (shortNewsContentCardView2 != null) {
                shortNewsContentCardView2.resumeWith(createFromParcel.INSTANCE);
            }
            i++;
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (result != coroutineSingletons) {
            result = createFromParcel.INSTANCE;
        }
        return result == coroutineSingletons ? result : createFromParcel.INSTANCE;
    }
}
