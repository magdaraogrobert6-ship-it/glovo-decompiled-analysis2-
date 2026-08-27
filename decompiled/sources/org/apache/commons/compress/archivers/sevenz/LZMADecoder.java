package org.apache.commons.compress.archivers.sevenz;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.FoodoraCodReasonCompanion;
import o.FoodoraSwitchDefaultException;
import o.FoodoraSwitchWrongException;
import o.UnreadCountDetails;
import o.getFeaturesExpirationTimefwf_client_release;
import o.getSenderName;
import o.getUpdateFeaturesfwf_client_release;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.apache.commons.compress.MemoryLimitException;
import org.apache.commons.compress.PasswordRequiredException;
import org.tukaani.xz.CorruptedInputException;
import org.tukaani.xz.DeltaInputStream;
import org.tukaani.xz.LZMA2InputStream;
import org.tukaani.xz.LZMAInputStream;
import org.tukaani.xz.UnsupportedOptionsException;

/* JADX INFO: loaded from: classes4.dex */
public final class LZMADecoder extends FoodoraCodReasonCompanion {
    public static final byte[] IconCompatParcelizer = new byte[1];
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LZMADecoder(Class[] clsArr, int i) {
        super(clsArr);
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.FoodoraCodReasonCompanion
    public final InputStream write(final String str, final InputStream inputStream, long j, final FoodoraSwitchWrongException foodoraSwitchWrongException, final byte[] bArr, int i) throws IOException {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                byte[] bArr2 = foodoraSwitchWrongException.IconCompatParcelizer;
                if (bArr2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Missing LZMA properties");
                } else if (bArr2.length >= 1) {
                    byte b = bArr2[0];
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(foodoraSwitchWrongException);
                    if (iRemoteActionCompatParcelizer <= 2147483632) {
                        int i2 = LZMAInputStream.IconCompatParcelizer;
                        if (iRemoteActionCompatParcelizer < 0 || iRemoteActionCompatParcelizer > 2147483632) {
                            throw new UnsupportedOptionsException("LZMA dictionary is too big for this implementation");
                        }
                        int i3 = b & 255;
                        if (i3 > 224) {
                            throw new CorruptedInputException("Invalid LZMA properties byte");
                        }
                        int i4 = i3 % 45;
                        int i5 = i4 / 9;
                        int i6 = i4 - (i5 * 9);
                        if (i6 >= 0 && i6 <= 8 && i5 >= 0 && i5 <= 4) {
                            int iRemoteActionCompatParcelizer2 = ((1536 << (i6 + i5)) / Fields.RotationZ) + (LZMAInputStream.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer) / Fields.RotationZ) + 10;
                            if (iRemoteActionCompatParcelizer2 > i) {
                                throw new MemoryLimitException(iRemoteActionCompatParcelizer2, i);
                            }
                            LZMAInputStream lZMAInputStream = new LZMAInputStream(inputStream, j, b, iRemoteActionCompatParcelizer);
                            lZMAInputStream.RatingCompat = true;
                            return lZMAInputStream;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid lc or lp");
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Dictionary larger than 4GiB maximum size used in ", str));
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("LZMA properties too short");
                }
                return null;
            case 1:
                Inflater inflater = new Inflater(true);
                return new FoodoraSwitchDefaultException(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(IconCompatParcelizer)), inflater), inflater);
            case 2:
                return new InputStream(inputStream, foodoraSwitchWrongException, str, bArr) { // from class: org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderInputStream
                    public final String IconCompatParcelizer;
                    public final byte[] MediaBrowserCompatMediaItem;
                    public final FoodoraSwitchWrongException RemoteActionCompatParcelizer;
                    public final InputStream read;
                    public boolean serializer;
                    public CipherInputStream write;

                    public final CipherInputStream RemoteActionCompatParcelizer() throws IOException {
                        byte[] bArrDigest;
                        if (this.serializer) {
                            return this.write;
                        }
                        FoodoraSwitchWrongException foodoraSwitchWrongException2 = this.RemoteActionCompatParcelizer;
                        byte[] bArr3 = foodoraSwitchWrongException2.IconCompatParcelizer;
                        String str2 = this.IconCompatParcelizer;
                        if (bArr3 == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Missing AES256 properties in ", str2));
                            return null;
                        }
                        if (bArr3.length < 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("AES256 properties too short in ", str2));
                            return null;
                        }
                        int i7 = 0;
                        int i8 = bArr3[0];
                        int i9 = i8 & 255;
                        int i10 = i8 & 63;
                        int i11 = bArr3[1];
                        int i12 = ((i9 >> 6) & 1) + (i11 & 15);
                        int i13 = ((i9 >> 7) & 1) + ((i11 & 255) >> 4);
                        int i14 = i13 + 2;
                        if (i14 + i12 > bArr3.length) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Salt size + IV size too long in ", str2));
                            return null;
                        }
                        byte[] bArr4 = new byte[i13];
                        System.arraycopy(bArr3, 2, bArr4, 0, i13);
                        byte[] bArr5 = new byte[16];
                        System.arraycopy(foodoraSwitchWrongException2.IconCompatParcelizer, i14, bArr5, 0, i12);
                        byte[] bArr6 = this.MediaBrowserCompatMediaItem;
                        if (bArr6 == null) {
                            throw new PasswordRequiredException(ff$$ExternalSyntheticOutline0.m("Cannot read encrypted content from ", str2, " without a password."));
                        }
                        if (i10 == 63) {
                            bArrDigest = new byte[32];
                            System.arraycopy(bArr4, 0, bArrDigest, 0, i13);
                            System.arraycopy(bArr6, 0, bArrDigest, i13, Math.min(bArr6.length, 32 - i13));
                        } else {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                int i15 = 8;
                                byte[] bArr7 = new byte[8];
                                long j2 = 0;
                                while (j2 < (1 << i10)) {
                                    messageDigest.update(bArr4);
                                    messageDigest.update(bArr6);
                                    messageDigest.update(bArr7);
                                    while (i7 < i15) {
                                        byte b2 = (byte) (bArr7[i7] + 1);
                                        bArr7[i7] = b2;
                                        if (b2 != 0) {
                                            break;
                                        }
                                        i7++;
                                        i15 = 8;
                                    }
                                    j2++;
                                    i7 = 0;
                                    i15 = 8;
                                }
                                bArrDigest = messageDigest.digest();
                            } catch (NoSuchAlgorithmException e) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("SHA-256 is unsupported by your Java implementation", e);
                                return null;
                            }
                        }
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDigest, "AES");
                        try {
                            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr5));
                            CipherInputStream cipherInputStream = new CipherInputStream(this.read, cipher);
                            this.write = cipherInputStream;
                            this.serializer = true;
                            return cipherInputStream;
                        } catch (GeneralSecurityException e2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", e2);
                            return null;
                        }
                    }

                    {
                        this.read = inputStream;
                        this.RemoteActionCompatParcelizer = foodoraSwitchWrongException;
                        this.IconCompatParcelizer = str;
                        this.MediaBrowserCompatMediaItem = bArr;
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() throws IOException {
                        CipherInputStream cipherInputStream = this.write;
                        if (cipherInputStream != null) {
                            cipherInputStream.close();
                        }
                    }

                    @Override // java.io.InputStream
                    public final int read() {
                        return RemoteActionCompatParcelizer().read();
                    }

                    @Override // java.io.InputStream
                    public final int read(byte[] bArr3, int i7, int i8) {
                        return RemoteActionCompatParcelizer().read(bArr3, i7, i8);
                    }
                };
            case 3:
                return new UnreadCountDetails(inputStream);
            case 4:
                return inputStream;
            case 5:
                return new getSenderName(inputStream);
            case 6:
                byte[] bArr3 = foodoraSwitchWrongException.IconCompatParcelizer;
                int i7 = (bArr3 == null || bArr3.length == 0) ? 1 : (bArr3[0] & 255) + 1;
                if (i7 < 1 || i7 > 256) {
                    throw new UnsupportedOptionsException(c8$$ExternalSyntheticOutline0.m(i7, "Delta distance must be in the range [1, 256]: "));
                }
                getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release = getFeaturesExpirationTimefwf_client_release.write;
                return new DeltaInputStream(i7, inputStream);
            default:
                try {
                    int iWrite = write(foodoraSwitchWrongException);
                    int iWrite2 = (LZMA2InputStream.write(iWrite) / Fields.RotationZ) + 104;
                    if (iWrite2 <= i) {
                        return new LZMA2InputStream(inputStream, iWrite, getFeaturesExpirationTimefwf_client_release.write);
                    }
                    throw new MemoryLimitException(iWrite2, i);
                } catch (IllegalArgumentException e) {
                    throw new IOException(e);
                }
        }
    }

    public static int write(FoodoraSwitchWrongException foodoraSwitchWrongException) throws IOException {
        byte[] bArr = foodoraSwitchWrongException.IconCompatParcelizer;
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Missing LZMA2 properties");
            return 0;
        }
        if (bArr.length < 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("LZMA2 properties too short");
            return 0;
        }
        byte b = bArr[0];
        int i = b & 255;
        if ((b & 192) != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Unsupported LZMA2 property bits");
            return 0;
        }
        if (i > 40) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Dictionary larger than 4GiB maximum size");
            return 0;
        }
        if (i == 40) {
            return -1;
        }
        return ((b & 1) | 2) << ((i / 2) + 11);
    }

    @Override // o.FoodoraCodReasonCompanion
    public Object serializer(FoodoraSwitchWrongException foodoraSwitchWrongException) throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = 1;
        if (i != 0) {
            if (i != 6) {
                return i != 7 ? super.serializer(foodoraSwitchWrongException) : Integer.valueOf(write(foodoraSwitchWrongException));
            }
            byte[] bArr = foodoraSwitchWrongException.IconCompatParcelizer;
            if (bArr != null && bArr.length != 0) {
                i2 = 1 + (bArr[0] & 255);
            }
            return Integer.valueOf(i2);
        }
        byte[] bArr2 = foodoraSwitchWrongException.IconCompatParcelizer;
        if (bArr2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Missing LZMA properties");
        } else {
            if (bArr2.length >= 1) {
                int i3 = bArr2[0] & 255;
                int i4 = i3 / 45;
                int i5 = i3 - (i4 * 45);
                int i6 = i5 / 9;
                int i7 = i5 - (i6 * 9);
                getUpdateFeaturesfwf_client_release getupdatefeaturesfwf_client_release = new getUpdateFeaturesfwf_client_release();
                try {
                    getupdatefeaturesfwf_client_release.read = getUpdateFeaturesfwf_client_release.IconCompatParcelizer[6];
                    if (i4 < 0 || i4 > 4) {
                        throw new UnsupportedOptionsException(c8$$ExternalSyntheticOutline0.m(i4, "pb must not exceed 4: "));
                    }
                    if (i7 < 0 || i6 < 0 || i7 > 4 || i6 > 4 || i7 + i6 > 4) {
                        throw new UnsupportedOptionsException(af$$ExternalSyntheticOutline0.m(i7, "lc + lp must not exceed 4: ", i6, " + "));
                    }
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(foodoraSwitchWrongException);
                    if (iRemoteActionCompatParcelizer < 4096) {
                        throw new UnsupportedOptionsException(d$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, "LZMA2 dictionary size must be at least 4 KiB: ", " B"));
                    }
                    if (iRemoteActionCompatParcelizer > 805306368) {
                        throw new UnsupportedOptionsException(d$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, "LZMA2 dictionary size must not exceed 768 MiB: ", " B"));
                    }
                    getupdatefeaturesfwf_client_release.read = iRemoteActionCompatParcelizer;
                    return getupdatefeaturesfwf_client_release;
                } catch (UnsupportedOptionsException unused) {
                    throw new RuntimeException();
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("LZMA properties too short");
        }
        return null;
    }

    public static int RemoteActionCompatParcelizer(FoodoraSwitchWrongException foodoraSwitchWrongException) {
        byte[] bArr = foodoraSwitchWrongException.IconCompatParcelizer;
        long j = 0;
        int i = 0;
        while (i < 4) {
            int i2 = i + 1;
            j |= (((long) bArr[i2]) & 255) << (i * 8);
            i = i2;
        }
        return (int) j;
    }
}
