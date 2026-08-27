package o;

import android.net.ssl.SSLSockets;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class getDoesPushStoryDismissOnClick extends getFallbackFirebaseMessagingServiceClasspath {
    @Override // o.getFallbackFirebaseMessagingServiceClasspath, o.getLoggerInitialLogLevel
    public final String IconCompatParcelizer(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.getFallbackFirebaseMessagingServiceClasspath, o.getLoggerInitialLogLevel
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) getLoggerInitialLogLevel.serializer(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public getDoesPushStoryDismissOnClick(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy, r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2, r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy3, r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy4) {
        super(r8lambdadeozq815xuuwmllyyvm_qv79qy, r8lambdadeozq815xuuwmllyyvm_qv79qy2, r8lambdadeozq815xuuwmllyyvm_qv79qy3, r8lambdadeozq815xuuwmllyyvm_qv79qy4);
    }
}
