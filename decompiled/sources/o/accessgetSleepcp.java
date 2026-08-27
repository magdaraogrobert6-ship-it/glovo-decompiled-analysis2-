package o;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSleepcp extends accessgetStem2cp {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Intent RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ accessgetSleepcp(Intent intent, Object obj, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = intent;
        this.write = obj;
        this.read = i;
    }

    @Override // o.accessgetStem2cp
    public final void read() {
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        Object obj = this.write;
        Intent intent = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            if (intent != null) {
                ((androidx.fragment.app.Fragment) obj).startActivityForResult(intent, i2);
            }
        } else if (intent != null) {
            ((Activity) obj).startActivityForResult(intent, i2);
        }
    }
}
