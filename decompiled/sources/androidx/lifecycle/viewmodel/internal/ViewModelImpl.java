package androidx.lifecycle.viewmodel.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlinx.coroutines.internal.ContextScope;
import o.DrawableTransformation;
import o.asComposePaint;
import o.getIntentArrayWithConfiguredBackStacklambda4;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelImpl {
    public volatile boolean read;
    public final getIntentArrayWithConfiguredBackStacklambda4 RemoteActionCompatParcelizer = new getIntentArrayWithConfiguredBackStacklambda4(3);
    public final LinkedHashMap write = new LinkedHashMap();
    public final LinkedHashSet serializer = new LinkedHashSet();

    public static void write(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                af$$ExternalSyntheticOutline0.m(autoCloseable);
            } catch (Exception e) {
                DrawableTransformation.read((Throwable) e);
            }
        }
    }

    public final void read(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        if (this.read) {
            write(autoCloseable);
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            autoCloseable2 = (AutoCloseable) this.write.put(str, autoCloseable);
        }
        write(autoCloseable2);
    }

    public ViewModelImpl(ContextScope contextScope) {
        read("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new asComposePaint(contextScope.serializer));
    }

    public final void IconCompatParcelizer(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        if (this.read) {
            write(autoCloseable);
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            this.serializer.add(autoCloseable);
        }
    }

    public ViewModelImpl() {
    }
}
