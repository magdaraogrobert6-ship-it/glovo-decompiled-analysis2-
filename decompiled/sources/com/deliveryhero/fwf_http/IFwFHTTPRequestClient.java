package com.deliveryhero.fwf_http;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import java.util.Map;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public interface IFwFHTTPRequestClient {
    Object httpJsonFwFRequest(String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<String>> shortNewsContentCardView);

    Object httpProtoFwFRequest(String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object httpJsonFwFRequest$default(IFwFHTTPRequestClient iFwFHTTPRequestClient, String str, String str2, Map map, String str3, long j, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
            if (obj == null) {
                return iFwFHTTPRequestClient.httpJsonFwFRequest(str, str2, map, (i & 8) != 0 ? null : str3, j, shortNewsContentCardView);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: httpJsonFwFRequest");
            return null;
        }

        public static /* synthetic */ Object httpProtoFwFRequest$default(IFwFHTTPRequestClient iFwFHTTPRequestClient, String str, String str2, Map map, String str3, long j, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
            if (obj == null) {
                return iFwFHTTPRequestClient.httpProtoFwFRequest(str, str2, map, (i & 8) != 0 ? null : str3, j, shortNewsContentCardView);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: httpProtoFwFRequest");
            return null;
        }
    }
}
