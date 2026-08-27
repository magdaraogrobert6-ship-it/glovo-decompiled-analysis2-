package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getRegistrationDataProviderandroid_sdk_base_releaseannotations implements getInAppMessageManager {
    public static final getRegistrationDataProviderandroid_sdk_base_releaseannotations IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        getRegistrationDataProviderandroid_sdk_base_releaseannotations getregistrationdataproviderandroid_sdk_base_releaseannotations = new getRegistrationDataProviderandroid_sdk_base_releaseannotations();
        IconCompatParcelizer = getregistrationdataproviderandroid_sdk_base_releaseannotations;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.startworking.data.stopworking.entity.CourierAvailabilityRequest", getregistrationdataproviderandroid_sdk_base_releaseannotations, 6);
        oncloseactionlambda1.read("available", false);
        oncloseactionlambda1.read("national_id", true);
        oncloseactionlambda1.read("temperature", true);
        oncloseactionlambda1.read("vehicle", true);
        oncloseactionlambda1.read("location", true);
        oncloseactionlambda1.read("contract_type", true);
        descriptor = oncloseactionlambda1;
        int i = read + 121;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 101;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(isDelayedInitializationEnabled.serializer), LazyKt__LazyJVMKt.read(handleInAppMessageTestPushlambda0.IconCompatParcelizer), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
        int i4 = write + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getUdmandroid_sdk_base_releaseannotations getudmandroid_sdk_base_releaseannotations = (getUdmandroid_sdk_base_releaseannotations) obj;
        getudmandroid_sdk_base_releaseannotations.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        boolean z = getudmandroid_sdk_base_releaseannotations.available;
        String str = getudmandroid_sdk_base_releaseannotations.contractType;
        handleInAppMessageTestPushlambda1 handleinappmessagetestpushlambda1 = getudmandroid_sdk_base_releaseannotations.location;
        isEphemeralEventKeylambda0 isephemeraleventkeylambda0 = getudmandroid_sdk_base_releaseannotations.vehicle;
        Double d = getudmandroid_sdk_base_releaseannotations.temperature;
        String str2 = getudmandroid_sdk_base_releaseannotations.nationalId;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, z);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || d != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || isephemeraleventkeylambda0 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, isDelayedInitializationEnabled.serializer, isephemeraleventkeylambda0);
            int i4 = RemoteActionCompatParcelizer + 31;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || handleinappmessagetestpushlambda1 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, handleInAppMessageTestPushlambda0.IconCompatParcelizer, handleinappmessagetestpushlambda1);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        Double d = null;
        isEphemeralEventKeylambda0 isephemeraleventkeylambda0 = null;
        handleInAppMessageTestPushlambda1 handleinappmessagetestpushlambda1 = null;
        String str2 = null;
        int i4 = 0;
        boolean zWrite = false;
        boolean z = true;
        while (z) {
            int i5 = RemoteActionCompatParcelizer + 27;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i7) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                    break;
                case 1:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i4 |= 2;
                    break;
                case 2:
                    d = (Double) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
                    i4 |= 4;
                    break;
                case 3:
                    isephemeraleventkeylambda0 = (isEphemeralEventKeylambda0) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, isDelayedInitializationEnabled.serializer, isephemeraleventkeylambda0);
                    i4 |= 8;
                    break;
                case 4:
                    handleinappmessagetestpushlambda1 = (handleInAppMessageTestPushlambda1) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, handleInAppMessageTestPushlambda0.IconCompatParcelizer, handleinappmessagetestpushlambda1);
                    i4 |= 16;
                    break;
                case 5:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i4 |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getUdmandroid_sdk_base_releaseannotations(i4, zWrite, str, d, isephemeraleventkeylambda0, handleinappmessagetestpushlambda1, str2);
    }
}
