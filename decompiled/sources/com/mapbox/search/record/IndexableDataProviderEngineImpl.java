package com.mapbox.search.record;

import com.mapbox.geojson.Point;
import com.mapbox.search.base.AssertionsKt;
import com.mapbox.search.internal.bindgen.ResultType;
import com.mapbox.search.internal.bindgen.UserRecord;
import com.mapbox.search.internal.bindgen.UserRecordsLayer;
import com.mapbox.search.result.SearchAddress;
import com.mapbox.search.result.SearchAddressKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes3.dex */
public final class IndexableDataProviderEngineImpl {
    public final UserRecordsLayer coreLayer;

    public IndexableDataProviderEngineImpl(UserRecordsLayer userRecordsLayer) {
        userRecordsLayer.getClass();
        this.coreLayer = userRecordsLayer;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    public final void upsertAll(Iterable iterable) {
        ResultType resultType;
        iterable.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            IndexableRecord indexableRecord = (IndexableRecord) it.next();
            indexableRecord.getClass();
            HistoryRecord historyRecord = (HistoryRecord) indexableRecord;
            SearchAddress searchAddress = historyRecord.address;
            String str = historyRecord.id;
            String str2 = historyRecord.name;
            Point point = historyRecord.coordinate;
            com.mapbox.search.internal.bindgen.SearchAddress searchAddressMapToCore = searchAddress != null ? SearchAddressKt.mapToCore(searchAddress) : null;
            List list = historyRecord.categories;
            ArrayList arrayListRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new String[]{searchAddress != null ? searchAddress.place : null, searchAddress != null ? searchAddress.street : null, searchAddress != null ? searchAddress.houseNumber : null});
            String str3 = historyRecord.newType;
            str3.getClass();
            switch (str3) {
                case "address":
                    resultType = ResultType.ADDRESS;
                    break;
                case "region":
                    resultType = ResultType.REGION;
                    break;
                case "street":
                    resultType = ResultType.STREET;
                    break;
                case "unknown":
                    resultType = ResultType.UNKNOWN;
                    break;
                case "poi":
                    resultType = ResultType.POI;
                    break;
                case "block":
                    resultType = ResultType.BLOCK;
                    break;
                case "place":
                    resultType = ResultType.PLACE;
                    break;
                case "district":
                    resultType = ResultType.DISTRICT;
                    break;
                case "neighborhood":
                    resultType = ResultType.NEIGHBORHOOD;
                    break;
                case "postcode":
                    resultType = ResultType.POSTCODE;
                    break;
                case "country":
                    resultType = ResultType.COUNTRY;
                    break;
                case "locality":
                    resultType = ResultType.LOCALITY;
                    break;
                default:
                    AssertionsKt.failDebug$default(new RecordsFileStorage$fullFileName$2(str3, 2));
                    resultType = ResultType.UNKNOWN;
                    break;
            }
            arrayList.add(new UserRecord(str, str2, point, searchAddressMapToCore, list, arrayListRemoteActionCompatParcelizer, resultType));
        }
        this.coreLayer.upsertMulti(arrayList);
    }
}
