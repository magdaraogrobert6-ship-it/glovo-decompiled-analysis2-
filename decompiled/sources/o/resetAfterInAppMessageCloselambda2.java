package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.n2$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class resetAfterInAppMessageCloselambda2 extends LazyKt__LazyJVMKt {
    public static resumeWebviewIfNecessarylambda0 write(Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return obj == null ? requestDisplayInAppMessagelambda8.IconCompatParcelizer : new resetAfterInAppMessageCloselambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, new n2$$ExternalSyntheticLambda0(1, obj));
    }

    public static requestDisplayInAppMessagelambda7 read(r8lambdaN7z0Ea2bnxePLVipqp_gDhWww r8lambdan7z0ea2bnxeplvipqp_gdhwww, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new requestDisplayInAppMessagelambda7(r8lambdan7z0ea2bnxeplvipqp_gdhwww, true, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static List read(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0) {
        Iterator it = resumewebviewifnecessarylambda0.iterator();
        if (!it.hasNext()) {
            return instance_delegatelambda0.write;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{next}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Object serializer(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0) {
        Iterator it = resumewebviewifnecessarylambda0.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String RemoteActionCompatParcelizer(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0, String str) {
        resumewebviewifnecessarylambda0.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : resumewebviewifnecessarylambda0) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            DelayKt.write(-1980350160, iWrite2, 1980350160, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[]{sb, obj, null});
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static requestDisplayInAppMessagelambda7 RemoteActionCompatParcelizer(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return new requestDisplayInAppMessagelambda7(new verifyOrientationStatuslambda3(resumewebviewifnecessarylambda0, r8lambdaunavo3sxub_pc9xroryotnrlvsm), false, new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static resumeWebviewIfNecessarylambda0 RemoteActionCompatParcelizer(r8lambdaN7z0Ea2bnxePLVipqp_gDhWww r8lambdan7z0ea2bnxeplvipqp_gdhwww, int i) {
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return r8lambdan7z0ea2bnxeplvipqp_gdhwww;
        }
        if (r8lambdan7z0ea2bnxeplvipqp_gdhwww instanceof requestDisplayInAppMessagelambda6) {
            return ((requestDisplayInAppMessagelambda6) r8lambdan7z0ea2bnxeplvipqp_gdhwww).read(i);
        }
        return new requestDisplayInAppMessagelambda10(r8lambdan7z0ea2bnxeplvipqp_gdhwww, i, 0);
    }

    public static resumeWebviewIfNecessarylambda0 serializer(Iterator it) {
        it.getClass();
        return new requestDisplayInAppMessagelambda4(new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(2, it));
    }
}
