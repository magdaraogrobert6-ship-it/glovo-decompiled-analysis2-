package o;

import android.net.Uri;
import android.os.Bundle;
import bo.app.b1$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.Cookie$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b2ExternalSyntheticLambda8 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public final /* synthetic */ isInvalidIndex MediaSessionCompatQueueItem;
    public final /* synthetic */ isInvalidIndex RatingCompat;
    public final /* synthetic */ relativeMoveTo RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ b2ExternalSyntheticLambda8(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, relativeMoveTo relativemoveto, Object obj2, isInvalidIndex isinvalidindex, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, isInvalidIndex isinvalidindex2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = relativemoveto;
        this.serializer = obj2;
        this.MediaSessionCompatQueueItem = isinvalidindex;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = isinvalidindex2;
        this.MediaDescriptionCompat = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:24:0x012c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0176  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        Object obj5 = this.MediaDescriptionCompat;
        isInvalidIndex isinvalidindex = this.RatingCompat;
        isInvalidIndex isinvalidindex2 = this.MediaSessionCompatQueueItem;
        Object obj6 = this.serializer;
        relativeMoveTo relativemoveto = this.RemoteActionCompatParcelizer;
        Object obj7 = this.read;
        if (i2 != 0) {
            NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = (NestScreenKt$NestScreen$1$1) this.write;
            NestFragment.AnonymousClass1 anonymousClass1 = (NestFragment.AnonymousClass1) obj6;
            DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) isinvalidindex2;
            NestFragment.AnonymousClass1 anonymousClass2 = (NestFragment.AnonymousClass1) this.MediaMetadataCompat;
            NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = (NestScreenKt$NestScreen$1$1) isinvalidindex;
            setWidgetBaseline setwidgetbaseline = (setWidgetBaseline) obj5;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            onDependentViewRemoved ondependentviewremoved = (onDependentViewRemoved) coil3.ExtrasKt.write((StateFlow) obj7, getbirthdatefull, 0).getValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            boolean z = getpostalcode.read(nestScreenKt$NestScreen$1$1);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | zIconCompatParcelizer) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(nestScreenKt$NestScreen$1$1, 18, relativemoveto);
                getpostalcode.write(objComponentActivity);
            }
            getScrimOpacity.IconCompatParcelizer(0, getpostalcode, null, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, setwidgetbaseline, ondependentviewremoved, anonymousClass1, anonymousClass2, nestScreenKt$NestScreen$1$2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
            return createfromparcel;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj7;
        SwitchKt switchKt = (SwitchKt) obj6;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
        getInvalidationTracker getinvalidationtracker = (getInvalidationTracker) obj5;
        cubicTo cubicto = (cubicTo) obj2;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
        ((Integer) obj4).getClass();
        ((sendDragEventEu1f8Dk) obj).getClass();
        cubicto.getClass();
        Bundle bundleRemoteActionCompatParcelizer = cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer != null) {
            int i3 = MediaBrowserCompatMediaItem + 95;
            PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            string = bundleRemoteActionCompatParcelizer.getString("userName");
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        String strDecode = Uri.decode(string);
        OtpViewModel otpViewModel = (OtpViewModel) Cookie$Companion.IconCompatParcelizer(OtpViewModel.class, r8lambdaudhhxliolpu0hpccqh6voskpny, getbirthdatefull2);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = DragAndDropNodeKtDragAndDropTargetModifierNode1.read(otpViewModel.MediaMetadataCompat.RemoteActionCompatParcelizer, getbirthdatefull2);
        getQueryContext getquerycontext = otpViewModel.read;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        boolean z2 = getpostalcode2.read(populateViewStructure_androidKtpopulate7);
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        boolean z3 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(relativemoveto);
        Object objComponentActivity2 = getpostalcode2.ComponentActivity();
        if ((z2 | z3 | zIconCompatParcelizer2) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new b3(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, relativemoveto, populateViewStructure_androidKtpopulate7, 0);
            getpostalcode2.write(objComponentActivity2);
            int i5 = PlaybackStateCompatCustomAction + 35;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
        bbExternalSyntheticLambda0 bbexternalsyntheticlambda0 = (bbExternalSyntheticLambda0) populateViewStructure_androidKtpopulate7.getValue();
        bbexternalsyntheticlambda0.getClass();
        boolean z4 = bbexternalsyntheticlambda0.MediaSessionCompatQueueItem;
        boolean z5 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
        Object objComponentActivity3 = getpostalcode2.ComponentActivity();
        if (!z5) {
            int i7 = PlaybackStateCompatCustomAction + 79;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new b1$$ExternalSyntheticLambda0(25, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode2.write(objComponentActivity3);
            }
        } else {
            objComponentActivity3 = new b1$$ExternalSyntheticLambda0(25, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            getpostalcode2.write(objComponentActivity3);
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(!z4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode2, 0, 0);
        androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(androidx.compose.ui.Modifier.Companion, switchKt);
        bbExternalSyntheticLambda0 bbexternalsyntheticlambda1 = (bbExternalSyntheticLambda0) populateViewStructure_androidKtpopulate7.getValue();
        bbexternalsyntheticlambda1.getClass();
        boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(otpViewModel);
        boolean z6 = getpostalcode2.read(strDecode);
        boolean z7 = getpostalcode2.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        Object objComponentActivity4 = getpostalcode2.ComponentActivity();
        if (!(zIconCompatParcelizer3 | z6) && !z7) {
            int i9 = MediaBrowserCompatMediaItem + 1;
            PlaybackStateCompatCustomAction = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                Object obj8 = null;
                obj8.hashCode();
                throw null;
            }
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new b3(otpViewModel, strDecode, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 4);
                getpostalcode2.write(objComponentActivity4);
                int i10 = PlaybackStateCompatCustomAction + 57;
                MediaBrowserCompatMediaItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        } else {
            objComponentActivity4 = new b3(otpViewModel, strDecode, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 4);
            getpostalcode2.write(objComponentActivity4);
            int i12 = PlaybackStateCompatCustomAction + 57;
            MediaBrowserCompatMediaItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
        boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(otpViewModel);
        boolean z8 = getpostalcode2.read(strDecode);
        Object objComponentActivity5 = getpostalcode2.ComponentActivity();
        if ((zIconCompatParcelizer4 | z8) || objComponentActivity5 == androidContentCaptureManager) {
            objComponentActivity5 = new OtpNavigationKt$$ExternalSyntheticLambda4(otpViewModel, 0, strDecode);
            getpostalcode2.write(objComponentActivity5);
        }
        b7.write(bbexternalsyntheticlambda1, getquerycontext, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, this.MediaMetadataCompat, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierIconCompatParcelizer, getinvalidationtracker, getpostalcode2, 72);
        return createfromparcel;
    }
}
