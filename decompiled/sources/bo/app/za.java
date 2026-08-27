package bo.app;

import com.braze.support.BrazeLogger;
import o.displayInAppMessagelambda4;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes.dex */
public final class za implements displayInAppMessagelambda4 {
    public Object a;

    @Override // o.displayInAppMessagelambda13
    public final Object getValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2) {
        obj.getClass();
        registerinappmessagemanagerlambda2.getClass();
        return this.a;
    }

    @Override // o.displayInAppMessagelambda4
    public final void setValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj2) {
        obj.getClass();
        registerinappmessagemanagerlambda2.getClass();
        Object obj3 = this.a;
        if (obj3 == null) {
            this.a = obj2;
        } else {
            if (obj3.equals(obj2)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(obj2, 16, registerinappmessagemanagerlambda2), 7, (Object) null);
        }
    }

    public static final String a(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2) {
        return "Cannot assign " + obj + " to only-set-once property " + registerinappmessagemanagerlambda2.getName();
    }
}
