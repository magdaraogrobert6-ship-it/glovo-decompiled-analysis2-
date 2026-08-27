package o;

import android.graphics.Bitmap;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMeasurable {
    public static ByteBuffer write(setRequestedFrameRate setrequestedframerate) {
        int i;
        int i2 = setrequestedframerate.MediaSessionCompatQueueItem;
        if (i2 == -1) {
            Bitmap bitmapCopy = setrequestedframerate.write;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bitmapCopy);
            if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
            }
            Bitmap bitmap = bitmapCopy;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width * height;
            int[] iArr = new int[i3];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int iCeil = (int) Math.ceil(((double) height) / 2.0d);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i3);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = 0;
                while (i7 < width) {
                    int i8 = iArr[i4];
                    int i9 = i8 & 255;
                    int i10 = (i8 >> 16) & 255;
                    int i11 = (i8 >> 8) & 255;
                    byteBufferAllocateDirect.put(i5, (byte) Math.min(255, ((((i9 * 25) + ((i11 * 129) + (i10 * 66))) + androidx.compose.ui.graphics.Fields.SpotShadowColor) >> 8) + 16));
                    if (i6 % 2 == 0 && i4 % 2 == 0) {
                        byteBufferAllocateDirect.put(i3, (byte) Math.min(255, (((((i10 * 112) - (i11 * 94)) - (i9 * 18)) + androidx.compose.ui.graphics.Fields.SpotShadowColor) >> 8) + androidx.compose.ui.graphics.Fields.SpotShadowColor));
                        byteBufferAllocateDirect.put(i3 + 1, (byte) Math.min(255, (((((i10 * (-38)) - (i11 * 74)) + (i9 * 112)) + androidx.compose.ui.graphics.Fields.SpotShadowColor) >> 8) + androidx.compose.ui.graphics.Fields.SpotShadowColor));
                        i3 += 2;
                    }
                    i4++;
                    i7++;
                    i5++;
                }
            }
            return byteBufferAllocateDirect;
        }
        if (i2 == 17) {
            ByteBuffer byteBuffer = setrequestedframerate.serializer;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(byteBuffer);
            return byteBuffer;
        }
        if (i2 != 35) {
            if (i2 != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = setrequestedframerate.serializer;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(byteBuffer2);
            byteBuffer2.rewind();
            int iLimit = byteBuffer2.limit();
            int i12 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iLimit);
            int i13 = 0;
            while (true) {
                i = i12 * 4;
                if (i13 >= i) {
                    break;
                }
                byteBufferAllocateDirect2.put(i13, byteBuffer2.get(i13));
                i13++;
            }
            for (int i14 = 0; i14 < i12 + i12; i14++) {
                byteBufferAllocateDirect2.put(i + i14, byteBuffer2.get((i14 / 2) + ((i14 % 2) * i12) + i));
            }
            return byteBufferAllocateDirect2;
        }
        android.media.Image.Plane[] planeArr = setrequestedframerate.read();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(planeArr);
        int i15 = setrequestedframerate.read;
        int i16 = setrequestedframerate.IconCompatParcelizer;
        int i17 = i15 * i16;
        int i18 = i17 / 4;
        byte[] bArr = new byte[i18 + i18 + i17];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit2 = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit2 - 1);
        int i19 = (i17 + i17) / 4;
        boolean z = buffer2.remaining() == i19 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit2);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i17);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i17, 1);
            buffer3.get(bArr, i17 + 1, i19 - 1);
        } else {
            IconCompatParcelizer(planeArr[0], i15, i16, bArr, 0, 1);
            IconCompatParcelizer(planeArr[1], i15, i16, bArr, i17 + 1, 2);
            IconCompatParcelizer(planeArr[2], i15, i16, bArr, i17, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static final void IconCompatParcelizer(android.media.Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int rowStride2 = 0;
        for (int i6 = 0; i6 < rowStride; i6++) {
            int pixelStride = rowStride2;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i3] = buffer.get(pixelStride);
                i3 += i4;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }
}
