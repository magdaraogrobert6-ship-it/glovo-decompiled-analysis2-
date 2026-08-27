package bo.app;

import java.util.Objects;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class o3 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ JSONArray a;

    public o3(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Objects.nonNull(this.a.opt(((Number) obj).intValue())));
    }
}
