package o;

import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getMicrophoneMuteEK5gGoQ implements accessgetNumPadRightParenthesiscp {
    public final /* synthetic */ scale0AR0LA0default IconCompatParcelizer;
    public final /* synthetic */ DeviceOrientationRequest RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getMicrophoneMuteEK5gGoQ(scale0AR0LA0default scale0ar0la0default, DeviceOrientationRequest deviceOrientationRequest, int i) {
        this.read = i;
        this.IconCompatParcelizer = scale0ar0la0default;
        this.RemoteActionCompatParcelizer = deviceOrientationRequest;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public final /* synthetic */ void serializer(Object obj, Object obj2) {
        int i = this.read;
        DeviceOrientationRequest deviceOrientationRequest = this.RemoteActionCompatParcelizer;
        scale0AR0LA0default scale0ar0la0default = this.IconCompatParcelizer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        zzdz zzdzVar = (zzdz) obj;
        if (i != 0) {
            zzdzVar.IconCompatParcelizer(scale0ar0la0default, deviceOrientationRequest, parentDataModifierDefaultImpls);
        } else {
            zzdzVar.IconCompatParcelizer(scale0ar0la0default, deviceOrientationRequest, parentDataModifierDefaultImpls);
        }
    }
}
