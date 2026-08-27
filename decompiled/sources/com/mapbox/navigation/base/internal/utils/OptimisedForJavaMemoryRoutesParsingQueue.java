package com.mapbox.navigation.base.internal.utils;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class OptimisedForJavaMemoryRoutesParsingQueue {
    public final MutexImpl mutex = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM prepareForParsingAction;

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue$parseAlternatives$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptimisedForJavaMemoryRoutesParsingQueue.this.parseAlternatives(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue$parseRouteResponse$1, reason: invalid class name and case insensitive filesystem */
    public final class C01431 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public MutexImpl L$2;
        public int label;
        public /* synthetic */ Object result;

        public C01431(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptimisedForJavaMemoryRoutesParsingQueue.this.parseRouteResponse(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue$prepareForParsing$1, reason: invalid class name and case insensitive filesystem */
    public final class C01441 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C01441(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptimisedForJavaMemoryRoutesParsingQueue.this.prepareForParsing(this);
        }
    }

    public OptimisedForJavaMemoryRoutesParsingQueue(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.prepareForParsingAction = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object parseAlternatives(AlternativesInfo alternativesInfo, HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$2, ContinuationImpl continuationImpl) {
        AnonymousClass1 anonymousClass1;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object routeResponse = anonymousClass1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(routeResponse);
            if (this.mutex.read()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("skipping parsing of routes alternatives as a different route is being parsed already", "RouteParsingManager");
                }
                return AlternativesParsingResult$NotActual.INSTANCE;
            }
            RouteResponseInfo routeResponseInfo = alternativesInfo.routeResponseInfo;
            anonymousClass1.label = 1;
            routeResponse = parseRouteResponse(routeResponseInfo, historyApiRequest$getHistory$2, anonymousClass1);
            if (routeResponse == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(routeResponse);
        }
        return new AlternativesParsingResult$Parsed(routeResponse);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseRouteResponse(com.mapbox.navigation.base.internal.utils.RouteResponseInfo r9, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r10, o.ShortNewsContentCardView r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue.C01431
            if (r0 == 0) goto L13
            r0 = r11
            com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue$parseRouteResponse$1 r0 = (com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue.C01431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L1a
        L13:
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue$parseRouteResponse$1 r0 = new com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue$parseRouteResponse$1
            r0.<init>(r11)
        L1a:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5e
            if (r2 == r6) goto L5a
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.L$0
            o.setCustomInAppMessageAnimationFactorylambda0 r9 = (o.setCustomInAppMessageAnimationFactorylambda0) r9
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)     // Catch: java.lang.Throwable -> L4a
            goto Lb2
        L38:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r7
        L3e:
            java.lang.Object r9 = r0.L$1
            o.setCustomInAppMessageAnimationFactorylambda0 r9 = (o.setCustomInAppMessageAnimationFactorylambda0) r9
            java.lang.Object r10 = r0.L$0
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r10 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r10
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)     // Catch: java.lang.Throwable -> L4a
            goto La5
        L4a:
            r10 = move-exception
            goto Lb6
        L4c:
            kotlinx.coroutines.sync.MutexImpl r9 = r0.L$2
            java.lang.Object r10 = r0.L$1
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r10 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r10
            java.lang.Object r2 = r0.L$0
            com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue r2 = (com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L96
        L5a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            return r11
        L5e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            int r9 = r9.sizeBytes
            r11 = 20971520(0x1400000, float:3.526483E-38)
            if (r9 >= r11) goto L71
            r0.label = r6
            java.lang.Object r9 = r10.invoke(r0)
            if (r9 != r1) goto L70
            goto Lb1
        L70:
            return r9
        L71:
            com.mapbox.common.LoggingLevel r9 = com.mapbox.navigation.utils.internal.LoggerProviderKt.logLevel()
            com.mapbox.common.LoggingLevel r11 = com.mapbox.common.LoggingLevel.DEBUG
            boolean r9 = com.mapbox.navigation.utils.internal.LoggingLevelUtilKt.accepts(r9, r11)
            if (r9 == 0) goto L84
            java.lang.String r9 = "Enqueuing routes parsing"
            java.lang.String r11 = "RouteParsingManager"
            com.mapbox.navigation.utils.internal.LoggerProviderKt.logD(r9, r11)
        L84:
            r0.L$0 = r8
            r0.L$1 = r10
            kotlinx.coroutines.sync.MutexImpl r9 = r8.mutex
            r0.L$2 = r9
            r0.label = r5
            java.lang.Object r11 = r9.lock(r0)
            if (r11 != r1) goto L95
            goto Lb1
        L95:
            r2 = r8
        L96:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L4a
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L4a
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L4a
            r0.label = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r11 = r2.prepareForParsing(r0)     // Catch: java.lang.Throwable -> L4a
            if (r11 != r1) goto La5
            goto Lb1
        La5:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L4a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r11 = r10.invoke(r0)     // Catch: java.lang.Throwable -> L4a
            if (r11 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            r9.write(r7)
            return r11
        Lb6:
            r9.write(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue.parseRouteResponse(com.mapbox.navigation.base.internal.utils.RouteResponseInfo, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object prepareForParsing(ContinuationImpl continuationImpl) {
        C01441 c01441;
        if (continuationImpl instanceof C01441) {
            c01441 = (C01441) continuationImpl;
            int i = c01441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01441.label = i - Integer.MIN_VALUE;
            } else {
                c01441 = new C01441(continuationImpl);
            }
        } else {
            c01441 = new C01441(continuationImpl);
        }
        Object obj = c01441.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01441.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                LoggerProviderKt.logD("Preparing for routes response parsing", "RouteParsingManager");
            }
            c01441.label = 1;
            if (this.prepareForParsingAction.invoke(c01441) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("Preparation for routes parsing completed", "RouteParsingManager");
        }
        return createFromParcel.INSTANCE;
    }
}
