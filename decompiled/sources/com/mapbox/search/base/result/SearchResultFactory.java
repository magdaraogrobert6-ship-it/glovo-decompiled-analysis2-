package com.mapbox.search.base.result;

import com.airbnb.lottie.parser.DropShadowEffect;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$DataProviderContext;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$resolve$2;
import com.mapbox.search.SearchEngineImpl$search$3;
import com.mapbox.search.base.AssertionsKt;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$7$task$1;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.internal.bindgen.ResultType;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.sentiance.core.model.events.H$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import o.accessgetInstancedelegatecp;
import o.accessprocessDragStart;
import o.isItemDismissable;
import o.onContentCardClicked;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchResultFactory {
    public static final ResultType[] NOT_SEARCH_RESULT_TYPES = {ResultType.USER_RECORD, ResultType.CATEGORY, ResultType.BRAND, ResultType.QUERY, ResultType.UNKNOWN};
    public final H$b recordResolver;

    public static BaseServerSearchResultImpl createSearchResult(final BaseRawSearchResult baseRawSearchResult, final BaseRequestOptions baseRequestOptions) {
        List list = baseRawSearchResult.types;
        if (baseRawSearchResult.action != null || baseRawSearchResult.center == null) {
            final int i = 0;
            AssertionsKt.failDebug$default(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.base.result.SearchResultFactory.createSearchResult.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    BaseRequestOptions baseRequestOptions2 = baseRequestOptions;
                    BaseRawSearchResult baseRawSearchResult2 = baseRawSearchResult;
                    if (i2 == 0) {
                        return "Can't create a search result: missing 'action' for non-null 'center'. ".concat(n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4));
                    }
                    if (i2 != 1) {
                        return "Illegal raw types: " + baseRawSearchResult2.types + ". " + n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4);
                    }
                    return "Can't create SearchResult of " + baseRawSearchResult2.type + " result type. " + n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4);
                }
            });
            return null;
        }
        if (BaseSearchResultTypeKt.isValidMultiType(list)) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ResultType resultType = (ResultType) it.next();
                        resultType.getClass();
                        if (BaseSearchResultTypeKt.tryMapToSearchResultType(resultType) != null) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                BaseSearchResultType baseSearchResultTypeTryMapToSearchResultType = BaseSearchResultTypeKt.tryMapToSearchResultType((ResultType) it2.next());
                baseSearchResultTypeTryMapToSearchResultType.getClass();
                arrayList.add(baseSearchResultTypeTryMapToSearchResultType);
            }
            return new BaseServerSearchResultImpl(arrayList, baseRawSearchResult, baseRequestOptions);
        }
        if (onContentCardClicked.IconCompatParcelizer(NOT_SEARCH_RESULT_TYPES, baseRawSearchResult.type)) {
            final int i2 = 1;
            AssertionsKt.failDebug$default(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.base.result.SearchResultFactory.createSearchResult.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i2;
                    BaseRequestOptions baseRequestOptions2 = baseRequestOptions;
                    BaseRawSearchResult baseRawSearchResult2 = baseRawSearchResult;
                    if (i3 == 0) {
                        return "Can't create a search result: missing 'action' for non-null 'center'. ".concat(n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4));
                    }
                    if (i3 != 1) {
                        return "Illegal raw types: " + baseRawSearchResult2.types + ". " + n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4);
                    }
                    return "Can't create SearchResult of " + baseRawSearchResult2.type + " result type. " + n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4);
                }
            });
            return null;
        }
        final int i3 = 2;
        AssertionsKt.failDebug$default(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.base.result.SearchResultFactory.createSearchResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                BaseRequestOptions baseRequestOptions2 = baseRequestOptions;
                BaseRawSearchResult baseRawSearchResult2 = baseRawSearchResult;
                if (i4 == 0) {
                    return "Can't create a search result: missing 'action' for non-null 'center'. ".concat(n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4));
                }
                if (i4 != 1) {
                    return "Illegal raw types: " + baseRawSearchResult2.types + ". " + n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4);
                }
                return "Can't create SearchResult of " + baseRawSearchResult2.type + " result type. " + n0.prepareSearchResultInfo$default(baseRawSearchResult2, baseRequestOptions2, 4);
            }
        });
        return null;
    }

    public SearchResultFactory(H$b h$b) {
        this.recordResolver = h$b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    public static boolean isResolvedSearchResult(BaseRawSearchResult baseRawSearchResult) {
        List list = baseRawSearchResult.types;
        if (BaseSearchResultTypeKt.isValidMultiType(list)) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ResultType resultType = (ResultType) it.next();
                        resultType.getClass();
                        if (BaseSearchResultTypeKt.tryMapToSearchResultType(resultType) == null) {
                            if (!onContentCardClicked.IconCompatParcelizer(NOT_SEARCH_RESULT_TYPES, baseRawSearchResult.type)) {
                                AssertionsKt.failDebug$default(new BaseRawSearchResult.AnonymousClass1(baseRawSearchResult, 3));
                                return false;
                            }
                        }
                    }
                }
            }
            if (baseRawSearchResult.action == null && baseRawSearchResult.center != null) {
                return true;
            }
        } else if (!onContentCardClicked.IconCompatParcelizer(NOT_SEARCH_RESULT_TYPES, baseRawSearchResult.type)) {
            AssertionsKt.failDebug$default(new BaseRawSearchResult.AnonymousClass1(baseRawSearchResult, 3));
            return false;
        }
        return false;
    }

    public final AsyncOperationTaskImpl resolveIndexableRecordSearchResultAsync(BaseRawSearchResult baseRawSearchResult, Executor executor, BaseRequestOptions baseRequestOptions, OneStepRequestCallbackWrapper$run$1$7$task$1 oneStepRequestCallbackWrapper$run$1$7$task$1) {
        SearchEngineImpl$search$3 searchEngineImpl$search$3 = new SearchEngineImpl$search$3(oneStepRequestCallbackWrapper$run$1$7$task$1, baseRawSearchResult, baseRequestOptions, 5);
        String str = baseRawSearchResult.layerId;
        if (str == null) {
            isItemDismissable isitemdismissable = new isItemDismissable(new Exception("Can't find user records layer with id " + baseRawSearchResult.layerId + ". RawSearchResult: " + baseRawSearchResult));
            accessprocessDragStart accessprocessdragstart = oneStepRequestCallbackWrapper$run$1$7$task$1.$results;
            int i = oneStepRequestCallbackWrapper$run$1$7$task$1.$index;
            List list = oneStepRequestCallbackWrapper$run$1$7$task$1.$responseResult;
            DropShadowEffect dropShadowEffect = oneStepRequestCallbackWrapper$run$1$7$task$1.this$0;
            BaseResponseInfo baseResponseInfo = oneStepRequestCallbackWrapper$run$1$7$task$1.$responseInfo;
            accessprocessdragstart.serializer(i, new onItemDismiss(isitemdismissable));
            DropShadowEffect.run$lambda$4$notifyCallbackIfNeeded(accessprocessdragstart, list, dropShadowEffect, baseResponseInfo);
            return AsyncOperationTaskImpl.COMPLETED;
        }
        String str2 = baseRawSearchResult.userRecordId;
        if (str2 == null) {
            str2 = baseRawSearchResult.id;
        }
        H$b h$b = this.recordResolver;
        synchronized (h$b) {
            str2.getClass();
            x xVar = (x) h$b.write;
            xVar.getClass();
            IndexableDataProvidersRegistryImpl$DataProviderContext indexableDataProvidersRegistryImpl$DataProviderContext = (IndexableDataProvidersRegistryImpl$DataProviderContext) ((LinkedHashMap) xVar.IconCompatParcelizer).get(str);
            LocalDataProviderImpl localDataProviderImpl = indexableDataProvidersRegistryImpl$DataProviderContext != null ? indexableDataProvidersRegistryImpl$DataProviderContext.provider : null;
            if (localDataProviderImpl == null) {
                executor.execute(new ZM$$ExternalSyntheticLambda0(searchEngineImpl$search$3, 9, localDataProviderImpl));
                return AsyncOperationTaskImpl.COMPLETED;
            }
            return localDataProviderImpl.get(str2, executor, new IndexableDataProvidersRegistryImpl$resolve$2(str2, str, searchEngineImpl$search$3, 0));
        }
    }
}
