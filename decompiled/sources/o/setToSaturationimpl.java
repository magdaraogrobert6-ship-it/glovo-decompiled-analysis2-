package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setToSaturationimpl {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static volatile setToSaturationimpl read;
    public final Context IconCompatParcelizer;
    public final HashSet write = new HashSet();
    public final HashMap serializer = new HashMap();

    public final Object read(Class cls) {
        Object objWrite;
        synchronized (RemoteActionCompatParcelizer) {
            objWrite = this.serializer.get(cls);
            if (objWrite == null) {
                objWrite = write(cls, new HashSet());
            }
        }
        return objWrite;
    }

    public setToSaturationimpl(Context context) {
        this.IconCompatParcelizer = context.getApplicationContext();
    }

    public static setToSaturationimpl IconCompatParcelizer(Context context) {
        if (read == null) {
            synchronized (RemoteActionCompatParcelizer) {
                if (read == null) {
                    read = new setToSaturationimpl(context);
                }
            }
        }
        return read;
    }

    public final Object write(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.serializer;
        if (((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue()) {
            try {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                copyColorMatrixgBh15pIdefault copycolormatrixgbh15pidefault = (copyColorMatrixgBh15pIdefault) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = copycolormatrixgbh15pidefault.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            write(cls2, hashSet);
                        }
                    }
                }
                objCreate = copycolormatrixgbh15pidefault.create(this.IconCompatParcelizer);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new androidx.startup.StartupException(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    public final void write(Bundle bundle) {
        HashSet hashSet;
        String string = this.IconCompatParcelizer.getString(com.logistics.rider.glovo.R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.write;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (copyColorMatrixgBh15pIdefault.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    write((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new androidx.startup.StartupException(e);
            }
        }
    }
}
