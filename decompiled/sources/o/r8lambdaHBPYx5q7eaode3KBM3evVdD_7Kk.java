package o;

import com.sentiance.sdk.UserLinker;
import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.usercreation.UserCreationOptions;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final UserLinkerAsync serializer;

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final UserLinkerAsync write() {
        return this.serializer;
    }

    private r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk(String str, String str2, UserLinkerAsync userLinkerAsync) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = userLinkerAsync;
    }

    public static r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk read(UserCreationOptions userCreationOptions) {
        String appId = userCreationOptions.getAppId();
        String secret = userCreationOptions.getSecret();
        UserLinker userLinker = userCreationOptions.getUserLinker();
        UserLinkerAsync userLinkerAsync = userCreationOptions.getUserLinkerAsync();
        if (appId == null || secret == null) {
            return null;
        }
        if (userLinker == null && userLinkerAsync == null) {
            return null;
        }
        if (userLinkerAsync != null) {
            return new r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk(appId, secret, userLinkerAsync);
        }
        return new r8lambdaHBPYx5q7eaode3KBM3evVdD_7Kk(appId, secret, userLinker == UserLinker.NO_OP ? UserLinkerAsync.NO_OP : new d0$$ExternalSyntheticLambda0(10, userLinker));
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
