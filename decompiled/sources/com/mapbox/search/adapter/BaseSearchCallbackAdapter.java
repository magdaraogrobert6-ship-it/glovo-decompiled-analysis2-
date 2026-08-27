package com.mapbox.search.adapter;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.RequestOptionsKt;
import com.mapbox.search.ResponseInfo;
import com.mapbox.search.base.BaseResponseInfo;
import com.mapbox.search.base.result.BaseSearchResult;
import com.mapbox.search.result.SearchResult;
import com.sentiance.core.model.events.C$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.ef;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSearchCallbackAdapter {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final C$b callback;

    public BaseSearchCallbackAdapter(C$b c$b) {
        this.callback = c$b;
    }

    public final void onError(Exception exc) {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        C$b c$b = this.callback;
        ((r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI) c$b.serializer).invoke(ef.MAPBOX, Boolean.FALSE);
        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) c$b.IconCompatParcelizer).invoke(exc);
        int i4 = read + 51;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onResults(List list, BaseResponseInfo baseResponseInfo) {
        String str;
        String str2;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i = 2 % 2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new SearchResult((BaseSearchResult) it.next()));
        }
        new ResponseInfo(RequestOptionsKt.mapToPlatform(baseResponseInfo.requestOptions), baseResponseInfo.coreSearchResponse, baseResponseInfo.isReproducible);
        SearchResult searchResult = (SearchResult) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
        if ((searchResult != null ? searchResult.fullAddress : null) != null) {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(searchResult.fullAddress, "fullAddress");
            int i2 = IconCompatParcelizer + 29;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
        } else {
            if (searchResult != null) {
                int i4 = read + 63;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                str = searchResult.descriptionText;
            } else {
                str = null;
            }
            if (str != null) {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(searchResult.descriptionText, "descriptionText");
            } else {
                if (searchResult != null) {
                    int i6 = IconCompatParcelizer + 61;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        String str3 = searchResult.name;
                        throw null;
                    }
                    str2 = searchResult.name;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(searchResult.name, "name");
                    int i7 = IconCompatParcelizer + 107;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, "none");
                }
            }
        }
        String str4 = (String) onviewattachedtowindowlambda0.serializer;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Reverse geocoding address source: ", (String) onviewattachedtowindowlambda0.write), new Object[0]);
        C$b c$b = this.callback;
        ((r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI) c$b.serializer).invoke(ef.MAPBOX, Boolean.valueOf(str4 != null));
        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) c$b.write).invoke(str4);
    }
}
