package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fitPrioritizingWidthZbe2FdA implements getInAppMessageManager {
    public static final fitPrioritizingWidthZbe2FdA IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        fitPrioritizingWidthZbe2FdA fitprioritizingwidthzbe2fda = new fitPrioritizingWidthZbe2FdA();
        IconCompatParcelizer = fitprioritizingwidthzbe2fda;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.TaskState", fitprioritizingwidthzbe2fda, 4);
        oncloseactionlambda1.read("componentStatus", true);
        oncloseactionlambda1.read("firstOpenedTimeStamp", true);
        oncloseactionlambda1.read("timerStartingTimeStamp", true);
        oncloseactionlambda1.read("timerEndingTimeStamp", true);
        descriptor = oncloseactionlambda1;
        int i = write + 39;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onDismissed ondismissed = onDismissed.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {fixedHeightOenEA2s.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(ondismissed), LazyKt__LazyJVMKt.read(ondismissed), LazyKt__LazyJVMKt.read(ondismissed)};
        int i4 = read + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x006b  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        fixedHeightOenEA2s fixedheightoenea2s = (fixedHeightOenEA2s) obj;
        fixedheightoenea2s.getClass();
        Long l = fixedheightoenea2s.timerEndingTimeStamp;
        Long l2 = fixedheightoenea2s.timerStartingTimeStamp;
        Long l3 = fixedheightoenea2s.firstOpenedTimeStamp;
        Map map = fixedheightoenea2s.componentStatus;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = fixedHeightOenEA2s.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), map);
            i = serializer + 71;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i5 = 4 % 5;
            }
        } else {
            Object[] objArr = {map, SimpleItemTouchHelperCallback.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), map);
                i = serializer + 71;
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i6 = 4 % 5;
                }
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || l3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onDismissed.write, l3);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (l2 != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (l != null) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            } else {
                int i7 = serializer + 111;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onDismissed.write, l);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i9 = read + 17;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, onDismissed.write, l2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (l != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i11 = serializer + 111;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onDismissed.write, l);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x004f A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 41;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = fixedHeightOenEA2s.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        Map map = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        boolean z = true;
        int i5 = 0;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 != -1) {
                int i7 = read;
                int i8 = i7 + 107;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i6 != 0) {
                    int i10 = i7 + 31;
                    int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    serializer = i11;
                    if (i10 % 2 != 0) {
                        if (i6 == 1) {
                            l = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onDismissed.write, l);
                            i5 |= 2;
                        } else if (i6 != 2) {
                            l2 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, onDismissed.write, l2);
                            i5 |= 4;
                        } else {
                            if (i6 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            i = i11 + 25;
                            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                l3 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, onDismissed.write, l3);
                                i5 = 31;
                            } else {
                                l3 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onDismissed.write, l3);
                                i5 |= 8;
                            }
                        }
                    } else if (i6 == 1) {
                        l = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onDismissed.write, l);
                        i5 |= 2;
                    } else if (i6 != 2) {
                        l2 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, onDismissed.write, l2);
                        i5 |= 4;
                    } else {
                        if (i6 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                            return null;
                        }
                        i = i11 + 25;
                        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            l3 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, onDismissed.write, l3);
                            i5 = 31;
                        } else {
                            l3 = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onDismissed.write, l3);
                            i5 |= 8;
                        }
                    }
                } else {
                    map = (Map) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), map);
                    i5 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new fixedHeightOenEA2s(i5, map, l, l2, l3);
    }
}
