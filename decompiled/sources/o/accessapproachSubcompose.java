package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessapproachSubcompose {
    public final accessdisposeUnusedSlotsInApproach IconCompatParcelizer;
    public final Integer serializer;

    public /* synthetic */ accessapproachSubcompose(com.huawei.agconnect.config.impl.m mVar) {
        this.IconCompatParcelizer = (accessdisposeUnusedSlotsInApproach) mVar.RemoteActionCompatParcelizer;
        this.serializer = (Integer) mVar.read;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.serializer, null, null});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessapproachSubcompose)) {
            return false;
        }
        accessapproachSubcompose accessapproachsubcompose = (accessapproachSubcompose) obj;
        return TuplesKt.write(this.IconCompatParcelizer, accessapproachsubcompose.IconCompatParcelizer) && TuplesKt.write(this.serializer, accessapproachsubcompose.serializer) && TuplesKt.write((Object) null, (Object) null) && TuplesKt.write((Object) null, (Object) null);
    }
}
