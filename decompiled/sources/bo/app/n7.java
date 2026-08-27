package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class n7 {
    public final rf a;
    public final z7 b;

    public static final String b() {
        return "Failed to delete the sealed session from the storage.";
    }

    public static final String d() {
        return "Error occured while publishing exception.";
    }

    public static final String e() {
        return "Failed to upsert active session in the storage.";
    }

    public final ff c() {
        try {
            return this.a.c();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(22), 4, (Object) null);
            a(this.b, e);
            return null;
        }
    }

    public n7(rf rfVar, z7 z7Var) {
        rfVar.getClass();
        z7Var.getClass();
        this.a = rfVar;
        this.b = z7Var;
    }

    public final void a(z7 z7Var, Exception exc) {
        z7Var.getClass();
        exc.getClass();
        try {
            z7Var.b(new sf("A storage exception has occurred. Please view the stack trace for more details.", exc), sf.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(3), 4, (Object) null);
        }
    }

    public final void a(ff ffVar) {
        ffVar.getClass();
        try {
            this.a.a(ffVar);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(23), 4, (Object) null);
            a(this.b, e);
        }
    }

    public final void a(String str) {
        str.getClass();
        try {
            this.a.a(str);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(2), 4, (Object) null);
            a(this.b, e);
        }
    }

    public static final String a() {
        return "Failed to get the active session from the storage.";
    }
}
