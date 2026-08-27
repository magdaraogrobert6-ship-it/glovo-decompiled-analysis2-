package o;

import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
public interface z7 {
    @getEvalNonAuth(IconCompatParcelizer = "/api/rider-experience/v1/couriers/{user_id}/order-history")
    Object serializer(@decodeProtoAndCache(IconCompatParcelizer = "user_id") long j, @getFeatureKey(RemoteActionCompatParcelizer = HttpHeaders.DATE) String str, ShortNewsContentCardView<? super z8> shortNewsContentCardView);
}
