package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class requestPushPermissionPromptlambda1 {
    public final Object RemoteActionCompatParcelizer;
    public final List read;
    public final getPrettyPrintedStringlambda0 serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.serializer, this.RemoteActionCompatParcelizer});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof requestPushPermissionPromptlambda1)) {
            return false;
        }
        requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1 = (requestPushPermissionPromptlambda1) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.read, requestpushpermissionpromptlambda1.read) && TuplesKt.RemoteActionCompatParcelizer(this.serializer, requestpushpermissionpromptlambda1.serializer) && TuplesKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, requestpushpermissionpromptlambda1.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "addresses");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "attributes");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "loadBalancingPolicyConfig");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public requestPushPermissionPromptlambda1(List list, getPrettyPrintedStringlambda0 getprettyprintedstringlambda0, Object obj) {
        TextStreamsKt.serializer(list, "addresses");
        this.read = Collections.unmodifiableList(new ArrayList(list));
        TextStreamsKt.serializer(getprettyprintedstringlambda0, "attributes");
        this.serializer = getprettyprintedstringlambda0;
        this.RemoteActionCompatParcelizer = obj;
    }
}
