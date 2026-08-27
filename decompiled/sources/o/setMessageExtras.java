package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class setMessageExtras {
    private final getCloseButtonColor IconCompatParcelizer;
    private final getAnimateOutannotations serializer;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final List RemoteActionCompatParcelizer(long j, List list) {
        ArrayList arrayList = new ArrayList();
        createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0 = new createBrazeUserChangeEventSubscriberlambda0();
        createbrazeuserchangeeventsubscriberlambda0.serializer = -1L;
        createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda1 = new createBrazeUserChangeEventSubscriberlambda0();
        createbrazeuserchangeeventsubscriberlambda1.serializer = -1L;
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
        getAnimateOutannotations getanimateoutannotations = this.serializer;
        getanimateoutannotations.getClass();
        if (setClickBehaviordefault.read(getanimateoutannotations, (List<? extends handleLogClickdefault>) list).isEmpty()) {
            return instance_delegatelambda0.write;
        }
        Iterator it = list.iterator();
        long jMediaDescriptionCompat = -1;
        while (it.hasNext()) {
            handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) it.next();
            if (setClickBehaviordefault.RemoteActionCompatParcelizer(getanimateoutannotations, handlelogclickdefault)) {
                if (handlelogclickdefault.MediaDescriptionCompat() - 60000 > jMediaDescriptionCompat) {
                    IconCompatParcelizer(createbrazeuserchangeeventsubscriberlambda0, createbrazeuserchangeeventsubscriberlambda01, createbrazeuserchangeeventsubscriberlambda1, j, this, list, arrayList);
                }
                if (createbrazeuserchangeeventsubscriberlambda0.serializer == -1) {
                    createbrazeuserchangeeventsubscriberlambda0.serializer = handlelogclickdefault.MediaDescriptionCompat();
                }
                createbrazeuserchangeeventsubscriberlambda1.serializer = handlelogclickdefault.MediaDescriptionCompat();
                jMediaDescriptionCompat = handlelogclickdefault.MediaDescriptionCompat();
                createbrazeuserchangeeventsubscriberlambda01.read++;
            } else {
                IconCompatParcelizer(createbrazeuserchangeeventsubscriberlambda0, createbrazeuserchangeeventsubscriberlambda01, createbrazeuserchangeeventsubscriberlambda1, j, this, list, arrayList);
            }
        }
        IconCompatParcelizer(createbrazeuserchangeeventsubscriberlambda0, createbrazeuserchangeeventsubscriberlambda01, createbrazeuserchangeeventsubscriberlambda1, j, this, list, arrayList);
        return arrayList;
    }

    static {
        new write(null);
    }

    public setMessageExtras(logImpression logimpression, getCloseButtonColor getclosebuttoncolor) {
        logimpression.getClass();
        getclosebuttoncolor.getClass();
        this.IconCompatParcelizer = getclosebuttoncolor;
        this.serializer = logimpression.serializer();
    }

    private static final void IconCompatParcelizer(createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0, createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda1, long j, setMessageExtras setmessageextras, List list, ArrayList arrayList) {
        long j2 = createbrazeuserchangeeventsubscriberlambda0.serializer;
        if (j2 != -1) {
            if (createbrazeuserchangeeventsubscriberlambda01.read == 1) {
                createbrazeuserchangeeventsubscriberlambda1.serializer = Math.min(j2 + 1000, j);
            }
            arrayList.add(new r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80(createbrazeuserchangeeventsubscriberlambda0.serializer, createbrazeuserchangeeventsubscriberlambda1.serializer, setmessageextras.IconCompatParcelizer.write(createbrazeuserchangeeventsubscriberlambda0.serializer, createbrazeuserchangeeventsubscriberlambda1.serializer, list)));
            createbrazeuserchangeeventsubscriberlambda0.serializer = -1L;
            createbrazeuserchangeeventsubscriberlambda1.serializer = -1L;
            createbrazeuserchangeeventsubscriberlambda01.read = 0;
        }
    }
}
