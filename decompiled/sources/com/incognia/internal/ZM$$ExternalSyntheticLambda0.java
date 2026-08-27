package com.incognia.internal;

import android.content.Context;
import android.webkit.WebView;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.collection.ObjectList$toString$1;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.common_ui.databinding.LayoutTileBinding;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.locationSdk.c0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.battery.AndroidBatteryMonitor;
import com.mapbox.common.movement.AndroidMovementMonitor;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.renderer.RenderEvent;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$resolve$2;
import com.mapbox.search.SearchEngineImpl$search$3;
import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$WhenMappings;
import com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$7$task$1;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.mapbox.search.base.logger.LogKt;
import com.mapbox.search.base.result.BaseRawSearchResult;
import com.mapbox.search.base.result.BaseSearchResponseKt;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.base.result.SearchResultFactory;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.base.utils.extension.SearchResponseErrorKt;
import com.mapbox.search.base.utils.orientation.ScreenOrientation;
import com.mapbox.search.common.CompletionCallback;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.internal.bindgen.ApiType;
import com.mapbox.search.internal.bindgen.Error;
import com.mapbox.search.internal.bindgen.RequestOptions;
import com.mapbox.search.internal.bindgen.ResultType;
import com.mapbox.search.internal.bindgen.SearchResponse;
import com.mapbox.search.internal.bindgen.SearchResult;
import com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl;
import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.IndexableRecord;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.mapbox.search.record.LocalDataProviderImpl$DataState$Error;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.mapbox.search.utils.LoggingCompletionCallback;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.sentiance.sdk.crashdetection.api.VehicleCrashDiagnostic;
import com.sentiance.sdk.crashdetection.api.VehicleCrashDiagnosticListener;
import com.sentiance.sdk.crashdetection.api.VehicleCrashEvent;
import com.sentiance.sdk.crashdetection.api.VehicleCrashListener;
import com.sentiance.sdk.diagnostics.GooglePlayServicesObserver;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEvent;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEventListener;
import io.sentry.okhttp.SentryOkHttpEventListener$callFailed$1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import o.accessprocessDragStart;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ZM$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ZM$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        final int i = 2;
        final int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                ZM.BGx((ZM) this.f$0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$1);
                return;
            case 1:
                ((c0) this.f$0).a((HWLocation) this.f$1);
                return;
            case 2:
                LHl.BGx((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$1, (LHl) this.f$0);
                return;
            case 3:
                AndroidBatteryMonitor.notifyObservers$lambda$2$lambda$1((BatteryMonitorObserver) this.f$0, (Expected) this.f$1);
                return;
            case 4:
                AndroidMovementMonitor.notifyObservers$lambda$2$lambda$1((MovementModeObserver) this.f$0, (MovementInfo) this.f$1);
                return;
            case 5:
                MapboxRenderThread.postNonRenderEvent$lambda$30((MapboxRenderThread) this.f$0, (RenderEvent) this.f$1);
                return;
            case 6:
                EGLCore.notifyListeners$lambda$5((HashSet) this.f$0, (RendererError) this.f$1);
                return;
            case 7:
                EGLCore.addRendererStateListener$lambda$3((LinkedList) this.f$0, (RendererSetupErrorListener) this.f$1);
                return;
            case 8:
                ((MapboxNativeNavigatorImpl) this.f$0).setUserLanguages(com.huawei.wisesecurity.ucs_credential.n0.access$getDeviceLanguageTags((Context) this.f$1));
                return;
            case 9:
                ((OneStepRequestCallbackWrapper$run$1$7$task$1) ((SearchEngineImpl$search$3) this.f$0).this$0).invoke(new onItemDismiss(new isItemDismissable(new Exception("Unable to find data provider with name: " + ((LocalDataProviderImpl) this.f$1)))));
                return;
            case 10:
                CompoundCompletionCallback compoundCompletionCallback = (CompoundCompletionCallback) this.f$0;
                LocalDataProviderImpl localDataProviderImpl = (LocalDataProviderImpl) this.f$1;
                localDataProviderImpl.getClass();
                compoundCompletionCallback.onError(new IllegalStateException(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), localDataProviderImpl.dataProviderName, " has already been registered in the provided search engine")));
                return;
            case 11:
                AsyncOperationTaskImpl asyncOperationTaskImpl = (AsyncOperationTaskImpl) this.f$0;
                LoggingCompletionCallback loggingCompletionCallback = (LoggingCompletionCallback) this.f$1;
                asyncOperationTaskImpl.onComplete();
                CommonSdkLog.INSTANCE.logd(null, loggingCompletionCallback.operationName.concat(" completed"));
                return;
            case 12:
                AsyncOperationTaskImpl asyncOperationTaskImpl2 = (AsyncOperationTaskImpl) this.f$0;
                CompoundCompletionCallback compoundCompletionCallback2 = (CompoundCompletionCallback) this.f$1;
                asyncOperationTaskImpl2.onComplete();
                compoundCompletionCallback2.onComplete(createFromParcel.INSTANCE);
                return;
            case 13:
                DropShadowEffect dropShadowEffect = (DropShadowEffect) this.f$0;
                SearchResponse searchResponse = (SearchResponse) this.f$1;
                if (((AsyncOperationTaskImpl) dropShadowEffect.serializer).isCompleted()) {
                    return;
                }
                SearchRequestContext searchRequestContext = (SearchRequestContext) dropShadowEffect.MediaDescriptionCompat;
                String responseUUID = searchResponse.getResponseUUID();
                ApiType apiType = searchRequestContext.apiType;
                Locale locale = searchRequestContext.keyboardLocale;
                ScreenOrientation screenOrientation = searchRequestContext.screenOrientation;
                apiType.getClass();
                SearchRequestContext searchRequestContext2 = new SearchRequestContext(apiType, locale, screenOrientation, responseUUID);
                ArrayList arrayList = new ArrayList();
                try {
                    if (searchResponse.getResults().isError()) {
                        Error error = searchResponse.getResults().getError();
                        if (error == null) {
                            new IllegalStateException("CoreSearchResponse.isError == true but error is null", null);
                            LogKt.logw$default("CoreSearchResponse.isError == true but error is null");
                            return;
                        }
                        Error.Type typeInfo = error.getTypeInfo();
                        int i3 = typeInfo == null ? -1 : OneStepRequestCallbackWrapper$WhenMappings.$EnumSwitchMapping$0[typeInfo.ordinal()];
                        if (i3 == -1) {
                            ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new ObjectList$toString$1(29, new IllegalStateException("CoreSearchResponse.error.typeInfo is null")));
                            return;
                        }
                        if (i3 == 1) {
                            ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new SentryOkHttpEventListener$callFailed$1(1, new IOException("Unable to perform search request: " + error.getConnectionError().getMessage())));
                            return;
                        }
                        if (i3 == 2) {
                            final Exception platformHttpException = SearchResponseErrorKt.toPlatformHttpException(error);
                            ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj) {
                                    int i4 = i2;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    Exception exc = platformHttpException;
                                    if (i4 == 0) {
                                        BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj;
                                        baseSearchCallbackAdapter.getClass();
                                        baseSearchCallbackAdapter.onError(exc);
                                        return createfromparcel;
                                    }
                                    if (i4 != 1) {
                                        BaseSearchCallbackAdapter baseSearchCallbackAdapter2 = (BaseSearchCallbackAdapter) obj;
                                        baseSearchCallbackAdapter2.getClass();
                                        baseSearchCallbackAdapter2.onError(exc);
                                        return createfromparcel;
                                    }
                                    BaseSearchCallbackAdapter baseSearchCallbackAdapter3 = (BaseSearchCallbackAdapter) obj;
                                    baseSearchCallbackAdapter3.getClass();
                                    baseSearchCallbackAdapter3.onError(exc);
                                    return createfromparcel;
                                }
                            });
                            return;
                        }
                        if (i3 == 3) {
                            final Exception exc = new Exception("Unable to perform search request: " + error.getInternalError().getMessage());
                            ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj) {
                                    int i4 = i;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    Exception exc2 = exc;
                                    if (i4 == 0) {
                                        BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj;
                                        baseSearchCallbackAdapter.getClass();
                                        baseSearchCallbackAdapter.onError(exc2);
                                        return createfromparcel;
                                    }
                                    if (i4 != 1) {
                                        BaseSearchCallbackAdapter baseSearchCallbackAdapter2 = (BaseSearchCallbackAdapter) obj;
                                        baseSearchCallbackAdapter2.getClass();
                                        baseSearchCallbackAdapter2.onError(exc2);
                                        return createfromparcel;
                                    }
                                    BaseSearchCallbackAdapter baseSearchCallbackAdapter3 = (BaseSearchCallbackAdapter) obj;
                                    baseSearchCallbackAdapter3.getClass();
                                    baseSearchCallbackAdapter3.onError(exc2);
                                    return createfromparcel;
                                }
                            });
                            return;
                        }
                        if (i3 != 4) {
                            return;
                        }
                        AsyncOperationTaskImpl asyncOperationTaskImpl3 = (AsyncOperationTaskImpl) dropShadowEffect.serializer;
                        AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0 androidMainThreadWorkerImpl$$ExternalSyntheticLambda0 = (AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat;
                        ObjectList$toString$1 objectList$toString$1 = new ObjectList$toString$1(28, error);
                        asyncOperationTaskImpl3.getClass();
                        androidMainThreadWorkerImpl$$ExternalSyntheticLambda0.execute(new ZM$$ExternalSyntheticLambda0(asyncOperationTaskImpl3, 15, objectList$toString$1));
                        return;
                    }
                    List<SearchResult> value = searchResponse.getResults().getValue();
                    if (value == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    List<SearchResult> list = value;
                    RequestOptions request = searchResponse.getRequest();
                    request.getClass();
                    BaseRequestOptions baseRequestOptions = new BaseRequestOptions(request, searchRequestContext2);
                    BaseResponseInfo baseResponseInfo = new BaseResponseInfo(baseRequestOptions, BaseSearchResponseKt.mapToBase(searchResponse), true);
                    accessprocessDragStart accessprocessdragstart = new accessprocessDragStart(0);
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        SearchResult searchResult = (SearchResult) obj;
                        searchResult.getClass();
                        BaseRawSearchResult baseRawSearchResultMapToBase = DeferrableSurfaces.mapToBase(searchResult);
                        ((SearchResultFactory) dropShadowEffect.read).getClass();
                        boolean zIsResolvedSearchResult = SearchResultFactory.isResolvedSearchResult(baseRawSearchResultMapToBase);
                        SearchResultFactory searchResultFactory = (SearchResultFactory) dropShadowEffect.read;
                        if (zIsResolvedSearchResult) {
                            searchResultFactory.getClass();
                            Object objCreateSearchResult = SearchResultFactory.createSearchResult(baseRawSearchResultMapToBase, baseRequestOptions);
                            if (objCreateSearchResult == null) {
                                objCreateSearchResult = new isItemDismissable(new Exception("Can't resolve search result: " + baseRawSearchResultMapToBase));
                            }
                            accessprocessdragstart.serializer(i4, new onItemDismiss(objCreateSearchResult));
                        } else {
                            searchResultFactory.getClass();
                            if (baseRawSearchResultMapToBase.type == ResultType.USER_RECORD) {
                                AsyncOperationTaskImpl asyncOperationTaskImplResolveIndexableRecordSearchResultAsync = ((SearchResultFactory) dropShadowEffect.read).resolveIndexableRecordSearchResultAsync(baseRawSearchResultMapToBase, (Executor) dropShadowEffect.write, baseRequestOptions, new OneStepRequestCallbackWrapper$run$1$7$task$1(accessprocessdragstart, i4, list, dropShadowEffect, baseResponseInfo));
                                ((AsyncOperationTaskImpl) dropShadowEffect.serializer).plusAssign(asyncOperationTaskImplResolveIndexableRecordSearchResultAsync);
                                arrayList.add(asyncOperationTaskImplResolveIndexableRecordSearchResultAsync);
                            } else {
                                accessprocessdragstart.serializer(i4, new onItemDismiss(new isItemDismissable(new Exception("Can't resolve search result " + baseRawSearchResultMapToBase))));
                            }
                        }
                        DropShadowEffect.run$lambda$4$notifyCallbackIfNeeded(accessprocessdragstart, list, dropShadowEffect, baseResponseInfo);
                        i4 = i5;
                    }
                    if (list.isEmpty()) {
                        ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new LocationEngineAdapter.AnonymousClass1(1, baseResponseInfo));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AsyncOperationTaskImpl) it.next()).cancel();
                    }
                    AsyncOperationTaskImpl asyncOperationTaskImpl4 = (AsyncOperationTaskImpl) dropShadowEffect.serializer;
                    synchronized (asyncOperationTaskImpl4) {
                        if (!asyncOperationTaskImpl4.callbackActionExecuted) {
                            AsyncOperationTaskImpl asyncOperationTaskImpl5 = (AsyncOperationTaskImpl) dropShadowEffect.serializer;
                            synchronized (asyncOperationTaskImpl5) {
                                if (!asyncOperationTaskImpl5.isCancelled) {
                                    final int i6 = 1;
                                    ((AsyncOperationTaskImpl) dropShadowEffect.serializer).markExecutedAndRunOnCallback((AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0) dropShadowEffect.RatingCompat, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                        public final Object invoke(Object obj2) {
                                            int i7 = i6;
                                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                            Exception exc2 = e;
                                            if (i7 == 0) {
                                                BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj2;
                                                baseSearchCallbackAdapter.getClass();
                                                baseSearchCallbackAdapter.onError(exc2);
                                                return createfromparcel;
                                            }
                                            if (i7 != 1) {
                                                BaseSearchCallbackAdapter baseSearchCallbackAdapter2 = (BaseSearchCallbackAdapter) obj2;
                                                baseSearchCallbackAdapter2.getClass();
                                                baseSearchCallbackAdapter2.onError(exc2);
                                                return createfromparcel;
                                            }
                                            BaseSearchCallbackAdapter baseSearchCallbackAdapter3 = (BaseSearchCallbackAdapter) obj2;
                                            baseSearchCallbackAdapter3.getClass();
                                            baseSearchCallbackAdapter3.onError(exc2);
                                            return createfromparcel;
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                        throw e;
                    }
                }
            case 14:
                AsyncOperationTaskImpl asyncOperationTaskImpl6 = (AsyncOperationTaskImpl) this.f$0;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$1;
                synchronized (asyncOperationTaskImpl6) {
                    if (asyncOperationTaskImpl6.isCompleted()) {
                        return;
                    }
                    asyncOperationTaskImpl6.isDone = true;
                    asyncOperationTaskImpl6.onCancelledCallbacks.clear();
                    synchronized (asyncOperationTaskImpl6) {
                        Object obj2 = asyncOperationTaskImpl6.callbackDelegate;
                        if (obj2 == null) {
                            return;
                        }
                        asyncOperationTaskImpl6.setCallbackDelegate(null);
                        asyncOperationTaskImpl6.callbackActionExecuted = true;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2);
                        return;
                    }
                }
            case 15:
                AsyncOperationTaskImpl asyncOperationTaskImpl7 = (AsyncOperationTaskImpl) this.f$0;
                ObjectList$toString$1 objectList$toString$2 = (ObjectList$toString$1) this.f$1;
                asyncOperationTaskImpl7.getClass();
                synchronized (asyncOperationTaskImpl7) {
                    if (asyncOperationTaskImpl7.isCompleted()) {
                        return;
                    }
                    synchronized (asyncOperationTaskImpl7) {
                        Object obj3 = asyncOperationTaskImpl7.callbackDelegate;
                        asyncOperationTaskImpl7.setCallbackDelegate(null);
                        asyncOperationTaskImpl7.cancel();
                        if (obj3 == null) {
                            return;
                        }
                        asyncOperationTaskImpl7.callbackActionExecuted = true;
                        objectList$toString$2.invoke(obj3);
                        return;
                    }
                }
            case 16:
                DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata registrationProcessMetadata = (DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata) this.f$0;
                IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) this.f$1;
                Map map = registrationProcessMetadata.subscribers;
                for (Map.Entry entry : map.entrySet()) {
                    CompletionCallback completionCallback = (CompletionCallback) entry.getKey();
                    ((AsyncOperationTaskImpl) entry.getValue()).onComplete();
                    completionCallback.onComplete(indexableDataProviderEngineImpl);
                }
                map.clear();
                return;
            case 17:
                DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata registrationProcessMetadata2 = (DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata) this.f$0;
                Exception exc2 = (Exception) this.f$1;
                exc2.getClass();
                Map map2 = registrationProcessMetadata2.subscribers;
                for (Map.Entry entry2 : map2.entrySet()) {
                    CompletionCallback completionCallback2 = (CompletionCallback) entry2.getKey();
                    ((AsyncOperationTaskImpl) entry2.getValue()).onComplete();
                    completionCallback2.onError(exc2);
                }
                map2.clear();
                return;
            case 18:
                ((IndexableDataProvidersRegistryImpl$resolve$2) this.f$0).onComplete((IndexableRecord) this.f$1);
                return;
            case 19:
                ((IndexableDataProvidersRegistryImpl$resolve$2) this.f$0).onError(((LocalDataProviderImpl$DataState$Error) this.f$1).error);
                return;
            case 20:
                ((IndexableDataProvidersRegistryImpl$resolve$2) this.f$0).onError(((LocalDataProviderImpl$DataState$Error) this.f$1).error);
                return;
            case 21:
                ((AsyncOperationTaskImpl) this.f$0).runIfNotCancelled(new LocationEngineAdapter.AnonymousClass1(i, (Runnable) this.f$1));
                return;
            case 22:
                CompoundCompletionCallback compoundCompletionCallback3 = (CompoundCompletionCallback) this.f$0;
                Object obj4 = this.f$1;
                compoundCompletionCallback3.compoundTask.onComplete();
                ((CompletionCallback) compoundCompletionCallback3.resultingCallback).onComplete(obj4);
                return;
            case 23:
                CompoundCompletionCallback compoundCompletionCallback4 = (CompoundCompletionCallback) this.f$0;
                Exception exc3 = (Exception) this.f$1;
                exc3.getClass();
                compoundCompletionCallback4.compoundTask.onComplete();
                ((CompletionCallback) compoundCompletionCallback4.resultingCallback).onError(exc3);
                return;
            case 24:
                RiderHiringWebViewFragment riderHiringWebViewFragment = (RiderHiringWebViewFragment) this.f$0;
                String str = (String) this.f$1;
                try {
                    LayoutTileBinding layoutTileBinding = riderHiringWebViewFragment.getOnBackPressedDispatcher;
                    layoutTileBinding.getClass();
                    ((WebView) layoutTileBinding.write).evaluateJavascript(str, null);
                    return;
                } catch (Exception e2) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Error invoking script in webview", new Object[0]);
                    return;
                }
            case 25:
                ((VehicleCrashDiagnosticListener) this.f$0).onNewDiagnostic((VehicleCrashDiagnostic) this.f$1);
                return;
            case 26:
                ((VehicleCrashListener) this.f$0).onVehicleCrash((VehicleCrashEvent) this.f$1);
                return;
            case 27:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$1;
                r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4 r8lambdai5nub7sp_oydxv9gxfmziuf3u4 = (r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4) this.f$0;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
                r8lambdai5nub7sp_oydxv9gxfmziuf3u4.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdai5nub7sp_oydxv9gxfmziuf3u4);
                return;
            case 28:
                ((GooglePlayServicesObserver) this.f$0).onRemoveLocationUpdates((Task) this.f$1);
                return;
            default:
                ((PhoneUsageEventListener) this.f$0).onPhoneUsageEventDetected((PhoneUsageEvent) this.f$1);
                return;
        }
    }

    public /* synthetic */ ZM$$ExternalSyntheticLambda0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.f$0 = obj;
    }
}
