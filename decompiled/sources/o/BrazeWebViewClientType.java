package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeWebViewClientType {
    public final wouldPushPermissionPromptDisplaylambda3 RemoteActionCompatParcelizer;
    public final Object write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.write});
    }

    public BrazeWebViewClientType(wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3, Object obj) {
        this.RemoteActionCompatParcelizer = wouldpushpermissionpromptdisplaylambda3;
        this.write = obj;
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "provider");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "config");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BrazeWebViewClientType.class != obj.getClass()) {
            return false;
        }
        BrazeWebViewClientType brazeWebViewClientType = (BrazeWebViewClientType) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, brazeWebViewClientType.RemoteActionCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.write, brazeWebViewClientType.write);
    }
}
