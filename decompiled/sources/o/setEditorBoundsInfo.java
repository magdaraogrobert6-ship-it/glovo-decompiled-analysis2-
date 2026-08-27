package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setEditorBoundsInfo implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ androidx.compose.animation.core.Animatable serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ setEditorBoundsInfo(androidx.compose.animation.core.Animatable animatable, int i) {
        this.write = i;
        this.serializer = animatable;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.compose.animation.core.Animatable animatable = this.serializer;
        androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
        if (i4 == 0) {
            graphicsLayerScope.getClass();
            graphicsLayerScope.setAlpha(((Number) animatable.write()).floatValue());
            return createfromparcel;
        }
        if (i4 == 1) {
            graphicsLayerScope.getClass();
            graphicsLayerScope.setAlpha(((Number) animatable.write()).floatValue());
            return createfromparcel;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                graphicsLayerScope.getClass();
                graphicsLayerScope.setAlpha(((Number) animatable.write()).floatValue());
                return createfromparcel;
            }
            graphicsLayerScope.getClass();
            graphicsLayerScope.setAlpha(((Number) animatable.write()).floatValue());
            return createfromparcel;
        }
        graphicsLayerScope.getClass();
        graphicsLayerScope.setScaleX(((Number) animatable.write()).floatValue());
        graphicsLayerScope.setScaleY(((Number) animatable.write()).floatValue());
        int i5 = read + 87;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
