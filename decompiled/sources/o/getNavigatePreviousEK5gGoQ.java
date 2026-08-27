package o;

import com.google.android.gms.common.api.Status;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getNavigatePreviousEK5gGoQ extends accessgetNumPadDirectionRightcp {
    public final /* synthetic */ ParentDataModifierDefaultImpls IconCompatParcelizer;
    public final /* synthetic */ Object write;

    public getNavigatePreviousEK5gGoQ(Boolean bool, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.write = bool;
        this.IconCompatParcelizer = parentDataModifierDefaultImpls;
    }

    @Override // o.accessgetNumPadDirectionRightcp
    public final void IconCompatParcelizer(Status status) {
        LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(status, this.write, this.IconCompatParcelizer);
    }
}
