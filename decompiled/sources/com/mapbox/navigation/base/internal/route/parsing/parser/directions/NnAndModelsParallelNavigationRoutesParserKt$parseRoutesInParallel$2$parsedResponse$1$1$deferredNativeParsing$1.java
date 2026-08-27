package com.mapbox.navigation.base.internal.route.parsing.parser.directions;

import android.os.SystemClock;
import coil3.ExtrasKt;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.mapbox.navigator.RouteInterface;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onContentCardDismissed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes2.dex */
public final class NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredNativeParsing$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ String $logCategory;
    public final /* synthetic */ Time$SystemClockImpl $logger;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY $nativeParseFn;
    public final /* synthetic */ String $nativePerformanceSectionName;
    public final /* synthetic */ ResponseToParse $response;
    public final /* synthetic */ long $responseTimeElapsedMillis;
    public final /* synthetic */ Time$SystemClockImpl $time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredNativeParsing$1(long j, String str, Time$SystemClockImpl time$SystemClockImpl, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ResponseToParse responseToParse, Time$SystemClockImpl time$SystemClockImpl2, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$responseTimeElapsedMillis = j;
        this.$nativePerformanceSectionName = str;
        this.$time = time$SystemClockImpl;
        this.$nativeParseFn = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.$response = responseToParse;
        this.$logger = time$SystemClockImpl2;
        this.$logCategory = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredNativeParsing$1(this.$responseTimeElapsedMillis, this.$nativePerformanceSectionName, this.$time, this.$nativeParseFn, this.$response, this.$logger, this.$logCategory, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredNativeParsing$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Expected expected;
        RouteInterface routeInterface;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        long jInvokeSuspend$currentElapsedMillis = NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.AnonymousClass1.invokeSuspend$currentElapsedMillis(this.$time);
        long j = this.$responseTimeElapsedMillis;
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.$nativeParseFn;
        ResponseToParse responseToParse = this.$response;
        String responseUuid = null;
        if (trackingIsActive) {
            String str = this.$nativePerformanceSectionName;
            PerformanceTracker.syncSectionStarted(str);
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                expected = (Expected) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(responseToParse.responseBody, responseToParse.routeRequest, responseToParse.routerOrigin);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str, new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str, null);
                throw th;
            }
        } else {
            expected = (Expected) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(responseToParse.responseBody, responseToParse.routeRequest, responseToParse.routerOrigin);
        }
        Expected expected2 = expected;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - jInvokeSuspend$currentElapsedMillis;
        this.$logger.getClass();
        if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
            StringBuilder sb = new StringBuilder("parsed directions response to RouteInterface for ");
            List list = (List) expected2.getValue();
            if (list != null && (routeInterface = (RouteInterface) onContentCardDismissed.MediaMetadataCompat(list)) != null) {
                responseUuid = routeInterface.getResponseUuid();
            }
            sb.append(responseUuid);
            sb.append(", parse time ");
            sb.append(jElapsedRealtime);
            sb.append("ms");
            Time$SystemClockImpl.logD(sb.toString(), this.$logCategory);
        }
        return new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1.AnonymousClass1.ParseResult(expected2, jInvokeSuspend$currentElapsedMillis - j, jElapsedRealtime, "");
    }
}
