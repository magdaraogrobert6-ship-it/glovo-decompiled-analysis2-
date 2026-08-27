package com.mapbox.search;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.AssertionsKt;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.engine.OneStepRequestCallbackWrapper$run$1$7$task$1;
import com.mapbox.search.base.logger.LogKt;
import com.mapbox.search.base.record.BaseIndexableRecord;
import com.mapbox.search.base.result.BaseIndexableRecordSearchResultImpl;
import com.mapbox.search.base.result.BaseRawSearchResult;
import com.mapbox.search.base.result.BaseSearchResultType;
import com.mapbox.search.common.CompletionCallback;
import com.mapbox.search.common.RoutablePoint;
import com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl;
import com.mapbox.search.record.HistoryRecord;
import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.IndexableRecord;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.mapbox.search.record.RecordsFileStorage$fullFileName$2;
import com.mapbox.search.result.SearchAddress;
import com.mapbox.search.result.SearchAddressKt;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.accessprocessDragStart;
import o.createFromParcel;
import o.isItemDismissable;
import o.onContentCardClicked;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class IndexableDataProvidersRegistryImpl$resolve$2 implements CompletionCallback {
    public final /* synthetic */ Object $callback;
    public final /* synthetic */ Object $dataProviderName;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $userRecordId;

    public /* synthetic */ IndexableDataProvidersRegistryImpl$resolve$2(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.$userRecordId = obj;
        this.$dataProviderName = obj2;
        this.$callback = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:83:0x016a  */
    @Override // com.mapbox.search.common.CompletionCallback
    public final void onComplete(Object obj) {
        ArrayList arrayList;
        BaseSearchResultType baseSearchResultType;
        Object baseIndexableRecord;
        if (this.$r8$classId != 0) {
            ((createFromParcel) obj).getClass();
            DataProviderEngineRegistrationServiceImpl dataProviderEngineRegistrationServiceImpl = (DataProviderEngineRegistrationServiceImpl) this.$userRecordId;
            String str = ((LocalDataProviderImpl) this.$dataProviderName).dataProviderName;
            IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) this.$callback;
            synchronized (dataProviderEngineRegistrationServiceImpl) {
                dataProviderEngineRegistrationServiceImpl.processedProvider.put(str, indexableDataProviderEngineImpl);
                DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata registrationProcessMetadata = (DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata) dataProviderEngineRegistrationServiceImpl.processingProviders.remove(str);
                if (registrationProcessMetadata != null) {
                    dataProviderEngineRegistrationServiceImpl.registryExecutor.execute(new ZM$$ExternalSyntheticLambda0(registrationProcessMetadata, 16, indexableDataProviderEngineImpl));
                    return;
                } else {
                    new IllegalStateException("No callbacks registered", null);
                    LogKt.logw$default("No callbacks registered");
                    return;
                }
            }
        }
        IndexableRecord indexableRecord = (IndexableRecord) obj;
        if (indexableRecord == null) {
            StringBuilder sb = new StringBuilder("No record with id `");
            sb.append((String) this.$userRecordId);
            sb.append("` in `");
            baseIndexableRecord = new isItemDismissable(new Exception(ff$$ExternalSyntheticOutline0.m(sb, (String) this.$dataProviderName, "` data provider")));
        } else {
            HistoryRecord historyRecord = (HistoryRecord) indexableRecord;
            SearchAddress searchAddress = historyRecord.address;
            String str2 = historyRecord.id;
            String str3 = historyRecord.name;
            String str4 = historyRecord.descriptionText;
            com.mapbox.search.internal.bindgen.SearchAddress searchAddressMapToCore = searchAddress != null ? SearchAddressKt.mapToCore(searchAddress) : null;
            List list = historyRecord.routablePoints;
            if (list != null) {
                List<RoutablePoint> list2 = list;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (RoutablePoint routablePoint : list2) {
                    routablePoint.getClass();
                    arrayList2.add(new com.mapbox.search.internal.bindgen.RoutablePoint(routablePoint.point, routablePoint.name));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            List list3 = historyRecord.categories;
            String str5 = historyRecord.makiIcon;
            Point point = historyRecord.coordinate;
            String str6 = historyRecord.newType;
            str6.getClass();
            switch (str6) {
                case "address":
                    baseSearchResultType = BaseSearchResultType.ADDRESS;
                    break;
                case "region":
                    baseSearchResultType = BaseSearchResultType.REGION;
                    break;
                case "street":
                    baseSearchResultType = BaseSearchResultType.STREET;
                    break;
                case "unknown":
                    baseSearchResultType = BaseSearchResultType.UNKNOWN;
                    break;
                case "poi":
                    baseSearchResultType = BaseSearchResultType.POI;
                    break;
                case "block":
                    baseSearchResultType = BaseSearchResultType.BLOCK;
                    break;
                case "place":
                    baseSearchResultType = BaseSearchResultType.PLACE;
                    break;
                case "district":
                    baseSearchResultType = BaseSearchResultType.DISTRICT;
                    break;
                case "neighborhood":
                    baseSearchResultType = BaseSearchResultType.NEIGHBORHOOD;
                    break;
                case "postcode":
                    baseSearchResultType = BaseSearchResultType.POSTCODE;
                    break;
                case "country":
                    baseSearchResultType = BaseSearchResultType.COUNTRY;
                    break;
                case "locality":
                    baseSearchResultType = BaseSearchResultType.LOCALITY;
                    break;
                default:
                    AssertionsKt.failDebug$default(new RecordsFileStorage$fullFileName$2(str6, 1));
                    baseSearchResultType = BaseSearchResultType.UNKNOWN;
                    break;
            }
            SearchResultMetadata searchResultMetadata = historyRecord.metadata;
            baseIndexableRecord = new BaseIndexableRecord(str2, str3, str4, searchAddressMapToCore, arrayList, list3, str5, point, baseSearchResultType, searchResultMetadata != null ? searchResultMetadata.coreMetadata : null, onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new String[]{searchAddress != null ? searchAddress.place : null, searchAddress != null ? searchAddress.street : null, searchAddress != null ? searchAddress.houseNumber : null}), indexableRecord);
        }
        SearchEngineImpl$search$3 searchEngineImpl$search$3 = (SearchEngineImpl$search$3) this.$callback;
        OneStepRequestCallbackWrapper$run$1$7$task$1 oneStepRequestCallbackWrapper$run$1$7$task$1 = (OneStepRequestCallbackWrapper$run$1$7$task$1) searchEngineImpl$search$3.this$0;
        BaseRawSearchResult baseRawSearchResult = (BaseRawSearchResult) searchEngineImpl$search$3.$options;
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) searchEngineImpl$search$3.$executor;
        if (!(baseIndexableRecord instanceof isItemDismissable)) {
            baseIndexableRecord = new BaseIndexableRecordSearchResultImpl((BaseIndexableRecord) baseIndexableRecord, baseRawSearchResult, baseRequestOptions);
        }
        accessprocessDragStart accessprocessdragstart = oneStepRequestCallbackWrapper$run$1$7$task$1.$results;
        int i = oneStepRequestCallbackWrapper$run$1$7$task$1.$index;
        List list4 = oneStepRequestCallbackWrapper$run$1$7$task$1.$responseResult;
        DropShadowEffect dropShadowEffect = oneStepRequestCallbackWrapper$run$1$7$task$1.this$0;
        BaseResponseInfo baseResponseInfo = oneStepRequestCallbackWrapper$run$1$7$task$1.$responseInfo;
        accessprocessdragstart.serializer(i, new onItemDismiss(baseIndexableRecord));
        DropShadowEffect.run$lambda$4$notifyCallbackIfNeeded(accessprocessdragstart, list4, dropShadowEffect, baseResponseInfo);
    }

    @Override // com.mapbox.search.common.CompletionCallback
    public final void onError(Exception exc) {
        int i = this.$r8$classId;
        exc.getClass();
        if (i == 0) {
            ((OneStepRequestCallbackWrapper$run$1$7$task$1) ((SearchEngineImpl$search$3) this.$callback).this$0).invoke(new onItemDismiss(new isItemDismissable(exc)));
            return;
        }
        DataProviderEngineRegistrationServiceImpl dataProviderEngineRegistrationServiceImpl = (DataProviderEngineRegistrationServiceImpl) this.$userRecordId;
        String str = ((LocalDataProviderImpl) this.$dataProviderName).dataProviderName;
        synchronized (dataProviderEngineRegistrationServiceImpl) {
            DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata registrationProcessMetadata = (DataProviderEngineRegistrationServiceImpl.RegistrationProcessMetadata) dataProviderEngineRegistrationServiceImpl.processingProviders.remove(str);
            if (registrationProcessMetadata != null) {
                dataProviderEngineRegistrationServiceImpl.registryExecutor.execute(new ZM$$ExternalSyntheticLambda0(registrationProcessMetadata, 17, exc));
            } else {
                new IllegalStateException("No callbacks registered", null);
                LogKt.logw$default("No callbacks registered");
            }
        }
    }
}
