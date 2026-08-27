package o;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sentiance.core.model.events.E$b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class setRequestedFrameRate {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaSessionCompatQueueItem;
    public volatile i$d.a RemoteActionCompatParcelizer;
    public final int read;
    public volatile ByteBuffer serializer;
    public volatile Bitmap write;

    public static setRequestedFrameRate RemoteActionCompatParcelizer(android.media.Image image, int i) {
        int iLimit;
        setRequestedFrameRate setrequestedframerate;
        Bitmap bitmapCreateBitmap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        write(i);
        accessgetSystemNavigationDowncp.write("Only JPEG and YUV_420_888 are supported now", image.getFormat() == 256 || image.getFormat() == 35);
        android.media.Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            int iLimit2 = image.getPlanes()[0].getBuffer().limit();
            accessgetSystemNavigationDowncp.write("Only JPEG is supported now", image.getFormat() == 256);
            android.media.Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected image format, JPEG should have exactly 1 image plane");
                return null;
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            if (i == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height);
            } else {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix, true);
            }
            iLimit = iLimit2;
            setrequestedframerate = new setRequestedFrameRate(bitmapCreateBitmap);
        } else {
            for (android.media.Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            setRequestedFrameRate setrequestedframerate2 = new setRequestedFrameRate(image, image.getWidth(), image.getHeight(), i);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
            setrequestedframerate = setrequestedframerate2;
        }
        write(image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), iLimit, i);
        return setrequestedframerate;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5 A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: FileNotFoundException -> 0x00f9, TryCatch #1 {FileNotFoundException -> 0x00f9, blocks: (B:3:0x001b, B:5:0x0021, B:7:0x002f, B:33:0x0086, B:34:0x009b, B:46:0x00cb, B:48:0x00d5, B:36:0x009f, B:37:0x00a3, B:38:0x00aa, B:39:0x00ae, B:40:0x00b5, B:41:0x00b9, B:43:0x00c0, B:32:0x0080, B:29:0x0070, B:52:0x00f1, B:53:0x00f8), top: B:60:0x001b }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009b. Please report as an issue. */
    public static setRequestedFrameRate serializer(Context context, Uri uri) {
        takeOrElse3MmeM6k takeorelse3mmem6k;
        android.graphics.Matrix matrix;
        android.graphics.Matrix matrix2;
        Bitmap bitmapCreateBitmap;
        accessgetSystemNavigationDowncp.serializer(context, "Please provide a valid Context");
        accessgetSystemNavigationDowncp.serializer(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ImageUtils imageUtils = ImageUtils.write;
        ContentResolver contentResolver = context.getContentResolver();
        imageUtils.getClass();
        toZui_graphics tozui_graphics = ImageUtils.RemoteActionCompatParcelizer;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int iSerializer = 0;
            android.graphics.Matrix matrix3 = null;
            if (RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            takeorelse3mmem6k = new takeOrElse3MmeM6k(inputStreamOpenInputStream);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        takeorelse3mmem6k = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e) {
                            e = e;
                            tozui_graphics.RemoteActionCompatParcelizer("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    takeorelse3mmem6k = null;
                    tozui_graphics.RemoteActionCompatParcelizer("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                    if (takeorelse3mmem6k == null) {
                        iSerializer = takeorelse3mmem6k.serializer(1, "Orientation");
                    }
                    matrix = new android.graphics.Matrix();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    switch (iSerializer) {
                        case 2:
                            matrix3 = new android.graphics.Matrix();
                            matrix3.postScale(-1.0f, 1.0f);
                            matrix2 = matrix3;
                            break;
                        case 3:
                            matrix.postRotate(180.0f);
                            matrix2 = matrix;
                            break;
                        case 4:
                            matrix.postScale(1.0f, -1.0f);
                            matrix2 = matrix;
                            break;
                        case 5:
                            matrix.postRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 6:
                            matrix.postRotate(90.0f);
                            matrix2 = matrix;
                            break;
                        case 7:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 8:
                            matrix.postRotate(-90.0f);
                            matrix2 = matrix;
                            break;
                        default:
                            matrix2 = matrix3;
                            break;
                    }
                    if (matrix2 != null) {
                        bitmap.recycle();
                        bitmap = bitmapCreateBitmap;
                    }
                    setRequestedFrameRate setrequestedframerate = new setRequestedFrameRate(bitmap);
                    write(-1, 4, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), 0);
                    return setrequestedframerate;
                }
                if (takeorelse3mmem6k == null) {
                    iSerializer = takeorelse3mmem6k.serializer(1, "Orientation");
                }
            }
            matrix = new android.graphics.Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (iSerializer) {
                case 2:
                    matrix3 = new android.graphics.Matrix();
                    matrix3.postScale(-1.0f, 1.0f);
                    matrix2 = matrix3;
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    matrix2 = matrix;
                    break;
                case 4:
                    matrix.postScale(1.0f, -1.0f);
                    matrix2 = matrix;
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    matrix2 = matrix;
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 8:
                    matrix.postRotate(-90.0f);
                    matrix2 = matrix;
                    break;
                default:
                    matrix2 = matrix3;
                    break;
            }
            if (matrix2 != null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix2, true))) {
                bitmap.recycle();
                bitmap = bitmapCreateBitmap;
            }
            setRequestedFrameRate setrequestedframerate2 = new setRequestedFrameRate(bitmap);
            write(-1, 4, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), 0);
            return setrequestedframerate2;
        } catch (FileNotFoundException e3) {
            tozui_graphics.RemoteActionCompatParcelizer("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e3);
            throw e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    public static void write(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        setApproachNode setapproachnode;
        ApproachLayoutModifierNodemaxApproachIntrinsicWidth1 approachLayoutModifierNodemaxApproachIntrinsicWidth1;
        zzw zzwVar;
        long jElapsedRealtime;
        HashMap map;
        maxApproachIntrinsicHeight maxapproachintrinsicheight;
        ApproachLayoutModifierNodemaxApproachIntrinsicHeight1 approachLayoutModifierNodemaxApproachIntrinsicHeight1;
        String strIconCompatParcelizer;
        synchronized (encodeR2X_6o.class) {
            getLookaheadScopeCoordinates getlookaheadscopecoordinates = new getLookaheadScopeCoordinates();
            synchronized (encodeR2X_6o.class) {
                int i7 = 2;
                if (encodeR2X_6o.serializer == null) {
                    encodeR2X_6o.serializer = new HitPathTrackeraddHitPath1(i7);
                }
                setapproachnode = (setApproachNode) encodeR2X_6o.serializer.serializer(getlookaheadscopecoordinates);
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            approachLayoutModifierNodemaxApproachIntrinsicWidth1 = ApproachLayoutModifierNodemaxApproachIntrinsicWidth1.INPUT_IMAGE_CONSTRUCTION;
            zzwVar = setapproachnode.MediaBrowserCompatMediaItem;
            jElapsedRealtime = SystemClock.elapsedRealtime();
            map = setapproachnode.ParcelableVolumeInfo;
            if (map.get(approachLayoutModifierNodemaxApproachIntrinsicWidth1) != null && jElapsedRealtime - ((Long) map.get(approachLayoutModifierNodemaxApproachIntrinsicWidth1)).longValue() <= 30000) {
                return;
            }
            map.put(approachLayoutModifierNodemaxApproachIntrinsicWidth1, Long.valueOf(jElapsedRealtime));
            E$b e$b = new E$b(5);
            if (i != -1) {
                maxapproachintrinsicheight = maxApproachIntrinsicHeight.BITMAP;
            } else if (i != 35) {
                maxapproachintrinsicheight = maxApproachIntrinsicHeight.YUV_420_888;
            } else if (i != 842094169) {
                maxapproachintrinsicheight = maxApproachIntrinsicHeight.YV12;
            } else if (i != 16) {
                maxapproachintrinsicheight = maxApproachIntrinsicHeight.NV16;
            } else if (i != 17) {
                maxapproachintrinsicheight = maxApproachIntrinsicHeight.UNKNOWN_FORMAT;
            } else {
                maxapproachintrinsicheight = maxApproachIntrinsicHeight.NV21;
            }
            e$b.RemoteActionCompatParcelizer = maxapproachintrinsicheight;
            if (i2 != 1) {
                approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.BITMAP;
            } else if (i2 != 2) {
                approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.BYTEARRAY;
            } else if (i2 != 3) {
                approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.BYTEBUFFER;
            } else if (i2 != 4) {
                approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.ANDROID_MEDIA_IMAGE;
            } else {
                approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.FILEPATH;
            }
            e$b.read = approachLayoutModifierNodemaxApproachIntrinsicHeight1;
            e$b.IconCompatParcelizer = Integer.valueOf(i5 & Integer.MAX_VALUE);
            e$b.MediaBrowserCompatMediaItem = Integer.valueOf(i3 & Integer.MAX_VALUE);
            e$b.MediaDescriptionCompat = Integer.valueOf(i4 & Integer.MAX_VALUE);
            e$b.MediaMetadataCompat = Long.valueOf((jElapsedRealtime2 - j) & Long.MAX_VALUE);
            e$b.write = Integer.valueOf(i6 & Integer.MAX_VALUE);
            minApproachIntrinsicHeight minapproachintrinsicheight = new minApproachIntrinsicHeight(e$b);
            accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp((byte) 0, 12);
            accessgettvteletextcp.write = minapproachintrinsicheight;
            colorResource colorresource = new colorResource(accessgettvteletextcp);
            if (zzwVar.isSuccessful()) {
                strIconCompatParcelizer = (String) zzwVar.getResult();
            } else {
                strIconCompatParcelizer = accessgetSemicoloncp.read.IconCompatParcelizer(setapproachnode.MediaMetadataCompat);
            }
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) setapproachnode, (Object) colorresource, (Enum) approachLayoutModifierNodemaxApproachIntrinsicWidth1, strIconCompatParcelizer, 5));
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        approachLayoutModifierNodemaxApproachIntrinsicWidth1 = ApproachLayoutModifierNodemaxApproachIntrinsicWidth1.INPUT_IMAGE_CONSTRUCTION;
        zzwVar = setapproachnode.MediaBrowserCompatMediaItem;
        jElapsedRealtime = SystemClock.elapsedRealtime();
        map = setapproachnode.ParcelableVolumeInfo;
        if (map.get(approachLayoutModifierNodemaxApproachIntrinsicWidth1) != null) {
            return;
        }
        map.put(approachLayoutModifierNodemaxApproachIntrinsicWidth1, Long.valueOf(jElapsedRealtime));
        E$b e$b2 = new E$b(5);
        if (i != -1) {
            maxapproachintrinsicheight = maxApproachIntrinsicHeight.BITMAP;
        } else if (i != 35) {
            maxapproachintrinsicheight = maxApproachIntrinsicHeight.YUV_420_888;
        } else if (i != 842094169) {
            maxapproachintrinsicheight = maxApproachIntrinsicHeight.YV12;
        } else if (i != 16) {
            maxapproachintrinsicheight = maxApproachIntrinsicHeight.NV16;
        } else if (i != 17) {
            maxapproachintrinsicheight = maxApproachIntrinsicHeight.UNKNOWN_FORMAT;
        } else {
            maxapproachintrinsicheight = maxApproachIntrinsicHeight.NV21;
        }
        e$b2.RemoteActionCompatParcelizer = maxapproachintrinsicheight;
        if (i2 != 1) {
            approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.BITMAP;
        } else if (i2 != 2) {
            approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.BYTEARRAY;
        } else if (i2 != 3) {
            approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.BYTEBUFFER;
        } else if (i2 != 4) {
            approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.ANDROID_MEDIA_IMAGE;
        } else {
            approachLayoutModifierNodemaxApproachIntrinsicHeight1 = ApproachLayoutModifierNodemaxApproachIntrinsicHeight1.FILEPATH;
        }
        e$b2.read = approachLayoutModifierNodemaxApproachIntrinsicHeight1;
        e$b2.IconCompatParcelizer = Integer.valueOf(i5 & Integer.MAX_VALUE);
        e$b2.MediaBrowserCompatMediaItem = Integer.valueOf(i3 & Integer.MAX_VALUE);
        e$b2.MediaDescriptionCompat = Integer.valueOf(i4 & Integer.MAX_VALUE);
        e$b2.MediaMetadataCompat = Long.valueOf((jElapsedRealtime3 - j) & Long.MAX_VALUE);
        e$b2.write = Integer.valueOf(i6 & Integer.MAX_VALUE);
        minApproachIntrinsicHeight minapproachintrinsicheight2 = new minApproachIntrinsicHeight(e$b2);
        accessgetTvTeletextcp accessgettvteletextcp2 = new accessgetTvTeletextcp((byte) 0, 12);
        accessgettvteletextcp2.write = minapproachintrinsicheight2;
        colorResource colorresource2 = new colorResource(accessgettvteletextcp2);
        if (zzwVar.isSuccessful()) {
            strIconCompatParcelizer = (String) zzwVar.getResult();
        } else {
            strIconCompatParcelizer = accessgetSemicoloncp.read.IconCompatParcelizer(setapproachnode.MediaMetadataCompat);
        }
        getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) setapproachnode, (Object) colorresource2, (Enum) approachLayoutModifierNodemaxApproachIntrinsicWidth1, strIconCompatParcelizer, 5));
    }

    public setRequestedFrameRate(ByteBuffer byteBuffer, int i, int i2, int i3) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(byteBuffer);
        this.serializer = byteBuffer;
        accessgetSystemNavigationDowncp.write("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.read = i;
        this.IconCompatParcelizer = i2;
        write(i3);
        this.MediaBrowserCompatMediaItem = i3;
        this.MediaSessionCompatQueueItem = 17;
    }

    public final android.media.Image.Plane[] read() {
        if (this.RemoteActionCompatParcelizer == null) {
            return null;
        }
        return ((android.media.Image) this.RemoteActionCompatParcelizer.read).getPlanes();
    }

    public static void write(int i) {
        accessgetSystemNavigationDowncp.write("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", i == 0 || i == 90 || i == 180 || i == 270);
    }

    public setRequestedFrameRate(android.media.Image image, int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer = new i$d.a(6, image);
        this.read = i;
        this.IconCompatParcelizer = i2;
        write(i3);
        this.MediaBrowserCompatMediaItem = i3;
        this.MediaSessionCompatQueueItem = 35;
    }

    public setRequestedFrameRate(Bitmap bitmap) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bitmap);
        this.write = bitmap;
        this.read = bitmap.getWidth();
        this.IconCompatParcelizer = bitmap.getHeight();
        write(0);
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaSessionCompatQueueItem = -1;
    }
}
