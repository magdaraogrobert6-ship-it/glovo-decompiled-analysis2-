package o;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class invalidateFocusProperties {
    public static float read(android.view.VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static boolean read(NotificationManager notificationManager) {
        return notificationManager.canUseFullScreenIntent();
    }

    public static final void IconCompatParcelizer(getOuterActionMenuPresenter getouteractionmenupresenter, play playVar) {
        playVar.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            getouteractionmenupresenter.read(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, playVar);
        }
    }

    public static Bitmap read(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = ContentDrawScope.serializer;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    UrlUtils.IconCompatParcelizer("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setColorFilter(ContentDrawScope.serializer);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmap2;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static Bitmap IconCompatParcelizer(InputStream inputStream, BitmapFactory.Options options, accessrecordJVtK1S4jd accessrecordjvtk1s4jd) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34 && i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE && ((Boolean) drawContent.IconCompatParcelizer.B_()).booleanValue()) {
            try {
                boolean zPlaybackStateCompat = accessrecordjvtk1s4jd.PlaybackStateCompat();
                Log.isLoggable("GlideBitmapFactory", 2);
                if (zPlaybackStateCompat) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    UrlUtils.IconCompatParcelizer("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (bitmapDecodeStream == null) {
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.recycle();
                            }
                            options.inPreferredConfig = config2;
                            return null;
                        }
                        try {
                            Bitmap bitmap2 = read(bitmapDecodeStream);
                            bitmapDecodeStream.recycle();
                            options.inPreferredConfig = config2;
                            return bitmap2;
                        } catch (Throwable th) {
                            th = th;
                            bitmap = bitmapDecodeStream;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("GlideBitmapFactory", 2);
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static void read(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(androidx.sqlite.SQLite.read(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(onContentCardClicked.MediaSessionCompatQueueItem(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }
}
