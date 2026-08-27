package o;

import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.home.state.domain.Phase2FallbackReason;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class consumePendingUpdateOperations implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ RiderStateRepositoryImpl RemoteActionCompatParcelizer;

    public consumePendingUpdateOperations(RiderStateRepositoryImpl riderStateRepositoryImpl) {
        this.RemoteActionCompatParcelizer = riderStateRepositoryImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object next;
        int i = 2 % 2;
        List list = (List) obj;
        RiderStateRepositoryImpl riderStateRepositoryImpl = this.RemoteActionCompatParcelizer;
        riderStateRepositoryImpl.read.getClass();
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                boolean zContainsAll = arrayList.containsAll(getClipToPadding.IconCompatParcelizer);
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (onItemDismiss.serializer(!zContainsAll ? new isItemDismissable(new Throwable()) : createfromparcel) != null) {
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(displayInAppMessagelambda1.serializer(((dispatchLayoutStep1) it2.next()).getClass()));
                    }
                    Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
                    Set set = getClipToPadding.IconCompatParcelizer;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        int i2 = serializer + 67;
                        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            next = it3.next();
                            int i3 = 54 / 0;
                            if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains((getUnregisteredInAppMessageannotations) next)) {
                                arrayList3.add(next);
                            }
                        } else {
                            next = it3.next();
                            if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains((getUnregisteredInAppMessageannotations) next)) {
                                arrayList3.add(next);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    if (it4.hasNext()) {
                        ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) ((getUnregisteredInAppMessageannotations) it4.next())).write();
                        throw null;
                    }
                    if (!arrayList4.isEmpty()) {
                        getScrollState getscrollstate = riderStateRepositoryImpl.MediaBrowserCompatMediaItem;
                        getscrollstate.getClass();
                        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList4, ",", null, null, new RetryWithDelay$$ExternalSyntheticLambda0(19, getscrollstate), 30);
                        executeAsList executeaslist = ((dispatchLayoutStep1) onContentCardDismissed.read((List) arrayList4)).read();
                        ((SentryCriticalIssueLogger) getscrollstate.IconCompatParcelizer).write("rider_home_phase2_missing_mandatory_component", executeaslist, "RiderHome Phase2 missing mandatory component: ".concat(strIconCompatParcelizer), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("component", strIconCompatParcelizer), new onViewAttachedToWindowlambda0("owner", executeaslist.name())));
                    }
                    dispatchLayoutStep1 dispatchlayoutstep1 = (dispatchLayoutStep1) onContentCardDismissed.MediaMetadataCompat((List) arrayList4);
                    if (dispatchlayoutstep1 != null) {
                        riderStateRepositoryImpl.read(new Phase2FallbackReason.MissingMandatoryComponent(dispatchlayoutstep1));
                        return createfromparcel;
                    }
                }
                return createfromparcel;
            }
            int i4 = IconCompatParcelizer + 121;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                arrayList.add(displayInAppMessagelambda1.serializer(((dispatchLayoutStep1) it.next()).getClass()));
                obj2.hashCode();
                throw null;
            }
            arrayList.add(displayInAppMessagelambda1.serializer(((dispatchLayoutStep1) it.next()).getClass()));
        }
    }
}
