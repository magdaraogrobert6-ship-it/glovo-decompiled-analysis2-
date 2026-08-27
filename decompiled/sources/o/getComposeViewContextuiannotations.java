package o;

import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient_Factory;
import io.grpc.stub.ClientCalls;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getComposeViewContextuiannotations implements forceAccessibilityForTesting {
    public final getTextInputServiceannotations read;
    public final /* synthetic */ int serializer = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public getComposeViewContextuiannotations(getTextInputServiceannotations gettextinputserviceannotations, ProtoMarshallerClient_Factory protoMarshallerClient_Factory) {
        this.read = gettextinputserviceannotations;
        this.write = protoMarshallerClient_Factory;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        getTextInputServiceannotations gettextinputserviceannotations = this.read;
        if (i == 0) {
            return new RateLimiterClient((r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM) gettextinputserviceannotations.write(), (disposeComposition) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write());
        }
        parseJsonObjectIntoBundlelambda0 jsonUtilsb = (parseJsonObjectIntoBundlelambda0) ((resolveComposeViewContext) gettextinputserviceannotations).write();
        Iterator it = Arrays.asList(new setCustomUserAttributeArray((r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) ((InstanceFactory) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write())).iterator();
        while (it.hasNext()) {
            jsonUtilsb = new JsonUtilsb(jsonUtilsb, (setCustomUserAttributeArray) it.next());
        }
        return new accessgetToRunOnFramep(jsonUtilsb, mergeJsonObjectslambda10.RemoteActionCompatParcelizer.IconCompatParcelizer(ClientCalls.RemoteActionCompatParcelizer, setCustomUserAttributeJSON.BLOCKING));
    }

    public getComposeViewContextuiannotations(SharedPreferencesUtils sharedPreferencesUtils, resolveComposeViewContext resolvecomposeviewcontext, InstanceFactory instanceFactory) {
        this.read = resolvecomposeviewcontext;
        this.write = instanceFactory;
    }
}
