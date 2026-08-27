package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeDeeplinkHandlerWhenMappings implements isValidPushStoryClickInputlambda0 {
    public final AndroidUiFrameClock IconCompatParcelizer;
    public long MediaSessionCompatQueueItem;
    public final getCacheFileSuffix MediaSessionCompatToken;
    public final r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 ParcelableVolumeInfo;
    public int RatingCompat;
    public r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs RemoteActionCompatParcelizer;
    public boolean write;
    public int MediaMetadataCompat = -1;
    public r8lambdakcTilwmporjFCAWe8ASdQv1Ks serializer = r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer;
    public final RegistryNoModelLoaderAvailableException MediaDescriptionCompat = new RegistryNoModelLoaderAvailableException(2, this);
    public final ByteBuffer MediaBrowserCompatMediaItem = ByteBuffer.allocate(5);
    public int read = -1;

    @Override // o.isValidPushStoryClickInputlambda0
    public final boolean MediaBrowserCompatMediaItem() {
        return this.write;
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public final isValidPushStoryClickInputlambda0 write(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        this.serializer = r8lambdakctilwmporjfcawe8asdqv1ks;
        return this;
    }

    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs = this.RemoteActionCompatParcelizer;
            if (r8lambdaoaqvy__5d9hmn5g6gasyvakdzs != null && r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.read == 0) {
                this.RemoteActionCompatParcelizer = null;
                this.MediaSessionCompatToken.read(r8lambdaoaqvy__5d9hmn5g6gasyvakdzs, false, false, this.RatingCompat);
                this.RatingCompat = 0;
            }
            if (this.RemoteActionCompatParcelizer == null) {
                this.IconCompatParcelizer.getClass();
                this.RemoteActionCompatParcelizer = AndroidUiFrameClock.RemoteActionCompatParcelizer(i2);
            }
            int iMin = Math.min(i2, this.RemoteActionCompatParcelizer.read);
            this.RemoteActionCompatParcelizer.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    public final int serializer(setDateOfBirthlambda3 setdateofbirthlambda3) throws IOException {
        setBrazeDeeplinkHandlerlambda0 setbrazedeeplinkhandlerlambda0 = new setBrazeDeeplinkHandlerlambda0(this);
        OutputStream gZIPOutputStream = this.serializer.RemoteActionCompatParcelizer != 0 ? setbrazedeeplinkhandlerlambda0 : new GZIPOutputStream(setbrazedeeplinkhandlerlambda0);
        try {
            int i = read(setdateofbirthlambda3, gZIPOutputStream);
            gZIPOutputStream.close();
            int i2 = this.MediaMetadataCompat;
            if (i2 < 0 || i <= i2) {
                IconCompatParcelizer(setbrazedeeplinkhandlerlambda0, true);
                return i;
            }
            Status status = Status.MediaSessionCompatQueueItem;
            java.util.Locale locale = java.util.Locale.US;
            throw status.IconCompatParcelizer("message too large " + i + " > " + i2).RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public final void write(setDateOfBirthlambda3 setdateofbirthlambda3) {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Framer already closed");
            return;
        }
        this.RatingCompat++;
        int i = this.read + 1;
        this.read = i;
        this.MediaSessionCompatQueueItem = 0L;
        r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0 = this.ParcelableVolumeInfo;
        JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr = r8lambdamwysina6epuugeuvjtl8aepfjn0.write;
        JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr2 = r8lambdamwysina6epuugeuvjtl8aepfjn0.write;
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : jsonUtilsExternalSyntheticLambda1Arr) {
            jsonUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(i);
        }
        boolean z = this.serializer != r8lambdakcTilwmporjFCAWe8ASdQv1Ks.IconCompatParcelizer;
        try {
            int iAvailable = setdateofbirthlambda3.available();
            int iIconCompatParcelizer = (iAvailable == 0 || !z) ? IconCompatParcelizer(setdateofbirthlambda3, iAvailable) : serializer(setdateofbirthlambda3);
            if (iAvailable != -1 && iIconCompatParcelizer != iAvailable) {
                throw Status.write.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer, "Message length inaccurate ", iAvailable, " != ")).RemoteActionCompatParcelizer();
            }
            long j = iIconCompatParcelizer;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda2 : jsonUtilsExternalSyntheticLambda1Arr2) {
                jsonUtilsExternalSyntheticLambda2.write(j);
            }
            long j2 = this.MediaSessionCompatQueueItem;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda3 : jsonUtilsExternalSyntheticLambda1Arr2) {
                jsonUtilsExternalSyntheticLambda3.IconCompatParcelizer(j2);
            }
            int i2 = this.read;
            long j3 = this.MediaSessionCompatQueueItem;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda4 : r8lambdamwysina6epuugeuvjtl8aepfjn0.write) {
                jsonUtilsExternalSyntheticLambda4.serializer(j3, j, i2);
            }
        } catch (StatusRuntimeException e) {
            throw e;
        } catch (IOException e2) {
            throw Status.write.IconCompatParcelizer("Failed to frame message").RemoteActionCompatParcelizer(e2).RemoteActionCompatParcelizer();
        } catch (RuntimeException e3) {
            throw Status.write.IconCompatParcelizer("Failed to frame message").RemoteActionCompatParcelizer(e3).RemoteActionCompatParcelizer();
        }
    }

    public BrazeDeeplinkHandlerWhenMappings(getCacheFileSuffix getcachefilesuffix, AndroidUiFrameClock androidUiFrameClock, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0) {
        this.MediaSessionCompatToken = getcachefilesuffix;
        this.IconCompatParcelizer = androidUiFrameClock;
        this.ParcelableVolumeInfo = r8lambdamwysina6epuugeuvjtl8aepfjn0;
    }

    public final void IconCompatParcelizer(setBrazeDeeplinkHandlerlambda0 setbrazedeeplinkhandlerlambda0, boolean z) {
        int iIconCompatParcelizer = setBrazeDeeplinkHandlerlambda0.IconCompatParcelizer(setbrazedeeplinkhandlerlambda0);
        int i = this.MediaMetadataCompat;
        if (i >= 0 && iIconCompatParcelizer > i) {
            Status status = Status.MediaSessionCompatQueueItem;
            java.util.Locale locale = java.util.Locale.US;
            throw status.IconCompatParcelizer("message too large " + iIconCompatParcelizer + " > " + i).RemoteActionCompatParcelizer();
        }
        ByteBuffer byteBuffer = this.MediaBrowserCompatMediaItem;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iIconCompatParcelizer);
        this.IconCompatParcelizer.getClass();
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer = AndroidUiFrameClock.RemoteActionCompatParcelizer(5);
        r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer.write(byteBuffer.array(), 0, byteBuffer.position());
        if (iIconCompatParcelizer == 0) {
            this.RemoteActionCompatParcelizer = r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer;
            return;
        }
        int i2 = this.RatingCompat;
        getCacheFileSuffix getcachefilesuffix = this.MediaSessionCompatToken;
        getcachefilesuffix.read(r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer, false, false, i2 - 1);
        this.RatingCompat = 1;
        ArrayList arrayList = setbrazedeeplinkhandlerlambda0.serializer;
        for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
            getcachefilesuffix.read((r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs) arrayList.get(i3), false, false, 0);
        }
        this.RemoteActionCompatParcelizer = (r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs) af$$ExternalSyntheticOutline0.m(1, arrayList);
        this.MediaSessionCompatQueueItem = iIconCompatParcelizer;
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public final void RatingCompat() {
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs = this.RemoteActionCompatParcelizer;
        if (r8lambdaoaqvy__5d9hmn5g6gasyvakdzs == null || r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.write <= 0) {
            return;
        }
        this.RemoteActionCompatParcelizer = null;
        this.MediaSessionCompatToken.read(r8lambdaoaqvy__5d9hmn5g6gasyvakdzs, false, true, this.RatingCompat);
        this.RatingCompat = 0;
    }

    public static int read(setDateOfBirthlambda3 setdateofbirthlambda3, OutputStream outputStream) throws IOException {
        GeneratedMessageLite generatedMessageLite = setdateofbirthlambda3.RemoteActionCompatParcelizer;
        if (generatedMessageLite != null) {
            int serializedSize = generatedMessageLite.getSerializedSize();
            setdateofbirthlambda3.RemoteActionCompatParcelizer.writeTo(outputStream);
            setdateofbirthlambda3.RemoteActionCompatParcelizer = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = setdateofbirthlambda3.write;
        if (byteArrayInputStream == null) {
            return 0;
        }
        getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress = setPushNotificationSubscriptionTypelambda1.RemoteActionCompatParcelizer;
        TextStreamsKt.serializer(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                setdateofbirthlambda3.write = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public final int IconCompatParcelizer(setDateOfBirthlambda3 setdateofbirthlambda3, int i) throws IOException {
        if (i != -1) {
            this.MediaSessionCompatQueueItem = i;
            int i2 = this.MediaMetadataCompat;
            if (i2 >= 0 && i > i2) {
                Status status = Status.MediaSessionCompatQueueItem;
                java.util.Locale locale = java.util.Locale.US;
                throw status.IconCompatParcelizer("message too large " + i + " > " + i2).RemoteActionCompatParcelizer();
            }
            ByteBuffer byteBuffer = this.MediaBrowserCompatMediaItem;
            byteBuffer.clear();
            byteBuffer.put((byte) 0).putInt(i);
            if (this.RemoteActionCompatParcelizer == null) {
                int iPosition = byteBuffer.position();
                this.IconCompatParcelizer.getClass();
                this.RemoteActionCompatParcelizer = AndroidUiFrameClock.RemoteActionCompatParcelizer(iPosition + i);
            }
            RemoteActionCompatParcelizer(byteBuffer.array(), 0, byteBuffer.position());
            return read(setdateofbirthlambda3, this.MediaDescriptionCompat);
        }
        setBrazeDeeplinkHandlerlambda0 setbrazedeeplinkhandlerlambda0 = new setBrazeDeeplinkHandlerlambda0(this);
        int i3 = read(setdateofbirthlambda3, setbrazedeeplinkhandlerlambda0);
        IconCompatParcelizer(setbrazedeeplinkhandlerlambda0, false);
        return i3;
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public final void serializer() {
        if (this.write) {
            return;
        }
        this.write = true;
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs = this.RemoteActionCompatParcelizer;
        if (r8lambdaoaqvy__5d9hmn5g6gasyvakdzs != null && r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.write == 0) {
            this.RemoteActionCompatParcelizer = null;
        }
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = null;
        this.MediaSessionCompatToken.read(r8lambdaoaqvy__5d9hmn5g6gasyvakdzs2, true, true, this.RatingCompat);
        this.RatingCompat = 0;
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public final void read(int i) {
        TextStreamsKt.RemoteActionCompatParcelizer("max size already set", this.MediaMetadataCompat == -1);
        this.MediaMetadataCompat = i;
    }
}
