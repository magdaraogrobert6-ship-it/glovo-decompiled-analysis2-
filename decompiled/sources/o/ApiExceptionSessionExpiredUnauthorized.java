package o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class ApiExceptionSessionExpiredUnauthorized extends onPreDraw {
    public final Socket RemoteActionCompatParcelizer;

    @Override // o.onPreDraw
    public final void read() {
        Socket socket = this.RemoteActionCompatParcelizer;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!TooManyRequestsException.RemoteActionCompatParcelizer(e)) {
                throw e;
            }
            TooManyRequestsException.RemoteActionCompatParcelizer.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            TooManyRequestsException.RemoteActionCompatParcelizer.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public ApiExceptionSessionExpiredUnauthorized(Socket socket) {
        this.RemoteActionCompatParcelizer = socket;
    }

    public final IOException IconCompatParcelizer(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
