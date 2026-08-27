package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.ThriftBool;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.socket.engineio.client.Socket$7$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda1MNczrzuv4oWduWgKg6cjtSWs implements setSdkDataWipeEventSubscriber, r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ {
    public Object IconCompatParcelizer;
    public Object write;

    public r8lambdaQL6ub89hblyhJQInoVzkJXjcYls RemoteActionCompatParcelizer() {
        if (((ArrayList) this.write) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'inputs' is missing");
            return null;
        }
        if (((ArrayList) this.IconCompatParcelizer) != null) {
            return new r8lambdaQL6ub89hblyhJQInoVzkJXjcYls(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'outputs' is missing");
        return null;
    }

    @Override // o.r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ
    public Object serializer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, ArrayList arrayList) {
        Object isitemdismissable;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.IconCompatParcelizer;
        Class cls = Options.Companion.read(getunregisteredinappmessageannotations);
        Object r8lambdawpjdbkc1fze4hi8ed7qnjutpxm = concurrentHashMap.get(cls);
        if (r8lambdawpjdbkc1fze4hi8ed7qnjutpxm == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (r8lambdawpjdbkc1fze4hi8ed7qnjutpxm = new r8lambdaWpJdbkc1fZe4hI8eD7qnJUtPXM()))) != null) {
            r8lambdawpjdbkc1fze4hi8ed7qnjutpxm = objPutIfAbsent;
        }
        r8lambdaWpJdbkc1fZe4hI8eD7qnJUtPXM r8lambdawpjdbkc1fze4hi8ed7qnjutpxm2 = (r8lambdaWpJdbkc1fZe4hI8eD7qnJUtPXM) r8lambdawpjdbkc1fze4hi8ed7qnjutpxm;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new startClearHtmlInAppMessageAssetsThread((registerInAppMessageManagerlambda50) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = r8lambdawpjdbkc1fze4hi8ed7qnjutpxm2.read;
        Object onitemdismiss = concurrentHashMap2.get(arrayList2);
        if (onitemdismiss == null) {
            try {
                isitemdismissable = (setGraphicModalMaxWidthDp) ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.write).invoke(getunregisteredinappmessageannotations, arrayList);
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            onitemdismiss = new onItemDismiss(isitemdismissable);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, onitemdismiss);
            if (objPutIfAbsent2 != null) {
                onitemdismiss = objPutIfAbsent2;
            }
        }
        return ((onItemDismiss) onitemdismiss).IconCompatParcelizer;
    }

    @Override // o.setSdkDataWipeEventSubscriber
    public void write(Object obj) {
        networkUnavailable networkunavailable = (networkUnavailable) this.write;
        r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74 r8lambdax0ikgfkcyf8phqkdy2wfcdmih74 = (r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74) this.IconCompatParcelizer;
        setContentCardsSwipeLayout setcontentcardsswipelayout = (setContentCardsSwipeLayout) networkunavailable;
        O$b o$b = new O$b();
        o$b.IconCompatParcelizer = "POST";
        o$b.write = (String) obj;
        o$b.serializer = setcontentcardsswipelayout.IconCompatParcelizer;
        setDefaultEmptyContentCardsAdapter setdefaultemptycontentcardsadapterWrite = setcontentcardsswipelayout.write(o$b);
        int i = 2;
        setdefaultemptycontentcardsadapterWrite.read("success", new Socket$7$1(i, r8lambdax0ikgfkcyf8phqkdy2wfcdmih74));
        setdefaultemptycontentcardsadapterWrite.read(FWFConstants.EXPLANATION_TYPE_ERROR, new setContentCardsRecyclerView(setcontentcardsswipelayout, i));
        setdefaultemptycontentcardsadapterWrite.serializer();
    }

    public r8lambda1MNczrzuv4oWduWgKg6cjtSWs(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = new ConcurrentHashMap();
    }

    public /* synthetic */ r8lambda1MNczrzuv4oWduWgKg6cjtSWs(Object obj, Object obj2) {
        this.write = obj;
        this.IconCompatParcelizer = obj2;
    }

    public recordGeofenceTransition write() {
        if (((ArrayList) this.write) != null) {
            if (((Byte) this.IconCompatParcelizer) != null) {
                return new recordGeofenceTransition(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'alarm_trigger' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'alarm_ids' is missing");
        return null;
    }

    public r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU serializer() {
        if (((Long) this.IconCompatParcelizer) != null) {
            if (((ArrayList) this.write) != null) {
                return new r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'waypoints' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'base_timestamp' is missing");
        return null;
    }

    public setCustomUserAttributelambda4 IconCompatParcelizer() {
        if (((Byte) this.write) != null) {
            if (((Long) this.IconCompatParcelizer) != null) {
                return new setCustomUserAttributelambda4(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'screen_event_type' is missing");
        return null;
    }

    public setCustomAttributeToSecondsFromEpoch read() {
        if (((ThriftBool) this.write) != null) {
            if (((Byte) this.IconCompatParcelizer) != null) {
                return new setCustomAttributeToSecondsFromEpoch(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'percent_threshold' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_low' is missing");
        return null;
    }

    public r8lambda1MNczrzuv4oWduWgKg6cjtSWs() {
    }
}
