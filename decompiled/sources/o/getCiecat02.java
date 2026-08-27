package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class getCiecat02 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ getVonKries IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getCiecat02(getVonKries getvonkries, int i, int i2) {
        super(1);
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = getvonkries;
        this.read = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        getVonKries getvonkries = this.IconCompatParcelizer;
        return i != 0 ? Boolean.valueOf(getVonKries.IconCompatParcelizer(getvonkries, i2, ((Number) obj).longValue())) : Boolean.valueOf(getVonKries.IconCompatParcelizer(getvonkries, i2, ((Number) obj).longValue()));
    }
}
