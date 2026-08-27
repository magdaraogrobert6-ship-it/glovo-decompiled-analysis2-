package androidx.profileinstaller;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.accessgetDstIncp;
import o.setSupportButtonTintList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ProfileInstallerInitializer$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ Context write;

    public /* synthetic */ ProfileInstallerInitializer$$ExternalSyntheticLambda1(Context context, int i) {
        this.read = i;
        this.write = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        Context context = this.write;
        int i2 = 1;
        if (i != 0) {
            accessgetDstIncp.read(context, new setSupportButtonTintList(1), accessgetDstIncp.serializer, false);
        } else {
            new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ProfileInstallerInitializer$$ExternalSyntheticLambda1(context, i2));
        }
    }
}
