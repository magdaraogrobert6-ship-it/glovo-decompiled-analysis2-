package androidx.compose.ui.text;

import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import kotlin.ranges.RangesKt;
import o.AutofillApi27Helper;
import o.cancelPendingWebViewPauselambda0;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.isText;
import o.onViewAttachedToWindow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MultiParagraph$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(long j, float[] fArr, createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0) {
        this.$r8$classId = 0;
        this.f$0 = j;
        this.f$1 = fArr;
        this.f$2 = createbrazeuserchangeeventsubscriberlambda01;
        this.f$3 = cancelpendingwebviewpauselambda0;
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(Float f, long j, onViewAttachedToWindow onviewattachedtowindow, onViewAttachedToWindow onviewattachedtowindow2) {
        this.$r8$classId = 3;
        this.f$1 = f;
        this.f$0 = j;
        this.f$2 = onviewattachedtowindow;
        this.f$3 = onviewattachedtowindow2;
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = j;
        this.f$3 = obj3;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.$r8$classId;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        if (i3 == 0) {
            return MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$0(this.f$0, (float[]) obj4, (createBrazeUserChangeEventSubscriberlambda01) obj3, (cancelPendingWebViewPauselambda0) obj2, (ParagraphInfo) obj);
        }
        if (i3 == 1) {
            Rect rect = (Rect) obj4;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) obj3;
            long j = this.f$0;
            ColorFilter colorFilter = (ColorFilter) obj2;
            ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
            contentDrawScope.drawContent();
            float left = rect.getLeft();
            float top = rect.getTop();
            contentDrawScope.getDrawContext().getTransform().translate(left, top);
            try {
                DrawScope.m1287drawImageAZ2fEMs$default(contentDrawScope, (ImageBitmap) createinappmessageeventsubscriber.IconCompatParcelizer, 0L, j, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
                return createfromparcel2;
            } finally {
                contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            }
        }
        if (i3 == 2) {
            long j2 = this.f$0;
            Path path = (Path) obj2;
            DrawScope drawScope = (DrawScope) obj;
            float fIconCompatParcelizer = ((isText) obj4).IconCompatParcelizer();
            float fMax = (Math.max(Math.min(1.0f, fIconCompatParcelizer) - 0.4f, 0.0f) * 5.0f) / 3.0f;
            float fWrite = RangesKt.write(Math.abs(fIconCompatParcelizer) - 1.0f, 0.0f, 2.0f);
            float fPow = (((0.4f * fMax) - 0.25f) + (fWrite - (((float) Math.pow(fWrite, 2.0d)) / 4.0f))) * 0.5f;
            float f = fPow * 360.0f;
            float f2 = ((0.8f * fMax) + fPow) * 360.0f;
            float fMin = Math.min(1.0f, fMax);
            AutofillApi27Helper autofillApi27Helper = new AutofillApi27Helper(0);
            autofillApi27Helper.RemoteActionCompatParcelizer = f2;
            autofillApi27Helper.serializer = fMin;
            float fFloatValue = ((Number) ((onViewAttachedToWindow) obj3).getValue()).floatValue();
            long jMo1303getCenterF1C5BW0 = drawScope.mo1303getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo1231rotateUv8p0NA(fPow, jMo1303getCenterF1C5BW0);
                float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(PullToRefreshKt.serializer);
                float f3 = PullToRefreshKt.MediaBrowserCompatMediaItem;
                Rect rectM516Rect3MmeM6k = RectKt.m516Rect3MmeM6k(SizeKt.m556getCenteruvyYCjk(drawScope.mo1304getSizeNHjbRc()), (drawScope.mo48toPx0680j_4(f3) / 2.0f) + fMo48toPx0680j_4);
                DrawScope.m1283drawArcyD3GUKo$default(drawScope, j2, f, f2 - f, false, rectM516Rect3MmeM6k.m512getTopLeftF1C5BW0(), rectM516Rect3MmeM6k.m510getSizeNHjbRc(), fFloatValue, new Stroke(drawScope.mo48toPx0680j_4(f3), 0.0f, StrokeCap.Companion.m1099getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
                PullToRefreshKt.m137drawArrowuDrxG_w(drawScope, path, rectM516Rect3MmeM6k, j2, fFloatValue, autofillApi27Helper, f3);
                return createfromparcel2;
            } finally {
                c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
            }
        }
        Float f4 = (Float) obj4;
        final onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) obj3;
        final onViewAttachedToWindow onviewattachedtowindow2 = (onViewAttachedToWindow) obj2;
        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
        cacheDrawScope.getClass();
        final float fMo48toPx0680j_5 = cacheDrawScope.mo48toPx0680j_4(Dimensions.setHasNonEmbeddedTabs);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() >> 32)) * 0.8f;
        final long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() >> 32)) - fIntBitsToFloat2) / 2.0f;
        if (f4 != null) {
            fIntBitsToFloat = cacheDrawScope.mo48toPx0680j_4(Dimensions.setLogo) + f4.floatValue();
        } else {
            fIntBitsToFloat = (Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() & 4294967295L)) - fIntBitsToFloat2) * 0.65f;
        }
        final long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
        Path.Companion companion = Path.Companion;
        int iM1031getDifferenceb3I0S0c = PathOperation.Companion.m1031getDifferenceb3I0S0c();
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect$default(Path, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() & 4294967295L))), null, 2, null);
        Path Path2 = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path2, RoundRectKt.m532RoundRectsniSvfs(RectKt.m517Recttz77jQw(jM469constructorimpl, jM537constructorimpl), CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_5)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_5)) << 32))), null, 2, null);
        final Path pathM1010combinexh6zSI8 = companion.m1010combinexh6zSI8(iM1031getDifferenceb3I0S0c, Path, Path2);
        final long j3 = this.f$0;
        DrawResult drawResultOnDrawBehind = cacheDrawScope.onDrawBehind(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.DpKt
            private static int MediaDescriptionCompat = 0;
            private static int RatingCompat = 1;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj5) {
                int i4 = 2 % 2;
                androidx.compose.ui.graphics.drawscope.DrawScope drawScope2 = (androidx.compose.ui.graphics.drawscope.DrawScope) obj5;
                drawScope2.getClass();
                androidx.compose.ui.graphics.drawscope.DrawScope.m1294drawPathLG529CI$default(drawScope2, pathM1010combinexh6zSI8, j3, 0.0f, null, null, 0, 60, null);
                long jM732unboximpl = ((androidx.compose.ui.graphics.Color) onviewattachedtowindow.getValue()).m732unboximpl();
                float f5 = fMo48toPx0680j_5;
                androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope2, jM732unboximpl, jM469constructorimpl, jM537constructorimpl, androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L)), new androidx.compose.ui.graphics.drawscope.Stroke(drawScope2.mo48toPx0680j_4(((androidx.compose.ui.unit.Dp) onviewattachedtowindow2.getValue()).m3687unboximpl()), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                int i5 = RatingCompat + 17;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 53 / 0;
                }
                return createfromparcel3;
            }
        });
        int i4 = serializer + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return drawResultOnDrawBehind;
        }
        throw null;
    }
}
