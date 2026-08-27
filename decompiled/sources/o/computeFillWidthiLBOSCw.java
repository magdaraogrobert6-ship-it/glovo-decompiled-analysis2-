package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class computeFillWidthiLBOSCw {
    public final accessgetPrecomposeMapp IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final accesscreatePrecomposedSlotHandle read;
    public final Boolean serializer;
    public final Integer write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.serializer, null, this.read, this.RemoteActionCompatParcelizer, this.write});
    }

    public /* synthetic */ computeFillWidthiLBOSCw(com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect) {
        this.IconCompatParcelizer = (accessgetPrecomposeMapp) dropShadowEffect.read;
        this.serializer = (Boolean) dropShadowEffect.RatingCompat;
        this.read = (accesscreatePrecomposedSlotHandle) dropShadowEffect.write;
        this.RemoteActionCompatParcelizer = (Integer) dropShadowEffect.serializer;
        this.write = (Integer) dropShadowEffect.MediaDescriptionCompat;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof computeFillWidthiLBOSCw)) {
            return false;
        }
        computeFillWidthiLBOSCw computefillwidthilboscw = (computeFillWidthiLBOSCw) obj;
        return TuplesKt.write(this.IconCompatParcelizer, computefillwidthilboscw.IconCompatParcelizer) && TuplesKt.write(this.serializer, computefillwidthilboscw.serializer) && TuplesKt.write((Object) null, (Object) null) && TuplesKt.write(this.read, computefillwidthilboscw.read) && TuplesKt.write(this.RemoteActionCompatParcelizer, computefillwidthilboscw.RemoteActionCompatParcelizer) && TuplesKt.write(this.write, computefillwidthilboscw.write);
    }
}
