package com.roadrunner.delivery.repository;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.repository.api.DeliveryInformation$DeliveryStatus;
import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidPopup_androidKtPopup1;
import o.AndroidPopup_androidKtPopup41;
import o.AndroidPopup_androidKtPopup811;
import o.AndroidPopup_androidKtPopup9;
import o.AndroidView;
import o.AndroidViewHolder_androidKtNoOpScrollConnection1;
import o.DialogLayout1;
import o.ItemTouchHelperAdapter;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.accessgetSpcp;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.getContentViewGroupParentLayout;
import o.isUnspecifiedR2X_6o;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.setCarryoverInAppMessage;
import o.setFitInsetsSides;
import o.setFitInsetsTypes;
import o.timesmpE4wyQ;
import o.toComposeOffset;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class StateV3DeliveryProvider {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final StateFlow serializer;
    public final MetricsBatchProcessor write;

    public StateV3DeliveryProvider(accessrequireViewFactoryHolder accessrequireviewfactoryholder, MetricsBatchProcessor metricsBatchProcessor, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.write = metricsBatchProcessor;
        this.read = getcontentviewgroupparentlayout;
        this.serializer = FlowKt.write(FlowKt.RemoteActionCompatParcelizer(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) accessrequireviewfactoryholder)).MediaBrowserCompatMediaItem, 26), ((StateProviderImpl) ((AndroidView) accessrequireviewfactoryholder)).RemoteActionCompatParcelizer, ((StateProviderImpl) ((AndroidViewHolder_androidKtNoOpScrollConnection1) accessrequireviewfactoryholder)).MediaSessionCompatQueueItem, ((StateProviderImpl) ((toComposeOffset) accessrequireviewfactoryholder)).RatingCompat, new StateV3DeliveryProvider$_deliveryCache$1(5, null)), getcontentviewgroupparentlayout, SharingStarted.Companion.read(2), null);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[LOOP:2: B:51:0x00b2->B:144:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce A[EDGE_INSN: B:58:0x00ce->B:60:0x00d1 BREAK  A[LOOP:1: B:38:0x0078->B:140:0x0078, LOOP_LABEL: LOOP:1: B:38:0x0078->B:140:0x0078]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0 A[EDGE_INSN: B:59:0x00d0->B:60:0x00d1 BREAK  A[LOOP:1: B:38:0x0078->B:140:0x0078]] */
    public static timesmpE4wyQ write(isUnspecifiedR2X_6o isunspecifiedr2x_6o) {
        AndroidPopup_androidKtPopup1 androidPopup_androidKtPopup1;
        boolean z;
        setFitInsetsSides setfitinsetssides;
        Object next;
        DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        Object next2;
        Iterator it;
        List list;
        Iterator it2;
        int i;
        int i2;
        Object next3;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String str = (isunspecifiedr2x_6o == null || (androidPopup_androidKtPopup41 = isunspecifiedr2x_6o.write) == null) ? null : androidPopup_androidKtPopup41.read();
        if (isunspecifiedr2x_6o != null) {
            int i6 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            List list2 = isunspecifiedr2x_6o.read;
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!(next3 instanceof AndroidPopup_androidKtPopup1));
                androidPopup_androidKtPopup1 = (AndroidPopup_androidKtPopup1) next3;
            } else {
                androidPopup_androidKtPopup1 = null;
            }
        } else {
            androidPopup_androidKtPopup1 = null;
        }
        boolean z2 = androidPopup_androidKtPopup1 != null;
        List list3 = isunspecifiedr2x_6o != null ? isunspecifiedr2x_6o.RemoteActionCompatParcelizer : null;
        if (list3 == null) {
            z = false;
            break;
        }
        List list4 = list3;
        if (!(list4 instanceof Collection)) {
            it = list4.iterator();
            loop1: while (true) {
                if (!(!it.hasNext())) {
                    list = ((AndroidPopup_androidKtPopup9) it.next()).components;
                    if (list instanceof Collection) {
                        i2 = IconCompatParcelizer + 47;
                        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i8 = 3 / 0;
                            if (list.isEmpty()) {
                                continue;
                            }
                        } else if (list.isEmpty()) {
                            continue;
                        }
                    }
                    it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((AndroidPopup_androidKtPopup811) it2.next()) instanceof setFitInsetsTypes) {
                                i = IconCompatParcelizer + 31;
                                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    z = true;
                                    break loop1;
                                }
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        int i9 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            list4.isEmpty();
            throw null;
        }
        if (!list4.isEmpty()) {
            it = list4.iterator();
            loop1: while (true) {
                if (!(!it.hasNext())) {
                    list = ((AndroidPopup_androidKtPopup9) it.next()).components;
                    if (list instanceof Collection) {
                        i2 = IconCompatParcelizer + 47;
                        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i10 = 3 / 0;
                            if (list.isEmpty()) {
                                continue;
                            }
                        } else if (list.isEmpty()) {
                            continue;
                        }
                    }
                    it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((AndroidPopup_androidKtPopup811) it2.next()) instanceof setFitInsetsTypes) {
                                i = IconCompatParcelizer + 31;
                                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    z = true;
                                    break loop1;
                                }
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        if (str == null || (setfitinsetssides = isunspecifiedr2x_6o.IconCompatParcelizer) == null) {
            if (isunspecifiedr2x_6o != null) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                isunspecifiedr2x_6o.toString();
                forest.getClass();
            }
            ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
            return new timesmpE4wyQ(itemTouchHelperAdapter, itemTouchHelperAdapter, null, simpleItemTouchHelperCallback, z2, simpleItemTouchHelperCallback, z);
        }
        List<DialogLayout1> list5 = setfitinsetssides.routes;
        ArrayList arrayList = new ArrayList();
        for (DialogLayout1 dialogLayout1 : list5) {
            int i11 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Long lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(dialogLayout1.deliveryId);
            if (lParcelableVolumeInfo == null) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("DeliveryInformation: Unknown deliveryId: " + isunspecifiedr2x_6o));
                lParcelableVolumeInfo = null;
            }
            accessgetSpcp accessgetspcp = DeliveryInformation$DeliveryStatus.Companion;
            String str2 = dialogLayout1.deliveryStatus;
            accessgetspcp.getClass();
            str2.getClass();
            Iterator<E> it4 = DeliveryInformation$DeliveryStatus.getEntries().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!setCarryoverInAppMessage.serializer(((DeliveryInformation$DeliveryStatus) next2).getValue(), str2, true));
            DeliveryInformation$DeliveryStatus deliveryInformation$DeliveryStatus = (DeliveryInformation$DeliveryStatus) next2;
            if (deliveryInformation$DeliveryStatus == null) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("DeliveryStatus.getByStatus: Unknown status: ".concat(str2)));
                deliveryInformation$DeliveryStatus = null;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (lParcelableVolumeInfo == null || deliveryInformation$DeliveryStatus == null) ? null : new onViewAttachedToWindowlambda0(lParcelableVolumeInfo, deliveryInformation$DeliveryStatus);
            if (onviewattachedtowindowlambda1 != null) {
                arrayList.add(onviewattachedtowindowlambda1);
            }
        }
        Map mapSerializer = onMove.serializer(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            Long lParcelableVolumeInfo2 = setCarryoverInAppMessage.ParcelableVolumeInfo(((DialogLayout1) it5.next()).orderId);
            if (lParcelableVolumeInfo2 == null) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("DeliveryInformation: Unknown orderId: " + isunspecifiedr2x_6o));
                lParcelableVolumeInfo2 = null;
            }
            if (lParcelableVolumeInfo2 != null) {
                int i13 = RemoteActionCompatParcelizer + 121;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    arrayList2.add(lParcelableVolumeInfo2);
                    int i14 = 26 / 0;
                } else {
                    arrayList2.add(lParcelableVolumeInfo2);
                }
            }
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
        Iterator it6 = list5.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((DialogLayout1) it6.next()).deliveryId);
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (DialogLayout1 dialogLayout2 : list5) {
            Long lParcelableVolumeInfo3 = setCarryoverInAppMessage.ParcelableVolumeInfo(dialogLayout2.deliveryId);
            if (lParcelableVolumeInfo3 == null) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("DeliveryInformation: Unknown deliveryId: " + isunspecifiedr2x_6o));
                lParcelableVolumeInfo3 = null;
            }
            if (lParcelableVolumeInfo3 == null) {
                int i15 = RemoteActionCompatParcelizer + 69;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                onviewattachedtowindowlambda0 = null;
            } else {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(lParcelableVolumeInfo3, dialogLayout2.deliveryAction);
            }
            if (onviewattachedtowindowlambda0 != null) {
                arrayList4.add(onviewattachedtowindowlambda0);
            }
        }
        Map mapSerializer2 = onMove.serializer(arrayList4);
        DeliveryInformation$ScreenDataType.Companion.getClass();
        Iterator<E> it7 = DeliveryInformation$ScreenDataType.getEntries().iterator();
        do {
            if (!it7.hasNext()) {
                next = null;
                break;
            }
            next = it7.next();
        } while (!setCarryoverInAppMessage.serializer(((DeliveryInformation$ScreenDataType) next).getValue(), str, true));
        DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType2 = (DeliveryInformation$ScreenDataType) next;
        if (deliveryInformation$ScreenDataType2 == null) {
            Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("ScreenDataType.getByStatus: Unknown status: ".concat(str)));
            deliveryInformation$ScreenDataType = null;
        } else {
            deliveryInformation$ScreenDataType = deliveryInformation$ScreenDataType2;
        }
        return new timesmpE4wyQ(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2, deliveryInformation$ScreenDataType, mapSerializer, z2, mapSerializer2, z);
    }
}
