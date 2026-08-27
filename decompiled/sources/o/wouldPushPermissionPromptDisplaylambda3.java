package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.LoadBalancer$Helper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wouldPushPermissionPromptDisplaylambda3 {
    public abstract hasPermissionlambda0 RemoteActionCompatParcelizer(LoadBalancer$Helper loadBalancer$Helper);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String read();

    public abstract getDeclaredMethodQuietlylambda1 read(Map map);

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) read(), "policy");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer(RemoteMessageConst.Notification.PRIORITY, String.valueOf(5));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("available", true);
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
