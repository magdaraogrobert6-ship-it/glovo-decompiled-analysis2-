package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getChildCount implements accessgetPositiveInfinitycp {
    public final FrameLayout IconCompatParcelizer;
    public final getDefaultJoinLxFBmk8 RemoteActionCompatParcelizer;
    public final ImageView read;
    public final FrameLayout serializer;
    public final z7ExternalSyntheticLambda0 write;

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        return this.IconCompatParcelizer;
    }

    public getChildCount(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8, z7ExternalSyntheticLambda0 z7externalsyntheticlambda0) {
        this.IconCompatParcelizer = frameLayout;
        this.serializer = frameLayout2;
        this.RemoteActionCompatParcelizer = getdefaultjoinlxfbmk8;
        this.read = imageView;
        this.write = z7externalsyntheticlambda0;
    }

    public final FrameLayout serializer() {
        return this.IconCompatParcelizer;
    }

    public static getChildCount write(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.customer_chat_activity, (ViewGroup) null, false);
        int i = com.logistics.rider.glovo.R.id.container_open_channel;
        FrameLayout frameLayout = (FrameLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.container_open_channel, viewInflate);
        if (frameLayout != null) {
            i = com.logistics.rider.glovo.R.id.error_state;
            View viewRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.error_state, viewInflate);
            if (viewRemoteActionCompatParcelizer != null) {
                getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8IconCompatParcelizer = getDefaultJoinLxFBmk8.IconCompatParcelizer(viewRemoteActionCompatParcelizer);
                i = com.logistics.rider.glovo.R.id.iv_back;
                ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.iv_back, viewInflate);
                if (imageView != null) {
                    i = com.logistics.rider.glovo.R.id.loading_state;
                    View viewRemoteActionCompatParcelizer2 = coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.loading_state, viewInflate);
                    if (viewRemoteActionCompatParcelizer2 != null) {
                        return new getChildCount((FrameLayout) viewInflate, frameLayout, imageView, getdefaultjoinlxfbmk8IconCompatParcelizer, new z7ExternalSyntheticLambda0((LinearLayout) viewRemoteActionCompatParcelizer2, 1));
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
