package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getStatusBarBackgroundDrawable implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final getStatusBarBackgroundDrawable serializer;
    private static int write = 1;

    static {
        getStatusBarBackgroundDrawable getstatusbarbackgrounddrawable = new getStatusBarBackgroundDrawable();
        serializer = getstatusbarbackgrounddrawable;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage.Payload", getstatusbarbackgrounddrawable, 4);
        oncloseactionlambda1.read("e2eTotalDurationMs", false);
        oncloseactionlambda1.read("isPreRendered", false);
        oncloseactionlambda1.read("breakdown", false);
        oncloseactionlambda1.read("timestamps", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 71;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 103;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{afterClosed.IconCompatParcelizer, getWasCloseMessageCalled.write, getDrawerElevation.RemoteActionCompatParcelizer, setDrawerElevation.IconCompatParcelizer};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
        setgraphicmodalmaxwidthdpArr[1] = afterClosed.IconCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[1] = getWasCloseMessageCalled.write;
        setgraphicmodalmaxwidthdpArr[3] = getDrawerElevation.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[2] = setDrawerElevation.IconCompatParcelizer;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setDrawerViewOffset setdrawerviewoffset = (setDrawerViewOffset) obj;
        setdrawerviewoffset.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, setdrawerviewoffset.e2eTotalDurationMs, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setdrawerviewoffset.isPreRendered);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getDrawerElevation.RemoteActionCompatParcelizer, setdrawerviewoffset.breakdown);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, setDrawerElevation.IconCompatParcelizer, setdrawerviewoffset.timestamps);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        isPackable ispackable;
        setDrawerListener setdrawerlistener;
        int i;
        int iIconCompatParcelizer;
        boolean zWrite;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = read + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            ispackable = null;
            setdrawerlistener = null;
            z = false;
            i = 1;
            iIconCompatParcelizer = 1;
            zWrite = true;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            ispackable = null;
            setdrawerlistener = null;
            i = 0;
            iIconCompatParcelizer = 0;
            zWrite = false;
            z = true;
        }
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                z = false;
            } else if (i5 != 0) {
                int i6 = RemoteActionCompatParcelizer + 123;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i7;
                if (i6 % 2 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            int i8 = i7 + 119;
                            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            if (i5 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                return null;
                            }
                            setdrawerlistener = (setDrawerListener) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, setDrawerElevation.IconCompatParcelizer, setdrawerlistener);
                            i |= 8;
                            i2 = read + 47;
                        } else {
                            ispackable = (isPackable) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getDrawerElevation.RemoteActionCompatParcelizer, ispackable);
                            i |= 4;
                            i2 = read + 19;
                        }
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i2 % 2;
                    } else {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i |= 2;
                    }
                } else if (i5 != 1) {
                    if (i5 != 2) {
                        int i11 = i7 + 119;
                        RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        if (i5 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        setdrawerlistener = (setDrawerListener) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, setDrawerElevation.IconCompatParcelizer, setdrawerlistener);
                        i |= 8;
                        i2 = read + 47;
                    } else {
                        ispackable = (isPackable) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getDrawerElevation.RemoteActionCompatParcelizer, ispackable);
                        i |= 4;
                        i2 = read + 19;
                    }
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i2 % 2;
                } else {
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i |= 2;
                }
            } else {
                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new setDrawerViewOffset(i, iIconCompatParcelizer, zWrite, ispackable, setdrawerlistener);
    }
}
