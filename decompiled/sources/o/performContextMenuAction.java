package o;

import android.content.Context;
import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class performContextMenuAction implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ copywBHncE4default read;
    public final /* synthetic */ Context serializer;
    public final /* synthetic */ int write = 1;

    public /* synthetic */ performContextMenuAction(Context context, copywBHncE4default copywbhnce4default) {
        this.serializer = context;
        this.read = copywbhnce4default;
    }

    public /* synthetic */ performContextMenuAction(copywBHncE4default copywbhnce4default, Context context) {
        this.read = copywbhnce4default;
        this.serializer = context;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        copywBHncE4default copywbhnce4default = this.read;
        Context context = this.serializer;
        if (i3 != 0) {
            ((getPersonNamePrefix) obj).getClass();
            androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(context);
            fragmentActivityRemoteActionCompatParcelizer.getSupportFragmentManager().read("content_sharing_submitted_from_floating_button", fragmentActivityRemoteActionCompatParcelizer, new ArrivalProgressObserver$$ExternalSyntheticLambda0(copywbhnce4default, 13, fragmentActivityRemoteActionCompatParcelizer));
            return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(12, fragmentActivityRemoteActionCompatParcelizer);
        }
        getSendeUduSuo getsendeudusuo = (getSendeUduSuo) obj;
        getsendeudusuo.getClass();
        copywbhnce4default.IconCompatParcelizer(coil3.util.UtilsKt.RemoteActionCompatParcelizer(context), getsendeudusuo.serializer, getsendeudusuo.write);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
