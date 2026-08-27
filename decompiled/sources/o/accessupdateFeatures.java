package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes4.dex */
public final class accessupdateFeatures implements PrivilegedAction {
    public final /* synthetic */ int IconCompatParcelizer = 0;

    public /* synthetic */ accessupdateFeatures() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        if (this.IconCompatParcelizer == 0) {
            return System.getProperty("line.separator");
        }
        String[] strArr = MemoryCachedecodeInitialData1.IconCompatParcelizer;
        int i = 0;
        while (true) {
            Class<?> clsLoadClass = null;
            if (i == strArr.length) {
                return null;
            }
            String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder("org.bouncycastle.pqc.jcajce.provider."), strArr[i], "$Mappings");
            try {
                ClassLoader classLoader = MemoryCachedecodeInitialData1.class.getClassLoader();
                clsLoadClass = classLoader != null ? classLoader.loadClass(strM) : (Class) AccessController.doPrivileged(new bootstrapIfNeeded(2, strM));
            } catch (ClassNotFoundException unused) {
            }
            if (clsLoadClass != null) {
                try {
                    clsLoadClass.newInstance().getClass();
                    throw new ClassCastException();
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of org.bouncycastle.pqc.jcajce.provider." + strArr[i] + "$Mappings : " + e);
                }
            }
            i++;
        }
    }

    public accessupdateFeatures(MemoryCachedecodeInitialData1 memoryCachedecodeInitialData1) {
    }
}
