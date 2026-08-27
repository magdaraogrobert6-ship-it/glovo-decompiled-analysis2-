package o;

import android.app.PendingIntent;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getEventType {
    public static boolean RemoteActionCompatParcelizer(byte b) {
        return b > -65;
    }

    public static final Object read(final Object[] objArr, final invalidateShadow invalidateshadow, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i, int i2) {
        Object objConsumeRestored;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        long j = getpostalcode.RatingCompat;
        TuplesKt.RemoteActionCompatParcelizer(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        invalidateshadow.getClass();
        final alpha alphaVar = (alpha) getpostalcode.write((getNewPassword) getBlock.read);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            Object objRestore = (alphaVar == null || (objConsumeRestored = alphaVar.consumeRestored(string)) == null) ? null : invalidateshadow.restore(objConsumeRestored);
            if (objRestore == null) {
                objRestore = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            objComponentActivity = new DragAndDrop_androidKt(invalidateshadow, alphaVar, string, objRestore, objArr);
            getpostalcode.write(objComponentActivity);
        }
        final DragAndDrop_androidKt dragAndDrop_androidKt = (DragAndDrop_androidKt) objComponentActivity;
        Object objInvoke = Arrays.equals(objArr, dragAndDrop_androidKt.read) ? dragAndDrop_androidKt.MediaSessionCompatQueueItem : null;
        if (objInvoke == null) {
            objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(dragAndDrop_androidKt);
        boolean z = (((i & 112) ^ 48) > 32 && getpostalcode.IconCompatParcelizer(invalidateshadow)) || (i & 48) == 32;
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(alphaVar);
        boolean z2 = getpostalcode.read(string);
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(objInvoke);
        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(objArr);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if ((zIconCompatParcelizer | z | zIconCompatParcelizer2 | z2 | zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity2 == androidContentCaptureManager) {
            final Object obj = objInvoke;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.mimeTypes
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() throws PendingIntent.CanceledException {
                    boolean z3;
                    DragAndDrop_androidKt dragAndDrop_androidKt2 = dragAndDrop_androidKt;
                    alpha alphaVar2 = dragAndDrop_androidKt2.IconCompatParcelizer;
                    alpha alphaVar3 = alphaVar;
                    boolean z4 = true;
                    if (alphaVar2 != alphaVar3) {
                        dragAndDrop_androidKt2.IconCompatParcelizer = alphaVar3;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String str = dragAndDrop_androidKt2.write;
                    String str2 = string;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str2}, getCieXyz.write())).booleanValue()) {
                        z4 = z3;
                    } else {
                        dragAndDrop_androidKt2.write = str2;
                    }
                    dragAndDrop_androidKt2.serializer = invalidateshadow;
                    dragAndDrop_androidKt2.MediaSessionCompatQueueItem = obj;
                    dragAndDrop_androidKt2.read = objArr;
                    BlockDropShadowElement blockDropShadowElement = dragAndDrop_androidKt2.RemoteActionCompatParcelizer;
                    if (blockDropShadowElement != null && z4) {
                        ((androidx.navigation.NavArgsLazy) blockDropShadowElement).ResultReceiver();
                        dragAndDrop_androidKt2.RemoteActionCompatParcelizer = null;
                        dragAndDrop_androidKt2.write();
                    }
                    return createFromParcel.INSTANCE;
                }
            };
            getpostalcode.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            objComponentActivity2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        }
        getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode);
        return objInvoke;
    }

    public static final String serializer(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static void write(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (RemoteActionCompatParcelizer(b2) || (((b2 + 112) + (b << 28)) >> 30) != 0 || RemoteActionCompatParcelizer(b3) || RemoteActionCompatParcelizer(b4)) {
            throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void RemoteActionCompatParcelizer(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!RemoteActionCompatParcelizer(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !RemoteActionCompatParcelizer(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
    }

    public static void serializer(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !RemoteActionCompatParcelizer(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
    }

    public static final Object RemoteActionCompatParcelizer(Object[] objArr, invalidateShadow invalidateshadow, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        return read(Arrays.copyOf(objArr, objArr.length), invalidateshadow, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ((i << 3) & 7168) | 384, 0);
    }

    public static final Object IconCompatParcelizer(Object[] objArr, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        return read(Arrays.copyOf(objArr, objArr.length), accessgetBlockp.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ((i << 6) & 7168) | 384, 0);
    }
}
