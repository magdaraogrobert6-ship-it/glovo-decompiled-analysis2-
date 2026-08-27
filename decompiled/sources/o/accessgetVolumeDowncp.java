package o;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetVolumeDowncp extends PathClassLoader {
    public accessgetVolumeDowncp(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
