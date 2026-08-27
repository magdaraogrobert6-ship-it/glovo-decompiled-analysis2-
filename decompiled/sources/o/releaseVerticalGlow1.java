package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class releaseVerticalGlow1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final releaseVerticalGlow1 read;
    private static int serializer = 1;
    private static int write;

    static {
        releaseVerticalGlow1 releaseverticalglow1 = new releaseVerticalGlow1();
        read = releaseverticalglow1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("button", releaseverticalglow1, 5);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("text", false);
        oncloseactionlambda1.read("style", false);
        oncloseactionlambda1.read("weight", true);
        oncloseactionlambda1.read("action", false);
        oncloseactionlambda1.serializer(new setRecycledViewPool("component"));
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 39;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 6 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i2 + 9;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = processDataSetCompletelyChanged.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(onClickedlambda0.serializer), onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper()};
        int i4 = write + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        processDataSetCompletelyChanged processdatasetcompletelychanged = (processDataSetCompletelyChanged) obj;
        processdatasetcompletelychanged.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = processDataSetCompletelyChanged.$childSerializers;
        String str = processdatasetcompletelychanged.id;
        Float f = processdatasetcompletelychanged.weight;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, processdatasetcompletelychanged.text);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, processdatasetcompletelychanged.style);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || f != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
            int i4 = write + 3;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), processdatasetcompletelychanged.action);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x004e A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = processDataSetCompletelyChanged.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = 0;
        int i7 = 1;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        Float f = null;
        releaseHorizontalGlow releasehorizontalglow = null;
        int i8 = 0;
        int i9 = 1;
        while (i9 != 0) {
            int i10 = serializer + 45;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i11 = 38 / 0;
                if (i == -1) {
                    i9 = i6;
                    i7 = i7;
                    i6 = i9;
                } else if (i != 0) {
                    int i12 = i7;
                    int i13 = i6;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i13);
                    i8 |= 1;
                    i7 = i12;
                    i6 = i13;
                } else if (i != i7) {
                    int i14 = serializer + 13;
                    i2 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i2;
                    int i15 = i14 % 2;
                    if (i != 2) {
                        i3 = i2 + 15;
                        int i16 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        serializer = i16;
                        if (i3 % 2 == 0 ? i == 3 : i == 2) {
                            f = (Float) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
                            i8 |= 8;
                        } else {
                            int i17 = i16 + 69;
                            write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i17 % 2 != 0) {
                                if (i != 2) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                    return null;
                                }
                                releasehorizontalglow = (releaseHorizontalGlow) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), releasehorizontalglow);
                                i8 |= 16;
                            } else {
                                if (i != 4) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                    return null;
                                }
                                releasehorizontalglow = (releaseHorizontalGlow) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), releasehorizontalglow);
                                i8 |= 16;
                            }
                        }
                    } else {
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i8 |= 4;
                    }
                    i6 = 0;
                    i7 = 1;
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i7);
                    i8 |= 2;
                    i6 = 0;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    i9 = i6;
                    i7 = i7;
                    i6 = i9;
                } else if (i != 0) {
                    int i18 = i7;
                    int i19 = i6;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i19);
                    i8 |= 1;
                    i7 = i18;
                    i6 = i19;
                } else if (i != i7) {
                    int i110 = serializer + 13;
                    i2 = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i2;
                    int i111 = i110 % 2;
                    if (i != 2) {
                        i3 = i2 + 15;
                        int i112 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        serializer = i112;
                        if (i3 % 2 == 0) {
                            f = (Float) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
                            i8 |= 8;
                        } else {
                            f = (Float) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
                            i8 |= 8;
                        }
                    } else {
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i8 |= 4;
                    }
                    i6 = 0;
                    i7 = 1;
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i7);
                    i8 |= 2;
                    i6 = 0;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new processDataSetCompletelyChanged(i8, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, f, releasehorizontalglow);
    }
}
