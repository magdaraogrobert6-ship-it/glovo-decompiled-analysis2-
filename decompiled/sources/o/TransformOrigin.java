package o;

import android.os.Handler;
import android.os.Looper;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class TransformOrigin {
    public static final Executor IconCompatParcelizer;
    public final LinkedHashSet serializer = new LinkedHashSet(1);
    public final LinkedHashSet read = new LinkedHashSet(1);
    public final Handler write = new Handler(Looper.getMainLooper());
    public volatile getRepeated3opZhB0 RemoteActionCompatParcelizer = null;

    public final void read(getFrameworkTileModeDecal getframeworktilemodedecal) {
        StrokeJoinCompanion strokeJoinCompanion;
        synchronized (this) {
            getRepeated3opZhB0 getrepeated3opzhb0 = this.RemoteActionCompatParcelizer;
            if (getrepeated3opzhb0 != null && (strokeJoinCompanion = getrepeated3opzhb0.serializer) != null) {
                getframeworktilemodedecal.serializer(strokeJoinCompanion);
            }
            this.serializer.add(getframeworktilemodedecal);
        }
    }

    public final void serializer(getFrameworkTileModeDecal getframeworktilemodedecal) {
        Throwable th;
        synchronized (this) {
            getRepeated3opZhB0 getrepeated3opzhb0 = this.RemoteActionCompatParcelizer;
            if (getrepeated3opzhb0 != null && (th = getrepeated3opzhb0.IconCompatParcelizer) != null) {
                getframeworktilemodedecal.serializer(th);
            }
            this.read.add(getframeworktilemodedecal);
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            IconCompatParcelizer = new setSupportButtonTintList(1);
        } else {
            IconCompatParcelizer = Executors.newCachedThreadPool(new getD55());
        }
    }

    public final void write(getRepeated3opZhB0 getrepeated3opzhb0) {
        if (this.RemoteActionCompatParcelizer != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("A task may only be set once.");
            return;
        }
        this.RemoteActionCompatParcelizer = getrepeated3opzhb0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            serializer();
        } else {
            this.write.post(new RxWorker$1$$ExternalSyntheticLambda0(11, this));
        }
    }

    public final void serializer() {
        getRepeated3opZhB0 getrepeated3opzhb0 = this.RemoteActionCompatParcelizer;
        if (getrepeated3opzhb0 == null) {
            return;
        }
        StrokeJoinCompanion strokeJoinCompanion = getrepeated3opzhb0.serializer;
        if (strokeJoinCompanion != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.serializer).iterator();
                while (it.hasNext()) {
                    ((getFrameworkTileModeDecal) it.next()).serializer(strokeJoinCompanion);
                }
            }
            return;
        }
        Throwable th = getrepeated3opzhb0.IconCompatParcelizer;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.read);
            if (arrayList.isEmpty()) {
                getD50Xyzui_graphics.IconCompatParcelizer("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((getFrameworkTileModeDecal) it2.next()).serializer(th);
            }
        }
    }

    public TransformOrigin(Callable callable) {
        Executor executor = IconCompatParcelizer;
        getNativeStyle getnativestyle = new getNativeStyle(callable);
        getnativestyle.IconCompatParcelizer = this;
        executor.execute(getnativestyle);
    }

    public TransformOrigin(StrokeJoinCompanion strokeJoinCompanion) {
        write(new getRepeated3opZhB0(strokeJoinCompanion));
    }
}
