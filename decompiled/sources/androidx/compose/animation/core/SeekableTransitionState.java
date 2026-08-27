package androidx.compose.animation.core;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.CompositionKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.sync.MutexImpl;
import o.Box;
import o.ContentInViewNode;
import o.FillElement;
import o.FillNode;
import o.FlowLayoutKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.align;
import o.calculateCentroidSize;
import o.createFromParcel;
import o.cubicTo;
import o.getCieXyz;
import o.getContentCaptureSessionui;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getPersonFullName;
import o.matchParentSize;
import o.onShowTranslationui;
import o.populate;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.requiredHeightInVpY3zN4default;
import o.setSpread;
import o.tryMinHeightJN0ABg;
import o.widthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public final class SeekableTransitionState extends TransitionState {
    public static final calculateCentroidSize serializer = new calculateCentroidSize(0.0f);
    public static final calculateCentroidSize write = new calculateCentroidSize(1.0f);
    public setSpread ComponentActivity;
    public CancellableContinuationImpl IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final MutexImpl MediaDescriptionCompat;
    public FlowLayoutKt MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public final ContentInViewNode MediaSessionCompatResultReceiverWrapper;
    public final populate MediaSessionCompatToken;
    public long ParcelableVolumeInfo;
    public final tryMinHeightJN0ABg PlaybackStateCompat;
    public final CoroutineLiveData$$ExternalSyntheticLambda0 PlaybackStateCompatCustomAction;
    public final align RatingCompat;
    public final align RemoteActionCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 ResultReceiver;
    public Transition r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public Object read;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final /* synthetic */ Object IconCompatParcelizer;
        public final /* synthetic */ SeekableTransitionState RatingCompat;
        public final /* synthetic */ float RemoteActionCompatParcelizer;
        public final /* synthetic */ Transition read;
        public final /* synthetic */ Object serializer;
        public int write;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            public final /* synthetic */ Transition IconCompatParcelizer;
            public final /* synthetic */ SeekableTransitionState MediaDescriptionCompat;
            public int MediaSessionCompatQueueItem;
            public /* synthetic */ Object RemoteActionCompatParcelizer;
            public final /* synthetic */ Object read;
            public final /* synthetic */ float serializer;
            public final /* synthetic */ Object write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f, ShortNewsContentCardView shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.read = obj;
                this.write = obj2;
                this.MediaDescriptionCompat = seekableTransitionState;
                this.IconCompatParcelizer = transition;
                this.serializer = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, this.write, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
                anonymousClass1.RemoteActionCompatParcelizer = obj;
                return anonymousClass1;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.MediaSessionCompatQueueItem;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                SeekableTransitionState seekableTransitionState = this.MediaDescriptionCompat;
                int i2 = 1;
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
                    Object obj2 = this.read;
                    Object obj3 = this.write;
                    int iWrite = getCieXyz.write();
                    int iWrite2 = getCieXyz.write();
                    int iWrite3 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj2, obj3}, iWrite3)).booleanValue()) {
                        seekableTransitionState.MediaMetadataCompat = null;
                        Object[] objArr = {((onShowTranslationui) seekableTransitionState.MediaBrowserCompatMediaItem).getValue(), obj2};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            return createfromparcel;
                        }
                    } else {
                        SeekableTransitionState.IconCompatParcelizer(seekableTransitionState);
                    }
                    int iWrite4 = getCieXyz.write();
                    int iWrite5 = getCieXyz.write();
                    int iWrite6 = getCieXyz.write();
                    boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{obj2, obj3}, iWrite6)).booleanValue();
                    float f = this.serializer;
                    if (!zBooleanValue) {
                        Transition transition = this.IconCompatParcelizer;
                        transition.updateTarget$animation_core(obj2);
                        transition.serializer(0L);
                        ((onShowTranslationui) seekableTransitionState.ResultReceiver).setValue(obj2);
                        transition.resetAnimationFraction$animation_core(f);
                    }
                    seekableTransitionState.IconCompatParcelizer(f);
                    if (seekableTransitionState.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BlockRunner$cancel$1(seekableTransitionState, shortNewsContentCardView, i2), 3);
                    } else {
                        seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
                    }
                    this.MediaSessionCompatQueueItem = 1;
                    if (SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(seekableTransitionState, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                seekableTransitionState.MediaSessionCompatQueueItem();
                return createfromparcel;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f, ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.serializer = obj;
            this.IconCompatParcelizer = obj2;
            this.RatingCompat = seekableTransitionState;
            this.read = transition;
            this.RemoteActionCompatParcelizer = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass3(this.serializer, this.IconCompatParcelizer, this.RatingCompat, this.read, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.write;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.serializer, this.IconCompatParcelizer, this.RatingCompat, this.read, this.RemoteActionCompatParcelizer, null);
                this.write = 1;
                if (YieldKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v7, types: [o.align] */
    /* JADX WARN: Type inference failed for: r4v8, types: [o.align] */
    public SeekableTransitionState(cubicTo cubicto) {
        super(0);
        final int i = 0;
        this.ResultReceiver = CompositionKt.RemoteActionCompatParcelizer(cubicto);
        this.MediaBrowserCompatMediaItem = CompositionKt.RemoteActionCompatParcelizer(cubicto);
        this.read = cubicto;
        this.PlaybackStateCompatCustomAction = new CoroutineLiveData$$ExternalSyntheticLambda0(4, this);
        this.MediaSessionCompatToken = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
        this.MediaDescriptionCompat = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.PlaybackStateCompat = new tryMinHeightJN0ABg();
        this.ParcelableVolumeInfo = Long.MIN_VALUE;
        this.MediaSessionCompatResultReceiverWrapper = new ContentInViewNode();
        this.RatingCompat = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.align
            public final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i2 = i;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                androidx.compose.animation.core.SeekableTransitionState seekableTransitionState = this.write;
                long jLongValue = ((Long) obj).longValue();
                if (i2 == 0) {
                    seekableTransitionState.ParcelableVolumeInfo = jLongValue;
                    return createfromparcel;
                }
                long j = seekableTransitionState.ParcelableVolumeInfo;
                seekableTransitionState.ParcelableVolumeInfo = jLongValue;
                long j2 = MathKt.read((jLongValue - j) / ((double) seekableTransitionState.MediaSessionCompatQueueItem));
                ContentInViewNode contentInViewNode = seekableTransitionState.MediaSessionCompatResultReceiverWrapper;
                if (contentInViewNode.RemoteActionCompatParcelizer()) {
                    Object[] objArr = contentInViewNode.read;
                    int i3 = contentInViewNode.IconCompatParcelizer;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        FlowLayoutKt flowLayoutKt = (FlowLayoutKt) objArr[i5];
                        androidx.compose.animation.core.SeekableTransitionState.IconCompatParcelizer(flowLayoutKt, j2);
                        flowLayoutKt.RemoteActionCompatParcelizer = true;
                    }
                    androidx.compose.animation.core.Transition transition = seekableTransitionState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core();
                    }
                    int i6 = contentInViewNode.IconCompatParcelizer;
                    Object[] objArr2 = contentInViewNode.read;
                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i6)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                    int i7 = ensuresubscribedtoinappmessageeventslambda7.write;
                    int i8 = ensuresubscribedtoinappmessageeventslambda7.read;
                    if (i7 <= i8) {
                        while (true) {
                            objArr2[i7 - i4] = objArr2[i7];
                            if (((FlowLayoutKt) objArr2[i7]).RemoteActionCompatParcelizer) {
                                i4++;
                            }
                            if (i7 == i8) {
                                break;
                            }
                            i7++;
                        }
                    }
                    onContentCardClicked.write(i6 - i4, i6, null, objArr2);
                    contentInViewNode.IconCompatParcelizer -= i4;
                }
                FlowLayoutKt flowLayoutKt2 = seekableTransitionState.MediaMetadataCompat;
                if (flowLayoutKt2 != null) {
                    flowLayoutKt2.write = seekableTransitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    androidx.compose.animation.core.SeekableTransitionState.IconCompatParcelizer(flowLayoutKt2, j2);
                    seekableTransitionState.IconCompatParcelizer(flowLayoutKt2.RatingCompat);
                    if (flowLayoutKt2.RatingCompat == 1.0f) {
                        seekableTransitionState.MediaMetadataCompat = null;
                    }
                    seekableTransitionState.MediaSessionCompatQueueItem();
                }
                return createfromparcel;
            }
        };
        final int i2 = 1;
        this.RemoteActionCompatParcelizer = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.align
            public final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = i2;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                androidx.compose.animation.core.SeekableTransitionState seekableTransitionState = this.write;
                long jLongValue = ((Long) obj).longValue();
                if (i3 == 0) {
                    seekableTransitionState.ParcelableVolumeInfo = jLongValue;
                    return createfromparcel;
                }
                long j = seekableTransitionState.ParcelableVolumeInfo;
                seekableTransitionState.ParcelableVolumeInfo = jLongValue;
                long j2 = MathKt.read((jLongValue - j) / ((double) seekableTransitionState.MediaSessionCompatQueueItem));
                ContentInViewNode contentInViewNode = seekableTransitionState.MediaSessionCompatResultReceiverWrapper;
                if (contentInViewNode.RemoteActionCompatParcelizer()) {
                    Object[] objArr = contentInViewNode.read;
                    int i4 = contentInViewNode.IconCompatParcelizer;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        FlowLayoutKt flowLayoutKt = (FlowLayoutKt) objArr[i6];
                        androidx.compose.animation.core.SeekableTransitionState.IconCompatParcelizer(flowLayoutKt, j2);
                        flowLayoutKt.RemoteActionCompatParcelizer = true;
                    }
                    androidx.compose.animation.core.Transition transition = seekableTransitionState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core();
                    }
                    int i7 = contentInViewNode.IconCompatParcelizer;
                    Object[] objArr2 = contentInViewNode.read;
                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i7)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                    int i8 = ensuresubscribedtoinappmessageeventslambda7.write;
                    int i9 = ensuresubscribedtoinappmessageeventslambda7.read;
                    if (i8 <= i9) {
                        while (true) {
                            objArr2[i8 - i5] = objArr2[i8];
                            if (((FlowLayoutKt) objArr2[i8]).RemoteActionCompatParcelizer) {
                                i5++;
                            }
                            if (i8 == i9) {
                                break;
                            }
                            i8++;
                        }
                    }
                    onContentCardClicked.write(i7 - i5, i7, null, objArr2);
                    contentInViewNode.IconCompatParcelizer -= i5;
                }
                FlowLayoutKt flowLayoutKt2 = seekableTransitionState.MediaMetadataCompat;
                if (flowLayoutKt2 != null) {
                    flowLayoutKt2.write = seekableTransitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    androidx.compose.animation.core.SeekableTransitionState.IconCompatParcelizer(flowLayoutKt2, j2);
                    seekableTransitionState.IconCompatParcelizer(flowLayoutKt2.RatingCompat);
                    if (flowLayoutKt2.RatingCompat == 1.0f) {
                        seekableTransitionState.MediaMetadataCompat = null;
                    }
                    seekableTransitionState.MediaSessionCompatQueueItem();
                }
                return createfromparcel;
            }
        };
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void write() {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        setSpread setspread = this.ComponentActivity;
        if (setspread != null) {
            setspread.RemoteActionCompatParcelizer(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object access$runAnimations(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        FillNode fillNode;
        ContentInViewNode contentInViewNode = seekableTransitionState.MediaSessionCompatResultReceiverWrapper;
        if (continuationImpl instanceof FillNode) {
            fillNode = (FillNode) continuationImpl;
            int i = fillNode.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                fillNode.write = i - Integer.MIN_VALUE;
            } else {
                fillNode = new FillNode(seekableTransitionState, continuationImpl);
            }
        } else {
            fillNode = new FillNode(seekableTransitionState, continuationImpl);
        }
        Object obj = fillNode.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fillNode.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (contentInViewNode.write() && seekableTransitionState.MediaMetadataCompat == null) {
                return createfromparcel;
            }
            if (SuspendAnimationKt.read(fillNode.getContext()) == 0.0f) {
                seekableTransitionState.read();
                seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
                return createfromparcel;
            }
            if (seekableTransitionState.ParcelableVolumeInfo == Long.MIN_VALUE) {
                align alignVar = seekableTransitionState.RatingCompat;
                fillNode.write = 1;
                if (TextStreamsKt.read(fillNode.getContext()).withFrameNanos(alignVar, fillNode) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        do {
            if (!contentInViewNode.RemoteActionCompatParcelizer() && seekableTransitionState.MediaMetadataCompat == null) {
                seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
                return createfromparcel;
            }
            fillNode.write = 2;
        } while (seekableTransitionState.animateOneFrame(fillNode) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object access$waitForComposition(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        FillElement fillElement;
        Object value;
        Object obj;
        MutexImpl mutexImpl = seekableTransitionState.MediaDescriptionCompat;
        if (continuationImpl instanceof FillElement) {
            fillElement = (FillElement) continuationImpl;
            int i = fillElement.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                fillElement.write = i - Integer.MIN_VALUE;
            } else {
                fillElement = new FillElement(seekableTransitionState, continuationImpl);
            }
        } else {
            fillElement = new FillElement(seekableTransitionState, continuationImpl);
        }
        Object obj2 = fillElement.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fillElement.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            value = ((onShowTranslationui) seekableTransitionState.ResultReceiver).getValue();
            fillElement.serializer = value;
            fillElement.write = 1;
            if (mutexImpl.lock(fillElement) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            Object obj3 = fillElement.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = fillElement.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, obj}, getCieXyz.write())).booleanValue()) {
            return createFromParcel.INSTANCE;
        }
        seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        fillElement.serializer = value;
        fillElement.write = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(fillElement));
        cancellableContinuationImpl.read();
        seekableTransitionState.IconCompatParcelizer = cancellableContinuationImpl;
        mutexImpl.write(null);
        Object result = cancellableContinuationImpl.getResult();
        if (result != coroutineSingletons) {
            obj = value;
            obj2 = result;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, obj}, getCieXyz.write())).booleanValue()) {
                return createFromParcel.INSTANCE;
            }
            seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00cd, please report this as an issue */
    public static final Object access$waitForCompositionAfterTargetStateChange(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        matchParentSize matchparentsize;
        Object value;
        Object obj;
        MutexImpl mutexImpl = seekableTransitionState.MediaDescriptionCompat;
        if (continuationImpl instanceof matchParentSize) {
            matchparentsize = (matchParentSize) continuationImpl;
            int i = matchparentsize.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                matchparentsize.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                matchparentsize = new matchParentSize(seekableTransitionState, continuationImpl);
            }
        } else {
            matchparentsize = new matchParentSize(seekableTransitionState, continuationImpl);
        }
        Object obj2 = matchparentsize.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = matchparentsize.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            value = ((onShowTranslationui) seekableTransitionState.ResultReceiver).getValue();
            matchparentsize.IconCompatParcelizer = value;
            matchparentsize.RemoteActionCompatParcelizer = 1;
            if (mutexImpl.lock(matchparentsize) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            Object obj3 = matchparentsize.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = matchparentsize.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, obj}, getCieXyz.write())).booleanValue()) {
            seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return createFromParcel.INSTANCE;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{value, seekableTransitionState.read}, getCieXyz.write())).booleanValue()) {
            matchparentsize.IconCompatParcelizer = value;
            matchparentsize.RemoteActionCompatParcelizer = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(matchparentsize));
            cancellableContinuationImpl.read();
            seekableTransitionState.IconCompatParcelizer = cancellableContinuationImpl;
            mutexImpl.write(null);
            Object result = cancellableContinuationImpl.getResult();
            if (result != coroutineSingletons) {
                obj = value;
                obj2 = result;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, obj}, getCieXyz.write())).booleanValue()) {
                    seekableTransitionState.ParcelableVolumeInfo = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return coroutineSingletons;
        }
        mutexImpl.write(null);
        return createFromParcel.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.getValue();
    }

    public final void IconCompatParcelizer(float f) {
        ((getContentCaptureSessionui) this.MediaSessionCompatToken).IconCompatParcelizer(f);
    }

    public final void MediaMetadataCompat() {
        long j = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        setSpread setspread = this.ComponentActivity;
        if (setspread != null) {
            setspread.serializer(this, requiredHeightInVpY3zN4default.read, this.PlaybackStateCompatCustomAction);
        }
        long j2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (j != j2) {
            FlowLayoutKt flowLayoutKt = this.MediaMetadataCompat;
            if (flowLayoutKt == null) {
                if (j2 != 0) {
                    MediaSessionCompatQueueItem();
                }
            } else {
                if (flowLayoutKt.MediaSessionCompatQueueItem > j2) {
                    read();
                    return;
                }
                flowLayoutKt.write = j2;
                if (flowLayoutKt.serializer == null) {
                    flowLayoutKt.IconCompatParcelizer = MathKt.read((1.0d - ((double) flowLayoutKt.MediaMetadataCompat.write(0))) * this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                }
            }
        }
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object RemoteActionCompatParcelizer() {
        return this.ResultReceiver.getValue();
    }

    public final void read(setSpread setspread) {
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ComponentActivity, setspread}, getCieXyz.write())).booleanValue()) {
            return;
        }
        setSpread setspread2 = this.ComponentActivity;
        if (setspread2 != null) {
            setspread2.RemoteActionCompatParcelizer(this);
        }
        setSpread setspread3 = this.ComponentActivity;
        if (setspread3 != null && (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = setspread3.read) != null) {
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        this.ComponentActivity = setspread;
        if (setspread != null) {
            setspread.read();
        }
        setSpread setspread4 = this.ComponentActivity;
        if (setspread4 != null) {
            setspread4.serializer(this, requiredHeightInVpY3zN4default.read, this.PlaybackStateCompatCustomAction);
        }
    }

    public final float serializer() {
        return ((getContentCaptureSessionui) this.MediaSessionCompatToken).serializer();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void write(Object obj) {
        ((onShowTranslationui) this.MediaBrowserCompatMediaItem).setValue(obj);
    }

    public static void IconCompatParcelizer(FlowLayoutKt flowLayoutKt, long j) {
        long j2 = flowLayoutKt.MediaSessionCompatQueueItem + j;
        flowLayoutKt.MediaSessionCompatQueueItem = j2;
        long j3 = flowLayoutKt.IconCompatParcelizer;
        if (j2 >= j3) {
            flowLayoutKt.RatingCompat = 1.0f;
            return;
        }
        widthInVpY3zN4default widthinvpy3zn4default = flowLayoutKt.serializer;
        calculateCentroidSize calculatecentroidsize = flowLayoutKt.MediaMetadataCompat;
        if (widthinvpy3zn4default == null) {
            float f = j2 / j3;
            flowLayoutKt.RatingCompat = (f * 1.0f) + ((1.0f - f) * calculatecentroidsize.write(0));
        } else {
            calculateCentroidSize calculatecentroidsize2 = flowLayoutKt.read;
            if (calculatecentroidsize2 == null) {
                calculatecentroidsize2 = serializer;
            }
            flowLayoutKt.RatingCompat = RangesKt.write(((calculateCentroidSize) widthinvpy3zn4default.serializer(j2, calculatecentroidsize, write, calculatecentroidsize2)).write(0), 0.0f, 1.0f);
        }
    }

    public final Object animateOneFrame(ContinuationImpl continuationImpl) {
        float f = SuspendAnimationKt.read(continuationImpl.getContext());
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (f <= 0.0f) {
            read();
            return createfromparcel;
        }
        this.MediaSessionCompatQueueItem = f;
        Object objWithFrameNanos = TextStreamsKt.read(continuationImpl.getContext()).withFrameNanos(this.RemoteActionCompatParcelizer, continuationImpl);
        return objWithFrameNanos == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithFrameNanos : createfromparcel;
    }

    public final void read() {
        Transition transition = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core();
        }
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        if (this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat = null;
            IconCompatParcelizer(1.0f);
            MediaSessionCompatQueueItem();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    public static final void IconCompatParcelizer(SeekableTransitionState seekableTransitionState) {
        Transition transition = seekableTransitionState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (transition == null) {
            return;
        }
        FlowLayoutKt flowLayoutKt = seekableTransitionState.MediaMetadataCompat;
        if (flowLayoutKt == null) {
            if (seekableTransitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus <= 0 || seekableTransitionState.serializer() == 1.0f) {
                flowLayoutKt = null;
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) seekableTransitionState.MediaBrowserCompatMediaItem).getValue(), ((onShowTranslationui) seekableTransitionState.ResultReceiver).getValue()}, getCieXyz.write())).booleanValue()) {
                    flowLayoutKt = null;
                } else {
                    flowLayoutKt = new FlowLayoutKt();
                    flowLayoutKt.RatingCompat = seekableTransitionState.serializer();
                    long j = seekableTransitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    flowLayoutKt.write = j;
                    flowLayoutKt.IconCompatParcelizer = MathKt.read((1.0d - ((double) seekableTransitionState.serializer())) * j);
                    flowLayoutKt.MediaMetadataCompat.write(seekableTransitionState.serializer(), 0);
                }
            }
        }
        if (flowLayoutKt != null) {
            flowLayoutKt.write = seekableTransitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            seekableTransitionState.MediaSessionCompatResultReceiverWrapper.read(flowLayoutKt);
            transition.setInitialAnimations$animation_core(flowLayoutKt);
        }
        seekableTransitionState.MediaMetadataCompat = null;
    }

    public final void MediaSessionCompatQueueItem() {
        Transition transition = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core(MathKt.read(((double) serializer()) * transition.RemoteActionCompatParcelizer()));
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void read(Transition transition) {
        Transition transition2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (transition2 != null && transition != transition2) {
            Box.RemoteActionCompatParcelizer("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys + ", new instance: " + transition);
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = transition;
    }

    public final Object seekTo(float f, Object obj, SuspendLambda suspendLambda) {
        if (0.0f > f || f > 1.0f) {
            Box.read("Expecting fraction between 0 and 1. Got " + f);
        }
        Transition transition = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (transition != null) {
            Object obj2 = tryMinHeightJN0ABg.read(this.PlaybackStateCompat, new AnonymousClass3(obj, ((onShowTranslationui) this.ResultReceiver).getValue(), this, transition, f, null), suspendLambda);
            if (obj2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return obj2;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
