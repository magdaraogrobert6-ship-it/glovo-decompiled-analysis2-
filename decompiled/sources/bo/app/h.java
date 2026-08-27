package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final g c = new g();
    public final Context a;
    public final x9 b;

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((cd) this.b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(0, this), 6, (Object) null);
            cd cdVar = (cd) this.b;
            cdVar.a(cdVar.b());
        } else {
            ADM adm = new ADM(this.a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(0), 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public h(Context context, x9 x9Var) {
        context.getClass();
        x9Var.getClass();
        this.a = context;
        this.b = x9Var;
    }

    public static final String a(h hVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ", ((cd) hVar.b).b());
    }
}
