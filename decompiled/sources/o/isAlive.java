package o;

import android.app.Application;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient_Factory;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.reactivex.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class isAlive implements forceAccessibilityForTesting {
    public final getTextInputServiceannotations IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public isAlive(getTextInputServiceannotations gettextinputserviceannotations, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, ProtoMarshallerClient_Factory protoMarshallerClient_Factory) {
        this.serializer = 1;
        this.IconCompatParcelizer = gettextinputserviceannotations;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = protoMarshallerClient_Factory;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.serializer;
        getTextInputServiceannotations gettextinputserviceannotations = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            Scheduler scheduler = (Scheduler) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
            return new getShowLayoutBoundsannotations(scheduler, (Scheduler) gettextinputserviceannotations.write());
        }
        if (i == 1) {
            return new TouchBoundsExpansionKt((r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM) gettextinputserviceannotations.write(), (Application) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write(), (disposeComposition) ((ProtoMarshallerClient_Factory) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
        }
        SharedPreferencesUtils sharedPreferencesUtils = (SharedPreferencesUtils) ((updateAutoCreatedComposeViewContext) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
        hasui hasuiVar = (hasui) ((resolveComposeViewContext) gettextinputserviceannotations).write();
        FirebaseApp firebaseApp = (FirebaseApp) ((ProtobufEncoder) obj).write;
        zzbv zzbvVar = new zzbv(22);
        zzbvVar.write = sharedPreferencesUtils;
        zzbvVar.RemoteActionCompatParcelizer = new AtomicBoolean(firebaseApp.RemoteActionCompatParcelizer());
        setPlacedUnderMotionFrameOfReference setplacedundermotionframeofreference = (setPlacedUnderMotionFrameOfReference) hasuiVar;
        setplacedundermotionframeofreference.write(setplacedundermotionframeofreference.write, new Gson$$ExternalSyntheticBUOutline0(11));
        return zzbvVar;
    }

    public /* synthetic */ isAlive(Object obj, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getTextInputServiceannotations gettextinputserviceannotations, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = gettextinputserviceannotations;
    }
}
