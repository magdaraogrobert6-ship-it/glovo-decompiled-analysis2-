package o;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.deliverydetails.api.DeliveryDetailsUiModel;
import com.roadrunner.delivery.accept.orderitems.api.OrderItemsNavigationUiModel;
import com.roadrunner.delivery.accept.tags.api.TagsUiModel;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import io.sentry.SentryUUID;
import okhttp3.Cookie$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LogSqliteDrivernewTransaction2 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ isInvalidIndex read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ LogSqliteDrivernewTransaction2(Object obj, Object obj2, isInvalidIndex isinvalidindex, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.write = obj2;
        this.read = isinvalidindex;
        this.RemoteActionCompatParcelizer = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0249  */
    /* JADX WARN: Code duplicated, block: B:82:0x0278  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        boolean z;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.RemoteActionCompatParcelizer;
        isInvalidIndex isinvalidindex = this.read;
        Object obj6 = this.write;
        Object obj7 = this.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj7;
            relativeMoveTo relativemoveto = (relativeMoveTo) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            SwitchKt switchKt = (SwitchKt) obj5;
            cubicTo cubicto = (cubicTo) obj2;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            cubicto.getClass();
            getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj3);
            Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            Bundle bundleRemoteActionCompatParcelizer = cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer != null) {
                int i4 = MediaSessionCompatQueueItem + 37;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    bundleRemoteActionCompatParcelizer.getString("userEmail");
                    throw null;
                }
                string = bundleRemoteActionCompatParcelizer.getString("userEmail");
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            String strDecode = Uri.decode(string);
            strDecode.getClass();
            if (strDecode.length() <= 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("email must be initialized");
                return null;
            }
            int i5 = MediaSessionCompatQueueItem + 115;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            TurbineTimeoutCancellationException turbineTimeoutCancellationException = (TurbineTimeoutCancellationException) Cookie$Companion.IconCompatParcelizer(TurbineTimeoutCancellationException.class, r8lambdaudhhxliolpu0hpccqh6voskpny, getpostalcode);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(turbineTimeoutCancellationException);
            boolean z2 = getpostalcode.read(strDecode);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((zIconCompatParcelizer | z2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new GetNestScope$invoke$3(turbineTimeoutCancellationException, strDecode, shortNewsContentCardView, 26);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(turbineTimeoutCancellationException.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new addRect(relativemoveto, i);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            boolean z3 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!(!z3)) {
                objComponentActivity3 = new b1$$ExternalSyntheticLambda0(21, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i7 = MediaSessionCompatQueueItem + 41;
                MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new b1$$ExternalSyntheticLambda0(21, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 0, 1);
            getQueryContext getquerycontext = turbineTimeoutCancellationException.MediaBrowserCompatMediaItem;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(context);
            boolean z4 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || z4) {
                objComponentActivity4 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(context, 27, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(objComponentActivity4);
            } else {
                int i9 = MediaSessionCompatQueueItem + 93;
                MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(context, 27, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity4);
                }
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 8);
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(((a4) populateViewStructure_androidKtpopulate7Write.getValue()).MediaBrowserCompatMediaItem, null, null, null, coil3.ExtrasKt.write(2042302531, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) switchKt, (Object) turbineTimeoutCancellationException, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) populateViewStructure_androidKtpopulate7Write, 9), getpostalcode), getpostalcode, 24576, 14);
            return createfromparcel;
        }
        if (i3 != 1) {
            configConnectionForGET configconnectionforget = (configConnectionForGET) obj7;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            if (zBooleanValue) {
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                getpostalcode2.serializer(-314748432);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(companion, 1.0f);
                androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getCenter(), false);
                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode2.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                resolveContentProvider.IconCompatParcelizer(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(companion, Dimensions.run), getpostalcode2, 0);
                getpostalcode2.IconCompatParcelizer(true);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                if (zBooleanValue) {
                    throw d$$ExternalSyntheticOutline0.m((getPostalCode) getbirthdatefull, 1375319133, false);
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
                getpostalcode3.serializer(-314255160);
                SliderButtonContainerKt.IconCompatParcelizer(configconnectionforget.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode3, 0);
                getpostalcode3.IconCompatParcelizer(false);
            }
            return createfromparcel;
        }
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) isinvalidindex;
        onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) obj5;
        int iIntValue = ((Integer) obj2).intValue();
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((AnchoredDraggableKtanimateTo2) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            int i10 = MediaDescriptionCompat + 115;
            MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ((getPostalCode) getbirthdatefull2).read(iIntValue);
                throw null;
            }
            iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) != 144) {
            z = true;
        } else {
            int i11 = MediaDescriptionCompat + 71;
            MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = false;
        }
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode4.write(1 & iIntValue2, z)) {
            onViewCreated onviewcreated = (onViewCreated) ((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) onviewattachedtowindow.getValue()).get(iIntValue);
            if (onviewcreated instanceof TagsUiModel) {
                getpostalcode4.serializer(-880017141);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(onviewcreated, getpostalcode4, 48);
                getpostalcode4.IconCompatParcelizer(false);
            } else if (onviewcreated instanceof DeliveryDetailsUiModel) {
                getpostalcode4.serializer(-879909912);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(onviewcreated, getpostalcode4, 48);
                getpostalcode4.IconCompatParcelizer(false);
            } else if (onviewcreated instanceof OrderItemsNavigationUiModel) {
                int i13 = MediaSessionCompatQueueItem + 77;
                MediaDescriptionCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode4.serializer(-879794685);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(onviewcreated, getpostalcode4, 48);
                getpostalcode4.IconCompatParcelizer(false);
            } else {
                getpostalcode4.serializer(-879714488);
                getpostalcode4.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
