package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.managers.BrazeGeofenceManager;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class lh implements ha {
    public final qd A;
    public final vg B;
    public final Context a;
    public final BrazeConfigurationProvider b;
    public final p9 c;
    public final o9 d;
    public final String e;
    public final String f;
    public final ih g;
    public final f5 h;
    public final z7 i;
    public final df j;
    public final o6 k;
    public final w7 l;
    public final q4 m;
    public final t2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c8 f20o;
    public final zc p;
    public final zd q;
    public final vc r;
    public final re s;
    public final h2 t;
    public final BrazeGeofenceManager u;
    public final f2 v;
    public final o8 w;
    public final g0 x;
    public final d4 y;
    public final z6 z;

    public lh(Context context, nb nbVar, BrazeConfigurationProvider brazeConfigurationProvider, u9 u9Var, p9 p9Var, x9 x9Var, qc qcVar, boolean z, boolean z2, o9 o9Var, boolean z3) {
        context.getClass();
        nbVar.getClass();
        brazeConfigurationProvider.getClass();
        u9Var.getClass();
        p9Var.getClass();
        x9Var.getClass();
        qcVar.getClass();
        o9Var.getClass();
        this.a = context;
        this.b = brazeConfigurationProvider;
        this.c = p9Var;
        this.d = o9Var;
        String strA = nbVar.a();
        this.e = strA;
        String str = brazeConfigurationProvider.getBrazeApiKey().a;
        this.f = str;
        qe qeVar = new qe(context);
        a5 a5Var = new a5(context);
        i7 i7Var = new i7(context);
        z7 z7Var = new z7(qeVar, a5Var, true);
        this.i = z7Var;
        df dfVar = new df(context, str, z7Var);
        this.j = dfVar;
        w6 w6Var = new w6();
        int iK = dfVar.k();
        o6 o6Var = new o6(context, strA, str, dfVar, z7Var, w6Var, new f8(dfVar.j(), dfVar.k(), iK, dfVar.l()));
        this.k = o6Var;
        new ge(dfVar, z7Var, context);
        n7 n7Var = new n7(new rf(context, strA, str), z7Var);
        q4 q4Var = new q4(context, z7Var, new j4(context));
        this.m = q4Var;
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        t2 t2Var = new t2(context, n7Var, z7Var, u9Var, (AlarmManager) systemService, brazeConfigurationProvider.getSessionTimeoutSeconds(), brazeConfigurationProvider.isSessionStartBasedTimeoutEnabled(), dfVar);
        this.n = t2Var;
        c8 c8Var = new c8(new b8(new t1(context, strA, str), z7Var));
        this.f20o = c8Var;
        zc zcVar = new zc(context, str, strA, z7Var, dfVar);
        this.p = zcVar;
        this.q = new zd(context, strA, str);
        i2 i2Var = new i2(context, z7Var, dfVar);
        vc vcVar = new vc(context, str, strA);
        this.r = vcVar;
        re reVar = new re(context, strA, str);
        this.s = reVar;
        h2 h2Var = new h2(context, strA, str, t2Var, z7Var, brazeConfigurationProvider, dfVar, c8Var, i2Var, qeVar, zcVar, qcVar, vcVar, a5Var, o6Var);
        this.t = h2Var;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(context, str, h2Var, brazeConfigurationProvider, dfVar, z7Var);
        this.u = brazeGeofenceManager;
        f2 f2Var = new f2(context, h2Var, brazeConfigurationProvider);
        this.v = f2Var;
        o8 o8Var = new o8(context, str, strA, z7Var, u9Var, dfVar, h2Var);
        this.w = o8Var;
        g0 g0Var = new g0(context, str, strA, z7Var, u9Var, dfVar, h2Var);
        this.x = g0Var;
        d4 d4Var = new d4(context, strA, str, h2Var);
        this.y = d4Var;
        ld ldVar = new ld(new bb(new e9(f9.a)), z7Var, u9Var, dfVar, d4Var, h2Var, i7Var);
        this.z = new z6(z7Var, h2Var);
        qd qdVar = new qd(new w5(this), ldVar, z, z3);
        this.A = qdVar;
        vg vgVar = new vg(context, h2Var, z7Var, u9Var, brazeConfigurationProvider, strA, str, qdVar);
        this.B = vgVar;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{strA, ""}, iWrite3)).booleanValue()) {
            this.g = new ih(context, x9Var, qeVar, a5Var, null, null);
            this.h = new f5(context, null, null);
        } else {
            this.g = new ih(context, x9Var, qeVar, a5Var, strA, str);
            this.h = new f5(context, strA, str);
        }
        synchronized (q4Var) {
            q4Var.l = z2;
            q4Var.b();
            if (z2) {
                q4Var.f();
            } else {
                q4Var.c();
            }
        }
        ih ihVarA = a();
        f5 f5Var = this.h;
        if (f5Var != null) {
            this.l = new w7(context, f2Var, z7Var, h2Var, ihVarA, f5Var, vgVar, vgVar.h, c8Var, brazeGeofenceManager, u9Var, brazeConfigurationProvider, d4Var, reVar, dfVar, o8Var, qcVar, g0Var);
        } else {
            removeNodeAtDepth.serializer("deviceCache");
            throw null;
        }
    }

    public final ih a() {
        ih ihVar = this.g;
        if (ihVar != null) {
            return ihVar;
        }
        removeNodeAtDepth.serializer("userCache");
        throw null;
    }
}
