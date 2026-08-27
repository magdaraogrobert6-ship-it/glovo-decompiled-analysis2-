package o;

import android.content.Context;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g {
    public static ByteBuffer IconCompatParcelizer(int i, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()) : byteBuffer;
    }

    public static ByteBuffer read(float[][][] fArr, ByteBuffer byteBuffer) {
        if (fArr.length != 0) {
            float[][] fArr2 = fArr[0];
            if (fArr2.length != 0) {
                float[] fArr3 = fArr2[0];
                if (fArr3.length != 0) {
                    int length = fArr.length * fArr2.length * fArr3.length * 4;
                    if (byteBuffer == null || byteBuffer.limit() != length) {
                        byteBuffer = ByteBuffer.allocateDirect(length);
                        byteBuffer.order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.rewind();
                    for (float[][] fArr4 : fArr) {
                        for (float[] fArr5 : fArr4) {
                            for (float f : fArr5) {
                                byteBuffer.putFloat(f);
                            }
                        }
                    }
                    byteBuffer.rewind();
                    return byteBuffer;
                }
            }
        }
        return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer write(int i, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()) : byteBuffer;
    }

    public static float[] IconCompatParcelizer(long[] jArr, long j, long j2) {
        if (jArr.length != 0 && j2 > 0) {
            int length = jArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (jArr[i] - j) / j2;
            }
            return fArr;
        }
        return new float[jArr.length];
    }

    public static ByteBuffer RemoteActionCompatParcelizer(ByteBuffer byteBuffer, float[] fArr) {
        int length = fArr.length * 4;
        if (byteBuffer == null || byteBuffer.limit() != length) {
            byteBuffer = ByteBuffer.allocateDirect(length);
            byteBuffer.order(ByteOrder.nativeOrder());
        }
        byteBuffer.rewind();
        for (float f : fArr) {
            byteBuffer.putFloat(f);
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    public static ByteBuffer read(float[][] fArr, ByteBuffer byteBuffer) {
        if (fArr.length == 0) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        int length = fArr.length * fArr[0].length * 4;
        if (byteBuffer == null || byteBuffer.limit() != length) {
            byteBuffer = ByteBuffer.allocateDirect(length);
            byteBuffer.order(ByteOrder.nativeOrder());
        }
        byteBuffer.rewind();
        for (float[] fArr2 : fArr) {
            for (float f : fArr2) {
                byteBuffer.putFloat(f);
            }
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    public static File RemoteActionCompatParcelizer(Context context, String str) {
        File file = new File(context.getNoBackupFilesDir(), str);
        file.mkdirs();
        return file;
    }

    public static float[] IconCompatParcelizer(ByteBuffer byteBuffer, float[] fArr) {
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            return fArr;
        }
        byteBuffer.rewind();
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        int iRemaining = floatBufferAsFloatBuffer.remaining();
        float[] fArr2 = new float[iRemaining];
        for (int i = 0; i < iRemaining; i++) {
            fArr2[i] = floatBufferAsFloatBuffer.get(i);
        }
        return fArr2;
    }

    public static int[] RemoteActionCompatParcelizer(int[] iArr, ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            return iArr;
        }
        byteBuffer.rewind();
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        int iRemaining = intBufferAsIntBuffer.remaining();
        int[] iArr2 = new int[iRemaining];
        for (int i = 0; i < iRemaining; i++) {
            iArr2[i] = intBufferAsIntBuffer.get(i);
        }
        return iArr2;
    }

    public static ArrayList serializer(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.hasArray()) {
            byteBuffer.rewind();
            FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
            int iRemaining = floatBufferAsFloatBuffer.remaining();
            ArrayList arrayList = new ArrayList(iRemaining);
            for (int i = 0; i < iRemaining; i++) {
                arrayList.add(Double.valueOf(floatBufferAsFloatBuffer.get(i)));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
