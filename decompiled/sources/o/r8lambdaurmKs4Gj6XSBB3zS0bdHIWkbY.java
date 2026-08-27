package o;

import android.location.Location;
import bo.app.wg$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY;
import o.r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY<TModelInput extends r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY, TModelOutput extends r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk> extends r8lambdagzL4jp4oDuRXXeRCE9jPe7Cswjw {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<TModelInput, TModelOutput> serializer;
    private boolean RatingCompat = false;
    private ArrayList MediaSessionCompatQueueItem = new ArrayList();
    private long MediaMetadataCompat = -1;
    private final r8lambdawsScXbU3AiTaDZl7q7ghvDoPto write = new r8lambdawsScXbU3AiTaDZl7q7ghvDoPto(900);
    private final ArrayList read = new ArrayList();

    public final long MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public abstract void MediaSessionCompatQueueItem();

    public final r8lambdawsScXbU3AiTaDZl7q7ghvDoPto serializer() {
        return this.write;
    }

    public final List<Location> write() {
        return this.MediaSessionCompatQueueItem;
    }

    public abstract r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA write(int i, r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk r8lambdamx_xxzgulojgjtf7uabdpxnqsk, long j, ArrayList arrayList);

    public abstract TModelInput write(r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0);

    public final void IconCompatParcelizer() {
        this.write.write();
    }

    public r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<TModelInput, TModelOutput> r8lambdazar1jdaanwnnkjpt4lyd9nkrga) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = r8lambdazar1jdaanwnnkjpt4lyd9nkrga;
    }

    public final List IconCompatParcelizer(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk r8lambdamx_xxzgulojgjtf7uabdpxnqskSerializer;
        if (!this.RatingCompat) {
            return Collections.EMPTY_LIST;
        }
        if (this.MediaMetadataCompat == -1) {
            this.MediaMetadataCompat = jArr[0];
        }
        int length = jArr.length;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            long j = jArr[i];
            r8lambdawsScXbU3AiTaDZl7q7ghvDoPto r8lambdawsscxbu3aitadzl7q7ghvdopto = this.write;
            r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA r8lambdam9t1o8mutdxzpgli6kvcujhiwaWrite = null;
            if (r8lambdawsscxbu3aitadzl7q7ghvdopto.IconCompatParcelizer() != 0 && write(r8lambdawsscxbu3aitadzl7q7ghvdopto.RemoteActionCompatParcelizer()) != write(j)) {
                int iWrite = write(r8lambdawsscxbu3aitadzl7q7ghvdopto.RemoteActionCompatParcelizer());
                MediaSessionCompatQueueItem();
                long j2 = this.MediaMetadataCompat;
                MediaSessionCompatQueueItem();
                r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY r8lambdaizrsr5syuyk5t_cq3jk1hplpfyWrite = write(new r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0((((long) iWrite) * 9000) + this.MediaMetadataCompat, (((long) (iWrite + 1)) * 9000) + j2));
                if (r8lambdaizrsr5syuyk5t_cq3jk1hplpfyWrite != null && (r8lambdamx_xxzgulojgjtf7uabdpxnqskSerializer = this.serializer.serializer(r8lambdaizrsr5syuyk5t_cq3jk1hplpfyWrite)) != null) {
                    r8lambdam9t1o8mutdxzpgli6kvcujhiwaWrite = write(write(r8lambdawsscxbu3aitadzl7q7ghvdopto.RemoteActionCompatParcelizer()), r8lambdamx_xxzgulojgjtf7uabdpxnqskSerializer, this.MediaMetadataCompat, this.read);
                }
                r8lambdawsscxbu3aitadzl7q7ghvdopto.write();
            }
            if (r8lambdam9t1o8mutdxzpgli6kvcujhiwaWrite != null) {
                arrayList.add(r8lambdam9t1o8mutdxzpgli6kvcujhiwaWrite);
            }
            this.write.write(jArr[i], fArr[i], fArr2[i], fArr3[i]);
            if (r8lambdawsscxbu3aitadzl7q7ghvdopto.IconCompatParcelizer() > 900) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Accel buffer exceeded model input size (%s, %sms), clearing buffer", Integer.valueOf(r8lambdawsscxbu3aitadzl7q7ghvdopto.IconCompatParcelizer()), Long.valueOf(r8lambdawsscxbu3aitadzl7q7ghvdopto.serializer() - r8lambdawsscxbu3aitadzl7q7ghvdopto.RemoteActionCompatParcelizer()));
                r8lambdawsscxbu3aitadzl7q7ghvdopto.write();
                this.write.write(jArr[i], fArr[i], fArr2[i], fArr3[i]);
            }
        }
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.RatingCompat) {
            this.RatingCompat = false;
            this.MediaSessionCompatQueueItem = new ArrayList();
            this.MediaMetadataCompat = -1L;
            r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<TModelInput, TModelOutput> r8lambdazar1jdaanwnnkjpt4lyd9nkrga = this.serializer;
            r8lambdazar1jdaanwnnkjpt4lyd9nkrga.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaSessionCompatResultReceiverWrapper();
            this.write.read();
            this.read.clear();
        }
    }

    public final boolean read() {
        populatePushStoryPage populatepushstorypageParcelableVolumeInfo;
        if (this.RatingCompat) {
            return true;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Starting CrashModelExecutor", new Object[0]);
        ArrayList arrayList = this.read;
        arrayList.clear();
        r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<TModelInput, TModelOutput> r8lambdazar1jdaanwnnkjpt4lyd9nkrga = this.serializer;
        if (!r8lambdazar1jdaanwnnkjpt4lyd9nkrga.RatingCompat() || (populatepushstorypageParcelableVolumeInfo = r8lambdazar1jdaanwnnkjpt4lyd9nkrga.ParcelableVolumeInfo()) == null) {
            return false;
        }
        arrayList.add(populatepushstorypageParcelableVolumeInfo);
        this.RatingCompat = true;
        return true;
    }

    public final void read(long j) {
        if (this.MediaMetadataCompat == -1) {
            this.MediaMetadataCompat = j;
        }
    }

    public final void serializer(Location location) {
        if (this.RatingCompat) {
            this.MediaSessionCompatQueueItem.add(location);
            if (this.MediaSessionCompatQueueItem.size() > 1) {
                Collections.sort(this.MediaSessionCompatQueueItem, new wg$$ExternalSyntheticLambda0(19));
            }
            long jRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            if (jRemoteActionCompatParcelizer == -1) {
                this.IconCompatParcelizer.getClass();
                jRemoteActionCompatParcelizer = System.currentTimeMillis() - 60000;
            }
            r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.IconCompatParcelizer(jRemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem);
        }
    }

    public final int write(long j) {
        long j2 = this.MediaMetadataCompat;
        MediaSessionCompatQueueItem();
        return (int) ((j - j2) / 9000);
    }
}
