package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.huawei.hmf.tasks.a.i$d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class drawImageAZ2fEMsdefault implements getInverseTransform {
    public static final com.huawei.hmf.tasks.a.j RemoteActionCompatParcelizer = new com.huawei.hmf.tasks.a.j(16);
    public static final component27NrFUSI write = new component27NrFUSI(2);
    public final ArrayList MediaMetadataCompat;
    public final i$d MediaSessionCompatQueueItem;
    public final Context serializer;
    public final com.huawei.hmf.tasks.a.j IconCompatParcelizer = RemoteActionCompatParcelizer;
    public final component27NrFUSI read = write;

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        return !((Boolean) geteotffuncui_graphics.serializer(drawPointsF8ZwMP8default.IconCompatParcelizer)).booleanValue() && resizeToBitmapDimensionslambda3.write(this.MediaMetadataCompat, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public drawImageAZ2fEMsdefault(Context context, ArrayList arrayList, getD getd, getF getf) {
        this.serializer = context.getApplicationContext();
        this.MediaMetadataCompat = arrayList;
        this.MediaSessionCompatQueueItem = new i$d(getd, getf, false, 13);
    }

    public final drawImagegbVJVH8default IconCompatParcelizer(ByteBuffer byteBuffer, int i, int i2, r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek r8lambday6_ocuxwipaesjs5255j_vvi2ek, getEotfFuncui_graphics geteotffuncui_graphics) {
        boolean zIsLoggable;
        Bitmap.Config config;
        int i3 = Stroke.write;
        SystemClock.elapsedRealtimeNanos();
        try {
            r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j4RemoteActionCompatParcelizer = r8lambday6_ocuxwipaesjs5255j_vvi2ek.RemoteActionCompatParcelizer();
            if (r8lambdalovdxkebcwvmevqkoyot9dw91j4RemoteActionCompatParcelizer.read > 0 && r8lambdalovdxkebcwvmevqkoyot9dw91j4RemoteActionCompatParcelizer.MediaSessionCompatQueueItem == 0) {
                Bitmap.Config config2 = geteotffuncui_graphics.serializer(drawPointsF8ZwMP8default.RemoteActionCompatParcelizer) == _init_lambda0.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(r8lambdalovdxkebcwvmevqkoyot9dw91j4RemoteActionCompatParcelizer.RatingCompat / i2, r8lambdalovdxkebcwvmevqkoyot9dw91j4RemoteActionCompatParcelizer.ParcelableVolumeInfo / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                Log.isLoggable("BufferGifDecoder", 2);
                com.huawei.hmf.tasks.a.j jVar = this.IconCompatParcelizer;
                i$d i_d = this.MediaSessionCompatQueueItem;
                jVar.getClass();
                DoubleIdentitylambda0 doubleIdentitylambda0 = new DoubleIdentitylambda0(i_d, r8lambdalovdxkebcwvmevqkoyot9dw91j4RemoteActionCompatParcelizer, byteBuffer, iMax);
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                if (config2 == config3 || config2 == (config = Bitmap.Config.RGB_565)) {
                    doubleIdentitylambda0.serializer = config2;
                } else {
                    FieldType$$ExternalSyntheticBUOutline0.serializer("Unsupported format: ", config2, ", must be one of ", config3, " or ", config);
                }
                doubleIdentitylambda0.MediaBrowserCompatMediaItem = (doubleIdentitylambda0.MediaBrowserCompatMediaItem + 1) % doubleIdentitylambda0.MediaSessionCompatQueueItem.read;
                Bitmap bitmapIconCompatParcelizer = doubleIdentitylambda0.IconCompatParcelizer();
                if (bitmapIconCompatParcelizer != null) {
                    return new drawImagegbVJVH8default(new drawImage9jGpkUEdefault(new drawLineNGM6Ib0default(0, new com.bumptech.glide.load.resource.gif.GifFrameLoader(com.bumptech.glide.Glide.IconCompatParcelizer(this.serializer), doubleIdentitylambda0, i, i2, bitmapIconCompatParcelizer))), 0);
                }
                if (zIsLoggable) {
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek r8lambday6_ocuxwipaesjs5255j_vvi2ek;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        component27NrFUSI component27nrfusi = this.read;
        synchronized (component27nrfusi) {
            r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek r8lambday6_ocuxwipaesjs5255j_vvi2ek2 = (r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek) component27nrfusi.RemoteActionCompatParcelizer.poll();
            if (r8lambday6_ocuxwipaesjs5255j_vvi2ek2 == null) {
                r8lambday6_ocuxwipaesjs5255j_vvi2ek2 = new r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek();
            }
            r8lambday6_ocuxwipaesjs5255j_vvi2ek = r8lambday6_ocuxwipaesjs5255j_vvi2ek2;
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.IconCompatParcelizer = null;
            Arrays.fill(r8lambday6_ocuxwipaesjs5255j_vvi2ek.serializer, (byte) 0);
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.read = new r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4();
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.RemoteActionCompatParcelizer = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.IconCompatParcelizer = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.IconCompatParcelizer.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return IconCompatParcelizer(byteBuffer, i, i2, r8lambday6_ocuxwipaesjs5255j_vvi2ek, geteotffuncui_graphics);
        } finally {
            this.read.serializer(r8lambday6_ocuxwipaesjs5255j_vvi2ek);
        }
    }
}
