package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import kotlinx.coroutines.DeferredCoroutine;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureInfoJsonAdapter {
    public final /* synthetic */ int IconCompatParcelizer;

    public final short IconCompatParcelizer(int i) {
        int i2;
        if (this.IconCompatParcelizer != 0) {
            int i3 = i >>> 13;
            int i4 = ((i3 << 4) ^ (i3 << 3)) ^ (i3 << 1);
            int i5 = i4 >>> 13;
            i2 = ((((i & 8191) ^ i3) ^ i5) ^ (i4 & 8191)) ^ (((i5 << 4) ^ (i5 << 3)) ^ (i5 << 1));
        } else {
            i2 = (i >>> 21) ^ ((((i & 4095) ^ (i >>> 12)) ^ ((2093056 & i) >>> 9)) ^ ((14680064 & i) >>> 18));
        }
        return (short) i2;
    }

    public /* synthetic */ FeatureInfoJsonAdapter(int i) {
        this.IconCompatParcelizer = i;
    }

    public static onDrawBehind RemoteActionCompatParcelizer(DeferredCoroutine deferredCoroutine) {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            deferredCoroutine.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new MapboxNavigation$notification$1$1(ondrawwithcontent, 2, deferredCoroutine));
            ondrawwithcontent.RemoteActionCompatParcelizer = "Deferred.asListenableFuture";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        return ondrawbehind;
    }

    public short serializer(short s) {
        return IconCompatParcelizer(accessgetDifferencecp.read(s));
    }

    public final short read(short s, short s2) {
        if (this.IconCompatParcelizer != 0) {
            int i = (s2 & 1) * s;
            for (int i2 = 1; i2 < 13; i2++) {
                i ^= ((1 << i2) & s2) * s;
            }
            return IconCompatParcelizer(i);
        }
        int i3 = (s2 & 1) * s;
        for (int i4 = 1; i4 < 12; i4++) {
            i3 ^= ((1 << i4) & s2) * s;
        }
        return IconCompatParcelizer(i3);
    }

    public short write(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j << 7) ^ j;
        long j4 = (((j2 << 4) * (j3 & 262160)) ^ ((((((16385 & j3) * j2) ^ ((j2 << 6) * (j & 64))) ^ ((j2 << 1) * (32770 & j3))) ^ ((j2 << 2) * (65540 & j3))) ^ ((j2 << 3) * (131080 & j3)))) ^ ((j2 << 5) * (524320 & j3));
        long j5 = 137371844608L & j4;
        return IconCompatParcelizer(((int) (j4 ^ (((j5 >>> 24) ^ ((j5 >>> 18) ^ (j5 >>> 20))) ^ (j5 >>> 26)))) & 67108863);
    }

    public short serializer(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j << 21) ^ j;
        long j4 = (((j2 << 12) * (j3 & 4294967312L)) ^ ((((((268435457 & j3) * j2) ^ ((j2 << 18) * (j & 64))) ^ ((j2 << 3) * (536870914 & j3))) ^ ((j2 << 6) * (1073741828 & j3))) ^ ((j2 << 9) * (2147483656L & j3)))) ^ ((j2 << 15) * (8589934624L & j3));
        long j5 = 2305834213120671744L & j4;
        long j6 = j4 ^ (((j5 >>> 24) ^ ((j5 >>> 18) ^ (j5 >>> 20))) ^ (j5 >>> 26));
        long j7 = 8796025913344L & j6;
        return IconCompatParcelizer(((int) (j6 ^ (((j7 >>> 24) ^ ((j7 >>> 20) ^ (j7 >>> 18))) ^ (j7 >>> 26)))) & 67108863);
    }
}
