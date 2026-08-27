package o;

import io.sentry.SentryEnvelopeItem;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdazCgP5h6gmY_4iWu5QdFkjTpdf20 implements BrazeActionParserActionType {
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public final BaseBrazeActionStep read;

    @Override // o.BrazeActionParserActionType
    public final OkHttpCall$1 write(BufferedInputStream bufferedInputStream) throws IOException {
        BaseBrazeActionStep baseBrazeActionStep = this.read;
        Charset charset = RemoteActionCompatParcelizer;
        byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 <= 0) {
                    break;
                }
                for (int i4 = 0; i2 == -1 && i4 < i3; i4++) {
                    if (bArr[i4] == 10) {
                        i2 = i + i4;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i += i3;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i2 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i2, charset));
        try {
            setOnDismissCallback setondismisscallback = (setOnDismissCallback) baseBrazeActionStep.write(stringReader, setOnDismissCallback.class);
            stringReader.close();
            if (setondismisscallback == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i5 = i2 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i6 = i5;
                while (true) {
                    if (i6 >= byteArray.length) {
                        i6 = -1;
                        break;
                    }
                    if (byteArray[i6] == 10) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                StringReader stringReader2 = new StringReader(new String(byteArray, i5, i6 - i5, charset));
                try {
                    BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = (BannerViewExternalSyntheticLambda0) baseBrazeActionStep.write(stringReader2, BannerViewExternalSyntheticLambda0.class);
                    stringReader2.close();
                    if (bannerViewExternalSyntheticLambda0 == null || bannerViewExternalSyntheticLambda0.IconCompatParcelizer() <= 0) {
                        throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
                    }
                    int iIconCompatParcelizer = bannerViewExternalSyntheticLambda0.IconCompatParcelizer() + i6;
                    int i7 = iIconCompatParcelizer + 1;
                    if (i7 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i7 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new SentryEnvelopeItem(bannerViewExternalSyntheticLambda0, Arrays.copyOfRange(byteArray, i6 + 1, i7)));
                    if (i7 == byteArray.length) {
                        break;
                    }
                    i5 = iIconCompatParcelizer + 2;
                    if (i5 == byteArray.length) {
                        if (byteArray[i7] == 10) {
                            break;
                        }
                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                    }
                } catch (Throwable th3) {
                    try {
                        stringReader2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(setondismisscallback, (List) arrayList);
            byteArrayOutputStream.close();
            return okHttpCall$1;
        } catch (Throwable th5) {
            try {
                stringReader.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public r8lambdazCgP5h6gmY_4iWu5QdFkjTpdf20(BaseBrazeActionStep baseBrazeActionStep) {
        this.read = baseBrazeActionStep;
    }
}
