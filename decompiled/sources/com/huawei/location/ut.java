package com.huawei.location;

import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.video.VideoCapture;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Util;
import com.google.firestore.v1.Value;
import com.google.re2j.Parser;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.callback.d2;
import com.huawei.location.lite.common.util.ReflectionUtils;
import com.huawei.location.sdm.Sdm;
import com.huawei.location.ut;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.core.exceptions.ServicesException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedCallback;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedResult;
import com.sentiance.core.model.events.C$b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.ensureViewModelStore;
import io.sentry.android.core.fullyDrawnReporter_delegatelambda0;
import io.sentry.vendor.gson.stream.IconCompatParcelizer;
import io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidGraphicsContext2;
import o.BrazeSdkAuthenticationErrorEvent;
import o.CombinedClickableElement;
import o.InfiniteTransitionrun113;
import o.KeyEventTypeCompanion;
import o.NodeCoordinatorCompanion;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.SetCustomUserAttributeStep;
import o.SwitchCompatEmojiCompatInitCallback;
import o.VideoEncoderCrashQuirk;
import o.ViewTreeHostDefaultProvider;
import o.WrappedCompositionsetContent1211;
import o.accessanyjd;
import o.accessgetHasRetrievedMethodcp;
import o.accessgetKeyDowncp;
import o.accessgetMinimumTouchTargetSizeMYxV2XQjd;
import o.accessgetOnCommitAffectingLayercp;
import o.accessgetPointerInputSourcecp;
import o.accessgetRecreateDisplayListcp;
import o.accessgetSnapshotObserver;
import o.accessgetUpdateDisplayListIfDirtyMethodcp;
import o.accessoutOfBoundsHit8NAm7pk;
import o.accessreadAnimationScale;
import o.accesssetDrawBlockParentLayerp;
import o.accesssetLastLayerDrawingWasSkippedp;
import o.accessswap;
import o.alignKFBX0sM;
import o.ancestorToLocal;
import o.asList;
import o.childHitTestqzLsGqo;
import o.createFromParcel;
import o.createLifecycleAwareWindowRecomposer;
import o.drawBorder;
import o.fillVector;
import o.fromParentRect;
import o.getDefaultImageFormat;
import o.getInflatedId;
import o.getLocalUiMediaScope;
import o.getNavigationIcon;
import o.getRectManager;
import o.getSurfaceClass;
import o.getThumbTintList;
import o.getTitleMarginStart;
import o.getTrackTintList;
import o.getUriActionForCardlambda0;
import o.getViewModelStore;
import o.hit5ShdDok;
import o.isItemDismissable;
import o.nodeReused;
import o.onDrawBehind;
import o.onEndApplyChanges;
import o.onItemDismiss;
import o.onLayoutModifierNodeChanged;
import o.prune;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.seekAnimationsanimation_core;
import o.setBefore;
import o.setInflatedId;
import o.setSplitTrack;
import o.setSubtitleTextColor;
import o.setWrappedui;
import o.shareWithSiblings;
import o.shouldSharePointerInputWithSiblings;
import o.specifiesCanFocusProperty;
import o.toCoordinator;
import o.toParentPosition8S9VItk;
import o.toParentPosition8S9VItkdefault;
import o.transformFromAncestorEL8BTi8;
import o.updateLayerParametersdefault;
import o.updateUnsafe;
import o.visitNodes;

/* JADX INFO: loaded from: classes2.dex */
public final class ut implements getDefaultImageFormat, VideoEncoderCrashQuirk, RoutesRenderedCallback, setSubtitleTextColor {
    public static final Object IconCompatParcelizer = new Object();
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int ParcelableVolumeInfo = 1;
    public static ut read;
    public static volatile ut serializer;
    public Object MediaBrowserCompatMediaItem;
    public Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public boolean write;

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i3)) | (~(i7 | i2));
        int i9 = (~i3) | i4;
        int i10 = ~(i9 | i2);
        int i11 = (~(i3 | (~i2))) | (~i9);
        int i12 = i4 + i2 + i5 + (243328196 * i) + (549715570 * i6);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i4) + 1264254976 + ((-1099560353) * i2) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i5) + (781713408 * i) + (665583616 * i6) + (1005256704 * i13);
        int i15 = (i4 * 1467389705) + 421362043 + (i2 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i5 * 1467388771) + (i * (-1383267380)) + (i6 * 1030937622) + (i13 * 484507648);
        return i14 + ((i15 * i15) * 1164771328) != 1 ? RemoteActionCompatParcelizer(objArr) : serializer(objArr);
    }

    static {
        int i = MediaDescriptionCompat + 33;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static ut IconCompatParcelizer(Context context) {
        ut utVar;
        synchronized (ut.class) {
            if (read == null) {
                read = BrazeSdkAuthenticationErrorEvent.serializer(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new ut(context) : new ut(1);
            }
            ut utVar2 = read;
            if (utVar2 == null || ((KeyEventTypeCompanion) utVar2.MediaBrowserCompatMediaItem) == null || utVar2.write) {
                utVar = read;
                utVar.getClass();
            } else {
                try {
                    context.getContentResolver().registerContentObserver(accessgetKeyDowncp.write, true, (KeyEventTypeCompanion) read.MediaBrowserCompatMediaItem);
                    ut utVar3 = read;
                    utVar3.getClass();
                    utVar3.write = true;
                } catch (SecurityException e) {
                    SentryLogcatAdapter.read("GservicesLoader", "Unable to register Gservices content observer", e);
                }
                utVar = read;
                utVar.getClass();
            }
            throw th;
        }
        return utVar;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        Context context;
        synchronized (ut.class) {
            ut utVar = read;
            if (utVar != null && (context = (Context) utVar.RatingCompat) != null && ((KeyEventTypeCompanion) utVar.MediaBrowserCompatMediaItem) != null && utVar.write) {
                context.getContentResolver().unregisterContentObserver((KeyEventTypeCompanion) read.MediaBrowserCompatMediaItem);
            }
            read = null;
        }
        return null;
    }

    @Override // o.getDefaultImageFormat
    public getInflatedId IconCompatParcelizer() {
        Image imageAcquireNextImage;
        synchronized (this.MediaBrowserCompatMediaItem) {
            try {
                imageAcquireNextImage = ((ImageReader) this.RatingCompat).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new SwitchCompatEmojiCompatInitCallback(imageAcquireNextImage);
        }
    }

    @Override // o.getDefaultImageFormat
    public int MediaBrowserCompatMediaItem() {
        int imageFormat;
        synchronized (this.MediaBrowserCompatMediaItem) {
            imageFormat = ((ImageReader) this.RatingCompat).getImageFormat();
        }
        return imageFormat;
    }

    @Override // o.getDefaultImageFormat
    public int MediaDescriptionCompat() {
        int width;
        synchronized (this.MediaBrowserCompatMediaItem) {
            width = ((ImageReader) this.RatingCompat).getWidth();
        }
        return width;
    }

    @Override // o.getDefaultImageFormat
    public int MediaMetadataCompat() {
        int maxImages;
        synchronized (this.MediaBrowserCompatMediaItem) {
            maxImages = ((ImageReader) this.RatingCompat).getMaxImages();
        }
        return maxImages;
    }

    public boolean MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 117;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.write;
        int i4 = i3 + 21;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    @Override // o.getDefaultImageFormat
    public Surface RatingCompat() {
        Surface surface;
        synchronized (this.MediaBrowserCompatMediaItem) {
            surface = ((ImageReader) this.RatingCompat).getSurface();
        }
        return surface;
    }

    @Override // o.getDefaultImageFormat
    public int RemoteActionCompatParcelizer() {
        int height;
        synchronized (this.MediaBrowserCompatMediaItem) {
            height = ((ImageReader) this.RatingCompat).getHeight();
        }
        return height;
    }

    public void RemoteActionCompatParcelizer(ScheduledFuture scheduledFuture) {
        synchronized (this.RatingCompat) {
            if (!this.write) {
                this.MediaBrowserCompatMediaItem = scheduledFuture;
            }
        }
    }

    @Override // o.getDefaultImageFormat
    public void RemoteActionCompatParcelizer(final getSurfaceClass getsurfaceclass, final Executor executor) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.write = false;
            ((ImageReader) this.RatingCompat).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: o.setupEmojiCompatLoadCallback
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    ut utVar = this.serializer;
                    Executor executor2 = executor;
                    getSurfaceClass getsurfaceclass2 = getsurfaceclass;
                    synchronized (utVar.MediaBrowserCompatMediaItem) {
                        if (!utVar.write) {
                            executor2.execute(new CameraX$$ExternalSyntheticLambda2(utVar, 12, getsurfaceclass2));
                        }
                    }
                }
            }, getViewModelStore.read());
        }
    }

    @Override // o.getDefaultImageFormat
    public void read() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.write = true;
            ((ImageReader) this.RatingCompat).setOnImageAvailableListener(null, null);
        }
    }

    @Override // o.getDefaultImageFormat
    public void serializer() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            ((ImageReader) this.RatingCompat).close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[Catch: all -> 0x0088, TryCatch #4 {, blocks: (B:9:0x000f, B:11:0x0013, B:16:0x001a, B:18:0x001e, B:19:0x0028, B:33:0x0054, B:34:0x0056, B:22:0x002e, B:24:0x0034, B:31:0x0050, B:28:0x0041), top: B:66:0x000f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0088, TryCatch #4 {, blocks: (B:9:0x000f, B:11:0x0013, B:16:0x001a, B:18:0x001e, B:19:0x0028, B:33:0x0054, B:34:0x0056, B:22:0x002e, B:24:0x0034, B:31:0x0050, B:28:0x0041), top: B:66:0x000f, inners: #2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r0 == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String write(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.RatingCompat
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L8b
            boolean r2 = androidx.room.Room.MediaDescriptionCompat
            if (r2 == 0) goto Lc
            goto L5a
        Lc:
            java.lang.Class<androidx.room.Room> r2 = androidx.room.Room.class
            monitor-enter(r2)
            boolean r3 = androidx.room.Room.MediaDescriptionCompat     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            goto L5a
        L15:
            r3 = 1
            r4 = r3
        L17:
            r5 = 2
            if (r4 > r5) goto L4d
            android.os.UserManager r5 = androidx.room.Room.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L88
            if (r5 != 0) goto L28
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L88
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L88
            androidx.room.Room.MediaBrowserCompatMediaItem = r5     // Catch: java.lang.Throwable -> L88
        L28:
            android.os.UserManager r5 = androidx.room.Room.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L88
            if (r5 != 0) goto L2e
            r0 = r3
            goto L52
        L2e:
            boolean r6 = r5.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L40 java.lang.Throwable -> L88
            if (r6 != 0) goto L3e
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L40 java.lang.Throwable -> L88
            boolean r0 = r5.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L40 java.lang.Throwable -> L88
            if (r0 != 0) goto L4d
        L3e:
            r0 = r3
            goto L4e
        L40:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            io.sentry.android.core.SentryLogcatAdapter.write(r6, r7, r5)     // Catch: java.lang.Throwable -> L88
            androidx.room.Room.MediaBrowserCompatMediaItem = r1     // Catch: java.lang.Throwable -> L88
            int r4 = r4 + 1
            goto L17
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L52
            androidx.room.Room.MediaBrowserCompatMediaItem = r1     // Catch: java.lang.Throwable -> L88
        L52:
            if (r0 == 0) goto L56
            androidx.room.Room.MediaDescriptionCompat = r3     // Catch: java.lang.Throwable -> L88
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L5a
            goto L8b
        L5a:
            com.google.android.gms.internal.measurement.zzz r0 = new com.google.android.gms.internal.measurement.zzz     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
            java.lang.Object r0 = r0.read()     // Catch: java.lang.SecurityException -> L64 java.lang.NullPointerException -> L77 java.lang.IllegalStateException -> L7b
            goto L6f
        L64:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
            java.lang.Object r0 = r0.read()     // Catch: java.lang.Throwable -> L72
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
        L6f:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
            return r0
        L72:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
            throw r0     // Catch: java.lang.NullPointerException -> L77 java.lang.SecurityException -> L79 java.lang.IllegalStateException -> L7b
        L77:
            r0 = move-exception
            goto L7c
        L79:
            r0 = move-exception
            goto L7c
        L7b:
            r0 = move-exception
        L7c:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            io.sentry.android.core.SentryLogcatAdapter.read(r2, r9, r0)
            return r1
        L88:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            throw r9
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.location.ut.write(java.lang.String):java.lang.String");
    }

    @Override // o.getDefaultImageFormat
    public getInflatedId write() {
        Image imageAcquireLatestImage;
        synchronized (this.MediaBrowserCompatMediaItem) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.RatingCompat).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new SwitchCompatEmojiCompatInitCallback(imageAcquireLatestImage);
        }
    }

    public String MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 115;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = (String) this.MediaBrowserCompatMediaItem;
        int i4 = i2 + 119;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public String PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        String str = (String) this.RatingCompat;
        int i5 = i3 + 53;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public ut(int i) {
        this.RemoteActionCompatParcelizer = i;
        boolean z = false;
        if (i != 12) {
            this.write = false;
            this.RatingCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            return;
        }
        this.RatingCompat = null;
        this.MediaBrowserCompatMediaItem = new CopyOnWriteArrayList();
        this.write = false;
        if (ReflectionUtils.getClass("com.huawei.location.sdm.Sdm") != null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmProvider", "support sdm");
            Parser.Pair pair = new Parser.Pair(3, z);
            pair.RemoteActionCompatParcelizer = null;
            pair.write = null;
            pair.write = new Sdm();
            this.RatingCompat = pair;
            int i2 = MediaMetadataCompat + 67;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 4 / 4;
                return;
            }
        } else {
            WrappedCompositionsetContent1211.write("SdmProvider", "not support sdm");
            int i4 = ParcelableVolumeInfo + 79;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
        }
        int i5 = 2 % 2;
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        InfiniteTransitionrun113 infiniteTransitionrun113;
        if (this.RemoteActionCompatParcelizer != 4) {
            getTitleMarginStart gettitlemarginstart = (getTitleMarginStart) obj;
            synchronized (this.MediaBrowserCompatMediaItem) {
                if (this.write) {
                    return;
                }
                if (gettitlemarginstart == null) {
                    return;
                }
                setInflatedId.IconCompatParcelizer(3, "CameraController");
                ((AndroidGraphicsContext2) this.RatingCompat).serializer(new CombinedClickableElement(gettitlemarginstart.read ? 2 : 3));
                return;
            }
        }
        onDrawBehind ondrawbehind = (onDrawBehind) this.RatingCompat;
        VideoCapture videoCapture = (VideoCapture) this.MediaBrowserCompatMediaItem;
        if (ondrawbehind != videoCapture.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 || (infiniteTransitionrun113 = videoCapture.RatingCompat) == InfiniteTransitionrun113.INACTIVE) {
            return;
        }
        InfiniteTransitionrun113 infiniteTransitionrun114 = this.write ? InfiniteTransitionrun113.ACTIVE_STREAMING : InfiniteTransitionrun113.ACTIVE_NON_STREAMING;
        if (infiniteTransitionrun114 != infiniteTransitionrun113) {
            videoCapture.RatingCompat = infiniteTransitionrun114;
            videoCapture.MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(infiniteTransitionrun114);
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        if (this.RemoteActionCompatParcelizer == 4) {
            if (th instanceof CancellationException) {
                return;
            }
            setInflatedId.read("VideoCapture", "Surface update completed with unexpected exception", th);
            return;
        }
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.write) {
                return;
            }
            if (!(th instanceof CameraControl$OperationCanceledException)) {
                setInflatedId.IconCompatParcelizer(3, "CameraController");
                ((AndroidGraphicsContext2) this.RatingCompat).serializer(new CombinedClickableElement(4));
                return;
            }
            setInflatedId.IconCompatParcelizer(3, "CameraController");
            ((AndroidGraphicsContext2) this.RatingCompat).serializer(new CombinedClickableElement(0));
            synchronized (this.MediaBrowserCompatMediaItem) {
                this.write = true;
            }
        }
    }

    public Future ResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 101;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = false;
        } else {
            this.write = true;
        }
        return (Future) this.MediaBrowserCompatMediaItem;
    }

    public void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 83;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.write) {
            int i4 = i2 + 67;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                TextFieldSelectionManager.write((TextFieldSelectionManager) this.MediaBrowserCompatMediaItem, (TextRange) this.RatingCompat);
            } else {
                TextFieldSelectionManager.write((TextFieldSelectionManager) this.MediaBrowserCompatMediaItem, (TextRange) this.RatingCompat);
                obj.hashCode();
                throw null;
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str) || !Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str)) {
            int i4 = ParcelableVolumeInfo + 27;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            return false;
        }
        int i6 = MediaMetadataCompat + 79;
        ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
        return true;
    }

    @Override // com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedCallback
    public void onRoutesRendered(RoutesRenderedResult routesRenderedResult) {
        int i = 2 % 2;
        routesRenderedResult.getClass();
        if (!this.write) {
            this.MediaBrowserCompatMediaItem = routesRenderedResult;
            int i2 = MediaMetadataCompat + 115;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        int i4 = ParcelableVolumeInfo + 45;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            ((C$b) this.RatingCompat).onRoutesRendered(routesRenderedResult);
        } else {
            ((C$b) this.RatingCompat).onRoutesRendered(routesRenderedResult);
            int i5 = 4 / 0;
        }
    }

    public getLocalUiMediaScope PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessanyjd accessanyjdVar = (accessanyjd) this.MediaBrowserCompatMediaItem;
        int i4 = accessanyjdVar.read;
        int i5 = accessanyjdVar.IconCompatParcelizer;
        if (i4 >= i5) {
            return i4 > i5 ? getLocalUiMediaScope.CROSSED : getLocalUiMediaScope.COLLAPSED;
        }
        int i6 = ParcelableVolumeInfo + 101;
        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 != 0) {
            getLocalUiMediaScope getlocaluimediascope = getLocalUiMediaScope.NOT_CROSSED;
            obj.hashCode();
            throw null;
        }
        getLocalUiMediaScope getlocaluimediascope2 = getLocalUiMediaScope.NOT_CROSSED;
        int i7 = MediaMetadataCompat + 87;
        ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return getlocaluimediascope2;
        }
        throw null;
    }

    public static boolean IconCompatParcelizer(getNavigationIcon getnavigationicon, getNavigationIcon getnavigationicon2, HashSet hashSet) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 101;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (hashSet.contains(getnavigationicon2)) {
            return IconCompatParcelizer(getnavigationicon, getnavigationicon2);
        }
        int i4 = MediaMetadataCompat + 41;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            getnavigationicon.toString();
            getnavigationicon2.toString();
            setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
            return true;
        }
        getnavigationicon.toString();
        getnavigationicon2.toString();
        setInflatedId.IconCompatParcelizer(3, "DynamicRangeResolver");
        return false;
    }

    @Override // o.setSubtitleTextColor
    public void IconCompatParcelizer(ImageCapture$1 imageCapture$1) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 65;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            imageCapture$1.getClass();
            throw null;
        }
        imageCapture$1.getClass();
        if (this.write) {
            ((ExecutorService) this.RatingCompat).shutdown();
            int i3 = ParcelableVolumeInfo + 7;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        ((CancellableContinuationImpl) this.MediaBrowserCompatMediaItem).resumeWith(new onItemDismiss(createFromParcel.INSTANCE));
    }

    @Override // o.setSubtitleTextColor
    public void write(ImageCaptureException imageCaptureException) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 59;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!this.write)) {
            ((ExecutorService) this.RatingCompat).shutdown();
        }
        ((CancellableContinuationImpl) this.MediaBrowserCompatMediaItem).resumeWith(new onItemDismiss(new isItemDismissable(imageCaptureException)));
        int i3 = MediaMetadataCompat + 69;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static String IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            if (!matcher.find()) {
                return "";
            }
            String strGroup = matcher.group(1);
            int i4 = MediaMetadataCompat + 91;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return strGroup;
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[SYNTHETIC] */
    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) throws IOException {
        long jSkip;
        BufferedInputStream bufferedInputStream = (BufferedInputStream) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        while (jLongValue > 0) {
            int i2 = ParcelableVolumeInfo + 29;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                jSkip = bufferedInputStream.skip(jLongValue);
                if (jSkip == 1) {
                    int i3 = ParcelableVolumeInfo + 57;
                    MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (bufferedInputStream.read() != -1) {
                        throw new EOFException("Unexpected end of stream while skipping bytes");
                    }
                    jLongValue--;
                } else {
                    jLongValue -= jSkip;
                    int i5 = MediaMetadataCompat + 115;
                    ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            } else {
                long jSkip2 = bufferedInputStream.skip(jLongValue);
                if (jSkip2 == 0) {
                    int i7 = ParcelableVolumeInfo + 57;
                    MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (bufferedInputStream.read() != -1) {
                        throw new EOFException("Unexpected end of stream while skipping bytes");
                    }
                    jLongValue--;
                } else {
                    jSkip = jSkip2;
                    jLongValue -= jSkip;
                    int i9 = MediaMetadataCompat + 115;
                    ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            }
        }
        return null;
    }

    public void ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
            if (this.write) {
                return;
            }
        } else if (this.write) {
            return;
        }
        this.write = true;
        ViewTreeHostDefaultProvider viewTreeHostDefaultProvider = new ViewTreeHostDefaultProvider("LogPersistenceManagerThread", 1);
        this.RatingCompat = viewTreeHostDefaultProvider;
        viewTreeHostDefaultProvider.start();
        this.MediaBrowserCompatMediaItem = new Handler(((ViewTreeHostDefaultProvider) this.RatingCompat).getLooper());
        int i4 = ParcelableVolumeInfo + 109;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r7 == r8.MediaBrowserCompatMediaItem) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r7 == r8.MediaBrowserCompatMediaItem) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean IconCompatParcelizer(o.getNavigationIcon r7, o.getNavigationIcon r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8.serializer()
            int r2 = r8.MediaSessionCompatQueueItem
            java.lang.String r3 = "Fully specified range is not actually fully specified."
            coil3.util.UtilsKt.RemoteActionCompatParcelizer(r3, r1)
            int r1 = r7.MediaSessionCompatQueueItem
            r3 = 0
            r4 = 1
            if (r1 != r0) goto L20
            int r5 = com.huawei.location.ut.MediaMetadataCompat
            int r5 = r5 + 59
            int r6 = r5 % 128
            com.huawei.location.ut.ParcelableVolumeInfo = r6
            int r5 = r5 % r0
            if (r2 != r4) goto L20
            goto L53
        L20:
            if (r1 == r0) goto L37
            if (r1 == 0) goto L37
            int r5 = com.huawei.location.ut.ParcelableVolumeInfo
            int r5 = r5 + 49
            int r6 = r5 % 128
            com.huawei.location.ut.MediaMetadataCompat = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L32
            if (r1 == r2) goto L37
            goto L53
        L32:
            r7 = 0
            r7.hashCode()
            throw r7
        L37:
            int r7 = r7.MediaBrowserCompatMediaItem
            if (r7 == 0) goto L54
            int r1 = com.huawei.location.ut.MediaMetadataCompat
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.location.ut.ParcelableVolumeInfo = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4e
            int r8 = r8.MediaBrowserCompatMediaItem
            r1 = 33
            int r1 = r1 / r3
            if (r7 != r8) goto L53
            goto L54
        L4e:
            int r8 = r8.MediaBrowserCompatMediaItem
            if (r7 != r8) goto L53
            goto L54
        L53:
            return r3
        L54:
            int r7 = com.huawei.location.ut.MediaMetadataCompat
            int r7 = r7 + 101
            int r8 = r7 % 128
            com.huawei.location.ut.ParcelableVolumeInfo = r8
            int r7 = r7 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.location.ut.IconCompatParcelizer(o.getNavigationIcon, o.getNavigationIcon):boolean");
    }

    public accessswap serializer(asList aslist, accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, setWrappedui setwrappedui) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((LocalDocumentsView) this.RatingCompat).write(accesssetlastlayerdrawingwasskippedp, setwrappedui, null);
            aslist.iterator();
            throw null;
        }
        accessswap accessswapVarWrite = ((LocalDocumentsView) this.RatingCompat).write(accesssetlastlayerdrawingwasskippedp, setwrappedui, null);
        Iterator it = aslist.iterator();
        int i3 = MediaMetadataCompat + 33;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        while (true) {
            zzkh zzkhVar = (zzkh) it;
            if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                return accessswapVarWrite;
            }
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) zzkhVar.next();
            accessswapVarWrite = accessswapVarWrite.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.read, nodeCoordinatorCompanionPointerInputSource1);
        }
    }

    public long RemoteActionCompatParcelizer(TextFieldValue textFieldValue, long j, boolean z, seekAnimationsanimation_core seekanimationsanimation_core) {
        alignKFBX0sM alignkfbx0sm;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 97;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.MediaBrowserCompatMediaItem;
        long jIconCompatParcelizer = TextFieldSelectionManager.IconCompatParcelizer(textFieldSelectionManager, textFieldValue, j, z, false, seekanimationsanimation_core, false, null);
        if (!TextRange.m3068equalsimpl(jIconCompatParcelizer, (TextRange) this.RatingCompat)) {
            int i4 = MediaMetadataCompat + 101;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.write = false;
        }
        if (!(!TextRange.m3070getCollapsedimpl(jIconCompatParcelizer))) {
            int i6 = ParcelableVolumeInfo + 15;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            alignkfbx0sm = alignKFBX0sM.Cursor;
        } else {
            alignkfbx0sm = alignKFBX0sM.Selection;
        }
        textFieldSelectionManager.serializer(alignkfbx0sm);
        return jIconCompatParcelizer;
    }

    public static asList RemoteActionCompatParcelizer(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, accessswap accessswapVar) {
        int i = 2 % 2;
        asList aslist = new asList(Collections.EMPTY_LIST, accesssetlastlayerdrawingwasskippedp.serializer());
        Iterator it = accessswapVar.iterator();
        while (it.hasNext()) {
            int i2 = ParcelableVolumeInfo + 99;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) ((Map.Entry) it.next()).getValue();
            if (!(!accesssetlastlayerdrawingwasskippedp.write(nodeCoordinatorCompanionPointerInputSource1))) {
                int i4 = MediaMetadataCompat + 59;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    aslist = aslist.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1);
                    int i5 = 98 / 0;
                } else {
                    aslist = aslist.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1);
                }
            }
        }
        int i6 = ParcelableVolumeInfo + 125;
        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return aslist;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getNavigationIcon IconCompatParcelizer(getNavigationIcon getnavigationicon, LinkedHashSet linkedHashSet, HashSet hashSet) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (getnavigationicon.MediaSessionCompatQueueItem != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                getNavigationIcon getnavigationicon2 = (getNavigationIcon) it.next();
                UtilsKt.IconCompatParcelizer(getnavigationicon2, "Fully specified DynamicRange cannot be null.");
                int i4 = getnavigationicon2.MediaSessionCompatQueueItem;
                UtilsKt.RemoteActionCompatParcelizer("Fully specified DynamicRange must have fully defined encoding.", getnavigationicon2.serializer());
                if (i4 != 1 && IconCompatParcelizer(getnavigationicon, getnavigationicon2, hashSet)) {
                    int i5 = MediaMetadataCompat + 91;
                    ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i6 = 33 / 0;
                    }
                    return getnavigationicon2;
                }
            }
        }
        int i7 = MediaMetadataCompat + 37;
        ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 77;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.RemoteActionCompatParcelizer != 6) {
            return super.toString();
        }
        String str = "SingleSelectionLayout(isStartHandle=" + this.write + ", crossed=" + PlaybackStateCompatCustomAction() + ", info=\n\t" + ((accessanyjd) this.MediaBrowserCompatMediaItem) + ')';
        int i3 = ParcelableVolumeInfo + 103;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return str;
    }

    public static boolean serializer(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, int i, asList aslist, SnapshotVersion snapshotVersion) {
        int i2 = 2 % 2;
        accesssetlastlayerdrawingwasskippedp.getClass();
        boolean z = accesssetlastlayerdrawingwasskippedp instanceof accessoutOfBoundsHit8NAm7pk;
        if (!z) {
            return false;
        }
        int i3 = MediaMetadataCompat;
        int i4 = i3 + 27;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (!z) {
            if (!(accesssetlastlayerdrawingwasskippedp instanceof ancestorToLocal)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
            int i6 = i3 + 85;
            ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        Iterator it = ((accessoutOfBoundsHit8NAm7pk) accesssetlastlayerdrawingwasskippedp).read.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            int i7 = MediaMetadataCompat + 87;
            ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (((specifiesCanFocusProperty) it.next()).serializer.equals(MapboxMap.QFE_LIMIT)) {
                int i9 = MediaMetadataCompat + 63;
                ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    public /* synthetic */ ut(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.RatingCompat = obj;
    }

    public /* synthetic */ ut(int i, Object obj, String str, boolean z) {
        this.RemoteActionCompatParcelizer = i;
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = obj;
        this.write = z;
    }

    public ut(accessgetHasRetrievedMethodcp accessgethasretrievedmethodcp) {
        this.RemoteActionCompatParcelizer = 10;
        this.write = false;
        this.RatingCompat = accessgethasretrievedmethodcp;
    }

    public ut(accessgetRecreateDisplayListcp accessgetrecreatedisplaylistcp) {
        this.RemoteActionCompatParcelizer = 11;
        this.write = false;
        this.MediaBrowserCompatMediaItem = accessgetrecreatedisplaylistcp;
    }

    public /* synthetic */ ut(boolean z, Object obj, Object obj2, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = z;
        this.RatingCompat = obj;
        this.MediaBrowserCompatMediaItem = obj2;
    }

    public ut(Context context) {
        this.RemoteActionCompatParcelizer = 1;
        this.write = false;
        this.RatingCompat = context;
        this.MediaBrowserCompatMediaItem = new KeyEventTypeCompanion(null);
    }

    public ut(SentryAndroidOptions sentryAndroidOptions) {
        this.RemoteActionCompatParcelizer = 16;
        this.MediaBrowserCompatMediaItem = new ArrayList();
        this.write = false;
        this.RatingCompat = sentryAndroidOptions;
    }

    public static void write(HashSet hashSet, getNavigationIcon getnavigationicon, getTrackTintList gettracktintlist) {
        Set set;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            UtilsKt.RemoteActionCompatParcelizer("Cannot update already-empty constraints.", hashSet.isEmpty());
            set = ((setSplitTrack) gettracktintlist.serializer).read(getnavigationicon);
            if (set.isEmpty()) {
                return;
            }
        } else {
            UtilsKt.RemoteActionCompatParcelizer("Cannot update already-empty constraints.", !hashSet.isEmpty());
            set = ((setSplitTrack) gettracktintlist.serializer).read(getnavigationicon);
            if (set.isEmpty()) {
                return;
            }
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(set);
        if (!hashSet.isEmpty()) {
            int i3 = MediaMetadataCompat + 41;
            ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + getnavigationicon + "\nConstraints:\n  " + TextUtils.join("\n  ", set) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
    }

    public ut(ImageReader imageReader) {
        this.RemoteActionCompatParcelizer = 3;
        this.MediaBrowserCompatMediaItem = new Object();
        this.write = true;
        this.RatingCompat = imageReader;
    }

    public ut(getThumbTintList getthumbtintlist) {
        this.RemoteActionCompatParcelizer = 2;
        this.RatingCompat = getthumbtintlist;
        this.MediaBrowserCompatMediaItem = getTrackTintList.serializer(getthumbtintlist);
        int[] iArr = (int[]) getthumbtintlist.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int i = MediaMetadataCompat + 91;
            ParcelableVolumeInfo = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            for (int i3 : iArr) {
                if (i3 == 18) {
                    int i4 = ParcelableVolumeInfo + 35;
                    int i5 = i4 % Fields.SpotShadowColor;
                    MediaMetadataCompat = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 95;
                    ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 2;
                    }
                    z = true;
                    break;
                }
            }
        }
        this.write = z;
        int i9 = MediaMetadataCompat + 83;
        ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public ut(TextFieldSelectionManager textFieldSelectionManager) {
        this.RemoteActionCompatParcelizer = 7;
        this.MediaBrowserCompatMediaItem = textFieldSelectionManager;
        this.write = true;
    }

    public ut(VideoCapture videoCapture, onDrawBehind ondrawbehind, boolean z) {
        this.RemoteActionCompatParcelizer = 4;
        this.MediaBrowserCompatMediaItem = videoCapture;
        this.RatingCompat = ondrawbehind;
        this.write = z;
    }

    public ut(PointF pointF, AndroidGraphicsContext2 androidGraphicsContext2) {
        this.RemoteActionCompatParcelizer = 5;
        this.write = false;
        this.MediaBrowserCompatMediaItem = new Object();
        this.RatingCompat = androidGraphicsContext2;
    }

    public Properties r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        getUriActionForCardlambda0 geturiactionforcardlambda0 = (getUriActionForCardlambda0) this.MediaBrowserCompatMediaItem;
        String str = (String) this.RatingCompat;
        try {
            File file = new File(str.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    int i2 = ParcelableVolumeInfo + 115;
                    MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    geturiactionforcardlambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                }
            } else if (this.write) {
                int i4 = MediaMetadataCompat + 19;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                geturiactionforcardlambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                return null;
            }
            return null;
        } catch (Throwable th3) {
            geturiactionforcardlambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th3, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public boolean RemoteActionCompatParcelizer(long j, float f, d2 d2Var) {
        int i = 2 % 2;
        CopyOnWriteArrayList<accessreadAnimationScale> copyOnWriteArrayList = (CopyOnWriteArrayList) this.MediaBrowserCompatMediaItem;
        Parser.Pair pair = (Parser.Pair) this.RatingCompat;
        if (pair == null) {
            int i2 = MediaMetadataCompat + 99;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            WrappedCompositionsetContent1211.read();
            return false;
        }
        Sdm sdm = (Sdm) pair.write;
        if (sdm == null || !sdm.support(j, f)) {
            return false;
        }
        accessreadAnimationScale accessreadanimationscale = null;
        for (accessreadAnimationScale accessreadanimationscale2 : copyOnWriteArrayList) {
            if (accessreadanimationscale2.read == d2Var) {
                int i4 = MediaMetadataCompat + 105;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                accessreadanimationscale = accessreadanimationscale2;
            }
        }
        if (accessreadanimationscale != null && copyOnWriteArrayList.remove(accessreadanimationscale)) {
            WrappedCompositionsetContent1211.write("SdmProvider", "duplicate request");
            int i5 = ParcelableVolumeInfo + 85;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        copyOnWriteArrayList.add(new accessreadAnimationScale(j, f, d2Var));
        if (!this.write) {
            int i7 = ParcelableVolumeInfo + 99;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (!copyOnWriteArrayList.isEmpty()) {
                i$d.a aVar = new i$d.a(14, this);
                pair.write();
                if (sdm == null) {
                    WrappedCompositionsetContent1211.read("SdmWrapper", "no sdm to start");
                } else {
                    createLifecycleAwareWindowRecomposer createlifecycleawarewindowrecomposer = new createLifecycleAwareWindowRecomposer(aVar);
                    pair.RemoteActionCompatParcelizer = createlifecycleawarewindowrecomposer;
                    sdm.read(createlifecycleawarewindowrecomposer);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmWrapper", "sdm start success");
                }
                this.write = true;
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmProvider", "request success");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:4:0x0014, B:6:0x0029, B:8:0x0031, B:16:0x004f, B:18:0x0057, B:25:0x006d, B:22:0x0060, B:24:0x0068, B:30:0x007f), top: B:46:0x0014, outer: #2 }] */
    public prune read(String str) {
        int i = 2 % 2;
        Object obj = null;
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep(inputStreamReader);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = setCustomUserAttributeStep.serializer;
                setCustomUserAttributeStep.write();
                int i2 = ParcelableVolumeInfo + 31;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iMediaSessionCompatResultReceiverWrapper = -1;
                String strComponentActivity = null;
                while (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == IconCompatParcelizer.NAME) {
                    String strMediaSessionCompatToken = remoteActionCompatParcelizer.MediaSessionCompatToken();
                    int iHashCode = strMediaSessionCompatToken.hashCode();
                    if (iHashCode != -1106363674) {
                        int i4 = MediaMetadataCompat + 47;
                        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (iHashCode == 3575610 && strMediaSessionCompatToken.equals("type")) {
                            strComponentActivity = setCustomUserAttributeStep.ComponentActivity();
                        } else {
                            setCustomUserAttributeStep.ResultReceiver();
                        }
                    } else if (strMediaSessionCompatToken.equals("length")) {
                        iMediaSessionCompatResultReceiverWrapper = remoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        setCustomUserAttributeStep.ResultReceiver();
                    }
                    if (strComponentActivity != null) {
                        int i5 = MediaMetadataCompat + 29;
                        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (iMediaSessionCompatResultReceiverWrapper >= 0) {
                            break;
                        }
                    }
                }
                if (iMediaSessionCompatResultReceiverWrapper < 0) {
                    inputStreamReader.close();
                    return null;
                }
                prune pruneVar = new prune(strComponentActivity, iMediaSessionCompatResultReceiverWrapper);
                inputStreamReader.close();
                return pruneVar;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                    int i7 = ParcelableVolumeInfo + 33;
                    MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((SentryAndroidOptions) this.RatingCompat).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, th3, "Error parsing item header", new Object[0]);
            return null;
        }
        ((SentryAndroidOptions) this.RatingCompat).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, th3, "Error parsing item header", new Object[0]);
        return null;
    }

    public void serializer(d2 d2Var) {
        int i = 2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.MediaBrowserCompatMediaItem;
        Iterator it = copyOnWriteArrayList.iterator();
        accessreadAnimationScale accessreadanimationscale = null;
        while (!(!it.hasNext())) {
            accessreadAnimationScale accessreadanimationscale2 = (accessreadAnimationScale) it.next();
            if (accessreadanimationscale2.read == d2Var) {
                int i2 = ParcelableVolumeInfo + 113;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 90 / 0;
                }
                accessreadanimationscale = accessreadanimationscale2;
            }
        }
        if (accessreadanimationscale == null || !copyOnWriteArrayList.remove(accessreadanimationscale)) {
            WrappedCompositionsetContent1211.read();
            return;
        }
        if (this.write) {
            int i4 = ParcelableVolumeInfo + 67;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (copyOnWriteArrayList.isEmpty()) {
                ((Parser.Pair) this.RatingCompat).write();
                this.write = false;
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmProvider", "remove success");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:5:0x0014, B:7:0x0029, B:9:0x0031, B:24:0x0075, B:14:0x0044, B:16:0x004c, B:17:0x0051, B:21:0x0064, B:22:0x006d, B:32:0x008c, B:35:0x0096), top: B:55:0x0014, outer: #3 }] */
    public fullyDrawnReporter_delegatelambda0 serializer(BufferedInputStream bufferedInputStream, int i, File file) {
        int i2 = 2 % 2;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.RatingCompat;
        fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0 = null;
        try {
            ensureViewModelStore ensureviewmodelstore = new ensureViewModelStore(bufferedInputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(ensureviewmodelstore, StandardCharsets.UTF_8);
                try {
                    SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep(inputStreamReader);
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = setCustomUserAttributeStep.serializer;
                    setCustomUserAttributeStep.write();
                    int i3 = MediaMetadataCompat + 73;
                    ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    String strComponentActivity = null;
                    Date dateRemoteActionCompatParcelizer = null;
                    while (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == IconCompatParcelizer.NAME) {
                        String strMediaSessionCompatToken = remoteActionCompatParcelizer.MediaSessionCompatToken();
                        int iHashCode = strMediaSessionCompatToken.hashCode();
                        if (iHashCode != 55126294) {
                            if (iHashCode == 1874684019 && strMediaSessionCompatToken.equals("platform")) {
                                strComponentActivity = setCustomUserAttributeStep.ComponentActivity();
                            } else {
                                setCustomUserAttributeStep.ResultReceiver();
                            }
                        } else if (strMediaSessionCompatToken.equals("timestamp")) {
                            int i5 = ParcelableVolumeInfo + 89;
                            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 != 0) {
                                setCustomUserAttributeStep.RemoteActionCompatParcelizer(sentryAndroidOptions.getLogger());
                                throw null;
                            }
                            dateRemoteActionCompatParcelizer = setCustomUserAttributeStep.RemoteActionCompatParcelizer(sentryAndroidOptions.getLogger());
                        } else {
                            setCustomUserAttributeStep.ResultReceiver();
                        }
                        if (strComponentActivity != null) {
                            int i6 = ParcelableVolumeInfo + 123;
                            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                            if (i6 % 2 != 0) {
                                fullydrawnreporter_delegatelambda0.hashCode();
                                throw null;
                            }
                            if (dateRemoteActionCompatParcelizer != null) {
                                break;
                            }
                        }
                    }
                    if ("native".equals(strComponentActivity) && dateRemoteActionCompatParcelizer != null) {
                        fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda1 = new fullyDrawnReporter_delegatelambda0(file, dateRemoteActionCompatParcelizer.getTime());
                        int i7 = MediaMetadataCompat + 99;
                        ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        fullydrawnreporter_delegatelambda0 = fullydrawnreporter_delegatelambda1;
                    }
                    inputStreamReader.close();
                    ensureviewmodelstore.close();
                    return fullydrawnreporter_delegatelambda0;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    ensureviewmodelstore.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, th5, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    public String serializer(String str) {
        String str2;
        String str3;
        int i = 2 % 2;
        if (this.RemoteActionCompatParcelizer == 10) {
            if (!this.write) {
                accessgetHasRetrievedMethodcp accessgethasretrievedmethodcp = (accessgetHasRetrievedMethodcp) this.RatingCompat;
                try {
                    this.MediaBrowserCompatMediaItem = accessgetUpdateDisplayListIfDirtyMethodcp.read(new accessgetRecreateDisplayListcp(10000, accessgethasretrievedmethodcp.RemoteActionCompatParcelizer("/code/code1", null), accessgethasretrievedmethodcp.RemoteActionCompatParcelizer("/code/code2", null), accessgethasretrievedmethodcp.RemoteActionCompatParcelizer("/code/code3", null), accessgethasretrievedmethodcp.RemoteActionCompatParcelizer("/code/code4", null), "PBKDF2WithHmacSHA1"));
                } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                    Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
                    this.MediaBrowserCompatMediaItem = null;
                }
                this.write = true;
            }
            if (((SecretKeySpec) this.MediaBrowserCompatMediaItem) == null) {
                str2 = "mKey is null, return default value";
            } else {
                if (!RemoteActionCompatParcelizer(str)) {
                    return null;
                }
                try {
                    return new String(accessgetUpdateDisplayListIfDirtyMethodcp.IconCompatParcelizer((SecretKeySpec) this.MediaBrowserCompatMediaItem, accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(IconCompatParcelizer(str))), Constants.ENCODING);
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused2) {
                    str2 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
                }
            }
            Log.e("AGC_Mark", str2);
            return null;
        }
        if (!this.write) {
            int i2 = MediaMetadataCompat + 27;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            try {
                if (i2 % 2 == 0) {
                    this.RatingCompat = accessgetUpdateDisplayListIfDirtyMethodcp.read((accessgetRecreateDisplayListcp) this.MediaBrowserCompatMediaItem);
                    int i3 = 72 / 0;
                } else {
                    this.RatingCompat = accessgetUpdateDisplayListIfDirtyMethodcp.read((accessgetRecreateDisplayListcp) this.MediaBrowserCompatMediaItem);
                }
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e.getMessage());
                this.RatingCompat = null;
                int i4 = MediaMetadataCompat + 99;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            this.write = true;
        }
        if (((SecretKeySpec) this.RatingCompat) == null || TextUtils.isEmpty(str)) {
            str3 = "decrypt exception: secretKey = " + ((SecretKeySpec) this.RatingCompat) + "raw = " + str;
        } else {
            try {
                return new String(accessgetUpdateDisplayListIfDirtyMethodcp.IconCompatParcelizer((SecretKeySpec) this.RatingCompat, accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(str)), Constants.ENCODING);
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e2) {
                str3 = "decrypt exception:" + e2.getMessage();
            }
        }
        Log.e("AGC_LocalResource", str3);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x028b  */
    public accessswap read(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp) {
        accessgetPointerInputSourcecp accessgetpointerinputsourcecp;
        boolean z;
        fromParentRect fromparentrect;
        ArrayList arrayList;
        Iterator it;
        List<Value> valuesList;
        accessgetPointerInputSourcecp accessgetpointerinputsourcecp2;
        Collection collectionValues;
        byte[] bArrCopyOf;
        int i;
        boolean z2;
        Object obj;
        int i2 = 2;
        int i3 = 2 % 2;
        accesssetlastlayerdrawingwasskippedp.getClass();
        int i4 = 0;
        if (accesssetlastlayerdrawingwasskippedp instanceof accessoutOfBoundsHit8NAm7pk) {
            int i5 = MediaMetadataCompat + 103;
            ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                onEndApplyChanges.read("QueryEngine", "Skipping using indexes for pipelines.", new Object[0]);
                return null;
            }
            onEndApplyChanges.read("QueryEngine", "Skipping using indexes for pipelines.", new Object[0]);
            return null;
        }
        accessgetPointerInputSourcecp accessgetpointerinputsourcecp3 = ((ancestorToLocal) accesssetlastlayerdrawingwasskippedp).IconCompatParcelizer;
        if (accessgetpointerinputsourcecp3.RemoteActionCompatParcelizer()) {
            int i6 = ParcelableVolumeInfo + 29;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        fromParentRect fromparentrectSerializer = accessgetpointerinputsourcecp3.serializer();
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged = (onLayoutModifierNodeChanged) this.MediaBrowserCompatMediaItem;
        onlayoutmodifiernodechanged.getClass();
        drawBorder drawborder = drawBorder.FULL;
        List<fromParentRect> listSerializer = onlayoutmodifiernodechanged.serializer(fromparentrectSerializer);
        for (fromParentRect fromparentrect2 : listSerializer) {
            toParentPosition8S9VItk toparentposition8s9vitkIconCompatParcelizer = onlayoutmodifiernodechanged.IconCompatParcelizer(fromparentrect2);
            if (toparentposition8s9vitkIconCompatParcelizer == null) {
                drawborder = drawBorder.NONE;
                break;
            }
            int size = toparentposition8s9vitkIconCompatParcelizer.write.size();
            HashSet hashSet = new HashSet();
            Iterator it2 = fromparentrect2.read.iterator();
            int i7 = i4;
            while (it2.hasNext()) {
                int i8 = MediaMetadataCompat + 35;
                ParcelableVolumeInfo = i8 % Fields.SpotShadowColor;
                int i9 = i8 % i2;
                Iterator it3 = ((fillVector) it2.next()).read().iterator();
                while (it3.hasNext()) {
                    int i10 = ParcelableVolumeInfo + 121;
                    MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                    if (i10 % i2 != 0) {
                        nodeReused nodereused = (nodeReused) it3.next();
                        childHitTestqzLsGqo childhittestqzlsgqo = nodereused.serializer;
                        updateUnsafe updateunsafe = nodereused.read;
                        childhittestqzlsgqo.equals(childHitTestqzLsGqo.write);
                        throw null;
                    }
                    nodeReused nodereused2 = (nodeReused) it3.next();
                    childHitTestqzLsGqo childhittestqzlsgqo2 = nodereused2.serializer;
                    updateUnsafe updateunsafe2 = nodereused2.read;
                    onLayoutModifierNodeChanged onlayoutmodifiernodechanged2 = onlayoutmodifiernodechanged;
                    if (childhittestqzlsgqo2.equals(childHitTestqzLsGqo.write)) {
                        obj = null;
                    } else {
                        if (!updateunsafe2.equals(updateUnsafe.ARRAY_CONTAINS)) {
                            int i11 = MediaMetadataCompat + 99;
                            ParcelableVolumeInfo = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 == 0) {
                                updateunsafe2.equals(updateUnsafe.ARRAY_CONTAINS_ANY);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (!updateunsafe2.equals(updateUnsafe.ARRAY_CONTAINS_ANY)) {
                                hashSet.add(nodereused2.serializer);
                                obj = null;
                            }
                        }
                        obj = null;
                        i7 = 1;
                    }
                    onlayoutmodifiernodechanged = onlayoutmodifiernodechanged2;
                    i2 = 2;
                }
            }
            onLayoutModifierNodeChanged onlayoutmodifiernodechanged3 = onlayoutmodifiernodechanged;
            for (accessgetSnapshotObserver accessgetsnapshotobserver : fromparentrect2.MediaMetadataCompat) {
                if (!accessgetsnapshotobserver.RemoteActionCompatParcelizer.equals(childHitTestqzLsGqo.write)) {
                    hashSet.add(accessgetsnapshotobserver.RemoteActionCompatParcelizer);
                }
            }
            if (size < hashSet.size() + i7) {
                drawborder = drawBorder.PARTIAL;
            }
            onlayoutmodifiernodechanged = onlayoutmodifiernodechanged3;
            i2 = 2;
            i4 = 0;
        }
        if (fromparentrectSerializer.serializer != -1 && listSerializer.size() > 1 && drawborder == drawBorder.FULL) {
            drawborder = drawBorder.PARTIAL;
        }
        if (drawborder.equals(drawBorder.NONE)) {
            return null;
        }
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged4 = (onLayoutModifierNodeChanged) this.MediaBrowserCompatMediaItem;
        getRectManager.RemoteActionCompatParcelizer(onlayoutmodifiernodechanged4.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = onlayoutmodifiernodechanged4.serializer(fromparentrectSerializer).iterator();
        while (true) {
            if (!it4.hasNext()) {
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    Pair pair = (Pair) it5.next();
                    fromParentRect fromparentrect3 = (fromParentRect) pair.first;
                    toParentPosition8S9VItk toparentposition8s9vitk = (toParentPosition8S9VItk) pair.second;
                    fromparentrect3.getClass();
                    shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblingsWrite = toparentposition8s9vitk.write();
                    if (shouldsharepointerinputwithsiblingsWrite == null) {
                        it = it5;
                        valuesList = null;
                    } else {
                        Iterator it6 = fromparentrect3.read(shouldsharepointerinputwithsiblingsWrite.IconCompatParcelizer).iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                int i12 = MediaMetadataCompat + 59;
                                ParcelableVolumeInfo = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                nodeReused nodereused3 = (nodeReused) it6.next();
                                int[] iArr = hit5ShdDok.RemoteActionCompatParcelizer;
                                updateUnsafe updateunsafe3 = nodereused3.read;
                                Value value = nodereused3.RemoteActionCompatParcelizer;
                                int i14 = iArr[updateunsafe3.ordinal()];
                                it = it5;
                                if (i14 == 1) {
                                    valuesList = value.getArrayValue().getValuesList();
                                } else if (i14 != 2) {
                                    it5 = it;
                                } else {
                                    valuesList = Collections.singletonList(value);
                                }
                            } else {
                                it = it5;
                                valuesList = null;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it7 = toparentposition8s9vitk.RemoteActionCompatParcelizer().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            accessgetpointerinputsourcecp2 = accessgetpointerinputsourcecp3;
                            collectionValues = null;
                            break;
                        }
                        childHitTestqzLsGqo childhittestqzlsgqo3 = ((shouldSharePointerInputWithSiblings) it7.next()).IconCompatParcelizer;
                        for (nodeReused nodereused4 : fromparentrect3.read(childhittestqzlsgqo3)) {
                            Iterator it8 = it7;
                            int[] iArr2 = hit5ShdDok.RemoteActionCompatParcelizer;
                            accessgetpointerinputsourcecp2 = accessgetpointerinputsourcecp3;
                            updateUnsafe updateunsafe4 = nodereused4.read;
                            Value value2 = nodereused4.RemoteActionCompatParcelizer;
                            int i15 = iArr2[updateunsafe4.ordinal()];
                            if (i15 != 3) {
                                int i16 = MediaMetadataCompat + 125;
                                ParcelableVolumeInfo = i16 % Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                                if (i15 != 4) {
                                    if (i15 == 5 || i15 == 6) {
                                        linkedHashMap.put(childhittestqzlsgqo3, value2);
                                        collectionValues = linkedHashMap.values();
                                        break;
                                    }
                                } else {
                                    linkedHashMap.put(childhittestqzlsgqo3, value2);
                                }
                            } else {
                                linkedHashMap.put(childhittestqzlsgqo3, value2);
                            }
                            it7 = it8;
                            accessgetpointerinputsourcecp3 = accessgetpointerinputsourcecp2;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it9 = toparentposition8s9vitk.RemoteActionCompatParcelizer().iterator();
                    boolean zBooleanValue = true;
                    while (it9.hasNext()) {
                        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings = (shouldSharePointerInputWithSiblings) it9.next();
                        Iterator it10 = it9;
                        boolean zEquals = shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer.equals(NodeCoordinatorCompanion.ASCENDING);
                        setBefore setbefore = fromparentrect3.MediaBrowserCompatMediaItem;
                        Pair pairWrite = zEquals ^ true ? fromparentrect3.write(shouldsharepointerinputwithsiblings, setbefore) : fromparentrect3.serializer(shouldsharepointerinputwithsiblings, setbefore);
                        arrayList5.add((Value) pairWrite.first);
                        zBooleanValue &= ((Boolean) pairWrite.second).booleanValue();
                        int i18 = MediaMetadataCompat + 83;
                        ParcelableVolumeInfo = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        it9 = it10;
                    }
                    setBefore setbefore2 = new setBefore(arrayList5, zBooleanValue);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it11 = toparentposition8s9vitk.RemoteActionCompatParcelizer().iterator();
                    boolean zBooleanValue2 = true;
                    while (it11.hasNext()) {
                        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings2 = (shouldSharePointerInputWithSiblings) it11.next();
                        Iterator it12 = it11;
                        fromParentRect fromparentrect4 = fromparentrectSerializer;
                        boolean zEquals2 = shouldsharepointerinputwithsiblings2.RemoteActionCompatParcelizer.equals(NodeCoordinatorCompanion.ASCENDING);
                        setBefore setbefore3 = fromparentrect3.IconCompatParcelizer;
                        Pair pairWrite2 = zEquals2 ? fromparentrect3.write(shouldsharepointerinputwithsiblings2, setbefore3) : fromparentrect3.serializer(shouldsharepointerinputwithsiblings2, setbefore3);
                        arrayList6.add((Value) pairWrite2.first);
                        zBooleanValue2 &= ((Boolean) pairWrite2.second).booleanValue();
                        it11 = it12;
                        fromparentrectSerializer = fromparentrect4;
                    }
                    fromParentRect fromparentrect5 = fromparentrectSerializer;
                    setBefore setbefore4 = new setBefore(arrayList6, zBooleanValue2);
                    if (onEndApplyChanges.RemoteActionCompatParcelizer()) {
                        onEndApplyChanges.read("SQLiteIndexManager", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", toparentposition8s9vitk, fromparentrect3, valuesList, setbefore2, setbefore4);
                    }
                    Object[] objArrIconCompatParcelizer = onLayoutModifierNodeChanged.IconCompatParcelizer(toparentposition8s9vitk, fromparentrect3, setbefore2.write);
                    String str = setbefore2.RemoteActionCompatParcelizer ? ">=" : ">";
                    Object[] objArrIconCompatParcelizer2 = onLayoutModifierNodeChanged.IconCompatParcelizer(toparentposition8s9vitk, fromparentrect3, arrayList6);
                    String str2 = zBooleanValue2 ? "<=" : "<";
                    Object[] objArrIconCompatParcelizer3 = onLayoutModifierNodeChanged.IconCompatParcelizer(toparentposition8s9vitk, fromparentrect3, collectionValues);
                    int i20 = toparentposition8s9vitk.RemoteActionCompatParcelizer;
                    int iMax = Math.max(objArrIconCompatParcelizer.length, objArrIconCompatParcelizer2.length) * (valuesList != null ? valuesList.size() : 1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT document_key, directional_value FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value ");
                    sb.append(str);
                    sb.append(" ? AND directional_value ");
                    sb.append(str2);
                    sb.append(" ? ");
                    StringBuilder sb2 = Util.read(sb, iMax, " UNION ");
                    if (objArrIconCompatParcelizer3 != null) {
                        StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
                        sb3.append((CharSequence) sb2);
                        sb3.append(") WHERE directional_value NOT IN (");
                        sb3.append((CharSequence) Util.read("?", objArrIconCompatParcelizer3.length, ", "));
                        sb3.append(")");
                        sb2 = sb3;
                    }
                    int size2 = iMax / (valuesList != null ? valuesList.size() : 1);
                    Object[] objArr = new Object[(iMax * 5) + (objArrIconCompatParcelizer3 != null ? objArrIconCompatParcelizer3.length : 0)];
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < iMax) {
                        objArr[i22] = Integer.valueOf(i20);
                        objArr[i22 + 1] = onlayoutmodifiernodechanged4.ParcelableVolumeInfo;
                        int i23 = i22 + 3;
                        if (valuesList != null) {
                            Value value3 = valuesList.get(i21 / size2);
                            toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = new toParentPosition8S9VItkdefault();
                            transformFromAncestorEL8BTi8 transformfromancestorel8bti8RemoteActionCompatParcelizer = toparentposition8s9vitkdefault.RemoteActionCompatParcelizer(NodeCoordinatorCompanion.ASCENDING);
                            toCoordinator.write(value3, transformfromancestorel8bti8RemoteActionCompatParcelizer);
                            transformfromancestorel8bti8RemoteActionCompatParcelizer.serializer();
                            updateLayerParametersdefault updatelayerparametersdefault = toparentposition8s9vitkdefault.write;
                            bArrCopyOf = Arrays.copyOf(updatelayerparametersdefault.read, updatelayerparametersdefault.write);
                        } else {
                            bArrCopyOf = onLayoutModifierNodeChanged.RemoteActionCompatParcelizer;
                        }
                        objArr[i22 + 2] = bArrCopyOf;
                        int i24 = i21 % size2;
                        objArr[i23] = objArrIconCompatParcelizer[i24];
                        objArr[i22 + 4] = objArrIconCompatParcelizer2[i24];
                        i21++;
                        i22 += 5;
                        valuesList = valuesList;
                        i20 = i20;
                    }
                    if (objArrIconCompatParcelizer3 != null) {
                        int length = objArrIconCompatParcelizer3.length;
                        int i25 = 0;
                        while (i25 < length) {
                            objArr[i22] = objArrIconCompatParcelizer3[i25];
                            i25++;
                            i22++;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(sb2.toString());
                    arrayList7.addAll(Arrays.asList(objArr));
                    Object[] array = arrayList7.toArray();
                    arrayList2.add(String.valueOf(array[0]));
                    arrayList3.addAll(Arrays.asList(array).subList(1, array.length));
                    it5 = it;
                    fromparentrectSerializer = fromparentrect5;
                    accessgetpointerinputsourcecp3 = accessgetpointerinputsourcecp2;
                }
                accessgetpointerinputsourcecp = accessgetpointerinputsourcecp3;
                z = true;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(TextUtils.join(" UNION ", arrayList2));
                sb4.append("ORDER BY directional_value, document_key ");
                fromparentrect = fromparentrectSerializer;
                List list = fromparentrect.MediaMetadataCompat;
                long j = fromparentrect.serializer;
                sb4.append(((accessgetSnapshotObserver) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list)).write.equals(accessgetOnCommitAffectingLayercp.ASCENDING) ? "asc " : "desc ");
                String strM = ff$$ExternalSyntheticOutline0.m("SELECT DISTINCT document_key FROM (", sb4.toString(), ")");
                if (j != -1) {
                    strM = strM + " LIMIT " + j;
                }
                getRectManager.RemoteActionCompatParcelizer(arrayList3.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
                x xVar = onlayoutmodifiernodechanged4.serializer.read(strM);
                xVar.IconCompatParcelizer(arrayList3.toArray());
                ArrayList arrayList8 = new ArrayList();
                Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
                while (cursorIconCompatParcelizer.moveToNext()) {
                    try {
                        arrayList8.add(new visitNodes(shareWithSiblings.IconCompatParcelizer(cursorIconCompatParcelizer.getString(0))));
                    } catch (Throwable th) {
                        if (cursorIconCompatParcelizer == null) {
                            throw th;
                        }
                        int i26 = MediaMetadataCompat + 99;
                        ParcelableVolumeInfo = i26 % Fields.SpotShadowColor;
                        try {
                            if (i26 % 2 != 0) {
                                cursorIconCompatParcelizer.close();
                                throw th;
                            }
                            cursorIconCompatParcelizer.close();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                cursorIconCompatParcelizer.close();
                onEndApplyChanges.read("SQLiteIndexManager", "Index scan returned %s documents", Integer.valueOf(arrayList8.size()));
                arrayList = arrayList8;
                break;
            }
            fromParentRect fromparentrect6 = (fromParentRect) it4.next();
            toParentPosition8S9VItk toparentposition8s9vitkIconCompatParcelizer2 = onlayoutmodifiernodechanged4.IconCompatParcelizer(fromparentrect6);
            if (toparentposition8s9vitkIconCompatParcelizer2 == null) {
                int i27 = MediaMetadataCompat + 47;
                ParcelableVolumeInfo = i27 % Fields.SpotShadowColor;
                if (i27 % 2 == 0) {
                    throw null;
                }
                accessgetpointerinputsourcecp = accessgetpointerinputsourcecp3;
                fromparentrect = fromparentrectSerializer;
                z = true;
                arrayList = null;
                break;
            }
            arrayList4.add(Pair.create(fromparentrect6, toparentposition8s9vitkIconCompatParcelizer2));
        }
        if (arrayList != null) {
            z2 = z;
            i = 0;
        } else {
            i = 0;
            z2 = false;
        }
        getRectManager.RemoteActionCompatParcelizer(z2, "index manager must return results for partial and full indexes.", new Object[i]);
        accessswap accessswapVarSerializer = ((LocalDocumentsView) this.RatingCompat).serializer(arrayList);
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged5 = (onLayoutModifierNodeChanged) this.MediaBrowserCompatMediaItem;
        onlayoutmodifiernodechanged5.getClass();
        ArrayList arrayList9 = new ArrayList();
        Iterator it13 = onlayoutmodifiernodechanged5.serializer(fromparentrect).iterator();
        while (it13.hasNext()) {
            toParentPosition8S9VItk toparentposition8s9vitkIconCompatParcelizer3 = onlayoutmodifiernodechanged5.IconCompatParcelizer((fromParentRect) it13.next());
            if (toparentposition8s9vitkIconCompatParcelizer3 != null) {
                arrayList9.add(toparentposition8s9vitkIconCompatParcelizer3);
            }
        }
        setWrappedui setwrappeduiRemoteActionCompatParcelizer = onLayoutModifierNodeChanged.RemoteActionCompatParcelizer(arrayList9);
        asList aslistRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accesssetlastlayerdrawingwasskippedp, accessswapVarSerializer);
        if (!serializer(accesssetlastlayerdrawingwasskippedp, arrayList.size(), aslistRemoteActionCompatParcelizer, setwrappeduiRemoteActionCompatParcelizer.serializer)) {
            return serializer(aslistRemoteActionCompatParcelizer, accesssetlastlayerdrawingwasskippedp, setwrappeduiRemoteActionCompatParcelizer);
        }
        shareWithSiblings sharewithsiblings = accessgetpointerinputsourcecp.MediaSessionCompatQueueItem;
        List list2 = Collections.EMPTY_LIST;
        return read(new ancestorToLocal(new accessgetPointerInputSourcecp(sharewithsiblings, accesssetDrawBlockParentLayerp.LIMIT_TO_FIRST)));
    }

    public static void MediaSessionCompatQueueItem() {
        int iRemoteActionCompatParcelizer = ServicesException.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = ServicesException.RemoteActionCompatParcelizer();
        IconCompatParcelizer(ServicesException.RemoteActionCompatParcelizer(), new Object[0], -1196652480, iRemoteActionCompatParcelizer, 1196652481, iRemoteActionCompatParcelizer2, ServicesException.RemoteActionCompatParcelizer());
    }

    public static void RemoteActionCompatParcelizer(BufferedInputStream bufferedInputStream, long j) {
        IconCompatParcelizer(ServicesException.RemoteActionCompatParcelizer(), new Object[]{bufferedInputStream, Long.valueOf(j)}, -720376203, ServicesException.RemoteActionCompatParcelizer(), 720376203, ServicesException.RemoteActionCompatParcelizer(), ServicesException.RemoteActionCompatParcelizer());
    }
}
