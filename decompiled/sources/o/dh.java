package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dh {
    private static int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 1;
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final E ComponentActivity;
    public final CanRequestLocationUpdatesImpl IconCompatParcelizer;
    public final SharedResourcePool MediaBrowserCompatMediaItem;
    public final MutableStateFlow MediaDescriptionCompat;
    public final SaveHeatmapUrlImpl MediaMetadataCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaSessionCompatResultReceiverWrapper;
    public final ImageHeaderParserImageType MediaSessionCompatToken;
    public final fillLineHorizontalBoundsui_text ParcelableVolumeInfo;
    public final RouterLogger PlaybackStateCompat;
    public final access500 PlaybackStateCompatCustomAction;
    public final getContentViewGroupParentLayout RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ResultReceiver;
    public final StateFlow r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SafeAreaPublisherImpl r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final MutableStateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final SharedResourcePool read;
    public boolean serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public dh(access500 access500Var, getContentViewGroupParentLayout getcontentviewgroupparentlayout, SharedResourcePool sharedResourcePool, SafeAreaPublisherImpl safeAreaPublisherImpl, SaveHeatmapUrlImpl saveHeatmapUrlImpl, ImageHeaderParserImageType imageHeaderParserImageType, SharedResourcePool sharedResourcePool2, E e, transferSessionPackageI transfersessionpackagei, RouterLogger routerLogger, fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl) {
        access500Var.getClass();
        getcontentviewgroupparentlayout.getClass();
        sharedResourcePool.getClass();
        safeAreaPublisherImpl.getClass();
        saveHeatmapUrlImpl.getClass();
        imageHeaderParserImageType.getClass();
        sharedResourcePool2.getClass();
        e.getClass();
        transfersessionpackagei.getClass();
        routerLogger.getClass();
        filllinehorizontalboundsui_text.getClass();
        canRequestLocationUpdatesImpl.getClass();
        this.PlaybackStateCompatCustomAction = access500Var;
        this.RatingCompat = getcontentviewgroupparentlayout;
        this.read = sharedResourcePool;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = safeAreaPublisherImpl;
        this.MediaMetadataCompat = saveHeatmapUrlImpl;
        this.MediaSessionCompatToken = imageHeaderParserImageType;
        this.MediaBrowserCompatMediaItem = sharedResourcePool2;
        this.ComponentActivity = e;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.PlaybackStateCompat = routerLogger;
        this.ParcelableVolumeInfo = filllinehorizontalboundsui_text;
        this.IconCompatParcelizer = canRequestLocationUpdatesImpl;
        kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector smallPersistentVector = kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = smallPersistentVector;
        this.MediaDescriptionCompat = StateFlowKt.read(Double.valueOf(14.0d));
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = StateFlowKt.read(smallPersistentVector);
        List list = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new g0ExternalSyntheticLambda1(g5.ALWAYS)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        g6 g6Var = (g6) safeAreaPublisherImpl.read.read();
        if (g6Var == null) {
            g6Var = (g6) safeAreaPublisherImpl.serializer.serializer.MediaSessionCompatResultReceiverWrapper();
            int i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 89;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new e6(list, g6Var));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mutableStateFlow;
        this.serializer = !((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MapLayersUiModel$1(this, null, 0), 3);
        int i4 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 103;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final void read(dh dhVar, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2 % 2;
        int i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 23;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) dhVar.MediaSessionCompatQueueItem;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED);
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) dhVar.MediaSessionCompatQueueItem;
        firebaseRemoteConfigImpl2.getClass();
        if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MapLayersUiModel$observeCenterButtonVisibility$1(dhVar, shortNewsContentCardView, 1), 3);
            int i3 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 23;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }

    public static final void RemoteActionCompatParcelizer(dh dhVar, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 103;
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 == 0) {
            dhVar.MediaSessionCompatResultReceiverWrapper.iterator();
            throw null;
        }
        Iterator<E> it = dhVar.MediaSessionCompatResultReceiverWrapper.iterator();
        while (it.hasNext()) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SaveShiftInfo$invoke$2((ec) it.next(), dhVar, shortNewsContentCardView, i), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0014 A[SYNTHETIC] */
    public final void IconCompatParcelizer() {
        Object next;
        int i;
        int i2 = 2 % 2;
        Iterable iterable = (Iterable) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 61;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                next = it.next();
                i = e7.IconCompatParcelizer[((fe) next).read().ordinal()];
                if (i != 0) {
                    int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 99;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    if (i != 2) {
                        arrayList.add(next);
                    }
                } else if (!(!((Boolean) this.ComponentActivity.read.read()).booleanValue())) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                i = e7.IconCompatParcelizer[((fe) next).read().ordinal()];
                if (i != 1) {
                    int i6 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 99;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    if (i != 2) {
                        arrayList.add(next);
                    }
                } else if (!(!((Boolean) this.ComponentActivity.read.read()).booleanValue())) {
                    arrayList.add(next);
                }
            }
        }
        read(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075 A[EDGE_INSN: B:23:0x0075->B:24:0x0076 BREAK  A[LOOP:2: B:18:0x0062->B:93:?]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:2: B:18:0x0062->B:93:?, LOOP_END, SYNTHETIC] */
    public final void read(ArrayList arrayList) {
        boolean z;
        Iterator it;
        boolean z2;
        Iterator it2;
        int i;
        fe feVar;
        int i2;
        int i3;
        boolean z3;
        int i4 = 2 % 2;
        List list = (List) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
        double dDoubleValue = ((Number) this.MediaDescriptionCompat.read()).doubleValue();
        g7 g7Var = (g7) this.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        list.getClass();
        List list2 = list;
        boolean z4 = list2 instanceof Collection;
        if (z4 && list2.isEmpty()) {
            if (z4) {
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = false;
                        break;
                    } else if (!(!(((fe) it.next()) instanceof ffExternalSyntheticOutline0))) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                int i5 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 41;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (list2.isEmpty()) {
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z2 = false;
                            break;
                        } else if (!(!(((fe) it.next()) instanceof ffExternalSyntheticOutline0))) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z4) {
                it2 = list2.iterator();
                i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 113;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i7 = 3 / 2;
                }
                while (true) {
                    if (it2.hasNext()) {
                        feVar = (fe) it2.next();
                        if (!(feVar instanceof ffExternalSyntheticOutline0)) {
                            i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                            i3 = i2 + 33;
                            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                int i8 = 27 / 0;
                                if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                                    int i9 = i2 + 9;
                                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i10 = i9 % 2;
                                    z3 = false;
                                }
                            } else if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                                int i11 = i2 + 9;
                                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                z3 = false;
                            }
                        }
                    } else {
                        z3 = true;
                    }
                }
            } else {
                it2 = list2.iterator();
                i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 113;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i13 = 3 / 2;
                }
                while (true) {
                    if (it2.hasNext()) {
                        feVar = (fe) it2.next();
                        if (!(feVar instanceof ffExternalSyntheticOutline0)) {
                            i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                            i3 = i2 + 33;
                            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                int i14 = 27 / 0;
                                if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                                    int i15 = i2 + 9;
                                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i16 = i15 % 2;
                                    z3 = false;
                                }
                            } else if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                                int i17 = i2 + 9;
                                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                z3 = false;
                            }
                        }
                    } else {
                        z3 = true;
                    }
                }
            }
            if (!z2) {
                dDoubleValue = g7Var.IconCompatParcelizer;
            } else {
                int i19 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 87;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i20 = i19 % 2;
                g7Var.getClass();
                dDoubleValue = 11.0d;
            }
        } else {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (z4) {
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z2 = false;
                                break;
                            } else if (!(!(((fe) it.next()) instanceof ffExternalSyntheticOutline0))) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        int i21 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 41;
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        if (list2.isEmpty()) {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (!(!(((fe) it.next()) instanceof ffExternalSyntheticOutline0))) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z4 || !list2.isEmpty()) {
                        it2 = list2.iterator();
                        i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 113;
                        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            int i110 = 3 / 2;
                        }
                        while (true) {
                            if (it2.hasNext()) {
                                feVar = (fe) it2.next();
                                if (!(feVar instanceof ffExternalSyntheticOutline0)) {
                                    i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                    i3 = i2 + 33;
                                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i3 % 2 != 0) {
                                        int i111 = 27 / 0;
                                        if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                                            int i112 = i2 + 9;
                                            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i113 = i112 % 2;
                                            z3 = false;
                                        }
                                    } else if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                                        int i114 = i2 + 9;
                                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i115 = i114 % 2;
                                        z3 = false;
                                    }
                                }
                            } else {
                                z3 = true;
                            }
                        }
                    } else {
                        z3 = true;
                    }
                    if ((!z2) && z3) {
                        int i116 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 87;
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i116 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i23 = i116 % 2;
                        g7Var.getClass();
                        dDoubleValue = 11.0d;
                    } else {
                        dDoubleValue = g7Var.IconCompatParcelizer;
                    }
                } else if (((fe) it3.next()) instanceof fh) {
                }
            }
        }
        double d = dDoubleValue;
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    int i24 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 63;
                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i24 % 2 != 0) {
                        int i25 = 62 / 0;
                        if (((fe) it4.next()) instanceof g0ExternalSyntheticLambda1) {
                            z = true;
                        }
                    } else if (((fe) it4.next()) instanceof g0ExternalSyntheticLambda1) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        }
        SafeAreaPublisherImpl safeAreaPublisherImpl = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        g6 g6Var = (g6) safeAreaPublisherImpl.read.read();
        this.read.RemoteActionCompatParcelizer(new e1(arrayList, g6Var == null ? (g6) safeAreaPublisherImpl.serializer.serializer.MediaSessionCompatResultReceiverWrapper() : g6Var, d, z));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0084 A[SYNTHETIC] */
    public static final void serializer(dh dhVar) {
        char c;
        char c2;
        Object obj;
        Object next;
        int i;
        int i2 = 2 % 2;
        SafeAreaPublisherImpl safeAreaPublisherImpl = dhVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MutableStateFlow mutableStateFlow = dhVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) mutableStateFlow.read();
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = dhVar.MediaSessionCompatResultReceiverWrapper;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, 10));
        Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.iterator();
        while (it.hasNext()) {
            arrayList.add((f9) ((ec) it.next()).IconCompatParcelizer().read());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 51;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                next = it2.next();
                int i4 = 44 / 0;
                if (!((f9) next).write.isEmpty()) {
                    i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 25;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        arrayList2.add(next);
                        int i5 = 62 / 0;
                    } else {
                        arrayList2.add(next);
                    }
                }
            } else {
                next = it2.next();
                if (!((f9) next).write.isEmpty()) {
                    i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 25;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        arrayList2.add(next);
                        int i6 = 62 / 0;
                    } else {
                        arrayList2.add(next);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((f9) it3.next()).write, (Collection) arrayList3);
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        List list = arrayList3;
        if (zIsEmpty) {
            List list2 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new g0ExternalSyntheticLambda1(g5.ALWAYS)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            g6 g6Var = (g6) safeAreaPublisherImpl.read.read();
            if (g6Var == null) {
                g6Var = (g6) safeAreaPublisherImpl.serializer.serializer.MediaSessionCompatResultReceiverWrapper();
            }
            g6Var.getClass();
            list = list2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            fe feVar = (fe) obj2;
            if (!dhVar.serializer) {
                int i7 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 115;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (!(feVar instanceof g0ExternalSyntheticLambda1)) {
                }
            }
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((fe) obj3) instanceof g0ExternalSyntheticLambda1) {
                arrayList5.add(obj3);
            } else {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList5) {
            int i9 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 47;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (obj4 instanceof g0ExternalSyntheticLambda1) {
                arrayList7.add(obj4);
            }
        }
        Iterator it4 = arrayList7.iterator();
        if (it4.hasNext()) {
            Object next2 = it4.next();
            if (it4.hasNext()) {
                int i11 = e7.IconCompatParcelizer[((g0ExternalSyntheticLambda1) next2).RemoteActionCompatParcelizer.ordinal()];
                if (i11 != 1) {
                    int i12 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 37;
                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0 ? i11 == 2 : i11 == 3) {
                        c = 1;
                    } else {
                        if (i11 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                        c = 3;
                    }
                } else {
                    c = 2;
                }
                do {
                    Object next3 = it4.next();
                    int i13 = e7.IconCompatParcelizer[((g0ExternalSyntheticLambda1) next3).RemoteActionCompatParcelizer.ordinal()];
                    if (i13 == 1) {
                        c2 = 2;
                    } else if (i13 == 2) {
                        int i14 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 79;
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i14 % 2 != 0) {
                            int i15 = 2 / 5;
                        }
                        c2 = 1;
                    } else {
                        if (i13 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                        c2 = 3;
                    }
                    if (c < c2) {
                        int i16 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 5;
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        next2 = next3;
                        c = c2;
                    }
                } while (it4.hasNext());
            }
            obj = next2;
        } else {
            int i18 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 83;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            obj = null;
        }
        g0ExternalSyntheticLambda1 g0externalsyntheticlambda1 = (g0ExternalSyntheticLambda1) obj;
        if (g0externalsyntheticlambda1 != null) {
            arrayList6 = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) arrayList6, (Object) g0externalsyntheticlambda1);
        }
        mutableStateFlow.IconCompatParcelizer(removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList6));
        Iterable iterable = (Iterable) mutableStateFlow.read();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : iterable) {
            fe feVar2 = (fe) obj5;
            feVar2.serializer().getClass();
            feVar2.serializer().getClass();
            double dDoubleValue = ((Number) ((Comparable) dhVar.MediaDescriptionCompat.read())).doubleValue();
            if (dDoubleValue >= 0.0d && dDoubleValue <= 22.0d) {
                arrayList8.add(obj5);
            }
        }
        MutableStateFlow mutableStateFlow2 = dhVar.RemoteActionCompatParcelizer;
        dhVar.MediaSessionCompatToken.getClass();
        List listSerializer = onContentCardDismissed.serializer(arrayList8, new FocusChangedElement(3));
        g6 g6Var2 = (g6) safeAreaPublisherImpl.read.read();
        if (g6Var2 == null) {
            g6Var2 = (g6) safeAreaPublisherImpl.serializer.serializer.MediaSessionCompatResultReceiverWrapper();
        }
        mutableStateFlow2.IconCompatParcelizer(new e6(listSerializer, g6Var2));
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, mutableStateFlow.read()}, getCieXyz.write())).booleanValue()) {
            int i20 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 101;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i21 = i20 % 2;
            dhVar.IconCompatParcelizer();
        }
        int i22 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 121;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i23 = i22 % 2;
    }
}
