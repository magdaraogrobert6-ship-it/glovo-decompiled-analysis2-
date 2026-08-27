package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.OS;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isContentCardsUnreadVisualIndicatorEnabled {
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer;
    public Object write;

    public void IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public void MediaDescriptionCompat() {
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.write).iterator();
            while (it.hasNext()) {
                ((setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) it.next()).serializer.serializer();
            }
            Iterator it2 = ((ArrayDeque) this.RemoteActionCompatParcelizer).iterator();
            while (it2.hasNext()) {
                ((setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) it2.next()).serializer.serializer();
            }
            Iterator it3 = ((ArrayDeque) this.read).iterator();
            while (it3.hasNext()) {
                ((setSessionTimeoutandroid_sdk_base_release) it3.next()).serializer();
            }
        }
    }

    public void serializer(String str) {
        this.read = str;
    }

    public void serializer(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = ((isActive) this.IconCompatParcelizer).write;
        if (length != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of secretKeySeed needs to be equal to size of digest");
            return;
        }
        if (bArr2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("publicSeed == null");
        } else if (bArr2.length != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size of publicSeed needs to be equal to size of digest");
        } else {
            this.RemoteActionCompatParcelizer = bArr;
            this.read = bArr2;
        }
    }

    public isContentCardsUnreadVisualIndicatorEnabled(isActive isactive) {
        this.serializer = 21;
        if (isactive == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("params == null");
            throw null;
        }
        this.IconCompatParcelizer = isactive;
        int i = isactive.write;
        this.write = new getHoldouts(i, (getNetworkModule) isactive.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = new byte[i];
        this.read = new byte[i];
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release IconCompatParcelizer(setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        isActive isactive = (isActive) this.IconCompatParcelizer;
        byte[][] bArr = new byte[isactive.read][];
        int i = 0;
        while (true) {
            int i2 = isactive.read;
            if (i >= i2) {
                return new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(isactive, bArr);
            }
            setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(1);
            setcustomerprofilefwf_client_release.serializer = setcustomerprofileupdatetimefwf_client_release.MediaDescriptionCompat;
            setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = setcustomerprofileupdatetimefwf_client_release.MediaBrowserCompatMediaItem;
            setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = setcustomerprofileupdatetimefwf_client_release.RemoteActionCompatParcelizer;
            setcustomerprofilefwf_client_release.write = i;
            setcustomerprofilefwf_client_release.read = setcustomerprofileupdatetimefwf_client_release.read;
            setcustomerprofilefwf_client_release.IconCompatParcelizer = setcustomerprofileupdatetimefwf_client_release.write;
            setcustomerprofileupdatetimefwf_client_release = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release);
            if (i < 0 || i >= i2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("index out of bounds");
                return null;
            }
            bArr[i] = write(((getHoldouts) this.write).read((byte[]) this.RemoteActionCompatParcelizer, hsvJlNiLsgdefault.write(32, i)), isactive.serializer - 1, setcustomerprofileupdatetimefwf_client_release);
            i++;
        }
    }

    public r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM MediaBrowserCompatMediaItem() {
        return new r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM((SocketAddress) this.IconCompatParcelizer, (InetSocketAddress) this.write, (String) this.RemoteActionCompatParcelizer, (String) this.read);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c A[Catch: all -> 0x00de, TryCatch #4 {, blocks: (B:28:0x0086, B:30:0x008c, B:31:0x00aa), top: B:59:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void RatingCompat() {
        int size;
        int i;
        setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.write).iterator();
            while (true) {
                int i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release2 = (setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) it.next();
                if (((ArrayDeque) this.RemoteActionCompatParcelizer).size() >= 64) {
                    break;
                }
                Iterator it2 = ((ArrayDeque) this.RemoteActionCompatParcelizer).iterator();
                while (it2.hasNext()) {
                    if (((setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) it2.next()).serializer.serializer.write.write.equals(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release2.serializer.serializer.write.write)) {
                        i2++;
                    }
                }
                if (i2 < 5) {
                    it.remove();
                    arrayList.add(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release2);
                    ((ArrayDeque) this.RemoteActionCompatParcelizer).add(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release2);
                }
            }
            synchronized (this) {
                ((ArrayDeque) this.RemoteActionCompatParcelizer).size();
                ((ArrayDeque) this.read).size();
            }
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release = (setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) arrayList.get(i);
                synchronized (this) {
                    if (((ExecutorService) this.IconCompatParcelizer) == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
                        this.IconCompatParcelizer = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig("OkHttp Dispatcher", false));
                    }
                    ExecutorService executorService = (ExecutorService) this.IconCompatParcelizer;
                }
                setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release.serializer;
                try {
                    try {
                        executorService.execute(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        setsessiontimeoutandroid_sdk_base_release.write.getClass();
                        setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release.write.RemoteActionCompatParcelizer(setsessiontimeoutandroid_sdk_base_release, interruptedIOException);
                        setsessiontimeoutandroid_sdk_base_release.read.IconCompatParcelizer.RemoteActionCompatParcelizer(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release);
                    }
                } catch (Throwable th) {
                    setsessiontimeoutandroid_sdk_base_release.read.IconCompatParcelizer.RemoteActionCompatParcelizer(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release);
                    throw th;
                }
            }
        }
        size = arrayList.size();
        while (i < size) {
            setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release = (setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) arrayList.get(i);
            synchronized (this) {
                if (((ExecutorService) this.IconCompatParcelizer) == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    byte[] bArr2 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
                    this.IconCompatParcelizer = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig("OkHttp Dispatcher", false));
                }
                ExecutorService executorService2 = (ExecutorService) this.IconCompatParcelizer;
                setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release2 = setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release.serializer;
                executorService2.execute(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release);
            }
        }
    }

    public void RemoteActionCompatParcelizer(setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release) {
        ArrayDeque arrayDeque = (ArrayDeque) this.RemoteActionCompatParcelizer;
        synchronized (this) {
            if (!arrayDeque.remove(setshouldaddstatusbarpaddingtoinappmessagesandroid_sdk_base_release)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        RatingCompat();
    }

    public setLanguage serializer() {
        int i = ((setLineId) this.IconCompatParcelizer) != null ? 1 : 0;
        if (((setCustomUserAttributeToSecondsFromEpoch) this.write) != null) {
            i++;
        }
        if (((removeFromSubscriptionGrouplambda0) this.RemoteActionCompatParcelizer) != null) {
            i++;
        }
        if (((setCustomUserAttributelambda5) this.read) != null) {
            i++;
        }
        if (i == 1) {
            return new setLanguage(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public void write(InetSocketAddress inetSocketAddress) {
        TextStreamsKt.serializer(inetSocketAddress, "proxyAddress");
        this.IconCompatParcelizer = inetSocketAddress;
    }

    public byte[] write(byte[] bArr, int i, setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        getHoldouts getholdouts = (getHoldouts) this.write;
        isActive isactive = (isActive) this.IconCompatParcelizer;
        int i2 = isactive.write;
        if (bArr.length != i2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i2, "startHash needs to be ", "bytes"));
            return null;
        }
        setcustomerprofileupdatetimefwf_client_release.serializer();
        if (i > isactive.serializer - 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("max chain length must not be greater than w");
            return null;
        }
        if (i == 0) {
            return bArr;
        }
        int i3 = i - 1;
        byte[] bArrWrite = write(bArr, i3, setcustomerprofileupdatetimefwf_client_release);
        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(1);
        setcustomerprofilefwf_client_release.serializer = setcustomerprofileupdatetimefwf_client_release.MediaDescriptionCompat;
        setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = setcustomerprofileupdatetimefwf_client_release.MediaBrowserCompatMediaItem;
        setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = setcustomerprofileupdatetimefwf_client_release.RemoteActionCompatParcelizer;
        setcustomerprofilefwf_client_release.write = setcustomerprofileupdatetimefwf_client_release.serializer;
        setcustomerprofilefwf_client_release.read = i3;
        setcustomerprofilefwf_client_release.IconCompatParcelizer = 0;
        setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release2 = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release);
        byte[] bArr2 = getholdouts.read((byte[]) this.read, setcustomerprofileupdatetimefwf_client_release2.serializer());
        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release2 = new setCustomerProfilefwf_client_release(1);
        setcustomerprofilefwf_client_release2.serializer = setcustomerprofileupdatetimefwf_client_release2.MediaDescriptionCompat;
        setcustomerprofilefwf_client_release2.MediaBrowserCompatMediaItem = setcustomerprofileupdatetimefwf_client_release2.MediaBrowserCompatMediaItem;
        setcustomerprofilefwf_client_release2.RemoteActionCompatParcelizer = setcustomerprofileupdatetimefwf_client_release2.RemoteActionCompatParcelizer;
        setcustomerprofilefwf_client_release2.write = setcustomerprofileupdatetimefwf_client_release2.serializer;
        setcustomerprofilefwf_client_release2.read = setcustomerprofileupdatetimefwf_client_release2.read;
        setcustomerprofilefwf_client_release2.IconCompatParcelizer = 1;
        byte[] bArr3 = getholdouts.read((byte[]) this.read, new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release2).serializer());
        byte[] bArr4 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr4[i4] = (byte) (bArrWrite[i4] ^ bArr3[i4]);
        }
        int length = bArr2.length;
        int i5 = getholdouts.IconCompatParcelizer;
        if (length != i5) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("wrong key length");
            return null;
        }
        if (i2 == i5) {
            return getholdouts.read(0, bArr2, bArr4);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("wrong in length");
        return null;
    }

    public byte[] IconCompatParcelizer(byte[] bArr, setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(1);
        setcustomerprofilefwf_client_release.serializer = setcustomerprofileupdatetimefwf_client_release.MediaDescriptionCompat;
        setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = setcustomerprofileupdatetimefwf_client_release.MediaBrowserCompatMediaItem;
        setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = setcustomerprofileupdatetimefwf_client_release.RemoteActionCompatParcelizer;
        return ((getHoldouts) this.write).read(bArr, new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release).serializer());
    }

    public void RemoteActionCompatParcelizer(InetSocketAddress inetSocketAddress) {
        TextStreamsKt.serializer(inetSocketAddress, "targetAddress");
        this.write = inetSocketAddress;
    }

    public String toString() {
        if (this.serializer != 20) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("StreamMap with indices of ");
        sb.append(((int[]) this.IconCompatParcelizer).length);
        sb.append(" folders, offsets of ");
        sb.append(((long[]) this.write).length);
        sb.append(" packed streams, first files of ");
        sb.append(((int[]) this.RemoteActionCompatParcelizer).length);
        sb.append(" folders and folder indices for ");
        return af$$ExternalSyntheticOutline0.m(((int[]) this.read).length, " files", sb);
    }

    public /* synthetic */ isContentCardsUnreadVisualIndicatorEnabled(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
    }

    public /* synthetic */ isContentCardsUnreadVisualIndicatorEnabled(int i) {
        this.serializer = i;
    }

    public /* synthetic */ isContentCardsUnreadVisualIndicatorEnabled(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = serializable;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
    }

    public isContentCardsUnreadVisualIndicatorEnabled(readAllandroid_sdk_base_release readallandroid_sdk_base_release) {
        this.serializer = 0;
        this.write = new ArrayDeque();
        this.RemoteActionCompatParcelizer = new ArrayDeque();
        this.read = new ArrayDeque();
        this.IconCompatParcelizer = readallandroid_sdk_base_release;
    }

    public isContentCardsUnreadVisualIndicatorEnabled() {
        this.serializer = 0;
        this.write = new ArrayDeque();
        this.RemoteActionCompatParcelizer = new ArrayDeque();
        this.read = new ArrayDeque();
    }

    public isContentCardsUnreadVisualIndicatorEnabled(io.sentry.android.core.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM r8lambdaci7dwlt0wnpzj9a3orpjguf1usm, byte[] bArr) {
        this.serializer = 17;
        this.IconCompatParcelizer = r8lambdaci7dwlt0wnpzj9a3orpjguf1usm;
        this.write = bArr;
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
    }

    public r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 RemoteActionCompatParcelizer() {
        if (((Integer) this.IconCompatParcelizer) != null) {
            if (((Integer) this.write) != null) {
                if (((Integer) this.RemoteActionCompatParcelizer) != null) {
                    return new r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'radius' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'longitude' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'latitude' is missing");
        return null;
    }

    public logPurchasedefault IconCompatParcelizer() {
        if (((Long) this.IconCompatParcelizer) != null) {
            if (((Long) this.write) != null) {
                if (((Integer) this.RemoteActionCompatParcelizer) != null) {
                    return new logPurchasedefault(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'steps' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'end_time' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start_time' is missing");
        return null;
    }

    public setApiKeyandroid_sdk_base_release write() {
        if (((Long) this.IconCompatParcelizer) != null) {
            if (((DetectionTrigger) this.write) != null) {
                return new setApiKeyandroid_sdk_base_release(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_close_trigger' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
        return null;
    }

    public setBadNetworkIntervalandroid_sdk_base_release MediaMetadataCompat() {
        if (((Integer) this.IconCompatParcelizer) != null) {
            if (((OS) this.RemoteActionCompatParcelizer) != null) {
                return new setBadNetworkIntervalandroid_sdk_base_release(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'os' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'true_as_of_secs' is missing");
        return null;
    }

    public unsetCustomUserAttribute read() {
        if (((Byte) this.IconCompatParcelizer) != null) {
            if (((setEmailNotificationSubscriptionTypelambda0) this.write) != null) {
                if (((setPhoneNumber) this.RemoteActionCompatParcelizer) != null) {
                    if (((setCustomUserAttributelambda2) this.read) != null) {
                        return new unsetCustomUserAttribute(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'device_status' is missing");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'app_status' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_status' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trigger' is missing");
        return null;
    }
}
