package com.mapbox.search;

import android.view.ViewGroup;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.base.result.SearchResultFactory;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.common.CompletionCallback;
import com.mapbox.search.internal.bindgen.SearchEngine;
import com.mapbox.search.internal.bindgen.UserActivityReporter;
import com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl;
import com.mapbox.search.record.HistoryDataProviderImpl;
import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.sentiance.core.model.events.H$b;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;
import o.copyMDFrstsdefault;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.div7Ah8Wj8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.scaledRadiiRect;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchEngineImpl {
    public static final ExecutorService DEFAULT_EXECUTOR;
    public final UserActivityReporter activityReporter;
    public final ApiType apiType;
    public final SearchEngine coreEngine;
    public final ExecutorService engineExecutorService;
    public final H$b indexableDataProvidersRegistry;
    public final Vw$Vw requestContextProvider;
    public final SearchResultFactory searchResultFactory;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new SearchEngineImpl$$ExternalSyntheticLambda0(0));
        executorServiceNewSingleThreadExecutor.getClass();
        DEFAULT_EXECUTOR = executorServiceNewSingleThreadExecutor;
    }

    public SearchEngineImpl(ApiType apiType, SearchEngineSettings searchEngineSettings, AnalyticsServiceImpl analyticsServiceImpl, SearchEngine searchEngine, UserActivityReporter userActivityReporter, HistoryDataProviderImpl historyDataProviderImpl, Vw$Vw vw$Vw, SearchResultFactory searchResultFactory, H$b h$b) {
        historyDataProviderImpl.getClass();
        vw$Vw.getClass();
        searchResultFactory.getClass();
        ExecutorService executorService = DEFAULT_EXECUTOR;
        executorService.getClass();
        this.apiType = apiType;
        this.coreEngine = searchEngine;
        this.activityReporter = userActivityReporter;
        this.requestContextProvider = vw$Vw;
        this.searchResultFactory = searchResultFactory;
        this.engineExecutorService = executorService;
        this.indexableDataProvidersRegistry = h$b;
        BaseMapboxInitializer.Companion.init(MapboxSearchSdkInitializerImpl.class);
    }

    public final AsyncOperationTaskImpl registerDataProvider(final LocalDataProviderImpl localDataProviderImpl, final Executor executor, final CompoundCompletionCallback compoundCompletionCallback) {
        localDataProviderImpl.getClass();
        final H$b h$b = this.indexableDataProvidersRegistry;
        final SearchEngine searchEngine = this.coreEngine;
        synchronized (h$b) {
            x xVar = (x) h$b.write;
            xVar.getClass();
            Set set = (Set) ((LinkedHashMap) xVar.read).get(searchEngine);
            if (set != null && set.contains(localDataProviderImpl.dataProviderName)) {
                executor.execute(new ZM$$ExternalSyntheticLambda0(compoundCompletionCallback, 10, localDataProviderImpl));
                return AsyncOperationTaskImpl.COMPLETED;
            }
            x xVar2 = (x) h$b.write;
            String str = localDataProviderImpl.dataProviderName;
            xVar2.getClass();
            str.getClass();
            IndexableDataProvidersRegistryImpl$DataProviderContext indexableDataProvidersRegistryImpl$DataProviderContext = (IndexableDataProvidersRegistryImpl$DataProviderContext) ((LinkedHashMap) xVar2.IconCompatParcelizer).get(str);
            if (indexableDataProvidersRegistryImpl$DataProviderContext == null) {
                final AsyncOperationTaskImpl asyncOperationTaskImpl = new AsyncOperationTaskImpl();
                asyncOperationTaskImpl.plusAssign(((DataProviderEngineRegistrationServiceImpl) h$b.serializer).register(localDataProviderImpl, new CompletionCallback() { // from class: com.mapbox.search.IndexableDataProvidersRegistryImpl$register$3
                    @Override // com.mapbox.search.common.CompletionCallback
                    public final void onComplete(Object obj) {
                        final IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) obj;
                        indexableDataProviderEngineImpl.getClass();
                        final SearchEngine searchEngine2 = searchEngine;
                        final CompoundCompletionCallback compoundCompletionCallback2 = compoundCompletionCallback;
                        final H$b h$b2 = h$b;
                        final Executor executor2 = executor;
                        final LocalDataProviderImpl localDataProviderImpl2 = localDataProviderImpl;
                        final AsyncOperationTaskImpl asyncOperationTaskImpl2 = asyncOperationTaskImpl;
                        asyncOperationTaskImpl2.runIfNotCancelled(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.search.IndexableDataProvidersRegistryImpl$register$3$onComplete$1

                            /* JADX INFO: renamed from: com.mapbox.search.IndexableDataProvidersRegistryImpl$register$3$onComplete$1$1, reason: invalid class name */
                            public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
                                public final /* synthetic */ Object $dataProvider;
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ Object $result;
                                public final /* synthetic */ Object $searchEngine;
                                public final /* synthetic */ Object this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
                                    super(0);
                                    this.$r8$classId = i;
                                    this.this$0 = obj;
                                    this.$dataProvider = obj2;
                                    this.$result = obj3;
                                    this.$searchEngine = obj4;
                                }

                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                public final Object invoke() {
                                    int i = this.$r8$classId;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    Object obj = this.$searchEngine;
                                    Object obj2 = this.$result;
                                    Object obj3 = this.$dataProvider;
                                    Object obj4 = this.this$0;
                                    if (i == 0) {
                                        x xVar = (x) ((H$b) obj4).write;
                                        LocalDataProviderImpl localDataProviderImpl = (LocalDataProviderImpl) obj3;
                                        IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) obj2;
                                        xVar.registerDataProviderContext(localDataProviderImpl, new IndexableDataProvidersRegistryImpl$DataProviderContext(indexableDataProviderEngineImpl, localDataProviderImpl));
                                        SearchEngine searchEngine = (SearchEngine) obj;
                                        xVar.register(localDataProviderImpl, searchEngine);
                                        searchEngine.addUserLayer(indexableDataProviderEngineImpl.coreLayer);
                                        return createfromparcel;
                                    }
                                    if (i != 1) {
                                        ((RouteLineValueCommandHolder) obj4).applier.applyCommand((Style) obj3, (String) obj2, (StylePropertyValue) obj);
                                        return createfromparcel;
                                    }
                                    div7Ah8Wj8.RemoteActionCompatParcelizer(2);
                                    scaledRadiiRect scaledradiirect = (scaledRadiiRect) obj4;
                                    ViewGroup viewGroup = (ViewGroup) obj3;
                                    Object objSerializer = scaledradiirect.MediaSessionCompatToken.serializer(viewGroup, obj2);
                                    scaledradiirect.read = objSerializer;
                                    if (objSerializer == null) {
                                        div7Ah8Wj8.RemoteActionCompatParcelizer(2);
                                        scaledradiirect.MediaBrowserCompatMediaItem = true;
                                    } else {
                                        ((createInAppMessageEventSubscriber) obj).IconCompatParcelizer = new copyMDFrstsdefault(scaledradiirect, obj2, viewGroup);
                                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                            Objects.toString(scaledradiirect.RemoteActionCompatParcelizer);
                                            Objects.toString(scaledradiirect.MediaDescriptionCompat);
                                        }
                                    }
                                    return createfromparcel;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj2) {
                                ((AsyncOperationTaskImpl) obj2).getClass();
                                H$b h$b3 = h$b2;
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(h$b3, localDataProviderImpl2, indexableDataProviderEngineImpl, searchEngine2, 0);
                                synchronized (h$b3) {
                                    anonymousClass1.invoke();
                                }
                                executor2.execute(new ZM$$ExternalSyntheticLambda0(asyncOperationTaskImpl2, 12, compoundCompletionCallback2));
                                return createFromParcel.INSTANCE;
                            }
                        });
                    }

                    @Override // com.mapbox.search.common.CompletionCallback
                    public final void onError(Exception exc) {
                        exc.getClass();
                        executor.execute(new j$$ExternalSyntheticLambda1(asyncOperationTaskImpl, compoundCompletionCallback, exc, 2));
                    }
                }));
                return asyncOperationTaskImpl;
            }
            ((x) h$b.write).register(localDataProviderImpl, searchEngine);
            searchEngine.addUserLayer(indexableDataProvidersRegistryImpl$DataProviderContext.engine.coreLayer);
            executor.execute(new ZM$$ExternalSyntheticLambda2(12, compoundCompletionCallback));
            return AsyncOperationTaskImpl.COMPLETED;
        }
    }
}
