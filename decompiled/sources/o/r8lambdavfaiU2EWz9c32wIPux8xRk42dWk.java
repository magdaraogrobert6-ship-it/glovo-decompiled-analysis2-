package o;

import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdavfaiU2EWz9c32wIPux8xRk42dWk implements Runnable {
    final /* synthetic */ r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI read;
    final /* synthetic */ onResumelambda0 serializer;

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii = this.read;
        if (r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.write() > 0) {
            onResumelambda0 onresumelambda0 = this.serializer;
            int i = 0;
            if (onresumelambda0.PlaybackStateCompat == null) {
                onresumelambda0.PlaybackStateCompat = Long.valueOf(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().read(0));
            }
            HashMap map = onResumelambda0.read(onresumelambda0, r8lambdadmnir0ikfqv2uyaz5k1ofou62ii);
            Long l = onResumelambda0.read(onresumelambda0, map, r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().read(0));
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = onresumelambda0.IconCompatParcelizer;
            getVerticalAccuracy getverticalaccuracy = onresumelambda0.MediaMetadataCompat;
            byte eventTypeConstant = onresumelambda0.read.toEventTypeConstant();
            getverticalaccuracy.getClass();
            ArrayList arrayList = new ArrayList();
            if (r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.write() > 0) {
                j = r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().read(0);
                for (int i2 = 0; i2 < r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.write(); i2++) {
                    arrayList.add(Integer.valueOf((int) ((r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().read(i2) - j) / 1000000)));
                }
            } else {
                j = 0;
            }
            ArrayList arrayList2 = new ArrayList(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.IconCompatParcelizer());
            int i3 = 0;
            while (i3 < r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.IconCompatParcelizer()) {
                ArrayList arrayList3 = new ArrayList(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.write());
                for (int i4 = i; i4 < r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.write(); i4++) {
                    arrayList3.add(Integer.valueOf((int) (r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read(i3).write(i4) * 1000.0f)));
                }
                arrayList2.add(arrayList3);
                i3++;
                i = 0;
            }
            O$b o$b = new O$b();
            o$b.RemoteActionCompatParcelizer = Byte.valueOf(eventTypeConstant);
            o$b.write = Long.valueOf(j / 1000000);
            o$b.IconCompatParcelizer = map;
            o$b.serializer = arrayList;
            o$b.read = arrayList2;
            BrazeUser brazeUserIconCompatParcelizer = o$b.IconCompatParcelizer();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = new r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM();
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.read = l;
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.addOnContextAvailableListener = brazeUserIconCompatParcelizer;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        }
        r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.RemoteActionCompatParcelizer();
    }

    public r8lambdavfaiU2EWz9c32wIPux8xRk42dWk(onResumelambda0 onresumelambda0, r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii) {
        this.serializer = onresumelambda0;
        this.read = r8lambdadmnir0ikfqv2uyaz5k1ofou62ii;
    }
}
