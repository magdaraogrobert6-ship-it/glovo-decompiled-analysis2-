package o;

import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class timeskPz2Gy4 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public androidx.compose.animation.core.Animatable write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return CameraOverlayV2ContentKt.access$startOpacityAnimation(null, this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        CameraOverlayV2ContentKt.access$startOpacityAnimation(null, this);
        obj2.hashCode();
        throw null;
    }

    public timeskPz2Gy4(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
