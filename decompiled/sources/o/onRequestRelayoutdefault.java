package o;

import bo.app.w4$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import io.grpc.Status;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes2.dex */
public final class onRequestRelayoutdefault extends MathKt {
    public final /* synthetic */ zp IconCompatParcelizer;
    public final /* synthetic */ JsonUtilsa[] read;
    public final /* synthetic */ calculateLocalPositionMKHz9U serializer;

    @Override // kotlin.math.MathKt
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.math.MathKt
    public final void read(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        try {
            zp zpVar = this.IconCompatParcelizer;
            ((resizeGraphicFrameIfAppropriatelambda0) zpVar.serializer).serializer(new w4$$ExternalSyntheticLambda0(zpVar, 18, r8lambdaqn1du6uas6agx4srbugfttxtpwa));
        } catch (Throwable th) {
            this.serializer.MediaMetadataCompat.write(th);
        }
    }

    @Override // kotlin.math.MathKt
    public final void serializer(Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        try {
            zp zpVar = this.IconCompatParcelizer;
            ((resizeGraphicFrameIfAppropriatelambda0) zpVar.serializer).serializer(new w4$$ExternalSyntheticLambda0(zpVar, 19, status));
        } catch (Throwable th) {
            this.serializer.MediaMetadataCompat.write(th);
        }
    }

    @Override // kotlin.math.MathKt
    public final void serializer(Object obj) {
        try {
            zp zpVar = this.IconCompatParcelizer;
            int i = zpVar.write + 1;
            ((resizeGraphicFrameIfAppropriatelambda0) zpVar.serializer).serializer(new renderUrlIntoViewlambda1(i, 8, zpVar, obj));
            zpVar.write = i;
            this.read[0].serializer(1);
        } catch (Throwable th) {
            this.serializer.MediaMetadataCompat.write(th);
        }
    }

    public onRequestRelayoutdefault(calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u, zp zpVar, JsonUtilsa[] jsonUtilsaArr) {
        this.serializer = calculatelocalpositionmkhz9u;
        this.IconCompatParcelizer = zpVar;
        this.read = jsonUtilsaArr;
    }
}
