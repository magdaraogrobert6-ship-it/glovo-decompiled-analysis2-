package o;

import android.annotation.SuppressLint;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaxNatrP5siKZO6RPLJ9mCXDCi3_0 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI write;

    @Override // o.deepcopyandroid_sdk_base_release
    @SuppressLint
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.SENSORS_START;
        r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI r8lambdapograuputyljt1dxzptbnt44swi = this.write;
        if (controlMessage == controlMessage2 && (obj instanceof BannerExternalSyntheticLambda0)) {
            r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI.serializer(r8lambdapograuputyljt1dxzptbnt44swi, (BannerExternalSyntheticLambda0) obj);
        } else if (controlMessage == ControlMessage.SENSORS_STOP && (obj instanceof getBannerId)) {
            r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI.RemoteActionCompatParcelizer(r8lambdapograuputyljt1dxzptbnt44swi, (getBannerId) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaxNatrP5siKZO6RPLJ9mCXDCi3_0(r8lambdaPOgRaUPUTYLJT1DxZPTbNt44SWI r8lambdapograuputyljt1dxzptbnt44swi, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "SensorStreamLauncher");
        this.write = r8lambdapograuputyljt1dxzptbnt44swi;
    }
}
