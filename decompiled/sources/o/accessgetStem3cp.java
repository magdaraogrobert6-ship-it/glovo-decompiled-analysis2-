package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetStem3cp extends accessgetStem2cp {
    public final /* synthetic */ accessgetNumPadLeftParenthesiscp read;
    public final /* synthetic */ Intent serializer;

    public accessgetStem3cp(Intent intent, accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp) {
        this.serializer = intent;
        this.read = accessgetnumpadleftparenthesiscp;
    }

    @Override // o.accessgetStem2cp
    public final void read() {
        Intent intent = this.serializer;
        if (intent != null) {
            this.read.startActivityForResult(intent, 2);
        }
    }
}
