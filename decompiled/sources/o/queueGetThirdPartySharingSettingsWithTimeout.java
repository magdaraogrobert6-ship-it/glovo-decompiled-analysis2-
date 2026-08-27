package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class queueGetThirdPartySharingSettingsWithTimeout implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final queueGetThirdPartySharingSettingsWithTimeout read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        queueGetThirdPartySharingSettingsWithTimeout queuegetthirdpartysharingsettingswithtimeout = new queueGetThirdPartySharingSettingsWithTimeout();
        read = queuegetthirdpartysharingsettingswithtimeout;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.recentdeliveries.data.model.RecentDeliveriesResponse", queuegetthirdpartysharingsettingswithtimeout, 4);
        oncloseactionlambda1.read("deliveries", false);
        oncloseactionlambda1.read("earnings", true);
        oncloseactionlambda1.read("helpdesk", true);
        oncloseactionlambda1.read("vendor_review_config", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        int i3 = 12 / 0;
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {processSessionI.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(preLaunchActionsI.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(processRemoteTriggersI.read), readInstallReferrerSamsung.serializer};
        int i4 = write + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        processSessionI processsessioni = (processSessionI) obj;
        processsessioni.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) processSessionI.$childSerializers[0].MediaSessionCompatResultReceiverWrapper();
        List list = processsessioni.deliveries;
        processCoppaComplianceI processcoppacompliancei = processsessioni.helpdesk;
        pauseSendingI pausesendingi = processsessioni.earnings;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdp, list);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || pausesendingi != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, preLaunchActionsI.RemoteActionCompatParcelizer, pausesendingi);
            int i2 = write + 75;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (processcoppacompliancei != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, readInstallReferrerSamsung.serializer, processsessioni.vendorReviewConfig);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = write + 25;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, processRemoteTriggersI.read, processcoppacompliancei);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, readInstallReferrerSamsung.serializer, processsessioni.vendorReviewConfig);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = processSessionI.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        pauseSendingI pausesendingi = null;
        processCoppaComplianceI processcoppacompliancei = null;
        readInstallReferrerVivo readinstallreferrervivo = null;
        boolean z = true;
        int i4 = 0;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = write + 73;
                int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i7;
                int i8 = i6 % 2;
                if (i5 != 0) {
                    int i9 = i7 + 105;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (i5 != 1) {
                        int i11 = i7 + 105;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            if (i5 != 2) {
                                int i12 = i7 + 19;
                                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                if (i5 == 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                    return null;
                                }
                                readinstallreferrervivo = (readInstallReferrerVivo) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, readInstallReferrerSamsung.serializer, readinstallreferrervivo);
                                i4 |= 8;
                            } else {
                                processcoppacompliancei = (processCoppaComplianceI) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, processRemoteTriggersI.read, processcoppacompliancei);
                                i4 |= 4;
                            }
                        } else if (i5 != 2) {
                            int i14 = i7 + 19;
                            write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            if (i5 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                return null;
                            }
                            readinstallreferrervivo = (readInstallReferrerVivo) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, readInstallReferrerSamsung.serializer, readinstallreferrervivo);
                            i4 |= 8;
                        } else {
                            processcoppacompliancei = (processCoppaComplianceI) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, processRemoteTriggersI.read, processcoppacompliancei);
                            i4 |= 4;
                        }
                    } else {
                        pausesendingi = (pauseSendingI) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, preLaunchActionsI.RemoteActionCompatParcelizer, pausesendingi);
                        i4 |= 2;
                    }
                } else {
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new processSessionI(i4, list, pausesendingi, processcoppacompliancei, readinstallreferrervivo);
    }
}
