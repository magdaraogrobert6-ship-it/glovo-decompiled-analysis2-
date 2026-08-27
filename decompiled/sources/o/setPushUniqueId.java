package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.SdkException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setPushUniqueId {
    private static setPushUniqueId serializer;
    private final HashMap RemoteActionCompatParcelizer = new HashMap();
    private final setPushStoryPages read;

    public static <T> T IconCompatParcelizer(Class<T> cls) {
        try {
            setPushUniqueId setpushuniqueid = serializer;
            if (setpushuniqueid != null) {
                return (T) setpushuniqueid.write(cls, 0, (Class) null, new ArrayList());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void IconCompatParcelizer() {
        serializer.read.serializer();
    }

    @SuppressLint
    public final <T> T write(Class<T> cls, int i, Class cls2, List<Class> list) {
        migrateTriggersReeligibilityToJsonlambda1 migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer;
        cls.getClass();
        migrateTriggersReeligibilityToJsonlambda1 migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(cls);
        if (migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer2 != null) {
            return (T) migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer2.read();
        }
        T t = (T) this.read.write(cls, cls2, i, list);
        if (t != null) {
            return t;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        boolean z = true;
        if (constructors.length != 1) {
            StringBuilder sb = new StringBuilder("Expected exactly one public constructor for class ");
            sb.append(cls.getSimpleName());
            sb.append(", got ");
            sb.append(constructors.length);
            sb.append(cls2 == null ? "" : " (parent: " + cls2.getSimpleName() + ")");
            throw new SdkException(sb.toString());
        }
        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        if (list.contains(cls)) {
            list.add(cls);
            Log.e("Circular dependency", read(list));
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Circular dependency: ".concat(read(list)));
            return null;
        }
        list.add(cls);
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            Class<?> cls3 = parameterTypes[i2];
            if (setPushStoryPageIndex.class.isAssignableFrom(cls3)) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Directly injecting the delegate class ", cls3.getSimpleName(), " into the constructor of ", cls.getSimpleName(), " is not allowed. Use its delegated class type instead"));
                return null;
            }
            objArr[i2] = write(cls3, i + 1, cls, list);
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            list.remove(cls);
            migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls);
            if (migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer == null) {
                migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer = new setSummaryText(cls, constructor, objArr);
                if (!Arrays.asList(cls.getInterfaces()).contains(setPushStoryPageIndex.class)) {
                    this.RemoteActionCompatParcelizer.put(cls, migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer);
                }
            } else {
                z = false;
            }
        }
        T t2 = (T) migratetriggersreeligibilitytojsonlambda1RemoteActionCompatParcelizer.read();
        if (z) {
            t2.getClass();
        }
        return t2;
    }

    private setPushUniqueId(Context context) {
        this.read = new setPushStoryPages(context);
    }

    public final setPushStoryPages RemoteActionCompatParcelizer() {
        return this.read;
    }

    public static setPushUniqueId serializer() {
        return serializer;
    }

    public static <T> T read(Class<T> cls) {
        return (T) serializer.write(cls, 0, (Class) null, new ArrayList());
    }

    public static <T> T read(Class<T> cls, Class cls2) {
        return (T) serializer.write(cls, 0, cls2, new ArrayList());
    }

    public static <T> T write(Class<T> cls, Class cls2, int i, List<Class> list) {
        return (T) serializer.write(cls, i, cls2, list);
    }

    private static String read(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((Class) list.get(i)).getSimpleName());
            if (i < list.size() - 1) {
                sb.append(" - ");
            }
        }
        return sb.toString();
    }

    private migrateTriggersReeligibilityToJsonlambda1 RemoteActionCompatParcelizer(Class cls) {
        migrateTriggersReeligibilityToJsonlambda1 migratetriggersreeligibilitytojsonlambda1;
        synchronized (this.RemoteActionCompatParcelizer) {
            migratetriggersreeligibilitytojsonlambda1 = (migrateTriggersReeligibilityToJsonlambda1) this.RemoteActionCompatParcelizer.get(cls);
        }
        if (migratetriggersreeligibilitytojsonlambda1 == null) {
            return null;
        }
        cls.getClass();
        return migratetriggersreeligibilitytojsonlambda1;
    }

    public static void write(Context context) {
        synchronized (setPushUniqueId.class) {
            if (serializer == null) {
                serializer = new setPushUniqueId(context);
            }
        }
    }
}
