package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setWebViewContent {
    public static final TimeZone RemoteActionCompatParcelizer;
    public static final String read;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        RemoteActionCompatParcelizer = timeZone;
        read = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.write(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class.getName(), "okhttp3."), "Client");
    }

    public static final String RemoteActionCompatParcelizer(String str, Object... objArr) {
        java.util.Locale locale = java.util.Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean RemoteActionCompatParcelizer(ItemSingleChoiceBinding itemSingleChoiceBinding, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jQ_ = itemSingleChoiceBinding.RemoteActionCompatParcelizer().P_() ? itemSingleChoiceBinding.RemoteActionCompatParcelizer().Q_() - jNanoTime : Long.MAX_VALUE;
        itemSingleChoiceBinding.RemoteActionCompatParcelizer().IconCompatParcelizer(Math.min(jQ_, timeUnit.toNanos(i)) + jNanoTime);
        try {
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            while (itemSingleChoiceBinding.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) != -1) {
                registryMissingComponentException.serializer();
            }
            if (jQ_ == Long.MAX_VALUE) {
                itemSingleChoiceBinding.RemoteActionCompatParcelizer().N_();
                return true;
            }
            itemSingleChoiceBinding.RemoteActionCompatParcelizer().IconCompatParcelizer(jNanoTime + jQ_);
            return true;
        } catch (InterruptedIOException unused) {
            if (jQ_ == Long.MAX_VALUE) {
                itemSingleChoiceBinding.RemoteActionCompatParcelizer().N_();
                return false;
            }
            itemSingleChoiceBinding.RemoteActionCompatParcelizer().IconCompatParcelizer(jNanoTime + jQ_);
            return false;
        } catch (Throwable th) {
            if (jQ_ == Long.MAX_VALUE) {
                itemSingleChoiceBinding.RemoteActionCompatParcelizer().N_();
            } else {
                itemSingleChoiceBinding.RemoteActionCompatParcelizer().IconCompatParcelizer(jNanoTime + jQ_);
            }
            throw th;
        }
    }

    public static final boolean IconCompatParcelizer(setInAppMessageImageViewAttributes setinappmessageimageviewattributes, setInAppMessageImageViewAttributes setinappmessageimageviewattributes2) {
        setinappmessageimageviewattributes.getClass();
        setinappmessageimageviewattributes2.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinappmessageimageviewattributes.host, setinappmessageimageviewattributes2.host}, getCieXyz.write())).booleanValue() || setinappmessageimageviewattributes.port != setinappmessageimageviewattributes2.port) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinappmessageimageviewattributes.scheme, setinappmessageimageviewattributes2.scheme}, getCieXyz.write())).booleanValue();
    }

    public static final void RemoteActionCompatParcelizer(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            Object[] objArr = {e2.getMessage(), "bio == null"};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final List read(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final String serializer(setInAppMessageImageViewAttributes setinappmessageimageviewattributes, boolean z) {
        int i;
        setinappmessageimageviewattributes.getClass();
        int i2 = setinappmessageimageviewattributes.port;
        String strM = setinappmessageimageviewattributes.host;
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strM, (CharSequence) ":", false)) {
            strM = m1$$ExternalSyntheticOutline0.m(']', "[", strM);
        }
        if (!z) {
            String str = setinappmessageimageviewattributes.scheme;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals(com.adjust.sdk.Constants.SCHEME) ? 443 : -1;
            }
            if (i2 == i) {
                return strM;
            }
        }
        return strM + ':' + i2;
    }

    public static final Charset serializer(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, Charset charset) {
        registryNoSourceEncoderAvailableException.getClass();
        charset.getClass();
        int iSerializer = registryNoSourceEncoderAvailableException.serializer(InAppMessageHtmlBaseViewCompanion.serializer);
        if (iSerializer == -1) {
            return charset;
        }
        if (iSerializer == 0) {
            return ensureSubscribedToInAppMessageEvents.write;
        }
        if (iSerializer == 1) {
            return ensureSubscribedToInAppMessageEvents.read;
        }
        if (iSerializer == 2) {
            Charset charset2 = ensureSubscribedToInAppMessageEvents.write;
            Charset charset3 = ensureSubscribedToInAppMessageEvents.MediaMetadataCompat;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            ensureSubscribedToInAppMessageEvents.MediaMetadataCompat = charsetForName;
            return charsetForName;
        }
        if (iSerializer == 3) {
            return ensureSubscribedToInAppMessageEvents.serializer;
        }
        if (iSerializer != 4) {
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer2);
            return null;
        }
        Charset charset4 = ensureSubscribedToInAppMessageEvents.write;
        Charset charset5 = ensureSubscribedToInAppMessageEvents.RemoteActionCompatParcelizer;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        ensureSubscribedToInAppMessageEvents.RemoteActionCompatParcelizer = charsetForName2;
        return charsetForName2;
    }

    public static final long read(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        String strWrite = _get_messagewebview_lambda1.headers.write("Content-Length");
        if (strWrite != null) {
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            try {
                return Long.parseLong(strWrite);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final resetMessageMarginslambda00 serializer(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnimationUtils animationUtils = (AnimationUtils) it.next();
            RequestBuilder requestBuilder = animationUtils.name;
            RequestBuilder requestBuilder2 = animationUtils.value;
            String strRatingCompat = requestBuilder.RatingCompat();
            String strRatingCompat2 = requestBuilder2.RatingCompat();
            arrayList.add(strRatingCompat);
            arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) strRatingCompat2).toString());
        }
        return new resetMessageMarginslambda00((String[]) arrayList.toArray(new String[0]));
    }

    public static final int read(String str, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            DrawableTransformation.read((Object) str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            DrawableTransformation.serializer((Object) str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        DrawableTransformation.serializer((Object) str.concat(" too small"));
        return 0;
    }

    public static final List read(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr.length == 1) {
                List listSingletonList = Collections.singletonList(objArr[0]);
                listSingletonList.getClass();
                return listSingletonList;
            }
            List listUnmodifiableList = Collections.unmodifiableList(onContentCardClicked.read((Object[]) objArr.clone()));
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        }
        return instance_delegatelambda0.write;
    }
}
