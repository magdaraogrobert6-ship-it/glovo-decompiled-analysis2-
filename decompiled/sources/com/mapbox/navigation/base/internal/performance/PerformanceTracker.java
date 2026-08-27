package com.mapbox.navigation.base.internal.performance;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.getCustomActions;

/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceTracker {
    public static final PerformanceTracker INSTANCE = new PerformanceTracker();
    public static final CopyOnWriteArraySet performanceObservers = new CopyOnWriteArraySet();
    public static final AtomicInteger asyncSectionIdCounter = new AtomicInteger(0);

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.performance.PerformanceTracker$trackPerformanceAsync$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public PerformanceTracker L$0;
        public AsyncSection L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceTracker.this.trackPerformanceAsync(null, null, this);
        }
    }

    public static boolean getTrackingIsActive() {
        return !performanceObservers.isEmpty();
    }

    public static void asyncSectionCompleted(AsyncSection asyncSection) {
        asyncSection.getClass();
        if (asyncSection == PerformanceTrackerKt.emptyAsyncSection) {
            return;
        }
        long jSerializer = DefaultInAppMessageViewWrapper.serializer(asyncSection.startMark);
        for (getCustomActions getcustomactions : performanceObservers) {
            String str = asyncSection.name;
            int i = asyncSection.id;
            BrazeInAppMessageManagerExternalSyntheticLambda2 brazeInAppMessageManagerExternalSyntheticLambda2 = new BrazeInAppMessageManagerExternalSyntheticLambda2(jSerializer);
            getcustomactions.getClass();
            str.getClass();
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(str + " async section finished (id: " + i + ") in " + brazeInAppMessageManagerExternalSyntheticLambda2, "PERFORMANCE");
            }
        }
    }

    public static AsyncSection asyncSectionStarted(String str) {
        str.getClass();
        if (!getTrackingIsActive()) {
            return PerformanceTrackerKt.emptyAsyncSection;
        }
        int iIncrementAndGet = asyncSectionIdCounter.incrementAndGet();
        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
        Iterator it = performanceObservers.iterator();
        while (it.hasNext()) {
            ((getCustomActions) it.next()).getClass();
            str.getClass();
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(str + " async section started (id: " + iIncrementAndGet + ')', "PERFORMANCE");
            }
        }
        return new AsyncSection(str, iIncrementAndGet, jWrite);
    }

    /* JADX INFO: renamed from: syncSectionCompleted-6Au4x4Y, reason: not valid java name */
    public static void m4781syncSectionCompleted6Au4x4Y(String str, BrazeInAppMessageManagerExternalSyntheticLambda2 brazeInAppMessageManagerExternalSyntheticLambda2) {
        str.getClass();
        Iterator it = performanceObservers.iterator();
        while (it.hasNext()) {
            ((getCustomActions) it.next()).getClass();
            str.getClass();
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(str + " section completed in " + brazeInAppMessageManagerExternalSyntheticLambda2, "PERFORMANCE");
            }
        }
    }

    public static void syncSectionStarted(String str) {
        str.getClass();
        Iterator it = performanceObservers.iterator();
        while (it.hasNext()) {
            ((getCustomActions) it.next()).getClass();
            str.getClass();
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(str.concat(" section started"), "PERFORMANCE");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object trackPerformanceAsync(String str, NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1 nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1, ContinuationImpl continuationImpl) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AsyncSection asyncSectionAsyncSectionStarted;
        Throwable th;
        PerformanceTracker performanceTracker;
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
        Object objInvoke = anonymousClass1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return objInvoke;
            }
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            asyncSectionAsyncSectionStarted = anonymousClass1.L$1;
            performanceTracker = anonymousClass1.L$0;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                performanceTracker.getClass();
                asyncSectionCompleted(asyncSectionAsyncSectionStarted);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                performanceTracker.getClass();
                asyncSectionCompleted(asyncSectionAsyncSectionStarted);
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (getTrackingIsActive()) {
            asyncSectionAsyncSectionStarted = asyncSectionStarted(str);
            try {
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = asyncSectionAsyncSectionStarted;
                anonymousClass1.label = 2;
                objInvoke = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.invoke(anonymousClass1);
                if (objInvoke != obj) {
                    performanceTracker = this;
                    performanceTracker.getClass();
                    asyncSectionCompleted(asyncSectionAsyncSectionStarted);
                    return objInvoke;
                }
            } catch (Throwable th3) {
                th = th3;
                performanceTracker = this;
                performanceTracker.getClass();
                asyncSectionCompleted(asyncSectionAsyncSectionStarted);
                throw th;
            }
        } else {
            anonymousClass1.label = 1;
            Object objInvoke2 = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.invoke(anonymousClass1);
            if (objInvoke2 != obj) {
                return objInvoke2;
            }
        }
        return obj;
    }
}
