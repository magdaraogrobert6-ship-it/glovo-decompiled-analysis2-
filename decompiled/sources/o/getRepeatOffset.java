package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getRepeatOffset implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final getRepeatOffset read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        getRepeatOffset getrepeatoffset = new getRepeatOffset();
        read = getrepeatoffset;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem.ScanState.MoveCloser", getrepeatoffset, 1);
        oncloseactionlambda1.read("message", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 113;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{union.RemoteActionCompatParcelizer};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[1];
        setgraphicmodalmaxwidthdpArr[1] = union.RemoteActionCompatParcelizer;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLocations getlocations = (getLocations) obj;
        getlocations.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, union.RemoteActionCompatParcelizer, getlocations.message);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 113;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        mapTreeWithStitching maptreewithstitching = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 == -1) {
                z = false;
            } else {
                if (i3 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                    int i4 = write + 69;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return null;
                }
                int i6 = write + 11;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    maptreewithstitching = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, union.RemoteActionCompatParcelizer, maptreewithstitching);
                    i2 = 0;
                } else {
                    maptreewithstitching = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, union.RemoteActionCompatParcelizer, maptreewithstitching);
                    i2 = 1;
                }
                int i7 = write + 97;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        getLocations getlocations = new getLocations(i2, maptreewithstitching);
        int i9 = RemoteActionCompatParcelizer + 83;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return getlocations;
        }
        throw null;
    }
}
