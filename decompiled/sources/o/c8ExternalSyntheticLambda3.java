package o;

import com.roadrunner.login.presentation.router.RouterActivity;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class c8ExternalSyntheticLambda3 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterActivity serializer;

    public /* synthetic */ c8ExternalSyntheticLambda3(RouterActivity routerActivity, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = routerActivity;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        RouterActivity routerActivity = this.serializer;
        if (i3 == 0) {
            cdExternalSyntheticLambda0 cdexternalsyntheticlambda0 = (cdExternalSyntheticLambda0) obj;
            if (cdexternalsyntheticlambda0.IconCompatParcelizer != null) {
                coil3.util.UtilsKt.write(routerActivity, new DragAndDropTargetModifierNode(new MinimumInteractiveModifierNode(cdexternalsyntheticlambda0, 5, routerActivity), true, -142603134));
            }
            return createfromparcel2;
        }
        if (((Boolean) obj).booleanValue()) {
            ((subscribeToChangeUserEventslambda1) routerActivity.PlaybackStateCompat().write()).getClass();
        }
        int i4 = IconCompatParcelizer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
