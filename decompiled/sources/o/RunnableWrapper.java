package o;

import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableKt$zoomable$1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RunnableWrapper {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static androidx.compose.ui.Modifier serializer(androidx.compose.ui.Modifier modifier, ZoomState zoomState, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        FutureScheduler futureScheduler = FutureScheduler.ContentEdge;
        ZoomableKt$zoomable$1 zoomableKt$zoomable$1 = new ZoomableKt$zoomable$1(z, zoomState, null);
        modifier.getClass();
        zoomState.getClass();
        futureScheduler.getClass();
        androidx.compose.ui.Modifier modifierThen = modifier.then(new onPreExecute(zoomState, z, futureScheduler, r8lambdaunavo3sxub_pc9xroryotnrlvsm, zoomableKt$zoomable$1));
        int i2 = serializer + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return modifierThen;
    }
}
