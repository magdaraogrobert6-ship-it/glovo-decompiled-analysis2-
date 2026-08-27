package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 implements Runnable {
    public final String RemoteActionCompatParcelizer;

    public abstract void RemoteActionCompatParcelizer();

    public r8lambda0S3kvX2wuurB_sOm2dk25CPetL8(String str, Object... objArr) {
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = String.format(java.util.Locale.US, str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.RemoteActionCompatParcelizer);
        try {
            RemoteActionCompatParcelizer();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
