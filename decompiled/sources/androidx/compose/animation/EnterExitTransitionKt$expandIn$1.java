package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.Lambda;
import o.animateToZero;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKt$expandIn$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final EnterExitTransitionKt$expandIn$1 IconCompatParcelizer;
    public static final EnterExitTransitionKt$expandIn$1 MediaBrowserCompatMediaItem;
    public static final EnterExitTransitionKt$expandIn$1 RemoteActionCompatParcelizer;
    public static final EnterExitTransitionKt$expandIn$1 read;
    public static final EnterExitTransitionKt$expandIn$1 serializer;
    public static final EnterExitTransitionKt$expandIn$1 write;
    public final /* synthetic */ int MediaMetadataCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnterExitTransitionKt$expandIn$1(int i, int i2) {
        super(i);
        this.MediaMetadataCompat = i2;
    }

    static {
        int i = 1;
        IconCompatParcelizer = new EnterExitTransitionKt$expandIn$1(i, i);
        write = new EnterExitTransitionKt$expandIn$1(i, 2);
        RemoteActionCompatParcelizer = new EnterExitTransitionKt$expandIn$1(i, 3);
        read = new EnterExitTransitionKt$expandIn$1(i, 4);
        serializer = new EnterExitTransitionKt$expandIn$1(i, 0);
        MediaBrowserCompatMediaItem = new EnterExitTransitionKt$expandIn$1(i, 5);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            ((IntSize) obj).m3848unboximpl();
            return IntSize.m3836boximpl(IntSize.m3839constructorimpl(0L));
        }
        if (i == 1) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        }
        if (i == 2) {
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            return bool2;
        }
        if (i == 3) {
            long jM1137unboximpl = ((TransformOrigin) obj).m1137unboximpl();
            return new animateToZero(TransformOrigin.m1133getPivotFractionXimpl(jM1137unboximpl), TransformOrigin.m1134getPivotFractionYimpl(jM1137unboximpl));
        }
        if (i != 4) {
            ((IntSize) obj).m3848unboximpl();
            return IntSize.m3836boximpl(IntSize.m3839constructorimpl(0L));
        }
        animateToZero animatetozero = (animateToZero) obj;
        return TransformOrigin.m1125boximpl(TransformOriginKt.TransformOrigin(animatetozero.RemoteActionCompatParcelizer, animatetozero.serializer));
    }
}
