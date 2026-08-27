package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import com.mapbox.navigation.ui.maps.camera.NavigationCamera;
import o.ColorMatrixKt;
import o.cancelPendingWebViewPause;
import o.getValues;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressDrawable$2 implements Animator.AnimatorListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public CircularProgressDrawable$2(getValues getvalues, ColorMatrixKt colorMatrixKt) {
        this.read = 0;
        this.write = getvalues;
        this.serializer = colorMatrixKt;
    }

    public /* synthetic */ CircularProgressDrawable$2(Object obj, int i, Object obj2) {
        this.read = i;
        this.serializer = obj;
        this.write = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj = this.serializer;
        if (i4 != 0) {
            if (i4 == 1) {
                animator.getClass();
                ((NavigationCamera.NavigationCameraTransitionListener) obj).isCanceled = true;
                return;
            }
            animator.getClass();
            ((cancelPendingWebViewPause) obj).IconCompatParcelizer = true;
            int i5 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        Object obj = this.write;
        Object obj2 = this.serializer;
        if (i3 != 0) {
            if (i3 != 1) {
                animator.getClass();
                if (!((cancelPendingWebViewPause) obj2).IconCompatParcelizer) {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj).invoke();
                    return;
                }
                return;
            }
            animator.getClass();
            ((NavigationCamera.NavigationCameraTransitionListener) obj2).onAnimationEnd((BlockRunner) obj);
            int i4 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        if (i4 == 0) {
            ((getValues) this.write).MediaSessionCompatQueueItem = 0.0f;
            return;
        }
        if (i4 != 1) {
            animator.getClass();
            return;
        }
        animator.getClass();
        NavigationCamera.NavigationCameraTransitionListener navigationCameraTransitionListener = (NavigationCamera.NavigationCameraTransitionListener) this.serializer;
        NavigationCamera navigationCamera = navigationCameraTransitionListener.this$0;
        navigationCamera.frameTransitionOptions = NavigationCamera.DEFAULT_FRAME_TRANSITION_OPT;
        navigationCamera.setState(navigationCameraTransitionListener.progressState);
        int i5 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = 2 % 2;
        int i2 = this.read;
        if (i2 != 0) {
            if (i2 != 1) {
                animator.getClass();
                return;
            } else {
                animator.getClass();
                return;
            }
        }
        getValues getvalues = (getValues) this.write;
        ColorMatrixKt colorMatrixKt = (ColorMatrixKt) this.serializer;
        getvalues.serializer(1.0f, colorMatrixKt, true);
        colorMatrixKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = colorMatrixKt.ResultReceiver;
        colorMatrixKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = colorMatrixKt.MediaSessionCompatToken;
        colorMatrixKt.ComponentActivity = colorMatrixKt.ParcelableVolumeInfo;
        colorMatrixKt.read((colorMatrixKt.MediaMetadataCompat + 1) % colorMatrixKt.MediaBrowserCompatMediaItem.length);
        if (!getvalues.IconCompatParcelizer) {
            getvalues.MediaSessionCompatQueueItem += 1.0f;
        } else {
            int i3 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            getvalues.IconCompatParcelizer = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (colorMatrixKt.PlaybackStateCompat) {
                colorMatrixKt.PlaybackStateCompat = false;
            }
        }
        int i5 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
