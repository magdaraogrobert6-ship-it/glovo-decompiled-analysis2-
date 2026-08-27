package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PreferencesProtoPreferenceMap implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final PreferencesProtoPreferenceMap serializer;
    private static int write;

    static {
        PreferencesProtoPreferenceMap preferencesProtoPreferenceMap = new PreferencesProtoPreferenceMap();
        serializer = preferencesProtoPreferenceMap;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItem", preferencesProtoPreferenceMap, 2);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("detail", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = read + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[5];
            setgraphicmodalmaxwidthdpArr[0] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[0] = SharedPreferencesMigration3.RemoteActionCompatParcelizer;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, SharedPreferencesMigration3.RemoteActionCompatParcelizer};
        }
        int i3 = write + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getNumber getnumber = (getNumber) obj;
        getnumber.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getnumber.name);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, SharedPreferencesMigration3.RemoteActionCompatParcelizer, getnumber.detail);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0035 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        shouldMigrate shouldmigrate = null;
        int i4 = 0;
        boolean z = true;
        while (!(!z)) {
            int i5 = write + 125;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i6 = 10 / 0;
                if (i == -1) {
                    int i7 = write + 21;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    z = false;
                } else if (i != 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                } else {
                    if (i == 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        i2 = write + 89;
                        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    shouldmigrate = (shouldMigrate) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, SharedPreferencesMigration3.RemoteActionCompatParcelizer, shouldmigrate);
                    i4 |= 2;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    int i9 = write + 21;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z = false;
                } else if (i != 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                } else {
                    if (i == 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        i2 = write + 89;
                        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    shouldmigrate = (shouldMigrate) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, SharedPreferencesMigration3.RemoteActionCompatParcelizer, shouldmigrate);
                    i4 |= 2;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getNumber(i4, strMediaMetadataCompat, shouldmigrate);
    }
}
