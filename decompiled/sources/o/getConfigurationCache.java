package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class getConfigurationCache extends isInAppMessageTestPushEagerDisplayEnabled {
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;

    public /* synthetic */ getConfigurationCache(int i, Object obj) {
        this.MediaMetadataCompat = i;
        this.MediaDescriptionCompat = obj;
    }

    @Override // o.isInAppMessageTestPushEagerDisplayEnabled
    public final void MediaSessionCompatQueueItem() {
        int i = this.MediaMetadataCompat;
        if (i != 0) {
            if (i == 1) {
                ((setSessionTimeoutandroid_sdk_base_release) this.MediaDescriptionCompat).serializer();
                return;
            }
            getDeviceObjectAllowlist getdeviceobjectallowlist = (getDeviceObjectAllowlist) this.MediaDescriptionCompat;
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (getdeviceobjectallowlist.RemoteActionCompatParcelizer(errorCode)) {
                getdeviceobjectallowlist.IconCompatParcelizer.serializer(getdeviceobjectallowlist.read, errorCode);
            }
            getGenericEnumSetFromStringSet getgenericenumsetfromstringset = ((getDeviceObjectAllowlist) this.MediaDescriptionCompat).IconCompatParcelizer;
            synchronized (getgenericenumsetfromstringset) {
                long j = getgenericenumsetfromstringset.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                long j2 = getgenericenumsetfromstringset.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (j < j2) {
                    return;
                }
                getgenericenumsetfromstringset.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = j2 + 1;
                getgenericenumsetfromstringset.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = System.nanoTime() + 1000000000;
                try {
                    getgenericenumsetfromstringset.PlaybackStateCompat.execute(new getServerTargetannotations(getgenericenumsetfromstringset, new Object[]{getgenericenumsetfromstringset.ParcelableVolumeInfo}));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
        }
        Socket socket = (Socket) this.MediaDescriptionCompat;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                throw e;
            }
            getResourceIdentifier.read.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            getResourceIdentifier.read.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // o.isInAppMessageTestPushEagerDisplayEnabled
    public IOException write(IOException iOException) {
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
        if (i != 2) {
            return super.write(iOException);
        }
        SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException2.initCause(iOException);
        }
        return socketTimeoutException2;
    }

    public void MediaBrowserCompatMediaItem() throws IOException {
        if (RatingCompat()) {
            throw write(null);
        }
    }
}
