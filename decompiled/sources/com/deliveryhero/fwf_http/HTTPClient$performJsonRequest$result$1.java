package com.deliveryhero.fwf_http;

import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClient$performJsonRequest$result$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ String $body;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $method;
    final /* synthetic */ long $timeout;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ HTTPClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPClient$performJsonRequest$result$1(HTTPClient hTTPClient, String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super HTTPClient$performJsonRequest$result$1> shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = hTTPClient;
        this.$method = str;
        this.$url = str2;
        this.$headers = map;
        this.$body = str3;
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new HTTPClient$performJsonRequest$result$1(this.this$0, this.$method, this.$url, this.$headers, this.$body, this.$timeout, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        IFwFHTTPRequestClient httpRequest$fwf_client_release = this.this$0.getHttpRequest$fwf_client_release();
        String str = this.$method;
        String str2 = this.$url;
        Map<String, String> map = this.$headers;
        String str3 = this.$body;
        long j = this.$timeout;
        this.label = 1;
        Object objHttpJsonFwFRequest = httpRequest$fwf_client_release.httpJsonFwFRequest(str, str2, map, str3, j, this);
        return objHttpJsonFwFRequest == coroutineSingletons ? coroutineSingletons : objHttpJsonFwFRequest;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(ShortNewsContentCardView<? super FwFHTTPResponse<String>> shortNewsContentCardView) {
        return ((HTTPClient$performJsonRequest$result$1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
