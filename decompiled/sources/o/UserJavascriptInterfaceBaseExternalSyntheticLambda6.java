package o;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class UserJavascriptInterfaceBaseExternalSyntheticLambda6 extends r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU {
    public final /* synthetic */ setCustomUserAttributeArray IconCompatParcelizer;
    public final JsonUtilsa serializer;

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU
    public final JsonUtilsa RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU, o.JsonUtilsa
    public final void read(MathKt mathKt, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.write(this.IconCompatParcelizer.serializer);
        super.read(mathKt, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
    }

    public UserJavascriptInterfaceBaseExternalSyntheticLambda6(setCustomUserAttributeArray setcustomuserattributearray, JsonUtilsa jsonUtilsa) {
        this.IconCompatParcelizer = setcustomuserattributearray;
        this.serializer = jsonUtilsa;
    }
}
