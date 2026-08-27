package com.google.android.gms.internal.mlkit_vision_common;

import android.os.Process;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.NativeLoggerWrapper;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.RoutesResponse;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRouteParsingSuccessfulResult;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$2$1$1;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.utils.internal.LoggerFrontendKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlq {
    public static int read;
    public static int write;

    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[Catch: all -> 0x00c1, CancellationException -> 0x00f6, TryCatch #0 {all -> 0x00c1, blocks: (B:32:0x00a2, B:34:0x00ac, B:35:0x00b9, B:36:0x00c0), top: B:51:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[Catch: all -> 0x00c1, CancellationException -> 0x00f6, TryCatch #0 {all -> 0x00c1, blocks: (B:32:0x00a2, B:34:0x00ac, B:35:0x00b9, B:36:0x00c0), top: B:51:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Failed to inline method: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00d5, please report this as an issue */
    /* JADX WARN: Not passed register '(r2v0 'str2' java.lang.String)' in method call: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    public static final Object parseRoutesInParallel(ResponseToParse responseToParse, long j, CoroutineDispatcher coroutineDispatcher, Time$SystemClockImpl time$SystemClockImpl, p0 p0Var, Time$SystemClockImpl time$SystemClockImpl2, MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper, String str, String str2, String str3, NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$2$1$1 nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$2$1$1, ContinuationImpl continuationImpl) {
        NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1 nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1;
        Time$SystemClockImpl time$SystemClockImpl3;
        Time$SystemClockImpl time$SystemClockImpl4;
        MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper2;
        Object isitemdismissable;
        Throwable thSerializer;
        RoutesResponse routesResponse;
        String str4 = str;
        if (continuationImpl instanceof NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1) {
            nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1 = (NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1) continuationImpl;
            int i = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1.label = i - Integer.MIN_VALUE;
            } else {
                nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1 = new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1(continuationImpl);
            }
        } else {
            nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1 = new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1(continuationImpl);
        }
        NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1 nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2 = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1;
        Object obj = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.label;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                try {
                    time$SystemClockImpl2.getClass();
                    if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
                        try {
                            Time$SystemClockImpl.logD("parsing directions response", str4);
                        } catch (Throwable th) {
                            th = th;
                            time$SystemClockImpl4 = time$SystemClockImpl2;
                            isitemdismissable = new isItemDismissable(th);
                            thSerializer = onItemDismiss.serializer(isitemdismissable);
                            if (thSerializer != null) {
                                String str5 = "Route parsing failed: " + thSerializer.getMessage();
                                time$SystemClockImpl4.getClass();
                                NativeLoggerWrapper.INSTANCE.error(LoggerFrontendKt.access$createMessage(str5, str4), "nav-sdk");
                            }
                            return isitemdismissable;
                        }
                    }
                    PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                    NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1 nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1 = new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1(j, p0Var, responseToParse, time$SystemClockImpl2, time$SystemClockImpl, str, str3, str2, null, nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$2$1$1, coroutineDispatcher);
                    time$SystemClockImpl3 = time$SystemClockImpl2;
                    try {
                        nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.L$0 = time$SystemClockImpl3;
                        nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.L$1 = mapboxHistoryRecorderWrapper;
                        nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.L$2 = str4;
                        nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.label = 1;
                        Object objTrackPerformanceAsync = performanceTracker.trackPerformanceAsync(str2, nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1, nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2);
                        if (objTrackPerformanceAsync == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        time$SystemClockImpl4 = time$SystemClockImpl3;
                        mapboxHistoryRecorderWrapper2 = mapboxHistoryRecorderWrapper;
                        obj = objTrackPerformanceAsync;
                        routesResponse = (RoutesResponse) obj;
                        if (!routesResponse.routes.isEmpty()) {
                            mapboxHistoryRecorderWrapper2.routeResponseIsParsed(routesResponse.meta);
                            isitemdismissable = new NavigationRouteParsingSuccessfulResult(routesResponse.routes);
                        } else {
                            throw new IllegalStateException("no routes returned, collection is empty");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        time$SystemClockImpl4 = time$SystemClockImpl3;
                        isitemdismissable = new isItemDismissable(th);
                        thSerializer = onItemDismiss.serializer(isitemdismissable);
                        if (thSerializer != null) {
                            String str6 = "Route parsing failed: " + thSerializer.getMessage();
                            time$SystemClockImpl4.getClass();
                            NativeLoggerWrapper.INSTANCE.error(LoggerFrontendKt.access$createMessage(str6, str4), "nav-sdk");
                        }
                        return isitemdismissable;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    time$SystemClockImpl3 = time$SystemClockImpl2;
                }
            } else if (i2 == 1) {
                String str7 = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.L$2;
                mapboxHistoryRecorderWrapper2 = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.L$1;
                time$SystemClockImpl4 = nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2.L$0;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    str4 = str7;
                    try {
                        routesResponse = (RoutesResponse) obj;
                        if (!routesResponse.routes.isEmpty()) {
                            mapboxHistoryRecorderWrapper2.routeResponseIsParsed(routesResponse.meta);
                            isitemdismissable = new NavigationRouteParsingSuccessfulResult(routesResponse.routes);
                        } else {
                            throw new IllegalStateException("no routes returned, collection is empty");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        isitemdismissable = new isItemDismissable(th);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str4 = str7;
                    isitemdismissable = new isItemDismissable(th);
                    thSerializer = onItemDismiss.serializer(isitemdismissable);
                    if (thSerializer != null) {
                        String str8 = "Route parsing failed: " + thSerializer.getMessage();
                        time$SystemClockImpl4.getClass();
                        NativeLoggerWrapper.INSTANCE.error(LoggerFrontendKt.access$createMessage(str8, str4), "nav-sdk");
                    }
                    return isitemdismissable;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer != null) {
                String str9 = "Route parsing failed: " + thSerializer.getMessage();
                time$SystemClockImpl4.getClass();
                NativeLoggerWrapper.INSTANCE.error(LoggerFrontendKt.access$createMessage(str9, str4), "nav-sdk");
            }
            return isitemdismissable;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public static int serializer() {
        int i = write;
        int i2 = i % 8171250;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyUid = Process.myUid();
        read = iMyUid;
        return iMyUid;
    }
}
