package bo.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import androidx.camera.video.Recorder$3;
import androidx.room.SharedSQLiteStatement;
import androidx.work.Worker;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.decode.StaticImageDecoder;
import com.braze.Braze;
import com.braze.enums.CardKey;
import com.braze.enums.DeviceKey;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.EnumSet;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.RegexKt;
import o.GifDrawableTransformation;
import o.Glide;
import o.LinearGradientShaderVjE6UOU;
import o.LinearGradientShaderVjE6UOUdefault;
import o.PathHitTesterdefault;
import o.PathIteratorConicEvaluation;
import o.PathKt;
import o.PathOperationCompanion;
import o.ShadowCompanion;
import o.accessgetLayerBlockp;
import o.accessgetReverseDifferencecp;
import o.accessgetUnioncp;
import o.copyqcb84PMdefault;
import o.getBlurRadius;
import o.getBlurRadiusannotations;
import o.getCieXyz;
import o.getDifferenceb3I0S0c;
import o.getNoneannotations;
import o.getReverseDifferenceb3I0S0c;
import o.maxAoSsdG0;
import o.onForgotten;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.sourceInformationContextOfdefault;
import o.takeOrElse3MmeM6k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ h$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Exception {
        accessgetReverseDifferencecp accessgetreversedifferencecp;
        int i;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i2;
        int iMin;
        double dMax;
        int i3;
        int i4 = this.$r8$classId;
        Object obj = this.f$0;
        int i5 = 1;
        switch (i4) {
            case 0:
                return h.a((h) obj);
            case 1:
                return ((SharedSQLiteStatement) obj).createNewStatement();
            case 2:
                return ((Recorder$3) obj).read(":memory:");
            case 3:
                maxAoSsdG0 maxaossdg0 = (maxAoSsdG0) obj;
                Class<?> clsLoadClass = maxaossdg0.RemoteActionCompatParcelizer.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = maxaossdg0.RemoteActionCompatParcelizer.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 4:
                onForgotten onforgotten = (onForgotten) obj;
                return BigInteger.valueOf(onforgotten.serializer).shiftLeft(32).or(BigInteger.valueOf(onforgotten.read)).shiftLeft(32).or(BigInteger.valueOf(onforgotten.MediaDescriptionCompat));
            case 5:
                return ((Worker) obj).RemoteActionCompatParcelizer();
            case 6:
                return a5.a((a5) obj);
            case 7:
                return bg.a((bg) obj);
            case 8:
                return c5.a((DeviceKey) obj);
            case 9:
                return d4.a(Boolean.TRUE, (CardKey) obj);
            case 10:
                return df.a((df) obj);
            case 11:
                return f8.a((f8) obj);
            case 12:
                return ge.a((ce) obj);
            case 13:
                return ge.a((he) obj);
            case 14:
                return hg.a((File[]) obj);
            case 15:
                return k0.a((k0) obj);
            case 16:
                return m1.b((hf) obj);
            case 17:
                return o6.a((a6) obj);
            case 18:
                return od.a((qd) obj);
            case 19:
                return pd.b((j) obj);
            case 20:
                return pd.b((vb) obj);
            case 21:
                return qc.a((mc) obj);
            case 22:
                return t2.e((t2) obj);
            case 23:
                return v8.a((Task) obj);
            case 24:
                return vg.a((ah) obj);
            case 25:
                return w6.a((w6) obj);
            case 26:
                return y4.a((k9) obj);
            case 27:
                return z6.a((l9) obj);
            case 28:
                StaticImageDecoder staticImageDecoder = (StaticImageDecoder) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                getBlurRadiusannotations getblurradiusannotations = staticImageDecoder.serializer;
                PathHitTesterdefault pathHitTesterdefault = new PathHitTesterdefault(((getReverseDifferenceb3I0S0c) staticImageDecoder.IconCompatParcelizer).IconCompatParcelizer());
                GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(pathHitTesterdefault);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new Glide(gifDrawableTransformation.MediaDescriptionCompat(), i5), null, options);
                Exception exc = pathHitTesterdefault.read;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = getDifferenceb3I0S0c.IconCompatParcelizer;
                String str = options.outMimeType;
                ((accessgetUnioncp) staticImageDecoder.write).getClass();
                if (str == null || !(str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
                    accessgetreversedifferencecp = accessgetReverseDifferencecp.read;
                } else {
                    takeOrElse3MmeM6k takeorelse3mmem6k = new takeOrElse3MmeM6k(new PathOperationCompanion(new Glide(gifDrawableTransformation.MediaDescriptionCompat(), i5)));
                    int iSerializer = takeorelse3mmem6k.serializer(1, "Orientation");
                    boolean z2 = iSerializer == 2 || iSerializer == 7 || iSerializer == 4 || iSerializer == 5;
                    switch (takeorelse3mmem6k.serializer(1, "Orientation")) {
                        case 3:
                        case 4:
                            i3 = 180;
                            break;
                        case 5:
                        case 8:
                            i3 = 270;
                            break;
                        case 6:
                        case 7:
                            i3 = 90;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    accessgetreversedifferencecp = new accessgetReverseDifferencecp(z2, i3);
                }
                int i6 = accessgetreversedifferencecp.RemoteActionCompatParcelizer;
                boolean z3 = accessgetreversedifferencecp.IconCompatParcelizer;
                Exception exc2 = pathHitTesterdefault.read;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                Extras$Key extras$Key = LinearGradientShaderVjE6UOU.RemoteActionCompatParcelizer;
                ColorSpace colorSpace = (ColorSpace) ExtrasKt.read(getblurradiusannotations, extras$Key);
                Context context = getblurradiusannotations.write;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) ExtrasKt.read(getblurradiusannotations, extras$Key);
                }
                options.inPremultiplied = ((Boolean) ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.RatingCompat)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.IconCompatParcelizer);
                if ((z3 || i6 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.read)).booleanValue() && config == Bitmap.Config.ARGB_8888) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{options.outMimeType, "image/jpeg"}, getCieXyz.write())).booleanValue()) {
                        config = Bitmap.Config.RGB_565;
                    }
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i7 = options.outWidth;
                try {
                    if (i7 <= 0 || (i2 = options.outHeight) <= 0) {
                        i = 1;
                        options.inSampleSize = 1;
                        z = false;
                        options.inScaled = false;
                    } else {
                        int i8 = (i6 == 90 || i6 == 270) ? i2 : i7;
                        if (i6 != 90 && i6 != 270) {
                            i7 = i2;
                        }
                        accessgetLayerBlockp accessgetlayerblockp = getblurradiusannotations.MediaSessionCompatQueueItem;
                        getBlurRadius getblurradius = getblurradiusannotations.MediaBrowserCompatMediaItem;
                        Extras$Key extras$Key2 = LinearGradientShaderVjE6UOUdefault.write;
                        long jIconCompatParcelizer = RangesKt.IconCompatParcelizer(i8, i7, accessgetlayerblockp, getblurradius, (accessgetLayerBlockp) ExtrasKt.read(getblurradiusannotations, extras$Key2));
                        int i9 = (int) (jIconCompatParcelizer >> 32);
                        int i10 = (int) (jIconCompatParcelizer & 4294967295L);
                        int iHighestOneBit = Integer.highestOneBit(i8 / i9);
                        int iHighestOneBit2 = Integer.highestOneBit(i7 / i10);
                        int[] iArr = PathIteratorConicEvaluation.read;
                        int i11 = iArr[getblurradius.ordinal()];
                        if (i11 != 1) {
                            if (i11 == 2) {
                                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                            return null;
                        }
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        context = context;
                        double d = iMin;
                        double d2 = ((double) i8) / d;
                        double d3 = ((double) i7) / d;
                        double d4 = i9;
                        accessgetLayerBlockp accessgetlayerblockp2 = (accessgetLayerBlockp) ExtrasKt.read(getblurradiusannotations, extras$Key2);
                        double d5 = d4 / d2;
                        double d6 = ((double) i10) / d3;
                        int i12 = iArr[getblurradius.ordinal()];
                        if (i12 != 1) {
                            if (i12 == 2) {
                                dMax = Math.min(d5, d6);
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                            return null;
                        }
                        dMax = Math.max(d5, d6);
                        copyqcb84PMdefault copyqcb84pmdefault = accessgetlayerblockp2.IconCompatParcelizer;
                        if (copyqcb84pmdefault instanceof ShadowCompanion) {
                            double d7 = ((double) ((ShadowCompanion) copyqcb84pmdefault).serializer) / d2;
                            if (dMax > d7) {
                                dMax = d7;
                            }
                        }
                        copyqcb84PMdefault copyqcb84pmdefault2 = accessgetlayerblockp2.read;
                        if (copyqcb84pmdefault2 instanceof ShadowCompanion) {
                            double d8 = ((double) ((ShadowCompanion) copyqcb84pmdefault2).serializer) / d3;
                            if (dMax > d8) {
                                dMax = d8;
                            }
                        }
                        if (getblurradiusannotations.MediaDescriptionCompat == getNoneannotations.INEXACT && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z4 = dMax == 1.0d;
                        options.inScaled = !z4;
                        if (!z4) {
                            if (dMax > 1.0d) {
                                options.inDensity = MathKt.write(2.147483647E9d / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = MathKt.write(dMax * 2.147483647E9d);
                            }
                        }
                        i = 1;
                        z = false;
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new Glide(gifDrawableTransformation, i), null, options);
                    gifDrawableTransformation.close();
                    Exception exc3 = pathHitTesterdefault.read;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z3 || i6 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z3) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i6 > 0) {
                            matrix.postRotate(i6, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i6 == 90 || i6 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, getDifferenceb3I0S0c.IconCompatParcelizer);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    return new PathKt(RegexKt.serializer(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{gifDrawableTransformation, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            default:
                return Braze.Companion.addSdkMetadata$lambda$0$0((EnumSet) obj);
        }
    }
}
