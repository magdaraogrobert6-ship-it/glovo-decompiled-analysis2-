package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeWebViewClientWhenMappings {
    public final String IconCompatParcelizer;
    public final Map read;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.read});
    }

    public BrazeWebViewClientWhenMappings(String str, Map map) {
        TextStreamsKt.serializer(str, "policyName");
        this.IconCompatParcelizer = str;
        TextStreamsKt.serializer(map, "rawConfigValue");
        this.read = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrazeWebViewClientWhenMappings)) {
            return false;
        }
        BrazeWebViewClientWhenMappings brazeWebViewClientWhenMappings = (BrazeWebViewClientWhenMappings) obj;
        return this.IconCompatParcelizer.equals(brazeWebViewClientWhenMappings.IconCompatParcelizer) && this.read.equals(brazeWebViewClientWhenMappings.read);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) this.IconCompatParcelizer, "policyName");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "rawConfigValue");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
