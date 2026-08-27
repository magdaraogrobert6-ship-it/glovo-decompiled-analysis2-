package o;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettingsLoader$MetadataHolderService;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getCurrentContentInsetRight {
    public static final Object IconCompatParcelizer = new Object();
    public static final SparseArray write = new SparseArray();
    public final HandlerThread ComponentActivity;
    public getDividerPadding MediaDescriptionCompat;
    public final onDrawBehind MediaMetadataCompat;
    public androidx.transition.TransitionValuesMaps MediaSessionCompatQueueItem;
    public final Integer MediaSessionCompatToken;
    public final Handler ParcelableVolumeInfo;
    public final newChildScope PlaybackStateCompat;
    public getCurrentContentInsetStart PlaybackStateCompatCustomAction;
    public final getTitleMarginBottom RatingCompat;
    public androidx.camera.camera2.internal.Camera2CameraFactory RemoteActionCompatParcelizer;
    public androidx.camera.camera2.internal.Camera2DeviceSurfaceManager r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public accessgetGreencp r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Executor read;
    public final ImageCaptureException serializer;
    public final androidx.camera.core.impl.CameraRepository MediaBrowserCompatMediaItem = new androidx.camera.core.impl.CameraRepository();
    public final Object MediaSessionCompatResultReceiverWrapper = new Object();
    public DrawModifierNodeKt r8lambda54BeH8ZsBru0CXI2CCSP2syNys = EncoderImplMediaCodecCallback.IconCompatParcelizer;

    public static void IconCompatParcelizer() {
        SparseArray sparseArray = write;
        if (sparseArray.size() == 0) {
            setInflatedId.IconCompatParcelizer = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            setInflatedId.IconCompatParcelizer = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            setInflatedId.IconCompatParcelizer = 4;
        } else if (sparseArray.get(5) != null) {
            setInflatedId.IconCompatParcelizer = 5;
        } else if (sparseArray.get(6) != null) {
            setInflatedId.IconCompatParcelizer = 6;
        }
    }

    public static void RemoteActionCompatParcelizer(Integer num) {
        synchronized (IconCompatParcelizer) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = write;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                IconCompatParcelizer();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public getCurrentContentInsetRight(Context context, AnimatedContentKt animatedContentKt) {
        ComponentCallbacks2 componentCallbacks2;
        getSubtitleTextView getsubtitletextview;
        boolean z;
        onDrawBehind ondrawbehind;
        this.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.UNINITIALIZED;
        Context contextRemoteActionCompatParcelizer = compare.RemoteActionCompatParcelizer(context);
        while (true) {
            if (!(contextRemoteActionCompatParcelizer instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (contextRemoteActionCompatParcelizer instanceof Application) {
                    componentCallbacks2 = (Application) contextRemoteActionCompatParcelizer;
                    break;
                }
                contextRemoteActionCompatParcelizer = ((ContextWrapper) contextRemoteActionCompatParcelizer).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof getSubtitleTextView) {
            getsubtitletextview = (getSubtitleTextView) componentCallbacks2;
        } else {
            try {
                Context contextRemoteActionCompatParcelizer2 = compare.RemoteActionCompatParcelizer(context);
                Bundle bundle = contextRemoteActionCompatParcelizer2.getPackageManager().getServiceInfo(new ComponentName(contextRemoteActionCompatParcelizer2, (Class<?>) MetadataHolderService.class), 640).metaData;
                String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
                if (string == null) {
                    setInflatedId.serializer("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    getsubtitletextview = null;
                } else {
                    getsubtitletextview = (getSubtitleTextView) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                setInflatedId.read("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
        }
        if (getsubtitletextview == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            throw null;
        }
        getTitleMarginBottom cameraXConfig = getsubtitletextview.getCameraXConfig();
        this.RatingCompat = cameraXConfig;
        getRelatedFixedSize getrelatedfixedsizeSerializer = (getRelatedFixedSize) cameraXConfig.PlaybackStateCompatCustomAction.read(getTitleMarginBottom.MediaMetadataCompat, null);
        if (getrelatedfixedsizeSerializer != null) {
            getrelatedfixedsizeSerializer.toString();
            setInflatedId.IconCompatParcelizer(3, "CameraX");
        } else {
            try {
                Bundle bundle2 = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) QuirkSettingsLoader$MetadataHolderService.class), 640).metaData;
                if (bundle2 == null) {
                    setInflatedId.read("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                    getrelatedfixedsizeSerializer = null;
                } else {
                    getrelatedfixedsizeSerializer = getId.serializer(context, bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                setInflatedId.IconCompatParcelizer(3, "QuirkSettingsLoader");
            }
            Objects.toString(getrelatedfixedsizeSerializer);
            setInflatedId.IconCompatParcelizer(3, "CameraX");
        }
        if (getrelatedfixedsizeSerializer == null) {
            getrelatedfixedsizeSerializer = getValue.write;
            Objects.toString(getrelatedfixedsizeSerializer);
            setInflatedId.IconCompatParcelizer(3, "CameraX");
        }
        getValue.IconCompatParcelizer.RemoteActionCompatParcelizer.read(getrelatedfixedsizeSerializer);
        ((Integer) this.RatingCompat.PlaybackStateCompatCustomAction.read(getTitleMarginBottom.MediaDescriptionCompat, -1)).getClass();
        Executor getcontentinsetright = (Executor) this.RatingCompat.PlaybackStateCompatCustomAction.read(getTitleMarginBottom.write, null);
        Handler handler = (Handler) this.RatingCompat.PlaybackStateCompatCustomAction.read(getTitleMarginBottom.MediaSessionCompatToken, null);
        getcontentinsetright = getcontentinsetright == null ? new getContentInsetRight() : getcontentinsetright;
        this.read = getcontentinsetright;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.ComponentActivity = handlerThread;
            handlerThread.start();
            this.ParcelableVolumeInfo = Handler.createAsync(handlerThread.getLooper());
        } else {
            this.ComponentActivity = null;
            this.ParcelableVolumeInfo = handler;
        }
        Integer num = (Integer) this.RatingCompat.read(getTitleMarginBottom.MediaBrowserCompatMediaItem, null);
        this.MediaSessionCompatToken = num;
        synchronized (IconCompatParcelizer) {
            z = true;
            try {
                if (num != null) {
                    coil3.util.UtilsKt.serializer("minLogLevel", num.intValue(), 3, 6);
                    SparseArray sparseArray = write;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    IconCompatParcelizer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        newChildScope newchildscope = (newChildScope) this.RatingCompat.PlaybackStateCompatCustomAction.read(getTitleMarginBottom.IconCompatParcelizer, newChildScope.IconCompatParcelizer);
        Objects.requireNonNull(newchildscope);
        long jRemoteActionCompatParcelizer = newchildscope.RemoteActionCompatParcelizer();
        this.PlaybackStateCompat = newchildscope instanceof androidx.camera.core.impl.CameraProviderInitRetryPolicy ? ((androidx.camera.core.impl.CameraProviderInitRetryPolicy) newchildscope).read != 0 ? new androidx.camera.core.impl.CameraProviderInitRetryPolicy(jRemoteActionCompatParcelizer, 1) : new androidx.camera.core.impl.CameraProviderInitRetryPolicy(jRemoteActionCompatParcelizer, 0) : new SurfaceProcessingQuirk(jRemoteActionCompatParcelizer, newchildscope);
        this.serializer = new ImageCaptureException(getcontentinsetright);
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            if (this.PlaybackStateCompatCustomAction != getCurrentContentInsetStart.UNINITIALIZED) {
                z = false;
            }
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("CameraX.initInternal() should only be called once per instance", z);
            this.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.INITIALIZING;
            onDrawWithContent ondrawwithcontent = new onDrawWithContent();
            ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
            ondrawbehind = new onDrawBehind(ondrawwithcontent);
            ondrawwithcontent.read = ondrawbehind;
            ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                getcontentinsetright.execute(new CameraX$$ExternalSyntheticLambda0(this, context, getcontentinsetright, 1, ondrawwithcontent, SystemClock.elapsedRealtime()));
                ondrawwithcontent.RemoteActionCompatParcelizer = "CameraX initInternal";
            } catch (Exception e2) {
                ondrawbehind.write(e2);
            }
        }
        this.MediaMetadataCompat = ondrawbehind;
    }
}
