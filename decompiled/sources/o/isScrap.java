package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isScrap implements getInAppMessageManager {
    public static final isScrap IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        isScrap isscrap = new isScrap();
        IconCompatParcelizer = isscrap;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.instant.shifts.data.entity.InstantShiftResponse", isscrap, 5);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("started_at", false);
        oncloseactionlambda1.read("ended_at", false);
        oncloseactionlambda1.read("can_work_now", false);
        oncloseactionlambda1.read("zone", false);
        descriptor = oncloseactionlambda1;
        int i = write + 11;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 65;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {afterClosed.IconCompatParcelizer, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, offsetPosition.IconCompatParcelizer};
        int i4 = read + 55;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isRemoved isremoved = (isRemoved) obj;
        isremoved.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, isremoved.id, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, isremoved.startedAt);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, isremoved.endedAt);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, isremoved.canWorkNow);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, offsetPosition.IconCompatParcelizer, isremoved.zone);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x004f A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4;
        isInvalid isinvalid;
        int i5;
        int i6 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i7 = 0;
        int i8 = 1;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        isInvalid isinvalid2 = null;
        int i9 = 0;
        int iIconCompatParcelizer = 0;
        boolean zWrite = false;
        int i10 = 1;
        while (i10 == i8) {
            int i11 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i11 != -1) {
                int i12 = read + 47;
                int i13 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i13;
                if (i12 % 2 != 0) {
                    int i14 = 82 / i7;
                    if (i11 != 0) {
                        int i15 = i13 + 125;
                        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        if (i11 != i8) {
                            int i17 = i13 + 33;
                            read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            if (i11 != 2) {
                                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                                i9 |= 4;
                            } else if (i11 != 3) {
                                i3 = i13 + 95;
                                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i3 % 2 == 0) {
                                    if (i11 != 3) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i11);
                                        return null;
                                    }
                                    i4 = i13 + 45;
                                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i4 % 2 == 0) {
                                        isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, offsetPosition.IconCompatParcelizer, isinvalid2);
                                        i5 = i9 | 22;
                                    } else {
                                        isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, offsetPosition.IconCompatParcelizer, isinvalid2);
                                        i5 = i9 | 16;
                                    }
                                    isinvalid2 = isinvalid;
                                    i9 = i5;
                                } else {
                                    if (i11 != 4) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i11);
                                        return null;
                                    }
                                    i4 = i13 + 45;
                                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i4 % 2 == 0) {
                                        isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, offsetPosition.IconCompatParcelizer, isinvalid2);
                                        i5 = i9 | 22;
                                    } else {
                                        isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, offsetPosition.IconCompatParcelizer, isinvalid2);
                                        i5 = i9 | 16;
                                    }
                                    isinvalid2 = isinvalid;
                                    i9 = i5;
                                }
                            } else {
                                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                                i9 |= 8;
                            }
                            i7 = 0;
                            i8 = 1;
                        } else {
                            int i19 = i8;
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i19);
                            i9 |= 2;
                            i8 = i19;
                            i7 = 0;
                        }
                    } else {
                        int i20 = i8;
                        i2 = i7;
                        i = i20;
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i9 |= 1;
                        int i21 = i2;
                        i8 = i;
                        i7 = i21;
                    }
                } else if (i11 != 0) {
                    int i110 = i13 + 125;
                    read = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    if (i11 != i8) {
                        int i112 = i13 + 33;
                        read = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                        if (i11 != 2) {
                            strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i9 |= 4;
                        } else if (i11 != 3) {
                            i3 = i13 + 95;
                            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                if (i11 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i11);
                                    return null;
                                }
                                i4 = i13 + 45;
                                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, offsetPosition.IconCompatParcelizer, isinvalid2);
                                    i5 = i9 | 22;
                                } else {
                                    isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, offsetPosition.IconCompatParcelizer, isinvalid2);
                                    i5 = i9 | 16;
                                }
                                isinvalid2 = isinvalid;
                                i9 = i5;
                            } else {
                                if (i11 != 4) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i11);
                                    return null;
                                }
                                i4 = i13 + 45;
                                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, offsetPosition.IconCompatParcelizer, isinvalid2);
                                    i5 = i9 | 22;
                                } else {
                                    isinvalid = (isInvalid) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, offsetPosition.IconCompatParcelizer, isinvalid2);
                                    i5 = i9 | 16;
                                }
                                isinvalid2 = isinvalid;
                                i9 = i5;
                            }
                        } else {
                            zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i9 |= 8;
                        }
                        i7 = 0;
                        i8 = 1;
                    } else {
                        int i114 = i8;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i114);
                        i9 |= 2;
                        i8 = i114;
                        i7 = 0;
                    }
                } else {
                    i = i8;
                    i2 = 0;
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                    i9 |= 1;
                    int i22 = i2;
                    i8 = i;
                    i7 = i22;
                }
            } else {
                i10 = i7;
                i8 = i8;
                i7 = i10;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new isRemoved(i9, iIconCompatParcelizer, strMediaMetadataCompat, strMediaMetadataCompat2, zWrite, isinvalid2);
    }
}
