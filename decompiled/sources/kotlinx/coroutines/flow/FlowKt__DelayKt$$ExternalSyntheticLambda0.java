package kotlinx.coroutines.flow;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ContentTypeCompanion;
import o.UncheckedColordefault;
import o.createFromParcel;
import o.isItemDismissable;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class FlowKt__DelayKt$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ FlowKt__DelayKt$$ExternalSyntheticLambda0(long j, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        CancellableContinuationImpl cancellableContinuationImpl;
        Object isitemdismissable;
        int i = this.serializer;
        long j = this.IconCompatParcelizer;
        if (i == 0) {
            return Long.valueOf(j);
        }
        if (i == 1) {
            ContentTypeCompanion contentTypeCompanion = (ContentTypeCompanion) obj;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = contentTypeCompanion.serializer;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null && (cancellableContinuationImpl = contentTypeCompanion.IconCompatParcelizer) != null) {
                try {
                    isitemdismissable = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
                cancellableContinuationImpl.resumeWith(isitemdismissable);
            }
            return createFromParcel.INSTANCE;
        }
        tintxETnrds tintxetnrds = (tintxETnrds) obj;
        tintxetnrds.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("DELETE FROM tracking_perseus_events WHERE timestamp < ?");
        try {
            uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, j);
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
            return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds})).intValue());
        } finally {
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
        }
    }
}
