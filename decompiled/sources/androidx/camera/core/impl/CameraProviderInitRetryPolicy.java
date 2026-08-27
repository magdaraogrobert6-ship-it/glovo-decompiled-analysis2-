package androidx.camera.core.impl;

import o.CryptoObjectUtils;
import o.SurfaceProcessingQuirk;
import o.nativeConvertAndroid420ToBitmap;
import o.nativeCopyBetweenByteBufferAndBitmap;
import o.newChildScope;
import o.setInflatedId;

/* JADX INFO: loaded from: classes.dex */
public final class CameraProviderInitRetryPolicy implements newChildScope {
    public final /* synthetic */ int read;
    public final newChildScope serializer;

    @Override // o.newChildScope
    public final CryptoObjectUtils serializer(nativeConvertAndroid420ToBitmap nativeconvertandroid420tobitmap) {
        int i = this.read;
        newChildScope newchildscope = this.serializer;
        if (i == 0) {
            return ((SurfaceProcessingQuirk) newchildscope).serializer(nativeconvertandroid420tobitmap);
        }
        if (((SurfaceProcessingQuirk) ((CameraProviderInitRetryPolicy) newchildscope).serializer).serializer(nativeconvertandroid420tobitmap).MediaDescriptionCompat) {
            return CryptoObjectUtils.write;
        }
        Throwable th = nativeconvertandroid420tobitmap.RemoteActionCompatParcelizer;
        if (th instanceof CameraValidator$CameraIdListIncorrectException) {
            setInflatedId.serializer("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
            if (((CameraValidator$CameraIdListIncorrectException) th).serializer > 0) {
                return CryptoObjectUtils.RemoteActionCompatParcelizer;
            }
        }
        return CryptoObjectUtils.IconCompatParcelizer;
    }

    public CameraProviderInitRetryPolicy(long j, int i) {
        this.read = i;
        if (i != 1) {
            this.serializer = new SurfaceProcessingQuirk(j, new nativeCopyBetweenByteBufferAndBitmap(j));
        } else {
            this.serializer = new CameraProviderInitRetryPolicy(j, 0);
        }
    }

    @Override // o.newChildScope
    public final long RemoteActionCompatParcelizer() {
        return this.read != 0 ? ((SurfaceProcessingQuirk) ((CameraProviderInitRetryPolicy) this.serializer).serializer).write : ((SurfaceProcessingQuirk) this.serializer).write;
    }
}
