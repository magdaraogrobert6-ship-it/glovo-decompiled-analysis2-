package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.huawei.location.logic.zp;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DLExternal;

/* JADX INFO: loaded from: classes4.dex */
public final class tryRefreshToken extends FilterInputStream {
    public final int IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final byte[][] read;

    public tryRefreshToken(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public static byte[] IconCompatParcelizer(writeSelf writeself, byte[][] bArr) throws IOException {
        int i = writeself.serializer;
        if (i >= bArr.length) {
            return writeself.RemoteActionCompatParcelizer();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("buffer length not right for data");
            return null;
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = writeself.RatingCompat;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + writeself.serializer + " >= " + i2);
        }
        int iWrite = i - getEvaluationsfwf_client_releasedefault.write(writeself.MediaDescriptionCompat, bArr2, bArr2.length);
        writeself.serializer = iWrite;
        if (iWrite == 0) {
            writeself.serializer();
            return bArr2;
        }
        UserAgentHeaderInterceptor.serializer(writeself.RemoteActionCompatParcelizer, writeself.serializer);
        return null;
    }

    public final provideRequest IconCompatParcelizer(int i, int i2, int i3) throws IOException {
        writeSelf writeself = new writeSelf(this, i3, this.IconCompatParcelizer);
        if ((i & Constant.ERROR_WSS_INVALID) == 0) {
            return IconCompatParcelizer(i2, writeself, this.read);
        }
        int i4 = i & 192;
        int i5 = 0;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                return new getBackendNamecustomerchat_release(4, i4, i2, new UrlBuilderKt(writeself.RemoteActionCompatParcelizer(), 0), 0);
            }
            extractTokenFromHeader extracttokenfromheader = read(writeself);
            if (extracttokenfromheader.RemoteActionCompatParcelizer == 1) {
                return new getBackendNamecustomerchat_release(3, i4, i2, extracttokenfromheader.read(0), 0);
            }
            return new getBackendNamecustomerchat_release(4, i4, i2, DialogUtilsExternalSyntheticLambda0.write(extracttokenfromheader), 0);
        }
        if (i2 == 3) {
            extractTokenFromHeader extracttokenfromheader2 = read(writeself);
            int i6 = extracttokenfromheader2.RemoteActionCompatParcelizer;
            TokenRefreshAuthenticator[] tokenRefreshAuthenticatorArr = new TokenRefreshAuthenticator[i6];
            while (i5 != i6) {
                logErrordefault logerrordefault = extracttokenfromheader2.read(i5);
                if (!(logerrordefault instanceof TokenRefreshAuthenticator)) {
                    UserAgentHeaderInterceptor.IconCompatParcelizer(logerrordefault.getClass(), "unknown object encountered in constructed BIT STRING: ");
                    return null;
                }
                tokenRefreshAuthenticatorArr[i5] = (TokenRefreshAuthenticator) logerrordefault;
                i5++;
            }
            return new getCallAdapter(tokenRefreshAuthenticatorArr);
        }
        if (i2 == 4) {
            extractTokenFromHeader extracttokenfromheader3 = read(writeself);
            int i7 = extracttokenfromheader3.RemoteActionCompatParcelizer;
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[i7];
            while (i5 != i7) {
                logErrordefault logerrordefault2 = extracttokenfromheader3.read(i5);
                if (!(logerrordefault2 instanceof ASN1OctetString)) {
                    UserAgentHeaderInterceptor.IconCompatParcelizer(logerrordefault2.getClass(), "unknown object encountered in constructed OCTET STRING: ");
                    return null;
                }
                aSN1OctetStringArr[i5] = (ASN1OctetString) logerrordefault2;
                i5++;
            }
            return new RetrofitBuilderKtDefaultRetrofitBuilder2(RetrofitBuilderKtDefaultRetrofitBuilder2.serializer(aSN1OctetStringArr), aSN1OctetStringArr);
        }
        if (i2 == 8) {
            DeliveryInfoCompanion deliveryInfoCompanionWrite = DialogUtilsExternalSyntheticLambda0.write(read(writeself));
            deliveryInfoCompanionWrite.getClass();
            return new DLExternal(deliveryInfoCompanionWrite);
        }
        if (i2 != 16) {
            if (i2 == 17) {
                return DialogUtilsExternalSyntheticLambda0.serializer(read(writeself));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(d$$ExternalSyntheticOutline0.m(i2, "unknown tag ", " encountered"));
            return null;
        }
        if (writeself.serializer < 1) {
            return DialogUtilsExternalSyntheticLambda0.read;
        }
        if (!this.RemoteActionCompatParcelizer) {
            return DialogUtilsExternalSyntheticLambda0.write(read(writeself));
        }
        byte[] bArrRemoteActionCompatParcelizer = writeself.RemoteActionCompatParcelizer();
        PhoneCallTypeCompanion phoneCallTypeCompanion = new PhoneCallTypeCompanion();
        phoneCallTypeCompanion.IconCompatParcelizer = bArrRemoteActionCompatParcelizer;
        return phoneCallTypeCompanion;
    }

    public static int serializer(int i, InputStream inputStream) {
        String str;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 >= 31) {
            int i4 = i3 & 127;
            if (i4 != 0) {
                while ((i3 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
                    if ((i4 >>> 24) == 0) {
                        i3 = inputStream.read();
                        if (i3 < 0) {
                            throw new EOFException("EOF found inside tag value.");
                        }
                        i4 = (i4 << 7) | (i3 & 127);
                    } else {
                        str = "Tag number more than 31 bits";
                    }
                }
                return i4;
            }
            str = "corrupted stream - invalid high tag number found";
        } else if (i3 >= 0) {
            str = "corrupted stream - high tag number < 31 found";
        } else {
            throw new EOFException("EOF found inside tag value.");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(str);
        return 0;
    }

    public static provideRequest IconCompatParcelizer(int i, writeSelf writeself, byte[][] bArr) throws IOException {
        try {
            switch (i) {
                case 1:
                    return logInfo.serializer(IconCompatParcelizer(writeself, bArr));
                case 2:
                    return new accessgetDeviceUtilsp(writeself.RemoteActionCompatParcelizer());
                case 3:
                    return TokenRefreshAuthenticator.write(writeself.RemoteActionCompatParcelizer());
                case 4:
                    return new UrlBuilderKt(writeself.RemoteActionCompatParcelizer(), 0);
                case 5:
                    if (writeself.RemoteActionCompatParcelizer().length == 0) {
                        return buildHttpUrl.write;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    getNetworkModule.RemoteActionCompatParcelizer(writeself.serializer);
                    return getNetworkModule.RemoteActionCompatParcelizer(IconCompatParcelizer(writeself, bArr), true);
                case 7:
                    return new UserAgentHeaderInterceptorhostAppUserAgent2(new PushNotificationParserObj(writeself.RemoteActionCompatParcelizer()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return shouldRetryWithExistingToken.IconCompatParcelizer(IconCompatParcelizer(writeself, bArr), true);
                case 12:
                    return new cacheGalleryImage(writeself.RemoteActionCompatParcelizer());
                case 13:
                    int i2 = writeself.serializer;
                    ConcurrentHashMap concurrentHashMap = Providerclient2.read;
                    if (i2 <= 4096) {
                        return Providerclient2.read(IconCompatParcelizer(writeself, bArr), true);
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case 33:
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new buildChatIDEndpointUrl(writeself.RemoteActionCompatParcelizer());
                case 19:
                    return new ImageCacheResolverImpl(writeself.RemoteActionCompatParcelizer());
                case 20:
                    return new ImageSelectionNavigatorImplExternalSyntheticLambda0(writeself.RemoteActionCompatParcelizer());
                case 21:
                    return new cacheImageFile(writeself.RemoteActionCompatParcelizer());
                case 22:
                    return new buildHelpCenterChatAPAIServiceUrl(writeself.RemoteActionCompatParcelizer());
                case 23:
                    return new ProviderKt(writeself.RemoteActionCompatParcelizer());
                case 24:
                    return new authenticate(writeself.RemoteActionCompatParcelizer());
                case 25:
                    return new PushNotificationParserObj(writeself.RemoteActionCompatParcelizer());
                case 26:
                    return new CustomerChatActivityobserveState1(writeself.RemoteActionCompatParcelizer());
                case 27:
                    return new RetrofitBuilderKtmoshiConverter2(writeself.RemoteActionCompatParcelizer());
                case 28:
                    return new CacheGalleryImageUseCaseImpl(writeself.RemoteActionCompatParcelizer());
                case 30:
                    return new RetrofitBuilderKtmoshi2(IconCompatParcelizer(writeself));
            }
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e, e.getMessage());
        } catch (IllegalStateException e2) {
            throw new ASN1Exception(e2, e2.getMessage());
        }
    }

    public static char[] IconCompatParcelizer(writeSelf writeself) throws IOException {
        int i = writeself.serializer;
        if ((i & 1) != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("malformed BMPString encoding encountered");
            return null;
        }
        int i2 = i / 2;
        char[] cArr = new char[i2];
        byte[] bArr = new byte[8];
        int i3 = 0;
        int i4 = 0;
        while (i >= 8) {
            if (getEvaluationsfwf_client_releasedefault.write(writeself, bArr, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i4 += 4;
            i -= 8;
        }
        if (i > 0) {
            if (getEvaluationsfwf_client_releasedefault.write(writeself, bArr, i) != i) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            while (true) {
                int i5 = i3 + 2;
                cArr[i4] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
                i4++;
                if (i5 >= i) {
                    break;
                }
                i3 = i5;
            }
        }
        if (writeself.serializer == 0 && i2 == i4) {
            return cArr;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public final extractTokenFromHeader read(writeSelf writeself) {
        int i = writeself.serializer;
        if (i < 1) {
            return new extractTokenFromHeader(0);
        }
        tryRefreshToken tryrefreshtoken = new tryRefreshToken(writeself, i, this.RemoteActionCompatParcelizer, this.read);
        provideRequest providerequestSerializer = tryrefreshtoken.serializer();
        if (providerequestSerializer == null) {
            return new extractTokenFromHeader(0);
        }
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        do {
            extracttokenfromheader.write(providerequestSerializer);
            providerequestSerializer = tryrefreshtoken.serializer();
        } while (providerequestSerializer != null);
        return extracttokenfromheader;
    }

    public tryRefreshToken(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = z;
        this.read = bArr;
    }

    public tryRefreshToken(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11][]);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [byte[][], java.io.Serializable] */
    public final provideRequest serializer() {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected end-of-contents marker");
            return null;
        }
        int iSerializer = serializer(i, this);
        int i2 = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this, i2, false);
        if (iRemoteActionCompatParcelizer >= 0) {
            try {
                return IconCompatParcelizer(i, iSerializer, iRemoteActionCompatParcelizer);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception(e, "corrupted stream detected");
            }
        }
        if ((i & 32) == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("indefinite-length primitive encoding encountered");
            return null;
        }
        zp zpVar = new zp(new PhoneCallTypeMasked(i2, this), i2, this.read, 13);
        int i3 = i & 192;
        if (i3 != 0) {
            return zpVar.read(i3, iSerializer);
        }
        if (iSerializer == 3) {
            return ProvidernetworkModule13.serializer(zpVar);
        }
        if (iSerializer == 4) {
            return getDefaultRetrofitBuilder.write(zpVar);
        }
        if (iSerializer == 8) {
            return ClientConfigCompanion.write(zpVar);
        }
        if (iSerializer == 16) {
            return new getMoshiConverter(zpVar.RemoteActionCompatParcelizer());
        }
        if (iSerializer == 17) {
            return new RetrofitBuilderKtcallAdapter2(zpVar.RemoteActionCompatParcelizer());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unknown BER object encountered");
        return null;
    }

    public static int RemoteActionCompatParcelizer(InputStream inputStream, int i, boolean z) {
        String strM;
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 != i2) {
            int i3 = 0;
            int i4 = 0;
            do {
                int i5 = inputStream.read();
                if (i5 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                if ((i3 >>> 23) == 0) {
                    i3 = (i3 << 8) + i5;
                    i4++;
                } else {
                    strM = "long form definite-length more than 31 bits";
                }
            } while (i4 < (i2 & 127));
            if (i3 < i || z) {
                return i3;
            }
            strM = af$$ExternalSyntheticOutline0.m(i3, "corrupted stream - out of bounds length found: ", i, " >= ");
        } else {
            strM = "invalid long form definite-length 0xFF";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(strM);
        return 0;
    }
}
