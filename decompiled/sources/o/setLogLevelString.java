package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setLogLevelString implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    public static final setLogLevelString write;

    static {
        setLogLevelString setloglevelstring = new setLogLevelString();
        write = setloglevelstring;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.data.model.CourierResponse", setloglevelstring, 14);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("city", false);
        oncloseactionlambda1.read("city_id", false);
        oncloseactionlambda1.read("contract_type", false);
        oncloseactionlambda1.read("zone", false);
        oncloseactionlambda1.read("shifts", true);
        oncloseactionlambda1.read("status_until_time", true);
        oncloseactionlambda1.read("end_break_allowed", true);
        oncloseactionlambda1.read("break_is_scheduled", true);
        oncloseactionlambda1.read("can_extend_shift", true);
        oncloseactionlambda1.read("agreed_to_extend_current_shift", true);
        oncloseactionlambda1.read("starting_area", true);
        oncloseactionlambda1.read("balance_limit", true);
        descriptor = oncloseactionlambda1;
        int i = read + 35;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = lockLogLevel.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper());
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {onDismissed.write, beforeinappmessageviewclosed, beforeinappmessageviewclosed, afterClosed.IconCompatParcelizer, beforeinappmessageviewclosed, beforeinappmessageviewclosed, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, LazyKt__LazyJVMKt.read(getwasclosemessagecalled), LazyKt__LazyJVMKt.read(getwasclosemessagecalled), LazyKt__LazyJVMKt.read(getwasclosemessagecalled), LazyKt__LazyJVMKt.read(getwasclosemessagecalled), LazyKt__LazyJVMKt.read(createInstallReferrerClient.write), LazyKt__LazyJVMKt.read(Assert.write)};
        int i4 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x010f  */
    /* JADX WARN: Code duplicated, block: B:33:0x011d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0145  */
    /* JADX WARN: Code duplicated, block: B:40:0x0155  */
    /* JADX WARN: Code duplicated, block: B:43:0x0162  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c A[DONT_INVERT] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i = 2 % 2;
        lockLogLevel lockloglevel = (lockLogLevel) obj;
        lockloglevel.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = lockLogLevel.$childSerializers;
        long j = lockloglevel.id;
        GooglePlayServicesClientGooglePlayServicesInterface googlePlayServicesClientGooglePlayServicesInterface = lockloglevel.balanceLimit;
        getInstallBeginTimestampSeconds getinstallbegintimestampseconds = lockloglevel.startingArea;
        Boolean bool = lockloglevel.agreedToExtendCurrentShift;
        Boolean bool2 = lockloglevel.canExtendShift;
        Boolean bool3 = lockloglevel.isBreakScheduled;
        Boolean bool4 = lockloglevel.isEndBreakAllowed;
        String str = lockloglevel.statusEndingTime;
        List list = lockloglevel.shifts;
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, j);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, lockloglevel.status);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, lockloglevel.city);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, lockloglevel.cityId, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, lockloglevel.contractType);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, lockloglevel.zone);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), list);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getWasCloseMessageCalled.write, bool4);
            } else {
                objArr4 = new Object[]{bool4, Boolean.FALSE};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getWasCloseMessageCalled.write, bool4);
                }
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool3);
            } else {
                objArr3 = new Object[]{bool3, Boolean.FALSE};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool3);
                }
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getWasCloseMessageCalled.write, bool2);
            } else {
                objArr2 = new Object[]{bool2, Boolean.FALSE};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getWasCloseMessageCalled.write, bool2);
                }
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, getWasCloseMessageCalled.write, bool);
            } else {
                objArr = new Object[]{bool, Boolean.FALSE};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, getWasCloseMessageCalled.write, bool);
                }
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getinstallbegintimestampseconds != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, createInstallReferrerClient.write, getinstallbegintimestampseconds);
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (googlePlayServicesClientGooglePlayServicesInterface != null) {
                }
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            } else {
                int i2 = RemoteActionCompatParcelizer + 15;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, Assert.write, googlePlayServicesClientGooglePlayServicesInterface);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getWasCloseMessageCalled.write, bool4);
        } else {
            objArr4 = new Object[]{bool4, Boolean.FALSE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getWasCloseMessageCalled.write, bool4);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool3);
        } else {
            objArr3 = new Object[]{bool3, Boolean.FALSE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool3);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getWasCloseMessageCalled.write, bool2);
        } else {
            objArr2 = new Object[]{bool2, Boolean.FALSE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getWasCloseMessageCalled.write, bool2);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, getWasCloseMessageCalled.write, bool);
        } else {
            objArr = new Object[]{bool, Boolean.FALSE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, getWasCloseMessageCalled.write, bool);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, createInstallReferrerClient.write, getinstallbegintimestampseconds);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, createInstallReferrerClient.write, getinstallbegintimestampseconds);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (googlePlayServicesClientGooglePlayServicesInterface != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i6 = RemoteActionCompatParcelizer + 15;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, Assert.write, googlePlayServicesClientGooglePlayServicesInterface);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = lockLogLevel.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        long jSerializer = 0;
        Boolean bool = null;
        List list = null;
        String str = null;
        Boolean bool2 = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        int iIconCompatParcelizer = 0;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        boolean z = true;
        Boolean bool3 = null;
        Boolean bool4 = null;
        getInstallBeginTimestampSeconds getinstallbegintimestampseconds = null;
        GooglePlayServicesClientGooglePlayServicesInterface googlePlayServicesClientGooglePlayServicesInterface = null;
        while (!(!z)) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    z = false;
                    int i7 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i8 = i7 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 0:
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    int i9 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i10 = i9 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    i = 2;
                    break;
                case 2:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
                    i5 |= 4;
                    i = 2;
                    break;
                case 3:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i5 |= 8;
                    i = 2;
                    break;
                case 4:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i5 |= 16;
                    bool = bool;
                    getinstallbegintimestampseconds = getinstallbegintimestampseconds;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    i = 2;
                    break;
                case 5:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i5 |= 32;
                    bool = bool;
                    getinstallbegintimestampseconds = getinstallbegintimestampseconds;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    i = 2;
                    break;
                case 6:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), list);
                    i5 |= 64;
                    getinstallbegintimestampseconds = getinstallbegintimestampseconds;
                    int i11 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i12 = i11 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 7:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i5 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    getinstallbegintimestampseconds = getinstallbegintimestampseconds;
                    int i13 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i14 = i13 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 8:
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    bool2 = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, getWasCloseMessageCalled.write, bool2);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationX;
                    int i15 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i16 = i15 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 9:
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    Boolean bool5 = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getWasCloseMessageCalled.write, bool);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationY;
                    bool = bool5;
                    int i17 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i18 = i17 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 10:
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    bool3 = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getWasCloseMessageCalled.write, bool3);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    bool = bool;
                    int i19 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i110 = i19 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 11:
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    bool4 = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, getWasCloseMessageCalled.write, bool4);
                    i5 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    bool = bool;
                    int i111 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i112 = i111 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 12:
                    getinstallbegintimestampseconds = (getInstallBeginTimestampSeconds) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, createInstallReferrerClient.write, getinstallbegintimestampseconds);
                    i5 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    int i113 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i114 = i113 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                case 13:
                    i5 |= 8192;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = (GooglePlayServicesClientGooglePlayServicesInterface) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, Assert.write, googlePlayServicesClientGooglePlayServicesInterface);
                    int i115 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i116 = i115 % 2;
                    bool = bool;
                    googlePlayServicesClientGooglePlayServicesInterface = googlePlayServicesClientGooglePlayServicesInterface;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new lockLogLevel(i5, jSerializer, strMediaMetadataCompat, strMediaMetadataCompat2, iIconCompatParcelizer, strMediaMetadataCompat3, strMediaMetadataCompat4, list, str, bool2, bool, bool3, bool4, getinstallbegintimestampseconds, googlePlayServicesClientGooglePlayServicesInterface);
    }
}
