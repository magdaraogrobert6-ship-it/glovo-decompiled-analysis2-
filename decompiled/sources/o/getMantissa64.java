package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class getMantissa64 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final getMantissa64 read;
    public static final getMantissa64 serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMantissa64(drawCachedImageFqjB98A drawcachedimagefqjb98a) {
        super(0);
        this.write = 0;
    }

    static {
        int i = 0;
        read = new getMantissa64(i, 1);
        serializer = new getMantissa64(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getMantissa64(int i, int i2) {
        super(i);
        this.write = i2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? new toContentCaptureSession(19) : new updateMatrix();
        }
        getInvalidateListenerui.read.set(null);
        return createFromParcel.INSTANCE;
    }
}
