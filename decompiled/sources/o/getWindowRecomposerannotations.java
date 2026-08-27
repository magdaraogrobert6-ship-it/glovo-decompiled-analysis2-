package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.location.logic.E5;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class getWindowRecomposerannotations extends readAnimationScale {
    @Override // o.readAnimationScale
    public final void IconCompatParcelizer(Intent intent) {
        if (TextUtils.equals(new SafeIntent(intent).getAction(), "android.location.MODE_CHANGED")) {
            E5.write();
        }
    }

    @Override // o.readAnimationScale
    public final String write() {
        return "Loc-Receive-GNSS";
    }

    @Override // o.readAnimationScale, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
