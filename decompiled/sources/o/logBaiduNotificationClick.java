package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class logBaiduNotificationClick implements sendNotificationOpenedBroadcast {
    private final NotificationTrampolineActivityonResume7 serializer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.NotificationTrampolineActivityonResume7] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.sendNotificationOpenedBroadcast
    public final createNotification read(createNotification createnotification) {
        ?? arrayList;
        createnotification.getClass();
        List list = createnotification.RemoteActionCompatParcelizer;
        List list2 = createnotification.IconCompatParcelizer;
        if (list == null || list2 == null || list2.size() < 4) {
            arrayList = instance_delegatelambda0.write;
        } else {
            List list3 = (List) list2.get(0);
            List list4 = (List) list2.get(1);
            List list5 = (List) list2.get(2);
            List list6 = (List) list2.get(3);
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7Write = androidx.sqlite.SQLite.write((Collection) list);
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7Write, 10));
            getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7Write.iterator();
            while (it.RemoteActionCompatParcelizer) {
                int iRemoteActionCompatParcelizer = it.RemoteActionCompatParcelizer();
                arrayList.add(new onCreatelambda0(((Number) list.get(iRemoteActionCompatParcelizer)).intValue(), ((double) ((Number) list3.get(iRemoteActionCompatParcelizer)).shortValue()) / 1000.0d, ((double) ((Number) list4.get(iRemoteActionCompatParcelizer)).shortValue()) / 1000.0d, ((double) ((Number) list5.get(iRemoteActionCompatParcelizer)).shortValue()) / 1000.0d, ((double) ((Number) list6.get(iRemoteActionCompatParcelizer)).shortValue()) / 1000.0d));
            }
        }
        ArrayList<onCreatelambda0> arrayListSerializer = this.serializer.serializer(arrayList);
        ArrayList arrayList2 = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList2.add(new ArrayList());
        }
        List list7 = (List) arrayList2.get(0);
        List list8 = (List) arrayList2.get(1);
        List list9 = (List) arrayList2.get(2);
        List list10 = (List) arrayList2.get(3);
        for (onCreatelambda0 oncreatelambda0 : arrayListSerializer) {
            list7.add(Short.valueOf((short) (oncreatelambda0.write() * 1000.0d)));
            list8.add(Short.valueOf((short) (oncreatelambda0.RemoteActionCompatParcelizer() * 1000.0d)));
            list9.add(Short.valueOf((short) (oncreatelambda0.serializer() * 1000.0d)));
            list10.add(Short.valueOf((short) (oncreatelambda0.read() * 1000.0d)));
        }
        List list11 = androidx.sqlite.SQLite.read(list7, list8, list9, list10);
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayListSerializer, 10));
        Iterator it2 = arrayListSerializer.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf((int) ((onCreatelambda0) it2.next()).IconCompatParcelizer()));
        }
        O$b o$b = new O$b();
        o$b.serializer = arrayList3;
        o$b.write = createnotification.serializer;
        o$b.read = list11;
        TimeSeriesType timeSeriesType = createnotification.read;
        if (timeSeriesType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'type' cannot be null");
            return null;
        }
        o$b.RemoteActionCompatParcelizer = timeSeriesType;
        o$b.IconCompatParcelizer = createnotification.MediaSessionCompatQueueItem;
        return o$b.RatingCompat();
    }

    public logBaiduNotificationClick(NotificationTrampolineActivityonResume7 notificationTrampolineActivityonResume7) {
        notificationTrampolineActivityonResume7.getClass();
        this.serializer = notificationTrampolineActivityonResume7;
    }
}
