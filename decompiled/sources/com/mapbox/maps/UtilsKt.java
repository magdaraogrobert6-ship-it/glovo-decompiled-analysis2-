package com.mapbox.maps;

import android.content.Context;
import android.util.TypedValue;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import io.grpc.LoadBalancer$Helper;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {

    /* JADX INFO: renamed from: com.mapbox.maps.UtilsKt$safeSystemCall$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UtilsKt.safeSystemCall(0L, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.UtilsKt$safeSystemCall$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ CoroutineDispatcher $dispatcher;
        final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $operation;
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.UtilsKt$safeSystemCall$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $operation;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                return new AnonymousClass1(this.$operation, shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.$operation;
                this.label = 1;
                Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
                return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.$operation = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineDispatcher coroutineDispatcher, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super AnonymousClass2> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$dispatcher = coroutineDispatcher;
            this.$operation = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass2(this.$dispatcher, this.$operation, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CoroutineDispatcher coroutineDispatcher = this.$dispatcher;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$operation, null);
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
            return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01291<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01291(ShortNewsContentCardView<? super C01291> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UtilsKt.safeSystemCallWithCallback(0L, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$2, reason: invalid class name and case insensitive filesystem */
    public static final class C01302 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $onResult;
        final /* synthetic */ T $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01302(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, T t, ShortNewsContentCardView<? super C01302> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$onResult = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            this.$result = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new C01302(this.$onResult, this.$result, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.$onResult.invoke(this.$result);
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((C01302) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object safeSystemCall(long j, T t, String str, CoroutineDispatcher coroutineDispatcher, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object objWithTimeoutOrNull = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeoutOrNull);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(coroutineDispatcher, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
                anonymousClass1.L$0 = t;
                anonymousClass1.L$1 = str;
                anonymousClass1.J$0 = j;
                anonymousClass1.label = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, anonymousClass2, anonymousClass1);
                if (objWithTimeoutOrNull == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = anonymousClass1.J$0;
                str = (String) anonymousClass1.L$1;
                t = (T) anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeoutOrNull);
            }
            if (objWithTimeoutOrNull != null) {
                return objWithTimeoutOrNull;
            }
            MapboxLogger.logW(str, "System call timed out after " + j + "ms, using fallback");
            return t;
        } catch (Exception e) {
            MapboxLogger.logE(str, "System call failed: " + e.getMessage() + ", using fallback");
            return t;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r0, r3, r1) == r9) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object safeSystemCallWithCallback(long r13, T r15, java.lang.String r16, kotlinx.coroutines.CoroutineDispatcher r17, kotlinx.coroutines.CoroutineDispatcher r18, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r19, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r20, o.ShortNewsContentCardView<? super o.createFromParcel> r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof com.mapbox.maps.UtilsKt.C01291
            if (r1 == 0) goto L15
            r1 = r0
            com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1 r1 = (com.mapbox.maps.UtilsKt.C01291) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 + r3
            r1.label = r2
            goto L1a
        L15:
            com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1 r1 = new com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r10 = 2
            r3 = 1
            r11 = 0
            if (r2 == 0) goto L42
            if (r2 == r3) goto L33
            if (r2 != r10) goto L2d
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r0)
            goto L71
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r0)
            return r11
        L33:
            java.lang.Object r2 = r1.L$1
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r2 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r2
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.CoroutineDispatcher r3 = (kotlinx.coroutines.CoroutineDispatcher) r3
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r0)
            r12 = r2
            r2 = r0
            r0 = r3
            goto L5f
        L42:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r0)
            r0 = r18
            r1.L$0 = r0
            r12 = r20
            r1.L$1 = r12
            r1.label = r3
            r2 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r19
            r8 = r1
            java.lang.Object r2 = safeSystemCall(r2, r4, r5, r6, r7, r8)
            if (r2 != r9) goto L5f
            goto L70
        L5f:
            com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$2 r3 = new com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$2
            r3.<init>(r12, r2, r11)
            r1.L$0 = r11
            r1.L$1 = r11
            r1.label = r10
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r3, r1)
            if (r0 != r9) goto L71
        L70:
            return r9
        L71:
            o.createFromParcel r0 = o.createFromParcel.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.UtilsKt.safeSystemCallWithCallback(long, java.lang.Object, java.lang.String, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.ShortNewsContentCardView):java.lang.Object");
    }

    public static final <E, V, T extends Expected<E, V>> Object suspendMapboxCancellableCoroutine(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1((Cancelable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(cancellableContinuationImpl)));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final <T, R> R call(WeakReference<T> weakReference, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        weakReference.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        T t = weakReference.get();
        if (t != null) {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public static final <T extends Number> T toDP(T t, Context context) {
        t.getClass();
        context.getClass();
        return Float.valueOf(TypedValue.applyDimension(1, t.floatValue(), context.getResources().getDisplayMetrics()));
    }

    public static Object safeSystemCall$default(long j, Object obj, String str, CoroutineDispatcher coroutineDispatcher, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = "SystemCall";
        }
        String str2 = str;
        if ((i & 8) != 0) {
            coroutineDispatcher = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        }
        return safeSystemCall(j2, obj, str2, coroutineDispatcher, r8lambdaunavo3sxub_pc9xroryotnrlvsm, shortNewsContentCardView);
    }

    public static Object safeSystemCallWithCallback$default(long j, Object obj, String str, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj2) {
        CoroutineDispatcher coroutineDispatcher3;
        long j2 = (i & 1) != 0 ? 5000L : j;
        String str2 = (i & 4) != 0 ? "SystemCall" : str;
        CoroutineDispatcher coroutineDispatcher4 = (i & 8) != 0 ? prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer : coroutineDispatcher;
        if ((i & 16) != 0) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            coroutineDispatcher3 = MainDispatcherLoader.read;
        } else {
            coroutineDispatcher3 = coroutineDispatcher2;
        }
        return safeSystemCallWithCallback(j2, obj, str2, coroutineDispatcher4, coroutineDispatcher3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, shortNewsContentCardView);
    }
}
