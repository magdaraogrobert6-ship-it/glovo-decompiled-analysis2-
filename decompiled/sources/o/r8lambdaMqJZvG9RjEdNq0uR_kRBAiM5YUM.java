package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM implements Closeable {
    public long IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final RegistryMissingComponentException MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public final RegistryNoSourceEncoderAvailableException PlaybackStateCompatCustomAction;
    public final byte[] RatingCompat;
    public final RegistryMissingComponentException RemoteActionCompatParcelizer;
    public boolean read;
    public final ViewUtilsExternalSyntheticLambda1 serializer;
    public boolean write;

    public final void IconCompatParcelizer() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return;
        }
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.PlaybackStateCompatCustomAction;
        long jMediaMetadataCompat = registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer().MediaMetadataCompat();
        registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer().O_();
        try {
            byte bMediaBrowserCompatMediaItem = registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem();
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer().IconCompatParcelizer(jMediaMetadataCompat, timeUnit);
            int i = bMediaBrowserCompatMediaItem & 15;
            this.MediaSessionCompatResultReceiverWrapper = i;
            boolean z2 = (bMediaBrowserCompatMediaItem & 128) != 0;
            this.MediaMetadataCompat = z2;
            boolean z3 = (bMediaBrowserCompatMediaItem & 8) != 0;
            this.write = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (bMediaBrowserCompatMediaItem & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.MediaSessionCompatToken) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.ParcelableVolumeInfo = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((bMediaBrowserCompatMediaItem & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((bMediaBrowserCompatMediaItem & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte bMediaBrowserCompatMediaItem2 = registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem();
            boolean z5 = (bMediaBrowserCompatMediaItem2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = bMediaBrowserCompatMediaItem2 & 127;
            this.IconCompatParcelizer = j;
            if (j == 126) {
                this.IconCompatParcelizer = registryNoSourceEncoderAvailableException.ComponentActivity() & 65535;
            } else if (j == 127) {
                long jParcelableVolumeInfo = registryNoSourceEncoderAvailableException.ParcelableVolumeInfo();
                this.IconCompatParcelizer = jParcelableVolumeInfo;
                if (jParcelableVolumeInfo < 0) {
                    TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
                    String hexString = Long.toHexString(jParcelableVolumeInfo);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.write && this.IconCompatParcelizer > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.RatingCompat;
                bArr2.getClass();
                registryNoSourceEncoderAvailableException.IconCompatParcelizer(bArr2);
            }
        } catch (Throwable th) {
            registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer().IconCompatParcelizer(jMediaMetadataCompat, timeUnit);
            throw th;
        }
    }

    public r8lambdaMqJZvG9RjEdNq0uR_kRBAiM5YUM(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1, boolean z, boolean z2) {
        registryNoSourceEncoderAvailableException.getClass();
        this.PlaybackStateCompatCustomAction = registryNoSourceEncoderAvailableException;
        this.serializer = viewUtilsExternalSyntheticLambda1;
        this.MediaSessionCompatToken = z;
        this.MediaBrowserCompatMediaItem = z2;
        this.RemoteActionCompatParcelizer = new RegistryMissingComponentException();
        this.MediaSessionCompatQueueItem = new RegistryMissingComponentException();
        this.RatingCompat = null;
    }

    public final void write() throws IOException {
        IconCompatParcelizer();
        if (this.write) {
            RemoteActionCompatParcelizer();
            return;
        }
        int i = this.MediaSessionCompatResultReceiverWrapper;
        if (i != 1 && i != 2) {
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.read) {
            long j = this.IconCompatParcelizer;
            RegistryMissingComponentException registryMissingComponentException = this.MediaSessionCompatQueueItem;
            if (j > 0) {
                this.PlaybackStateCompatCustomAction.IconCompatParcelizer(registryMissingComponentException, j);
            }
            if (this.MediaMetadataCompat) {
                if (this.ParcelableVolumeInfo) {
                    r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM r8lambdagif9l9wcpofehc_uqtk3aycqxm = this.MediaDescriptionCompat;
                    if (r8lambdagif9l9wcpofehc_uqtk3aycqxm == null) {
                        r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM r8lambdagif9l9wcpofehc_uqtk3aycqxm2 = new r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM(this.MediaBrowserCompatMediaItem, 1);
                        this.MediaDescriptionCompat = r8lambdagif9l9wcpofehc_uqtk3aycqxm2;
                        r8lambdagif9l9wcpofehc_uqtk3aycqxm = r8lambdagif9l9wcpofehc_uqtk3aycqxm2;
                    }
                    Inflater inflater = (Inflater) r8lambdagif9l9wcpofehc_uqtk3aycqxm.read;
                    RegistryMissingComponentException registryMissingComponentException2 = r8lambdagif9l9wcpofehc_uqtk3aycqxm.write;
                    if (registryMissingComponentException2.size != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                        return;
                    }
                    if (r8lambdagif9l9wcpofehc_uqtk3aycqxm.serializer) {
                        inflater.reset();
                    }
                    registryMissingComponentException2.IconCompatParcelizer(registryMissingComponentException);
                    registryMissingComponentException2.MediaMetadataCompat(65535);
                    long bytesRead = inflater.getBytesRead();
                    long j2 = registryMissingComponentException2.size;
                    do {
                        ((MultiModelLoaderFactory) r8lambdagif9l9wcpofehc_uqtk3aycqxm.IconCompatParcelizer).write(registryMissingComponentException, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead + j2) {
                            break;
                        }
                    } while (!inflater.finished());
                }
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = this.serializer;
                WebSocketListener webSocketListener = viewUtilsExternalSyntheticLambda1.RatingCompat;
                if (i == 1) {
                    webSocketListener.onMessage(viewUtilsExternalSyntheticLambda1, registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    return;
                }
                RequestBuilder requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
                requestBuilderRemoteActionCompatParcelizer.getClass();
                webSocketListener.onMessage(viewUtilsExternalSyntheticLambda1, requestBuilderRemoteActionCompatParcelizer);
                return;
            }
            while (!this.read) {
                IconCompatParcelizer();
                if (!this.write) {
                    break;
                } else {
                    RemoteActionCompatParcelizer();
                }
            }
            int i2 = this.MediaSessionCompatResultReceiverWrapper;
            if (i2 != 0) {
                TimeZone timeZone2 = setWebViewContent.RemoteActionCompatParcelizer;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM r8lambdagif9l9wcpofehc_uqtk3aycqxm = this.MediaDescriptionCompat;
        if (r8lambdagif9l9wcpofehc_uqtk3aycqxm != null) {
            r8lambdagif9l9wcpofehc_uqtk3aycqxm.close();
        }
    }

    public final void RemoteActionCompatParcelizer() throws ProtocolException, EOFException {
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        short sComponentActivity;
        String strM;
        long j = this.IconCompatParcelizer;
        if (j > 0) {
            this.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.RemoteActionCompatParcelizer, j);
        }
        int i = this.MediaSessionCompatResultReceiverWrapper;
        switch (i) {
            case 8:
                RegistryMissingComponentException registryMissingComponentException = this.RemoteActionCompatParcelizer;
                long j2 = registryMissingComponentException.size;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    sComponentActivity = registryMissingComponentException.ComponentActivity();
                    strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    if (sComponentActivity < 1000 || sComponentActivity >= 5000) {
                        strM = c8$$ExternalSyntheticOutline0.m(sComponentActivity, "Code must be in range [1000,5000): ");
                    } else {
                        strM = ((1004 > sComponentActivity || sComponentActivity >= 1007) && (1015 > sComponentActivity || sComponentActivity >= 3000)) ? null : d$$ExternalSyntheticOutline0.m(sComponentActivity, "Code ", " is reserved and may not be used.");
                    }
                    if (strM != null) {
                        throw new ProtocolException(strM);
                    }
                } else {
                    strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = "";
                    sComponentActivity = 1005;
                }
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = this.serializer;
                if (sComponentActivity == -1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                    return;
                }
                synchronized (viewUtilsExternalSyntheticLambda1) {
                    if (viewUtilsExternalSyntheticLambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    viewUtilsExternalSyntheticLambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sComponentActivity;
                    viewUtilsExternalSyntheticLambda1.ResultReceiver = strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                }
                viewUtilsExternalSyntheticLambda1.RatingCompat.onClosing(viewUtilsExternalSyntheticLambda1, sComponentActivity, strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                this.read = true;
                return;
            case 9:
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda2 = this.serializer;
                RegistryMissingComponentException registryMissingComponentException2 = this.RemoteActionCompatParcelizer;
                RequestBuilder requestBuilderRemoteActionCompatParcelizer = registryMissingComponentException2.RemoteActionCompatParcelizer(registryMissingComponentException2.size);
                synchronized (viewUtilsExternalSyntheticLambda2) {
                    requestBuilderRemoteActionCompatParcelizer.getClass();
                    if (!viewUtilsExternalSyntheticLambda2.MediaSessionCompatQueueItem && (!viewUtilsExternalSyntheticLambda2.read || !viewUtilsExternalSyntheticLambda2.MediaBrowserCompatMediaItem.isEmpty())) {
                        viewUtilsExternalSyntheticLambda2.PlaybackStateCompat.add(requestBuilderRemoteActionCompatParcelizer);
                        viewUtilsExternalSyntheticLambda2.serializer();
                        return;
                    }
                    return;
                }
            case 10:
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda3 = this.serializer;
                RegistryMissingComponentException registryMissingComponentException3 = this.RemoteActionCompatParcelizer;
                RequestBuilder requestBuilderRemoteActionCompatParcelizer2 = registryMissingComponentException3.RemoteActionCompatParcelizer(registryMissingComponentException3.size);
                synchronized (viewUtilsExternalSyntheticLambda3) {
                    requestBuilderRemoteActionCompatParcelizer2.getClass();
                    viewUtilsExternalSyntheticLambda3.serializer = false;
                }
                return;
            default:
                TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }
}
