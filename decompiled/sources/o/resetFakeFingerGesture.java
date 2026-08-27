package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class resetFakeFingerGesture {
    public final MatrixPositionCalculator IconCompatParcelizer;
    public final emptyCancelMotionEventScopedefault RemoteActionCompatParcelizer;
    public final Boolean read;
    public final accesssetStatep serializer;
    public final MatrixPositionCalculator write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, null, this.read, null, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write});
    }

    public /* synthetic */ resetFakeFingerGesture(com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect) {
        this.serializer = (accesssetStatep) dropShadowEffect.read;
        this.read = (Boolean) dropShadowEffect.RatingCompat;
        this.RemoteActionCompatParcelizer = (emptyCancelMotionEventScopedefault) dropShadowEffect.write;
        this.IconCompatParcelizer = (MatrixPositionCalculator) dropShadowEffect.serializer;
        this.write = (MatrixPositionCalculator) dropShadowEffect.MediaDescriptionCompat;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof resetFakeFingerGesture)) {
            return false;
        }
        resetFakeFingerGesture resetfakefingergesture = (resetFakeFingerGesture) obj;
        return TuplesKt.write(this.serializer, resetfakefingergesture.serializer) && TuplesKt.write((Object) null, (Object) null) && TuplesKt.write(this.read, resetfakefingergesture.read) && TuplesKt.write((Object) null, (Object) null) && TuplesKt.write(this.RemoteActionCompatParcelizer, resetfakefingergesture.RemoteActionCompatParcelizer) && TuplesKt.write(this.IconCompatParcelizer, resetfakefingergesture.IconCompatParcelizer) && TuplesKt.write(this.write, resetfakefingergesture.write);
    }
}
