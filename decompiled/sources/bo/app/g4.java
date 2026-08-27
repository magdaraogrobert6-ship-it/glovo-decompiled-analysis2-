package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: loaded from: classes.dex */
public final class g4 extends rg {
    public final String f;

    @Override // bo.app.da
    public final String a() {
        return "custom_event";
    }

    public g4(String str, BrazeProperties brazeProperties, g9 g9Var) {
        super(brazeProperties, g9Var);
        this.f = str;
    }
}
