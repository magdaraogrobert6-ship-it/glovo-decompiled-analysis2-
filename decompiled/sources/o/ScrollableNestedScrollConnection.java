package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNestedScrollConnection extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ onViewAttachedToWindow IconCompatParcelizer;
    public final /* synthetic */ onViewAttachedToWindow serializer;
    public final /* synthetic */ onViewAttachedToWindow write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection(PaddingValuesa9UjIt4default paddingValuesa9UjIt4default, PaddingValuesa9UjIt4default paddingValuesa9UjIt4default2, PaddingValuesa9UjIt4default paddingValuesa9UjIt4default3) {
        super(1);
        this.serializer = paddingValuesa9UjIt4default;
        this.write = paddingValuesa9UjIt4default2;
        this.IconCompatParcelizer = paddingValuesa9UjIt4default3;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
        onViewAttachedToWindow onviewattachedtowindow = this.serializer;
        graphicsLayerScope.setAlpha(onviewattachedtowindow != null ? ((Number) onviewattachedtowindow.getValue()).floatValue() : 1.0f);
        onViewAttachedToWindow onviewattachedtowindow2 = this.write;
        graphicsLayerScope.setScaleX(onviewattachedtowindow2 != null ? ((Number) onviewattachedtowindow2.getValue()).floatValue() : 1.0f);
        graphicsLayerScope.setScaleY(onviewattachedtowindow2 != null ? ((Number) onviewattachedtowindow2.getValue()).floatValue() : 1.0f);
        onViewAttachedToWindow onviewattachedtowindow3 = this.IconCompatParcelizer;
        graphicsLayerScope.mo926setTransformOrigin__ExYCQ(onviewattachedtowindow3 != null ? ((androidx.compose.ui.graphics.TransformOrigin) onviewattachedtowindow3.getValue()).m1137unboximpl() : androidx.compose.ui.graphics.TransformOrigin.Companion.m1138getCenterSzJe1aQ());
        return createFromParcel.INSTANCE;
    }
}
