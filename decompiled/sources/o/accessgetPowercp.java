package o;

import androidx.cardview.widget.CardView$1;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.zabk;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPowercp extends accessgetPoundcp {
    public final accessgetPeriodcp IconCompatParcelizer;

    public accessgetPowercp(accessgetPeriodcp accessgetperiodcp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super(3, parentDataModifierDefaultImpls);
        this.IconCompatParcelizer = accessgetperiodcp;
    }

    @Override // o.accessgetPairingcp
    public final Feature[] read(zabk zabkVar) {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void serializer(CardView$1 cardView$1, boolean z) {
    }

    @Override // o.accessgetPoundcp
    public final void IconCompatParcelizer(zabk zabkVar) {
        accessgetPeriodcp accessgetperiodcp = this.IconCompatParcelizer;
        accessgetPageDowncp accessgetpagedowncp = accessgetperiodcp.read;
        accessgetpagedowncp.IconCompatParcelizer.write.serializer(zabkVar.RemoteActionCompatParcelizer, this.serializer);
        accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) accessgetpagedowncp.write.RemoteActionCompatParcelizer;
        if (accessgetnumpadentercp != null) {
            zabkVar.MediaDescriptionCompat.put(accessgetnumpadentercp, accessgetperiodcp);
        }
    }

    @Override // o.accessgetPairingcp
    public final boolean RemoteActionCompatParcelizer(zabk zabkVar) {
        return this.IconCompatParcelizer.read.serializer;
    }

    @Override // o.accessgetPairingcp
    public final int write(zabk zabkVar) {
        return this.IconCompatParcelizer.read.RemoteActionCompatParcelizer;
    }
}
