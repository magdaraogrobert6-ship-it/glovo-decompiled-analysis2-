package o;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Outline implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ int write;

    public /* synthetic */ Outline(int i, long j, String str) {
        this.write = i;
        this.read = j;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        int i = this.write;
        String str = this.RemoteActionCompatParcelizer;
        long j = this.read;
        tintxETnrds tintxetnrds = (tintxETnrds) obj;
        if (i != 0) {
            tintxetnrds.getClass();
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
            try {
                uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, j);
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(2, str);
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                return createFromParcel.INSTANCE;
            } finally {
                uncheckedColordefaultRemoteActionCompatParcelizer.close();
            }
        }
        tintxetnrds.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds.RemoteActionCompatParcelizer("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
        try {
            uncheckedColordefaultRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(1, j);
            uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer(2, str);
            uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds})).intValue());
        } finally {
            uncheckedColordefaultRemoteActionCompatParcelizer2.close();
        }
    }
}
