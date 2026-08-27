package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isDocked implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ isDocked(int i, Object obj) {
        this.write = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.serializer;
        if (i == 0) {
            androidx.compose.material3.ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = (androidx.compose.material3.ModalBottomSheetDialogWrapper) obj2;
            modalBottomSheetDialogWrapper.show();
            return new isCameraAvailable(modalBottomSheetDialogWrapper);
        }
        if (i == 1) {
            androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
            float fFloatValue = ((Number) ((androidx.compose.animation.core.Animatable) obj2).write()).floatValue();
            float fIconCompatParcelizer = androidx.compose.material3.ModalBottomSheetKt.IconCompatParcelizer(graphicsLayerScope, fFloatValue);
            float fRemoteActionCompatParcelizer = androidx.compose.material3.ModalBottomSheetKt.RemoteActionCompatParcelizer(graphicsLayerScope, fFloatValue);
            graphicsLayerScope.setScaleY(fRemoteActionCompatParcelizer == 0.0f ? 1.0f : fIconCompatParcelizer / fRemoteActionCompatParcelizer);
            graphicsLayerScope.mo926setTransformOrigin__ExYCQ(androidx.compose.material3.ModalBottomSheetKt.RemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i != 2) {
            ((PopulateViewStructure_androidKtpopulate7) obj2).setValue((androidx.compose.ui.layout.LayoutCoordinates) obj);
            return createfromparcel;
        }
        Object obj3 = ((getCoarsefpxItnM) obj).read;
        return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, (setRootAutofillId) obj2}, getCieXyz.write())).booleanValue());
    }
}
