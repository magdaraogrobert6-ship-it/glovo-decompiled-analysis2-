package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class toLowerCasedefault implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final toLowerCasedefault write;

    static {
        toLowerCasedefault tolowercasedefault = new toLowerCasedefault();
        write = tolowercasedefault;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse", tolowercasedefault, 12);
        oncloseactionlambda1.read("release_id", false);
        oncloseactionlambda1.read("response_hash", false);
        oncloseactionlambda1.read(HiAnalyticsConstant.BI_KEY_APP_ID, false);
        oncloseactionlambda1.read("version", false);
        oncloseactionlambda1.read("modules", false);
        oncloseactionlambda1.read("sizes", false);
        oncloseactionlambda1.read("critical_content_artifact_list", false);
        oncloseactionlambda1.read("generated_at", false);
        oncloseactionlambda1.read("assets_cdn_prefix", true);
        oncloseactionlambda1.read("routes", true);
        oncloseactionlambda1.read("routes_with_ssg", true);
        oncloseactionlambda1.read("bypass_url_patterns", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 69;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 91 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i3 + 33;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = toLowerCase.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), toUpperCaselambda0.read, onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper()};
        int i4 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:23:0x012a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0096  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        toLowerCase tolowercase = (toLowerCase) obj;
        tolowercase.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = toLowerCase.$childSerializers;
        String str = tolowercase.releaseId;
        List list = tolowercase.bypassUrlPatterns;
        List list2 = tolowercase.routesWithSsg;
        List list3 = tolowercase.routes;
        String str2 = tolowercase.assetsCdnPrefix;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, tolowercase.responseHash);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, tolowercase.appId);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, tolowercase.version);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), tolowercase.modules);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, toUpperCaselambda0.read, tolowercase.sizes);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), tolowercase.criticalContentArtifactList);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, tolowercase.generatedAt);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, str2);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, ""}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, str2);
            }
        }
        boolean z = defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (!z) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list3, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list2, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
                }
                if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
                        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
                    }
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            int i4 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list2);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i6 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list3);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list2, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i8 = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0Var}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        boolean z;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = toLowerCase.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z2 = true;
        boolean z3 = true;
        List list = null;
        List list2 = null;
        int i6 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        List list3 = null;
        toUpperCasedefault touppercasedefault = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        List list4 = null;
        List list5 = null;
        while (z3 == z2) {
            int i7 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % i2;
            int i9 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i9) {
                case -1:
                    i = i2;
                    z = true;
                    list = list;
                    z3 = false;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 0:
                    i = i2;
                    z = true;
                    list = list;
                    i6 |= 1;
                    z3 = z3;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    list4 = list4;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 1:
                    i = i2;
                    list = list;
                    i6 |= 2;
                    z3 = z3;
                    z = true;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 2:
                    i = i2;
                    list = list;
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
                    i6 |= 4;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 3:
                    list = list;
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i6 |= 8;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 4:
                    list = list;
                    list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list3);
                    i6 |= 16;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 5:
                    list = list;
                    touppercasedefault = (toUpperCasedefault) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, toUpperCaselambda0.read, touppercasedefault);
                    i6 |= 32;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 6:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), list2);
                    i6 |= 64;
                    list4 = list4;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 7:
                    list = list;
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i6 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 8:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationX;
                    int i10 = RemoteActionCompatParcelizer + 27;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    list4 = list4;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 9:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationY;
                    i = 2;
                    z = true;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 10:
                    list5 = list5;
                    list4 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list4);
                    i6 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    i = i2;
                    z3 = z3;
                    z = true;
                    list = list;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                case 11:
                    list5 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list5);
                    i6 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    i = i2;
                    z3 = z3;
                    z = true;
                    list = list;
                    list = list;
                    z3 = z3;
                    i2 = i;
                    z2 = z;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i9);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new toLowerCase(i6, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, list3, touppercasedefault, list2, strMediaMetadataCompat5, strMediaMetadataCompat6, list, list4, list5);
    }
}
