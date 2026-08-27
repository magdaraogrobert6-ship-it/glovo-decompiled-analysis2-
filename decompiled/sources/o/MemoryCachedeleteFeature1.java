package o;

import java.io.ByteArrayInputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachedeleteFeature1 extends ObjectInputStream {
    public static final HashSet RemoteActionCompatParcelizer;
    public boolean IconCompatParcelizer;
    public final Class read;

    static {
        HashSet hashSet = new HashSet();
        RemoteActionCompatParcelizer = hashSet;
        hashSet.add("java.util.TreeMap");
        hashSet.add("java.lang.Integer");
        hashSet.add("java.lang.Number");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        hashSet.add("java.util.ArrayList");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        hashSet.add("[B");
        hashSet.add("java.util.LinkedList");
        hashSet.add("java.util.Stack");
        hashSet.add("java.util.Vector");
        hashSet.add("[Ljava.lang.Object;");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    public MemoryCachedeleteFeature1(Class cls, ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.IconCompatParcelizer = false;
        this.read = cls;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
        if (this.IconCompatParcelizer) {
            if (!RemoteActionCompatParcelizer.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else {
            if (!objectStreamClass.getName().equals(this.read.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.IconCompatParcelizer = true;
        }
        return super.resolveClass(objectStreamClass);
    }
}
