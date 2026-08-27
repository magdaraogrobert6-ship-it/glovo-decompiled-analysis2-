package okhttp3.internal.publicsuffix;

import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ImageHeaderParserImageType;
import o.RequestBuilder;
import o.getCieXyz;
import o.getMaxSafeTopInset;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaN7z0Ea2bnxePLVipqp_gDhWww;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageCloselambda2;
import o.setDefaultNotificationChannelNameandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    public static final PublicSuffixDatabase IconCompatParcelizer;
    public static final RequestBuilder serializer;
    public static final List write;
    public final O$b RemoteActionCompatParcelizer;

    public PublicSuffixDatabase(O$b o$b) {
        this.RemoteActionCompatParcelizer = o$b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public final String IconCompatParcelizer(String str) {
        String str2;
        String str3;
        String str4;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listSerializer = serializer(unicode);
        List listRemoteActionCompatParcelizer = instance_delegatelambda0.write;
        O$b o$b = this.RemoteActionCompatParcelizer;
        if (((AtomicBoolean) o$b.write).get() || !((AtomicBoolean) o$b.write).compareAndSet(false, true)) {
            try {
                ((CountDownLatch) o$b.RemoteActionCompatParcelizer).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        o$b.MediaBrowserCompatMediaItem();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                        getMaxSafeTopInset.MediaDescriptionCompat.read(5, "Failed to read public suffix list", e);
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((RequestBuilder) o$b.serializer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("Unable to load ", (String) o$b.read, " resource.");
            return null;
        }
        int size3 = listSerializer.size();
        RequestBuilder[] requestBuilderArr = new RequestBuilder[size3];
        for (int i = 0; i < size3; i++) {
            RequestBuilder requestBuilder = RequestBuilder.EMPTY;
            requestBuilderArr[i] = ImageHeaderParserImageType.serializer((String) listSerializer.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                str2 = null;
                break;
            }
            RequestBuilder requestBuilder2 = (RequestBuilder) this.RemoteActionCompatParcelizer.serializer;
            if (requestBuilder2 == null) {
                removeNodeAtDepth.serializer("bytes");
                throw null;
            }
            str2 = setDefaultNotificationChannelNameandroid_sdk_base_release.read(requestBuilder2, requestBuilderArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            str3 = null;
            break;
        }
        RequestBuilder[] requestBuilderArr2 = (RequestBuilder[]) requestBuilderArr.clone();
        int length = requestBuilderArr2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length - 1) {
                str3 = null;
                break;
            }
            requestBuilderArr2[i3] = serializer;
            RequestBuilder requestBuilder3 = (RequestBuilder) this.RemoteActionCompatParcelizer.serializer;
            if (requestBuilder3 == null) {
                removeNodeAtDepth.serializer("bytes");
                throw null;
            }
            str3 = setDefaultNotificationChannelNameandroid_sdk_base_release.read(requestBuilder3, requestBuilderArr2, i3);
            if (str3 != null) {
                break;
            }
            i3++;
        }
        if (str3 == null) {
            str4 = null;
            break;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= size3 - 1) {
                str4 = null;
                break;
            }
            RequestBuilder requestBuilder4 = (RequestBuilder) this.RemoteActionCompatParcelizer.IconCompatParcelizer;
            if (requestBuilder4 == null) {
                removeNodeAtDepth.serializer("exceptionBytes");
                throw null;
            }
            str4 = setDefaultNotificationChannelNameandroid_sdk_base_release.read(requestBuilder4, requestBuilderArr, i4);
            if (str4 != null) {
                break;
            }
            i4++;
        }
        if (str4 != null) {
            listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            listRemoteActionCompatParcelizer = write;
        } else {
            List listRemoteActionCompatParcelizer2 = str2 != null ? hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str2, new char[]{'.'}) : listRemoteActionCompatParcelizer;
            if (str3 != null) {
                listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str3, new char[]{'.'});
            }
            if (listRemoteActionCompatParcelizer2.size() > listRemoteActionCompatParcelizer.size()) {
                listRemoteActionCompatParcelizer = listRemoteActionCompatParcelizer2;
            }
        }
        if (listSerializer.size() == listRemoteActionCompatParcelizer.size() && ((String) listRemoteActionCompatParcelizer.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listRemoteActionCompatParcelizer.get(0)).charAt(0) == '!') {
            size = listSerializer.size();
            size2 = listRemoteActionCompatParcelizer.size();
        } else {
            size = listSerializer.size();
            size2 = listRemoteActionCompatParcelizer.size() + 1;
        }
        return resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(1, serializer(str)), size - size2), ".");
    }

    public static List serializer(String str) {
        List listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, new char[]{'.'});
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaDescriptionCompat(listRemoteActionCompatParcelizer), ""}, getCieXyz.write())).booleanValue() ? onContentCardDismissed.IconCompatParcelizer(listRemoteActionCompatParcelizer) : listRemoteActionCompatParcelizer;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        serializer = ImageHeaderParserImageType.IconCompatParcelizer(42);
        int iSerializer = getQueryParameterslambda2.serializer();
        write = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{"*"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        IconCompatParcelizer = new PublicSuffixDatabase(new O$b(17));
    }
}
