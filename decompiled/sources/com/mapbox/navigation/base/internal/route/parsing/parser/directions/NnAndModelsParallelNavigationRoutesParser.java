package com.mapbox.navigation.base.internal.route.parsing.parser.directions;

import android.os.SystemClock;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRoutesParser;
import com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue;
import com.mapbox.navigation.base.internal.utils.RouteResponseInfo;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2;
import java.nio.ByteBuffer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import o.ShortNewsContentCardView;
import o.getClearTextSubstitution;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes2.dex */
public final class NnAndModelsParallelNavigationRoutesParser implements NavigationRoutesParser {
    public final Time$SystemClockImpl logger;
    public final p0 modelParser;
    public final CoroutineDispatcher parsingDispatcher;
    public final OptimisedForJavaMemoryRoutesParsingQueue parsingQueue;
    public final MapboxHistoryRecorderWrapper routeParsingTracking;
    public final Time$SystemClockImpl time;

    public NnAndModelsParallelNavigationRoutesParser(MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper, CoroutineDispatcher coroutineDispatcher, Time$SystemClockImpl time$SystemClockImpl, p0 p0Var, getClearTextSubstitution getcleartextsubstitution, OptimisedForJavaMemoryRoutesParsingQueue optimisedForJavaMemoryRoutesParsingQueue, Time$SystemClockImpl time$SystemClockImpl2) {
        coroutineDispatcher.getClass();
        this.routeParsingTracking = mapboxHistoryRecorderWrapper;
        this.parsingDispatcher = coroutineDispatcher;
        this.time = time$SystemClockImpl;
        this.modelParser = p0Var;
        this.parsingQueue = optimisedForJavaMemoryRoutesParsingQueue;
        this.logger = time$SystemClockImpl2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRoutesParser
    /* JADX INFO: renamed from: parseDirectionsResponse-gIAlu-s */
    public final Object mo4782parseDirectionsResponsegIAlus(ResponseToParse responseToParse, ShortNewsContentCardView shortNewsContentCardView) {
        NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1 nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1;
        if (shortNewsContentCardView instanceof NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1) {
            nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1 = (NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1) shortNewsContentCardView;
            int i = nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1 = new NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1(this, shortNewsContentCardView);
            }
        } else {
            nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1 = new NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1(this, shortNewsContentCardView);
        }
        Object routeResponse = nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(routeResponse);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ByteBuffer buffer = responseToParse.responseBody.getBuffer();
            buffer.getClass();
            RouteResponseInfo routeResponseInfo = new RouteResponseInfo(buffer.capacity());
            HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$2 = new HistoryApiRequest$getHistory$2(this, responseToParse, jElapsedRealtime, (ShortNewsContentCardView) null, 2);
            nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1.label = 1;
            routeResponse = this.parsingQueue.parseRouteResponse(routeResponseInfo, historyApiRequest$getHistory$2, nnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1);
            if (routeResponse == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(routeResponse);
        }
        return ((onItemDismiss) routeResponse).IconCompatParcelizer;
    }
}
