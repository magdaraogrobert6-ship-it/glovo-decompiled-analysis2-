package com.incognia.internal;

import androidx.compose.ui.graphics.Fields;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEvents;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardClicked;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dDH {
    public static String BGx(String str, Yx3 yx3, vue vueVar, int i) {
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        byte[] bArr = {(byte) i};
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        zu zuVar = new zu(bArr3, bArr2, yEy.BGx(0, vueVar.BGx));
        Deflater deflater = new Deflater(5, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
        try {
            try {
                deflaterOutputStream.write(bytes);
                deflaterOutputStream.flush();
                deflaterOutputStream.close();
                deflater.end();
                byte[] bArrMbG = zuVar.mbG(byteArrayOutputStream.toByteArray());
                if (zuVar.mbG == null) {
                    throw new SecurityException();
                }
                byte[] bArr4 = zuVar.mbG;
                E2e e2e = new E2e(bArr4);
                e2e.mbG.BGx(zuVar.BGx);
                e2e.mbG.BGx(bArrMbG);
                Lql lql = new Lql();
                byte[] bArrBGx = nQ.BGx(E2e.N, E2e.BGx(bArr4));
                byte[] bArrBGx2 = e2e.mbG.BGx();
                int length = bArrBGx.length;
                int i2 = length + 32;
                byte[] bArr5 = new byte[i2];
                System.arraycopy(bArrBGx, 0, bArr5, 0, length);
                System.arraycopy(bArrBGx2, 0, bArr5, length, 32);
                lql.BGx(i2, bArr5);
                byte[] bArrSerializer = onContentCardClicked.serializer(bArrMbG, onContentCardClicked.RemoteActionCompatParcelizer(lql.BGx(), (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(zuVar.hIl)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write())));
                byte[] bArrBGx3 = yx3.BGx(bArr3);
                byte[] bArr6 = new byte[bArrBGx3.length + 17 + bArrSerializer.length];
                System.arraycopy(bArr, 0, bArr6, 0, 1);
                System.arraycopy(bArrBGx3, 0, bArr6, 1, bArrBGx3.length);
                System.arraycopy(bArr2, 0, bArr6, bArrBGx3.length + 1, 16);
                System.arraycopy(bArrSerializer, 0, bArr6, bArrBGx3.length + 17, bArrSerializer.length);
                return yEy.HQ(11, bArr6);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{deflaterOutputStream, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] HQ(byte[] bArr) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        zu zuVar = new zu(bArr3, bArr2, yEy.BGx(0, Z7M.BGx().BGx));
        Deflater deflater = new Deflater(5, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
        try {
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.flush();
                deflaterOutputStream.close();
                deflater.end();
                byte[] bArrMbG = zuVar.mbG(byteArrayOutputStream.toByteArray());
                if (zuVar.mbG == null) {
                    throw new SecurityException();
                }
                byte[] bArr4 = zuVar.mbG;
                E2e e2e = new E2e(bArr4);
                e2e.mbG.BGx(zuVar.BGx);
                e2e.mbG.BGx(bArrMbG);
                Lql lql = new Lql();
                byte[] bArrBGx = nQ.BGx(E2e.N, E2e.BGx(bArr4));
                byte[] bArrBGx2 = e2e.mbG.BGx();
                int length = bArrBGx.length;
                int i = length + 32;
                byte[] bArr5 = new byte[i];
                System.arraycopy(bArrBGx, 0, bArr5, 0, length);
                System.arraycopy(bArrBGx2, 0, bArr5, length, 32);
                lql.BGx(i, bArr5);
                byte[] bArrBGx3 = lql.BGx();
                Object[] objArr = {0, Integer.valueOf(zuVar.hIl)};
                int iWrite = BackspaceCommand.write();
                byte[] bArrSerializer = onContentCardClicked.serializer(bArrMbG, onContentCardClicked.RemoteActionCompatParcelizer(bArrBGx3, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)));
                byte[] bArrBGx4 = ((Jz) oV.mbG()).aly.BGx(bArr3);
                byte[] bArr6 = new byte[bArrBGx4.length + 16 + bArrSerializer.length];
                System.arraycopy(bArrBGx4, 0, bArr6, 0, bArrBGx4.length);
                System.arraycopy(bArr2, 0, bArr6, bArrBGx4.length, 16);
                System.arraycopy(bArrSerializer, 0, bArr6, bArrBGx4.length + 16, bArrSerializer.length);
                return bArr6;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    int i4 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i2, i3, -871780639, sourceInformationContextOfdefault.read(), new Object[]{deflaterOutputStream, th}, i4);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] mbG(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
        zu zuVar = new zu(yEy.BGx(0, new byte[]{101, 75, 115, 117, 52, 75, 100, 118, 68, 88, 65, 48, 114, 69, 120, 67, 84, 79, 104, 109, 121, 121, 112, 54, 101, 112, 106, 82, 77, 111, 116, 107, 89, 54, 70, 103, 47, 99, 74, 50, 86, 65, 48, 61}), bArr2, yEy.BGx(0, Z7M.BGx().BGx));
        byte[] bArrRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(bArr3, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(length - zuVar.hIl)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
        byte[] bArrRemoteActionCompatParcelizer2 = onContentCardClicked.RemoteActionCompatParcelizer(bArr3, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Integer.valueOf(length - zuVar.hIl), Integer.valueOf(length)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
        if (zuVar.mbG == null) {
            throw new SecurityException();
        }
        byte[] bArr4 = zuVar.mbG;
        E2e e2e = new E2e(bArr4);
        e2e.mbG.BGx(zuVar.BGx);
        e2e.mbG.BGx(bArrRemoteActionCompatParcelizer);
        Lql lql = new Lql();
        byte[] bArrBGx = nQ.BGx(E2e.N, E2e.BGx(bArr4));
        byte[] bArrBGx2 = e2e.mbG.BGx();
        int length2 = bArrBGx.length;
        int i = length2 + 32;
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArrBGx, 0, bArr5, 0, length2);
        System.arraycopy(bArrBGx2, 0, bArr5, length2, 32);
        lql.BGx(i, bArr5);
        if (!Arrays.equals(onContentCardClicked.RemoteActionCompatParcelizer(lql.BGx(), (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(zuVar.hIl)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write())), bArrRemoteActionCompatParcelizer2)) {
            throw new SecurityException();
        }
        byte[] bArrBGx3 = zuVar.BGx(bArrRemoteActionCompatParcelizer);
        byte[] bArr6 = new byte[Fields.RotationX];
        System.arraycopy(bArrBGx3, 0, bArr6, 0, Fields.RotationX);
        int length3 = bArrBGx3.length - 256;
        byte[] bArr7 = new byte[length3];
        System.arraycopy(bArrBGx3, Fields.RotationX, bArr7, 0, length3);
        Yx3 yx3 = ((Jz) oV.mbG()).aly;
        yx3.getClass();
        Lql lql2 = new Lql();
        lql2.BGx(length3, bArr7);
        byte[] bArrBGx4 = lql2.BGx();
        lql2.mbG();
        BigInteger bigInteger = new BigInteger(1, Yx3.BGx(new BigInteger(1, bArr6).modPow(yx3.mbG, yx3.BGx), (yx3.BGx.bitLength() + 7) >>> 3));
        int iBitLength = yx3.BGx.bitLength();
        int iBitLength2 = (yx3.BGx.bitLength() + 7) >>> 3;
        int i2 = iBitLength2 * 8;
        if (bigInteger.bitLength() <= i2) {
            byte[] bArrBGx5 = Yx3.BGx(bigInteger, iBitLength2);
            if (iBitLength2 >= 34) {
                int i3 = iBitLength2 - 1;
                if (bArrBGx5[i3] == -68) {
                    int i4 = iBitLength2 - 33;
                    byte[] bArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArrBGx5, 0, i4);
                    byte[] bArrIconCompatParcelizer2 = onContentCardClicked.IconCompatParcelizer(bArrBGx5, i4, i3);
                    byte b = (byte) (255 >> (i2 - (iBitLength - 1)));
                    if ((bArrBGx5[0] & ((byte) (~b))) == 0) {
                        Lql lql3 = new Lql();
                        Yx3.BGx(bArrIconCompatParcelizer, lql3, bArrIconCompatParcelizer2);
                        bArrIconCompatParcelizer[0] = (byte) (b & bArrIconCompatParcelizer[0]);
                        int length4 = bArrIconCompatParcelizer.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length4) {
                                i5 = 0;
                                break;
                            }
                            if (bArrIconCompatParcelizer[i5] == 1) {
                                break;
                            }
                            i5++;
                        }
                        int length5 = (bArrIconCompatParcelizer.length - i5) - 1;
                        int i6 = ((iBitLength2 - 32) - length5) - 2;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if (bArrIconCompatParcelizer[i7] == 0) {
                            }
                        }
                        if (bArrIconCompatParcelizer[i6] == 1) {
                            byte[] bArrIconCompatParcelizer3 = onContentCardClicked.IconCompatParcelizer(bArrIconCompatParcelizer, bArrIconCompatParcelizer.length - length5, bArrIconCompatParcelizer.length);
                            lql3.BGx(8, new byte[8]);
                            lql3.BGx(32, bArrBGx4);
                            lql3.BGx(bArrIconCompatParcelizer3);
                            if (Arrays.equals(lql3.BGx(), bArrIconCompatParcelizer2)) {
                                return jj.BGx(bArr7);
                            }
                        }
                    }
                }
            }
        }
        throw new SecurityException();
    }

    public static String HQ(String str) {
        byte[] bArrBGx = yEy.BGx(2, str.getBytes());
        byte[] bArr = {51, 102, 51, 54, 49, 53, 99, 101, 102, 100, 98, 97, 49, 102, 55, 99};
        if (bArrBGx.length != 0) {
            byte[] bArr2 = {65, 118, 109, 97, 112, 116, 69, 74, 102, 104, 48, 98, 119, 90, 48, 48};
            if (bArrBGx.length >= 16) {
                byte[] bArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArrBGx, 0, 16);
                boolean zEquals = Arrays.equals(bArrIconCompatParcelizer, bArr2);
                Arrays.fill(bArrIconCompatParcelizer, (byte) 0);
                Arrays.fill(bArr2, (byte) 0);
                if (zEquals) {
                    byte[] bArrBGx2 = new zu(bArr, BGx(), null).BGx(onContentCardClicked.IconCompatParcelizer(bArrBGx, 16, bArrBGx.length));
                    byte[] bArrIconCompatParcelizer2 = onContentCardClicked.IconCompatParcelizer(bArrBGx2, 16, bArrBGx2.length);
                    Arrays.fill(bArr, (byte) 0);
                    return hideCurrentlyDisplayingInAppMessage.read((CharSequence) new String(bArrIconCompatParcelizer2, ensureSubscribedToInAppMessageEvents.write)).toString();
                }
            }
            byte[] bArr3 = {65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65};
            byte[] bArrBGx3 = new zu(bArr, bArr3, null).BGx(bArrBGx);
            Arrays.fill(bArr3, (byte) 0);
            Arrays.fill(bArr, (byte) 0);
            return hideCurrentlyDisplayingInAppMessage.read((CharSequence) new String(bArrBGx3, ensureSubscribedToInAppMessageEvents.write)).toString();
        }
        throw new SecurityException();
    }

    public static String BGx(String str) {
        byte[] bArrBGx = yEy.BGx(3, str.getBytes());
        byte[] bArr = {99, 52, 75, 50, 99, 102, 88, 121, 106, 119, 112, 54, 114, 115, 100, 101};
        byte[] bArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArrBGx, 0, 16);
        byte[] bArrBGx2 = new zu(bArr, bArrIconCompatParcelizer, null).BGx(onContentCardClicked.IconCompatParcelizer(bArrBGx, 16, bArrBGx.length));
        Arrays.fill(bArr, (byte) 0);
        return hideCurrentlyDisplayingInAppMessage.read((CharSequence) new String(bArrBGx2, ensureSubscribedToInAppMessageEvents.write)).toString();
    }

    public static byte[] BGx() {
        Lql lql = new Lql();
        lql.BGx(UUID.randomUUID().toString().getBytes(ensureSubscribedToInAppMessageEvents.write));
        return onContentCardClicked.IconCompatParcelizer(lql.BGx(), 0, 16);
    }

    public static String BGx(byte[] bArr) {
        byte[] bArr2 = {99, 52, 75, 50, 99, 102, 88, 121, 106, 119, 112, 54, 114, 115, 100, 101};
        byte[] bArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArr, 0, 16);
        byte[] bArrBGx = new zu(bArr2, bArrIconCompatParcelizer, null).BGx(onContentCardClicked.IconCompatParcelizer(bArr, 16, bArr.length));
        Arrays.fill(bArr2, (byte) 0);
        return hideCurrentlyDisplayingInAppMessage.read((CharSequence) new String(bArrBGx, ensureSubscribedToInAppMessageEvents.write)).toString();
    }

    public static String mbG(String str) {
        Charset charset = ensureSubscribedToInAppMessageEvents.write;
        byte[] bytes = str.getBytes(charset);
        byte[] bArr = {99, 52, 75, 50, 99, 102, 88, 121, 106, 119, 112, 54, 114, 115, 100, 101};
        byte[] bArrBGx = BGx();
        byte[] bArrMbG = new zu(bArr, bArrBGx, null).mbG(bytes);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArrBGx);
            byteArrayOutputStream.write(bArrMbG);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(bArrBGx, (byte) 0);
            return hideCurrentlyDisplayingInAppMessage.read((CharSequence) new String(yEy.mbG(2, byteArray), charset)).toString();
        } catch (IOException e) {
            throw new SecurityException(e);
        }
    }
}
