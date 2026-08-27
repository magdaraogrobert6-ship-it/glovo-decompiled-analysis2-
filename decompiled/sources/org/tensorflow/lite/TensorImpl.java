package org.tensorflow.lite;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import o.FwFClientcache2;
import o.FwFClientevaluateFeature1;
import o.FwFClientupdateFeatures1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class TensorImpl implements FwFClientupdateFeatures1 {
    public final FwFClientcache2 IconCompatParcelizer;
    public long serializer;
    public int[] write;

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i, int i2);

    private static native void delete(long j);

    private static native int dtype(long j);

    private static native boolean hasDelegateBufferHandle(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    @Override // o.FwFClientupdateFeatures1
    public final int[] serializer() {
        return this.write;
    }

    @Override // o.FwFClientupdateFeatures1
    public final FwFClientcache2 write() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer() {
        this.write = shape(this.serializer);
    }

    public final void RemoteActionCompatParcelizer() {
        delete(this.serializer);
        this.serializer = 0L;
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.serializer)) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            return;
        }
        IconCompatParcelizer(obj);
        boolean z = obj instanceof Buffer;
        FwFClientcache2 fwFClientcache2 = this.IconCompatParcelizer;
        if (z) {
            int iNumBytes = numBytes(this.serializer);
            boolean z2 = obj instanceof ByteBuffer;
            int iCapacity = ((Buffer) obj).capacity();
            if (!z2) {
                iCapacity *= fwFClientcache2.byteSize();
            }
            if (iNumBytes != iCapacity) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", new Object[]{name(this.serializer), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)});
                return;
            }
        } else {
            int[] iArr = read(obj);
            if (!Arrays.equals(iArr, this.write)) {
                String strName = name(this.serializer);
                String string = Arrays.toString(this.write);
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Cannot copy to a TensorFlowLite tensor (", strName, ") with shape ", string, " from a Java object with shape "), Arrays.toString(iArr), "."));
                return;
            }
        }
        if (!z) {
            if (fwFClientcache2 == FwFClientcache2.STRING && this.write.length == 0) {
                writeScalar(this.serializer, obj);
                return;
            }
            boolean zIsArray = obj.getClass().isArray();
            long j = this.serializer;
            if (zIsArray) {
                writeMultiDimensionalArray(j, obj);
                return;
            } else {
                writeScalar(j, obj);
                return;
            }
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.serializer, buffer);
                return;
            } else {
                read().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.serializer, buffer);
                return;
            } else {
                read().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.serializer, buffer);
                return;
            } else {
                read().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.serializer, buffer);
                return;
            } else {
                read().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof ShortBuffer)) {
            Gson$$ExternalSyntheticBUOutline0.m(buffer, "Unexpected input buffer type: ");
            return;
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.serializer, buffer);
        } else {
            read().asShortBuffer().put(shortBuffer);
        }
    }

    public final ByteBuffer read() {
        return buffer(this.serializer).order(ByteOrder.nativeOrder());
    }

    public final void serializer(Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.serializer)) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            return;
        }
        IconCompatParcelizer(obj);
        boolean z = obj instanceof Buffer;
        if (z) {
            int iNumBytes = numBytes(this.serializer);
            boolean z2 = obj instanceof ByteBuffer;
            int iCapacity = ((Buffer) obj).capacity();
            if (!z2) {
                iCapacity *= this.IconCompatParcelizer.byteSize();
            }
            if (iNumBytes > iCapacity) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", new Object[]{name(this.serializer), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)});
                return;
            }
        } else {
            int[] iArr = read(obj);
            if (!Arrays.equals(iArr, this.write)) {
                String strName = name(this.serializer);
                String string = Arrays.toString(this.write);
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Cannot copy from a TensorFlowLite tensor (", strName, ") with shape ", string, " to a Java object with shape "), Arrays.toString(iArr), "."));
                return;
            }
        }
        if (!z) {
            readMultiDimensionalArray(this.serializer, obj);
            return;
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(read());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(read().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(read().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(read().asIntBuffer());
        } else if (buffer instanceof ShortBuffer) {
            ((ShortBuffer) buffer).put(read().asShortBuffer());
        } else {
            Gson$$ExternalSyntheticBUOutline0.m(buffer, "Unexpected output buffer type: ");
        }
    }

    public TensorImpl(long j) {
        FwFClientcache2 fwFClientcache2;
        this.serializer = j;
        int iDtype = dtype(j);
        switch (iDtype) {
            case 1:
                fwFClientcache2 = FwFClientcache2.FLOAT32;
                break;
            case 2:
                fwFClientcache2 = FwFClientcache2.INT32;
                break;
            case 3:
                fwFClientcache2 = FwFClientcache2.UINT8;
                break;
            case 4:
                fwFClientcache2 = FwFClientcache2.INT64;
                break;
            case 5:
                fwFClientcache2 = FwFClientcache2.STRING;
                break;
            case 6:
                fwFClientcache2 = FwFClientcache2.BOOL;
                break;
            case 7:
                fwFClientcache2 = FwFClientcache2.INT16;
                break;
            case 8:
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(iDtype, "DataType error: DataType ", " is not recognized in Java."));
                throw null;
            case 9:
                fwFClientcache2 = FwFClientcache2.INT8;
                break;
        }
        this.IconCompatParcelizer = fwFClientcache2;
        this.write = shape(j);
        shapeSignature(j);
        quantizationScale(j);
        quantizationZeroPoint(j);
    }

    public static TensorImpl serializer(int i, long j) {
        return new TensorImpl(create(j, i, 0));
    }

    public static int write(Object obj) {
        if (obj != null && obj.getClass().isArray()) {
            if (Array.getLength(obj) != 0) {
                return write(Array.get(obj, 0)) + 1;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Array lengths cannot be 0.");
        }
        return 0;
    }

    public static void serializer(Object obj, int i, int[] iArr) {
        if (i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i)});
            return;
        }
        int i3 = i + 1;
        if (i3 == iArr.length) {
            return;
        }
        for (int i4 = 0; i4 < length; i4++) {
            serializer(Array.get(obj, i4), i3, iArr);
        }
    }

    public final int[] read(Object obj) {
        int iWrite = write(obj);
        if (this.IconCompatParcelizer == FwFClientcache2.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iWrite--;
                }
            }
        }
        int[] iArr = new int[iWrite];
        serializer(obj, 0, iArr);
        return iArr;
    }

    public final void IconCompatParcelizer(Object obj) {
        FwFClientcache2 fwFClientcache2;
        if (obj instanceof ByteBuffer) {
            return;
        }
        Class<?> componentType = obj.getClass();
        boolean zIsArray = componentType.isArray();
        FwFClientcache2 fwFClientcache3 = this.IconCompatParcelizer;
        if (!zIsArray) {
            if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                fwFClientcache2 = FwFClientcache2.FLOAT32;
            } else if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                fwFClientcache2 = FwFClientcache2.INT32;
            } else if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                fwFClientcache2 = FwFClientcache2.INT16;
            } else if (Byte.class.equals(componentType)) {
                fwFClientcache2 = FwFClientcache2.UINT8;
            } else if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                fwFClientcache2 = FwFClientcache2.INT64;
            } else {
                if (!Boolean.class.equals(componentType)) {
                    if (String.class.equals(componentType)) {
                        fwFClientcache2 = FwFClientcache2.STRING;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
                    return;
                }
                fwFClientcache2 = FwFClientcache2.BOOL;
            }
            if (fwFClientcache2 != fwFClientcache3) {
                return;
            } else {
                return;
            }
        }
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
        }
        if (Float.TYPE.equals(componentType)) {
            fwFClientcache2 = FwFClientcache2.FLOAT32;
        } else if (Integer.TYPE.equals(componentType)) {
            fwFClientcache2 = FwFClientcache2.INT32;
        } else if (Short.TYPE.equals(componentType)) {
            fwFClientcache2 = FwFClientcache2.INT16;
        } else if (Byte.TYPE.equals(componentType)) {
            fwFClientcache2 = FwFClientcache2.STRING;
            if (fwFClientcache3 != fwFClientcache2) {
                fwFClientcache2 = FwFClientcache2.UINT8;
            }
        } else if (Long.TYPE.equals(componentType)) {
            fwFClientcache2 = FwFClientcache2.INT64;
        } else {
            if (!Boolean.TYPE.equals(componentType)) {
                if (String.class.equals(componentType)) {
                    fwFClientcache2 = FwFClientcache2.STRING;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
                return;
            }
            fwFClientcache2 = FwFClientcache2.BOOL;
        }
        if (fwFClientcache2 != fwFClientcache3 || FwFClientevaluateFeature1.RemoteActionCompatParcelizer(fwFClientcache2).equals(FwFClientevaluateFeature1.RemoteActionCompatParcelizer(fwFClientcache3))) {
            return;
        }
        throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + fwFClientcache3 + " and a Java object of type " + obj.getClass().getName() + " (which is compatible with the TensorFlowLite type " + fwFClientcache2 + ").");
    }
}
