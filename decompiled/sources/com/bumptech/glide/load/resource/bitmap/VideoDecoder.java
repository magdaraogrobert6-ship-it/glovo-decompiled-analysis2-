package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.transition.Transition$1;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import com.huawei.hmf.tasks.a.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import o.DrawScope;
import o.accessasDrawTransform;
import o.accessgetMinp;
import o.generateOetf;
import o.getCanvas;
import o.getD;
import o.getDefaultDensity;
import o.getEotfFuncui_graphics;
import o.getInverseTransform;
import o.toContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoder implements getInverseTransform {
    public final getD IconCompatParcelizer;
    public final DrawScope MediaBrowserCompatMediaItem;
    public final Transition$1 MediaMetadataCompat = serializer;
    public static final accessgetMinp RemoteActionCompatParcelizer = new accessgetMinp("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new getDefaultDensity(0));
    public static final accessgetMinp write = new accessgetMinp("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new getDefaultDensity(2));
    public static final Transition$1 serializer = new Transition$1(15);
    public static final List read = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) throws Exception {
        int i3;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long jLongValue = ((Long) geteotffuncui_graphics.serializer(RemoteActionCompatParcelizer)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        Integer num = (Integer) geteotffuncui_graphics.serializer(write);
        if (num == null) {
            num = 2;
        }
        accessasDrawTransform accessasdrawtransform = (accessasDrawTransform) geteotffuncui_graphics.serializer(accessasDrawTransform.read);
        if (accessasdrawtransform == null) {
            accessasdrawtransform = accessasDrawTransform.RemoteActionCompatParcelizer;
        }
        accessasDrawTransform accessasdrawtransform2 = accessasdrawtransform;
        this.MediaMetadataCompat.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(mediaMetadataRetriever, obj);
            i3 = 29;
            try {
                Bitmap bitmapSerializer = serializer(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, accessasdrawtransform2);
                if (Build.VERSION.SDK_INT < 29) {
                    mediaMetadataRetriever.release();
                } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                    mediaMetadataRetriever.close();
                } else if (mediaMetadataRetriever instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!zIsTerminated2) {
                            try {
                                zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    mediaMetadataRetriever.release();
                }
                return new getCanvas(bitmapSerializer, this.IconCompatParcelizer);
            } catch (Throwable th) {
                th = th;
                if (Build.VERSION.SDK_INT < i3) {
                    mediaMetadataRetriever.release();
                } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                    mediaMetadataRetriever.close();
                } else if (mediaMetadataRetriever instanceof ExecutorService) {
                    ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                        executorService2.shutdown();
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z) {
                                    executorService2.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    mediaMetadataRetriever.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 29;
        }
    }

    public VideoDecoder(getD getd, DrawScope drawScope) {
        this.IconCompatParcelizer = getd;
        this.MediaBrowserCompatMediaItem = drawScope;
    }

    public static VideoDecoder read(getD getd) {
        return new VideoDecoder(getd, new Timestamp.Companion(0));
    }

    public static VideoDecoder serializer(getD getd) {
        return new VideoDecoder(getd, new toContentCaptureSession(16));
    }

    public static VideoDecoder write(getD getd) {
        return new VideoDecoder(getd, new j(15));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    public final Bitmap serializer(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, accessasDrawTransform accessasdrawtransform) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                try {
                    if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                        mediaExtractor = new MediaExtractor();
                        try {
                            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(mediaExtractor, obj);
                            int trackCount = mediaExtractor.getTrackCount();
                            for (int i9 = 0; i9 < trackCount; i9++) {
                                if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i9).getString("mime"))) {
                                    mediaExtractor.release();
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot decode VP8 video on CrOS.");
                                    return null;
                                }
                            }
                        } catch (Throwable unused) {
                            Log.isLoggable("VideoDecoder", 3);
                            if (mediaExtractor != null) {
                            }
                            if (i2 != Integer.MIN_VALUE) {
                                try {
                                    i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                    i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                    i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                    if (i8 != 90) {
                                        i7 = i6;
                                        i6 = i7;
                                    } else {
                                        i7 = i6;
                                        i6 = i7;
                                    }
                                    float f = accessasdrawtransform.read(i6, i7, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * f), Math.round(f * i7));
                                } catch (Throwable unused2) {
                                    Log.isLoggable("VideoDecoder", 3);
                                }
                            }
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
                            }
                            if (!Build.MODEL.startsWith("Pixel")) {
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 30) {
                                    try {
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                        i5 = Integer.parseInt(strExtractMetadata);
                                        int i10 = Integer.parseInt(strExtractMetadata2);
                                        if (i5 != 7) {
                                            Log.isLoggable("VideoDecoder", 3);
                                            Matrix matrix = new Matrix();
                                            matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                        } else {
                                            Log.isLoggable("VideoDecoder", 3);
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                        }
                                    } catch (NumberFormatException unused3) {
                                        Log.isLoggable("VideoDecoder", 3);
                                    }
                                }
                            } else {
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 30) {
                                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                    i5 = Integer.parseInt(strExtractMetadata3);
                                    int i11 = Integer.parseInt(strExtractMetadata4);
                                    if (i5 != 7) {
                                        Log.isLoggable("VideoDecoder", 3);
                                        Matrix matrix3 = new Matrix();
                                        matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                    } else {
                                        Log.isLoggable("VideoDecoder", 3);
                                        Matrix matrix4 = new Matrix();
                                        matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                return bitmapCreateBitmap;
                            }
                            throw new VideoDecoderException("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
                        }
                        mediaExtractor.release();
                    }
                } catch (Throwable unused4) {
                    mediaExtractor = null;
                }
                Log.isLoggable("VideoDecoder", 3);
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            } catch (Throwable th) {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    throw th;
                }
                throw th;
            }
        }
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && accessasdrawtransform != accessasDrawTransform.write) {
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i8 != 90 || i8 == 270) {
                i7 = i6;
                i6 = i7;
            }
            float f2 = accessasdrawtransform.read(i6, i7, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * f2), Math.round(f2 * i7));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (!Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            Iterator it = read.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
            i5 = Integer.parseInt(strExtractMetadata5);
            int i12 = Integer.parseInt(strExtractMetadata6);
            if (i5 != 7) {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix5 = new Matrix();
                matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
            } else {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            }
        } else {
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
                i5 = Integer.parseInt(strExtractMetadata7);
                int i13 = Integer.parseInt(strExtractMetadata8);
                if ((i5 != 7 || i5 == 6) && i13 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Log.isLoggable("VideoDecoder", 3);
                    Matrix matrix7 = new Matrix();
                    matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
                }
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new VideoDecoderException("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }

    final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException(String str) {
            super(str);
        }
    }
}
