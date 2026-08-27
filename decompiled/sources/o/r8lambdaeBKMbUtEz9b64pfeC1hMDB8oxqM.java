package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM extends SocketAddress {
    public static final /* synthetic */ int write = 0;
    public final InetSocketAddress IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final SocketAddress read;
    public final String serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer});
    }

    public r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        TextStreamsKt.serializer(socketAddress, "proxyAddress");
        TextStreamsKt.serializer(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            TextStreamsKt.IconCompatParcelizer("The proxy address %s is not resolved", socketAddress, !((InetSocketAddress) socketAddress).isUnresolved());
        }
        this.read = socketAddress;
        this.IconCompatParcelizer = inetSocketAddress;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM)) {
            return false;
        }
        r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM r8lambdaebkmbutez9b64pfec1hmdb8oxqm = (r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.read, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.read) && TuplesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.IconCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.RemoteActionCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.serializer, r8lambdaebkmbutez9b64pfec1hmdb8oxqm.serializer);
    }

    public final String toString() {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "proxyAddr");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "targetAddr");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) this.RemoteActionCompatParcelizer, "username");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("hasPassword", this.serializer != null);
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
