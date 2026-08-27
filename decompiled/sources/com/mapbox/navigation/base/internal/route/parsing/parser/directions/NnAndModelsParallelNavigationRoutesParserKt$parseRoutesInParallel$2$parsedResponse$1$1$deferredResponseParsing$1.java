package com.mapbox.navigation.base.internal.route.parsing.parser.directions;

import android.os.SystemClock;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsResponseParsingResult;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ String $logCategory;
    public final /* synthetic */ Time$SystemClockImpl $logger;
    public final /* synthetic */ p0 $modelParser;
    public final /* synthetic */ ResponseToParse $response;
    public final /* synthetic */ long $responseTimeElapsedMillis;
    public final /* synthetic */ Time$SystemClockImpl $time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1(long j, Time$SystemClockImpl time$SystemClockImpl, p0 p0Var, ResponseToParse responseToParse, Time$SystemClockImpl time$SystemClockImpl2, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$responseTimeElapsedMillis = j;
        this.$time = time$SystemClockImpl;
        this.$modelParser = p0Var;
        this.$response = responseToParse;
        this.$logger = time$SystemClockImpl2;
        this.$logCategory = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1(this.$responseTimeElapsedMillis, this.$time, this.$modelParser, this.$response, this.$logger, this.$logCategory, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objM;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        long jInvokeSuspend$currentElapsedMillis = NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.AnonymousClass1.invokeSuspend$currentElapsedMillis(this.$time);
        long j = jInvokeSuspend$currentElapsedMillis - this.$responseTimeElapsedMillis;
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        p0 p0Var = this.$modelParser;
        ResponseToParse responseToParse = this.$response;
        Time$SystemClockImpl time$SystemClockImpl = this.$logger;
        String str = this.$logCategory;
        if (!trackingIsActive) {
            Object objM4527parseIoAF18A = p0Var.m4527parseIoAF18A(responseToParse);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - jInvokeSuspend$currentElapsedMillis;
            String name = Thread.currentThread().getName();
            time$SystemClockImpl.getClass();
            if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
                if (objM4527parseIoAF18A instanceof isItemDismissable) {
                    objM = objM4527parseIoAF18A;
                } else {
                    objM = "parsed directions response to public API models for " + ((DirectionsResponseParsingResult) objM4527parseIoAF18A).responseUUID + ", parse time " + jElapsedRealtime + "ms";
                }
                if (onItemDismiss.serializer(objM) != null) {
                    objM = m1$$ExternalSyntheticOutline0.m(jElapsedRealtime, "failed to parse response, time ", "ms");
                }
                Time$SystemClockImpl.logD((String) objM, str);
            }
            onItemDismiss onitemdismiss = new onItemDismiss(objM4527parseIoAF18A);
            name.getClass();
            return new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.AnonymousClass1.ParseResult(onitemdismiss, j, jElapsedRealtime, name);
        }
        PerformanceTracker.syncSectionStarted("RouteModelsParser#parse");
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            Object objM4527parseIoAF18A2 = p0Var.m4527parseIoAF18A(responseToParse);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jInvokeSuspend$currentElapsedMillis;
            String name2 = Thread.currentThread().getName();
            time$SystemClockImpl.getClass();
            if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
                if (objM4527parseIoAF18A2 instanceof isItemDismissable) {
                    obj2 = objM4527parseIoAF18A2;
                } else {
                    obj2 = "parsed directions response to public API models for " + ((DirectionsResponseParsingResult) objM4527parseIoAF18A2).responseUUID + ", parse time " + jElapsedRealtime2 + "ms";
                }
                if (onItemDismiss.serializer(obj2) != null) {
                    obj2 = "failed to parse response, time " + jElapsedRealtime2 + "ms";
                }
                Time$SystemClockImpl.logD((String) obj2, str);
            }
            onItemDismiss onitemdismiss2 = new onItemDismiss(objM4527parseIoAF18A2);
            name2.getClass();
            NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.AnonymousClass1.ParseResult parseResult = new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.AnonymousClass1.ParseResult(onitemdismiss2, j, jElapsedRealtime2, name2);
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("RouteModelsParser#parse", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
            return parseResult;
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("RouteModelsParser#parse", null);
            throw th;
        }
    }
}
