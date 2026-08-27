package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class drawPathLG529CIdefault implements getInverseTransform {
    public final getF IconCompatParcelizer;
    public final ArrayList read;
    public final drawImageAZ2fEMsdefault serializer;

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        return !((Boolean) geteotffuncui_graphics.serializer(drawPointsF8ZwMP8default.IconCompatParcelizer)).booleanValue() && resizeToBitmapDimensionslambda3.IconCompatParcelizer(this.read, (InputStream) obj, this.IconCompatParcelizer) == ImageHeaderParser$ImageType.GIF;
    }

    public drawPathLG529CIdefault(ArrayList arrayList, drawImageAZ2fEMsdefault drawimageaz2femsdefault, getF getf) {
        this.read = arrayList;
        this.serializer = drawimageaz2femsdefault;
        this.IconCompatParcelizer = getf;
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(androidx.compose.ui.graphics.Fields.Clip);
        try {
            byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.Clip];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                SentryLogcatAdapter.write("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.serializer.IconCompatParcelizer(ByteBuffer.wrap(byteArray), i, i2, geteotffuncui_graphics);
    }
}
