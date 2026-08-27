package com.mapbox.navigation.base.internal.route.parsing.parser.directions;

import android.os.SystemClock;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.NativeLoggerWrapper;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.internal.route.RoutesResponse;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsResponseParsingResult;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.utils.internal.LoggerFrontendKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.mapbox.navigator.RouteInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.YieldKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getOpeningAnimation;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ String $logCategory;
    public final /* synthetic */ Time$SystemClockImpl $logger;
    public final /* synthetic */ p0 $modelParser;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY $nativeParseFn;
    public final /* synthetic */ String $nativePerformanceSectionName;
    public final /* synthetic */ CoroutineDispatcher $parsingDispatcher;
    public final /* synthetic */ String $performanceSectionName;
    public final /* synthetic */ ResponseToParse $response;
    public final /* synthetic */ long $responseTimeElapsedMillis;
    public final /* synthetic */ Time$SystemClockImpl $time;
    public int label;

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ String $logCategory;
        public final /* synthetic */ Time$SystemClockImpl $logger;
        public final /* synthetic */ p0 $modelParser;
        public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY $nativeParseFn;
        public final /* synthetic */ String $nativePerformanceSectionName;
        public final /* synthetic */ CoroutineDispatcher $parsingDispatcher;
        public final /* synthetic */ String $performanceSectionName;
        public final /* synthetic */ ResponseToParse $response;
        public final /* synthetic */ long $responseTimeElapsedMillis;
        public final /* synthetic */ Time$SystemClockImpl $time;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$ParseResult */
        public final class ParseResult {
            public final long parseMillis;
            public final String threadName;
            public final Object value;
            public final long waitMillis;

            public ParseResult(Object obj, long j, long j2, String str) {
                this.value = obj;
                this.waitMillis = j;
                this.parseMillis = j2;
                this.threadName = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ParseResult)) {
                    return false;
                }
                ParseResult parseResult = (ParseResult) obj;
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, parseResult.value}, getCieXyz.write())).booleanValue() && this.waitMillis == parseResult.waitMillis && this.parseMillis == parseResult.parseMillis && this.threadName.equals(parseResult.threadName);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ParseResult(value=");
                sb.append(this.value);
                sb.append(", waitMillis=");
                sb.append(this.waitMillis);
                sb.append(", parseMillis=");
                sb.append(this.parseMillis);
                sb.append(", threadName=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.threadName, ')');
            }

            public final int hashCode() {
                Object obj = this.value;
                return this.threadName.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((obj == null ? 0 : obj.hashCode()) * 31, 31, this.waitMillis), 31, this.parseMillis);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, p0 p0Var, ResponseToParse responseToParse, Time$SystemClockImpl time$SystemClockImpl, Time$SystemClockImpl time$SystemClockImpl2, String str, String str2, String str3, ShortNewsContentCardView shortNewsContentCardView, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, CoroutineDispatcher coroutineDispatcher) {
            super(2, shortNewsContentCardView);
            this.$parsingDispatcher = coroutineDispatcher;
            this.$responseTimeElapsedMillis = j;
            this.$response = responseToParse;
            this.$time = time$SystemClockImpl;
            this.$modelParser = p0Var;
            this.$logger = time$SystemClockImpl2;
            this.$logCategory = str;
            this.$nativePerformanceSectionName = str2;
            this.$nativeParseFn = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
            this.$performanceSectionName = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.$nativeParseFn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$responseTimeElapsedMillis, this.$modelParser, this.$response, this.$time, this.$logger, this.$logCategory, this.$nativePerformanceSectionName, this.$performanceSectionName, shortNewsContentCardView, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, this.$parsingDispatcher);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:22:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:24:0x0105  */
        /* JADX WARN: Code duplicated, block: B:25:0x0117  */
        /* JADX WARN: Code duplicated, block: B:31:0x0161  */
        /* JADX WARN: Code duplicated, block: B:33:0x0171  */
        /* JADX WARN: Code duplicated, block: B:38:0x0145 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            getOpeningAnimation getopeninganimationIconCompatParcelizer;
            Object objAwaitInternal;
            Object objAwait;
            ParseResult parseResult;
            DirectionsResponseParsingResult directionsResponseParsingResult;
            Long l;
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            Iterator it;
            int i;
            String responseUuid;
            ArrayList arrayList3;
            long j;
            long j2;
            NavigationRoute navigationRoute;
            Object next;
            Integer numRefreshTtl;
            Long lValueOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            String str2 = null;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
                NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1 nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1 = new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1(this.$responseTimeElapsedMillis, this.$time, this.$modelParser, this.$response, this.$logger, this.$logCategory, null);
                CoroutineDispatcher coroutineDispatcher = this.$parsingDispatcher;
                getopeninganimationIconCompatParcelizer = BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, coroutineDispatcher, null, nnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredResponseParsing$1, 2);
                DeferredCoroutine deferredCoroutineIconCompatParcelizer = BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, coroutineDispatcher, null, new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1$1$deferredNativeParsing$1(this.$responseTimeElapsedMillis, this.$nativePerformanceSectionName, this.$time, this.$nativeParseFn, this.$response, this.$logger, this.$logCategory, null), 2);
                this.L$0 = getopeninganimationIconCompatParcelizer;
                this.label = 1;
                objAwaitInternal = deferredCoroutineIconCompatParcelizer.awaitInternal(this);
                if (objAwaitInternal != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                getOpeningAnimation getopeninganimation = (getOpeningAnimation) this.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getopeninganimationIconCompatParcelizer = getopeninganimation;
                objAwaitInternal = obj;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                parseResult = (ParseResult) this.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objAwait = obj;
            }
            ParseResult parseResult2 = (ParseResult) objAwait;
            Expected expected = (Expected) parseResult.value;
            Object obj2 = ((onItemDismiss) parseResult2.value).IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            directionsResponseParsingResult = (DirectionsResponseParsingResult) obj2;
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            l = new Long(BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(UriKt.IconCompatParcelizer(this.$responseTimeElapsedMillis, setUnregisteredInAppMessage.MILLISECONDS), setUnregisteredInAppMessage.SECONDS));
            str = this.$response.responseOriginAPI;
            expected.getClass();
            directionsResponseParsingResult.getClass();
            arrayList = directionsResponseParsingResult.routesParsingResult;
            Object objFold = expected.fold(new Snapshotter$$ExternalSyntheticLambda0(14), new Snapshotter$$ExternalSyntheticLambda0(15));
            objFold.getClass();
            Iterable iterable = (Iterable) objFold;
            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
            it = iterable.iterator();
            i = 0;
            while (it.hasNext()) {
                next = it.next();
                if (i >= 0) {
                    SQLite.serializer();
                    throw null;
                }
                RouteInterface routeInterface = (RouteInterface) next;
                DirectionsParsedRouteData directionsParsedRouteData = ((DirectionsRouteModelParsingResult) arrayList.get(i)).data;
                DirectionsRoute directionsRoute = directionsParsedRouteData.route;
                List list = directionsParsedRouteData.routesWaypoint;
                RouteOptions routeOptions = directionsResponseParsingResult.routeOptions;
                numRefreshTtl = zzmb.refreshTtl(directionsRoute);
                if (numRefreshTtl != null) {
                    lValueOf = Long.valueOf(((long) numRefreshTtl.intValue()) + l.longValue());
                } else {
                    lValueOf = null;
                }
                DirectionsResponseParsingResult directionsResponseParsingResult2 = directionsResponseParsingResult;
                ArrayList arrayList4 = arrayList2;
                arrayList4.add(new NavigationRoute(directionsRoute, list, str, routeOptions, routeInterface, lValueOf, ((DirectionsRouteModelParsingResult) arrayList.get(i)).operations));
                i++;
                str = str;
                arrayList2 = arrayList4;
                it = it;
                directionsResponseParsingResult = directionsResponseParsingResult2;
                str2 = null;
            }
            responseUuid = str2;
            arrayList3 = arrayList2;
            j = parseResult2.parseMillis;
            j2 = parseResult.parseMillis;
            this.$logger.getClass();
            if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
                StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.$performanceSectionName, " for ");
                navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat((List) arrayList3);
                if (navigationRoute != null) {
                    responseUuid = navigationRoute.nativeRoute.getResponseUuid();
                    responseUuid.getClass();
                }
                sbM.append(responseUuid);
                sbM.append(",total parse time ");
                sbM.append(j + j2);
                sbM.append("ms");
                Time$SystemClockImpl.logD(sbM.toString(), this.$logCategory);
            }
            return new RoutesResponse(arrayList3, new RoutesResponse.Metadata(invokeSuspend$currentElapsedMillis(this.$time), parseResult2.threadName, parseResult2.waitMillis, parseResult2.parseMillis, parseResult.waitMillis, parseResult.parseMillis));
            ParseResult parseResult3 = (ParseResult) objAwaitInternal;
            this.L$0 = parseResult3;
            this.label = 2;
            objAwait = getopeninganimationIconCompatParcelizer.await(this);
            if (objAwait != coroutineSingletons) {
                parseResult = parseResult3;
                ParseResult parseResult4 = (ParseResult) objAwait;
                Expected expected2 = (Expected) parseResult.value;
                Object obj3 = ((onItemDismiss) parseResult4.value).IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                directionsResponseParsingResult = (DirectionsResponseParsingResult) obj3;
                unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                l = new Long(BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(UriKt.IconCompatParcelizer(this.$responseTimeElapsedMillis, setUnregisteredInAppMessage.MILLISECONDS), setUnregisteredInAppMessage.SECONDS));
                str = this.$response.responseOriginAPI;
                expected2.getClass();
                directionsResponseParsingResult.getClass();
                arrayList = directionsResponseParsingResult.routesParsingResult;
                Object objFold2 = expected2.fold(new Snapshotter$$ExternalSyntheticLambda0(14), new Snapshotter$$ExternalSyntheticLambda0(15));
                objFold2.getClass();
                Iterable iterable2 = (Iterable) objFold2;
                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(iterable2, 10));
                it = iterable2.iterator();
                i = 0;
                while (it.hasNext()) {
                    next = it.next();
                    if (i >= 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    RouteInterface routeInterface2 = (RouteInterface) next;
                    DirectionsParsedRouteData directionsParsedRouteData2 = ((DirectionsRouteModelParsingResult) arrayList.get(i)).data;
                    DirectionsRoute directionsRoute2 = directionsParsedRouteData2.route;
                    List list2 = directionsParsedRouteData2.routesWaypoint;
                    RouteOptions routeOptions2 = directionsResponseParsingResult.routeOptions;
                    numRefreshTtl = zzmb.refreshTtl(directionsRoute2);
                    if (numRefreshTtl != null) {
                        lValueOf = Long.valueOf(((long) numRefreshTtl.intValue()) + l.longValue());
                    } else {
                        lValueOf = null;
                    }
                    DirectionsResponseParsingResult directionsResponseParsingResult3 = directionsResponseParsingResult;
                    ArrayList arrayList5 = arrayList2;
                    arrayList5.add(new NavigationRoute(directionsRoute2, list2, str, routeOptions2, routeInterface2, lValueOf, ((DirectionsRouteModelParsingResult) arrayList.get(i)).operations));
                    i++;
                    str = str;
                    arrayList2 = arrayList5;
                    it = it;
                    directionsResponseParsingResult = directionsResponseParsingResult3;
                    str2 = null;
                }
                responseUuid = str2;
                arrayList3 = arrayList2;
                j = parseResult4.parseMillis;
                j2 = parseResult.parseMillis;
                this.$logger.getClass();
                if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
                    StringBuilder sbM2 = af$$ExternalSyntheticOutline0.m(this.$performanceSectionName, " for ");
                    navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat((List) arrayList3);
                    if (navigationRoute != null) {
                        responseUuid = navigationRoute.nativeRoute.getResponseUuid();
                        responseUuid.getClass();
                    }
                    sbM2.append(responseUuid);
                    sbM2.append(",total parse time ");
                    sbM2.append(j + j2);
                    sbM2.append("ms");
                    Time$SystemClockImpl.logD(sbM2.toString(), this.$logCategory);
                }
                return new RoutesResponse(arrayList3, new RoutesResponse.Metadata(invokeSuspend$currentElapsedMillis(this.$time), parseResult4.threadName, parseResult4.waitMillis, parseResult4.parseMillis, parseResult.waitMillis, parseResult.parseMillis));
            }
            return coroutineSingletons;
        }

        public static final long invokeSuspend$currentElapsedMillis(Time$SystemClockImpl time$SystemClockImpl) {
            time$SystemClockImpl.getClass();
            return SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1(long j, p0 p0Var, ResponseToParse responseToParse, Time$SystemClockImpl time$SystemClockImpl, Time$SystemClockImpl time$SystemClockImpl2, String str, String str2, String str3, ShortNewsContentCardView shortNewsContentCardView, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, CoroutineDispatcher coroutineDispatcher) {
        super(1, shortNewsContentCardView);
        this.$logger = time$SystemClockImpl;
        this.$logCategory = str;
        this.$parsingDispatcher = coroutineDispatcher;
        this.$responseTimeElapsedMillis = j;
        this.$response = responseToParse;
        this.$time = time$SystemClockImpl2;
        this.$modelParser = p0Var;
        this.$nativePerformanceSectionName = str2;
        this.$nativeParseFn = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.$performanceSectionName = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.$nativeParseFn;
        return new NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1(this.$responseTimeElapsedMillis, this.$modelParser, this.$response, this.$logger, this.$time, this.$logCategory, this.$nativePerformanceSectionName, this.$performanceSectionName, shortNewsContentCardView, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, this.$parsingDispatcher);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$2$parsedResponse$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Failed to inline method: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Not passed register '(r2v0 'str2' java.lang.String)' in method call: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
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
        this.$logger.getClass();
        NativeLoggerWrapper.INSTANCE.info(LoggerFrontendKt.access$createMessage("parallel parsing started", this.$logCategory), "nav-sdk");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$responseTimeElapsedMillis, this.$modelParser, this.$response, this.$time, this.$logger, this.$logCategory, this.$nativePerformanceSectionName, this.$performanceSectionName, null, this.$nativeParseFn, this.$parsingDispatcher);
        this.label = 1;
        Object objCoroutineScope = YieldKt.coroutineScope(anonymousClass1, this);
        return objCoroutineScope == coroutineSingletons ? coroutineSingletons : objCoroutineScope;
    }
}
