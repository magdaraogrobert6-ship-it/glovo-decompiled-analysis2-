package o;

import dagger.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class getColorIntegerOrNull implements mergeJsonObjects, Lazy {
    public static final Object serializer = new Object();
    public volatile Object IconCompatParcelizer = serializer;
    public volatile mergeJsonObjects write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Object objWrite;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = serializer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objWrite = this.IconCompatParcelizer;
            if (objWrite == obj2) {
                objWrite = this.write.write();
                Object obj3 = this.IconCompatParcelizer;
                if (obj3 != obj2 && obj3 != objWrite) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objWrite + ". This is likely due to a circular dependency.");
                }
                this.IconCompatParcelizer = objWrite;
                this.write = null;
            }
        }
        return objWrite;
    }

    public getColorIntegerOrNull(mergeJsonObjects mergejsonobjects) {
        this.write = mergejsonobjects;
    }

    public static mergeJsonObjects IconCompatParcelizer(mergeJsonObjects mergejsonobjects) {
        mergejsonobjects.getClass();
        return mergejsonobjects instanceof getColorIntegerOrNull ? mergejsonobjects : new getColorIntegerOrNull(mergejsonobjects);
    }

    public static Lazy serializer(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        return serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq instanceof mergeJsonObjects ? (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq : new getPrettyPrintedStringlambda1(r8lambdaktwlyipskq3tfa9ey3gatonixfq));
    }

    public static Lazy serializer(mergeJsonObjects mergejsonobjects) {
        if (mergejsonobjects instanceof Lazy) {
            return (Lazy) mergejsonobjects;
        }
        mergejsonobjects.getClass();
        return new getColorIntegerOrNull(mergejsonobjects);
    }
}
