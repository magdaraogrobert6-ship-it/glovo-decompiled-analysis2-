package o;

import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeWebViewActivitycreateWebViewClient1 extends wouldPushPermissionPromptDisplaylambda3 {
    public static final boolean read;

    static {
        read = !visitSubtreeIfYYKmho.write(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda3
    public final String read() {
        return "pick_first";
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda3
    public final getDeclaredMethodQuietlylambda1 read(Map map) {
        try {
            return new getDeclaredMethodQuietlylambda1(new r8lambdaDnYlDXUzZcCbTaVMZY1CnIw2AZM(getLocalHtmlUrlFromRemoteUrllambda5.read("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new getDeclaredMethodQuietlylambda1(Status.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(e).IconCompatParcelizer("Failed parsing configuration for pick_first"));
        }
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda3
    public final hasPermissionlambda0 RemoteActionCompatParcelizer(LoadBalancer$Helper loadBalancer$Helper) {
        return read ? new setBrazeDeeplinkHandler(loadBalancer$Helper) : new BrazeWebViewActivitycreateWebChromeClient1(loadBalancer$Helper);
    }
}
