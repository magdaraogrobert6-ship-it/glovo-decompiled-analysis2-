package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import o.TapGestureDetectorKtprocessTapGesture2;
import o.WindowInsetsAnimationCancelledException;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnimationModifierKt {
    public static final long read = IntSize.m3839constructorimpl(-9223372034707292160L);

    public static Modifier write(Modifier modifier, width widthVar, int i) {
        if ((i & 1) != 0) {
            IntSize.Companion companion = IntSize.Companion;
            Map map = WindowInsetsAnimationCancelledException.serializer;
            widthVar = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
        }
        return ClipKt.clipToBounds(modifier).then(new TapGestureDetectorKtprocessTapGesture2(widthVar, Alignment.Companion.getTopStart()));
    }

    public static Modifier read(Modifier.Companion companion, Alignment alignment) {
        IntSize.Companion companion2 = IntSize.Companion;
        Map map = WindowInsetsAnimationCancelledException.serializer;
        return ClipKt.clipToBounds(companion).then(new TapGestureDetectorKtprocessTapGesture2(DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32))), alignment));
    }
}
