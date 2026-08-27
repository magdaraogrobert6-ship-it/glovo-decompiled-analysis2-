package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasDrawScopeKtasDrawTransform1 {
    public static final accessgetMinp IconCompatParcelizer;
    public static final accessgetMinp RemoteActionCompatParcelizer;
    public static final toContentCaptureSession serializer;
    public static final ArrayDeque write;
    public final DisplayMetrics MediaBrowserCompatMediaItem;
    public final getD MediaDescriptionCompat;
    public final getF MediaSessionCompatQueueItem;
    public final ArrayList ParcelableVolumeInfo;
    public final accessdrawImageAZ2fEMsjd RatingCompat = accessdrawImageAZ2fEMsjd.serializer();
    public static final accessgetMinp read = accessgetMinp.serializer(_init_lambda0.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final accessgetMinp MediaMetadataCompat = new accessgetMinp("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, accessgetMinp.IconCompatParcelizer);

    public static void RemoteActionCompatParcelizer(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    static {
        setLayoutDirection setlayoutdirection = accessasDrawTransform.write;
        Boolean bool = Boolean.FALSE;
        IconCompatParcelizer = accessgetMinp.serializer(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        RemoteActionCompatParcelizer = accessgetMinp.serializer(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        serializer = new toContentCaptureSession(15);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        write = new ArrayDeque(0);
    }

    public final getCanvas RemoteActionCompatParcelizer(accessrecordJVtK1S4jd accessrecordjvtk1s4jd, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics, rotateUv8p0NA rotateuv8p0na) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.MediaSessionCompatQueueItem.IconCompatParcelizer(byte[].class, 65536);
        synchronized (CanvasDrawScopeKtasDrawTransform1.class) {
            arrayDeque = write;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                RemoteActionCompatParcelizer(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        _init_lambda0 _init_lambda0Var = (_init_lambda0) geteotffuncui_graphics.serializer(read);
        getEotfOrigui_graphics geteotforigui_graphics = (getEotfOrigui_graphics) geteotffuncui_graphics.serializer(MediaMetadataCompat);
        accessasDrawTransform accessasdrawtransform = (accessasDrawTransform) geteotffuncui_graphics.serializer(accessasDrawTransform.read);
        boolean zBooleanValue = ((Boolean) geteotffuncui_graphics.serializer(IconCompatParcelizer)).booleanValue();
        accessgetMinp accessgetminp = RemoteActionCompatParcelizer;
        try {
            Bitmap bitmap = read(accessrecordjvtk1s4jd, options2, accessasdrawtransform, _init_lambda0Var, geteotforigui_graphics, geteotffuncui_graphics.serializer(accessgetminp) != null && ((Boolean) geteotffuncui_graphics.serializer(accessgetminp)).booleanValue(), i, i2, zBooleanValue, rotateuv8p0na);
            getCanvas getcanvas = bitmap == null ? null : new getCanvas(bitmap, this.MediaDescriptionCompat);
            RemoteActionCompatParcelizer(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.MediaSessionCompatQueueItem.IconCompatParcelizer(bArr);
            return getcanvas;
        } catch (Throwable th) {
            RemoteActionCompatParcelizer(options2);
            ArrayDeque arrayDeque2 = write;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.MediaSessionCompatQueueItem.IconCompatParcelizer(bArr);
                throw th;
            }
        }
    }

    public CanvasDrawScopeKtasDrawTransform1(ArrayList arrayList, DisplayMetrics displayMetrics, getD getd, getF getf) {
        this.ParcelableVolumeInfo = arrayList;
        UrlUtils.serializer(displayMetrics, "Argument must not be null");
        this.MediaBrowserCompatMediaItem = displayMetrics;
        UrlUtils.serializer(getd, "Argument must not be null");
        this.MediaDescriptionCompat = getd;
        UrlUtils.serializer(getf, "Argument must not be null");
        this.MediaSessionCompatQueueItem = getf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap serializer(o.accessrecordJVtK1S4jd r8, android.graphics.BitmapFactory.Options r9, o.rotateUv8p0NA r10, o.getD r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.serializer()
            r8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = o.DrawContext.RemoteActionCompatParcelizer
            r3.lock()
            android.graphics.Bitmap r8 = r8.RemoteActionCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
            r3.unlock()
            return r8
        L1d:
            r8 = move-exception
            goto L60
        L1f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = bo.app.m1$$ExternalSyntheticOutline0.m(r0, r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = serializer(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "Downsampler"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L5f
            r11.read(r0)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            r0 = 0
            r9.inBitmap = r0     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            android.graphics.Bitmap r8 = serializer(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L5e
            java.util.concurrent.locks.Lock r9 = o.DrawContext.RemoteActionCompatParcelizer
            r9.unlock()
            return r8
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L5f:
            throw r4     // Catch: java.lang.Throwable -> L1d
        L60:
            java.util.concurrent.locks.Lock r9 = o.DrawContext.RemoteActionCompatParcelizer
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CanvasDrawScopeKtasDrawTransform1.serializer(o.accessrecordJVtK1S4jd, android.graphics.BitmapFactory$Options, o.rotateUv8p0NA, o.getD):android.graphics.Bitmap");
    }

    public static String serializer(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap read(accessrecordJVtK1S4jd accessrecordjvtk1s4jd, BitmapFactory.Options options, accessasDrawTransform accessasdrawtransform, _init_lambda0 _init_lambda0Var, getEotfOrigui_graphics geteotforigui_graphics, boolean z, int i, int i2, boolean z2, rotateUv8p0NA rotateuv8p0na) {
        char c;
        boolean z3;
        int iRound;
        int i3;
        Bitmap bitmapCreateBitmap;
        android.graphics.ColorSpace.Named named;
        android.graphics.ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i4;
        int i5;
        int iMin;
        int iFloor;
        int iFloor2;
        int i6 = Stroke.write;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        getD getd = this.MediaDescriptionCompat;
        serializer(accessrecordjvtk1s4jd, options, rotateuv8p0na, getd);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i7 = iArr[0];
        int i8 = iArr[1];
        boolean z4 = (i7 == -1 || i8 == -1) ? false : z;
        int iSerializer = accessrecordjvtk1s4jd.serializer();
        switch (iSerializer) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (iSerializer) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i9 = i;
        if (i9 == Integer.MIN_VALUE) {
            i9 = (c == 'Z' || c == 270) ? i8 : i7;
        }
        if (i2 == -2147483648) {
            i2 = (c == 'Z' || c == 270) ? i7 : i8;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeRatingCompat = accessrecordjvtk1s4jd.RatingCompat();
        String str = "Downsampler";
        if (i7 > 0 && i8 > 0) {
            if (c == 'Z' || c == 270) {
                i4 = i8;
                i5 = i7;
            } else {
                i5 = i8;
                i4 = i7;
            }
            float f = accessasdrawtransform.read(i4, i5, i9, i2);
            if (f > 0.0f) {
                z4 = z4;
                inset insetVarRemoteActionCompatParcelizer = accessasdrawtransform.RemoteActionCompatParcelizer(i4, i5, i9, i2);
                if (insetVarRemoteActionCompatParcelizer != null) {
                    float f2 = i4;
                    float f3 = i5;
                    int i10 = i2;
                    int i11 = i4 / ((int) (((double) (f * f2)) + 0.5d));
                    int i12 = i5 / ((int) (((double) (f * f3)) + 0.5d));
                    inset insetVar = inset.MEMORY;
                    if (insetVarRemoteActionCompatParcelizer == insetVar) {
                        iMin = Math.max(i11, i12);
                    } else {
                        iMin = Math.min(i11, i12);
                    }
                    int iMax = Math.max(1, Integer.highestOneBit(iMin));
                    if (insetVarRemoteActionCompatParcelizer == insetVar && iMax < 1.0f / f) {
                        iMax <<= 1;
                    }
                    options.inSampleSize = iMax;
                    if (imageHeaderParser$ImageTypeRatingCompat == ImageHeaderParser$ImageType.JPEG) {
                        float fMin = Math.min(iMax, 8);
                        iFloor = (int) Math.ceil(f2 / fMin);
                        iFloor2 = (int) Math.ceil(f3 / fMin);
                        int i13 = iMax / 8;
                        if (i13 > 0) {
                            iFloor /= i13;
                            iFloor2 /= i13;
                        }
                    } else if (imageHeaderParser$ImageTypeRatingCompat != ImageHeaderParser$ImageType.PNG && imageHeaderParser$ImageTypeRatingCompat != ImageHeaderParser$ImageType.PNG_A) {
                        if (imageHeaderParser$ImageTypeRatingCompat.isWebp()) {
                            float f4 = iMax;
                            iFloor = Math.round(f2 / f4);
                            iFloor2 = Math.round(f3 / f4);
                        } else if (i4 % iMax == 0 && i5 % iMax == 0) {
                            iFloor = i4 / iMax;
                            iFloor2 = i5 / iMax;
                        } else {
                            options.inJustDecodeBounds = true;
                            serializer(accessrecordjvtk1s4jd, options, rotateuv8p0na, getd);
                            options.inJustDecodeBounds = false;
                            int[] iArr2 = {options.outWidth, options.outHeight};
                            int i14 = iArr2[0];
                            iFloor2 = iArr2[1];
                            iFloor = i14;
                        }
                    } else {
                        float f5 = iMax;
                        iFloor = (int) Math.floor(f2 / f5);
                        iFloor2 = (int) Math.floor(f3 / f5);
                    }
                    i2 = i10;
                    double d = accessasdrawtransform.read(iFloor, iFloor2, i9, i2);
                    int iRound2 = (int) Math.round((d <= 1.0d ? d : 1.0d / d) * 2.147483647E9d);
                    int i15 = (int) ((((double) iRound2) * d) + 0.5d);
                    options.inTargetDensity = (int) (((d / ((double) (i15 / iRound2))) * ((double) i15)) + 0.5d);
                    if (d > 1.0d) {
                        d = 1.0d / d;
                    }
                    int iRound3 = (int) Math.round(d * 2.147483647E9d);
                    options.inDensity = iRound3;
                    int i16 = options.inTargetDensity;
                    if (i16 > 0 && iRound3 > 0 && i16 != iRound3) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    str = "Downsampler";
                    Log.isLoggable(str, 2);
                    i8 = i8;
                    i7 = i7;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot round with null rounding");
                    return null;
                }
            } else {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(f);
                sb.append(" from: ");
                sb.append(accessasdrawtransform);
                sb.append(", source: [");
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i7, i8, "x", "], target: [", sb);
                sb.append(i9);
                sb.append("x");
                sb.append(i2);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            int i17 = 3;
            if (Log.isLoggable(str, i17)) {
                Objects.toString(imageHeaderParser$ImageTypeRatingCompat);
            }
        }
        boolean zRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer(i9, i2, z4, z3);
        if (zRemoteActionCompatParcelizer) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zRemoteActionCompatParcelizer) {
            if (_init_lambda0Var != _init_lambda0.PREFER_ARGB_8888) {
                try {
                    if (accessrecordjvtk1s4jd.RatingCompat().hasAlpha()) {
                        config2 = Bitmap.Config.ARGB_8888;
                    } else {
                        config2 = Bitmap.Config.RGB_565;
                    }
                } catch (IOException unused) {
                    if (Log.isLoggable(str, 3)) {
                        Objects.toString(_init_lambda0Var);
                    }
                }
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        if (i7 < 0 || i8 < 0 || !z2) {
            int i18 = options.inTargetDensity;
            float f6 = (i18 <= 0 || (i3 = options.inDensity) <= 0 || i18 == i3) ? 1.0f : i18 / i3;
            float f7 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i7 / f7);
            int iCeil2 = (int) Math.ceil(i8 / f7);
            int iRound4 = Math.round(iCeil * f6);
            iRound = Math.round(iCeil2 * f6);
            Log.isLoggable(str, 2);
            i9 = iRound4;
        } else {
            iRound = i2;
        }
        if (i9 > 0 && iRound > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            options.inBitmap = getd.read(i9, iRound, config);
        }
        if (geteotforigui_graphics != null) {
            if (geteotforigui_graphics == getEotfOrigui_graphics.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                named = android.graphics.ColorSpace.Named.DISPLAY_P3;
            } else {
                named = android.graphics.ColorSpace.Named.SRGB;
            }
            options.inPreferredColorSpace = android.graphics.ColorSpace.get(named);
        }
        Bitmap bitmapSerializer = serializer(accessrecordjvtk1s4jd, options, rotateuv8p0na, getd);
        rotateuv8p0na.read(bitmapSerializer, getd);
        if (Log.isLoggable(str, 2)) {
            serializer(bitmapSerializer);
            serializer(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (bitmapSerializer == null) {
            return null;
        }
        bitmapSerializer.setDensity(this.MediaBrowserCompatMediaItem.densityDpi);
        switch (iSerializer) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                switch (iSerializer) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapSerializer, 0, 0, bitmapSerializer.getWidth(), bitmapSerializer.getHeight(), matrix, true);
                break;
            default:
                bitmapCreateBitmap = bitmapSerializer;
                break;
        }
        if (!bitmapSerializer.equals(bitmapCreateBitmap)) {
            getd.read(bitmapSerializer);
        }
        return bitmapCreateBitmap;
    }
}
