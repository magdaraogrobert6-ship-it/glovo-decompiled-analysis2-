package o;

import android.content.Context;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class RoleCompanion implements NetworkCapability {
    public Context write;

    @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
    public final NetworkResponse get(NetworkRequest networkRequest) {
        new NetworkResponse();
        networkRequest.getUrl();
        networkRequest.getHeaders();
        throw null;
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
    public final void initConfig(int i, int i2) throws UcsException {
        Context context = this.write;
        try {
            NetworkKit.init(context, new accessgetImagecp());
            RestClient.Builder builder = new RestClient.Builder();
            HttpClient.Builder builderCallTimeout = new HttpClient.Builder().connectTimeout(i).callTimeout(i);
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("EncryptUtil");
            if (builder.httpClient(builderCallTimeout.sslSocketFactory(RelativeScroller.serializer(context, accessminIntrinsicHeightjd.RemoteActionCompatParcelizer()), new getScrollAmount(context)).retryTimeOnConnectionFailure(i2).build()).build().create(getDropdownListo7Vup1c.class) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (Exception e) {
            String str = MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("RemoteRestClient init failed, "));
            throw accessgetDropdownListcp.IconCompatParcelizer("RemoteRestClient", str, new Object[0], 2001L, str);
        }
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
    public final NetworkResponse post(NetworkRequest networkRequest) {
        new NetworkResponse();
        networkRequest.getUrl();
        networkRequest.getHeaders();
        networkRequest.getBody();
        throw null;
    }
}
