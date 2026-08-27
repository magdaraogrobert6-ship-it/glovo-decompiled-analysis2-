package o;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetAssistcp implements accessgetAtcp {
    public final Activity IconCompatParcelizer;
    public final Context RemoteActionCompatParcelizer;
    public final String serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;

    @Override // o.accessgetAtcp
    public final String IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.accessgetAtcp
    public final accessgetAvReceiverInputcp RemoteActionCompatParcelizer() {
        return (accessgetAvReceiverInputcp) this.write.getValue();
    }

    public final accessgetAvReceiverInputcp serializer() {
        String str = this.serializer;
        str.getClass();
        return FocusListener.write(this.RemoteActionCompatParcelizer, str) == 0 ? accessgetBackcp.serializer : new accessgetBackslashcp(getOnFocusChanged.serializer(this.IconCompatParcelizer, str));
    }

    public accessgetAssistcp(String str, Context context, Activity activity) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = context;
        this.IconCompatParcelizer = activity;
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(serializer());
    }
}
