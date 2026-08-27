package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class getSdkMetadata extends getLoggerInitialLogLevel {
    public final Method IconCompatParcelizer;
    public final Method write;

    public getSdkMetadata(Method method, Method method2) {
        this.write = method;
        this.IconCompatParcelizer = method2;
    }

    @Override // o.getLoggerInitialLogLevel
    public final String IconCompatParcelizer(SSLSocket sSLSocket) {
        try {
            String str = (String) this.IconCompatParcelizer.invoke(sSLSocket, null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to get selected protocols", e);
        }
    }

    @Override // o.getLoggerInitialLogLevel
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListSerializer = getLoggerInitialLogLevel.serializer(list);
            this.write.invoke(sSLParameters, arrayListSerializer.toArray(new String[arrayListSerializer.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to set ssl parameters", e);
        }
    }
}
