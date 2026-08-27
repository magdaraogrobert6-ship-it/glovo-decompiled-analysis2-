package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.f8$$ExternalSyntheticLambda2;
import bo.app.g$$ExternalSyntheticLambda1;
import bo.app.hg$$ExternalSyntheticLambda1;
import bo.app.hh;
import bo.app.m0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.n$$ExternalSyntheticLambda2;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.BrazeViewBounds;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import o.SweepGradientShader9KIMszodefault;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeImageUtils {
    private static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    private static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    private static final int QUARTER_MAX_SAMPLED_IMAGE_BYTES = 4194304;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int getPixelsFromDensityAndDp(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    public static /* synthetic */ void getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$0() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$1(BitmapFactory.Options options, int i, int i2) {
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(options.outWidth, options.outHeight, "Calculating sample size for source image bounds: (width ", " height ", ") and destination image bounds: (width ");
        sbM.append(i);
        sbM.append(" height ");
        sbM.append(i2);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$0(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Uri with unknown scheme received. Not getting image. Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$0(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Local bitmap path is null. URI: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$1(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Local bitmap file does not exist. URI: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$3() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$5(Uri uri, BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        StringBuilder sb = new StringBuilder("The bitmap metadata with image uri ");
        sb.append(uri);
        sb.append(" had bounds: (height ");
        sb.append(i);
        sb.append(" width ");
        return af$$ExternalSyntheticOutline0.m(i2, "). Returning a bitmap with no sampling.", sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$6() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SDK is in offline mode, not downloading remote bitmap with uri: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$3(URL url, BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        StringBuilder sb = new StringBuilder("The bitmap metadata with image url ");
        sb.append(url);
        sb.append(" had bounds: (height ");
        sb.append(i);
        sb.append(" width ");
        return af$$ExternalSyntheticOutline0.m(i2, "). Returning a bitmap with no sampling.", sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$5() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        imageView.getClass();
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(22), 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            final int i = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda21
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    ImageView imageView2 = imageView;
                    return i2 != 0 ? BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView2) : BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView2);
                }
            }, 12, (Object) null);
            return;
        }
        final int i2 = 0;
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda21
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i2;
                    ImageView imageView2 = imageView;
                    return i3 != 0 ? BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView2) : BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView2);
                }
            }, 12, (Object) null);
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeImageUtils$$ExternalSyntheticLambda20(width, imageView, i2), 12, (Object) null);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$0() {
        return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$2(createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, long j, long j2) {
        int i = createbrazeuserchangeeventsubscriberlambda01.read;
        long j3 = i;
        return "Using image sample size of " + i + ". Image will be scaled to width: " + (j / j3) + " and height: " + (j2 / j3);
    }

    public static final m0 getBitmap(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        uri.getClass();
        brazeViewBounds.getClass();
        onViewAttachedToWindowlambda0 destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, brazeViewBounds);
        int iIntValue = ((Number) destinationHeightAndWidthPixels.serializer).intValue();
        int iIntValue2 = ((Number) destinationHeightAndWidthPixels.write).intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new m0(getLocalBitmap(uri, iIntValue2, iIntValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, iIntValue2, iIntValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(3, uri), 12, (Object) null);
        return new m0();
    }

    public static final int getDensityDpi(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().densityDpi;
    }

    public static final onViewAttachedToWindowlambda0 getDisplayHeightAndWidthPixels(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new onViewAttachedToWindowlambda0(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        context.getClass();
        return ((Number) getDisplayHeightAndWidthPixels(context).write).intValue();
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        imageView.getClass();
        resizeToBitmapDimensions(imageView, bitmap);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static /* synthetic */ m0 getBitmap$default(Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i, Object obj) {
        if ((i & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return getBitmap(context, uri, brazeViewBounds);
    }

    private static final onViewAttachedToWindowlambda0 getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        onViewAttachedToWindowlambda0 displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int iIntValue = ((Number) displayHeightAndWidthPixels.serializer).intValue();
        int iIntValue2 = ((Number) displayHeightAndWidthPixels.write).intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda1(iIntValue2, iIntValue, 1), 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new onViewAttachedToWindowlambda0(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        int densityDpi = getDensityDpi(context);
        int pixelsFromDensityAndDp = getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp());
        int pixelsFromDensityAndDp2 = getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp());
        return new onViewAttachedToWindowlambda0(Integer.valueOf(Math.min(iIntValue, pixelsFromDensityAndDp)), Integer.valueOf(Math.min(iIntValue2, pixelsFromDensityAndDp2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$0(int i, int i2) {
        return af$$ExternalSyntheticOutline0.m(i, "Display width: ", i2, " and height ");
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$1(int i, URL url) {
        return "HTTP response code was " + i + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$1(ImageView imageView) {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$2(ImageView imageView) {
        return "ImageView dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$3(float f, ImageView imageView) {
        int width = imageView.getWidth();
        int i = imageView.getLayoutParams().width;
        int i2 = imageView.getLayoutParams().height;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StringBuilder sb = new StringBuilder("Resizing ImageView to aspect ratio ");
        sb.append(f);
        sb.append(" based on width: ");
        sb.append(width);
        sb.append(" trueWidth: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i, i2, " height: ", " layoutParams: ", sb);
        sb.append(layoutParams);
        sb.append(" ");
        sb.append(imageView);
        return sb.toString();
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        inputStream.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        long j;
        long j2;
        options.getClass();
        if (i2 != 0 && i != 0) {
            long j3 = options.outHeight;
            long j4 = options.outWidth;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new f8$$ExternalSyntheticLambda2(i, i2, 2, options), 14, (Object) null);
            createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
            createbrazeuserchangeeventsubscriberlambda01.read = 1;
            long j5 = i2;
            if (j3 > j5 || j4 > i) {
                long j6 = j3 / 2;
                long j7 = j4 / 2;
                while (true) {
                    int i3 = createbrazeuserchangeeventsubscriberlambda01.read;
                    j = j4;
                    long j8 = i3;
                    if (j6 / j8 < j5) {
                        j2 = j5;
                        if (j7 / j8 < i) {
                            if ((j * j3) / ((long) (i3 * i3)) <= 4194304) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j2 = j5;
                    }
                    createbrazeuserchangeeventsubscriberlambda01.read = i3 * 2;
                    j4 = j;
                    j5 = j2;
                }
            } else {
                j = j4;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeImageUtils$$ExternalSyntheticLambda11(createbrazeuserchangeeventsubscriberlambda01, j, j3, 0), 14, (Object) null);
            return createbrazeuserchangeeventsubscriberlambda01.read;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(20), 14, (Object) null);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    public static final Bitmap getLocalBitmap(Uri uri, int i, int i2) throws Throwable {
        Exception exc;
        FileInputStream fileInputStream;
        Throwable th;
        Bitmap bitmapDecodeFile;
        uri.getClass();
        int i3 = 23;
        FileInputStream fileInputStream2 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                File file = new File(path);
                if (!file.exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(2, uri), 14, (Object) null);
                    return null;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 10), 12, (Object) null);
                int i4 = 25;
                if (i > 0 && i2 > 0) {
                    FileInputStream fileInputStream3 = new FileInputStream(file);
                    try {
                        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda1(i, i2, 3), 14, (Object) null);
                        BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(fileInputStream3);
                        fileInputStream3.close();
                        FileInputStream fileInputStream4 = new FileInputStream(file);
                        try {
                            if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(24), 14, (Object) null);
                                bitmapDecodeFile = decodeSampledBitmapFromStream(fileInputStream4, bitmapMetadataFromStream, i, i2);
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(uri, i4, bitmapMetadataFromStream), 12, (Object) null);
                                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                            }
                            Bitmap bitmap = bitmapDecodeFile;
                            try {
                                fileInputStream4.close();
                                return bitmap;
                            } catch (IOException e) {
                                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i3), 8, (Object) null);
                                return bitmap;
                            }
                        } catch (Exception e2) {
                            exc = e2;
                            fileInputStream = fileInputStream4;
                            try {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda1(exc, 1), 8, (Object) null);
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i3), 8, (Object) null);
                                    }
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                th = th;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                        throw th;
                                    } catch (IOException e4) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i3), 8, (Object) null);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream2 = fileInputStream4;
                            th = th;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        exc = e5;
                        fileInputStream = fileInputStream3;
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream2 = fileInputStream3;
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i4), 14, (Object) null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(4, uri), 14, (Object) null);
            return null;
        } catch (Exception e6) {
            exc = e6;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$2(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Retrieving image from local path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$4(int i, int i2) {
        return af$$ExternalSyntheticOutline0.m(i, i2, "Sampling bitmap with destination image bounds: (width ", " height ", ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$7(Exception exc) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Exception occurred when attempting to retrieve local bitmap. ", exc.getMessage());
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    private static final m0 getRemoteBitmap(Uri uri, int i, int i2) throws Throwable {
        Throwable th;
        InputStream inputStream;
        Exception exc;
        InputStream inputStream2;
        m0 m0Var;
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        String string = uri.toString();
        string.getClass();
        if (Braze.Companion.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(string, 11), 12, (Object) null);
            return new m0();
        }
        int i3 = 21;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(string);
            hh hhVar = hh.a;
            HttpURLConnection httpURLConnectionA = hhVar.a(url);
            try {
                int responseCode = httpURLConnectionA.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ViewUtils$$ExternalSyntheticLambda1(responseCode, url, 4), 12, (Object) null);
                    m0 m0Var2 = new m0();
                    httpURLConnectionA.disconnect();
                    return m0Var2;
                }
                InputStream inputStream3 = httpURLConnectionA.getInputStream();
                if (i != 0 && i2 != 0) {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda1(i2, i, 2), 14, (Object) null);
                    inputStream3.getClass();
                    BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(inputStream3);
                    httpURLConnectionA.disconnect();
                    HttpURLConnection httpURLConnectionA2 = hhVar.a(url);
                    try {
                        inputStream3 = httpURLConnectionA2.getInputStream();
                        if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                            m0Var = new m0(decodeSampledBitmapFromStream(inputStream3, bitmapMetadataFromStream, i, i2), httpURLConnectionA2.getHeaderFields());
                        } else {
                            BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(url, 23, bitmapMetadataFromStream), 12, (Object) null);
                            m0Var = new m0(BitmapFactory.decodeStream(inputStream3), httpURLConnectionA2.getHeaderFields());
                        }
                        httpURLConnectionA = httpURLConnectionA2;
                    } catch (Exception e) {
                        exc = e;
                        inputStream2 = inputStream3;
                        httpURLConnection = httpURLConnectionA2;
                        try {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(string, 24, exc), 8, (Object) null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e2) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i3), 8, (Object) null);
                                }
                            }
                            return new m0();
                        } catch (Throwable th2) {
                            InputStream inputStream4 = inputStream2;
                            th = th2;
                            inputStream = inputStream4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                    throw th;
                                } catch (IOException e3) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i3), 8, (Object) null);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream3;
                        httpURLConnection = httpURLConnectionA2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    m0Var = new m0(BitmapFactory.decodeStream(inputStream3), httpURLConnectionA.getHeaderFields());
                }
                httpURLConnectionA.disconnect();
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                        return m0Var;
                    } catch (IOException e4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i3), 8, (Object) null);
                    }
                }
                return m0Var;
            } catch (Exception e5) {
                exc = e5;
                inputStream2 = null;
                httpURLConnection = httpURLConnectionA;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                httpURLConnection = httpURLConnectionA;
            }
        } catch (Exception e6) {
            exc = e6;
            inputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$2(int i, int i2) {
        return af$$ExternalSyntheticOutline0.m(i, i2, "Sampling bitmap with destination image bounds: (height ", " width ", ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$4(String str, Exception exc) {
        return af$$ExternalSyntheticOutline0.m("Exception in image bitmap download for Uri: ", str, " ", exc.getMessage());
    }
}
