package o;

import com.google.android.gms.common.api.Status;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaPauseEK5gGoQ extends accessgetNumPadDirectionRightcp {
    public final Object serializer;
    public final /* synthetic */ int write = 0;

    public getMediaPauseEK5gGoQ(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.serializer = parentDataModifierDefaultImpls;
    }

    @Override // o.accessgetNumPadDirectionRightcp
    public final void IconCompatParcelizer(Status status) {
        int i = this.write;
        Object obj = this.serializer;
        if (i != 0) {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(status, (Object) null, ((getMeasurementConstraintsmsEJaDk) obj).RemoteActionCompatParcelizer);
        } else {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(status, (Object) null, (ParentDataModifierDefaultImpls) obj);
        }
    }

    public getMediaPauseEK5gGoQ(getMeasurementConstraintsmsEJaDk getmeasurementconstraintsmsejadk) {
        this.serializer = getmeasurementconstraintsmsejadk;
    }
}
