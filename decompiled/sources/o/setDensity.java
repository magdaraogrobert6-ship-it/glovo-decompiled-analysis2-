package o;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setDensity implements fromLinear {
    public final getF serializer;
    public static final accessgetMinp write = accessgetMinp.serializer(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final accessgetMinp IconCompatParcelizer = new accessgetMinp("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, accessgetMinp.IconCompatParcelizer);

    @Override // o.fromLinear
    public final r8lambdafQNxHYBbQei_ep6070iYk6_yIE IconCompatParcelizer(getEotfFuncui_graphics geteotffuncui_graphics) {
        return r8lambdafQNxHYBbQei_ep6070iYk6_yIE.TRANSFORMED;
    }

    public setDensity(getF getf) {
        this.serializer = getf;
    }

    @Override // o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ
    public final boolean IconCompatParcelizer(Object obj, File file, getEotfFuncui_graphics geteotffuncui_graphics) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((generateOetf) obj).IconCompatParcelizer();
        accessgetMinp accessgetminp = IconCompatParcelizer;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) geteotffuncui_graphics.serializer(accessgetminp);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = Stroke.write;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) geteotffuncui_graphics.serializer(write)).intValue();
        OutputStream getoetf = null;
        getoetf = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
                    getF getf = this.serializer;
                    getoetf = fileOutputStreamWrite;
                    if (getf != null) {
                        getoetf = new getOetf(fileOutputStreamWrite, getf);
                    }
                    bitmap.compress(compressFormat, iIntValue, getoetf);
                    getoetf.close();
                    try {
                        getoetf.close();
                    } catch (IOException unused) {
                    }
                    z = true;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException unused2) {
                Log.isLoggable("BitmapEncoder", 3);
                if (getoetf != null) {
                    try {
                        getoetf.close();
                    } catch (IOException unused3) {
                    }
                }
                z = false;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                Fill.RemoteActionCompatParcelizer(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(geteotffuncui_graphics.serializer(accessgetminp));
                bitmap.hasAlpha();
            }
            return z;
        } catch (Throwable th2) {
            if (getoetf != null) {
                try {
                    getoetf.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }
}
