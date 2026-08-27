package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.text.NumberFormat;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getTransition {
    private static int read = 0;
    private static int serializer = 1;
    public final getActionViewIntentlambda0 IconCompatParcelizer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;

    public getTransition(transferSessionPackageI transfersessionpackagei, getActionViewIntentlambda0 getactionviewintentlambda0) {
        transfersessionpackagei.getClass();
        getactionviewintentlambda0.getClass();
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.IconCompatParcelizer = getactionviewintentlambda0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x003b  */
    public final CashPaymentTaskUiItem read(CashPaymentTaskUiItem cashPaymentTaskUiItem, String str, boolean z) {
        Double dMediaMetadataCompat;
        Double d;
        int i = 2 % 2;
        if (cashPaymentTaskUiItem.uiMode.isInEditMode()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, cashPaymentTaskUiItem.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                if (!z) {
                    return cashPaymentTaskUiItem;
                }
            }
        } else if (!z) {
            return cashPaymentTaskUiItem;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_SYSTEM_CURRENCY_FORMATTING_ENABLED)) {
            int i2 = read + 91;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            d = null;
            try {
                if (i2 % 2 == 0) {
                    this.IconCompatParcelizer.getClass();
                    str.getClass();
                    NumberFormat.getInstance(java.util.Locale.getDefault()).parse(str);
                    throw null;
                }
                this.IconCompatParcelizer.getClass();
                str.getClass();
                Number number = NumberFormat.getInstance(java.util.Locale.getDefault()).parse(str);
                if (number != null) {
                    dMediaMetadataCompat = Double.valueOf(number.doubleValue());
                    int i3 = read + 5;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                }
                int i5 = read + 81;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, null, d, null, null, null, str, null, null, null, 33419263);
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.write(new Error(af$$ExternalSyntheticOutline0.m("NumberFormatter cannot parse ", str, ". Reason: ", e.getLocalizedMessage())));
            }
        } else {
            dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str);
        }
        d = dMediaMetadataCompat;
        int i7 = read + 81;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, null, d, null, null, null, str, null, null, null, 33419263);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (o.setCarryoverInAppMessage.read(r19, r4, false) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem serializer(com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTransition.serializer(com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem, java.lang.String):com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem");
    }
}
