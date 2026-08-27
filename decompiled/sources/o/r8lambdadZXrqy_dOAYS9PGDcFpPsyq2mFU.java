package o;

import com.google.protobuf.GeneratedMessageLite;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU extends JsonUtilsa {
    public abstract JsonUtilsa RemoteActionCompatParcelizer();

    @Override // o.JsonUtilsa
    public void read() {
        RemoteActionCompatParcelizer().read();
    }

    @Override // o.JsonUtilsa
    public final void read(GeneratedMessageLite generatedMessageLite) {
        RemoteActionCompatParcelizer().read(generatedMessageLite);
    }

    @Override // o.JsonUtilsa
    public void read(String str, Throwable th) {
        RemoteActionCompatParcelizer().read(str, th);
    }

    @Override // o.JsonUtilsa
    public void read(MathKt mathKt, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        RemoteActionCompatParcelizer().read(mathKt, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
    }

    @Override // o.JsonUtilsa
    public final void serializer(int i) {
        RemoteActionCompatParcelizer().serializer(i);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(RemoteActionCompatParcelizer(), "delegate");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
