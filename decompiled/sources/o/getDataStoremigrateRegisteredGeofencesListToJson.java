package o;

import com.sentiance.sdk.usercontext.api.UserContextApi;
import com.sentiance.sdk.usercontext.api.UserContextUpdateListener;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getDataStoremigrateRegisteredGeofencesListToJson implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ UserContextUpdateListener write;

    public /* synthetic */ getDataStoremigrateRegisteredGeofencesListToJson(UserContextUpdateListener userContextUpdateListener, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = userContextUpdateListener;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        UserContextUpdateListener userContextUpdateListener = this.write;
        if (i == 0) {
            UserContextApi.lambda$removeUserContextUpdateListener$5(userContextUpdateListener);
        } else if (i != 1) {
            UserContextApi.lambda$addUserContextUpdateListener$1(userContextUpdateListener);
        } else {
            UserContextApi.lambda$addProvisionalAwareUserContextUpdateListener$2(userContextUpdateListener);
        }
    }
}
