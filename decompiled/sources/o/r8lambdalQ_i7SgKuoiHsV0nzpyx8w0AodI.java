package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdalQ_i7SgKuoiHsV0nzpyx8w0AodI extends r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ {
    public final Method IconCompatParcelizer;
    public final Method MediaDescriptionCompat;

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final String read(SSLSocket sSLSocket) {
        try {
            return (String) this.IconCompatParcelizer.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            DrawableTransformation.read((Throwable) e2);
            return null;
        }
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ read() {
        return r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ.ALPN_AND_NPN;
    }

    public r8lambdalQ_i7SgKuoiHsV0nzpyx8w0AodI(java.security.Provider provider, Method method, Method method2) {
        super(provider);
        this.MediaDescriptionCompat = method;
        this.IconCompatParcelizer = method2;
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = (r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E) it.next();
            if (r8lambdax9cqozr3ps0lcwn_msrw5cdl8e != r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_0) {
                arrayList.add(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e.toString());
            }
        }
        try {
            this.MediaDescriptionCompat.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            DrawableTransformation.read((Throwable) e);
        } catch (InvocationTargetException e2) {
            DrawableTransformation.read((Throwable) e2);
        }
    }
}
