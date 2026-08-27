package o;

import android.annotation.SuppressLint;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class _init_lambda00 implements Iterator<byte[]> {
    private final parseLonglambda0 MediaDescriptionCompat;
    private final getCooldownEnterSeconds MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final component4android_sdk_base_release read;
    private final getVerticalAccuracy serializer;
    private final ArrayList write;
    private boolean RemoteActionCompatParcelizer = false;
    private final ArrayList IconCompatParcelizer = new ArrayList();

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer = false;
    }

    public final ArrayList IconCompatParcelizer() {
        return new ArrayList(this.write);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.write.isEmpty();
    }

    @Override // java.util.Iterator
    @SuppressLint
    public final byte[] next() {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi;
        boolean z = this.RemoteActionCompatParcelizer;
        parseLonglambda0 parselonglambda0 = this.MediaDescriptionCompat;
        ArrayList arrayList = this.write;
        component4android_sdk_base_release component4android_sdk_base_releaseVar = this.read;
        if (!z) {
            this.RemoteActionCompatParcelizer = true;
            long jRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) arrayList.get(0)).RemoteActionCompatParcelizer();
            this.MediaSessionCompatQueueItem.getClass();
            short sWrite = (short) com.sentiance.sdk.util.x.write(System.currentTimeMillis());
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class, Long.valueOf(jRemoteActionCompatParcelizer));
            if (!optionalIconCompatParcelizer.read() && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar)) != null && (r8lambdarsln0n_71nx5fiy5yo7knsgyi = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addOnNewIntentListener) != null) {
                sWrite = r8lambdarsln0n_71nx5fiy5yo7knsgyi.write.shortValue();
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY r8lambda0mdkurosxeirnighcqsvy2a8sfyWrite = this.serializer.write(Short.valueOf(sWrite));
                if (r8lambda0mdkurosxeirnighcqsvy2a8sfyWrite == null) {
                    return new byte[0];
                }
                java.util.logging.Logger logger = getResourceIdentifier.read;
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(new isSessionStartBasedTimeoutEnabled(new isPushDeepLinkBackStackActivityEnabled(), byteArrayOutputStream));
                stopInstancelambda11 stopinstancelambda11 = r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY.IconCompatParcelizer;
                component4android_sdk_base_releaseVar.getClass();
                component4android_sdk_base_release.write(r8lambda0mdkurosxeirnighcqsvy2a8sfyWrite, stopinstancelambda11, readresourcevaluelambda2);
                readresourcevaluelambda2.flush();
                readresourcevaluelambda2.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Pedigree creation failed", new Object[0]);
                return new byte[0];
            }
        }
        RandomAccessFile randomAccessFile2 = null;
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        getCooldownEnterSeconds.read readVar = (getCooldownEnterSeconds.read) arrayList.remove(0);
        this.IconCompatParcelizer.add(readVar);
        byte[] bArr2 = new byte[readVar.write() + 4];
        try {
            randomAccessFile = new RandomAccessFile(readVar.IconCompatParcelizer(component4android_sdk_base_releaseVar), "r");
            try {
                randomAccessFile.seek(readVar.read());
                randomAccessFile.read(bArr2, 0, readVar.write() + 4);
                bArr = bArr2;
            } catch (FileNotFoundException e2) {
                e = e2;
                randomAccessFile2 = randomAccessFile;
                parselonglambda0.IconCompatParcelizer(false, e, "Event file not found", new Object[0]);
                bArr = new byte[0];
                randomAccessFile = randomAccessFile2;
            } catch (IOException e3) {
                e = e3;
                randomAccessFile2 = randomAccessFile;
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to read event data", new Object[0]);
                bArr = new byte[0];
                randomAccessFile = randomAccessFile2;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        } catch (IOException e5) {
            e = e5;
        }
        if (randomAccessFile == null) {
            return bArr;
        }
        try {
            randomAccessFile.close();
            return bArr;
        } catch (IOException unused) {
            return bArr;
        }
    }

    public final ArrayList serializer() {
        return new ArrayList(this.IconCompatParcelizer);
    }

    public _init_lambda00(List<getCooldownEnterSeconds.read> list, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0) {
        this.MediaDescriptionCompat = parselonglambda0;
        this.serializer = getverticalaccuracy;
        this.MediaMetadataCompat = getcooldownenterseconds;
        this.read = component4android_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = new ArrayList(list);
    }
}
