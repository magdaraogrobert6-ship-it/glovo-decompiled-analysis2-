package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "OnDemandLogRequestFulfillmentNotifier")
public class getBitmapUrl {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final requestSingleUpdateFromLocationManager read;

    public static class read {
        public final boolean IconCompatParcelizer;
        public final String serializer;
        public final boolean write;

        public read(String str, boolean z, boolean z2) {
            this.serializer = str;
            this.IconCompatParcelizer = z;
            this.write = z2;
        }
    }

    public final void read(String str, boolean z, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0) {
        r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(new r8lambdaBwHsy7Qo6OwJ1PFjcbN2fatjzM(str));
        if (r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer != null) {
            r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer.serializer(new getPerson(this, clearandroid_sdk_base_releaseVar, str, d0__externalsyntheticlambda0, z));
            return;
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to create call to notify the remote of the fulfillment of request ", str), new Object[0]);
        clearandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new f$$ExternalSyntheticLambda1(d0__externalsyntheticlambda0, str, z, 5));
    }

    public getBitmapUrl(parseLonglambda0 parselonglambda0, requestSingleUpdateFromLocationManager requestsingleupdatefromlocationmanager) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = requestsingleupdatefromlocationmanager;
    }
}
