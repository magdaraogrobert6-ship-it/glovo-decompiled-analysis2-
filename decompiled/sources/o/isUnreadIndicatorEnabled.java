package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes4.dex */
public final class isUnreadIndicatorEnabled implements Closeable {
    public final long IconCompatParcelizer;
    public final RegistryNoImageHeaderParserException MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final RegistryMissingComponentException MediaMetadataCompat;
    public final Random MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final boolean RatingCompat;
    public r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM RemoteActionCompatParcelizer;
    public final byte[] read;
    public final Registry serializer;
    public final RegistryMissingComponentException write;

    public isUnreadIndicatorEnabled(RegistryNoImageHeaderParserException registryNoImageHeaderParserException, Random random, boolean z, boolean z2, long j) {
        registryNoImageHeaderParserException.getClass();
        this.MediaBrowserCompatMediaItem = registryNoImageHeaderParserException;
        this.MediaSessionCompatQueueItem = random;
        this.MediaDescriptionCompat = z;
        this.RatingCompat = z2;
        this.IconCompatParcelizer = j;
        this.write = new RegistryMissingComponentException();
        this.MediaMetadataCompat = registryNoImageHeaderParserException.MediaSessionCompatQueueItem();
        this.read = new byte[4];
        this.serializer = new Registry();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM r8lambdagif9l9wcpofehc_uqtk3aycqxm = this.RemoteActionCompatParcelizer;
        if (r8lambdagif9l9wcpofehc_uqtk3aycqxm != null) {
            r8lambdagif9l9wcpofehc_uqtk3aycqxm.close();
        }
    }

    public final void serializer(int i, RequestBuilder requestBuilder) throws IOException {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
            return;
        }
        int iSerializer = requestBuilder.serializer();
        if (iSerializer > 125) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Payload size must be less than or equal to 125");
            return;
        }
        RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
        registryMissingComponentException.read(i | androidx.compose.ui.graphics.Fields.SpotShadowColor);
        registryMissingComponentException.read(iSerializer | androidx.compose.ui.graphics.Fields.SpotShadowColor);
        byte[] bArr = this.read;
        bArr.getClass();
        this.MediaSessionCompatQueueItem.nextBytes(bArr);
        registryMissingComponentException.write(bArr, 0, bArr.length);
        if (iSerializer > 0) {
            long j = registryMissingComponentException.size;
            registryMissingComponentException.serializer(requestBuilder);
            Registry registry = this.serializer;
            registry.getClass();
            registryMissingComponentException.write(registry);
            registry.serializer(j);
            BaseCardView.write(registry, bArr);
            registry.close();
        }
        this.MediaBrowserCompatMediaItem.flush();
    }

    public final void write(int i, RequestBuilder requestBuilder) throws IOException {
        if (!this.MediaSessionCompatResultReceiverWrapper) {
            RegistryMissingComponentException registryMissingComponentException = this.write;
            registryMissingComponentException.serializer(requestBuilder);
            int i2 = i | androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (this.MediaDescriptionCompat && requestBuilder.data.length >= this.IconCompatParcelizer) {
                r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM r8lambdagif9l9wcpofehc_uqtk3aycqxm = this.RemoteActionCompatParcelizer;
                if (r8lambdagif9l9wcpofehc_uqtk3aycqxm == null) {
                    r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM r8lambdagif9l9wcpofehc_uqtk3aycqxm2 = new r8lambdaGIf9L9WcpOfehC_Uqtk3aycQXM(this.RatingCompat, 0);
                    this.RemoteActionCompatParcelizer = r8lambdagif9l9wcpofehc_uqtk3aycqxm2;
                    r8lambdagif9l9wcpofehc_uqtk3aycqxm = r8lambdagif9l9wcpofehc_uqtk3aycqxm2;
                }
                RequestManager requestManager = (RequestManager) r8lambdagif9l9wcpofehc_uqtk3aycqxm.IconCompatParcelizer;
                RegistryMissingComponentException registryMissingComponentException2 = r8lambdagif9l9wcpofehc_uqtk3aycqxm.write;
                if (registryMissingComponentException2.size == 0) {
                    if (r8lambdagif9l9wcpofehc_uqtk3aycqxm.serializer) {
                        ((Deflater) r8lambdagif9l9wcpofehc_uqtk3aycqxm.read).reset();
                    }
                    requestManager.write(registryMissingComponentException, registryMissingComponentException.size);
                    requestManager.flush();
                    RequestBuilder requestBuilder2 = WebViewUtilsKt.IconCompatParcelizer;
                    if (registryMissingComponentException2.read(requestBuilder2.serializer(), registryMissingComponentException2.size - ((long) requestBuilder2.data.length), requestBuilder2)) {
                        long j = registryMissingComponentException2.size;
                        Registry registryWrite = registryMissingComponentException2.write(setOptionalTextView.RemoteActionCompatParcelizer);
                        try {
                            registryWrite.IconCompatParcelizer(j - 4);
                            registryWrite.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{registryWrite, th}, sourceInformationContextOfdefault.read());
                                throw th2;
                            }
                        }
                    } else {
                        registryMissingComponentException2.read(0);
                    }
                    registryMissingComponentException.write(registryMissingComponentException2, registryMissingComponentException2.size);
                    i2 = i | 192;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                    return;
                }
            }
            long j2 = registryMissingComponentException.size;
            RegistryMissingComponentException registryMissingComponentException3 = this.MediaMetadataCompat;
            registryMissingComponentException3.read(i2);
            if (j2 <= 125) {
                registryMissingComponentException3.read(((int) j2) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            } else if (j2 <= 65535) {
                registryMissingComponentException3.read(Constant.ERROR_ROAD_AREA_INVALID);
                registryMissingComponentException3.MediaBrowserCompatMediaItem((int) j2);
            } else {
                registryMissingComponentException3.read(255);
                SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = registryMissingComponentException3.RemoteActionCompatParcelizer(8);
                byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
                int i3 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
                bArr[i3] = (byte) ((j2 >>> 56) & 255);
                bArr[i3 + 1] = (byte) ((j2 >>> 48) & 255);
                bArr[i3 + 2] = (byte) ((j2 >>> 40) & 255);
                bArr[i3 + 3] = (byte) ((j2 >>> 32) & 255);
                bArr[i3 + 4] = (byte) ((j2 >>> 24) & 255);
                bArr[i3 + 5] = (byte) ((j2 >>> 16) & 255);
                bArr[i3 + 6] = (byte) ((j2 >>> 8) & 255);
                bArr[i3 + 7] = (byte) (j2 & 255);
                sVGParseExceptionRemoteActionCompatParcelizer.limit = i3 + 8;
                registryMissingComponentException3.size += 8;
            }
            byte[] bArr2 = this.read;
            bArr2.getClass();
            this.MediaSessionCompatQueueItem.nextBytes(bArr2);
            registryMissingComponentException3.write(bArr2, 0, bArr2.length);
            if (j2 > 0) {
                Registry registry = this.serializer;
                registry.getClass();
                registryMissingComponentException.write(registry);
                registry.serializer(0L);
                BaseCardView.write(registry, bArr2);
                registry.close();
            }
            registryMissingComponentException3.write(registryMissingComponentException, j2);
            this.MediaBrowserCompatMediaItem.read();
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
    }
}
