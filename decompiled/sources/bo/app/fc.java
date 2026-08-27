package bo.app;

import com.braze.models.outgoing.BrazeProperties;

/* JADX INFO: loaded from: classes.dex */
public final class fc extends rg {
    public final String f;

    public fc(String str, BrazeProperties brazeProperties, g9 g9Var) {
        super(brazeProperties, g9Var);
        this.f = str;
    }

    @Override // bo.app.da
    public final String a() {
        return "purchase";
    }
}
