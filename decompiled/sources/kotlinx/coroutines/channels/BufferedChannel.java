package kotlinx.coroutines.channels;

import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.CallTracer;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DrawableTransformation;
import o.IconCompatParcelizer;
import o.InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult;
import o.MediaSessionCompatQueueItem;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageViewWrapper;
import o.createTouchAwareListener;
import o.finalizeAnimatingCloseOnUnregister;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAppSetIdReadingEnabled;
import o.isItemDismissable;
import o.logUnregisterActivity;
import o.logUnregisterActivitylambda0;
import o.logUnregisterActivitylambda1;
import o.markOnScreenCardsAsRead;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w;
import o.r8lambdaEgz7kigdapUBiOSqHWECCSmC2Wo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaU_tgrSZbCW4JiKJ1j3WYFBJ_Fs;
import o.r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw;
import o.r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.resolveUnregisterDisplayedMessage;
import o.resolveUnregisterDisplayedMessagelambda0;
import o.saveInAppMessageForCarryoverOnUnregister;
import o.setBackButtonDismissesInAppMessageViewlambda0;
import o.setCustomInAppMessageManagerListenerlambda0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public class BufferedChannel implements logUnregisterActivitylambda1 {
    public static final /* synthetic */ long IconCompatParcelizer;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaDescriptionCompat;
    public static final /* synthetic */ long MediaMetadataCompat;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaSessionCompatQueueItem;
    public static final /* synthetic */ long ParcelableVolumeInfo;
    public static final /* synthetic */ long RatingCompat;
    public static final /* synthetic */ long RemoteActionCompatParcelizer;
    public static final /* synthetic */ AtomicReferenceFieldUpdater serializer;
    public static final /* synthetic */ AtomicReferenceFieldUpdater write;
    public final int MediaSessionCompatResultReceiverWrapper;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater PlaybackStateCompatCustomAction = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater PlaybackStateCompat = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater read = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater MediaBrowserCompatMediaItem = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaSessionCompatToken = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    public final class BufferedChannelIterator implements r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w {
        public Object IconCompatParcelizer = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatResultReceiverWrapper;
        public CancellableContinuationImpl write;

        public final Object hasNext(ContinuationImpl continuationImpl) throws Throwable {
            boolean z;
            CancellableContinuationImpl cancellableContinuationImpl;
            Object obj = this.IconCompatParcelizer;
            if (obj != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatResultReceiverWrapper && obj != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
                z = true;
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.MediaDescriptionCompat;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) atomicReferenceFieldUpdater.get(bufferedChannel);
            while (true) {
                if (bufferedChannel.PlaybackStateCompatCustomAction()) {
                    this.IconCompatParcelizer = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer;
                    Throwable thWrite = bufferedChannel.write();
                    if (thWrite == null) {
                        z = false;
                        break;
                    }
                    int i = StackTraceRecoveryKt.serializer;
                    throw thWrite;
                }
                long andIncrement = BufferedChannel.PlaybackStateCompat.getAndIncrement(bufferedChannel);
                long j = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                long j2 = andIncrement / j;
                int i2 = (int) (andIncrement % j);
                if (resolveunregisterdisplayedmessage.RatingCompat != j2) {
                    resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = bufferedChannel.write(j2, resolveunregisterdisplayedmessage);
                    if (resolveunregisterdisplayedmessageWrite == null) {
                        continue;
                    } else {
                        resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                    }
                }
                Object objWrite = bufferedChannel.write(resolveunregisterdisplayedmessage, i2, andIncrement, null);
                Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (objWrite == symbol) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("unreachable");
                    return null;
                }
                Symbol symbol2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
                if (objWrite != symbol2) {
                    if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                        resolveunregisterdisplayedmessage.read();
                        this.IconCompatParcelizer = objWrite;
                        z = true;
                        break;
                    }
                    BufferedChannel bufferedChannel2 = BufferedChannel.this;
                    CancellableContinuationImpl cancellableContinuationImplRemoteActionCompatParcelizer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(LoadBalancer$Helper.intercepted(continuationImpl));
                    try {
                        this.write = cancellableContinuationImplRemoteActionCompatParcelizer;
                        try {
                            Object objWrite2 = bufferedChannel2.write(resolveunregisterdisplayedmessage, i2, andIncrement, this);
                            if (objWrite2 != symbol) {
                                if (objWrite2 == symbol2) {
                                    if (andIncrement < bufferedChannel2.MediaMetadataCompat()) {
                                        resolveunregisterdisplayedmessage.read();
                                    }
                                    resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = (resolveUnregisterDisplayedMessage) BufferedChannel.MediaDescriptionCompat.get(bufferedChannel2);
                                    while (true) {
                                        if (bufferedChannel2.PlaybackStateCompatCustomAction()) {
                                            CancellableContinuationImpl cancellableContinuationImpl2 = this.write;
                                            cancellableContinuationImpl2.getClass();
                                            this.write = null;
                                            this.IconCompatParcelizer = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer;
                                            Throwable thWrite2 = bufferedChannel.write();
                                            if (thWrite2 == null) {
                                                cancellableContinuationImpl2.resumeWith(Boolean.FALSE);
                                            } else {
                                                cancellableContinuationImpl2.resumeWith(new isItemDismissable(thWrite2));
                                            }
                                        } else {
                                            long andIncrement2 = BufferedChannel.PlaybackStateCompat.getAndIncrement(bufferedChannel2);
                                            long j3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                                            long j4 = andIncrement2 / j3;
                                            int i3 = (int) (andIncrement2 % j3);
                                            if (resolveunregisterdisplayedmessage2.RatingCompat != j4) {
                                                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite2 = bufferedChannel2.write(j4, resolveunregisterdisplayedmessage2);
                                                if (resolveunregisterdisplayedmessageWrite2 != null) {
                                                    resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessageWrite2;
                                                }
                                            }
                                            Object objWrite3 = bufferedChannel2.write(resolveunregisterdisplayedmessage2, i3, andIncrement2, this);
                                            if (objWrite3 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                                RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage2, i3);
                                            } else if (objWrite3 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                                                if (andIncrement2 < bufferedChannel2.MediaMetadataCompat()) {
                                                    resolveunregisterdisplayedmessage2.read();
                                                }
                                            } else {
                                                if (objWrite3 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                resolveunregisterdisplayedmessage2.read();
                                                this.IconCompatParcelizer = objWrite3;
                                                this.write = null;
                                            }
                                        }
                                    }
                                } else {
                                    resolveunregisterdisplayedmessage.read();
                                    this.IconCompatParcelizer = objWrite2;
                                    this.write = null;
                                }
                                cancellableContinuationImpl = cancellableContinuationImplRemoteActionCompatParcelizer;
                                try {
                                    cancellableContinuationImpl.serializer(Boolean.TRUE, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) null);
                                    Object result = cancellableContinuationImpl.getResult();
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    return result;
                                } catch (Throwable th) {
                                    th = th;
                                    cancellableContinuationImpl.MediaMetadataCompat();
                                    throw th;
                                }
                            }
                            RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, i2);
                            cancellableContinuationImpl = cancellableContinuationImplRemoteActionCompatParcelizer;
                            Object result2 = cancellableContinuationImpl.getResult();
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            return result2;
                        } catch (Throwable th2) {
                            th = th2;
                            cancellableContinuationImpl = cancellableContinuationImplRemoteActionCompatParcelizer;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cancellableContinuationImpl = cancellableContinuationImplRemoteActionCompatParcelizer;
                    }
                } else if (andIncrement < bufferedChannel.MediaMetadataCompat()) {
                    resolveunregisterdisplayedmessage.read();
                }
            }
            return Boolean.valueOf(z);
        }

        public final Object write() throws Throwable {
            Object obj = this.IconCompatParcelizer;
            Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatResultReceiverWrapper;
            if (obj == symbol) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("`hasNext()` has not been invoked");
                return null;
            }
            this.IconCompatParcelizer = symbol;
            if (obj != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
                return obj;
            }
            Throwable thMediaDescriptionCompat = BufferedChannel.this.MediaDescriptionCompat();
            int i = StackTraceRecoveryKt.serializer;
            throw thMediaDescriptionCompat;
        }

        public BufferedChannelIterator() {
        }

        @Override // o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w
        public final void RemoteActionCompatParcelizer(Segment segment, int i) {
            CancellableContinuationImpl cancellableContinuationImpl = this.write;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.RemoteActionCompatParcelizer(segment, i);
            }
        }
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final boolean IconCompatParcelizer(Throwable th) {
        return read(th, false);
    }

    public boolean MediaSessionCompatResultReceiverWrapper() {
        return false;
    }

    @Override // o.onBackCancelledlambda3
    public final Object RemoteActionCompatParcelizer(ContinuationImpl continuationImpl) {
        return receive$suspendImpl(this, continuationImpl);
    }

    @Override // o.onBackCancelledlambda3
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public final Object mo5147receiveCatchingJP2dKIU(SuspendLambda suspendLambda) {
        return m5146receiveCatchingJP2dKIU$suspendImpl(this, suspendLambda);
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public Object serializer(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return send$suspendImpl(this, obj, shortNewsContentCardView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlinx.coroutines.CancellableContinuationImpl] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, kotlinx.coroutines.channels.BufferedChannel] */
    public static Object receive$suspendImpl(BufferedChannel bufferedChannel, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage;
        ?? r14;
        CancellableContinuationImpl cancellableContinuationImpl;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaDescriptionCompat;
        atomicReferenceFieldUpdater.getClass();
        if (bufferedChannel == 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return null;
        }
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile((Object) bufferedChannel, MediaMetadataCompat);
        while (!bufferedChannel.PlaybackStateCompatCustomAction()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
            long j = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (resolveunregisterdisplayedmessage3.RatingCompat != j2) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = bufferedChannel.write(j2, resolveunregisterdisplayedmessage3);
                if (resolveunregisterdisplayedmessageWrite == null) {
                    continue;
                } else {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                }
            } else {
                resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessage3;
            }
            Object objWrite = bufferedChannel.write(resolveunregisterdisplayedmessage, i, andIncrement, null);
            Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (objWrite == symbol) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
                return null;
            }
            Symbol symbol2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
            if (objWrite == symbol2) {
                if (andIncrement < bufferedChannel.MediaMetadataCompat()) {
                    resolveunregisterdisplayedmessage.read();
                }
                resolveunregisterdisplayedmessage3 = resolveunregisterdisplayedmessage;
            } else {
                if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                    resolveunregisterdisplayedmessage.read();
                    return objWrite;
                }
                CancellableContinuationImpl cancellableContinuationImplRemoteActionCompatParcelizer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(LoadBalancer$Helper.intercepted(shortNewsContentCardView));
                try {
                    Object objWrite2 = bufferedChannel.write(resolveunregisterdisplayedmessage, i, andIncrement, cancellableContinuationImplRemoteActionCompatParcelizer);
                    try {
                        if (objWrite2 != symbol) {
                            cancellableContinuationImpl = cancellableContinuationImplRemoteActionCompatParcelizer;
                            if (objWrite2 == symbol2) {
                                if (andIncrement < bufferedChannel.MediaMetadataCompat()) {
                                    resolveunregisterdisplayedmessage.read();
                                }
                                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage4 = (resolveUnregisterDisplayedMessage) atomicReferenceFieldUpdater.get(bufferedChannel);
                                while (true) {
                                    if (bufferedChannel.PlaybackStateCompatCustomAction()) {
                                        cancellableContinuationImpl.resumeWith(new isItemDismissable(bufferedChannel.MediaDescriptionCompat()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
                                    long j3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (resolveunregisterdisplayedmessage4.RatingCompat != j4) {
                                        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite2 = bufferedChannel.write(j4, resolveunregisterdisplayedmessage4);
                                        if (resolveunregisterdisplayedmessageWrite2 != null) {
                                            resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessageWrite2;
                                        }
                                    } else {
                                        resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage4;
                                    }
                                    objWrite2 = bufferedChannel.write(resolveunregisterdisplayedmessage2, i2, andIncrement2, cancellableContinuationImpl);
                                    if (objWrite2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                        cancellableContinuationImpl.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage2, i2);
                                        break;
                                    }
                                    if (objWrite2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                                        if (andIncrement2 < bufferedChannel.MediaMetadataCompat()) {
                                            resolveunregisterdisplayedmessage2.read();
                                        }
                                        resolveunregisterdisplayedmessage4 = resolveunregisterdisplayedmessage2;
                                    } else {
                                        if (objWrite2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        resolveunregisterdisplayedmessage2.read();
                                    }
                                }
                            } else {
                                resolveunregisterdisplayedmessage.read();
                            }
                            cancellableContinuationImpl.serializer(objWrite2, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) null);
                            break;
                        }
                        cancellableContinuationImpl = cancellableContinuationImplRemoteActionCompatParcelizer;
                        cancellableContinuationImpl.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, i);
                        Object result = cancellableContinuationImpl.getResult();
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return result;
                    } catch (Throwable th) {
                        th = th;
                        r14 = symbol;
                        r14.MediaMetadataCompat();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r14 = cancellableContinuationImplRemoteActionCompatParcelizer;
                }
            }
        }
        Throwable thMediaDescriptionCompat = bufferedChannel.MediaDescriptionCompat();
        int i3 = StackTraceRecoveryKt.serializer;
        throw thMediaDescriptionCompat;
    }

    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0191 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.CancellableContinuationImpl] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    public static Object send$suspendImpl(BufferedChannel bufferedChannel, Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage;
        ?? Serializer;
        createFromParcel createfromparcel;
        Object result;
        CoroutineSingletons coroutineSingletons;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaSessionCompatToken;
        atomicReferenceFieldUpdater.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(bufferedChannel, ParcelableVolumeInfo);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompatCustomAction;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean z = bufferedChannel.read(andIncrement, false);
            int i = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = resolveunregisterdisplayedmessage3.RatingCompat;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            if (j4 != j3) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageIconCompatParcelizer = bufferedChannel.IconCompatParcelizer(j3, resolveunregisterdisplayedmessage3);
                if (resolveunregisterdisplayedmessageIconCompatParcelizer != null) {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageIconCompatParcelizer;
                } else if (z) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(obj, shortNewsContentCardView);
                    return objOnClosedSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objOnClosedSend : createfromparcel2;
                }
            } else {
                resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessage3;
            }
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage4 = resolveunregisterdisplayedmessage;
            int iSerializer = serializer(bufferedChannel, resolveunregisterdisplayedmessage, i2, obj, j, null, z);
            if (iSerializer == 0) {
                resolveunregisterdisplayedmessage4.read();
                return createfromparcel2;
            }
            if (iSerializer != 1) {
                if (iSerializer == 2) {
                    if (!z) {
                        return createfromparcel2;
                    }
                    resolveunregisterdisplayedmessage4.MediaSessionCompatResultReceiverWrapper();
                    Object objOnClosedSend2 = bufferedChannel.onClosedSend(obj, shortNewsContentCardView);
                    return objOnClosedSend2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objOnClosedSend2 : createfromparcel2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = PlaybackStateCompat;
                if (iSerializer == 3) {
                    CancellableContinuationImpl cancellableContinuationImplRemoteActionCompatParcelizer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(LoadBalancer$Helper.intercepted(shortNewsContentCardView));
                    try {
                        Serializer = serializer(bufferedChannel, resolveunregisterdisplayedmessage4, i2, obj, j, cancellableContinuationImplRemoteActionCompatParcelizer, false);
                        try {
                            if (Serializer != 0) {
                                if (Serializer != 1) {
                                    if (Serializer != 2) {
                                        if (Serializer != 4) {
                                            if (Serializer != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            resolveunregisterdisplayedmessage4.read();
                                            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage5 = (resolveUnregisterDisplayedMessage) atomicReferenceFieldUpdater.get(bufferedChannel);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
                                                long j5 = andIncrement2 & 1152921504606846975L;
                                                boolean z2 = bufferedChannel.read(andIncrement2, false);
                                                int i3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                                                long j6 = i3;
                                                long j7 = j5 / j6;
                                                int i4 = (int) (j5 % j6);
                                                if (resolveunregisterdisplayedmessage5.RatingCompat != j7) {
                                                    resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageIconCompatParcelizer2 = bufferedChannel.IconCompatParcelizer(j7, resolveunregisterdisplayedmessage5);
                                                    if (resolveunregisterdisplayedmessageIconCompatParcelizer2 != null) {
                                                        resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessageIconCompatParcelizer2;
                                                    } else if (z2) {
                                                    }
                                                } else {
                                                    resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage5;
                                                }
                                                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage6 = resolveunregisterdisplayedmessage2;
                                                int iSerializer2 = serializer(bufferedChannel, resolveunregisterdisplayedmessage2, i4, obj, j5, cancellableContinuationImplRemoteActionCompatParcelizer, z2);
                                                if (iSerializer2 == 0) {
                                                    resolveunregisterdisplayedmessage6.read();
                                                } else if (iSerializer2 != 1) {
                                                    if (iSerializer2 != 2) {
                                                        if (iSerializer2 == 3) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        if (iSerializer2 != 4) {
                                                            if (iSerializer2 == 5) {
                                                                resolveunregisterdisplayedmessage6.read();
                                                            }
                                                            resolveunregisterdisplayedmessage5 = resolveunregisterdisplayedmessage6;
                                                        } else if (j5 < atomicLongFieldUpdater2.get(bufferedChannel)) {
                                                            resolveunregisterdisplayedmessage6.read();
                                                        }
                                                    } else if (z2) {
                                                        resolveunregisterdisplayedmessage6.MediaSessionCompatResultReceiverWrapper();
                                                    } else {
                                                        cancellableContinuationImplRemoteActionCompatParcelizer = cancellableContinuationImplRemoteActionCompatParcelizer;
                                                        cancellableContinuationImplRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage6, i4 + i3);
                                                    }
                                                }
                                            }
                                        } else if (j < atomicLongFieldUpdater2.get(bufferedChannel)) {
                                            resolveunregisterdisplayedmessage4.read();
                                        }
                                        write(bufferedChannel, obj, cancellableContinuationImplRemoteActionCompatParcelizer);
                                    } else {
                                        cancellableContinuationImplRemoteActionCompatParcelizer = cancellableContinuationImplRemoteActionCompatParcelizer;
                                        cancellableContinuationImplRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage4, i2 + i);
                                    }
                                    createfromparcel = createfromparcel2;
                                }
                                result = cancellableContinuationImplRemoteActionCompatParcelizer.getResult();
                                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (result != coroutineSingletons) {
                                    result = createfromparcel;
                                }
                                if (result == coroutineSingletons) {
                                    return result;
                                }
                                return createfromparcel;
                            }
                            resolveunregisterdisplayedmessage4.read();
                            createfromparcel = createfromparcel2;
                            cancellableContinuationImplRemoteActionCompatParcelizer.resumeWith(createfromparcel);
                            result = cancellableContinuationImplRemoteActionCompatParcelizer.getResult();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (result != coroutineSingletons) {
                                result = createfromparcel;
                            }
                            if (result == coroutineSingletons) {
                                return result;
                            }
                            return createfromparcel;
                        } catch (Throwable th) {
                            th = th;
                            Serializer.MediaMetadataCompat();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Serializer = cancellableContinuationImplRemoteActionCompatParcelizer;
                    }
                } else if (iSerializer != 4) {
                    if (iSerializer == 5) {
                        resolveunregisterdisplayedmessage4.read();
                    }
                    resolveunregisterdisplayedmessage3 = resolveunregisterdisplayedmessage4;
                } else {
                    if (j < atomicLongFieldUpdater2.get(bufferedChannel)) {
                        resolveunregisterdisplayedmessage4.read();
                    }
                    Object objOnClosedSend3 = bufferedChannel.onClosedSend(obj, shortNewsContentCardView);
                    if (objOnClosedSend3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objOnClosedSend3;
                    }
                }
            }
            return createfromparcel2;
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2;
        Object obj2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read;
        MediaSessionCompatToken.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, ParcelableVolumeInfo);
        while (true) {
            long andIncrement = PlaybackStateCompatCustomAction.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean z = read(andIncrement, false);
            int i = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (resolveunregisterdisplayedmessage3.RatingCompat != j3) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageIconCompatParcelizer = IconCompatParcelizer(j3, resolveunregisterdisplayedmessage3);
                if (resolveunregisterdisplayedmessageIconCompatParcelizer != null) {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageIconCompatParcelizer;
                } else if (z) {
                    return new saveInAppMessageForCarryoverOnUnregister(RatingCompat());
                }
            } else {
                resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessage3;
            }
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage4 = resolveunregisterdisplayedmessage;
            int iSerializer = serializer(this, resolveunregisterdisplayedmessage, i2, obj, j, obj2, z);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (iSerializer == 0) {
                resolveunregisterdisplayedmessage4.read();
                return createfromparcel;
            }
            if (iSerializer != 1) {
                if (iSerializer != 2) {
                    if (iSerializer == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
                        return null;
                    }
                    if (iSerializer == 4) {
                        if (j < PlaybackStateCompat.get(this)) {
                            resolveunregisterdisplayedmessage4.read();
                        }
                        return new saveInAppMessageForCarryoverOnUnregister(RatingCompat());
                    }
                    if (iSerializer == 5) {
                        resolveunregisterdisplayedmessage4.read();
                    }
                    resolveunregisterdisplayedmessage3 = resolveunregisterdisplayedmessage4;
                } else {
                    if (z) {
                        resolveunregisterdisplayedmessage4.MediaSessionCompatResultReceiverWrapper();
                        return new saveInAppMessageForCarryoverOnUnregister(RatingCompat());
                    }
                    r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w = obj2 instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w ? (r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) obj2 : null;
                    if (r8lambdabdpegegfdozfh__syslyzsybo2w != null) {
                        resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage4;
                        r8lambdabdpegegfdozfh__syslyzsybo2w.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage2, i2 + i);
                    } else {
                        resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage4;
                    }
                    write((resolveunregisterdisplayedmessage2.RatingCompat * j2) + ((long) i2));
                }
            }
            return createfromparcel;
        }
    }

    public final boolean IconCompatParcelizer(Object obj, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, int i) {
        setCustomInAppMessageManagerListenerlambda0 setcustominappmessagemanagerlistenerlambda0;
        boolean z = obj instanceof createTouchAwareListener;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (z) {
            return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read((createTouchAwareListener) obj, createfromparcel, null);
        }
        if (!(obj instanceof setBackButtonDismissesInAppMessageViewlambda0)) {
            DrawableTransformation.read(obj, "Unexpected waiter: ");
            return false;
        }
        int iIconCompatParcelizer = ((SelectImplementation) obj).IconCompatParcelizer(this, createfromparcel);
        if (iIconCompatParcelizer == 0) {
            setcustominappmessagemanagerlistenerlambda0 = setCustomInAppMessageManagerListenerlambda0.SUCCESSFUL;
        } else if (iIconCompatParcelizer == 1) {
            setcustominappmessagemanagerlistenerlambda0 = setCustomInAppMessageManagerListenerlambda0.REREGISTER;
        } else if (iIconCompatParcelizer == 2) {
            setcustominappmessagemanagerlistenerlambda0 = setCustomInAppMessageManagerListenerlambda0.CANCELLED;
        } else {
            if (iIconCompatParcelizer != 3) {
                DrawableTransformation.IconCompatParcelizer(iIconCompatParcelizer, "Unexpected internal result: ");
                return false;
            }
            setcustominappmessagemanagerlistenerlambda0 = setCustomInAppMessageManagerListenerlambda0.ALREADY_SELECTED;
        }
        if (setcustominappmessagemanagerlistenerlambda0 == setCustomInAppMessageManagerListenerlambda0.REREGISTER) {
            resolveunregisterdisplayedmessage.read(i, (Object) null);
        }
        return setcustominappmessagemanagerlistenerlambda0 == setCustomInAppMessageManagerListenerlambda0.SUCCESSFUL;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        while (true) {
            MediaDescriptionCompat.getClass();
            Unsafe unsafe = markOnScreenCardsAsRead.serializer;
            long j = MediaMetadataCompat;
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = (resolveUnregisterDisplayedMessage) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
            long j2 = atomicLongFieldUpdater.get(this);
            if (MediaMetadataCompat() <= j2) {
                return false;
            }
            long j3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j4 = j2 / j3;
            if (resolveunregisterdisplayedmessageWrite.RatingCompat == j4 || (resolveunregisterdisplayedmessageWrite = write(j4, resolveunregisterdisplayedmessageWrite)) != null) {
                resolveunregisterdisplayedmessageWrite.read();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objSerializer = resolveunregisterdisplayedmessageWrite.serializer(i);
                    if (objSerializer != null && objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem) {
                        if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read) {
                            if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat && objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer && objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write && objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo) {
                                if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat) {
                                    if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (resolveunregisterdisplayedmessageWrite.serializer(objSerializer, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo)) {
                        IconCompatParcelizer();
                        break;
                    }
                }
                PlaybackStateCompat.compareAndSet(this, j2, j2 + 1);
            } else if (((resolveUnregisterDisplayedMessage) unsafe.getObjectVolatile(this, j)).RatingCompat < j4) {
                return false;
            }
        }
    }

    public final long MediaMetadataCompat() {
        return PlaybackStateCompatCustomAction.get(this) & 1152921504606846975L;
    }

    public final void MediaSessionCompatQueueItem() {
        Object objectVolatile;
        Unsafe unsafe;
        loop0: while (true) {
            MediaSessionCompatQueueItem.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = RatingCompat;
            objectVolatile = unsafe2.getObjectVolatile(this, j);
            Symbol symbol = objectVolatile == null ? r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RemoteActionCompatParcelizer : r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.IconCompatParcelizer;
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, RatingCompat, objectVolatile, symbol)) {
                    break loop0;
                }
            } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
        }
        if (objectVolatile == null) {
            return;
        }
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, objectVolatile}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objectVolatile).invoke(write());
    }

    @Override // o.onBackCancelledlambda3
    public final BufferedChannelIterator MediaSessionCompatToken() {
        return new BufferedChannelIterator();
    }

    public final boolean ParcelableVolumeInfo() {
        return read(PlaybackStateCompatCustomAction.get(this), false);
    }

    public final boolean PlaybackStateCompat() {
        long j = read.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        return read(PlaybackStateCompatCustomAction.get(this), true);
    }

    @Override // o.onBackCancelledlambda3
    public final CallTracer RemoteActionCompatParcelizer() {
        createInAppMessageViewWrapper createinappmessageviewwrapper = createInAppMessageViewWrapper.serializer;
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, createinappmessageviewwrapper}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        r8lambdaU_tgrSZbCW4JiKJ1j3WYFBJ_Fs r8lambdau_tgrszbcw4jikj1j3wyfbj_fs = r8lambdaU_tgrSZbCW4JiKJ1j3WYFBJ_Fs.RemoteActionCompatParcelizer;
        int iWrite3 = BehaviorSubject.BehaviorDisposable.write();
        int iWrite4 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, r8lambdau_tgrszbcw4jikj1j3wyfbj_fs}, BehaviorSubject.BehaviorDisposable.write(), iWrite3, -722072991, 722072991, iWrite4);
        return new CallTracer(this, createinappmessageviewwrapper, r8lambdau_tgrszbcw4jikj1j3wyfbj_fs, (Object) null);
    }

    public final void RemoteActionCompatParcelizer(setBackButtonDismissesInAppMessageViewlambda0 setbackbuttondismissesinappmessageviewlambda0) {
        MediaDescriptionCompat.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaMetadataCompat);
        while (!PlaybackStateCompatCustomAction()) {
            long andIncrement = PlaybackStateCompat.getAndIncrement(this);
            long j = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (resolveunregisterdisplayedmessage.RatingCompat != j2) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = write(j2, resolveunregisterdisplayedmessage);
                if (resolveunregisterdisplayedmessageWrite == null) {
                    continue;
                } else {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                }
            }
            Object objWrite = write(resolveunregisterdisplayedmessage, i, andIncrement, setbackbuttondismissesinappmessageviewlambda0);
            if (objWrite == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w = setbackbuttondismissesinappmessageviewlambda0 instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w ? (r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) setbackbuttondismissesinappmessageviewlambda0 : null;
                if (r8lambdabdpegegfdozfh__syslyzsybo2w != null) {
                    r8lambdabdpegegfdozfh__syslyzsybo2w.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, i);
                    return;
                }
                return;
            }
            if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                if (objWrite == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
                    return;
                } else {
                    resolveunregisterdisplayedmessage.read();
                    ((SelectImplementation) setbackbuttondismissesinappmessageviewlambda0).MediaMetadataCompat = objWrite;
                    return;
                }
            }
            if (andIncrement < MediaMetadataCompat()) {
                resolveunregisterdisplayedmessage.read();
            }
        }
        ((SelectImplementation) setbackbuttondismissesinappmessageviewlambda0).MediaMetadataCompat = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer;
    }

    public final boolean RemoteActionCompatParcelizer(long j) {
        return j < read.get(this) || j < PlaybackStateCompat.get(this) + ((long) this.MediaSessionCompatResultReceiverWrapper);
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public Object b_(Object obj) {
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompatCustomAction;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = read(j, false) ? false : !RemoteActionCompatParcelizer(j & 1152921504606846975L);
        resolveUnregisterDisplayedMessagelambda0 resolveunregisterdisplayedmessagelambda0 = logUnregisterActivity.read;
        if (z) {
            return resolveunregisterdisplayedmessagelambda0;
        }
        Object obj2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat;
        MediaSessionCompatToken.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, ParcelableVolumeInfo);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean z2 = read(andIncrement, false);
            int i = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (resolveunregisterdisplayedmessage3.RatingCompat != j4) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageIconCompatParcelizer = IconCompatParcelizer(j4, resolveunregisterdisplayedmessage3);
                if (resolveunregisterdisplayedmessageIconCompatParcelizer != null) {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageIconCompatParcelizer;
                } else if (z2) {
                    return new saveInAppMessageForCarryoverOnUnregister(RatingCompat());
                }
            } else {
                resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessage3;
            }
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage4 = resolveunregisterdisplayedmessage;
            int iSerializer = serializer(this, resolveunregisterdisplayedmessage, i2, obj, j2, obj2, z2);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (iSerializer == 0) {
                resolveunregisterdisplayedmessage4.read();
                return createfromparcel;
            }
            if (iSerializer == 1) {
                return createfromparcel;
            }
            if (iSerializer == 2) {
                if (z2) {
                    resolveunregisterdisplayedmessage4.MediaSessionCompatResultReceiverWrapper();
                    return new saveInAppMessageForCarryoverOnUnregister(RatingCompat());
                }
                r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w = obj2 instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w ? (r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) obj2 : null;
                if (r8lambdabdpegegfdozfh__syslyzsybo2w != null) {
                    resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage4;
                    r8lambdabdpegegfdozfh__syslyzsybo2w.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage2, i2 + i);
                } else {
                    resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage4;
                }
                resolveunregisterdisplayedmessage2.MediaSessionCompatResultReceiverWrapper();
                return resolveunregisterdisplayedmessagelambda0;
            }
            if (iSerializer == 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
                return null;
            }
            if (iSerializer == 4) {
                if (j2 < PlaybackStateCompat.get(this)) {
                    resolveunregisterdisplayedmessage4.read();
                }
                return new saveInAppMessageForCarryoverOnUnregister(RatingCompat());
            }
            if (iSerializer == 5) {
                resolveunregisterdisplayedmessage4.read();
            }
            resolveunregisterdisplayedmessage3 = resolveunregisterdisplayedmessage4;
        }
    }

    public final Object onClosedSend(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.resumeWith(new isItemDismissable(RatingCompat()));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createFromParcel.INSTANCE;
    }

    @Override // o.onBackCancelledlambda3
    public final Object r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = PlaybackStateCompatCustomAction.get(this);
        if (read(j2, true)) {
            return new saveInAppMessageForCarryoverOnUnregister(write());
        }
        resolveUnregisterDisplayedMessagelambda0 resolveunregisterdisplayedmessagelambda0 = logUnregisterActivity.read;
        if (j >= (j2 & 1152921504606846975L)) {
            return resolveunregisterdisplayedmessagelambda0;
        }
        Object obj = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat;
        MediaDescriptionCompat.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaMetadataCompat);
        while (!PlaybackStateCompatCustomAction()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (resolveunregisterdisplayedmessage.RatingCompat != j4) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = write(j4, resolveunregisterdisplayedmessage);
                if (resolveunregisterdisplayedmessageWrite == null) {
                    continue;
                } else {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                }
            }
            Object objWrite = write(resolveunregisterdisplayedmessage, i, andIncrement, obj);
            if (objWrite == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w = obj instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w ? (r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) obj : null;
                if (r8lambdabdpegegfdozfh__syslyzsybo2w != null) {
                    r8lambdabdpegegfdozfh__syslyzsybo2w.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, i);
                }
                read(andIncrement);
                resolveunregisterdisplayedmessage.MediaSessionCompatResultReceiverWrapper();
                return resolveunregisterdisplayedmessagelambda0;
            }
            if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                    resolveunregisterdisplayedmessage.read();
                    return objWrite;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
                return null;
            }
            if (andIncrement < MediaMetadataCompat()) {
                resolveunregisterdisplayedmessage.read();
            }
        }
        return new saveInAppMessageForCarryoverOnUnregister(write());
    }

    public final resolveUnregisterDisplayedMessage read() {
        serializer.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        Object objectVolatile = unsafe.getObjectVolatile(this, RemoteActionCompatParcelizer);
        MediaSessionCompatToken.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) unsafe.getObjectVolatile(this, ParcelableVolumeInfo);
        if (resolveunregisterdisplayedmessage.RatingCompat > ((resolveUnregisterDisplayedMessage) objectVolatile).RatingCompat) {
            objectVolatile = resolveunregisterdisplayedmessage;
        }
        MediaDescriptionCompat.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = (resolveUnregisterDisplayedMessage) unsafe.getObjectVolatile(this, MediaMetadataCompat);
        if (resolveunregisterdisplayedmessage2.RatingCompat > ((resolveUnregisterDisplayedMessage) objectVolatile).RatingCompat) {
            objectVolatile = resolveunregisterdisplayedmessage2;
        }
        ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ConcurrentLinkedListNode.RemoteActionCompatParcelizer;
            Object objIconCompatParcelizer = concurrentLinkedListNode.IconCompatParcelizer();
            if (objIconCompatParcelizer == ConcurrentLinkedListKt.IconCompatParcelizer) {
                break;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) objIconCompatParcelizer;
            if (concurrentLinkedListNode2 != null) {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            } else if (concurrentLinkedListNode.MediaSessionCompatQueueItem()) {
                break;
            }
        }
        return (resolveUnregisterDisplayedMessage) concurrentLinkedListNode;
    }

    public final void read(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (PlaybackStateCompat()) {
            return;
        }
        do {
            atomicLongFieldUpdater = read;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaMetadataCompat;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = MediaBrowserCompatMediaItem;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // o.onBackCancelledlambda3
    public final CallTracer serializer() {
        r8lambdaEgz7kigdapUBiOSqHWECCSmC2Wo r8lambdaegz7kigdapubiosqhweccsmc2wo = r8lambdaEgz7kigdapUBiOSqHWECCSmC2Wo.write;
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, r8lambdaegz7kigdapubiosqhweccsmc2wo}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        finalizeAnimatingCloseOnUnregister finalizeanimatingcloseonunregister = finalizeAnimatingCloseOnUnregister.read;
        int iWrite3 = BehaviorSubject.BehaviorDisposable.write();
        int iWrite4 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, finalizeanimatingcloseonunregister}, BehaviorSubject.BehaviorDisposable.write(), iWrite3, -722072991, 722072991, iWrite4);
        return new CallTracer(this, r8lambdaegz7kigdapubiosqhweccsmc2wo, finalizeanimatingcloseonunregister, (Object) null);
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Unsafe unsafe;
        long j;
        Unsafe unsafe2;
        do {
            MediaSessionCompatQueueItem.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            j = RatingCompat;
            if (unsafe.compareAndSwapObject(this, j, (Object) null, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                return;
            }
        } while (unsafe.getObjectVolatile(this, j) == null);
        while (true) {
            Object objectVolatile = markOnScreenCardsAsRead.serializer.getObjectVolatile(this, j);
            Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RemoteActionCompatParcelizer;
            if (objectVolatile != symbol) {
                if (objectVolatile == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.IconCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    DrawableTransformation.read(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            Symbol symbol2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.IconCompatParcelizer;
            do {
                unsafe2 = markOnScreenCardsAsRead.serializer;
                if (unsafe2.compareAndSwapObject(this, RatingCompat, symbol, symbol2)) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(write());
                    return;
                }
            } while (unsafe2.getObjectVolatile(this, j) == symbol);
        }
    }

    public final Throwable write() {
        write.getClass();
        return (Throwable) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, IconCompatParcelizer);
    }

    public final resolveUnregisterDisplayedMessage write(long j, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, long j2) {
        Object objRemoteActionCompatParcelizer;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
        logUnregisterActivitylambda0 logunregisteractivitylambda0 = logUnregisterActivitylambda0.serializer;
        loop0: while (true) {
            objRemoteActionCompatParcelizer = ConcurrentLinkedListKt.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, j, logunregisteractivitylambda0);
            if (!SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
                Segment segmentRemoteActionCompatParcelizer = SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = serializer;
                    atomicReferenceFieldUpdater.getClass();
                    Segment segment = (Segment) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RemoteActionCompatParcelizer);
                    if (segment.RatingCompat >= segmentRemoteActionCompatParcelizer.RatingCompat) {
                        break loop0;
                    }
                    if (!segmentRemoteActionCompatParcelizer.PlaybackStateCompat()) {
                        break;
                    }
                    if (MediaSessionCompatQueueItem.IconCompatParcelizer(atomicReferenceFieldUpdater, this, segment, segmentRemoteActionCompatParcelizer)) {
                        if (!segment.RatingCompat()) {
                            break loop0;
                        }
                        segment.MediaBrowserCompatMediaItem();
                        break loop0;
                    }
                    if (segmentRemoteActionCompatParcelizer.RatingCompat()) {
                        segmentRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
            ParcelableVolumeInfo();
            RemoteActionCompatParcelizer(j, resolveunregisterdisplayedmessage);
            read(this);
            return null;
        }
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        long j3 = resolveunregisterdisplayedmessage3.RatingCompat;
        if (j3 <= j) {
            return resolveunregisterdisplayedmessage3;
        }
        long j4 = j3 * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver);
        if (!read.compareAndSet(this, j2 + 1, j4)) {
            read(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatMediaItem;
        if ((atomicLongFieldUpdater.addAndGet(this, j4 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final void write(long j) {
        MediaDescriptionCompat.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaMetadataCompat);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.MediaSessionCompatResultReceiverWrapper) + j2, read.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (resolveunregisterdisplayedmessage.RatingCompat != j4) {
                    resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = write(j4, resolveunregisterdisplayedmessage);
                    if (resolveunregisterdisplayedmessageWrite != null) {
                        resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                    }
                }
                if (write(resolveunregisterdisplayedmessage, i, j2, null) != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                    resolveunregisterdisplayedmessage.read();
                } else if (j2 < MediaMetadataCompat()) {
                    resolveunregisterdisplayedmessage.read();
                }
            }
        }
    }

    public BufferedChannel(int i) {
        this.MediaSessionCompatResultReceiverWrapper = i;
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = read.get(this);
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = new resolveUnregisterDisplayedMessage(0L, null, this, 3);
        this.sendSegment$volatile = resolveunregisterdisplayedmessage2;
        this.receiveSegment$volatile = resolveunregisterdisplayedmessage2;
        if (PlaybackStateCompat()) {
            resolveunregisterdisplayedmessage2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
            resolveunregisterdisplayedmessage2.getClass();
        }
        this.bufferEndSegment$volatile = resolveunregisterdisplayedmessage2;
        this._closeCause$volatile = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompatCustomAction;
    }

    public static void read(BufferedChannel bufferedChannel) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatMediaItem;
        if ((atomicLongFieldUpdater.addAndGet(bufferedChannel, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bufferedChannel) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final resolveUnregisterDisplayedMessage IconCompatParcelizer(long j) {
        long j2;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = read();
        if (MediaSessionCompatResultReceiverWrapper()) {
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessage;
            loop0: while (true) {
                int i = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (resolveunregisterdisplayedmessage2.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver)) + ((long) i);
                        if (j2 >= PlaybackStateCompat.get(this)) {
                            while (true) {
                                Object objSerializer = resolveunregisterdisplayedmessage2.serializer(i);
                                if (objSerializer != null && objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem) {
                                    if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (resolveunregisterdisplayedmessage2.serializer(objSerializer, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                    resolveunregisterdisplayedmessage2.MediaSessionCompatResultReceiverWrapper();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        resolveunregisterdisplayedmessage2 = (resolveUnregisterDisplayedMessage) resolveunregisterdisplayedmessage2.MediaMetadataCompat();
                        if (resolveunregisterdisplayedmessage2 == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                write(j2);
            }
        }
        Object objWrite = null;
        loop3: for (resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = resolveunregisterdisplayedmessage; resolveunregisterdisplayedmessage3 != null; resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) resolveunregisterdisplayedmessage3.MediaMetadataCompat()) {
            for (int i2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver - 1; -1 < i2; i2--) {
                if ((resolveunregisterdisplayedmessage3.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objSerializer2 = resolveunregisterdisplayedmessage3.serializer(i2);
                    if (objSerializer2 != null && objSerializer2 != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem) {
                        if (!(objSerializer2 instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ)) {
                            if (!(objSerializer2 instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w)) {
                                break;
                            }
                            if (resolveunregisterdisplayedmessage3.serializer(objSerializer2, i2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                objWrite = InlineList.write(objWrite, objSerializer2);
                                resolveunregisterdisplayedmessage3.read(i2, true);
                                break;
                            }
                        } else {
                            if (resolveunregisterdisplayedmessage3.serializer(objSerializer2, i2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                objWrite = InlineList.write(objWrite, ((r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) objSerializer2).write);
                                resolveunregisterdisplayedmessage3.read(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (resolveunregisterdisplayedmessage3.serializer(objSerializer2, i2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                            resolveunregisterdisplayedmessage3.MediaSessionCompatResultReceiverWrapper();
                            break;
                        }
                    }
                }
            }
        }
        if (objWrite != null) {
            if (!(objWrite instanceof ArrayList)) {
                RemoteActionCompatParcelizer((r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) objWrite, true);
                return resolveunregisterdisplayedmessage;
            }
            ArrayList arrayList = (ArrayList) objWrite;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                RemoteActionCompatParcelizer((r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) arrayList.get(size), true);
            }
        }
        return resolveunregisterdisplayedmessage;
    }

    public final void RemoteActionCompatParcelizer(r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w, boolean z) {
        if (r8lambdabdpegegfdozfh__syslyzsybo2w instanceof createTouchAwareListener) {
            ((ShortNewsContentCardView) r8lambdabdpegegfdozfh__syslyzsybo2w).resumeWith(new isItemDismissable(z ? MediaDescriptionCompat() : RatingCompat()));
            return;
        }
        if (r8lambdabdpegegfdozfh__syslyzsybo2w instanceof InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult) {
            ((InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult) r8lambdabdpegegfdozfh__syslyzsybo2w).write.resumeWith(new logUnregisterActivity(new saveInAppMessageForCarryoverOnUnregister(write())));
            return;
        }
        if (!(r8lambdabdpegegfdozfh__syslyzsybo2w instanceof BufferedChannelIterator)) {
            if (r8lambdabdpegegfdozfh__syslyzsybo2w instanceof setBackButtonDismissesInAppMessageViewlambda0) {
                ((SelectImplementation) ((setBackButtonDismissesInAppMessageViewlambda0) r8lambdabdpegegfdozfh__syslyzsybo2w)).IconCompatParcelizer(this, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer);
                return;
            } else {
                DrawableTransformation.read(r8lambdabdpegegfdozfh__syslyzsybo2w, "Unexpected waiter: ");
                return;
            }
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) r8lambdabdpegegfdozfh__syslyzsybo2w;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.write;
        cancellableContinuationImpl.getClass();
        bufferedChannelIterator.write = null;
        bufferedChannelIterator.IconCompatParcelizer = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer;
        Throwable thWrite = BufferedChannel.this.write();
        if (thWrite == null) {
            cancellableContinuationImpl.resumeWith(Boolean.FALSE);
        } else {
            cancellableContinuationImpl.resumeWith(new isItemDismissable(thWrite));
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (PlaybackStateCompatCustomAction.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.MediaSessionCompatResultReceiverWrapper + ',');
        sb.append("data=[");
        MediaDescriptionCompat.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        int i2 = 0;
        MediaSessionCompatToken.getClass();
        serializer.getClass();
        List list = SQLite.read(unsafe.getObjectVolatile(this, MediaMetadataCompat), unsafe.getObjectVolatile(this, ParcelableVolumeInfo), unsafe.getObjectVolatile(this, RemoteActionCompatParcelizer));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((resolveUnregisterDisplayedMessage) obj) != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j = ((resolveUnregisterDisplayedMessage) next).RatingCompat;
                do {
                    Object next2 = it.next();
                    long j2 = ((resolveUnregisterDisplayedMessage) next2).RatingCompat;
                    if (j > j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) next;
            long j3 = PlaybackStateCompat.get(this);
            long jMediaMetadataCompat = MediaMetadataCompat();
            loop2: while (true) {
                int i3 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                for (int i4 = i2; i4 < i3; i4++) {
                    long j4 = (resolveunregisterdisplayedmessage.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver)) + ((long) i4);
                    if (j4 >= jMediaMetadataCompat && j4 >= j3) {
                        break loop2;
                    }
                    Object objSerializer = resolveunregisterdisplayedmessage.serializer(i4);
                    Object obj2 = resolveunregisterdisplayedmessage.serializer.get(i4 * 2);
                    if (objSerializer instanceof createTouchAwareListener) {
                        if (j4 < j3 && j4 >= jMediaMetadataCompat) {
                            string = "receive";
                        } else if (j4 < jMediaMetadataCompat && j4 >= j3) {
                            string = "send";
                        } else {
                            string = "cont";
                        }
                    } else if (objSerializer instanceof setBackButtonDismissesInAppMessageViewlambda0) {
                        if (j4 < j3 && j4 >= jMediaMetadataCompat) {
                            string = "onReceive";
                        } else if (j4 < jMediaMetadataCompat && j4 >= j3) {
                            string = "onSend";
                        } else {
                            string = "select";
                        }
                    } else if (objSerializer instanceof InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult) {
                        string = "receiveCatching";
                    } else if (objSerializer instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) {
                        string = "EB(" + objSerializer + ')';
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objSerializer, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY}, getCieXyz.write())).booleanValue()) {
                            string = "resuming_sender";
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objSerializer, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat}, getCieXyz.write())).booleanValue()) {
                                if (objSerializer != null && !objSerializer.equals(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem) && !objSerializer.equals(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write) && !objSerializer.equals(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo) && !objSerializer.equals(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat) && !objSerializer.equals(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat) && !objSerializer.equals(r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                    string = objSerializer.toString();
                                }
                            } else {
                                string = "resuming_sender";
                            }
                        }
                    }
                    if (obj2 != null) {
                        sb.append("(" + string + ',' + obj2 + "),");
                    } else {
                        sb.append(string + ',');
                    }
                }
                resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) resolveunregisterdisplayedmessage.write();
                if (resolveunregisterdisplayedmessage == null) {
                    break;
                }
                i2 = 0;
            }
            if (hideCurrentlyDisplayingInAppMessage.write(sb) == ',') {
                sb.deleteCharAt(sb.length() - 1).getClass();
            }
            sb.append("]");
            return sb.toString();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    public final Object write(resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, int i, long j, Object obj) {
        Object objSerializer = resolveunregisterdisplayedmessage.serializer(i);
        AtomicReferenceArray atomicReferenceArray = resolveunregisterdisplayedmessage.serializer;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompatCustomAction;
        if (objSerializer == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                }
                if (resolveunregisterdisplayedmessage.serializer(objSerializer, i, obj)) {
                    IconCompatParcelizer();
                    return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                }
            }
        } else if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read && resolveunregisterdisplayedmessage.serializer(objSerializer, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write)) {
            IconCompatParcelizer();
            Object obj2 = atomicReferenceArray.get(i * 2);
            resolveunregisterdisplayedmessage.read(i, (Object) null);
            return obj2;
        }
        while (true) {
            Object objSerializer2 = resolveunregisterdisplayedmessage.serializer(i);
            if (objSerializer2 == null || objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (resolveunregisterdisplayedmessage.serializer(objSerializer2, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo)) {
                        IconCompatParcelizer();
                        return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
                    }
                } else {
                    if (obj == null) {
                        return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    }
                    if (resolveunregisterdisplayedmessage.serializer(objSerializer2, i, obj)) {
                        IconCompatParcelizer();
                        return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    }
                }
            } else if (objSerializer2 != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read) {
                Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat;
                if (objSerializer2 == symbol) {
                    return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
                }
                if (objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo) {
                    return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
                }
                if (objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
                    IconCompatParcelizer();
                    return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
                }
                if (objSerializer2 != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat && resolveunregisterdisplayedmessage.serializer(objSerializer2, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)) {
                    boolean z = objSerializer2 instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ;
                    if (z) {
                        objSerializer2 = ((r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) objSerializer2).write;
                    }
                    if (IconCompatParcelizer(objSerializer2, resolveunregisterdisplayedmessage, i)) {
                        resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write);
                        IconCompatParcelizer();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        resolveunregisterdisplayedmessage.read(i, (Object) null);
                        return obj3;
                    }
                    resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, symbol);
                    resolveunregisterdisplayedmessage.MediaSessionCompatResultReceiverWrapper();
                    if (z) {
                        IconCompatParcelizer();
                    }
                    return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem;
                }
            } else if (resolveunregisterdisplayedmessage.serializer(objSerializer2, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write)) {
                IconCompatParcelizer();
                Object obj4 = atomicReferenceArray.get(i * 2);
                resolveunregisterdisplayedmessage.read(i, (Object) null);
                return obj4;
            }
        }
    }

    public final resolveUnregisterDisplayedMessage write(long j, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage) {
        Object objRemoteActionCompatParcelizer;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        Unsafe unsafe;
        logUnregisterActivitylambda0 logunregisteractivitylambda0;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
        logUnregisterActivitylambda0 logunregisteractivitylambda1 = logUnregisterActivitylambda0.serializer;
        loop0: while (true) {
            objRemoteActionCompatParcelizer = ConcurrentLinkedListKt.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, j, logunregisteractivitylambda1);
            if (!SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
                Segment segmentRemoteActionCompatParcelizer = SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                while (true) {
                    MediaDescriptionCompat.getClass();
                    Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
                    long j3 = MediaMetadataCompat;
                    Segment segment = (Segment) unsafe2.getObjectVolatile(this, j3);
                    if (segment.RatingCompat >= segmentRemoteActionCompatParcelizer.RatingCompat) {
                        break loop0;
                    }
                    if (!segmentRemoteActionCompatParcelizer.PlaybackStateCompat()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
                        logunregisteractivitylambda0 = logunregisteractivitylambda1;
                        if (unsafe3.compareAndSwapObject(this, MediaMetadataCompat, segment, segmentRemoteActionCompatParcelizer)) {
                            if (!segment.RatingCompat()) {
                                break loop0;
                            }
                            segment.MediaBrowserCompatMediaItem();
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j3) != segment) {
                            break;
                        }
                        logunregisteractivitylambda1 = logunregisteractivitylambda0;
                    }
                    if (segmentRemoteActionCompatParcelizer.RatingCompat()) {
                        segmentRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                    }
                    logunregisteractivitylambda1 = logunregisteractivitylambda0;
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
            ParcelableVolumeInfo();
            if (resolveunregisterdisplayedmessage.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver) >= MediaMetadataCompat()) {
                return null;
            }
            resolveunregisterdisplayedmessage.read();
            return null;
        }
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        long j4 = resolveunregisterdisplayedmessage3.RatingCompat;
        if (!PlaybackStateCompat() && j <= read.get(this) / ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver)) {
            loop3: while (true) {
                serializer.getClass();
                Unsafe unsafe4 = markOnScreenCardsAsRead.serializer;
                long j5 = RemoteActionCompatParcelizer;
                Segment segment2 = (Segment) unsafe4.getObjectVolatile(this, j5);
                if (segment2.RatingCompat >= j4 || !resolveunregisterdisplayedmessage3.PlaybackStateCompat()) {
                    break;
                }
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, RemoteActionCompatParcelizer, segment2, resolveunregisterdisplayedmessage3)) {
                        if (!segment2.RatingCompat()) {
                            break loop3;
                        }
                        segment2.MediaBrowserCompatMediaItem();
                        break loop3;
                    }
                } while (unsafe.getObjectVolatile(this, j5) == segment2);
                if (resolveunregisterdisplayedmessage3.RatingCompat()) {
                    resolveunregisterdisplayedmessage3.MediaBrowserCompatMediaItem();
                }
            }
        }
        if (j4 <= j) {
            return resolveunregisterdisplayedmessage3;
        }
        long j6 = j4 * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver);
        do {
            atomicLongFieldUpdater = PlaybackStateCompat;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j6));
        if (j4 * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver) < MediaMetadataCompat()) {
            resolveunregisterdisplayedmessage3.read();
        }
        return null;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        ParcelableVolumeInfo = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("sendSegment$volatile"));
        MediaDescriptionCompat = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
        MediaMetadataCompat = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("receiveSegment$volatile"));
        serializer = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
        RemoteActionCompatParcelizer = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("bufferEndSegment$volatile"));
        write = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
        IconCompatParcelizer = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("_closeCause$volatile"));
        MediaSessionCompatQueueItem = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
        RatingCompat = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("closeHandler$volatile"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    public static Object m5146receiveCatchingJP2dKIU$suspendImpl(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i = bufferedChannel$receiveCatching$1.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.read = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bufferedChannel$receiveCatching$2.read;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((logUnregisterActivity) obj).RemoteActionCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MediaDescriptionCompat.getClass();
        if (bufferedChannel == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return null;
        }
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(bufferedChannel, MediaMetadataCompat);
        while (!bufferedChannel.PlaybackStateCompatCustomAction()) {
            long andIncrement = PlaybackStateCompat.getAndIncrement(bufferedChannel);
            long j = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (resolveunregisterdisplayedmessage.RatingCompat != j2) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = bufferedChannel.write(j2, resolveunregisterdisplayedmessage);
                if (resolveunregisterdisplayedmessageWrite == null) {
                    continue;
                } else {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                }
            }
            Object objWrite = bufferedChannel.write(resolveunregisterdisplayedmessage, i3, andIncrement, null);
            if (objWrite == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
                return null;
            }
            if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                    resolveunregisterdisplayedmessage.read();
                    return objWrite;
                }
                bufferedChannel$receiveCatching$2.read = 1;
                Object objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel.m5148receiveCatchingOnNoWaiterSuspendGKJJFZk(resolveunregisterdisplayedmessage, i3, andIncrement, bufferedChannel$receiveCatching$2);
                return objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk == obj2 ? obj2 : objM5148receiveCatchingOnNoWaiterSuspendGKJJFZk;
            }
            if (andIncrement < bufferedChannel.MediaMetadataCompat()) {
                resolveunregisterdisplayedmessage.read();
            }
        }
        return new saveInAppMessageForCarryoverOnUnregister(bufferedChannel.write());
    }

    public static final int serializer(BufferedChannel bufferedChannel, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, int i, Object obj, long j, Object obj2, boolean z) {
        resolveunregisterdisplayedmessage.read(i, obj);
        if (z) {
            return bufferedChannel.serializer(resolveunregisterdisplayedmessage, i, obj, j, obj2, z);
        }
        Object objSerializer = resolveunregisterdisplayedmessage.serializer(i);
        if (objSerializer == null) {
            if (bufferedChannel.RemoteActionCompatParcelizer(j)) {
                if (resolveunregisterdisplayedmessage.serializer(null, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (resolveunregisterdisplayedmessage.serializer(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objSerializer instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) {
            resolveunregisterdisplayedmessage.read(i, (Object) null);
            if (bufferedChannel.serializer(objSerializer, obj)) {
                resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write);
                return 0;
            }
            Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat;
            if (resolveunregisterdisplayedmessage.serializer.getAndSet((i * 2) + 1, symbol) == symbol) {
                return 5;
            }
            resolveunregisterdisplayedmessage.read(i, true);
            return 5;
        }
        return bufferedChannel.serializer(resolveunregisterdisplayedmessage, i, obj, j, obj2, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    public final Object m5148receiveCatchingOnNoWaiterSuspendGKJJFZk(resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, int i, long j, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        logUnregisterActivity logunregisteractivity;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
        }
        Object result = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.serializer = 1;
            CancellableContinuationImpl cancellableContinuationImplRemoteActionCompatParcelizer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(LoadBalancer$Helper.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult inAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult = new InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult(cancellableContinuationImplRemoteActionCompatParcelizer);
                Object objWrite = write(resolveunregisterdisplayedmessage, i, j, inAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult);
                if (objWrite != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    if (objWrite == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                        if (j < MediaMetadataCompat()) {
                            resolveunregisterdisplayedmessage.read();
                        }
                        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = (resolveUnregisterDisplayedMessage) MediaDescriptionCompat.get(this);
                        while (true) {
                            if (PlaybackStateCompatCustomAction()) {
                                cancellableContinuationImplRemoteActionCompatParcelizer.resumeWith(new logUnregisterActivity(new saveInAppMessageForCarryoverOnUnregister(write())));
                                break;
                            }
                            long andIncrement = PlaybackStateCompat.getAndIncrement(this);
                            long j2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (resolveunregisterdisplayedmessage2.RatingCompat != j3) {
                                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = write(j3, resolveunregisterdisplayedmessage2);
                                if (resolveunregisterdisplayedmessageWrite != null) {
                                    resolveunregisterdisplayedmessage2 = resolveunregisterdisplayedmessageWrite;
                                }
                            }
                            Object objWrite2 = write(resolveunregisterdisplayedmessage2, i4, andIncrement, inAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult);
                            if (objWrite2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                inAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage2, i4);
                                break;
                            }
                            if (objWrite2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatQueueItem) {
                                if (andIncrement < MediaMetadataCompat()) {
                                    resolveunregisterdisplayedmessage2.read();
                                }
                            } else {
                                if (objWrite2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                                    throw new IllegalStateException("unexpected");
                                }
                                resolveunregisterdisplayedmessage2.read();
                                logunregisteractivity = new logUnregisterActivity(objWrite2);
                            }
                        }
                    } else {
                        resolveunregisterdisplayedmessage.read();
                        logunregisteractivity = new logUnregisterActivity(objWrite);
                    }
                    cancellableContinuationImplRemoteActionCompatParcelizer.serializer(logunregisteractivity, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) null);
                    break;
                }
                inAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, i);
                result = cancellableContinuationImplRemoteActionCompatParcelizer.getResult();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (result == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                cancellableContinuationImplRemoteActionCompatParcelizer.MediaMetadataCompat();
                throw th;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(result);
        }
        return ((logUnregisterActivity) result).RemoteActionCompatParcelizer;
    }

    public final boolean serializer(Object obj, Object obj2) {
        if (obj instanceof setBackButtonDismissesInAppMessageViewlambda0) {
            return ((SelectImplementation) ((setBackButtonDismissesInAppMessageViewlambda0) obj)).IconCompatParcelizer(this, obj2) == 0;
        }
        if (obj instanceof InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult) {
            return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read(((InAppMessageActivityTransitionCoordinatorUnregisterDisplayedMessageResult) obj).write, new logUnregisterActivity(obj2), null);
        }
        if (!(obj instanceof BufferedChannelIterator)) {
            if (obj instanceof createTouchAwareListener) {
                return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read((createTouchAwareListener) obj, obj2, null);
            }
            DrawableTransformation.read(obj, "Unexpected receiver type: ");
            return false;
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) obj;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.write;
        cancellableContinuationImpl.getClass();
        bufferedChannelIterator.write = null;
        bufferedChannelIterator.IconCompatParcelizer = obj2;
        Boolean bool = Boolean.TRUE;
        BufferedChannel.this.getClass();
        return r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read(cancellableContinuationImpl, bool, null);
    }

    public static final void write(BufferedChannel bufferedChannel, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
        cancellableContinuationImpl.resumeWith(new isItemDismissable(bufferedChannel.RatingCompat()));
    }

    public final resolveUnregisterDisplayedMessage IconCompatParcelizer(long j, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage) {
        Object objRemoteActionCompatParcelizer;
        long j2;
        logUnregisterActivitylambda0 logunregisteractivitylambda0;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
        logUnregisterActivitylambda0 logunregisteractivitylambda1 = logUnregisterActivitylambda0.serializer;
        loop0: while (true) {
            objRemoteActionCompatParcelizer = ConcurrentLinkedListKt.RemoteActionCompatParcelizer(resolveunregisterdisplayedmessage, j, logunregisteractivitylambda1);
            if (!SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
                Segment segmentRemoteActionCompatParcelizer = SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                while (true) {
                    MediaSessionCompatToken.getClass();
                    Unsafe unsafe = markOnScreenCardsAsRead.serializer;
                    long j3 = ParcelableVolumeInfo;
                    Segment segment = (Segment) unsafe.getObjectVolatile(this, j3);
                    if (segment.RatingCompat >= segmentRemoteActionCompatParcelizer.RatingCompat) {
                        break loop0;
                    }
                    if (!segmentRemoteActionCompatParcelizer.PlaybackStateCompat()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
                        logunregisteractivitylambda0 = logunregisteractivitylambda1;
                        if (unsafe2.compareAndSwapObject(this, ParcelableVolumeInfo, segment, segmentRemoteActionCompatParcelizer)) {
                            if (!segment.RatingCompat()) {
                                break loop0;
                            }
                            segment.MediaBrowserCompatMediaItem();
                            break loop0;
                        }
                        if (unsafe2.getObjectVolatile(this, j3) != segment) {
                            break;
                        }
                        logunregisteractivitylambda1 = logunregisteractivitylambda0;
                    }
                    if (segmentRemoteActionCompatParcelizer.RatingCompat()) {
                        segmentRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                    }
                    logunregisteractivitylambda1 = logunregisteractivitylambda0;
                }
            } else {
                break;
            }
        }
        boolean zIconCompatParcelizer = SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer);
        AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
        if (zIconCompatParcelizer) {
            ParcelableVolumeInfo();
            if (resolveunregisterdisplayedmessage.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver) >= atomicLongFieldUpdater.get(this)) {
                return null;
            }
            resolveunregisterdisplayedmessage.read();
            return null;
        }
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        long j4 = resolveunregisterdisplayedmessage3.RatingCompat;
        if (j4 <= j) {
            return resolveunregisterdisplayedmessage3;
        }
        long j5 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = PlaybackStateCompatCustomAction;
            long j6 = atomicLongFieldUpdater2.get(this);
            long j7 = 1152921504606846975L & j6;
            if (j7 >= j4 * j5) {
                j2 = j4;
                break;
            }
            j2 = j4;
            if (atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + (((long) ((int) (j6 >> 60))) << 60))) {
                break;
            }
            j4 = j2;
        }
        if (j2 * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver) < atomicLongFieldUpdater.get(this)) {
            resolveunregisterdisplayedmessage3.read();
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(long j, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage) {
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage2;
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage3;
        while (resolveunregisterdisplayedmessage.RatingCompat < j && (resolveunregisterdisplayedmessage3 = (resolveUnregisterDisplayedMessage) resolveunregisterdisplayedmessage.write()) != null) {
            resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessage3;
        }
        while (true) {
            if (!resolveunregisterdisplayedmessage.MediaDescriptionCompat() || (resolveunregisterdisplayedmessage2 = (resolveUnregisterDisplayedMessage) resolveunregisterdisplayedmessage.write()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = serializer;
                    atomicReferenceFieldUpdater.getClass();
                    Segment segment = (Segment) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RemoteActionCompatParcelizer);
                    if (segment.RatingCompat >= resolveunregisterdisplayedmessage.RatingCompat) {
                        return;
                    }
                    if (!resolveunregisterdisplayedmessage.PlaybackStateCompat()) {
                        break;
                    }
                    if (IconCompatParcelizer.read(atomicReferenceFieldUpdater, this, segment, resolveunregisterdisplayedmessage)) {
                        if (segment.RatingCompat()) {
                            segment.MediaBrowserCompatMediaItem();
                            return;
                        }
                        return;
                    } else if (resolveunregisterdisplayedmessage.RatingCompat()) {
                        resolveunregisterdisplayedmessage.MediaBrowserCompatMediaItem();
                    }
                }
            } else {
                resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessage2;
            }
        }
    }

    @Override // o.onBackCancelledlambda3
    public final void write(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        read((Throwable) cancellationException, true);
    }

    public final void IconCompatParcelizer() {
        if (PlaybackStateCompat()) {
            return;
        }
        serializer.getClass();
        resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = (resolveUnregisterDisplayedMessage) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RemoteActionCompatParcelizer);
        while (true) {
            long andIncrement = read.getAndIncrement(this);
            long j = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver;
            long j2 = andIncrement / j;
            if (MediaMetadataCompat() <= andIncrement) {
                if (resolveunregisterdisplayedmessage.RatingCompat < j2 && resolveunregisterdisplayedmessage.write() != null) {
                    RemoteActionCompatParcelizer(j2, resolveunregisterdisplayedmessage);
                }
                read(this);
                return;
            }
            if (resolveunregisterdisplayedmessage.RatingCompat != j2) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageWrite = write(j2, resolveunregisterdisplayedmessage, andIncrement);
                if (resolveunregisterdisplayedmessageWrite == null) {
                    continue;
                } else {
                    resolveunregisterdisplayedmessage = resolveunregisterdisplayedmessageWrite;
                }
            }
            int i = (int) (andIncrement % j);
            Object objSerializer = resolveunregisterdisplayedmessage.serializer(i);
            boolean z = objSerializer instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w;
            AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
            if (!z || andIncrement < atomicLongFieldUpdater.get(this) || !resolveunregisterdisplayedmessage.serializer(objSerializer, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat)) {
                while (true) {
                    Object objSerializer2 = resolveunregisterdisplayedmessage.serializer(i);
                    if (objSerializer2 instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) {
                        if (andIncrement < atomicLongFieldUpdater.get(this)) {
                            if (resolveunregisterdisplayedmessage.serializer(objSerializer2, i, new r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ((r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) objSerializer2))) {
                                read(this);
                                return;
                            }
                        } else if (resolveunregisterdisplayedmessage.serializer(objSerializer2, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat)) {
                            if (!IconCompatParcelizer(objSerializer2, resolveunregisterdisplayedmessage, i)) {
                                resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat);
                                resolveunregisterdisplayedmessage.MediaSessionCompatResultReceiverWrapper();
                                break;
                            } else {
                                resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read);
                                read(this);
                                return;
                            }
                        }
                    } else {
                        if (objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat) {
                            break;
                        }
                        if (objSerializer2 == null) {
                            if (resolveunregisterdisplayedmessage.serializer(objSerializer2, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem)) {
                                read(this);
                                return;
                            }
                        } else if (objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read || objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo || objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write || objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat || objSerializer2 == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
                            read(this);
                            return;
                        } else if (objSerializer2 != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                            DrawableTransformation.read(objSerializer2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                read(this);
            } else if (IconCompatParcelizer(objSerializer, resolveunregisterdisplayedmessage, i)) {
                resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read);
                read(this);
                return;
            } else {
                resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat);
                resolveunregisterdisplayedmessage.MediaSessionCompatResultReceiverWrapper();
                read(this);
            }
        }
    }

    public final boolean read(Throwable th, boolean z) {
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompatCustomAction;
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaSessionCompatToken;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 1152921504606846976L + (j4 & 1152921504606846975L)));
        }
        Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompatCustomAction;
        while (true) {
            write.getClass();
            Unsafe unsafe = markOnScreenCardsAsRead.serializer;
            long j5 = IconCompatParcelizer;
            if (unsafe.compareAndSwapObject(this, j5, symbol, th)) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(this, j5) != symbol) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        }
        ParcelableVolumeInfo();
        if (z2) {
            MediaSessionCompatQueueItem();
        }
        return z2;
    }

    public final Throwable MediaDescriptionCompat() {
        Throwable thWrite = write();
        return thWrite == null ? new ClosedReceiveChannelException() : thWrite;
    }

    public final int serializer(resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objSerializer = resolveunregisterdisplayedmessage.serializer(i);
            if (objSerializer == null) {
                if (!RemoteActionCompatParcelizer(j) || z) {
                    if (z) {
                        if (resolveunregisterdisplayedmessage.serializer(null, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaDescriptionCompat)) {
                            resolveunregisterdisplayedmessage.MediaSessionCompatResultReceiverWrapper();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (resolveunregisterdisplayedmessage.serializer(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (resolveunregisterdisplayedmessage.serializer(null, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read)) {
                    break;
                }
            } else {
                if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem) {
                    Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.RatingCompat;
                    if (objSerializer == symbol) {
                        resolveunregisterdisplayedmessage.read(i, (Object) null);
                        return 5;
                    }
                    if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ParcelableVolumeInfo) {
                        resolveunregisterdisplayedmessage.read(i, (Object) null);
                        return 5;
                    }
                    if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer) {
                        resolveunregisterdisplayedmessage.read(i, (Object) null);
                        ParcelableVolumeInfo();
                        return 4;
                    }
                    resolveunregisterdisplayedmessage.read(i, (Object) null);
                    if (objSerializer instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) {
                        objSerializer = ((r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) objSerializer).write;
                    }
                    if (serializer(objSerializer, obj)) {
                        resolveunregisterdisplayedmessage.RemoteActionCompatParcelizer(i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write);
                        return 0;
                    }
                    if (resolveunregisterdisplayedmessage.serializer.getAndSet((i * 2) + 1, symbol) != symbol) {
                        resolveunregisterdisplayedmessage.read(i, true);
                    }
                    return 5;
                }
                if (resolveunregisterdisplayedmessage.serializer(objSerializer, i, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final Throwable RatingCompat() {
        Throwable thWrite = write();
        return thWrite == null ? new ClosedSendChannelException("Channel was closed") : thWrite;
    }

    public final boolean read(long j, boolean z) {
        r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w;
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                IconCompatParcelizer(j & 1152921504606846975L);
                if (!z || !MediaBrowserCompatMediaItem()) {
                }
            } else if (i == 3) {
                resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessageIconCompatParcelizer = IconCompatParcelizer(j & 1152921504606846975L);
                Object objWrite = null;
                loop0: do {
                    for (int i2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver - 1; -1 < i2; i2--) {
                        long j2 = (resolveunregisterdisplayedmessageIconCompatParcelizer.RatingCompat * ((long) r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.ResultReceiver)) + ((long) i2);
                        while (true) {
                            Object objSerializer = resolveunregisterdisplayedmessageIconCompatParcelizer.serializer(i2);
                            if (objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.write) {
                                break loop0;
                            }
                            Symbol symbol = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.read;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = PlaybackStateCompat;
                            if (objSerializer == symbol) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (resolveunregisterdisplayedmessageIconCompatParcelizer.serializer(objSerializer, i2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                    resolveunregisterdisplayedmessageIconCompatParcelizer.read(i2, (Object) null);
                                    resolveunregisterdisplayedmessageIconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                                    break;
                                }
                            } else if (objSerializer != r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.MediaBrowserCompatMediaItem && objSerializer != null) {
                                if (!(objSerializer instanceof r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) && !(objSerializer instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ)) {
                                    Symbol symbol2 = r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.PlaybackStateCompat;
                                    if (objSerializer == symbol2 || objSerializer == r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                                        break loop0;
                                    }
                                    if (objSerializer != symbol2) {
                                        break;
                                    }
                                } else {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    if (objSerializer instanceof r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) {
                                        r8lambdabdpegegfdozfh__syslyzsybo2w = ((r8lambdaWt1pWTP24_MzoygVHq2evhx_yAQ) objSerializer).write;
                                    } else {
                                        r8lambdabdpegegfdozfh__syslyzsybo2w = (r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) objSerializer;
                                    }
                                    if (resolveunregisterdisplayedmessageIconCompatParcelizer.serializer(objSerializer, i2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                        objWrite = InlineList.write(objWrite, r8lambdabdpegegfdozfh__syslyzsybo2w);
                                        resolveunregisterdisplayedmessageIconCompatParcelizer.read(i2, (Object) null);
                                        resolveunregisterdisplayedmessageIconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                                        break;
                                    }
                                }
                            } else if (resolveunregisterdisplayedmessageIconCompatParcelizer.serializer(objSerializer, i2, r8lambdaW8pcXKY4YjqSexhPF0JPgYbQRPw.serializer)) {
                                resolveunregisterdisplayedmessageIconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                                break;
                            }
                        }
                    }
                    resolveunregisterdisplayedmessageIconCompatParcelizer = (resolveUnregisterDisplayedMessage) resolveunregisterdisplayedmessageIconCompatParcelizer.MediaMetadataCompat();
                } while (resolveunregisterdisplayedmessageIconCompatParcelizer != null);
                if (objWrite != null) {
                    if (!(objWrite instanceof ArrayList)) {
                        RemoteActionCompatParcelizer((r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) objWrite, false);
                    } else {
                        ArrayList arrayList = (ArrayList) objWrite;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            RemoteActionCompatParcelizer((r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w) arrayList.get(size), false);
                        }
                    }
                }
            } else {
                DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(i, "unexpected close status: "));
                return false;
            }
            return true;
        }
        return false;
    }
}
