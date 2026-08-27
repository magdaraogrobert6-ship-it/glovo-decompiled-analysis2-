package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.CompositionKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.AndroidAutofillType_androidKt;
import o.AndroidContentCaptureManager;
import o.Arrangement;
import o.FlowLayoutBuildingBlocksWrapInfo;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.TrackpadScrollingLogic;
import o.accessgetGreencp;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.getAutofillTree;
import o.getAutofillValueui;
import o.getContentCaptureSessionui;
import o.getPersonFullName;
import o.getRootAutofillId;
import o.getTextValue;
import o.listValue;
import o.onShowTranslationui;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.setAutofillHints;

/* JADX INFO: loaded from: classes.dex */
public final class SheetState {
    public final AnchoredDraggableState IconCompatParcelizer;
    public final boolean MediaDescriptionCompat;
    public final boolean RatingCompat;
    public TrackpadScrollingLogic RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public Arrangement serializer;
    public Arrangement write;

    public static Object animateTo$material3$default(SheetState sheetState, getAutofillTree getautofilltree, Arrangement arrangement, ShortNewsContentCardView shortNewsContentCardView) {
        Object objAnchoredDrag = sheetState.IconCompatParcelizer.anchoredDrag(getautofilltree, applyMeasureResultfoundation.Default, new SheetState$animateTo$2(sheetState, ((getContentCaptureSessionui) ((populate) sheetState.IconCompatParcelizer.RatingCompat)).serializer(), arrangement, null), shortNewsContentCardView);
        return objAnchoredDrag == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag : createFromParcel.INSTANCE;
    }

    public final getAutofillTree IconCompatParcelizer() {
        return (getAutofillTree) ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer.MediaDescriptionCompat)).getValue();
    }

    public final boolean RemoteActionCompatParcelizer() {
        return ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer.MediaDescriptionCompat)).getValue() != getAutofillTree.Hidden;
    }

    public final Object expand(SuspendLambda suspendLambda) {
        Object objAnimateTo$material3$default;
        getAutofillTree getautofilltree = getAutofillTree.Expanded;
        return (((Boolean) this.read.invoke(getautofilltree)).booleanValue() && (objAnimateTo$material3$default = animateTo$material3$default(this, getautofilltree, this.write, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objAnimateTo$material3$default : createFromParcel.INSTANCE;
    }

    public final Object show(SuspendLambda suspendLambda) {
        Object objAnimateTo$material3$default;
        listValue listvalueRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        getAutofillTree getautofilltree = getAutofillTree.PartiallyExpanded;
        if (!listvalueRemoteActionCompatParcelizer.serializer.containsKey(getautofilltree)) {
            getautofilltree = getAutofillTree.Expanded;
        }
        return (((Boolean) this.read.invoke(getautofilltree)).booleanValue() && (objAnimateTo$material3$default = animateTo$material3$default(this, getautofilltree, this.write, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objAnimateTo$material3$default : createFromParcel.INSTANCE;
    }

    public SheetState(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getAutofillTree getautofilltree, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2) {
        this.MediaDescriptionCompat = z;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = z2;
        if (z && getautofilltree == getAutofillTree.PartiallyExpanded) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && getautofilltree == getAutofillTree.Hidden) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.RemoteActionCompatParcelizer = SheetDefaultsKt.write;
        int i = 0;
        getRootAutofillId getrootautofillid = new getRootAutofillId(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        AndroidAutofillType_androidKt androidAutofillType_androidKt = new AndroidAutofillType_androidKt(4, this);
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState();
        anchoredDraggableState.ParcelableVolumeInfo = getrootautofillid;
        anchoredDraggableState.PlaybackStateCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        anchoredDraggableState.IconCompatParcelizer = androidAutofillType_androidKt;
        anchoredDraggableState.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        anchoredDraggableState.MediaBrowserCompatMediaItem = new setAutofillHints();
        anchoredDraggableState.MediaMetadataCompat = new accessgetGreencp(anchoredDraggableState);
        anchoredDraggableState.MediaDescriptionCompat = CompositionKt.RemoteActionCompatParcelizer(getautofilltree);
        anchoredDraggableState.MediaSessionCompatToken = CompositionKt.serializer(new getAutofillValueui(anchoredDraggableState, i));
        anchoredDraggableState.write = CompositionKt.serializer(new getAutofillValueui(anchoredDraggableState, 1));
        anchoredDraggableState.PlaybackStateCompatCustomAction = getPersonFullName.RemoteActionCompatParcelizer(Float.NaN);
        CompositionKt.serializer(AndroidContentCaptureManager.write, new getAutofillValueui(anchoredDraggableState, 2));
        anchoredDraggableState.RatingCompat = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
        anchoredDraggableState.MediaSessionCompatQueueItem = CompositionKt.RemoteActionCompatParcelizer(null);
        anchoredDraggableState.RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(new listValue(SimpleItemTouchHelperCallback.serializer));
        anchoredDraggableState.read = new getTextValue(anchoredDraggableState);
        this.IconCompatParcelizer = anchoredDraggableState;
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        this.write = (FlowLayoutBuildingBlocksWrapInfo) DelayKt.write(-61142219, iWrite2, 61142223, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[0]);
        int iWrite4 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite5 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite6 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        this.serializer = (FlowLayoutBuildingBlocksWrapInfo) DelayKt.write(-61142219, iWrite5, 61142223, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite6, iWrite4, new Object[0]);
    }

    public final Object hide(ShortNewsContentCardView shortNewsContentCardView) {
        Object objAnimateTo$material3$default;
        if (this.RatingCompat) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        getAutofillTree getautofilltree = getAutofillTree.Hidden;
        return (((Boolean) this.read.invoke(getautofilltree)).booleanValue() && (objAnimateTo$material3$default = animateTo$material3$default(this, getautofilltree, this.serializer, shortNewsContentCardView)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objAnimateTo$material3$default : createFromParcel.INSTANCE;
    }

    public final Object partialExpand(SuspendLambda suspendLambda) {
        Object objAnimateTo$material3$default;
        if (this.MediaDescriptionCompat) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        getAutofillTree getautofilltree = getAutofillTree.PartiallyExpanded;
        return (((Boolean) this.read.invoke(getautofilltree)).booleanValue() && (objAnimateTo$material3$default = animateTo$material3$default(this, getautofilltree, this.serializer, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objAnimateTo$material3$default : createFromParcel.INSTANCE;
    }
}
