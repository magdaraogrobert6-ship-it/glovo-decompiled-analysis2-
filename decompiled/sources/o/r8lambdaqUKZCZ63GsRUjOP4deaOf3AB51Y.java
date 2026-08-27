package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaqUKZCZ63GsRUjOP4deaOf3AB51Y extends r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ {
    public final Class IconCompatParcelizer;
    public final Method MediaDescriptionCompat;
    public final Class MediaMetadataCompat;
    public final Method MediaSessionCompatQueueItem;
    public final Method RatingCompat;

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final String read(SSLSocket sSLSocket) {
        try {
            r8lambdar6hmn7s38s541cNhRcJS8k4uprc r8lambdar6hmn7s38s541cnhrcjs8k4uprc = (r8lambdar6hmn7s38s541cNhRcJS8k4uprc) Proxy.getInvocationHandler(this.MediaDescriptionCompat.invoke(null, sSLSocket));
            boolean z = r8lambdar6hmn7s38s541cnhrcjs8k4uprc.write;
            if (!z && r8lambdar6hmn7s38s541cnhrcjs8k4uprc.RemoteActionCompatParcelizer == null) {
                r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.serializer.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return r8lambdar6hmn7s38s541cnhrcjs8k4uprc.RemoteActionCompatParcelizer;
        } catch (IllegalAccessException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        } catch (InvocationTargetException unused2) {
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer2);
            return null;
        }
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ read() {
        return r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.ALPN_AND_NPN;
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = (r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E) list.get(i);
            if (r8lambdax9cqozr3ps0lcwn_msrw5cdl8e != r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_0) {
                arrayList.add(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e.toString());
            }
        }
        try {
            this.RatingCompat.invoke(null, sSLSocket, Proxy.newProxyInstance(r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.class.getClassLoader(), new Class[]{this.IconCompatParcelizer, this.MediaMetadataCompat}, new r8lambdar6hmn7s38s541cNhRcJS8k4uprc(arrayList)));
        } catch (IllegalAccessException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
        } catch (InvocationTargetException e2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e2);
        }
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final void write(SSLSocket sSLSocket) {
        try {
            this.MediaSessionCompatQueueItem.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
        } catch (InvocationTargetException e) {
            r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.serializer.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    public r8lambdaqUKZCZ63GsRUjOP4deaOf3AB51Y(Method method, Method method2, Method method3, Class cls, Class cls2, java.security.Provider provider) {
        super(provider);
        this.RatingCompat = method;
        this.MediaDescriptionCompat = method2;
        this.MediaSessionCompatQueueItem = method3;
        this.IconCompatParcelizer = cls;
        this.MediaMetadataCompat = cls2;
    }
}
