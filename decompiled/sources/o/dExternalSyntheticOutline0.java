package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.lib.compose.permission.PermissionContentKt;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rrds.compose.component.forms.PhonePrefixCardKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import io.sentry.SentryUUID;
import io.sentry.util.UrlUtils;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dExternalSyntheticOutline0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ isInvalidIndex MediaDescriptionCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 2;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ dExternalSyntheticOutline0(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, extractAuthorizationHeader extractauthorizationheader, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        this.RemoteActionCompatParcelizer = mutableInteractionSourceImpl;
        this.RatingCompat = extractauthorizationheader;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
        this.serializer = z;
        this.MediaDescriptionCompat = dragAndDropTargetModifierNode;
    }

    public /* synthetic */ dExternalSyntheticOutline0(androidx.compose.ui.Modifier modifier, String str, getBoolean getboolean, boolean z, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.write = modifier;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = getboolean;
        this.serializer = z;
        this.RatingCompat = str2;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public /* synthetic */ dExternalSyntheticOutline0(getTypeConverter gettypeconverter, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessgetAltRightcp accessgetaltrightcp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier) {
        this.RemoteActionCompatParcelizer = gettypeconverter;
        this.serializer = z;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = accessgetaltrightcp;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        boolean z2;
        long jOnKeyDown;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 79;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        isInvalidIndex isinvalidindex = this.MediaDescriptionCompat;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.RatingCompat;
        Object obj5 = this.RemoteActionCompatParcelizer;
        int i6 = 1;
        boolean z3 = false;
        if (i5 != 0) {
            if (i5 == 1) {
                getTypeConverter gettypeconverter = (getTypeConverter) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
                accessgetAltRightcp accessgetaltrightcp = (accessgetAltRightcp) obj4;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    int i7 = MediaBrowserCompatMediaItem + 93;
                    MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    z3 = true;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, z3)) {
                    boolean z4 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    boolean z5 = getpostalcode.read(accessgetaltrightcp);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z4 | z5) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, i6, accessgetaltrightcp);
                        getpostalcode.write(objComponentActivity);
                    }
                    PermissionContentKt.PermissionDialogCard(gettypeconverter, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, this.write, getpostalcode, 0, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i9 = MediaBrowserCompatMediaItem + 95;
                    MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                return createfromparcel;
            }
            androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj5;
            extractAuthorizationHeader extractauthorizationheader = (extractAuthorizationHeader) obj4;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) isinvalidindex;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if ((iIntValue2 & 3) != 2) {
                int i11 = MediaSessionCompatQueueItem + 47;
                MediaBrowserCompatMediaItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, z2)) {
                SwitchDefaults switchDefaultsM71PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m71PaddingValuesYgX7TsA$default(0.0f, Dimensions.getNestedScrollAxes, 1);
                if (((Boolean) RangesKt.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode2, 0).getValue()).booleanValue()) {
                    getpostalcode2.serializer(-508810820);
                    jOnKeyDown = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onNightModeChanged();
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-508748355);
                    jOnKeyDown = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onKeyDown();
                    getpostalcode2.IconCompatParcelizer(false);
                }
                int i13 = MediaBrowserCompatMediaItem + 17;
                MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                extractauthorizationheader.getClass();
                getpostalcode2.serializer(-508631888);
                SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer = UrlUtils.IconCompatParcelizer(500L, getpostalcode2, 0).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode2.IconCompatParcelizer(false);
                SwitchDefaults switchDefaults = androidx.compose.material3.ButtonDefaults.serializer;
                androidx.compose.ui.graphics.Color.Companion companion = androidx.compose.ui.graphics.Color.Companion;
                androidx.compose.material3.ButtonKt.read(sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer, this.write, this.serializer, null, androidx.compose.material3.ButtonDefaults.RemoteActionCompatParcelizer(companion.m757getTransparent0d7_KjU(), jOnKeyDown, companion.m757getTransparent0d7_KjU(), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMenuOpened(), getpostalcode2, 0), switchDefaultsM71PaddingValuesYgX7TsA$default, mutableInteractionSourceImpl, dragAndDropTargetModifierNode, getpostalcode2, 0, 104);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        String str = (String) obj5;
        getBoolean getboolean = (getBoolean) obj3;
        String str2 = (String) obj4;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
        if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
            androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(this.write, null, 3);
            expand expandVar = expand.Min;
            androidx.compose.ui.Modifier modifierHeight = androidx.compose.foundation.layout.IntrinsicKt.height(modifierIconCompatParcelizer, expandVar);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode3, 0);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifierHeight);
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = MediaSessionCompatQueueItem + 93;
            MediaBrowserCompatMediaItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z6 = getpostalcode3.ComponentActivity;
                Object obj6 = null;
                obj6.hashCode();
                throw null;
            }
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                int i16 = MediaBrowserCompatMediaItem + 41;
                MediaSessionCompatQueueItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    getpostalcode3.serializer(constructor);
                    Object obj7 = null;
                    obj7.hashCode();
                    throw null;
                }
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            if (str == null) {
                int i17 = MediaBrowserCompatMediaItem + 107;
                MediaSessionCompatQueueItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    getpostalcode3.serializer(-12743020);
                    z = false;
                } else {
                    z = false;
                    getpostalcode3.serializer(-12743020);
                }
                getpostalcode3.IconCompatParcelizer(z);
                i = 0;
            } else {
                getpostalcode3.serializer(-12743019);
                PhonePrefixCardKt.PhonePrefixCard(str, androidx.compose.foundation.layout.IntrinsicKt.height(androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.ui.Modifier.Companion, 0.0f, 0.0f, Dimensions.setSplitBackground, 0.0f, 11), null, 3), expandVar), false, getpostalcode3, 0, 4);
                i = 0;
                getpostalcode3.IconCompatParcelizer(false);
            }
            String strWrite = getboolean.write();
            String str3 = getboolean.IconCompatParcelizer;
            getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(getboolean.MediaSessionCompatQueueItem, i, 123);
            boolean zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(getboolean);
            Object objComponentActivity2 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new d0ExternalSyntheticLambda0(getboolean, i);
                getpostalcode3.write(objComponentActivity2);
            }
            TextInputBigV2Kt.TextInputBigV2(strWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, null, false, null, str3, null, null, this.serializer, str2, null, true, 0, getcenterhorizontally, null, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, "", null, getpostalcode3, 0, 3072, 0, 5198780);
            getpostalcode3.IconCompatParcelizer(true);
        } else {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
