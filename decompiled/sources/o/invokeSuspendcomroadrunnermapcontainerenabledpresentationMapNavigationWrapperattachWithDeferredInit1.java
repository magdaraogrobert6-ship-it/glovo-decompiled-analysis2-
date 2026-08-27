package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1 extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private static int ResultReceiver = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getDefaultCapKaPHkGw r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:24:0x0094 A[PHI: r0
  0x0094: PHI (r0v5 int) = (r0v4 int), (r0v8 int) binds: [B:9:0x0038, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    public invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_journey_destination, this);
        int i = com.logistics.rider.glovo.R.id.layout_journey_destination_address;
        TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_address, this);
        Object obj = null;
        if (textView != null) {
            i = com.logistics.rider.glovo.R.id.layout_journey_destination_complement;
            TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_complement, this);
            if (textView2 != null) {
                int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 3;
                ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = com.logistics.rider.glovo.R.id.layout_journey_destination_divider;
                if (i3 == 0) {
                    coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_divider, this);
                    obj.hashCode();
                    throw null;
                }
                View viewRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_divider, this);
                if (viewRemoteActionCompatParcelizer != null) {
                    i = com.logistics.rider.glovo.R.id.layout_journey_destination_icon;
                    ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_icon, this);
                    if (imageView != null) {
                        int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 13;
                        ResultReceiver = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        i4 = com.logistics.rider.glovo.R.id.layout_journey_destination_map;
                        if (i6 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        WindowCallbackWrapper windowCallbackWrapper = (WindowCallbackWrapper) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_map, this);
                        if (windowCallbackWrapper != null) {
                            i = com.logistics.rider.glovo.R.id.layout_journey_destination_name;
                            TextView textView3 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_name, this);
                            if (textView3 != null) {
                                i = com.logistics.rider.glovo.R.id.layout_journey_destination_phone;
                                WindowCallbackWrapper windowCallbackWrapper2 = (WindowCallbackWrapper) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_destination_phone, this);
                                if (windowCallbackWrapper2 != null) {
                                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getDefaultCapKaPHkGw(this, textView, textView2, viewRemoteActionCompatParcelizer, imageView, windowCallbackWrapper, textView3, windowCallbackWrapper2);
                                    int i7 = ResultReceiver + 75;
                                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i8 = i7 % 2;
                                    return;
                                }
                            }
                        } else {
                            i = i4;
                        }
                    }
                } else {
                    i = i4;
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
