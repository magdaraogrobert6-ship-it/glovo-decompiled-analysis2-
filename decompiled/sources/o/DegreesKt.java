package o;

import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract class DegreesKt {
    public static boolean IconCompatParcelizer = false;
    public static Field RemoteActionCompatParcelizer = null;
    public static boolean serializer = true;

    public static void IconCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        try {
            Iterator it = ServiceLoader.load(io.sentry.profiling.RemoteActionCompatParcelizer.class).iterator();
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
        }
    }

    public static void read() {
        BrazeActionParserExternalSyntheticLambda0 logger = internalHeightCallbacklambda0.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem.getLogger();
        try {
            Iterator it = ServiceLoader.load(io.sentry.profiling.serializer.class).iterator();
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
        } catch (Throwable th) {
            logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th);
        }
    }

    public void IconCompatParcelizer(View view, float f) {
        if (serializer) {
            try {
                AbstractC0163focusOrder.RemoteActionCompatParcelizer(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                serializer = false;
            }
        }
        view.setAlpha(f);
    }

    public float RemoteActionCompatParcelizer(View view) {
        if (serializer) {
            try {
                return AbstractC0163focusOrder.RemoteActionCompatParcelizer(view);
            } catch (NoSuchMethodError unused) {
                serializer = false;
            }
        }
        return view.getAlpha();
    }
}
