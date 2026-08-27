package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cutText implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    public static final cutText write;

    static {
        cutText cuttext = new cutText();
        write = cuttext;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.auth.data.entity.AuthResponse", cuttext, 17);
        oncloseactionlambda1.read("access_token", false);
        oncloseactionlambda1.read(RemoteMessageConst.DEVICE_TOKEN, false);
        oncloseactionlambda1.read("refresh_token", false);
        oncloseactionlambda1.read("expires_in", false);
        oncloseactionlambda1.read("city_id", true);
        oncloseactionlambda1.read("id_verification_locations", true);
        oncloseactionlambda1.read("contract_type", true);
        oncloseactionlambda1.read("city_name", true);
        oncloseactionlambda1.read("is_application_pending", false);
        oncloseactionlambda1.read("is_new_password_required", true);
        oncloseactionlambda1.read("user_id", true);
        oncloseactionlambda1.read("email", true);
        oncloseactionlambda1.read("name", true);
        oncloseactionlambda1.read("role", true);
        oncloseactionlambda1.read("roles", true);
        oncloseactionlambda1.read("countries", true);
        oncloseactionlambda1.read("is_rider_onboarding_eligible", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 121;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = copyTextdefault.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        onDismissed ondismissed = onDismissed.write;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(ondismissed);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper());
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, ondismissed, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3, setgraphicmodalmaxwidthdp4, getwasclosemessagecalled, LazyKt__LazyJVMKt.read(getwasclosemessagecalled), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[14].MediaSessionCompatResultReceiverWrapper()), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[15].MediaSessionCompatResultReceiverWrapper()), LazyKt__LazyJVMKt.read(getwasclosemessagecalled)};
        int i4 = IconCompatParcelizer + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copyTextdefault copytextdefault = (copyTextdefault) obj;
        copytextdefault.getClass();
        Boolean bool = copytextdefault.isRiderOnboardingEligible;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = copyTextdefault.$childSerializers;
        String str = copytextdefault.accessToken;
        List list = copytextdefault.countries;
        List list2 = copytextdefault.roles;
        String str2 = copytextdefault.role;
        String str3 = copytextdefault.name;
        String str4 = copytextdefault.email;
        String str5 = copytextdefault.userId;
        Boolean bool2 = copytextdefault.isNewPasswordRequired;
        String str6 = copytextdefault.cityName;
        String str7 = copytextdefault.contractType;
        List list3 = copytextdefault.idVerificationLocations;
        Long l = copytextdefault.cityId;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, copytextdefault.deviceToken);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, copytextdefault.refreshToken);
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, copytextdefault.expiresIn);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || l != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, onDismissed.write, l);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str7 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str6 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, copytextdefault.isApplicationPending);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool2);
            int i4 = IconCompatParcelizer + 73;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            Object[] objArr = {bool2, Boolean.FALSE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool2);
                int i6 = IconCompatParcelizer + 73;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str5 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[14].MediaSessionCompatResultReceiverWrapper(), list2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[15].MediaSessionCompatResultReceiverWrapper(), list);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || bool != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, getWasCloseMessageCalled.write, bool);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        int i5 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = copyTextdefault.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        long j = 0;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        Long l = null;
        List list = null;
        String str3 = null;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        boolean z = true;
        boolean zWrite = false;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        List list3 = null;
        Boolean bool2 = null;
        while (z) {
            int i7 = read + 113;
            long jSerializer = j;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i9) {
                case -1:
                    str4 = str4;
                    str5 = str5;
                    str6 = str6;
                    list2 = list2;
                    list3 = list3;
                    bool2 = bool2;
                    int i10 = IconCompatParcelizer + 57;
                    read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    c = 2;
                    int i11 = i10 % 2;
                    z = false;
                    str4 = str4;
                    bool2 = bool2;
                    j = jSerializer;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    break;
                case 0:
                    str4 = str4;
                    str5 = str5;
                    str6 = str6;
                    list2 = list2;
                    list3 = list3;
                    bool2 = bool2;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i6 |= 1;
                    c = 2;
                    str4 = str4;
                    bool2 = bool2;
                    j = jSerializer;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 = i6 | 2;
                    i6 = i4;
                    c = 2;
                    str4 = str4;
                    bool2 = bool2;
                    j = jSerializer;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i4 = i6 | 4;
                    i6 = i4;
                    c = 2;
                    str4 = str4;
                    bool2 = bool2;
                    j = jSerializer;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    break;
                case 3:
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i4 = i6 | 8;
                    i6 = i4;
                    c = 2;
                    str4 = str4;
                    bool2 = bool2;
                    j = jSerializer;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    break;
                case 4:
                    l = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, onDismissed.write, l);
                    i4 = i6 | 16;
                    i6 = i4;
                    c = 2;
                    str4 = str4;
                    bool2 = bool2;
                    j = jSerializer;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    break;
                case 5:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list);
                    i = i6 | 32;
                    i6 = i;
                    str4 = str4;
                    bool2 = bool2;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    j = jSerializer;
                    break;
                case 6:
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i2 = i6 | 64;
                    i6 = i2;
                    j = jSerializer;
                    break;
                case 7:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i2 = i6 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i6 = i2;
                    j = jSerializer;
                    break;
                case 8:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationX;
                    j = jSerializer;
                    break;
                case 9:
                    bool = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool);
                    i = i6 | androidx.compose.ui.graphics.Fields.RotationY;
                    i6 = i;
                    str4 = str4;
                    bool2 = bool2;
                    list3 = list3;
                    list2 = list2;
                    str6 = str6;
                    str5 = str5;
                    j = jSerializer;
                    break;
                case 10:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i2 = i6 | androidx.compose.ui.graphics.Fields.RotationZ;
                    i6 = i2;
                    j = jSerializer;
                    break;
                case 11:
                    str5 = str5;
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    str5 = str5;
                    j = jSerializer;
                    break;
                case 12:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i6 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    str6 = str6;
                    j = jSerializer;
                    break;
                case 13:
                    str6 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
                    i6 |= 8192;
                    list2 = list2;
                    j = jSerializer;
                    break;
                case 14:
                    list2 = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[14].MediaSessionCompatResultReceiverWrapper(), list2);
                    i6 |= androidx.compose.ui.graphics.Fields.Clip;
                    list3 = list3;
                    j = jSerializer;
                    break;
                case 15:
                    list3 = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 15, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[15].MediaSessionCompatResultReceiverWrapper(), list3);
                    i3 = androidx.compose.ui.graphics.Fields.CompositingStrategy;
                    bool2 = bool2;
                    i2 = i3 | i6;
                    i6 = i2;
                    j = jSerializer;
                    break;
                case 16:
                    bool2 = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 16, getWasCloseMessageCalled.write, bool2);
                    i3 = 65536;
                    i2 = i3 | i6;
                    i6 = i2;
                    j = jSerializer;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new copyTextdefault(i6, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, j, l, list, str3, str2, zWrite, bool, str, str4, str5, str6, list2, list3, bool2);
    }
}
