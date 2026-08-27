package o;

import android.content.Context;
import com.sentiance.sdk.task.TaskManager;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetScopeCreationLockcp implements Runnable {
    final /* synthetic */ createOrGetDataStorelambda00 IconCompatParcelizer;
    final /* synthetic */ createOrGetDataStorelambda010 read;

    @Override // java.lang.Runnable
    public final void run() {
        createOrGetDataStorelambda010 createorgetdatastorelambda010 = this.read;
        Context context = ((TaskManager) ((TaskManager) createorgetdatastorelambda010)).read;
        createOrGetDataStorelambda00 createorgetdatastorelambda00 = this.IconCompatParcelizer;
        boolean zRemoteActionCompatParcelizer = createorgetdatastorelambda00.RemoteActionCompatParcelizer(context, createorgetdatastorelambda010);
        if (createorgetdatastorelambda00.z_()) {
            createorgetdatastorelambda010.write(createorgetdatastorelambda00, zRemoteActionCompatParcelizer);
        }
    }

    public accessgetScopeCreationLockcp(createOrGetDataStorelambda010 createorgetdatastorelambda010, createOrGetDataStorelambda00 createorgetdatastorelambda00) {
        this.read = createorgetdatastorelambda010;
        this.IconCompatParcelizer = createorgetdatastorelambda00;
    }
}
