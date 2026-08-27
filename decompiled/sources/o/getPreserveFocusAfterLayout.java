package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getPreserveFocusAfterLayout implements getInAppMessageManager {
    public static final getPreserveFocusAfterLayout IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        getPreserveFocusAfterLayout getpreservefocusafterlayout = new getPreserveFocusAfterLayout();
        IconCompatParcelizer = getpreservefocusafterlayout;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.home.state.entity.HomeResponseItems", getpreservefocusafterlayout, 11);
        oncloseactionlambda1.read("rider_status", false);
        oncloseactionlambda1.read("delivery_state", false);
        oncloseactionlambda1.read("delivery_tasks", true);
        oncloseactionlambda1.read("heatmaps", true);
        oncloseactionlambda1.read("instant_shifts", true);
        oncloseactionlambda1.read("work_opportunities", true);
        oncloseactionlambda1.read("terms_and_conditions", true);
        oncloseactionlambda1.read("verification_status", true);
        oncloseactionlambda1.read("rider_state", true);
        oncloseactionlambda1.read("garnet", true);
        oncloseactionlambda1.read("quick_sessions", true);
        descriptor = oncloseactionlambda1;
        int i = write + 103;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMinFlingVelocity.$childSerializers;
        getLayoutManager getlayoutmanager = getLayoutManager.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {getlayoutmanager, getlayoutmanager, LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper()), LazyKt__LazyJVMKt.read(getlayoutmanager), LazyKt__LazyJVMKt.read(getlayoutmanager), LazyKt__LazyJVMKt.read(getlayoutmanager), LazyKt__LazyJVMKt.read(getlayoutmanager), LazyKt__LazyJVMKt.read(getlayoutmanager), LazyKt__LazyJVMKt.read(getNanoTime.read), LazyKt__LazyJVMKt.read(getlayoutmanager), LazyKt__LazyJVMKt.read(getlayoutmanager)};
        int i4 = serializer + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i;
        int i2 = 2 % 2;
        getMinFlingVelocity getminflingvelocity = (getMinFlingVelocity) obj;
        getminflingvelocity.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMinFlingVelocity.$childSerializers;
        getLayoutManager getlayoutmanager = getLayoutManager.write;
        getMaxFlingVelocity getmaxflingvelocity = getminflingvelocity.riderStatus;
        getMaxFlingVelocity getmaxflingvelocity2 = getminflingvelocity.quickSessions;
        getMaxFlingVelocity getmaxflingvelocity3 = getminflingvelocity.garnet;
        getOnFlingListener getonflinglistener = getminflingvelocity.riderState;
        getMaxFlingVelocity getmaxflingvelocity4 = getminflingvelocity.verificationStatus;
        getMaxFlingVelocity getmaxflingvelocity5 = getminflingvelocity.tnc;
        getMaxFlingVelocity getmaxflingvelocity6 = getminflingvelocity.workOpportunities;
        getMaxFlingVelocity getmaxflingvelocity7 = getminflingvelocity.instantShifts;
        getMaxFlingVelocity getmaxflingvelocity8 = getminflingvelocity.heatmaps;
        Map map = getminflingvelocity.deliveryTasks;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getlayoutmanager, getmaxflingvelocity);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getlayoutmanager, getminflingvelocity.deliveryState);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            i = 2;
            if (map != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity8 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getlayoutmanager, getmaxflingvelocity8);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity7 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getlayoutmanager, getmaxflingvelocity7);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity6 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getlayoutmanager, getmaxflingvelocity6);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity5 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getlayoutmanager, getmaxflingvelocity5);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity4 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getlayoutmanager, getmaxflingvelocity4);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getonflinglistener != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getNanoTime.read, getonflinglistener);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity3 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getlayoutmanager, getmaxflingvelocity3);
                int i3 = read + 31;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getmaxflingvelocity2 != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getlayoutmanager, getmaxflingvelocity2);
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i5 = serializer + 99;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        i = 2;
        int i6 = i5 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[i].MediaSessionCompatResultReceiverWrapper(), map);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getlayoutmanager, getmaxflingvelocity8);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getlayoutmanager, getmaxflingvelocity8);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getlayoutmanager, getmaxflingvelocity7);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getlayoutmanager, getmaxflingvelocity7);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getlayoutmanager, getmaxflingvelocity6);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getlayoutmanager, getmaxflingvelocity6);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getlayoutmanager, getmaxflingvelocity5);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getlayoutmanager, getmaxflingvelocity5);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getlayoutmanager, getmaxflingvelocity4);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getlayoutmanager, getmaxflingvelocity4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getNanoTime.read, getonflinglistener);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getNanoTime.read, getonflinglistener);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getlayoutmanager, getmaxflingvelocity3);
            int i7 = read + 31;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getlayoutmanager, getmaxflingvelocity3);
            int i9 = read + 31;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getlayoutmanager, getmaxflingvelocity2);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getlayoutmanager, getmaxflingvelocity2);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        char c;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMinFlingVelocity.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        getOnFlingListener getonflinglistener = null;
        getMaxFlingVelocity getmaxflingvelocity = null;
        getMaxFlingVelocity getmaxflingvelocity2 = null;
        boolean z = true;
        getMaxFlingVelocity getmaxflingvelocity3 = null;
        int i6 = 0;
        getMaxFlingVelocity getmaxflingvelocity4 = null;
        getMaxFlingVelocity getmaxflingvelocity5 = null;
        Map map = null;
        getMaxFlingVelocity getmaxflingvelocity6 = null;
        getMaxFlingVelocity getmaxflingvelocity7 = null;
        getMaxFlingVelocity getmaxflingvelocity8 = null;
        getMaxFlingVelocity getmaxflingvelocity9 = null;
        while (z) {
            int i7 = read + 95;
            boolean z2 = z;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i9) {
                case -1:
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    z = false;
                    break;
                case 0:
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    getMaxFlingVelocity getmaxflingvelocity10 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getLayoutManager.write, getmaxflingvelocity4);
                    int i10 = i6 | 1;
                    int i11 = serializer + 11;
                    read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    c = 2;
                    int i12 = i11 % 2;
                    i6 = i10;
                    getmaxflingvelocity9 = getmaxflingvelocity9;
                    getmaxflingvelocity4 = getmaxflingvelocity10;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 1:
                    getmaxflingvelocity5 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getLayoutManager.write, getmaxflingvelocity5);
                    i = i6 | 2;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 2:
                    map = (Map) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), map);
                    i = i6 | 4;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 3:
                    getmaxflingvelocity6 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getLayoutManager.write, getmaxflingvelocity6);
                    int i13 = serializer + 13;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    c = 2;
                    getmaxflingvelocity9 = getmaxflingvelocity9;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    i6 |= 8;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 4:
                    getmaxflingvelocity7 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, getLayoutManager.write, getmaxflingvelocity7);
                    i2 = i6 | 16;
                    i6 = i2;
                    getmaxflingvelocity9 = getmaxflingvelocity9;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 5:
                    getmaxflingvelocity8 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getLayoutManager.write, getmaxflingvelocity8);
                    i = i6 | 32;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 6:
                    getmaxflingvelocity3 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, getLayoutManager.write, getmaxflingvelocity3);
                    i2 = i6 | 64;
                    i6 = i2;
                    getmaxflingvelocity9 = getmaxflingvelocity9;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 7:
                    getmaxflingvelocity2 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getLayoutManager.write, getmaxflingvelocity2);
                    i = i6 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 8:
                    getonflinglistener = (getOnFlingListener) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getNanoTime.read, getonflinglistener);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationX;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 9:
                    getmaxflingvelocity = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getLayoutManager.write, getmaxflingvelocity);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationY;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                case 10:
                    getmaxflingvelocity9 = (getMaxFlingVelocity) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getLayoutManager.write, getmaxflingvelocity9);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationZ;
                    i6 = i;
                    getmaxflingvelocity4 = getmaxflingvelocity4;
                    c = 2;
                    onviewdetachedfromwindowlambda1Arr = onviewdetachedfromwindowlambda1Arr;
                    z = z2;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getMinFlingVelocity(i6, getmaxflingvelocity4, getmaxflingvelocity5, map, getmaxflingvelocity6, getmaxflingvelocity7, getmaxflingvelocity8, getmaxflingvelocity3, getmaxflingvelocity2, getonflinglistener, getmaxflingvelocity, getmaxflingvelocity9);
    }
}
