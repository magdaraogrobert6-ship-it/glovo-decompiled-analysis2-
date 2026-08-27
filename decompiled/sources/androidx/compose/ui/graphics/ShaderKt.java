package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShaderKt {
    /* JADX INFO: renamed from: CompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m1056CompositeShader7EN7VTw(Shader shader, Shader shader2, int i) {
        return AndroidShader_androidKt.m619ActualCompositeShader7EN7VTw(shader, shader2, i);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m1057ImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        return AndroidShader_androidKt.m620ActualImageShaderF49vj9s(imageBitmap, i, i2);
    }

    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m1059LinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        return AndroidShader_androidKt.m621ActualLinearGradientShaderVjE6UOU(j, j2, list, list2, i);
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m1061RadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        return AndroidShader_androidKt.m622ActualRadialGradientShader8uybcMk(j, f, list, list2, i);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m1063SweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m623ActualSweepGradientShader9KIMszo(j, list, list2);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m1058ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = TileMode.Companion.m1120getClamp3opZhB0();
        }
        if ((i3 & 4) != 0) {
            i2 = TileMode.Companion.m1120getClamp3opZhB0();
        }
        return m1057ImageShaderF49vj9s(imageBitmap, i, i2);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m1064SweepGradientShader9KIMszo$default(long j, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m1063SweepGradientShader9KIMszo(j, list, list2);
    }

    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m1060LinearGradientShaderVjE6UOU$default(long j, long j2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m1120getClamp3opZhB0();
        }
        return m1059LinearGradientShaderVjE6UOU(j, j2, list, list3, i);
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m1062RadialGradientShader8uybcMk$default(long j, float f, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = TileMode.Companion.m1120getClamp3opZhB0();
        }
        return m1061RadialGradientShader8uybcMk(j, f, list, list3, i);
    }
}
