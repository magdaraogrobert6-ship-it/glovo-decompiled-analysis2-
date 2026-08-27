package com.deliveryhero.fwf_http;

import com.deliveryhero.fwf_customer_profile.CustomerProfileConfig;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import java.util.Map;
import java.util.Set;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public interface IHTTPClient extends IPerseusHTTPClient {
    Object getCustomerProfile(String str, Set<String> set, CustomerProfileConfig customerProfileConfig, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView);

    Object getFeatures(Map<String, Long> map, Map<String, Long> map2, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView);

    Object getFeaturesInitialData(Map<String, Long> map, boolean z, ShortNewsContentCardView<? super byte[]> shortNewsContentCardView);
}
