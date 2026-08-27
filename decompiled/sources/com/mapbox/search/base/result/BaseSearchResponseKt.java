package com.mapbox.search.base.result;

import androidx.camera.core.impl.DeferrableSurfaces;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.internal.bindgen.Error;
import com.mapbox.search.internal.bindgen.SearchResponse;
import com.mapbox.search.internal.bindgen.SearchResult;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSearchResponseKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Error.Type.values().length];
            try {
                iArr[Error.Type.CONNECTION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Error.Type.HTTP_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Error.Type.INTERNAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Error.Type.REQUEST_CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BaseSearchResponse mapToBase(SearchResponse searchResponse) {
        BaseSearchResponse.Result connectionError;
        BaseSearchResponse.Result httpError;
        if (searchResponse.getResults().isValue()) {
            List<SearchResult> value = searchResponse.getResults().getValue();
            if (value == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                return null;
            }
            List<SearchResult> list = value;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (SearchResult searchResult : list) {
                searchResult.getClass();
                arrayList.add(DeferrableSurfaces.mapToBase(searchResult));
            }
            httpError = new BaseSearchResponse.Result.Success(arrayList);
        } else {
            Error error = searchResponse.getResults().getError();
            if (error == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                return null;
            }
            Error error2 = error;
            Error.Type typeInfo = error2.getTypeInfo();
            int i = typeInfo == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeInfo.ordinal()];
            if (i == -1) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return null;
            }
            if (i == 1) {
                String message = error2.getConnectionError().getMessage();
                message.getClass();
                connectionError = new BaseSearchResponse.Result.Error.ConnectionError(message);
            } else if (i == 2) {
                int httpCode = error2.getHttpError().getHttpCode();
                String message2 = error2.getHttpError().getMessage();
                message2.getClass();
                httpError = new BaseSearchResponse.Result.Error.HttpError(httpCode, message2);
            } else if (i == 3) {
                String message3 = error2.getInternalError().getMessage();
                message3.getClass();
                connectionError = new BaseSearchResponse.Result.Error.InternalError(message3);
            } else {
                if (i != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                String reason = error2.getRequestCancelled().getReason();
                reason.getClass();
                connectionError = new BaseSearchResponse.Result.Error.RequestCancelled(reason);
            }
            httpError = connectionError;
        }
        String responseUUID = searchResponse.getResponseUUID();
        responseUUID.getClass();
        return new BaseSearchResponse(httpError, responseUUID);
    }
}
