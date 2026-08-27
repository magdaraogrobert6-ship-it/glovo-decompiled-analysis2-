package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk {
    public final r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 IconCompatParcelizer;
    public final /* synthetic */ r8lambdaU31FnmCtqQics3i75Jr9dkZcEk MediaDescriptionCompat;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public final int serializer;
    public final RegistryMissingComponentException write = new RegistryMissingComponentException();
    public boolean read = false;

    public final void RemoteActionCompatParcelizer(int i, RegistryMissingComponentException registryMissingComponentException, boolean z) {
        boolean z2;
        do {
            int iMin = Math.min(i, ((parseProperties) this.MediaDescriptionCompat.read).read.IconCompatParcelizer.write);
            int i2 = -iMin;
            ((r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) this.MediaDescriptionCompat.write).read(i2);
            read(i2);
            try {
                boolean z3 = true;
                ((parseProperties) this.MediaDescriptionCompat.read).RemoteActionCompatParcelizer(registryMissingComponentException.size == ((long) iMin) && z, this.serializer, registryMissingComponentException, iMin);
                r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = this.IconCompatParcelizer;
                synchronized (r8lambdakeppeuftpwazbc7drhg_qad0y4.PlaybackStateCompat) {
                    TextStreamsKt.RemoteActionCompatParcelizer("onStreamAllocated was not called, but it seems the stream is active", r8lambdakeppeuftpwazbc7drhg_qad0y4.write);
                    int i3 = r8lambdakeppeuftpwazbc7drhg_qad0y4.ParcelableVolumeInfo;
                    boolean z4 = i3 < 32768;
                    int i4 = i3 - iMin;
                    r8lambdakeppeuftpwazbc7drhg_qad0y4.ParcelableVolumeInfo = i4;
                    boolean z5 = i4 < 32768;
                    if (z4 || !z5) {
                        z3 = false;
                    }
                }
                if (z3) {
                    synchronized (r8lambdakeppeuftpwazbc7drhg_qad0y4.PlaybackStateCompat) {
                        z2 = r8lambdakeppeuftpwazbc7drhg_qad0y4.read();
                    }
                    if (z2) {
                        r8lambdakeppeuftpwazbc7drhg_qad0y4.MediaDescriptionCompat.read();
                    }
                }
                i -= iMin;
            } catch (IOException e) {
                DrawableTransformation.read((Throwable) e);
                return;
            }
        } while (i > 0);
    }

    public final void serializer(int i, r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r8lambdawhxkhouvhbvdcjbbonyn9egki6m) {
        int i2 = this.RatingCompat;
        r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = this.MediaDescriptionCompat;
        int iMin = Math.min(i, Math.min(i2, ((r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) r8lambdau31fnmctqqics3i75jr9dkzcek.write).RatingCompat));
        int i3 = 0;
        while (true) {
            RegistryMissingComponentException registryMissingComponentException = this.write;
            long j = registryMissingComponentException.size;
            if (j <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j) {
                int i4 = (int) j;
                i3 += i4;
                RemoteActionCompatParcelizer(i4, registryMissingComponentException, this.read);
            } else {
                i3 += iMin;
                RemoteActionCompatParcelizer(iMin, registryMissingComponentException, false);
            }
            r8lambdawhxkhouvhbvdcjbbonyn9egki6m.IconCompatParcelizer++;
            iMin = Math.min(i - i3, Math.min(this.RatingCompat, ((r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk) r8lambdau31fnmctqqics3i75jr9dkzcek.write).RatingCompat));
        }
    }

    public r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk(r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek, int i, int i2, r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4) {
        this.MediaDescriptionCompat = r8lambdau31fnmctqqics3i75jr9dkzcek;
        this.serializer = i;
        this.RatingCompat = i2;
        this.IconCompatParcelizer = r8lambdakeppeuftpwazbc7drhg_qad0y4;
    }

    public final int read(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.RatingCompat) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(this.serializer, "Window size overflow for stream: ");
            return 0;
        }
        int i2 = this.RatingCompat + i;
        this.RatingCompat = i2;
        return i2;
    }
}
