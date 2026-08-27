package androidx.room;

import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int read;
    public final /* synthetic */ Runnable write;

    public /* synthetic */ RoomDatabase$$ExternalSyntheticLambda1(Runnable runnable, int i) {
        this.read = i;
        this.write = runnable;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Runnable runnable = this.write;
        if (i != 0) {
            runnable.run();
            return createfromparcel;
        }
        runnable.run();
        return createfromparcel;
    }
}
