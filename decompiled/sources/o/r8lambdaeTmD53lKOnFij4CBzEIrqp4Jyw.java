package o;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureCommonKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.actions.links.LinkifyTextKt;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import o.ActivityPackageSender;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RemoteActionCompatParcelizer;
import o.SelectionMagnifierKt;
import o.ShortNewsContentCardView;
import o.Util1;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessmultiRemove accessmultiremove) {
        this.RemoteActionCompatParcelizer = 1;
        this.read = list;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = accessmultiremove;
    }

    public /* synthetic */ r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(Object obj, Object obj2, Object obj3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    public /* synthetic */ r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, String str) {
        this.RemoteActionCompatParcelizer = 6;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.IconCompatParcelizer = str;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x06ea  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.IconCompatParcelizer;
        Object obj5 = this.serializer;
        Object obj6 = this.read;
        switch (i3) {
            case 0:
                r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8 = (r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8) obj6;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                ((Integer) obj3).getClass();
                ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
                androidx.compose.ui.Modifier modifierM74paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.ui.Modifier.Companion, Dimensions.getTitle, 0.0f, 0.0f, 0.0f, 14);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getbirthdatefull, 0);
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getbirthdatefull, modifierM74paddingqDBjuR0$default);
                androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i4 = MediaSessionCompatQueueItem + 105;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        getpostalcode.serializer(constructor);
                        Object obj7 = null;
                        obj7.hashCode();
                        throw null;
                    }
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull, modalBottomSheetYbuCTN8Serializer, companion.getSetMeasurePolicy());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull, companion.getApplyOnDeactivatedNodeAssertion());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull, modifierMaterializeModifier, companion.getSetModifier());
                getpostalcode.serializer(1947900936);
                Iterator<E> it = r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.serializer.iterator();
                while (it.hasNext()) {
                    int i5 = write + 87;
                    MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((r8lambdav4khHexYF7B8JZECOja6EPumcY4) it.next()), getbirthdatefull, 48);
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
                return createfromparcel;
            case 1:
                List list = (List) obj6;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                accessmultiRemove accessmultiremove = (accessmultiRemove) obj5;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((IconButtonKt) obj).getClass();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else if (list.isEmpty()) {
                    getpostalcode2.serializer(-1242358805);
                    androidx.compose.ui.Modifier modifierThen = androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read);
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getCenter(), false);
                    int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                    if (getpostalcode2.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor2);
                        int i7 = MediaSessionCompatQueueItem + 45;
                        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                    if (accessmultiremove instanceof fireWY9HvpM) {
                        getpostalcode2.serializer(-1953424707);
                        androidx.compose.material3.TextKt.m131TextNvy7gAk(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.all_error_message, getpostalcode2, 0), null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                        z = false;
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        z = false;
                        getpostalcode2.serializer(-1953178009);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    getpostalcode2.IconCompatParcelizer(true);
                    getpostalcode2.IconCompatParcelizer(z);
                } else {
                    int i9 = MediaSessionCompatQueueItem + 99;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    getpostalcode2.serializer(-1243160372);
                    androidx.compose.ui.Modifier modifierThen2 = androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read);
                    modifierThen2.getClass();
                    SwitchDefaults switchDefaultsM72PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m72PaddingValuesa9UjIt4$default(7, 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback);
                    boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(list);
                    boolean z3 = getpostalcode2.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer || z3) {
                        objComponentActivity = new SessionDao_Impl$$ExternalSyntheticLambda1(list, 7, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                        getpostalcode2.write(objComponentActivity);
                    } else {
                        int i11 = MediaSessionCompatQueueItem + 61;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i11 % 2 != 0) {
                            throw null;
                        }
                        if (objComponentActivity == androidContentCaptureManager) {
                            objComponentActivity = new SessionDao_Impl$$ExternalSyntheticLambda1(list, 7, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                            getpostalcode2.write(objComponentActivity);
                        }
                    }
                    androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifierThen2, null, switchDefaultsM72PaddingValuesa9UjIt4$default, null, null, null, false, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 6, 506);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                return createfromparcel;
            case 2:
                getNativeTypefacePYhJU0U getnativetypefacepyhju0u = (getNativeTypefacePYhJU0U) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
                androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((getPostalCode) getbirthdatefull3).read(modifier) ? 4 : 2;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str = getnativetypefacepyhju0u.RemoteActionCompatParcelizer;
                    Object objComponentActivity2 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 7);
                        getpostalcode3.write(objComponentActivity2);
                    }
                    EntrancePictureCommonKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getpostalcode3, ((iIntValue2 << 9) & 7168) | 48, 0);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                AndroidMultiParagraphDraw_androidKt androidMultiParagraphDraw_androidKt = (AndroidMultiParagraphDraw_androidKt) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj4;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((IconButtonKt) obj).getClass();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode4.write(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    String str2 = androidMultiParagraphDraw_androidKt.RemoteActionCompatParcelizer;
                    Object objComponentActivity3 = getpostalcode4.ComponentActivity();
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate8, 8);
                        getpostalcode4.write(objComponentActivity3);
                    }
                    EntrancePictureCommonKt.IconCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode4, 48, 8);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 4:
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                if ((iIntValue4 & 17) != 16) {
                    int i12 = write + 81;
                    MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
                if (!(!getpostalcode5.write(iIntValue4 & 1, z2))) {
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(companion3, 1.0f);
                    float f = Dimensions.setTabContainer;
                    androidx.compose.ui.Modifier modifierWrite2 = androidx.compose.foundation.layout.PaddingKt.write(modifierWrite, f);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode5, 0);
                    int iHashCode3 = Long.hashCode(getpostalcode5.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode5.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode5, modifierWrite2);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion4 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion4.getConstructor();
                    if (getpostalcode5.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    int i14 = MediaSessionCompatQueueItem + 109;
                    write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode5.ComponentActivity) {
                        getpostalcode5.serializer(constructor3);
                    } else {
                        getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode5, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode5, Integer.valueOf(iHashCode3), getpostalcode5));
                    androidx.compose.ui.graphics.painter.Painter painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_user_shield, getpostalcode5, 0);
                    androidx.compose.ui.graphics.ColorFilter.Companion companion5 = androidx.compose.ui.graphics.ColorFilter.Companion;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    androidx.compose.foundation.ImageKt.Image(painterPainterResource, "This is an image that is part of the info section", null, null, null, 0.0f, androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(companion5, ((buildMapping) getpostalcode5.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0, 2, null), getpostalcode5, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 60);
                    coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode5, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion3, f)});
                    LinkifyTextKt.m5035LinkifyPlaceholdermAkEFg8(str3 + " " + str4, str4, performLayout.write(), ((buildMapping) getpostalcode5.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), androidx.compose.foundation.layout.SizeKt.write(companion3, 1.0f), 0L, null, null, str5, getpostalcode5, 24576);
                    getpostalcode5.IconCompatParcelizer(true);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                NetworkFetcherfetch2 networkFetcherfetch2 = (NetworkFetcherfetch2) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode6.write(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion6 = androidx.compose.ui.Modifier.Companion;
                    float f2 = Dimensions.getAnimatedVisibility;
                    androidx.compose.ui.Modifier modifierWrite3 = androidx.compose.foundation.layout.PaddingKt.write(companion6, f2);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getpostalcode6, 0);
                    int iHashCode4 = Long.hashCode(getpostalcode6.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode6.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode6, modifierWrite3);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion7 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion7.getConstructor();
                    if (getpostalcode6.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!(!getpostalcode6.ComponentActivity)) {
                        getpostalcode6.serializer(constructor4);
                    } else {
                        getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion7, getpostalcode6, modalBottomSheetYbuCTN8Serializer2, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion7, getpostalcode6, Integer.valueOf(iHashCode4), getpostalcode6));
                    String str6 = networkFetcherfetch2.read;
                    androidx.compose.ui.text.TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(str6, null, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui2)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode6, 0, 0, 131066);
                    coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion6, Dimensions.setPrimaryBackground)});
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(networkFetcherfetch2.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui2)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode6, 0, 0, 131066);
                    PrimaryKt.write(networkFetcherfetch2.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.write(companion6, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13), true, false, null, null, null, null, null, getpostalcode6, 3072, 0, 2032);
                    TertiaryKt.IconCompatParcelizer(networkFetcherfetch2.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.write(companion6, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13), true, 0, null, null, null, getpostalcode6, 3072, 240);
                    getpostalcode6.IconCompatParcelizer(true);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                String str7 = (String) obj4;
                getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                getshouldcreatecompositiononattachedtowindow.getClass();
                if ((iIntValue6 & 6) == 0) {
                    if (((getPostalCode) getbirthdatefull7).read(getshouldcreatecompositiononattachedtowindow)) {
                        int i16 = write + 33;
                        MediaSessionCompatQueueItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        i = 4;
                    } else {
                        i = 2;
                    }
                    iIntValue6 |= i;
                }
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull7;
                boolean zWrite = getpostalcode7.write(iIntValue6 & 1, (iIntValue6 & 19) != 18);
                getAddressCountry getaddresscountry = getpostalcode7.read;
                if (zWrite) {
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) getpostalcode7.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    Object objComponentActivity4 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode7);
                        getpostalcode7.write(objComponentActivity4);
                    }
                    final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity4;
                    Object objComponentActivity5 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);
                        getpostalcode7.write(objComponentActivity5);
                    }
                    final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
                    Object objComponentActivity6 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = Float.valueOf(density.mo48toPx0680j_4(Dimensions.getActionBarHideOffset));
                        getpostalcode7.write(objComponentActivity6);
                    }
                    final float fFloatValue = ((Number) objComponentActivity6).floatValue();
                    Object objComponentActivity7 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = Float.valueOf((density.mo48toPx0680j_4(((getWindow) getshouldcreatecompositiononattachedtowindow).read()) - density.mo48toPx0680j_4(Dimensions.onConfigurationChanged)) - density.mo48toPx0680j_4(Dimensions.getActionBarHideOffset));
                        getpostalcode7.write(objComponentActivity7);
                    }
                    final float fFloatValue2 = ((Number) objComponentActivity7).floatValue();
                    Object objComponentActivity8 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = mainAxisk4lQ0M.write(fFloatValue);
                        getpostalcode7.write(objComponentActivity8);
                    }
                    final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) objComponentActivity8;
                    Object objComponentActivity9 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = androidx.compose.runtime.CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.Util4
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                float fFloatValue3;
                                int i18 = 2 % 2;
                                int i19 = read + 5;
                                RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i19 % 2 != 0) {
                                    fFloatValue3 = (((Number) animatable.write()).floatValue() + fFloatValue) % fFloatValue2;
                                } else {
                                    fFloatValue3 = (((Number) animatable.write()).floatValue() - fFloatValue) / fFloatValue2;
                                }
                                return Float.valueOf(fFloatValue3);
                            }
                        });
                        getpostalcode7.write(objComponentActivity9);
                    }
                    final onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity9;
                    Object objComponentActivity10 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity10 == androidContentCaptureManager) {
                        objComponentActivity10 = androidx.compose.runtime.CompositionKt.serializer(new getAndroidRenderEffect(onviewattachedtowindow, 7));
                        getpostalcode7.write(objComponentActivity10);
                    }
                    onViewAttachedToWindow onviewattachedtowindow2 = (onViewAttachedToWindow) objComponentActivity10;
                    long jRatingCompat = BuildersKt.RatingCompat(getpostalcode7);
                    long keyListener = ((buildMapping) getpostalcode7.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener();
                    Object objComponentActivity11 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity11 == androidContentCaptureManager) {
                        objComponentActivity11 = androidx.compose.runtime.CompositionKt.serializer(new Util2(jRatingCompat, keyListener, onviewattachedtowindow));
                        getpostalcode7.write(objComponentActivity11);
                    }
                    onViewAttachedToWindow onviewattachedtowindow3 = (onViewAttachedToWindow) objComponentActivity11;
                    long jMediaBrowserCompatMediaItem = BuildersKt.MediaBrowserCompatMediaItem(getpostalcode7);
                    androidx.compose.ui.Modifier.Companion companion8 = androidx.compose.ui.Modifier.Companion;
                    androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.SizeKt.read;
                    androidx.compose.ui.Modifier modifierClip = androidx.compose.ui.draw.ClipKt.clip(companion8.then(fillElement), androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28));
                    boolean zIconCompatParcelizer2 = getpostalcode7.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    boolean zSerializer = getpostalcode7.serializer(0.8f);
                    boolean z4 = getpostalcode7.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
                    boolean zIconCompatParcelizer3 = getpostalcode7.IconCompatParcelizer(animatable);
                    boolean z5 = getpostalcode7.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k5);
                    Object objComponentActivity12 = getpostalcode7.ComponentActivity();
                    if ((zSerializer | zIconCompatParcelizer2 | z4 | zIconCompatParcelizer3 | z5) || objComponentActivity12 == androidContentCaptureManager) {
                        objComponentActivity12 = new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1
                            private static int MediaMetadataCompat = 1;
                            private static int RatingCompat;

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
                                int i18 = 2 % 2;
                                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate10 = populateViewStructure_androidKtpopulate9;
                                SelectionMagnifierKt selectionMagnifierKt = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate10, 13);
                                float f3 = fFloatValue;
                                float f4 = fFloatValue2;
                                Animatable animatable2 = animatable;
                                onViewAttachedToWindow onviewattachedtowindow4 = onviewattachedtowindow;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = r8lambdardpfsr94j4iebcwx_kpqzpm8k5;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                Util1 util1 = new Util1(f3, f4, animatable2, populateViewStructure_androidKtpopulate10, onviewattachedtowindow4, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, getcontentviewgroupparentlayout2);
                                ActivityPackageSender activityPackageSender = new ActivityPackageSender(getcontentviewgroupparentlayout2, animatable2, f3, f4);
                                float f5 = DragGestureDetectorKt.serializer;
                                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2$1(selectionMagnifierKt, activityPackageSender, util1, new RemoteActionCompatParcelizer(7), (ShortNewsContentCardView) null, 2), shortNewsContentCardView);
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                if (objAwaitEachGesture != coroutineSingletons) {
                                    objAwaitEachGesture = createfromparcel2;
                                }
                                if (objAwaitEachGesture != coroutineSingletons) {
                                    return createfromparcel2;
                                }
                                int i19 = MediaMetadataCompat;
                                int i20 = i19 + 31;
                                RatingCompat = i20 % Fields.SpotShadowColor;
                                int i21 = i20 % 2;
                                int i22 = i19 + 3;
                                RatingCompat = i22 % Fields.SpotShadowColor;
                                if (i22 % 2 == 0) {
                                    return objAwaitEachGesture;
                                }
                                throw null;
                            }
                        };
                        getpostalcode7.write(objComponentActivity12);
                    }
                    androidx.compose.ui.Modifier modifierPointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifierClip, createfromparcel, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objComponentActivity12);
                    androidx.compose.ui.Alignment.Companion companion9 = androidx.compose.ui.Alignment.Companion;
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy2 = androidx.compose.foundation.layout.BoxKt.read(companion9.getCenterStart(), false);
                    int iHashCode5 = Long.hashCode(getpostalcode7.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode7.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode7, modifierPointerInput);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion10 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion10.getConstructor();
                    if (getaddresscountry == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode7.ComponentActivity) {
                        getpostalcode7.serializer(constructor5);
                    } else {
                        getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion10, getpostalcode7, measurePolicy2, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion10, getpostalcode7, Integer.valueOf(iHashCode5), getpostalcode7));
                    androidx.compose.ui.Modifier modifierM20backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion8.then(fillElement), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode7), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy3 = androidx.compose.foundation.layout.BoxKt.read(companion9.getTopStart(), false);
                    int iHashCode6 = Long.hashCode(getpostalcode7.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer6 = getpostalcode7.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode7, modifierM20backgroundbw27NRU);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor6 = companion10.getConstructor();
                    getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode7.ComponentActivity) {
                        getpostalcode7.serializer(constructor6);
                    } else {
                        getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion10, getpostalcode7, measurePolicy3, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer6);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier6, m1$$ExternalSyntheticOutline0.m(companion10, getpostalcode7, Integer.valueOf(iHashCode6), getpostalcode7));
                    getpostalcode7.IconCompatParcelizer(true);
                    getpostalcode7.serializer(-652568794);
                    getpostalcode7.IconCompatParcelizer(false);
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(str7, androidx.compose.foundation.layout.BoxScopeInstance.serializer.align(companion8, companion9.getCenter()), BuildersKt.RatingCompat(getpostalcode7), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode7, 0, 0, 131064);
                    androidx.compose.ui.Modifier modifierThen3 = companion8.then(fillElement);
                    Object objComponentActivity13 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity13 == androidContentCaptureManager) {
                        objComponentActivity13 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindow2, 11);
                        getpostalcode7.write(objComponentActivity13);
                    }
                    androidx.compose.ui.Modifier modifierM20backgroundbw27NRU2 = androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifierThen3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity13), BuildersKt.RatingCompat(getpostalcode7), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy4 = androidx.compose.foundation.layout.BoxKt.read(companion9.getTopStart(), false);
                    int iHashCode7 = Long.hashCode(getpostalcode7.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer7 = getpostalcode7.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode7, modifierM20backgroundbw27NRU2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor7 = companion10.getConstructor();
                    getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode7.ComponentActivity) {
                        int i18 = MediaSessionCompatQueueItem + 29;
                        write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i18 % 2 != 0) {
                            getpostalcode7.serializer(constructor7);
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        getpostalcode7.serializer(constructor7);
                    } else {
                        getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion10, getpostalcode7, measurePolicy4, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer7);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier7, m1$$ExternalSyntheticOutline0.m(companion10, getpostalcode7, Integer.valueOf(iHashCode7), getpostalcode7));
                    getpostalcode7.IconCompatParcelizer(true);
                    boolean zIconCompatParcelizer4 = getpostalcode7.IconCompatParcelizer(animatable);
                    Object objComponentActivity14 = getpostalcode7.ComponentActivity();
                    if (zIconCompatParcelizer4 || objComponentActivity14 == androidContentCaptureManager) {
                        objComponentActivity14 = new RealWebSocket$$ExternalSyntheticLambda0(3, animatable);
                        getpostalcode7.write(objComponentActivity14);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity14;
                    Object objComponentActivity15 = getpostalcode7.ComponentActivity();
                    if (objComponentActivity15 == androidContentCaptureManager) {
                        objComponentActivity15 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate9, 18);
                        getpostalcode7.write(objComponentActivity15);
                    }
                    SliderButtonContainerKt.m5037SliderHandlet6yy7ic(r8lambdardpfsr94j4iebcwx_kpqzpm8k6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity15, ((androidx.compose.ui.graphics.Color) onviewattachedtowindow3.getValue()).m732unboximpl(), jMediaBrowserCompatMediaItem, null, getpostalcode7, 48);
                    getpostalcode7.IconCompatParcelizer(true);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj6;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5;
                String str8 = (String) obj4;
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ProgressIndicatorKt) obj).getClass();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode8.write(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ArrayList<lambda316> arrayList = new ArrayList();
                    for (Object obj9 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                        if (((lambda316) obj9).RemoteActionCompatParcelizer) {
                            arrayList.add(obj9);
                        }
                    }
                    for (lambda316 lambda316Var : arrayList) {
                        int i19 = MediaSessionCompatQueueItem + 73;
                        write = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        String str9 = lambda316Var.write;
                        boolean z6 = lambda316Var.IconCompatParcelizer;
                        boolean z7 = getpostalcode8.read(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                        boolean z8 = getpostalcode8.read(str8);
                        boolean zIconCompatParcelizer5 = getpostalcode8.IconCompatParcelizer(lambda316Var);
                        Object objComponentActivity16 = getpostalcode8.ComponentActivity();
                        if (!(!(z7 | z8 | zIconCompatParcelizer5)) || objComponentActivity16 == androidContentCaptureManager) {
                            objComponentActivity16 = new b3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, str8, lambda316Var, 11);
                            getpostalcode8.write(objComponentActivity16);
                        }
                        ChipsKt.RemoteActionCompatParcelizer(str9, z6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity16, null, 0, getpostalcode8, 0, 24);
                    }
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
        }
    }
}
