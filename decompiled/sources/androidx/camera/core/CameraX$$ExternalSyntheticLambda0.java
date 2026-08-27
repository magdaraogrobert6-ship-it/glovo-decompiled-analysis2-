package androidx.camera.core;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.camera2.Camera2Config$$ExternalSyntheticLambda1;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import androidx.transition.TransitionValuesMaps;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o.CryptoObjectUtils;
import o.ImageCapture1;
import o.Nexus4AndroidLTargetAspectRatioQuirk;
import o.accessgetGreencp;
import o.compare;
import o.getContentInsetRight;
import o.getCurrentContentInsetRight;
import o.getCurrentContentInsetStart;
import o.getDividerPadding;
import o.getLogoDescription;
import o.nativeConvertAndroid420ToBitmap;
import o.nativeShiftPixel;
import o.onDrawWithContent;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.setInflatedId;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Context IconCompatParcelizer;
    public final /* synthetic */ onDrawWithContent MediaDescriptionCompat;
    public final /* synthetic */ long MediaSessionCompatQueueItem;
    public final /* synthetic */ Executor RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ getCurrentContentInsetRight write;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda0(getCurrentContentInsetRight getcurrentcontentinsetright, Context context, Executor executor, int i, onDrawWithContent ondrawwithcontent, long j) {
        this.write = getcurrentcontentinsetright;
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = executor;
        this.serializer = i;
        this.MediaDescriptionCompat = ondrawwithcontent;
        this.MediaSessionCompatQueueItem = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.read != 0) {
            getCurrentContentInsetRight getcurrentcontentinsetright = this.write;
            Executor executor = this.RemoteActionCompatParcelizer;
            executor.execute(new CameraX$$ExternalSyntheticLambda0(getcurrentcontentinsetright, this.IconCompatParcelizer, executor, this.serializer + 1, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem));
            return;
        }
        getCurrentContentInsetRight getcurrentcontentinsetright2 = this.write;
        Context context = this.IconCompatParcelizer;
        Executor executor2 = this.RemoteActionCompatParcelizer;
        int i = this.serializer;
        onDrawWithContent ondrawwithcontent = this.MediaDescriptionCompat;
        long j = this.MediaSessionCompatQueueItem;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:initAndRetryRecursively");
        Context contextRemoteActionCompatParcelizer = compare.RemoteActionCompatParcelizer(context);
        try {
            try {
                if (getcurrentcontentinsetright2.RatingCompat.IconCompatParcelizer() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = new Nexus4AndroidLTargetAspectRatioQuirk(getcurrentcontentinsetright2.read, getcurrentcontentinsetright2.ParcelableVolumeInfo);
                getLogoDescription getlogodescriptionWrite = getcurrentcontentinsetright2.RatingCompat.write();
                long jRemoteActionCompatParcelizer = getcurrentcontentinsetright2.RatingCompat.RemoteActionCompatParcelizer();
                if (getcurrentcontentinsetright2.RatingCompat.MediaSessionCompatQueueItem() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                getDividerPadding getdividerpadding = new getDividerPadding(contextRemoteActionCompatParcelizer);
                getcurrentcontentinsetright2.MediaDescriptionCompat = getdividerpadding;
                accessgetGreencp accessgetgreencp = new accessgetGreencp(getdividerpadding);
                getcurrentcontentinsetright2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetgreencp;
                getcurrentcontentinsetright2.RemoteActionCompatParcelizer = new Camera2CameraFactory(contextRemoteActionCompatParcelizer, nexus4AndroidLTargetAspectRatioQuirk, getlogodescriptionWrite, jRemoteActionCompatParcelizer, getcurrentcontentinsetright2.RatingCompat, accessgetgreencp);
                if (getcurrentcontentinsetright2.RatingCompat.serializer() == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright2.RemoteActionCompatParcelizer;
                Camera2DeviceSurfaceManager camera2DeviceSurfaceManagerIconCompatParcelizer = Camera2Config$$ExternalSyntheticLambda1.IconCompatParcelizer(contextRemoteActionCompatParcelizer, camera2CameraFactory.read, camera2CameraFactory.IconCompatParcelizer());
                getcurrentcontentinsetright2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = camera2DeviceSurfaceManagerIconCompatParcelizer;
                getcurrentcontentinsetright2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write = camera2DeviceSurfaceManagerIconCompatParcelizer;
                if (executor2 instanceof getContentInsetRight) {
                    ((getContentInsetRight) executor2).serializer(getcurrentcontentinsetright2.RemoteActionCompatParcelizer);
                }
                getcurrentcontentinsetright2.MediaBrowserCompatMediaItem.serializer(getcurrentcontentinsetright2.RemoteActionCompatParcelizer);
                Camera2CameraCoordinator camera2CameraCoordinator = getcurrentcontentinsetright2.RemoteActionCompatParcelizer.IconCompatParcelizer;
                camera2CameraCoordinator.getClass();
                getcurrentcontentinsetright2.MediaSessionCompatQueueItem = new TransitionValuesMaps(getcurrentcontentinsetright2.MediaBrowserCompatMediaItem, camera2CameraCoordinator, getcurrentcontentinsetright2.MediaDescriptionCompat, getcurrentcontentinsetright2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                Iterator it = getcurrentcontentinsetright2.MediaBrowserCompatMediaItem.serializer().iterator();
                while (it.hasNext()) {
                    ((ImageCapture1) it.next()).MediaMetadataCompat().serializer(getcurrentcontentinsetright2.MediaSessionCompatQueueItem);
                }
                getcurrentcontentinsetright2.serializer.read(getcurrentcontentinsetright2.RemoteActionCompatParcelizer, getcurrentcontentinsetright2.MediaBrowserCompatMediaItem);
                o.ImageCaptureException imageCaptureException = getcurrentcontentinsetright2.serializer;
                Camera2DeviceSurfaceManager camera2DeviceSurfaceManager = getcurrentcontentinsetright2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                imageCaptureException.getClass();
                camera2DeviceSurfaceManager.getClass();
                imageCaptureException.MediaDescriptionCompat.add(camera2DeviceSurfaceManager);
                o.ImageCaptureException imageCaptureException2 = getcurrentcontentinsetright2.serializer;
                Camera2CameraCoordinator camera2CameraCoordinator2 = getcurrentcontentinsetright2.RemoteActionCompatParcelizer.IconCompatParcelizer;
                imageCaptureException2.getClass();
                camera2CameraCoordinator2.getClass();
                imageCaptureException2.MediaDescriptionCompat.add(camera2CameraCoordinator2);
                nativeShiftPixel.write(contextRemoteActionCompatParcelizer, getcurrentcontentinsetright2.MediaBrowserCompatMediaItem, getlogodescriptionWrite);
                if (i > 1) {
                    if (((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue()) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(-1, "CX:CameraProvider-RetryStatus");
                    }
                }
                synchronized (getcurrentcontentinsetright2.MediaSessionCompatResultReceiverWrapper) {
                    getcurrentcontentinsetright2.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.INITIALIZED;
                }
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e) {
            nativeConvertAndroid420ToBitmap nativeconvertandroid420tobitmap = new nativeConvertAndroid420ToBitmap(e, j);
            CryptoObjectUtils cryptoObjectUtilsSerializer = getcurrentcontentinsetright2.PlaybackStateCompat.serializer(nativeconvertandroid420tobitmap);
            if (((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue()) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(nativeconvertandroid420tobitmap.read, "CX:CameraProvider-RetryStatus");
            }
            getcurrentcontentinsetright2.serializer.serializer();
            if (!cryptoObjectUtilsSerializer.MediaDescriptionCompat || i >= Integer.MAX_VALUE) {
                synchronized (getcurrentcontentinsetright2.MediaSessionCompatResultReceiverWrapper) {
                    getcurrentcontentinsetright2.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.INITIALIZING_ERROR;
                }
                if (cryptoObjectUtilsSerializer.serializer) {
                    synchronized (getcurrentcontentinsetright2.MediaSessionCompatResultReceiverWrapper) {
                        getcurrentcontentinsetright2.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.INITIALIZED;
                    }
                    ondrawwithcontent.RemoteActionCompatParcelizer(null);
                } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).serializer;
                    setInflatedId.read("CameraX", str, e);
                    ondrawwithcontent.serializer(new InitializationException(new CameraUnavailableException(str)));
                } else if (e instanceof InitializationException) {
                    ondrawwithcontent.serializer(e);
                } else {
                    ondrawwithcontent.serializer(new InitializationException(e));
                }
            } else {
                setInflatedId.RemoteActionCompatParcelizer("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                getcurrentcontentinsetright2.ParcelableVolumeInfo.postDelayed(new CameraX$$ExternalSyntheticLambda0(getcurrentcontentinsetright2, executor2, j, i, contextRemoteActionCompatParcelizer, ondrawwithcontent), "retry_token", cryptoObjectUtilsSerializer.read);
            }
        }
    }

    public /* synthetic */ CameraX$$ExternalSyntheticLambda0(getCurrentContentInsetRight getcurrentcontentinsetright, Executor executor, long j, int i, Context context, onDrawWithContent ondrawwithcontent) {
        this.write = getcurrentcontentinsetright;
        this.RemoteActionCompatParcelizer = executor;
        this.MediaSessionCompatQueueItem = j;
        this.serializer = i;
        this.IconCompatParcelizer = context;
        this.MediaDescriptionCompat = ondrawwithcontent;
    }
}
