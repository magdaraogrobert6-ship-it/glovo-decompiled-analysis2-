package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class recordAnimationInfoIfBouncedHiddenView implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    public static final recordAnimationInfoIfBouncedHiddenView serializer;
    private static int write;

    static {
        recordAnimationInfoIfBouncedHiddenView recordanimationinfoifbouncedhiddenview = new recordAnimationInfoIfBouncedHiddenView();
        serializer = recordanimationinfoifbouncedhiddenview;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("animation", recordanimationinfoifbouncedhiddenview, 4);
        oncloseactionlambda1.read("source", false);
        oncloseactionlambda1.read("highlights", false);
        oncloseactionlambda1.read("contentScale", true);
        oncloseactionlambda1.read("weight", true);
        oncloseactionlambda1.serializer(new setRecycledViewPool("component"));
        descriptor = oncloseactionlambda1;
        int i = read + 113;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = onPointerUp.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(onClickedlambda0.serializer)};
        int i4 = write + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onPointerUp onpointerup = (onPointerUp) obj;
        onpointerup.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = onPointerUp.$childSerializers;
        String str = onpointerup.source;
        Float f = onpointerup.weight;
        String str2 = onpointerup.contentScale;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), onpointerup.highlights);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (f != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = RemoteActionCompatParcelizer + 125;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
        int i6 = RemoteActionCompatParcelizer + 73;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0047 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = onPointerUp.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = 0;
        boolean z = true;
        String strMediaMetadataCompat = null;
        List list = null;
        String str = null;
        Float f = null;
        while (z) {
            int i3 = RemoteActionCompatParcelizer + 3;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = RemoteActionCompatParcelizer;
                int i7 = i6 + 55;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 29 / 0;
                    if (i5 != 0) {
                        int i9 = i6 + 89;
                        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        if (i5 != 1) {
                            int i11 = i6 + 61;
                            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            if (i5 != 2) {
                                str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                                i2 |= 4;
                            } else {
                                if (i5 == 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                    return null;
                                }
                                f = (Float) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
                                i2 |= 8;
                            }
                        } else {
                            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                            i2 |= 2;
                            int i13 = write + 49;
                            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                        }
                    } else {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i2 |= 1;
                    }
                } else if (i5 != 0) {
                    int i15 = i6 + 89;
                    write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (i5 != 1) {
                        int i17 = i6 + 61;
                        write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        if (i5 != 2) {
                            str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                            i2 |= 4;
                        } else {
                            if (i5 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                return null;
                            }
                            f = (Float) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, onClickedlambda0.serializer, f);
                            i2 |= 8;
                        }
                    } else {
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 |= 2;
                        int i19 = write + 49;
                        RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new onPointerUp(i2, strMediaMetadataCompat, list, str, f);
    }
}
