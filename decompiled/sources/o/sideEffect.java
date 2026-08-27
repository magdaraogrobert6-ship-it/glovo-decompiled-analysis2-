package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sideEffect implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.material3.SheetState IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ sideEffect(androidx.compose.material3.SheetState sheetState, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = sheetState;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.compose.material3.SheetState sheetState = this.IconCompatParcelizer;
        androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
        float fIntBitsToFloat = 1.0f;
        if (i != 0) {
            float fSerializer = sheetState.IconCompatParcelizer.serializer();
            float f = sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().read();
            float f2 = fSerializer < f ? f - fSerializer : 0.0f;
            if (f2 > 0.0f) {
                fIntBitsToFloat = (Float.intBitsToFloat((int) (graphicsLayerScope.mo919getSizeNHjbRc() & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.mo919getSizeNHjbRc()));
            }
            graphicsLayerScope.setScaleY(fIntBitsToFloat);
            graphicsLayerScope.mo926setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.5f, 0.0f));
            return createfromparcel;
        }
        float fSerializer2 = sheetState.IconCompatParcelizer.serializer();
        float f3 = sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().read();
        float f4 = fSerializer2 < f3 ? f3 - fSerializer2 : 0.0f;
        if (f4 > 0.0f) {
            fIntBitsToFloat = 1.0f / ((Float.intBitsToFloat((int) (graphicsLayerScope.mo919getSizeNHjbRc() & 4294967295L)) + f4) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.mo919getSizeNHjbRc())));
        }
        graphicsLayerScope.setScaleY(fIntBitsToFloat);
        graphicsLayerScope.mo926setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return createfromparcel;
    }
}
