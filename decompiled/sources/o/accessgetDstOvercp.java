package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetDstOvercp {
    public static final setContentDrawScopeui read = new setContentDrawScopeui();
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static toContentCaptureSession write = null;

    /* JADX WARN: Code duplicated, block: B:108:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0048 A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:34:0x0042, B:36:0x0048, B:37:0x004b, B:39:0x004e, B:45:0x0071, B:51:0x0094, B:52:0x0098, B:54:0x00a9, B:62:0x00b7, B:64:0x00bd, B:79:0x00d9, B:82:0x00df, B:86:0x00e9, B:88:0x00f2, B:91:0x00fb, B:92:0x00fe, B:90:0x00f8, B:56:0x00ae, B:57:0x00b1, B:94:0x0100, B:95:0x0103, B:32:0x0040, B:31:0x003d), top: B:102:0x000d, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004e A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:34:0x0042, B:36:0x0048, B:37:0x004b, B:39:0x004e, B:45:0x0071, B:51:0x0094, B:52:0x0098, B:54:0x00a9, B:62:0x00b7, B:64:0x00bd, B:79:0x00d9, B:82:0x00df, B:86:0x00e9, B:88:0x00f2, B:91:0x00fb, B:92:0x00fe, B:90:0x00f8, B:56:0x00ae, B:57:0x00b1, B:94:0x0100, B:95:0x0103, B:32:0x0040, B:31:0x003d), top: B:102:0x000d, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    public static void RemoteActionCompatParcelizer(Context context, boolean z) {
        int i;
        boolean z2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        accessgetDstOutcp accessgetdstoutcpIconCompatParcelizer;
        int i2;
        accessgetDstOutcp accessgetdstoutcp;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || write == null) {
            synchronized (RemoteActionCompatParcelizer) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    if (Build.VERSION.SDK_INT == 30) {
                        serializer();
                        return;
                    }
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long jSerializer = serializer(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        accessgetdstoutcpIconCompatParcelizer = accessgetDstOutcp.IconCompatParcelizer(file3);
                    } else {
                        accessgetdstoutcpIconCompatParcelizer = null;
                    }
                    if (accessgetdstoutcpIconCompatParcelizer == null) {
                        if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (accessgetdstoutcpIconCompatParcelizer == null) {
                        i2 = i;
                    } else {
                        i2 = i;
                    }
                    accessgetdstoutcp = new accessgetDstOutcp(1, i2, jSerializer, length);
                    if (accessgetdstoutcpIconCompatParcelizer != null) {
                        accessgetdstoutcp.read(file3);
                    } else {
                        accessgetdstoutcp.read(file3);
                    }
                    serializer();
                    return;
                }
                if (write != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    serializer();
                    return;
                }
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                try {
                    long jSerializer2 = serializer(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            accessgetdstoutcpIconCompatParcelizer = accessgetDstOutcp.IconCompatParcelizer(file3);
                        } catch (IOException unused2) {
                            serializer();
                            return;
                        }
                    } else {
                        accessgetdstoutcpIconCompatParcelizer = null;
                    }
                    if (accessgetdstoutcpIconCompatParcelizer == null && accessgetdstoutcpIconCompatParcelizer.serializer == jSerializer2 && (i3 = accessgetdstoutcpIconCompatParcelizer.write) != 2) {
                        i = i3;
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z && z4 && i != 1) {
                        i = 2;
                    }
                    if (accessgetdstoutcpIconCompatParcelizer == null && accessgetdstoutcpIconCompatParcelizer.write == 2 && i == 1 && length3 < accessgetdstoutcpIconCompatParcelizer.IconCompatParcelizer) {
                        i2 = 3;
                    } else {
                        i2 = i;
                    }
                    accessgetdstoutcp = new accessgetDstOutcp(1, i2, jSerializer2, length);
                    if (accessgetdstoutcpIconCompatParcelizer != null || !accessgetdstoutcpIconCompatParcelizer.equals(accessgetdstoutcp)) {
                        try {
                            accessgetdstoutcp.read(file3);
                        } catch (IOException unused3) {
                        }
                    }
                    serializer();
                    return;
                } catch (PackageManager.NameNotFoundException unused4) {
                    serializer();
                    return;
                }
                throw th;
            }
        }
    }

    public static long serializer(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? accessgetExclusioncp.read(context, packageManager).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static toContentCaptureSession serializer() {
        toContentCaptureSession tocontentcapturesession = new toContentCaptureSession(11);
        write = tocontentcapturesession;
        read.write(tocontentcapturesession);
        return write;
    }
}
