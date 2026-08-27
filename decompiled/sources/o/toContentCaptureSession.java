package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.CamcorderProfile;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.Task;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.ucs.credential.outer.HACapability;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public class toContentCaptureSession implements getFirstBaselineToTopHeight, onReadoutStarted, setTextClassifier, androidx.compose.foundation.layout.Arrangement.Horizontal, getD, rotateUv8p0NA, DrawScope, clipPathKD09W0M, obtainLayerPaint, OuterPlacementScope, accessgetNumPadRightParenthesiscp, AndroidFontResourceLoader, PausedPrecompositionImpl, HACapability, ViewCompatShims, ScrollCaptureCandidate {
    public static volatile toContentCaptureSession RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;
    public static final /* synthetic */ toContentCaptureSession IconCompatParcelizer = new toContentCaptureSession(21);
    public static final /* synthetic */ toContentCaptureSession serializer = new toContentCaptureSession(22);
    public static final /* synthetic */ toContentCaptureSession read = new toContentCaptureSession(23);

    public toContentCaptureSession() throws KfsException {
        this.write = 1;
        try {
            Method method = Class.forName("com.huawei.security.keystore.HwUniversalKeyStoreProvider").getMethod("install", null);
            method.setAccessible(true);
            method.invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("install HwKeyStore fail:");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new KfsException(sbIconCompatParcelizer.toString());
        }
    }

    @Override // o.ScrollCaptureCandidate
    public String IconCompatParcelizer(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    @Override // o.getD
    public void IconCompatParcelizer(int i) {
    }

    @Override // o.onReadoutStarted
    public boolean IconCompatParcelizer(mapToBase maptobase) {
        return false;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public void RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, int i, int[] iArr, androidx.compose.ui.unit.LayoutDirection layoutDirection, int[] iArr2) {
        androidx.compose.foundation.layout.Arrangement.serializer(iArr, iArr2, false);
    }

    @Override // o.getD
    public void o_() {
    }

    @Override // o.getD
    public Bitmap read(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public void read(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o.rotateUv8p0NA
    public void read(Bitmap bitmap, getD getd) {
    }

    @Override // o.rotateUv8p0NA
    public void serializer() {
    }

    @Override // o.OuterPlacementScope
    public /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // o.AndroidFontResourceLoader
    public Object write(getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations) {
        return getlocalsavedstateregistryownerannotations.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    @Override // o.getFirstBaselineToTopHeight
    public boolean write(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // o.DrawScope
    public void IconCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // o.DrawScope
    public void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // o.getD
    public Bitmap read(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((zzdz) obj).MediaSessionCompatResultReceiverWrapper();
        zzdd zzddVar = new zzdd(null, (ParentDataModifierDefaultImpls) obj2);
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        int i = getMinusEK5gGoQ.IconCompatParcelizer;
        parcelZza.writeStrongBinder(zzddVar.asBinder());
        getnumpaddeleteek5ggoq.zzc(67, parcelZza);
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((List) obj);
    }

    public static cubicTo serializer(androidx.navigation.internal.NavContext navContext, opN5in7k0 opn5in7k0, Bundle bundle, toColorLong8_81llA tocolorlong8_81lla, getInternalPath getinternalpath) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        opn5in7k0.getClass();
        tocolorlong8_81lla.getClass();
        return new cubicTo(navContext, opn5in7k0, bundle, tocolorlong8_81lla, getinternalpath, string, null);
    }

    @Override // o.ViewCompatShims
    public void RemoteActionCompatParcelizer(long j) {
        WrappedCompositionsetContent1211.write("IdleModel", "current model is idle,do nothing");
    }

    @Override // com.huawei.wisesecurity.ucs.credential.outer.HACapability
    public void onEvent(Context context, String str, CollectionInfo collectionInfo) {
        CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().RemoteActionCompatParcelizer(1, str, ((ClearAndSetSemanticsElement) collectionInfo).read);
    }

    @Override // o.ViewCompatShims
    public void read() {
        WrappedCompositionsetContent1211.write("IdleModel", "current model is idle,do nothing");
    }

    public String toString() {
        return this.write != 7 ? super.toString() : "AbsoluteArrangement#Left";
    }

    @Override // o.setTextClassifier
    public Object read(Object obj) throws androidx.camera.core.ImageCaptureException {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk;
        int i = 5;
        if (this.write != 5) {
            return obj;
        }
        CaptureSessionStuckQuirk captureSessionStuckQuirk = (CaptureSessionStuckQuirk) obj;
        getInflatedId getinflatedid = captureSessionStuckQuirk.read;
        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk.write;
        if (androidx.camera.core.internal.utils.ImageUtil.read(getinflatedid.write())) {
            try {
                getE gete = DeactivateEncoderSurfaceBeforeStopEncoderQuirk.serializer;
                ByteBuffer byteBufferWrite = getinflatedid.IconCompatParcelizer()[0].write();
                byteBufferWrite.rewind();
                byte[] bArr = new byte[byteBufferWrite.capacity()];
                byteBufferWrite.get(bArr);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk(new takeOrElse3MmeM6k(new ByteArrayInputStream(bArr)));
                getinflatedid.IconCompatParcelizer()[0].write().rewind();
            } catch (IOException e) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk = null;
        }
        if (((androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) getSurfaceProvider.read.read(androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class)) != null) {
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = nativeGetYUVImageVUOff.RemoteActionCompatParcelizer;
        } else if (androidx.camera.core.internal.utils.ImageUtil.read(getinflatedid.write())) {
            coil3.util.UtilsKt.IconCompatParcelizer(deactivateEncoderSurfaceBeforeStopEncoderQuirk, "JPEG image must have exif.");
            android.util.Size size = new android.util.Size(getinflatedid.RatingCompat(), getinflatedid.serializer());
            int iWrite = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem - deactivateEncoderSurfaceBeforeStopEncoderQuirk.write();
            android.util.Size size2 = MediaStoreVideoCannotWrite.serializer(MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer(iWrite)) ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
            android.graphics.Matrix matrixIconCompatParcelizer = MediaStoreVideoCannotWrite.IconCompatParcelizer(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iWrite, false);
            RectF rectF = new RectF(imageCaptureFailedWhenVideoCaptureIsBoundQuirk.read);
            matrixIconCompatParcelizer.mapRect(rectF);
            rectF.sort();
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.round(rect);
            int iWrite2 = deactivateEncoderSurfaceBeforeStopEncoderQuirk.write();
            android.graphics.Matrix matrix = new android.graphics.Matrix(imageCaptureFailedWhenVideoCaptureIsBoundQuirk.RatingCompat);
            matrix.postConcat(matrixIconCompatParcelizer);
            CameraXExternalSyntheticLambda0 jVar = getinflatedid.read() instanceof getDisplayManager ? ((getDisplayManager) getinflatedid.read()).serializer : new com.huawei.hmf.tasks.a.j(i);
            getinflatedid.write();
            return new getViewPort(getinflatedid, deactivateEncoderSurfaceBeforeStopEncoderQuirk, getinflatedid.write(), size2, rect, iWrite2, matrix, jVar);
        }
        android.graphics.Rect rect2 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.read;
        int i2 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem;
        android.graphics.Matrix matrix2 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.RatingCompat;
        CameraXExternalSyntheticLambda0 jVar2 = getinflatedid.read() instanceof getDisplayManager ? ((getDisplayManager) getinflatedid.read()).serializer : new com.huawei.hmf.tasks.a.j(i);
        android.util.Size size3 = new android.util.Size(getinflatedid.RatingCompat(), getinflatedid.serializer());
        if (androidx.camera.core.internal.utils.ImageUtil.read(getinflatedid.write())) {
            coil3.util.UtilsKt.IconCompatParcelizer(deactivateEncoderSurfaceBeforeStopEncoderQuirk, "JPEG image must have Exif.");
        }
        return new getViewPort(getinflatedid, deactivateEncoderSurfaceBeforeStopEncoderQuirk, getinflatedid.write(), size3, rect2, i2, matrix2, jVar2);
    }

    @Override // o.getFirstBaselineToTopHeight
    public CamcorderProfile RemoteActionCompatParcelizer(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // o.ViewCompatShims
    public void p_() {
        WrappedCompositionsetContent1211.write("IdleModel", "current model is idle,do nothing");
    }

    public /* synthetic */ toContentCaptureSession(int i) {
        this.write = i;
    }

    public /* synthetic */ toContentCaptureSession(isShowingLayoutBounds isshowinglayoutbounds, int i, int i2) {
        this.write = 27;
    }

    public /* synthetic */ toContentCaptureSession(boolean z) {
        this.write = 14;
    }

    public toContentCaptureSession(setTopLeftgyyYBs settopleftgyyybs, getSupportsSoftwareRendering getsupportssoftwarerendering) {
        this.write = 18;
    }
}
