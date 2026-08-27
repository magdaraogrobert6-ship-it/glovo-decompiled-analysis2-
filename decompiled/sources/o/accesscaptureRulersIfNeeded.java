package o;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import coil3.Extras$Key;
import com.google.android.gms.internal.measurement.zzdi;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class accesscaptureRulersIfNeeded implements MultiContentMeasurePolicyKt {
    public final /* synthetic */ getSoftRightEK5gGoQ serializer;

    @Override // o.MultiContentMeasurePolicyKt
    public final String IconCompatParcelizer() {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSetTopBoxInputEK5gGoQ(getsoftrightek5ggoq, getprogramblueek5ggoq, 3));
        return getprogramblueek5ggoq.serializer(500L);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void IconCompatParcelizer(String str, String str2, Bundle bundle) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSoftLeftEK5gGoQ(getsoftrightek5ggoq, null, str, str2, bundle, true, true));
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final int RemoteActionCompatParcelizer(String str) {
        return this.serializer.read(str);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final String RemoteActionCompatParcelizer() {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSetTopBoxInputEK5gGoQ(getsoftrightek5ggoq, getprogramblueek5ggoq, 4));
        return getprogramblueek5ggoq.serializer(500L);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final List RemoteActionCompatParcelizer(String str, String str2) {
        return this.serializer.serializer(str, str2);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void RemoteActionCompatParcelizer(OnSizeChangedNode onSizeChangedNode) {
        this.serializer.read(onSizeChangedNode);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final long read() {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSetTopBoxInputEK5gGoQ(getsoftrightek5ggoq, getprogramblueek5ggoq, 2));
        Long l = getprogramblueek5ggoq.read();
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = getsoftrightek5ggoq.IconCompatParcelizer + 1;
        getsoftrightek5ggoq.IconCompatParcelizer = i;
        return jNextLong + ((long) i);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final Map read(String str, String str2, boolean z) {
        return this.serializer.write(str, str2, z);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final String serializer() {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSetTopBoxInputEK5gGoQ(getsoftrightek5ggoq, getprogramblueek5ggoq, 1));
        return getprogramblueek5ggoq.serializer(50L);
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void serializer(Bundle bundle) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new zzdi(getsoftrightek5ggoq, bundle));
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void serializer(String str, String str2, Bundle bundle) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getRoEK5gGoQ(getsoftrightek5ggoq, str, str2, bundle));
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final String write() {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSetTopBoxInputEK5gGoQ(getsoftrightek5ggoq, getprogramblueek5ggoq, 0));
        return getprogramblueek5ggoq.serializer(500L);
    }

    public accesscaptureRulersIfNeeded(getSoftRightEK5gGoQ getsoftrightek5ggoq) {
        this.serializer = getsoftrightek5ggoq;
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void read(String str) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSEK5gGoQ(getsoftrightek5ggoq, str, 1));
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void write(String str) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSEK5gGoQ(getsoftrightek5ggoq, str, 0));
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void RemoteActionCompatParcelizer(Extras$Key extras$Key) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getSlashEK5gGoQ getslashek5ggoq = new getSlashEK5gGoQ(0, extras$Key);
        if (getsoftrightek5ggoq.MediaDescriptionCompat != null) {
            try {
                getsoftrightek5ggoq.MediaDescriptionCompat.setEventInterceptor(getslashek5ggoq);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                SentryLogcatAdapter.IconCompatParcelizer("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        getsoftrightek5ggoq.write(new zzdi(getsoftrightek5ggoq, getslashek5ggoq, 3));
    }

    @Override // o.MultiContentMeasurePolicyKt
    public final void write(long j, Bundle bundle, String str, String str2) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.serializer;
        getsoftrightek5ggoq.write(new getSoftLeftEK5gGoQ(getsoftrightek5ggoq, Long.valueOf(j), str, str2, bundle, true, false));
    }
}
