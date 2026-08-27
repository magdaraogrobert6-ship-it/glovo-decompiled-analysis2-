package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accesssetBringIntoViewRequesterp implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final accesssetBringIntoViewRequesterp write;

    static {
        accesssetBringIntoViewRequesterp accesssetbringintoviewrequesterp = new accesssetBringIntoViewRequesterp();
        write = accesssetbringintoviewrequesterp;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("guidance", accesssetbringintoviewrequesterp, 4);
        oncloseactionlambda1.read("pictures", false);
        oncloseactionlambda1.read("total_pictures", false);
        oncloseactionlambda1.read("geofence", true);
        oncloseactionlambda1.read("components", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = accessinsetToLayoutPosition.$childSerializers;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), afterClosed.IconCompatParcelizer, LazyKt__LazyJVMKt.read(insetBounds.write), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 91;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessinsetToLayoutPosition accessinsettolayoutposition = (accessinsetToLayoutPosition) obj;
        accessinsettolayoutposition.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = accessinsetToLayoutPosition.$childSerializers;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper();
        List list = accessinsettolayoutposition.pictures;
        List list2 = accessinsettolayoutposition.components;
        accesssetDrawingp accesssetdrawingp = accessinsettolayoutposition.geofence;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdp, list);
        defaultInAppMessageSlideupViewFactorySerializer.write(1, accessinsettolayoutposition.totalPictures, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || accesssetdrawingp != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, insetBounds.write, accesssetdrawingp);
            int i4 = read + 81;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
        } else {
            Object[] objArr = {list2, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0054 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        boolean z;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = read + 37;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = accessinsetToLayoutPosition.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            z = false;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = accessinsetToLayoutPosition.$childSerializers;
            createinappmessageviewlambda1Serializer.getClass();
            z = true;
        }
        List list = null;
        accesssetDrawingp accesssetdrawingp = null;
        List list2 = null;
        int i5 = 0;
        int iIconCompatParcelizer = 0;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 != -1) {
                int i7 = read + 65;
                int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i8;
                int i9 = i7 % 2;
                if (i6 != 0) {
                    int i10 = i8 + 95;
                    int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i11;
                    if (i10 % 2 != 0) {
                        if (i6 == 1) {
                            iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i5 |= 2;
                        } else if (i6 != 2) {
                            i = i11 + 9;
                            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            serializer = i2;
                            if (i % 2 == 0) {
                                if (i6 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                    return null;
                                }
                                int i12 = i2 + 93;
                                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
                                i5 |= 8;
                            } else {
                                if (i6 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                    return null;
                                }
                                int i14 = i2 + 93;
                                read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
                                i5 |= 8;
                            }
                        } else {
                            accesssetdrawingp = (accesssetDrawingp) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, insetBounds.write, accesssetdrawingp);
                            i5 |= 4;
                        }
                    } else if (i6 == 1) {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                    } else if (i6 != 2) {
                        i = i11 + 9;
                        i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        serializer = i2;
                        if (i % 2 == 0) {
                            if (i6 != 5) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            int i16 = i2 + 93;
                            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
                            i5 |= 8;
                        } else {
                            if (i6 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                                return null;
                            }
                            int i18 = i2 + 93;
                            read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
                            i5 |= 8;
                        }
                    } else {
                        accesssetdrawingp = (accesssetDrawingp) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, insetBounds.write, accesssetdrawingp);
                        i5 |= 4;
                    }
                } else {
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                    i5 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new accessinsetToLayoutPosition(i5, list, iIconCompatParcelizer, accesssetdrawingp, list2);
    }
}
