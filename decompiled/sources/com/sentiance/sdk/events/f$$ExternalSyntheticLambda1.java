package com.sentiance.sdk.events;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Environment;
import android.os.StatFs;
import androidx.camera.camera2.internal.FocusMeteringControl;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.mapbox.maps.MapView;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.sentiance.sdk.task.TaskManager;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core._init_lambda4;
import io.sentry.protocol.MediaMetadataCompat;
import java.io.File;
import java.util.HashSet;
import o.FocusListener;
import o.ParentDataModifierDefaultImpls;
import o.createOrGetDataStorelambda00;
import o.getAnalyticsEnabledEnterannotations;
import o.getBitmapUrl;
import o.onDetachedFromWindow;
import o.onDrawWithContent;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw;
import o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4;
import o.requestSingleLocationUpdateFromGooglePlaylambda10;
import o.requestSingleLocationUpdateFromGooglePlaylambda30;
import o.stringAndKey;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ f$$ExternalSyntheticLambda1(boolean z, r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer serializerVar, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        this.read = 7;
        this.IconCompatParcelizer = z;
        this.serializer = serializerVar;
        this.write = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x016a A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #1 {all -> 0x0174, blocks: (B:42:0x012d, B:45:0x0135, B:47:0x013b, B:49:0x013f, B:58:0x0157, B:53:0x0146, B:56:0x014d, B:62:0x016a, B:59:0x015a), top: B:80:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.onDetachedFromWindow, o.setOrientation] */
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
        StatFs statFs;
        Long lValueOf;
        File file;
        Long lValueOf2;
        Long lValueOf3;
        switch (this.read) {
            case 0:
                getAnalyticsEnabledEnterannotations.RemoteActionCompatParcelizer((getAnalyticsEnabledEnterannotations) this.serializer, (Runnable) this.write, this.IconCompatParcelizer);
                break;
            case 1:
                final FocusMeteringControl focusMeteringControl = (FocusMeteringControl) this.serializer;
                boolean z = this.IconCompatParcelizer;
                final onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.write;
                ((HashSet) focusMeteringControl.MediaDescriptionCompat.ResultReceiver.read).remove(focusMeteringControl.ComponentActivity);
                focusMeteringControl.MediaSessionCompatResultReceiverWrapper = z;
                if (!focusMeteringControl.PlaybackStateCompat) {
                    ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
                } else {
                    final long jMediaSessionCompatQueueItem = focusMeteringControl.MediaDescriptionCompat.MediaSessionCompatQueueItem();
                    ?? r1 = new onDetachedFromWindow() { // from class: o.setOrientation
                        @Override // o.onDetachedFromWindow
                        public final boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult) {
                            boolean z2 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            setInflatedId.IconCompatParcelizer(3, "FocusMeteringControl");
                            if (z2 != focusMeteringControl.MediaSessionCompatResultReceiverWrapper || !androidx.camera.camera2.internal.Camera2CameraControlImpl.serializer(totalCaptureResult, jMediaSessionCompatQueueItem)) {
                                return false;
                            }
                            setInflatedId.IconCompatParcelizer(3, "FocusMeteringControl");
                            ondrawwithcontent.RemoteActionCompatParcelizer(null);
                            return true;
                        }
                    };
                    focusMeteringControl.ComponentActivity = r1;
                    focusMeteringControl.MediaDescriptionCompat.write((onDetachedFromWindow) r1);
                }
                break;
            case 2:
                FocusListener.serializer((Context) this.serializer, this.IconCompatParcelizer, (ParentDataModifierDefaultImpls) this.write);
                break;
            case 3:
                MapboxRenderer.snapshot$lambda$4((MapView.OnSnapshotReady) this.serializer, (MapboxRenderer) this.write, this.IconCompatParcelizer);
                break;
            case 4:
                requestSingleLocationUpdateFromGooglePlaylambda30.write((requestSingleLocationUpdateFromGooglePlaylambda30) this.serializer, (requestSingleLocationUpdateFromGooglePlaylambda10) this.write, this.IconCompatParcelizer);
                break;
            case 5:
                stringAndKey.RemoteActionCompatParcelizer((stringAndKey) ((d0$$ExternalSyntheticLambda0) this.serializer).read, new getBitmapUrl.read((String) this.write, this.IconCompatParcelizer, false));
                break;
            case 6:
                ((TaskManager) this.serializer).write((createOrGetDataStorelambda00) this.write, this.IconCompatParcelizer);
                break;
            case 7:
                boolean z2 = this.IconCompatParcelizer;
                r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer serializerVar = (r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer) this.serializer;
                r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4 = (r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4) this.write;
                if (z2) {
                    serializerVar.write.write(serializerVar.RemoteActionCompatParcelizer, serializerVar.read);
                } else {
                    serializerVar.write.serializer(serializerVar.RemoteActionCompatParcelizer, serializerVar.read);
                }
                r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
                break;
            default:
                _init_lambda4 _init_lambda4Var = (_init_lambda4) this.serializer;
                MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) this.write;
                boolean z3 = this.IconCompatParcelizer;
                Context context = _init_lambda4Var.serializer;
                SentryAndroidOptions sentryAndroidOptions = _init_lambda4Var.MediaSessionCompatQueueItem;
                File dataDirectory = Environment.getDataDirectory();
                Long lValueOf4 = null;
                if (dataDirectory != null) {
                    StatFs statFs2 = new StatFs(dataDirectory.getPath());
                    try {
                        lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting total internal storage amount.", th);
                        lValueOf2 = null;
                    }
                    mediaMetadataCompat.accessensureViewModelStore = lValueOf2;
                    try {
                        lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting unused internal storage amount.", th2);
                        lValueOf3 = null;
                    }
                    mediaMetadataCompat.MediaSessionCompatToken = lValueOf3;
                }
                if (z3) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    try {
                        File[] externalFilesDirs = context.getExternalFilesDirs(null);
                        if (externalFilesDirs != null) {
                            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                            int length = externalFilesDirs.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    file = externalFilesDirs[i];
                                    if (file != null) {
                                        if (absolutePath != null && !absolutePath.isEmpty() && file.getAbsolutePath().contains(absolutePath)) {
                                        }
                                    }
                                    i++;
                                }
                            }
                            if (file != null) {
                                statFs = new StatFs(file.getPath());
                            } else {
                                statFs = null;
                            }
                            if (statFs != null) {
                                try {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                } catch (Throwable th3) {
                                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting total external storage amount.", th3);
                                    lValueOf = null;
                                }
                                mediaMetadataCompat.PlaybackStateCompat = lValueOf;
                                try {
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                } catch (Throwable th4) {
                                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting unused external storage amount.", th4);
                                }
                                mediaMetadataCompat.MediaBrowserCompatMediaItem = lValueOf4;
                            }
                        } else {
                            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                        }
                        file = null;
                        if (file != null) {
                            statFs = new StatFs(file.getPath());
                        } else {
                            statFs = null;
                        }
                    } catch (Throwable unused) {
                        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Not possible to read external files directory", new Object[0]);
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        mediaMetadataCompat.PlaybackStateCompat = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        mediaMetadataCompat.MediaBrowserCompatMediaItem = lValueOf4;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f$$ExternalSyntheticLambda1(Object obj, boolean z, Object obj2, int i) {
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = z;
        this.write = obj2;
    }

    public /* synthetic */ f$$ExternalSyntheticLambda1(Object obj, Object obj2, boolean z, int i) {
        this.read = i;
        this.serializer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = z;
    }
}
