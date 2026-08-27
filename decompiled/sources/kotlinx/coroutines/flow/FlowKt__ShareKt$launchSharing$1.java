package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.Symbol;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ MutableSharedFlow IconCompatParcelizer;
    public final /* synthetic */ Flow RemoteActionCompatParcelizer;
    public final /* synthetic */ SharingStarted read;
    public int serializer;
    public final /* synthetic */ Object write;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public /* synthetic */ int IconCompatParcelizer;

        public AnonymousClass1() {
            super(2, null);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return Boolean.valueOf(this.IconCompatParcelizer > 0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, shortNewsContentCardView);
            anonymousClass1.IconCompatParcelizer = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public AnonymousClass1(int i, ShortNewsContentCardView shortNewsContentCardView) {
            super(i, shortNewsContentCardView);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ MutableSharedFlow IconCompatParcelizer;
        public final /* synthetic */ Flow RemoteActionCompatParcelizer;
        public int read;
        public /* synthetic */ Object serializer;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = flow;
            this.IconCompatParcelizer = mutableSharedFlow;
            this.write = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, shortNewsContentCardView);
            anonymousClass2.serializer = obj;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((SharingCommand) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.read;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i2 = WhenMappings.write[((SharingCommand) this.serializer).ordinal()];
                MutableSharedFlow mutableSharedFlow = this.IconCompatParcelizer;
                if (i2 == 1) {
                    this.read = 1;
                    if (this.RemoteActionCompatParcelizer.collect(mutableSharedFlow, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    Symbol symbol = SharedFlowKt.write;
                    Object obj2 = this.write;
                    if (obj2 == symbol) {
                        mutableSharedFlow.IconCompatParcelizer();
                    } else {
                        mutableSharedFlow.write(obj2);
                    }
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

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                write = iArr;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = sharingStarted;
        this.RemoteActionCompatParcelizer = flow;
        this.IconCompatParcelizer = mutableSharedFlow;
        this.write = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new FlowKt__ShareKt$launchSharing$1(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r2.collect(r3, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2.collect(r3, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r4, r9) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.serializer
            kotlinx.coroutines.flow.Flow r2 = r9.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.MutableSharedFlow r3 = r9.IconCompatParcelizer
            r4 = 3
            r5 = 4
            r6 = 0
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L26
            if (r1 == r8) goto L22
            if (r1 == r7) goto L1e
            if (r1 == r4) goto L22
            if (r1 != r5) goto L18
            goto L22
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r6
        L1e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L4e
        L22:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L73
        L26:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            kotlinx.coroutines.flow.SharingStarted r10 = kotlinx.coroutines.flow.SharingStarted.Companion.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.SharingStarted r1 = r9.read
            if (r1 != r10) goto L38
            r9.serializer = r8
            java.lang.Object r10 = r2.collect(r3, r9)
            if (r10 != r0) goto L73
            goto L72
        L38:
            kotlinx.coroutines.flow.SharingStarted r10 = kotlinx.coroutines.flow.SharingStarted.Companion.serializer
            if (r1 != r10) goto L57
            kotlinx.coroutines.flow.StateFlow r10 = r3.serializer()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>()
            r9.serializer = r7
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r10, r1, r9)
            if (r10 != r0) goto L4e
            goto L72
        L4e:
            r9.serializer = r4
            java.lang.Object r10 = r2.collect(r3, r9)
            if (r10 != r0) goto L73
            goto L72
        L57:
            kotlinx.coroutines.flow.StateFlow r10 = r3.serializer()
            kotlinx.coroutines.flow.Flow r10 = r1.write(r10)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.serializer(r10)
            java.lang.Object r1 = r9.write
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            r4.<init>(r2, r3, r1, r6)
            r9.serializer = r5
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r4, r9)
            if (r10 != r0) goto L73
        L72:
            return r0
        L73:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
