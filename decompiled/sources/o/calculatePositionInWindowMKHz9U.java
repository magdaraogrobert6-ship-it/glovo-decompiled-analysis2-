package o;

import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class calculatePositionInWindowMKHz9U extends r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU {
    public final /* synthetic */ calculateLocalPositionMKHz9U IconCompatParcelizer;
    public final /* synthetic */ JsonUtilsa[] RemoteActionCompatParcelizer;
    public final /* synthetic */ Task write;

    public calculatePositionInWindowMKHz9U(calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u, JsonUtilsa[] jsonUtilsaArr, Task task) {
        this.IconCompatParcelizer = calculatelocalpositionmkhz9u;
        this.RemoteActionCompatParcelizer = jsonUtilsaArr;
        this.write = task;
    }

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU
    public final JsonUtilsa RemoteActionCompatParcelizer() {
        JsonUtilsa[] jsonUtilsaArr = this.RemoteActionCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(jsonUtilsaArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
        return jsonUtilsaArr[0];
    }

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU, o.JsonUtilsa
    public final void read() {
        if (this.RemoteActionCompatParcelizer[0] != null) {
            super.read();
            return;
        }
        this.write.addOnSuccessListener(this.IconCompatParcelizer.MediaMetadataCompat.RemoteActionCompatParcelizer, new GooglePlayLocationUtils$$ExternalSyntheticLambda18(27));
    }
}
