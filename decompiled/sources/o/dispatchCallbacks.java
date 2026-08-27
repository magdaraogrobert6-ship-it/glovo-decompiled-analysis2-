package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dispatchCallbacks implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final dispatchCallbacks serializer;
    private static int write = 1;

    static {
        dispatchCallbacks dispatchcallbacks = new dispatchCallbacks();
        serializer = dispatchcallbacks;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.custom.password.data.model.CustomPasswordRequest", dispatchcallbacks, 4);
        oncloseactionlambda1.read("user_id", false);
        oncloseactionlambda1.read("current_password", true);
        oncloseactionlambda1.read("new_password", false);
        oncloseactionlambda1.read("is_magic_link", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 50 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 83;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, getWasCloseMessageCalled.write};
        }
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed2);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[1] = setgraphicmodalmaxwidthdp;
        setgraphicmodalmaxwidthdpArr[2] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[4] = getWasCloseMessageCalled.write;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        insertOrUpdateTransformedNode insertorupdatetransformednode = (insertOrUpdateTransformedNode) obj;
        insertorupdatetransformednode.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = insertorupdatetransformednode.userId;
        String str2 = insertorupdatetransformednode.oldPassword;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            int i4 = IconCompatParcelizer + 101;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, insertorupdatetransformednode.password);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, insertorupdatetransformednode.isMagicLink);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i6 = IconCompatParcelizer + 21;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0046 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean zWrite;
        int i5 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = IconCompatParcelizer + 79;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        String strMediaMetadataCompat = null;
        String str = null;
        String strMediaMetadataCompat2 = null;
        int i8 = 0;
        boolean z = false;
        boolean z2 = true;
        while (z2) {
            int i9 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i9 != -1) {
                int i10 = IconCompatParcelizer;
                int i11 = i10 + 31;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 43 / 0;
                    if (i9 != 0) {
                        int i13 = i10 + 63;
                        i = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        write = i;
                        int i14 = i13 % 2;
                        if (i9 != 1) {
                            str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                            i8 |= 2;
                            int i15 = write + 107;
                            IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                        } else if (i9 != 2) {
                            i2 = i + 111;
                            i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            IconCompatParcelizer = i3;
                            if (i2 % 2 != 0) {
                                if (i9 != 2) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                                    return null;
                                }
                                i4 = i3 + 49;
                                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                                    i8 |= 18;
                                } else {
                                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                    i8 |= 8;
                                }
                                z = zWrite;
                            } else {
                                if (i9 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                                    return null;
                                }
                                i4 = i3 + 49;
                                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                                    i8 |= 18;
                                } else {
                                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                    i8 |= 8;
                                }
                                z = zWrite;
                            }
                        } else {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i8 |= 4;
                        }
                    } else {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i8 |= 1;
                    }
                } else if (i9 != 0) {
                    int i17 = i10 + 63;
                    i = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i;
                    int i18 = i17 % 2;
                    if (i9 != 1) {
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i8 |= 2;
                        int i19 = write + 107;
                        IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    } else if (i9 != 2) {
                        i2 = i + 111;
                        i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        IconCompatParcelizer = i3;
                        if (i2 % 2 != 0) {
                            if (i9 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                                return null;
                            }
                            i4 = i3 + 49;
                            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                                i8 |= 18;
                            } else {
                                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i8 |= 8;
                            }
                            z = zWrite;
                        } else {
                            if (i9 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                                return null;
                            }
                            i4 = i3 + 49;
                            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                                i8 |= 18;
                            } else {
                                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i8 |= 8;
                            }
                            z = zWrite;
                        }
                    } else {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i8 |= 4;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i8 |= 1;
                }
            } else {
                z2 = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new insertOrUpdateTransformedNode(i8, strMediaMetadataCompat, str, strMediaMetadataCompat2, z);
    }
}
