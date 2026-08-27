package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class buildParameterInfo implements getInAppMessageManager {
    public static final buildParameterInfo IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        buildParameterInfo buildparameterinfo = new buildParameterInfo();
        IconCompatParcelizer = buildparameterinfo;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem.DateValidation", buildparameterinfo, 2);
        oncloseactionlambda1.read(HttpHeaders.DATE, false);
        oncloseactionlambda1.read("format", false);
        descriptor = oncloseactionlambda1;
        int i = read + 45;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 29;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 15;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        extractFromLegacyFieldsextractedName extractfromlegacyfieldsextractedname = (extractFromLegacyFieldsextractedName) obj;
        extractfromlegacyfieldsextractedname.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, extractfromlegacyfieldsextractedname.date);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, extractfromlegacyfieldsextractedname.format);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = write + 31;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                z = false;
            } else if (i5 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i2 |= 1;
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    int i6 = write + 59;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return null;
                }
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i2 |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new extractFromLegacyFieldsextractedName(i2, strMediaMetadataCompat, strMediaMetadataCompat2);
    }
}
