package bo.app;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class zf implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ JSONArray a;

    public zf(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.a.opt(((Number) obj).intValue()) instanceof String);
    }
}
