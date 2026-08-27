package com.incognia.internal;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.CRC32;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class vb implements yUe {
    public static final String N = (String) W4i.TfN.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.W.MediaSessionCompatResultReceiverWrapper();
    public final UsU BGx;
    public JyL HQ = VPw.BGx;
    public final YZr mbG;

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.HQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:21:0x0062, B:22:0x0064, B:24:0x006a, B:27:0x0071), top: B:45:0x0062, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final void BGx(vb vbVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        String str;
        File file;
        CRC32 crc32;
        FileInputStream fileInputStream;
        byte[] bArr;
        int i;
        Long lValueOf;
        dCe dceMbG = vbVar.mbG.mbG();
        Long lValueOf2 = dceMbG != null ? Long.valueOf(dceMbG.mbG) : null;
        if (dceMbG != null) {
            mP mPVar = Ay.BGx;
            String str2 = x;
            if (mPVar.N(str2) != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mPVar.N(str2), lValueOf2}, getCieXyz.write())).booleanValue()) {
                    str = dceMbG.iaH;
                    if (str == null) {
                        file = null;
                    } else {
                        try {
                            file = new File(str);
                        } catch (Throwable unused) {
                            file = null;
                        }
                    }
                    if (file == null) {
                        lValueOf = null;
                    } else {
                        try {
                            crc32 = new CRC32();
                            fileInputStream = new FileInputStream(file);
                            try {
                                bArr = new byte[8192];
                                do {
                                    i = fileInputStream.read(bArr);
                                    if (i > 0) {
                                        crc32.update(bArr, 0, i);
                                    }
                                } while (i != -1);
                                lValueOf = Long.valueOf(crc32.getValue());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStream, th}, sourceInformationContextOfdefault.read());
                                    throw th2;
                                }
                            }
                        } catch (Throwable unused2) {
                            lValueOf = null;
                        }
                    }
                    JD jd = new JD(lValueOf, file != null ? Long.valueOf(file.length()) : null);
                    mP mPVar2 = Ay.BGx;
                    mPVar2.BGx(N, jd, g3.BGx);
                    mPVar2.BGx(x, lValueOf2);
                }
            } else {
                str = dceMbG.iaH;
                if (str == null) {
                    file = null;
                } else {
                    file = new File(str);
                }
                if (file == null) {
                    lValueOf = null;
                } else {
                    crc32 = new CRC32();
                    fileInputStream = new FileInputStream(file);
                    bArr = new byte[8192];
                    do {
                        i = fileInputStream.read(bArr);
                        if (i > 0) {
                            crc32.update(bArr, 0, i);
                        }
                    } while (i != -1);
                    lValueOf = Long.valueOf(crc32.getValue());
                    fileInputStream.close();
                }
                JD jd2 = new JD(lValueOf, file != null ? Long.valueOf(file.length()) : null);
                mP mPVar3 = Ay.BGx;
                mPVar3.BGx(N, jd2, g3.BGx);
                mPVar3.BGx(x, lValueOf2);
            }
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss((JD) Ay.BGx.BGx(qJc.BGx, N)));
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.HQ = Yp.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.HQ = pbf.BGx;
    }

    public vb(UsU usU, YZr yZr) {
        this.BGx = usU;
        this.mbG = yZr;
    }

    public final void BGx(iES ies) {
        if (O6.BGx(this, new Dd$$ExternalSyntheticLambda0(this, 17, ies))) {
            return;
        }
        ies.BGx(new isItemDismissable(new vqX(N)));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.HQ = c39.BGx;
        vn8.invoke();
    }
}
