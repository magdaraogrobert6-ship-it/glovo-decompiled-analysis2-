package o;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class setNativeAlpha {
    public final BroadcastReceiver IconCompatParcelizer;
    public final IntentFilter read;
    public boolean serializer;
    public boolean write;

    public setNativeAlpha(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.read = intentFilter;
        this.IconCompatParcelizer = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        sb.append("Receiver{");
        sb.append(this.IconCompatParcelizer);
        sb.append(" filter=");
        sb.append(this.read);
        if (this.write) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
