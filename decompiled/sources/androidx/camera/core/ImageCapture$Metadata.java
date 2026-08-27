package androidx.camera.core;

import android.hardware.camera2.CaptureRequest;
import android.text.TextUtils;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.lite.common.util.ReflectionUtils;
import com.sentiance.okhttp3.u$a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.FwFClientDB;
import o.PreviewExternalSyntheticLambda0;
import o.PushDataType;
import o.WrappedCompositionsetContent1211;
import o.abandonFocus;
import o.access701;
import o.getSurfaceProvider;
import o.nativeGetYUVImageVUOff;
import o.setThumbTintList;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCapture$Metadata {
    public boolean IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public boolean getWithMapboxGeofencingConsent() {
        return this.IconCompatParcelizer;
    }

    public static nativeGetYUVImageVUOff IconCompatParcelizer(nativeGetYUVImageVUOff nativegetyuvimagevuoff) {
        abandonFocus abandonfocus = new abandonFocus();
        abandonfocus.MediaMetadataCompat = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
        Iterator it = Collections.unmodifiableList(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem).iterator();
        while (it.hasNext()) {
            abandonfocus.write((PreviewExternalSyntheticLambda0) it.next());
        }
        abandonfocus.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.FLASH_MODE), 0);
        abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
        return abandonfocus.IconCompatParcelizer();
    }

    public static void serializer(String str, PushDataType pushDataType, FwFClientDB fwFClientDB) throws IOException {
        File file = new File(str, pushDataType.MediaSessionCompatResultReceiverWrapper);
        if (!file.exists()) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Un7Z", "file is not exists");
        } else {
            try {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Un7Z", "file is exists, do delete:" + file.delete());
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.read("Un7Z", "The file exists, but an exception occurred while deleting it");
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            byte[] bArr = new byte[Fields.RotationZ];
            while (true) {
                int iWrite = fwFClientDB.write(bArr);
                if (iWrite != -1) {
                    bufferedOutputStream.write(bArr, 0, iWrite);
                } else {
                    bufferedOutputStream.close();
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Un7Z", "set read only result: " + file.setReadOnly());
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String toString() {
        return this.RemoteActionCompatParcelizer != 0 ? super.toString() : ff$$ExternalSyntheticOutline0.m(new StringBuilder("Metadata{mIsReversedHorizontal="), this.IconCompatParcelizer, ", mIsReversedVertical=false, mLocation=null}");
    }

    public boolean IconCompatParcelizer(ArrayList arrayList, boolean z) {
        if (!this.IconCompatParcelizer || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public ImageCapture$Metadata(int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 2) {
            this.IconCompatParcelizer = ((StillCaptureFlashStopRepeatingQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(StillCaptureFlashStopRepeatingQuirk.class)) != null;
            return;
        }
        if (i == 3) {
            this.IconCompatParcelizer = setThumbTintList.RemoteActionCompatParcelizer.read(TorchIsClosedAfterImageCapturingQuirk.class) != null;
            return;
        }
        if (i == 5) {
            this.IconCompatParcelizer = getSurfaceProvider.read.read(SurfaceOrderQuirk.class) != null;
            return;
        }
        if (i != 6) {
            return;
        }
        Class cls = ReflectionUtils.getClass("java.io.File");
        Method method = null;
        if (cls != null && !TextUtils.isEmpty("toPath")) {
            try {
                method = cls.getMethod("toPath", null);
            } catch (NoSuchMethodException unused) {
                WrappedCompositionsetContent1211.read("ReflectionUtils", "getMethod NoSuchMethodException");
            }
        }
        this.IconCompatParcelizer = method != null;
    }

    public boolean RemoteActionCompatParcelizer(ArrayList arrayList, boolean z) {
        if (!this.IconCompatParcelizer || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean IconCompatParcelizer(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "isContainInvalidStr: name is null";
        } else if (str.contains("../") || str.contains("..\\")) {
            str2 = "isContainInvalidStr: ../ or ..\\";
        } else if (str.contains("..") || str.contains("./")) {
            str2 = "isContainInvalidStr: .. or ./";
        } else {
            if (!str.contains(".\\.\\") && !str.contains("%00")) {
                return false;
            }
            str2 = "isContainInvalidStr: .\\.\\ or %00";
        }
        WrappedCompositionsetContent1211.read("Un7Z", str2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0 A[Catch: all -> 0x0140, IOException -> 0x0142, TryCatch #14 {IOException -> 0x0142, all -> 0x0140, blocks: (B:59:0x00ea, B:61:0x00f0, B:64:0x00f9, B:66:0x010d, B:67:0x0122, B:69:0x0126, B:71:0x0133, B:72:0x0137), top: B:128:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[Catch: all -> 0x0140, IOException -> 0x0142, TryCatch #14 {IOException -> 0x0142, all -> 0x0140, blocks: (B:59:0x00ea, B:61:0x00f0, B:64:0x00f9, B:66:0x010d, B:67:0x0122, B:69:0x0126, B:71:0x0133, B:72:0x0137), top: B:128:0x00ea }] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0167: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:97:0x0167 */
    public boolean serializer(String str, String str2) throws Throwable {
        String str3;
        AutoCloseable autoCloseable;
        FwFClientDB fwFClientDB;
        AutoCloseable autoCloseable2;
        boolean z;
        String str4;
        File file;
        FwFClientDB fwFClientDB2;
        FwFClientDB fwFClientDB3;
        PushDataType pushDataTypeSerializer;
        String str5;
        String strNormalize;
        File file2;
        String strSubstring = str2;
        boolean z2 = false;
        if (str.contains(".7z") && this.IconCompatParcelizer) {
            if (TextUtils.isEmpty(str) || IconCompatParcelizer(str)) {
                str3 = "zip file is not valid";
            } else if (TextUtils.isEmpty(str2) || IconCompatParcelizer(str2)) {
                str3 = "target directory is not valid";
            } else {
                boolean z3 = true;
                try {
                    try {
                        File file3 = new File(str);
                        if (file3.exists()) {
                            fwFClientDB = new FwFClientDB(file3);
                            try {
                                Iterator it = new ArrayList(Arrays.asList(fwFClientDB.IconCompatParcelizer.IconCompatParcelizer)).iterator();
                                long j = 0;
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = true;
                                        break;
                                    }
                                    PushDataType pushDataType = (PushDataType) it.next();
                                    Iterator it2 = it;
                                    j += pushDataType.ResultReceiver;
                                    i++;
                                    if (!IconCompatParcelizer(pushDataType.MediaSessionCompatResultReceiverWrapper) && i < 1000 && j <= 104857600 && pushDataType.ResultReceiver != -1) {
                                        it = it2;
                                    }
                                    WrappedCompositionsetContent1211.read("Un7Z", "File name is invalid or too many files or too big");
                                    z = false;
                                    break;
                                }
                                try {
                                    fwFClientDB.close();
                                } catch (IOException unused) {
                                    WrappedCompositionsetContent1211.read("Un7Z", "close zipFile IOException ");
                                }
                                if (!z) {
                                    str4 = File.separator;
                                    if (strSubstring.endsWith(str4) && str2.length() > str4.length()) {
                                        strSubstring = strSubstring.substring(0, str2.length() - str4.length());
                                    }
                                    file = new File(str);
                                    if (!file.exists()) {
                                        WrappedCompositionsetContent1211.read("Un7Z", "Decompress7zFromPath: has no .7zfile");
                                        z3 = false;
                                    }
                                    try {
                                        try {
                                            fwFClientDB3 = new FwFClientDB(file);
                                            while (true) {
                                                try {
                                                    pushDataTypeSerializer = fwFClientDB3.serializer();
                                                    if (pushDataTypeSerializer != null) {
                                                        z2 = z3;
                                                        break;
                                                    }
                                                    str5 = pushDataTypeSerializer.MediaSessionCompatResultReceiverWrapper;
                                                    if (TextUtils.isEmpty(str5)) {
                                                        strNormalize = Normalizer.normalize(str5.replaceAll("\\\\", "/"), Normalizer.Form.NFKC);
                                                        if (IconCompatParcelizer(strNormalize)) {
                                                            WrappedCompositionsetContent1211.read("Un7Z", "zipPath is a invalid path: " + strNormalize);
                                                            break;
                                                        }
                                                        if (pushDataTypeSerializer.MediaSessionCompatToken) {
                                                            file2 = new File(strSubstring, pushDataTypeSerializer.MediaSessionCompatResultReceiverWrapper);
                                                            if (!file2.exists()) {
                                                                file2.mkdirs();
                                                            }
                                                        } else {
                                                            serializer(strSubstring, pushDataTypeSerializer, fwFClientDB3);
                                                        }
                                                    }
                                                } catch (IOException unused2) {
                                                    fwFClientDB2 = fwFClientDB3;
                                                    try {
                                                        WrappedCompositionsetContent1211.read("Un7Z", "decompress7zFromPath : IOException");
                                                        if (fwFClientDB2 != null) {
                                                            fwFClientDB2.close();
                                                        }
                                                        return z2;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        fwFClientDB3 = fwFClientDB2;
                                                        if (fwFClientDB3 != null) {
                                                            try {
                                                                fwFClientDB3.close();
                                                            } catch (IOException unused3) {
                                                                WrappedCompositionsetContent1211.read("Un7Z", "SevenZFile close : IOException");
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (fwFClientDB3 != null) {
                                                        fwFClientDB3.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            fwFClientDB3.close();
                                        } catch (IOException unused4) {
                                            WrappedCompositionsetContent1211.read("Un7Z", "SevenZFile close : IOException");
                                        }
                                    } catch (IOException unused5) {
                                        fwFClientDB2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fwFClientDB2 = null;
                                        fwFClientDB3 = fwFClientDB2;
                                        if (fwFClientDB3 != null) {
                                            fwFClientDB3.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (IOException unused6) {
                                WrappedCompositionsetContent1211.read("Un7Z", "not a valid zip file, IOException");
                                if (fwFClientDB != null) {
                                    try {
                                        fwFClientDB.close();
                                    } catch (IOException unused7) {
                                        z = false;
                                        WrappedCompositionsetContent1211.read("Un7Z", "close zipFile IOException ");
                                        if (!z) {
                                            str4 = File.separator;
                                            if (strSubstring.endsWith(str4)) {
                                                strSubstring = strSubstring.substring(0, str2.length() - str4.length());
                                            }
                                            file = new File(str);
                                            if (!file.exists()) {
                                                WrappedCompositionsetContent1211.read("Un7Z", "Decompress7zFromPath: has no .7zfile");
                                                z3 = false;
                                            }
                                            fwFClientDB3 = new FwFClientDB(file);
                                            while (true) {
                                                pushDataTypeSerializer = fwFClientDB3.serializer();
                                                if (pushDataTypeSerializer != null) {
                                                    z2 = z3;
                                                    break;
                                                }
                                                str5 = pushDataTypeSerializer.MediaSessionCompatResultReceiverWrapper;
                                                if (TextUtils.isEmpty(str5)) {
                                                    strNormalize = Normalizer.normalize(str5.replaceAll("\\\\", "/"), Normalizer.Form.NFKC);
                                                    if (IconCompatParcelizer(strNormalize)) {
                                                        WrappedCompositionsetContent1211.read("Un7Z", "zipPath is a invalid path: " + strNormalize);
                                                        break;
                                                    }
                                                    if (pushDataTypeSerializer.MediaSessionCompatToken) {
                                                        file2 = new File(strSubstring, pushDataTypeSerializer.MediaSessionCompatResultReceiverWrapper);
                                                        if (!file2.exists()) {
                                                            file2.mkdirs();
                                                        }
                                                    } else {
                                                        serializer(strSubstring, pushDataTypeSerializer, fwFClientDB3);
                                                    }
                                                }
                                            }
                                            fwFClientDB3.close();
                                        }
                                        return z2;
                                    }
                                }
                            }
                            return z2;
                        }
                        WrappedCompositionsetContent1211.read("Un7Z", "Decompress7zFromPath: has no .7zfile");
                    } catch (Throwable th4) {
                        th = th4;
                        autoCloseable = autoCloseable2;
                        if (autoCloseable != null) {
                            try {
                                autoCloseable.close();
                            } catch (IOException unused8) {
                                WrappedCompositionsetContent1211.read("Un7Z", "close zipFile IOException ");
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused9) {
                    fwFClientDB = null;
                } catch (Throwable th5) {
                    th = th5;
                    autoCloseable = null;
                    if (autoCloseable != null) {
                        autoCloseable.close();
                    }
                    throw th;
                }
                str3 = "zip file contains invalid chars or too many files";
            }
            WrappedCompositionsetContent1211.read("Un7Z", str3);
            WrappedCompositionsetContent1211.read("Un7Z", "Decompress7zFromPath:  path or inputFile invalid");
            return z2;
        }
        WrappedCompositionsetContent1211.read("Un7Z", "Decompress7zFromPath:  path or inputFile not support");
        return false;
    }

    public ImageCapture$Metadata(boolean z) {
        this.RemoteActionCompatParcelizer = 7;
        this.IconCompatParcelizer = z;
    }

    public ImageCapture$Metadata(u$a u_a, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i != 4) {
            this.IconCompatParcelizer = u_a.RemoteActionCompatParcelizer(Preview3AThreadCrashQuirk.class);
        } else {
            this.IconCompatParcelizer = u_a.RemoteActionCompatParcelizer(UseTorchAsFlashQuirk.class);
        }
    }
}
