package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class newInstance implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final newInstance read;
    private static int serializer = 1;
    private static int write;

    static {
        newInstance newinstance = new newInstance();
        read = newinstance;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.home.nest.api.data.RiderStateSummaryData", newinstance, 4);
        oncloseactionlambda1.read("description", true);
        oncloseactionlambda1.read("action", true);
        oncloseactionlambda1.read("buttons", true);
        oncloseactionlambda1.read("variant", true);
        descriptor = oncloseactionlambda1;
        int i = write + 103;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 62 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i2 + 7;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(optimizedPathFor.write), LazyKt__LazyJVMKt.read(makeDexElements.IconCompatParcelizer), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) MultiDexV14JBMR11ElementConstructor.$childSerializers[2].MediaSessionCompatResultReceiverWrapper()), LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer)};
        int i4 = serializer + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[DONT_INVERT] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        MultiDexV14JBMR11ElementConstructor multiDexV14JBMR11ElementConstructor = (MultiDexV14JBMR11ElementConstructor) obj;
        multiDexV14JBMR11ElementConstructor.getClass();
        String str = multiDexV14JBMR11ElementConstructor.variant;
        List list = multiDexV14JBMR11ElementConstructor.buttons;
        mkdirChecked mkdirchecked = multiDexV14JBMR11ElementConstructor.action;
        MultiDexV14ICSElementConstructor multiDexV14ICSElementConstructor = multiDexV14JBMR11ElementConstructor.description;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = MultiDexV14JBMR11ElementConstructor.$childSerializers;
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (multiDexV14ICSElementConstructor != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || mkdirchecked != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, makeDexElements.IconCompatParcelizer, mkdirchecked);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (str != null) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i2 = serializer + 23;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            int i4 = serializer + 49;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i6 = serializer + 23;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = serializer + 25;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, optimizedPathFor.write, multiDexV14ICSElementConstructor);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, makeDexElements.IconCompatParcelizer, mkdirchecked);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, makeDexElements.IconCompatParcelizer, mkdirchecked);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i10 = serializer + 23;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        int i12 = serializer + 49;
        IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i14 = serializer + 23;
        IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = MultiDexV14JBMR11ElementConstructor.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = 0;
        MultiDexV14ICSElementConstructor multiDexV14ICSElementConstructor = null;
        mkdirChecked mkdirchecked = null;
        List list = null;
        String str = null;
        int i4 = 0;
        int i5 = 1;
        while (i5 != 0) {
            int i6 = serializer + 47;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i8 != -1) {
                int i9 = IconCompatParcelizer + 79;
                int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i10;
                if (i9 % 2 == 0) {
                    int i11 = 33 / i3;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            i = i10 + 75;
                            int i12 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            IconCompatParcelizer = i12;
                            if (i % 2 != 0 ? i8 == 2 : i8 == 3) {
                                list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                                i4 |= 4;
                            } else {
                                int i13 = i12 + 115;
                                serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                if (i8 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i8);
                                    return null;
                                }
                                str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                                i4 |= 8;
                            }
                        } else {
                            mkdirchecked = (mkdirChecked) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, makeDexElements.IconCompatParcelizer, mkdirchecked);
                            i4 |= 2;
                        }
                        i3 = 0;
                    } else {
                        multiDexV14ICSElementConstructor = (MultiDexV14ICSElementConstructor) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, optimizedPathFor.write, multiDexV14ICSElementConstructor);
                        i4 |= 1;
                        i3 = 0;
                    }
                } else if (i8 != 0) {
                    if (i8 != 1) {
                        i = i10 + 75;
                        int i15 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        IconCompatParcelizer = i15;
                        if (i % 2 != 0) {
                            list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                            i4 |= 4;
                        } else {
                            list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                            i4 |= 4;
                        }
                    } else {
                        mkdirchecked = (mkdirChecked) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, makeDexElements.IconCompatParcelizer, mkdirchecked);
                        i4 |= 2;
                    }
                    i3 = 0;
                } else {
                    multiDexV14ICSElementConstructor = (MultiDexV14ICSElementConstructor) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, optimizedPathFor.write, multiDexV14ICSElementConstructor);
                    i4 |= 1;
                    i3 = 0;
                }
            } else {
                i5 = i3;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new MultiDexV14JBMR11ElementConstructor(i4, multiDexV14ICSElementConstructor, mkdirchecked, list, str);
    }
}
