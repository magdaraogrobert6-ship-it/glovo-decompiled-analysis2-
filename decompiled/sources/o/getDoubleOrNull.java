package o;

import dagger.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class getDoubleOrNull implements getColorIntegerOrNulllambda0, Lazy {
    public final Object write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return this.write;
    }

    public getDoubleOrNull(Object obj) {
        this.write = obj;
    }

    public static getDoubleOrNull write(Object obj) {
        setNativeShader.RemoteActionCompatParcelizer(obj, "instance cannot be null");
        return new getDoubleOrNull(obj);
    }
}
