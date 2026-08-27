package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.ShadowContext;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private ContentDrawScope contentDrawScope;
    private DrawResult drawResult;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 graphicsContextProvider;

    public final BuildDrawCacheParams getCacheParams$ui() {
        return this.cacheParams;
    }

    public final ContentDrawScope getContentDrawScope$ui() {
        return this.contentDrawScope;
    }

    public final DrawResult getDrawResult$ui() {
        return this.drawResult;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getGraphicsContextProvider$ui() {
        return this.graphicsContextProvider;
    }

    public final void setCacheParams$ui(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setContentDrawScope$ui(ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final void setDrawResult$ui(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void setGraphicsContextProvider$ui(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.graphicsContextProvider = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m254getSizeNHjbRc() {
        return this.cacheParams.mo251getSizeNHjbRc();
    }

    public final GraphicsLayer obtainGraphicsLayer() {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.graphicsContextProvider;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        return ((GraphicsContext) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).createGraphicsLayer();
    }

    public final ShadowContext obtainShadowContext() {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.graphicsContextProvider;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        return ((GraphicsContext) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).getShadowContext();
    }

    public final DrawResult onDrawBehind(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return onDrawWithContent(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draw.CacheDrawScope.onDrawBehind.1
            public final void invoke(ContentDrawScope contentDrawScope) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(contentDrawScope);
                contentDrawScope.drawContent();
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final DrawResult onDrawWithContent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawResult drawResult = new DrawResult(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        this.drawResult = drawResult;
        return drawResult;
    }

    /* JADX INFO: renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m255recordTdoYBX4(GraphicsLayer graphicsLayer, final Density density, final LayoutDirection layoutDirection, long j, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        final ContentDrawScope contentDrawScope = this.contentDrawScope;
        contentDrawScope.getClass();
        final Density density2 = contentDrawScope.getDrawContext().getDensity();
        final LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        contentDrawScope.mo1305recordJVtK1S4(graphicsLayer, j, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(DrawScope drawScope) {
                DrawContext drawContext = drawScope.getDrawContext();
                Density density3 = density;
                LayoutDirection layoutDirection3 = layoutDirection;
                drawContext.setDensity(density3);
                drawContext.setLayoutDirection(layoutDirection3);
                try {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(contentDrawScope);
                } finally {
                    DrawContext drawContext2 = drawScope.getDrawContext();
                    Density density4 = density2;
                    LayoutDirection layoutDirection4 = layoutDirection2;
                    drawContext2.setDensity(density4);
                    drawContext2.setLayoutDirection(layoutDirection4);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m253recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        Density density2 = (i & 1) != 0 ? cacheDrawScope : density;
        if ((i & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        LayoutDirection layoutDirection2 = layoutDirection;
        if ((i & 4) != 0) {
            j = IntSizeKt.m3855toIntSizeuvyYCjk(cacheDrawScope.m254getSizeNHjbRc());
        }
        cacheDrawScope.m255recordTdoYBX4(graphicsLayer, density2, layoutDirection2, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
