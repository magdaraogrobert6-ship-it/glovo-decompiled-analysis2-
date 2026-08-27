package o;

import com.sentiance.sdk.usercontext.api.UserContextApi;
import com.sentiance.sdk.usercontext.api.UserContextUpdateListener;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ICardStorageProvider implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ List IconCompatParcelizer;
    public final /* synthetic */ UserContextUpdateListener serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ ICardStorageProvider(List list, UserContextUpdateListener userContextUpdateListener, int i) {
        this.write = i;
        this.IconCompatParcelizer = list;
        this.serializer = userContextUpdateListener;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        if (this.write != 0) {
            UserContextApi.lambda$addUserContextUpdateListener$3(this.IconCompatParcelizer, this.serializer);
        } else {
            UserContextApi.lambda$addProvisionalAwareUserContextUpdateListenerWithCriteria$4(this.IconCompatParcelizer, this.serializer);
        }
    }
}
