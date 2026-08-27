package androidx.compose.ui.text.font;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.tryMinWidthJN0ABg;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PlatformFontVariationSettings_androidKt$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Density f$0;

    public /* synthetic */ PlatformFontVariationSettings_androidKt$$ExternalSyntheticLambda0(Density density, int i) {
        this.$r8$classId = i;
        this.f$0 = density;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 81;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        Density density = this.f$0;
        if (i3 == 0) {
            CharSequence androidString$lambda$0 = PlatformFontVariationSettings_androidKt.toAndroidString$lambda$0(density, (FontVariation.Setting) obj);
            int i4 = IconCompatParcelizer + 25;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidString$lambda$0;
        }
        tryMinWidthJN0ABg tryminwidthjn0abg = (tryMinWidthJN0ABg) obj;
        tryminwidthjn0abg.getClass();
        tryminwidthjn0abg.write = 160;
        tryminwidthjn0abg.read(0, IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(0L)));
        tryminwidthjn0abg.read(Math.round(tryminwidthjn0abg.write * 0.5f), IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) density.mo42roundToPx0680j_4(Dimensions.getNestedScrollAxes)) << 32)));
        tryminwidthjn0abg.read(Math.round(tryminwidthjn0abg.write * 1.0f), IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(0L)));
        return createFromParcel.INSTANCE;
    }
}
