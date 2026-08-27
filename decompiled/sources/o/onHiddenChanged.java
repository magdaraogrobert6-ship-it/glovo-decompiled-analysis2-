package o;

import android.app.Application;
import dagger.Lazy;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public final class onHiddenChanged {
    public final Lazy IconCompatParcelizer;
    public final boolean write;

    public onHiddenChanged(Application application, Lazy lazy) {
        lazy.getClass();
        this.IconCompatParcelizer = lazy;
        this.write = !ModuleDSLKt.RemoteActionCompatParcelizer(application);
    }
}
