package com.mapbox.navigation.core.directions.session;

import android.os.SystemClock;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import androidx.lifecycle.BlockRunner;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.google.firebase.firestore.core.FirestoreClient$$ExternalSyntheticLambda1;
import com.google.firestore.v1.FirestoreGrpc;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MapboxOptionsImpl;
import com.mapbox.common.MapboxServices;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.ParsingEntryPoint;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRoutesParser;
import com.mapbox.navigation.core.internal.router.GetRouteSignature;
import com.mapbox.navigation.core.internal.router.OngoingRequest;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.SearchEngineImpl$search$3;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.BackspaceCommand;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createAppropriateViews;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getContentViewGroupParentLayout;
import o.getCutText;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setHeightOnViewLayoutParams;
import o.setInAppMessageImageViewAttributes;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxDirectionsSession {
    public int initialLegIndex;
    public final CopyOnWriteArraySet onSetNavigationRoutesFinishedObservers = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet onSetNavigationRoutesStartedObservers = new CopyOnWriteArraySet();
    public final BlockRunner router;
    public RoutesUpdatedResult routesUpdatedResult;

    public final void cancelRouteRequest(long j) {
        BlockRunner blockRunner = this.router;
        LinkedHashMap linkedHashMap = (LinkedHashMap) blockRunner.RatingCompat;
        OngoingRequest ongoingRequest = (OngoingRequest) linkedHashMap.get(Long.valueOf(j));
        if (ongoingRequest != null) {
            ongoingRequest.onCancel.invoke();
            linkedHashMap.remove(Long.valueOf(j));
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = ongoingRequest.parsingJob;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            }
        }
        blockRunner.getRouter$navigation_release().cancelRouteRequest(j);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0114 A[LOOP:1: B:22:0x00db->B:28:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0117 A[EDGE_INSN: B:42:0x0117->B:29:0x0117 BREAK  A[LOOP:1: B:22:0x00db->B:28:0x0114], SYNTHETIC] */
    public final long requestRoutes(final RouteOptions routeOptions, GetRouteSignature getRouteSignature, CallsKt$await$2$2 callsKt$await$2$2) {
        String str;
        routeOptions.getClass();
        getRouteSignature.getClass();
        String tokenForService = MapboxOptionsImpl.getTokenForService(MapboxServices.DIRECTIONS);
        tokenForService.getClass();
        final String string = routeOptions.toUrl(tokenForService).toString();
        string.getClass();
        final AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl(6, callsKt$await$2$2);
        final BlockRunner blockRunner = this.router;
        final RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, (ParsingEntryPoint) blockRunner.serializer, NavigationRoutesParser.class, "parseDirectionsResponse", "parseDirectionsResponse-gIAlu-s(Lcom/mapbox/navigation/base/internal/route/parsing/ResponseToParse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4);
        SearchEngineImpl$search$3 searchEngineImpl$search$3 = new SearchEngineImpl$search$3(blockRunner, string, getRouteSignature, 2);
        createAppropriateViews createappropriateviews = new createAppropriateViews();
        createappropriateviews.read(null, string);
        setInAppMessageImageViewAttributes setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviews.RemoteActionCompatParcelizer();
        List list = setinappmessageimageviewattributesRemoteActionCompatParcelizer.queryNamesAndValues;
        if (list != null) {
            getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(list.size())}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
            int i = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
            int i2 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
            int i3 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    if (!"access_token".equals(list.get(i))) {
                        if (i == i2) {
                            str = null;
                            break;
                        }
                        i += i3;
                    } else {
                        str = (String) list.get(i + 1);
                        break;
                    }
                }
            } else {
                str = null;
                break;
            }
        } else {
            str = null;
            break;
        }
        if (str != null) {
            createAppropriateViews createappropriateviewsMediaDescriptionCompat = setinappmessageimageviewattributesRemoteActionCompatParcelizer.MediaDescriptionCompat();
            if (((ArrayList) createappropriateviewsMediaDescriptionCompat.read) != null) {
                String strRemoteActionCompatParcelizer = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer("access_token", 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~");
                ArrayList arrayList = (ArrayList) createappropriateviewsMediaDescriptionCompat.read;
                arrayList.getClass();
                int size = arrayList.size() - 2;
                int i4 = TuplesKt.read(size, 0, -2);
                if (i4 <= size) {
                    while (true) {
                        ArrayList arrayList2 = (ArrayList) createappropriateviewsMediaDescriptionCompat.read;
                        arrayList2.getClass();
                        if (!strRemoteActionCompatParcelizer.equals(arrayList2.get(size))) {
                            if (size != i4) {
                                break;
                                break;
                            }
                            size -= 2;
                        } else {
                            ArrayList arrayList3 = (ArrayList) createappropriateviewsMediaDescriptionCompat.read;
                            arrayList3.getClass();
                            arrayList3.remove(size + 1);
                            ArrayList arrayList4 = (ArrayList) createappropriateviewsMediaDescriptionCompat.read;
                            arrayList4.getClass();
                            arrayList4.remove(size);
                            ArrayList arrayList5 = (ArrayList) createappropriateviewsMediaDescriptionCompat.read;
                            arrayList5.getClass();
                            if (!arrayList5.isEmpty()) {
                                if (size != i4) {
                                    break;
                                }
                                size -= 2;
                            } else {
                                createappropriateviewsMediaDescriptionCompat.read = null;
                                break;
                            }
                        }
                    }
                }
            }
            createappropriateviewsMediaDescriptionCompat.write("access_token", "redacted");
            setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviewsMediaDescriptionCompat.RemoteActionCompatParcelizer();
        }
        final URL url = new URL(setinappmessageimageviewattributesRemoteActionCompatParcelizer.url);
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("requesting route for " + url, "RouterWrapper");
        }
        final RouterInterface router$navigation_release = blockRunner.getRouter$navigation_release();
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        final AsyncSection asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("RouterWrapper#getRoute()");
        final createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0 = new createBrazeUserChangeEventSubscriberlambda0();
        long jLongValue = ((Number) searchEngineImpl$search$3.invoke(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$requestRoute$2

            /* JADX INFO: renamed from: com.mapbox.navigation.core.internal.router.RouterWrapper$requestRoute$2$2, reason: invalid class name */
            public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                public final /* synthetic */ AnalyticsServiceImpl $callback;
                public final /* synthetic */ RouterOrigin $origin;
                public final /* synthetic */ RouterInterface $originRouter;
                public final /* synthetic */ RoomDatabase$createConnectionManager$2 $parseResponse;
                public final /* synthetic */ createBrazeUserChangeEventSubscriberlambda0 $requestId;
                public final /* synthetic */ Expected $result;
                public final /* synthetic */ RouteOptions $routeOptionsForCallback;
                public final /* synthetic */ String $routeUrl;
                public final /* synthetic */ AsyncSection $section;
                public final /* synthetic */ URL $urlWithoutToken;
                public final /* synthetic */ BlockRunner this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(AsyncSection asyncSection, BlockRunner blockRunner, createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0, RouteOptions routeOptions, String str, URL url, RouterInterface routerInterface, Expected expected, RouterOrigin routerOrigin, AnalyticsServiceImpl analyticsServiceImpl, RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2, ShortNewsContentCardView shortNewsContentCardView) {
                    super(2, shortNewsContentCardView);
                    this.$section = asyncSection;
                    this.this$0 = blockRunner;
                    this.$requestId = createbrazeuserchangeeventsubscriberlambda0;
                    this.$routeOptionsForCallback = routeOptions;
                    this.$routeUrl = str;
                    this.$urlWithoutToken = url;
                    this.$originRouter = routerInterface;
                    this.$result = expected;
                    this.$origin = routerOrigin;
                    this.$callback = analyticsServiceImpl;
                    this.$parseResponse = roomDatabase$createConnectionManager$2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    return new AnonymousClass2(this.$section, this.this$0, this.$requestId, this.$routeOptionsForCallback, this.$routeUrl, this.$urlWithoutToken, this.$originRouter, this.$result, this.$origin, this.$callback, this.$parseResponse, shortNewsContentCardView);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    anonymousClass2.invokeSuspend(createfromparcel);
                    return createfromparcel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                    PerformanceTracker.asyncSectionCompleted(this.$section);
                    createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0 = this.$requestId;
                    final Long l = new Long(createbrazeuserchangeeventsubscriberlambda0.serializer);
                    Long l2 = new Long(createbrazeuserchangeeventsubscriberlambda0.serializer);
                    AnalyticsServiceImpl analyticsServiceImpl = this.$callback;
                    final BlockRunner blockRunner = this.this$0;
                    final x xVar = new x(blockRunner, l2, analyticsServiceImpl, 20);
                    if (((LinkedHashMap) blockRunner.RatingCompat).get(l) != null) {
                        boolean zEquals = this.$originRouter.equals(blockRunner.getRouter$navigation_release());
                        final RouteOptions routeOptions = this.$routeOptionsForCallback;
                        final URL url = this.$urlWithoutToken;
                        final RouterOrigin routerOrigin = this.$origin;
                        if (zEquals) {
                            FirestoreClient$$ExternalSyntheticLambda1 firestoreClient$$ExternalSyntheticLambda1 = new FirestoreClient$$ExternalSyntheticLambda1(routeOptions, routerOrigin, xVar, url);
                            final RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = this.$parseResponse;
                            final String str = this.$routeUrl;
                            this.$result.fold(firestoreClient$$ExternalSyntheticLambda1, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c3: INVOKE 
                                  (wrap com.mapbox.bindgen.Expected:0x00c1: IGET (r20v0 'this' com.mapbox.navigation.core.internal.router.RouterWrapper$requestRoute$2$2 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:163) com.mapbox.navigation.core.internal.router.RouterWrapper$requestRoute$2.2.$result com.mapbox.bindgen.Expected)
                                  (r1v11 'firestoreClient$$ExternalSyntheticLambda1' com.google.firebase.firestore.core.FirestoreClient$$ExternalSyntheticLambda1)
                                  (wrap com.mapbox.bindgen.Expected$Transformer:0x00be: CONSTRUCTOR 
                                  (r5v0 'blockRunner' androidx.lifecycle.BlockRunner A[DONT_INLINE])
                                  (r14v0 'url' java.net.URL A[DONT_INLINE])
                                  (r7v0 'l' java.lang.Long A[DONT_INLINE])
                                  (r8v0 'roomDatabase$createConnectionManager$2' androidx.room.RoomDatabase$createConnectionManager$2 A[DONT_INLINE])
                                  (r9v0 'str' java.lang.String A[DONT_INLINE])
                                  (r10v0 'routerOrigin' com.mapbox.navigator.RouterOrigin A[DONT_INLINE])
                                  (r11v0 'xVar' com.huawei.wisesecurity.ucs_credential.x A[DONT_INLINE])
                                  (r12v0 'routeOptions' com.mapbox.api.directions.v5.models.RouteOptions A[DONT_INLINE])
                                 A[MD:(androidx.lifecycle.BlockRunner, java.net.URL, java.lang.Long, androidx.room.RoomDatabase$createConnectionManager$2, java.lang.String, com.mapbox.navigator.RouterOrigin, com.huawei.wisesecurity.ucs_credential.x, com.mapbox.api.directions.v5.models.RouteOptions):void (m), WRAPPED] (LINE:160) call: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda4.<init>(androidx.lifecycle.BlockRunner, java.net.URL, java.lang.Long, androidx.room.RoomDatabase$createConnectionManager$2, java.lang.String, com.mapbox.navigator.RouterOrigin, com.huawei.wisesecurity.ucs_credential.x, com.mapbox.api.directions.v5.models.RouteOptions):void type: CONSTRUCTOR)
                                 VIRTUAL call: com.mapbox.bindgen.Expected.fold(com.mapbox.bindgen.Expected$Transformer, com.mapbox.bindgen.Expected$Transformer):java.lang.Object A[MD:<R>:(com.mapbox.bindgen.Expected$Transformer<E, R>, com.mapbox.bindgen.Expected$Transformer<V, R>):R (m)] (LINE:165) in method: com.mapbox.navigation.core.internal.router.RouterWrapper$requestRoute$2.2.invokeSuspend(java.lang.Object):java.lang.Object, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:97)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:878)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda4, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 108 more
                                */
                            /*
                                Method dump skipped, instruction units count: 201
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.core.internal.router.RouterWrapper$requestRoute$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        Expected expected = (Expected) obj;
                        RouterOrigin routerOrigin = (RouterOrigin) obj2;
                        expected.getClass();
                        routerOrigin.getClass();
                        cancelpendingwebviewpause.IconCompatParcelizer = true;
                        boolean zAccepts = LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG);
                        URL url2 = url;
                        if (zAccepts) {
                            LoggerProviderKt.logD("received result from router.getRoute for " + url2 + "; origin: " + routerOrigin, "RouterWrapper");
                        }
                        BlockRunner blockRunner2 = blockRunner;
                        BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new AnonymousClass2(asyncSectionAsyncSectionStarted, blockRunner2, createbrazeuserchangeeventsubscriberlambda0, routeOptions, string, url2, router$navigation_release, expected, routerOrigin, analyticsServiceImpl, roomDatabase$createConnectionManager$2, null), 3);
                        return createFromParcel.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                })).longValue();
                createbrazeuserchangeeventsubscriberlambda0.serializer = jLongValue;
                if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                    ((LinkedHashMap) blockRunner.RatingCompat).put(Long.valueOf(jLongValue), new OngoingRequest(new ConstraintSetForInlineDsl$applyTo$1(asyncSectionAsyncSectionStarted, analyticsServiceImpl, routeOptions, 3)));
                }
                return createbrazeuserchangeeventsubscriberlambda0.serializer;
            }

            public MapboxDirectionsSession(BlockRunner blockRunner) {
                this.router = blockRunner;
            }

            public final List getIgnoredRoutes() {
                RoutesUpdatedResult routesUpdatedResult = this.routesUpdatedResult;
                return routesUpdatedResult != null ? routesUpdatedResult.ignoredRoutes : instance_delegatelambda0.write;
            }

            public final List getRoutes() {
                RoutesUpdatedResult routesUpdatedResult = this.routesUpdatedResult;
                return routesUpdatedResult != null ? routesUpdatedResult.navigationRoutes : instance_delegatelambda0.write;
            }

            public final void setNavigationRoutesFinished(DirectionsSessionRoutes directionsSessionRoutes) throws Exception {
                String str;
                String str2;
                List list = directionsSessionRoutes.acceptedRoutes;
                getCutText getcuttext = directionsSessionRoutes.setRoutesInfo;
                this.initialLegIndex = FirestoreGrpc.initialLegIndex(getcuttext);
                RoutesUpdatedResult routesUpdatedResult = this.routesUpdatedResult;
                if (routesUpdatedResult != null && routesUpdatedResult.navigationRoutes.isEmpty() && list.isEmpty()) {
                    return;
                }
                RoutesUpdatedResult routesUpdatedResult2 = new RoutesUpdatedResult(FirestoreGrpc.mapToReason(getcuttext), list, directionsSessionRoutes.ignoredRoutes);
                this.routesUpdatedResult = routesUpdatedResult2;
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
                CopyOnWriteArraySet copyOnWriteArraySet = this.onSetNavigationRoutesFinishedObservers;
                String str3 = " completed in ";
                String str4 = "Calling observer [";
                if (!trackingIsActive) {
                    int size = copyOnWriteArraySet.size();
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                        LoggerProviderKt.logI("Notifying " + size + " RoutesObserver(s) - STARTING", "MapboxDirectionsSession");
                    }
                    Iterator it = copyOnWriteArraySet.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            RoutesObserver routesObserver = (RoutesObserver) next;
                            String simpleName = routesObserver.getClass().getSimpleName();
                            LoggingLevel loggingLevelLogLevel = LoggerProviderKt.logLevel();
                            Iterator it2 = it;
                            LoggingLevel loggingLevel = LoggingLevel.INFO;
                            if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel, loggingLevel)) {
                                LoggerProviderKt.logI(str4 + i2 + '/' + size + "]: " + simpleName + ".onRoutesChanged", "MapboxDirectionsSession");
                            }
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            try {
                                routesObserver.onRoutesChanged(routesUpdatedResult2);
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
                                    LoggerProviderKt.logI("Observer [" + i2 + '/' + size + "]: " + simpleName + str3 + (jElapsedRealtime2 - jElapsedRealtime) + "ms", "MapboxDirectionsSession");
                                }
                                i = i2;
                                routesUpdatedResult2 = routesUpdatedResult2;
                                str3 = str3;
                                it = it2;
                                str4 = str4;
                            } catch (Exception e) {
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                    LoggerProviderKt.logE("Observer [" + i2 + '/' + size + "]: " + simpleName + " threw exception after " + (jElapsedRealtime3 - jElapsedRealtime) + "ms: " + e, "MapboxDirectionsSession");
                                }
                                throw e;
                            }
                        } else {
                            SQLite.serializer();
                            throw null;
                        }
                    }
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                        LoggerProviderKt.logI("All " + size + " observer(s) notified - COMPLETED", "MapboxDirectionsSession");
                        return;
                    }
                    return;
                }
                String str5 = "Calling observer [";
                RoutesUpdatedResult routesUpdatedResult3 = routesUpdatedResult2;
                String str6 = " observer(s) notified - COMPLETED";
                PerformanceTracker.syncSectionStarted("MapboxDirectionsSession-dispatch-onRoutesChanged");
                try {
                    long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                    int size2 = copyOnWriteArraySet.size();
                    String str7 = " completed in ";
                    try {
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                            LoggerProviderKt.logI("Notifying " + size2 + " RoutesObserver(s) - STARTING", "MapboxDirectionsSession");
                        }
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            try {
                                Object next2 = it3.next();
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    RoutesObserver routesObserver2 = (RoutesObserver) next2;
                                    String simpleName2 = routesObserver2.getClass().getSimpleName();
                                    LoggingLevel loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                                    Iterator it4 = it3;
                                    LoggingLevel loggingLevel2 = LoggingLevel.INFO;
                                    if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                        StringBuilder sb = new StringBuilder();
                                        String str8 = str5;
                                        sb.append(str8);
                                        sb.append(i4);
                                        str5 = str8;
                                        sb.append('/');
                                        sb.append(size2);
                                        sb.append("]: ");
                                        sb.append(simpleName2);
                                        sb.append(".onRoutesChanged");
                                        LoggerProviderKt.logI(sb.toString(), "MapboxDirectionsSession");
                                    }
                                    long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                                    try {
                                        routesObserver2.onRoutesChanged(routesUpdatedResult3);
                                        long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Observer [");
                                            sb2.append(i4);
                                            sb2.append('/');
                                            sb2.append(size2);
                                            sb2.append("]: ");
                                            sb2.append(simpleName2);
                                            str2 = str7;
                                            sb2.append(str2);
                                            sb2.append(jElapsedRealtime5 - jElapsedRealtime4);
                                            sb2.append("ms");
                                            LoggerProviderKt.logI(sb2.toString(), "MapboxDirectionsSession");
                                        } else {
                                            str2 = str7;
                                        }
                                        it3 = it4;
                                        str7 = str2;
                                        routesUpdatedResult3 = routesUpdatedResult3;
                                        i3 = i4;
                                        str6 = str6;
                                    } catch (Exception e2) {
                                        long jElapsedRealtime6 = SystemClock.elapsedRealtime();
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                            LoggerProviderKt.logE("Observer [" + i4 + '/' + size2 + "]: " + simpleName2 + " threw exception after " + (jElapsedRealtime6 - jElapsedRealtime4) + "ms: " + e2, "MapboxDirectionsSession");
                                        }
                                        throw e2;
                                    }
                                } else {
                                    SQLite.serializer();
                                    throw null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                str = "MapboxDirectionsSession-dispatch-onRoutesChanged";
                                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str, null);
                                throw th;
                            }
                        }
                        String str9 = str6;
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                            LoggerProviderKt.logI("All " + size2 + str9, "MapboxDirectionsSession");
                        }
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxDirectionsSession-dispatch-onRoutesChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "MapboxDirectionsSession-dispatch-onRoutesChanged";
                }
            }
        }
