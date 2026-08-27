package o;

import androidx.cardview.widget.CardView$1;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.zabk;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetProfileSwitchcp extends accessgetPoundcp {
    public final accessgetNumPadEntercp IconCompatParcelizer;

    public accessgetProfileSwitchcp(accessgetNumPadEntercp accessgetnumpadentercp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super(4, parentDataModifierDefaultImpls);
        this.IconCompatParcelizer = accessgetnumpadentercp;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void serializer(CardView$1 cardView$1, boolean z) {
    }

    @Override // o.accessgetPoundcp
    public final void IconCompatParcelizer(zabk zabkVar) {
        accessgetPeriodcp accessgetperiodcp = (accessgetPeriodcp) zabkVar.MediaDescriptionCompat.remove(this.IconCompatParcelizer);
        if (accessgetperiodcp == null) {
            this.serializer.write(Boolean.FALSE);
            return;
        }
        ((accessgetNumPadEqualscp) accessgetperiodcp.serializer.IconCompatParcelizer).RemoteActionCompatParcelizer.serializer(zabkVar.RemoteActionCompatParcelizer, this.serializer);
        accessgetperiodcp.read.write.RemoteActionCompatParcelizer = null;
    }

    @Override // o.accessgetPairingcp
    public final boolean RemoteActionCompatParcelizer(zabk zabkVar) {
        accessgetPeriodcp accessgetperiodcp = (accessgetPeriodcp) zabkVar.MediaDescriptionCompat.get(this.IconCompatParcelizer);
        return accessgetperiodcp != null && accessgetperiodcp.read.serializer;
    }

    @Override // o.accessgetPairingcp
    public final Feature[] read(zabk zabkVar) {
        return null;
    }

    @Override // o.accessgetPairingcp
    public final int write(zabk zabkVar) {
        accessgetPeriodcp accessgetperiodcp = (accessgetPeriodcp) zabkVar.MediaDescriptionCompat.get(this.IconCompatParcelizer);
        if (accessgetperiodcp != null) {
            return accessgetperiodcp.read.RemoteActionCompatParcelizer;
        }
        return -1;
    }
}
