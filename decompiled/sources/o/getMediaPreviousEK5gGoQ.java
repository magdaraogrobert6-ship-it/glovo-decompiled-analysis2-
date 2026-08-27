package o;

import com.google.android.gms.internal.location.zzdz;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaPreviousEK5gGoQ implements getNavigateInEK5gGoQ, accessgetNumPadRightParenthesiscp {
    public scale0AR0LA0default RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    @Override // o.getNavigateInEK5gGoQ
    public void IconCompatParcelizer() {
    }

    @Override // o.getNavigateInEK5gGoQ
    public void serializer(scale0AR0LA0default scale0ar0la0default) {
        synchronized (this) {
            scale0AR0LA0default scale0ar0la0default2 = this.RemoteActionCompatParcelizer;
            if (scale0ar0la0default2 != scale0ar0la0default) {
                scale0ar0la0default2.RemoteActionCompatParcelizer = null;
                this.RemoteActionCompatParcelizer = scale0ar0la0default;
            }
        }
    }

    @Override // o.getNavigateInEK5gGoQ
    public scale0AR0LA0default write() {
        scale0AR0LA0default scale0ar0la0default;
        synchronized (this) {
            scale0ar0la0default = this.RemoteActionCompatParcelizer;
        }
        return scale0ar0la0default;
    }

    public /* synthetic */ getMediaPreviousEK5gGoQ(scale0AR0LA0default scale0ar0la0default, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = scale0ar0la0default;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        zzdz zzdzVar = (zzdz) obj;
        if (this.serializer != 1) {
            accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            if (accessgetnumpadentercp != null) {
                zzdzVar.RemoteActionCompatParcelizer(accessgetnumpadentercp, parentDataModifierDefaultImpls);
                return;
            }
            return;
        }
        accessgetNumPadEntercp accessgetnumpadentercp2 = (accessgetNumPadEntercp) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (accessgetnumpadentercp2 != null) {
            zzdzVar.RemoteActionCompatParcelizer(accessgetnumpadentercp2, parentDataModifierDefaultImpls);
        }
    }
}
