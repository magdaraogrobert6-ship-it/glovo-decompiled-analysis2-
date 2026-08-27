package o;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setLastBaselineToBottomHeight implements obtainShadowContext {
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setLastBaselineToBottomHeight(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, int i) {
        this.read = i;
        this.IconCompatParcelizer = camera2CameraImpl;
    }

    @Override // o.obtainShadowContext
    public Object serializer(final onDrawWithContent ondrawwithcontent) {
        int i = this.read;
        final androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.IconCompatParcelizer;
        char c = 1;
        if (i == 1) {
            try {
                ArrayList arrayList = new ArrayList(camera2CameraImpl.addObserverForBackInvoker.serializer().RemoteActionCompatParcelizer().read);
                arrayList.add((setDividerPadding) camera2CameraImpl.MediaSessionCompatToken.IconCompatParcelizer);
                arrayList.add(new setFirstBaselineToTopHeight(camera2CameraImpl, ondrawwithcontent));
                camera2CameraImpl.RatingCompat.serializer.write(camera2CameraImpl.MediaDescriptionCompat.MediaDescriptionCompat, camera2CameraImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RenderIntent.RemoteActionCompatParcelizer(arrayList));
                return "configAndCloseTask";
            } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat | RuntimeException e) {
                camera2CameraImpl.write("Unable to open camera for configAndClose: " + e.getMessage());
                ondrawwithcontent.serializer(e);
                return "configAndCloseTask";
            }
        }
        final int i2 = 0;
        if (i == 2) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Camera can only be released once, so release completer should be null on creation.", camera2CameraImpl.createFullyDrawnExecutor == null);
            camera2CameraImpl.createFullyDrawnExecutor = ondrawwithcontent;
            return "Release[camera=" + camera2CameraImpl + "]";
        }
        if (i != 3) {
            camera2CameraImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new Runnable() { // from class: o.setCompoundDrawablesRelativeWithIntrinsicBounds
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    androidx.navigation.NavArgsLazy navArgsLazy;
                    boolean z = false;
                    if (i2 != 0) {
                        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = camera2CameraImpl;
                        onDrawWithContent ondrawwithcontent2 = ondrawwithcontent;
                        androidx.lifecycle.BlockRunner blockRunner = camera2CameraImpl2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        ondrawwithcontent2.RemoteActionCompatParcelizer(Boolean.valueOf(blockRunner != null ? camera2CameraImpl2.addObserverForBackInvoker.serializer(androidx.camera.camera2.internal.Camera2CameraImpl.read(blockRunner)) : false));
                        return;
                    }
                    androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl3 = camera2CameraImpl;
                    onDrawWithContent ondrawwithcontent3 = ondrawwithcontent;
                    if (camera2CameraImpl3.ensureViewModelStore == null) {
                        if (camera2CameraImpl3._init_lambda1 != setTextFuture.RELEASED) {
                            camera2CameraImpl3.ensureViewModelStore = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new setLastBaselineToBottomHeight(camera2CameraImpl3, 2));
                        } else {
                            camera2CameraImpl3.ensureViewModelStore = EncoderImplMediaCodecCallback.IconCompatParcelizer;
                        }
                    }
                    DrawModifierNodeKt drawModifierNodeKt = camera2CameraImpl3.ensureViewModelStore;
                    switch (camera2CameraImpl3._init_lambda1.ordinal()) {
                        case 1:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            if (camera2CameraImpl3._init_lambda3.RemoteActionCompatParcelizer() || ((navArgsLazy = (androidx.navigation.NavArgsLazy) camera2CameraImpl3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer) != null && !((AtomicBoolean) navArgsLazy.read).get())) {
                                z = true;
                            }
                            camera2CameraImpl3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
                            camera2CameraImpl3.read(setTextFuture.RELEASING);
                            if (z) {
                                coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
                                camera2CameraImpl3.IconCompatParcelizer();
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl3.write == null);
                            camera2CameraImpl3.read(setTextFuture.RELEASING);
                            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
                            camera2CameraImpl3.IconCompatParcelizer();
                            break;
                        case 9:
                        case 10:
                            camera2CameraImpl3.read(setTextFuture.RELEASING);
                            camera2CameraImpl3.write();
                            break;
                        default:
                            camera2CameraImpl3.write("release() ignored due to being in state: " + camera2CameraImpl3._init_lambda1);
                            break;
                    }
                    VideoQualityQuirk.write(drawModifierNodeKt, ondrawwithcontent3);
                }
            });
            return "Release[request=" + camera2CameraImpl.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getAndIncrement() + "]";
        }
        try {
            PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = camera2CameraImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            final char c2 = c == true ? 1 : 0;
            previewFreezeAfterHighSpeedRecordingQuirk.execute(new Runnable() { // from class: o.setCompoundDrawablesRelativeWithIntrinsicBounds
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    androidx.navigation.NavArgsLazy navArgsLazy;
                    boolean z = false;
                    if (c2 != 0) {
                        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = camera2CameraImpl;
                        onDrawWithContent ondrawwithcontent2 = ondrawwithcontent;
                        androidx.lifecycle.BlockRunner blockRunner = camera2CameraImpl2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        ondrawwithcontent2.RemoteActionCompatParcelizer(Boolean.valueOf(blockRunner != null ? camera2CameraImpl2.addObserverForBackInvoker.serializer(androidx.camera.camera2.internal.Camera2CameraImpl.read(blockRunner)) : false));
                        return;
                    }
                    androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl3 = camera2CameraImpl;
                    onDrawWithContent ondrawwithcontent3 = ondrawwithcontent;
                    if (camera2CameraImpl3.ensureViewModelStore == null) {
                        if (camera2CameraImpl3._init_lambda1 != setTextFuture.RELEASED) {
                            camera2CameraImpl3.ensureViewModelStore = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new setLastBaselineToBottomHeight(camera2CameraImpl3, 2));
                        } else {
                            camera2CameraImpl3.ensureViewModelStore = EncoderImplMediaCodecCallback.IconCompatParcelizer;
                        }
                    }
                    DrawModifierNodeKt drawModifierNodeKt = camera2CameraImpl3.ensureViewModelStore;
                    switch (camera2CameraImpl3._init_lambda1.ordinal()) {
                        case 1:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            if (camera2CameraImpl3._init_lambda3.RemoteActionCompatParcelizer() || ((navArgsLazy = (androidx.navigation.NavArgsLazy) camera2CameraImpl3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer) != null && !((AtomicBoolean) navArgsLazy.read).get())) {
                                z = true;
                            }
                            camera2CameraImpl3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
                            camera2CameraImpl3.read(setTextFuture.RELEASING);
                            if (z) {
                                coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
                                camera2CameraImpl3.IconCompatParcelizer();
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl3.write == null);
                            camera2CameraImpl3.read(setTextFuture.RELEASING);
                            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
                            camera2CameraImpl3.IconCompatParcelizer();
                            break;
                        case 9:
                        case 10:
                            camera2CameraImpl3.read(setTextFuture.RELEASING);
                            camera2CameraImpl3.write();
                            break;
                        default:
                            camera2CameraImpl3.write("release() ignored due to being in state: " + camera2CameraImpl3._init_lambda1);
                            break;
                    }
                    VideoQualityQuirk.write(drawModifierNodeKt, ondrawwithcontent3);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            ondrawwithcontent.serializer(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }
}
