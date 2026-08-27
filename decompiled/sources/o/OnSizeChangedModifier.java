package o;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.tagmanager.zzs;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OnSizeChangedModifier {
    public static volatile getLastReportedResult IconCompatParcelizer;
    public static volatile DynamiteModule serializer;
    public static final HashMap read = new HashMap();
    public static final HashMap RemoteActionCompatParcelizer = new HashMap();

    public static getLastReportedResult RemoteActionCompatParcelizer(Context context) {
        getLastReportedResult getlastreportedresultAsInterface;
        getLastReportedResult getlastreportedresult = IconCompatParcelizer;
        if (getlastreportedresult != null) {
            return getlastreportedresult;
        }
        synchronized (OnSizeChangedModifier.class) {
            getlastreportedresultAsInterface = IconCompatParcelizer;
            if (getlastreportedresultAsInterface == null) {
                try {
                    getlastreportedresultAsInterface = zzs.asInterface(write(context).RemoteActionCompatParcelizer("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                    IconCompatParcelizer = getlastreportedresultAsInterface;
                } catch (DynamiteModule.LoadingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return getlastreportedresultAsInterface;
    }

    public static DynamiteModule write(Context context) {
        DynamiteModule dynamiteModuleLoad;
        DynamiteModule dynamiteModule = serializer;
        if (dynamiteModule != null) {
            return dynamiteModule;
        }
        synchronized (OnSizeChangedModifier.class) {
            dynamiteModuleLoad = serializer;
            if (serializer == null) {
                dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.write, ModuleDescriptor.MODULE_ID);
                serializer = dynamiteModuleLoad;
            }
        }
        return dynamiteModuleLoad;
    }

    public static Object serializer(Class cls, String str) {
        try {
            Class<?> cls2 = Class.forName(str);
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3.equals(cls)) {
                    try {
                        try {
                            try {
                                return cls2.getConstructor(null).newInstance(null);
                            } catch (SecurityException unused) {
                                SentryLogcatAdapter.serializer("GoogleTagManagerAPI", str + " doesn't have an accessible no-arg constructor");
                            }
                        } catch (IllegalAccessException unused2) {
                            SentryLogcatAdapter.serializer("GoogleTagManagerAPI", str + " doesn't have an accessible no-arg constructor");
                        } catch (InvocationTargetException unused3) {
                            SentryLogcatAdapter.serializer("GoogleTagManagerAPI", str + " construction threw an exception.");
                        }
                    } catch (InstantiationException unused4) {
                        SentryLogcatAdapter.serializer("GoogleTagManagerAPI", str + " is an abstract class.");
                    } catch (NoSuchMethodException unused5) {
                        SentryLogcatAdapter.serializer("GoogleTagManagerAPI", str + " doesn't have a valid no-arg constructor");
                    }
                }
                return null;
            }
            SentryLogcatAdapter.serializer("GoogleTagManagerAPI", str + " doesn't implement " + cls.getCanonicalName() + " interface.");
            return null;
        } catch (ClassNotFoundException unused6) {
            SentryLogcatAdapter.serializer("GoogleTagManagerAPI", String.valueOf(str).concat(" can't be found in the application."));
        }
    }
}
