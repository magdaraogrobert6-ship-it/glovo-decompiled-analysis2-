package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FixedScale {
    public static byte[] IconCompatParcelizer(String str, String str2, String str3, byte[] bArr, int i, boolean z) {
        if (i < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("BaseKeyUtil", "exportLen length must be more than 128bit.");
            return new byte[0];
        }
        if (str == null || str.length() < i) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("BaseKeyUtil", "material(first) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (str2 == null || str2.length() < i) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("BaseKeyUtil", "material(second) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (str3 == null || str3.length() < i) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("BaseKeyUtil", "material(third) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str);
        byte[] bArrRemoteActionCompatParcelizer2 = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str2);
        byte[] bArrRemoteActionCompatParcelizer3 = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str3);
        int length = bArrRemoteActionCompatParcelizer.length;
        int length2 = bArrRemoteActionCompatParcelizer2.length;
        int length3 = bArrRemoteActionCompatParcelizer3.length;
        if (length2 < length) {
            length = length2;
        }
        if (length3 >= length) {
            length3 = length;
        }
        if ((bArr.length >= 16) & (length3 >= 16)) {
            char[] cArr = new char[length3];
            for (int i2 = 0; i2 < length3; i2++) {
                cArr[i2] = (char) ((bArrRemoteActionCompatParcelizer[i2] ^ bArrRemoteActionCompatParcelizer2[i2]) ^ bArrRemoteActionCompatParcelizer3[i2]);
            }
            if (!z) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("BaseKeyUtil");
                return ComposeScrollCaptureCallback_androidKt.read(cArr, bArr, i * 8, false);
            }
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("BaseKeyUtil");
            return ComposeScrollCaptureCallback_androidKt.read(cArr, bArr, i * 8, true);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("key length must be more than 128bit.");
        return null;
    }
}
