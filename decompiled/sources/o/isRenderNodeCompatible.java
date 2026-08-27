package o;

import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isRenderNodeCompatible {
    public static final void RemoteActionCompatParcelizer(Activity activity, ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 processLifecycleOwner$attach$1$onActivityPreCreated$1) {
        activity.registerActivityLifecycleCallbacks(processLifecycleOwner$attach$1$onActivityPreCreated$1);
    }
}
