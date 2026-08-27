package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements w9 {
    public static final e2 d = new e2();
    public final h2 a;
    public final BrazeConfigurationProvider b;
    public final d2 c;

    public static final String c() {
        return "***Location API not found. Please include android-sdk-location module***";
    }

    public static final String e() {
        return "Failed to log location recorded event.";
    }

    public static final String g() {
        return "Automatic location collection is disabled. Not requesting location update.";
    }

    public final boolean a(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new f2$$ExternalSyntheticLambda1(iBrazeLocation, 0), 6, (Object) null);
            g9 g9VarA = n1.g.a(iBrazeLocation);
            if (g9VarA == null) {
                return true;
            }
            this.a.a(g9VarA);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(18), 4, (Object) null);
            return false;
        }
    }

    public final boolean d() {
        if (this.b.isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(20), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(21), 6, (Object) null);
        return true;
    }

    public f2(Context context, h2 h2Var, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        h2Var.getClass();
        brazeConfigurationProvider.getClass();
        this.a = h2Var;
        this.b = brazeConfigurationProvider;
        d2 d2Var = new d2(context, d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.c = d2Var;
        if (d2Var.a != null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(7), 6, (Object) null);
    }

    public static final String b(IBrazeLocation iBrazeLocation) {
        return "Invoked manualSetUserLocation for " + iBrazeLocation;
    }

    public final boolean f() {
        int i = 0;
        if (d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(19), 6, (Object) null);
            return false;
        }
        d2 d2Var = this.c;
        f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4 = new f2$$ExternalSyntheticLambda4(i, this);
        d2Var.getClass();
        IBrazeLocationApi iBrazeLocationApi = d2Var.a;
        if (iBrazeLocationApi != null) {
            return iBrazeLocationApi.requestSingleLocationUpdate(f2__externalsyntheticlambda4);
        }
        return false;
    }

    public static final String b() {
        return "Automatic location collection disabled via sdk configuration.";
    }

    public static final String a() {
        return "Automatic location collection enabled via sdk configuration.";
    }

    public static final createFromParcel a(f2 f2Var, IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        f2Var.a(iBrazeLocation);
        return createFromParcel.INSTANCE;
    }
}
