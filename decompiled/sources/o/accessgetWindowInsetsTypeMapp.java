package o;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetWindowInsetsTypeMapp implements getSafeGestures {
    public final coil3.memory.MemoryCacheService RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ accessgetWindowInsetsTypeMapp(coil3.memory.MemoryCacheService memoryCacheService, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = memoryCacheService;
    }

    @Override // o.getSafeGestures
    public final Object m_() {
        int i = this.write;
        coil3.memory.MemoryCacheService memoryCacheService = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return new getSourceValueInsetshdzbrEE(((getFocusEK5gGoQ) memoryCacheService.RemoteActionCompatParcelizer).write);
        }
        Context context = ((getFocusEK5gGoQ) memoryCacheService.RemoteActionCompatParcelizer).write;
        af$$ExternalSyntheticOutline0.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        findInsetsAnimationProperties findinsetsanimationproperties = new findInsetsAnimationProperties();
        new HashSet();
        context.getApplicationContext();
        return findinsetsanimationproperties;
    }
}
