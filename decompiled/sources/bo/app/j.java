package bo.app;

import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public final v9 a;
    public final Long b;

    public j(l9 l9Var, v9 v9Var) {
        l9Var.getClass();
        v9Var.getClass();
        this.a = v9Var;
        String str = (String) v9Var.b.get(HttpHeaders.RETRY_AFTER);
        this.b = str != null ? com.braze.support.h.a(str) : null;
    }
}
