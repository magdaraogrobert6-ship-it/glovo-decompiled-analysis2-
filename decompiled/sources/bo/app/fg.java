package bo.app;

import android.content.Context;
import com.braze.support.StringUtils;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public abstract class fg {
    public static eg a(w5 w5Var, String str, String str2) {
        w5Var.getClass();
        str.getClass();
        str2.getClass();
        lh lhVar = w5Var.a;
        Context context = lhVar.a;
        return new eg(context, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("com.braze.tokenbucket.", str, ".", str2, StringUtils.getCacheFileSuffix(context, lhVar.e, lhVar.f)));
    }
}
