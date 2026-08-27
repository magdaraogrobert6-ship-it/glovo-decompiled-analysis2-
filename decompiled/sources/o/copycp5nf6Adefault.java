package o;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import bo.app.h$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class copycp5nf6Adefault {
    public final maxAoSsdG0 RemoteActionCompatParcelizer;
    public final maxAoSsdG0 read;
    public final ClassLoader serializer;

    public final WindowLayoutComponent write() {
        int iIconCompatParcelizer;
        maxAoSsdG0 maxaossdg0 = this.read;
        maxaossdg0.getClass();
        boolean zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        zRemoteActionCompatParcelizer = false;
        try {
            maxaossdg0.RemoteActionCompatParcelizer.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            int i = 3;
            if (getRegionfwf_client_release.RemoteActionCompatParcelizer("WindowExtensionsProvider#getWindowExtensions is not valid", new h$$ExternalSyntheticLambda0(i, maxaossdg0)) && getRegionfwf_client_release.RemoteActionCompatParcelizer("WindowExtensions#getWindowLayoutComponent is not valid", new onRemembered(this, zRemoteActionCompatParcelizer ? 1 : 0)) && getRegionfwf_client_release.RemoteActionCompatParcelizer("FoldingFeature class is not valid", new onRemembered(this, 1)) && (iIconCompatParcelizer = GraphicsContextshadowContext1.IconCompatParcelizer()) >= 1) {
                if (iIconCompatParcelizer == 1) {
                    zRemoteActionCompatParcelizer = read();
                } else if (iIconCompatParcelizer < 5) {
                    zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                } else if (RemoteActionCompatParcelizer() && getRegionfwf_client_release.RemoteActionCompatParcelizer("DisplayFoldFeature is not valid", new onRemembered(this, i)) && getRegionfwf_client_release.RemoteActionCompatParcelizer("SupportedWindowFeatures is not valid", new onRemembered(this, 2)) && getRegionfwf_client_release.RemoteActionCompatParcelizer("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new onRemembered(this, 4))) {
                    zRemoteActionCompatParcelizer = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (zRemoteActionCompatParcelizer) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused2) {
            }
        }
        return null;
    }

    public copycp5nf6Adefault(ClassLoader classLoader, maxAoSsdG0 maxaossdg0) {
        this.serializer = classLoader;
        this.RemoteActionCompatParcelizer = maxaossdg0;
        this.read = new maxAoSsdG0(classLoader, 1);
    }

    public static final boolean serializer(copycp5nf6Adefault copycp5nf6adefault) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = copycp5nf6adefault.serializer.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return java.lang.reflect.Modifier.isPublic(method2.getModifiers());
    }

    public final boolean read() {
        return getRegionfwf_client_release.RemoteActionCompatParcelizer("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new onRemembered(this, 5));
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (!read()) {
            return false;
        }
        String str = "WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid";
        try {
            boolean zSerializer = serializer(this);
            if (!zSerializer) {
                SentryLogcatAdapter.serializer("ReflectionGuard", str);
            }
            return zSerializer;
        } catch (ClassNotFoundException unused) {
            SentryLogcatAdapter.serializer("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            SentryLogcatAdapter.serializer("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            SentryLogcatAdapter.serializer("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }
}
