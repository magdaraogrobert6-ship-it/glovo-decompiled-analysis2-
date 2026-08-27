package o;

import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class handleCancelNotificationActionlambda1 implements sendNotificationOpenedBroadcast {
    private final onPauselambda0 write;

    public handleCancelNotificationActionlambda1(onPauselambda0 onpauselambda0) {
        onpauselambda0.getClass();
        this.write = onpauselambda0;
    }

    @Override // o.sendNotificationOpenedBroadcast
    public final createNotification read(createNotification createnotification) {
        createnotification.getClass();
        TimeSeriesType timeSeriesType = createnotification.read;
        List list = createnotification.RemoteActionCompatParcelizer;
        Long l = createnotification.serializer;
        List<List> list2 = createnotification.IconCompatParcelizer;
        if (list == null || l == null || list2 == null) {
            return createnotification;
        }
        r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfk = new r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdak_msz2dnanoyi5bwwe2hzkactfk.serializer(((Integer) it.next()).intValue());
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (List list3 : list2) {
            list3.getClass();
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it2.next()).shortValue()));
            }
            arrayList.add(arrayList2);
        }
        onResumelambda2 onresumelambda2 = new onResumelambda2((byte) timeSeriesType.value);
        onresumelambda2.RemoteActionCompatParcelizer(r8lambdak_msz2dnanoyi5bwwe2hzkactfk, arrayList);
        this.write.read(onresumelambda2);
        r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM r8lambdaidq_hvsqzrowygs_o3rdceijnlm = onresumelambda2.read();
        r8lambdaidq_hvsqzrowygs_o3rdceijnlm.getClass();
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaidq_hvsqzrowygs_o3rdceijnlm, 10));
        Iterator<Integer> it3 = r8lambdaidq_hvsqzrowygs_o3rdceijnlm.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Short.valueOf((short) it3.next().intValue()));
        }
        r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM r8lambdaidq_hvsqzrowygs_o3rdceijnlmIconCompatParcelizer = onresumelambda2.IconCompatParcelizer();
        r8lambdaidq_hvsqzrowygs_o3rdceijnlmIconCompatParcelizer.getClass();
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaidq_hvsqzrowygs_o3rdceijnlmIconCompatParcelizer, 10));
        Iterator<Integer> it4 = r8lambdaidq_hvsqzrowygs_o3rdceijnlmIconCompatParcelizer.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Short.valueOf((short) it4.next().intValue()));
        }
        r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM r8lambdaidq_hvsqzrowygs_o3rdceijnlmMediaMetadataCompat = onresumelambda2.MediaMetadataCompat();
        r8lambdaidq_hvsqzrowygs_o3rdceijnlmMediaMetadataCompat.getClass();
        ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaidq_hvsqzrowygs_o3rdceijnlmMediaMetadataCompat, 10));
        Iterator<Integer> it5 = r8lambdaidq_hvsqzrowygs_o3rdceijnlmMediaMetadataCompat.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Short.valueOf((short) it5.next().intValue()));
        }
        List list4 = androidx.sqlite.SQLite.read(arrayList3, arrayList4, arrayList5);
        r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer = onresumelambda2.RemoteActionCompatParcelizer();
        r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer.getClass();
        ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer, 10));
        Iterator<Long> it6 = r8lambdak_msz2dnanoyi5bwwe2hzkactfkRemoteActionCompatParcelizer.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Integer.valueOf((int) it6.next().longValue()));
        }
        O$b o$b = new O$b();
        o$b.serializer = arrayList6;
        o$b.write = l;
        o$b.read = list4;
        o$b.RemoteActionCompatParcelizer = timeSeriesType;
        o$b.IconCompatParcelizer = createnotification.MediaSessionCompatQueueItem;
        return o$b.RatingCompat();
    }
}
