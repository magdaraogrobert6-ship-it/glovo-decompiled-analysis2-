package o;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class addMenuProvider implements getPersonMiddleInitial {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ addMenuProvider(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.write = obj2;
    }

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        Object obj3 = this.serializer;
        switch (i3) {
            case 0:
                ((getLifecycle) obj3).serializer((addOnConfigurationChangedListener) obj2);
                int i4 = IconCompatParcelizer + 41;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            case 1:
                ((androidx.compose.animation.core.Transition) obj3).read.remove((androidx.compose.animation.core.Transition) obj2);
                return;
            case 2:
                androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) obj3;
                transition.getClass();
                PaddingValuesa9UjIt4default paddingValuesa9UjIt4default = (PaddingValuesa9UjIt4default) ((onShowTranslationui) ((PaddingValuesModifier) obj2).serializer).getValue();
                if (paddingValuesa9UjIt4default != null) {
                    transition.RemoteActionCompatParcelizer.remove(paddingValuesa9UjIt4default.serializer);
                    return;
                }
                return;
            case 3:
                TooltipKt tooltipKt = (TooltipKt) obj3;
                View view = (View) obj2;
                int i5 = tooltipKt.read - 1;
                tooltipKt.read = i5;
                if (i5 == 0) {
                    int i6 = IconCompatParcelizer + 9;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    accessgetCancelcp.write(view, null);
                    FocusPropertiesNode.read(view, (WindowInsetsAnimationCompat$Callback) null);
                    view.removeOnAttachStateChangeListener(tooltipKt.MediaSessionCompatToken);
                    return;
                }
                return;
            case 4:
                ((supportsColorMatrixQuery) obj3).read((DeliveryAutoAcceptMessageUiModelImpl) obj2);
                return;
            case 5:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3).invoke((androidx.fragment.app.FragmentActivity) obj2);
                return;
            case 6:
                getQueryContext getquerycontext = (getQueryContext) obj3;
                getquerycontext.getClass();
                getquerycontext.write.RemoteActionCompatParcelizer((unregisterComponentCallback) obj2);
                return;
            default:
                ((accessisRenderNodeCompatiblecp) obj3).getLifecycle().read((SavedStateRegistryImpl$$ExternalSyntheticLambda0) obj2);
                return;
        }
    }
}
