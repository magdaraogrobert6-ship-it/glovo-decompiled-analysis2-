package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ActivityHandler36 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ AtomicBoolean serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ ActivityHandler36(AtomicBoolean atomicBoolean, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = atomicBoolean;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        AtomicBoolean atomicBoolean = this.serializer;
        String str = (String) obj;
        if (i4 != 0) {
            str.getClass();
            if (atomicBoolean.compareAndSet(false, true)) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new ActivityHandler26(str));
            }
            return createfromparcel;
        }
        str.getClass();
        if (atomicBoolean.compareAndSet(false, true)) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
        }
        int i5 = IconCompatParcelizer + 55;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
