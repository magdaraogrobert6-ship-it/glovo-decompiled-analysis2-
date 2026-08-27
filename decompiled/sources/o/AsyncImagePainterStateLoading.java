package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePainterStateLoading extends LinearLayout {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final getDefaultJoinLxFBmk8 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainterStateLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_journey, this);
        int i = com.logistics.rider.glovo.R.id.layout_journey_end_destination;
        invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1 invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit1 = (invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_end_destination, this);
        Object obj = null;
        if (invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit1 != null) {
            i = com.logistics.rider.glovo.R.id.layout_journey_start_destination;
            invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1 invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit2 = (invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_journey_start_destination, this);
            if (invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit2 != null) {
                this.serializer = new getDefaultJoinLxFBmk8(this, invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit1, invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit2, 7);
                setOrientation(1);
                int i2 = write + 33;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public static void RemoteActionCompatParcelizer(invokeSuspendcomroadrunnermapcontainerenabledpresentationMapNavigationWrapperattachWithDeferredInit1 invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit1, AsyncImagePainterlaunchJob1 asyncImagePainterlaunchJob1, boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = asyncImagePainterlaunchJob1.serializer;
        String str = asyncImagePainterlaunchJob1.IconCompatParcelizer;
        String str2 = asyncImagePainterlaunchJob1.write;
        boolean z2 = asyncImagePainterlaunchJob1.RatingCompat;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = asyncImagePainterlaunchJob1.read;
        boolean z3 = asyncImagePainterlaunchJob1.MediaBrowserCompatMediaItem;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = asyncImagePainterlaunchJob1.MediaSessionCompatQueueItem;
        boolean z4 = asyncImagePainterlaunchJob1.MediaMetadataCompat;
        String str3 = asyncImagePainterlaunchJob1.RemoteActionCompatParcelizer;
        str.getClass();
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = invokesuspendcomroadrunnermapcontainerenabledpresentationmapnavigationwrapperattachwithdeferredinit1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ImageView imageView = (ImageView) getdefaultcapkaphkgw.IconCompatParcelizer;
        TextView textView = (TextView) getdefaultcapkaphkgw.MediaMetadataCompat;
        imageView.setImageDrawable(coil3.util.IntPair.write(imageView.getContext(), i4));
        int i5 = 0;
        getdefaultcapkaphkgw.RemoteActionCompatParcelizer.setVisibility(!z ? 8 : 0);
        ((TextView) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem).setText(str);
        ((TextView) getdefaultcapkaphkgw.MediaDescriptionCompat).setText(str2);
        WindowCallbackWrapper windowCallbackWrapper = (WindowCallbackWrapper) getdefaultcapkaphkgw.write;
        if (z2) {
            int i6 = write + 43;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i6 % 2 != 0 ? 1 : 0;
        } else {
            i = 8;
        }
        windowCallbackWrapper.setVisibility(i);
        windowCallbackWrapper.setOnClickListener(new getMutablePendingIntentFlags(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        WindowCallbackWrapper windowCallbackWrapper2 = (WindowCallbackWrapper) getdefaultcapkaphkgw.read;
        if (z3) {
            i2 = 0;
        } else {
            int i7 = IconCompatParcelizer + 93;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = 8;
        }
        windowCallbackWrapper2.setVisibility(i2);
        windowCallbackWrapper2.setOnClickListener(new getMutablePendingIntentFlags(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1));
        if (!(!z4)) {
            int i9 = write + 119;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            i5 = 8;
        }
        textView.setVisibility(i5);
        textView.setText(str3);
    }
}
