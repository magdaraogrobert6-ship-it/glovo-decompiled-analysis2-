package o;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.deliveryhero.perseus.PerseusEvent;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import com.roadrunner.delivery.state.pudo.TypographyToken;
import com.roadrunner.delivery.state.pudo.ValidationType;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.home.nest.api.data.TierType;
import com.roadrunner.home.nest.api.data.Type;
import io.reactivex.Single;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;

    public /* synthetic */ invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        boolean z;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        suppressLayout suppresslayout = null;
        switch (i2) {
            case 0:
                Type type = (Type) obj;
                type.getClass();
                return type.getValue();
            case 1:
                getTopLeftnOccac gettopleftnoccac = (getTopLeftnOccac) obj;
                gettopleftnoccac.getClass();
                return gettopleftnoccac.read();
            case 2:
                ((getAutofillTree) obj).getClass();
                return Boolean.TRUE;
            case 3:
                ((getAutofillTree) obj).getClass();
                return Boolean.TRUE;
            case 4:
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                ontouch.MediaDescriptionCompat = true;
                return createfromparcel;
            case 5:
                getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
                getenterjxw82lu.getClass();
                CashPaymentTaskUiItem cashPaymentTaskUiItem = getenterjxw82lu.cashItem;
                if (cashPaymentTaskUiItem != null) {
                    return getEnterjXw82LU.write(getenterjxw82lu, null, CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, null, null, null, null, null, null, null, CashPaymentTaskUiItem.UiMode.EditPayment, null, 33030143), null, null, 8063);
                }
                return null;
            case 6:
                return getEnterjXw82LU.write((getEnterjXw82LU) obj, null, null, null, CardCashPaymentTaskUiItem$PaymentStatus.PROGRESS, 7679);
            case 7:
                Context context = (Context) obj;
                context.getClass();
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = new AndroidEdgeEffectOverscrollEffect(context);
                androidEdgeEffectOverscrollEffect.setScaleType(pullBottomk4lQ0M.FILL_CENTER);
                androidEdgeEffectOverscrollEffect.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return androidEdgeEffectOverscrollEffect;
            case 8:
                PreviewContainer previewContainer = (PreviewContainer) obj;
                boolean z2 = previewContainer.isSuccess;
                PreviewParameter previewParameter = previewContainer.qrScanScreen;
                if (z2) {
                    return previewContainer;
                }
                accessgetCountjd accessgetcountjd = previewParameter.fallbackScreen;
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk<Character> r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = accessgetcountjd.enteredPin;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
                for (Character ch : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                    int i3 = RemoteActionCompatParcelizer + 7;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    arrayList.add(null);
                }
                return PreviewContainer.RemoteActionCompatParcelizer(previewContainer, false, PreviewParameter.IconCompatParcelizer(previewParameter, accessgetCountjd.IconCompatParcelizer(accessgetcountjd, removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList))), 127);
            case 9:
                ButtonTypeToken buttonTypeToken = (ButtonTypeToken) obj;
                buttonTypeToken.getClass();
                return buttonTypeToken.getToken();
            case 10:
                MessageBoxTypeToken messageBoxTypeToken = (MessageBoxTypeToken) obj;
                messageBoxTypeToken.getClass();
                return messageBoxTypeToken.getToken();
            case 11:
                TagColorToken tagColorToken = (TagColorToken) obj;
                tagColorToken.getClass();
                return tagColorToken.getToken();
            case 12:
                TagIconTokenV1 tagIconTokenV1 = (TagIconTokenV1) obj;
                tagIconTokenV1.getClass();
                return tagIconTokenV1.getToken();
            case 13:
                TypographyToken typographyToken = (TypographyToken) obj;
                typographyToken.getClass();
                return typographyToken.getToken();
            case 14:
                ValidationType validationType = (ValidationType) obj;
                validationType.getClass();
                return validationType.getValue();
            case 15:
                lambdaprocessAndResolveDeeplink14 lambdaprocessandresolvedeeplink14 = (lambdaprocessAndResolveDeeplink14) obj;
                lambdaprocessandresolvedeeplink14.getClass();
                return Boolean.valueOf(lambdaprocessandresolvedeeplink14.serializer());
            case 16:
                ((Throwable) obj).getClass();
                return Single.serializer("");
            case 17:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return addID.INVALID;
                }
                addID addid = addID.VALID;
                int i5 = RemoteActionCompatParcelizer + 85;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return addid;
            case 18:
                AndroidPathEffect androidPathEffect = (AndroidPathEffect) obj;
                androidPathEffect.getClass();
                androidPathEffect.serializer("selfie-camera");
                androidPathEffect.RemoteActionCompatParcelizer(-1);
                androidPathEffect.write = true;
                androidPathEffect.RemoteActionCompatParcelizer = false;
                return createfromparcel;
            case 19:
                AndroidPathEffect androidPathEffect2 = (AndroidPathEffect) obj;
                androidPathEffect2.getClass();
                androidPathEffect2.serializer("identity-confirmation?userId={userId},token={token},invocationSite={invocationSite}");
                androidPathEffect2.RemoteActionCompatParcelizer(-1);
                androidPathEffect2.write = true;
                androidPathEffect2.RemoteActionCompatParcelizer = false;
                return createfromparcel;
            case 20:
                onTouch ontouch2 = (onTouch) obj;
                ontouch2.getClass();
                ontouch2.MediaDescriptionCompat = true;
                return createfromparcel;
            case 21:
                return HelpCenterActivity.write((onTouch) obj);
            case 22:
                TierType tierType = (TierType) obj;
                tierType.getClass();
                return tierType.getValue();
            case 23:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("DELETE FROM in_app_message");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 24:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM in_app_message LIMIT 1");
                try {
                    int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "id");
                    int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "message_data");
                    int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "content_response_json");
                    int iWrite4 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "is_shown");
                    int iWrite5 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, com.deliveryhero.chatsdk.util.PushNotificationParserObj.MESSAGE_ID_KEY);
                    int iWrite6 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "campaign_id");
                    int iWrite7 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "execution_id");
                    int iWrite8 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "template_id");
                    int iWrite9 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "notification_id");
                    if (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                        long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite);
                        String str = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite2);
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite3);
                        if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite4)) != 0) {
                            z = true;
                        } else {
                            int i7 = serializer + 87;
                            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            z = false;
                        }
                        suppresslayout = new suppressLayout(jSerializer, str, str2, z, uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite5), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite6), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite7), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite8), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite9));
                        int i9 = serializer + 9;
                        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                    return suppresslayout;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                }
            case 25:
                PerseusEvent perseusEvent = (PerseusEvent) obj;
                perseusEvent.getClass();
                return perseusEvent.getEventAction();
            case 26:
                AndroidPathEffect androidPathEffect3 = (AndroidPathEffect) obj;
                androidPathEffect3.getClass();
                androidPathEffect3.serializer("country-selection");
                androidPathEffect3.RemoteActionCompatParcelizer(-1);
                androidPathEffect3.write = true;
                androidPathEffect3.RemoteActionCompatParcelizer = false;
                return createfromparcel;
            case 27:
                ((String) obj).getClass();
                return createfromparcel;
            case 28:
                Intent intent = (Intent) obj;
                intent.getClass();
                intent.addFlags(335544320);
                return createfromparcel;
            default:
                AndroidPathEffect androidPathEffect4 = (AndroidPathEffect) obj;
                androidPathEffect4.getClass();
                androidPathEffect4.serializer("sign-in");
                androidPathEffect4.RemoteActionCompatParcelizer(-1);
                androidPathEffect4.write = true;
                androidPathEffect4.RemoteActionCompatParcelizer = false;
                return createfromparcel;
        }
    }
}
