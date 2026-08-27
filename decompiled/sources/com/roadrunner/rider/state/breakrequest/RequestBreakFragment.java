package com.roadrunner.rider.state.breakrequest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import com.ui.common.base.BaseRxViewModelKt;
import com.ui.common.widget.chooseoption.entity.ChooseOptionFragmentArguments;
import com.ui.common.widget.chooseoption.entity.SelectionMode;
import com.ui.common.widget.chooseoption.entity.SelectionOptionViewEntity;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AdjustEventSuccess;
import o.AdjustFactory;
import o.BrazeLogger;
import o.C0169getOrderId;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.byte2HexFormatted;
import o.createFromParcel;
import o.ddefault;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.getActivityHandler;
import o.getAttributionHandler;
import o.getGdprUrl;
import o.getImmutablePendingIntentFlags;
import o.getSUPPRESSannotations;
import o.isCircle;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.removeNodeAtDepth;
import o.setPurchaseToken;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestBreakFragment extends BaseInjectionDialogFragment {
    private static int initializeViewTreeOwners = 1;
    private static int onBackPressed;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public ItemSingleChoiceBinding getOnBackPressedDispatcher;
    public dlambda0 getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY invalidateMenu;

    public RequestBreakFragment() {
        RequestBreakFragment$$ExternalSyntheticLambda0 requestBreakFragment$$ExternalSyntheticLambda0 = new RequestBreakFragment$$ExternalSyntheticLambda0(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(13, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(12, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(C0169getOrderId.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 28), requestBreakFragment$$ExternalSyntheticLambda0, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 29));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 109;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.getOnBackPressedDispatcher = null;
        int i4 = initializeViewTreeOwners + 41;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 107;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = initializeViewTreeOwners + 97;
        onBackPressed = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 25;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            layoutInflater.getClass();
            ItemSingleChoiceBinding itemSingleChoiceBinding = ItemSingleChoiceBinding.read(layoutInflater, viewGroup);
            this.getOnBackPressedDispatcher = itemSingleChoiceBinding;
            return itemSingleChoiceBinding.serializer();
        }
        layoutInflater.getClass();
        ItemSingleChoiceBinding itemSingleChoiceBinding2 = ItemSingleChoiceBinding.read(layoutInflater, viewGroup);
        this.getOnBackPressedDispatcher = itemSingleChoiceBinding2;
        itemSingleChoiceBinding2.serializer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        ItemSingleChoiceBinding itemSingleChoiceBinding = this.getOnBackPressedDispatcher;
        itemSingleChoiceBinding.getClass();
        final int i2 = 1;
        ((getImmutablePendingIntentFlags) itemSingleChoiceBinding.write).setEndImageClickListener(new RequestBreakFragment$$ExternalSyntheticLambda0(this, 1));
        final int i3 = 0;
        ((getSUPPRESSannotations) itemSingleChoiceBinding.read).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.rider.state.breakrequest.RequestBreakFragment$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;
            public final /* synthetic */ RequestBreakFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = 2 % 2;
                int i5 = RemoteActionCompatParcelizer + 65;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                RequestBreakFragment requestBreakFragment = this.write;
                if (i7 == 0) {
                    C0169getOrderId c0169getOrderId = (C0169getOrderId) requestBreakFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
                    SharedResourcePool sharedResourcePool = c0169getOrderId.IconCompatParcelizer;
                    String strIconCompatParcelizer = c0169getOrderId.MediaSessionCompatQueueItem.IconCompatParcelizer(R.string.select_duration);
                    List<setPurchaseToken> list = ((byte2HexFormatted) c0169getOrderId.MediaMetadataCompat.write()).serializer;
                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    for (setPurchaseToken setpurchasetoken : list) {
                        arrayList.add(new SelectionOptionViewEntity(setpurchasetoken.RemoteActionCompatParcelizer, setpurchasetoken.write, null, false, 12, null));
                    }
                    sharedResourcePool.serializer(new getAttributionHandler(new ChooseOptionFragmentArguments(strIconCompatParcelizer, arrayList, SelectionMode.SINGLE_CHOICE, null, 8, null)));
                    return;
                }
                C0169getOrderId c0169getOrderId2 = (C0169getOrderId) requestBreakFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
                setPurchaseToken setpurchasetoken2 = ((byte2HexFormatted) c0169getOrderId2.MediaMetadataCompat.write()).RemoteActionCompatParcelizer;
                Object obj = null;
                if (setpurchasetoken2 != null) {
                    int i8 = IconCompatParcelizer + 115;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        String str = setpurchasetoken2.RemoteActionCompatParcelizer;
                        obj.hashCode();
                        throw null;
                    }
                    String str2 = setpurchasetoken2.RemoteActionCompatParcelizer;
                    if (str2 != null) {
                        BaseRxViewModelKt.read(c0169getOrderId2, c0169getOrderId2.serializer.IconCompatParcelizer(str2), new TncContentKt$$ExternalSyntheticLambda1(c0169getOrderId2, 6, str2));
                    }
                }
                int i9 = IconCompatParcelizer + 99;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        ((Button) itemSingleChoiceBinding.serializer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.rider.state.breakrequest.RequestBreakFragment$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;
            public final /* synthetic */ RequestBreakFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = 2 % 2;
                int i5 = RemoteActionCompatParcelizer + 65;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i2;
                RequestBreakFragment requestBreakFragment = this.write;
                if (i7 == 0) {
                    C0169getOrderId c0169getOrderId = (C0169getOrderId) requestBreakFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
                    SharedResourcePool sharedResourcePool = c0169getOrderId.IconCompatParcelizer;
                    String strIconCompatParcelizer = c0169getOrderId.MediaSessionCompatQueueItem.IconCompatParcelizer(R.string.select_duration);
                    List<setPurchaseToken> list = ((byte2HexFormatted) c0169getOrderId.MediaMetadataCompat.write()).serializer;
                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    for (setPurchaseToken setpurchasetoken : list) {
                        arrayList.add(new SelectionOptionViewEntity(setpurchasetoken.RemoteActionCompatParcelizer, setpurchasetoken.write, null, false, 12, null));
                    }
                    sharedResourcePool.serializer(new getAttributionHandler(new ChooseOptionFragmentArguments(strIconCompatParcelizer, arrayList, SelectionMode.SINGLE_CHOICE, null, 8, null)));
                    return;
                }
                C0169getOrderId c0169getOrderId2 = (C0169getOrderId) requestBreakFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
                setPurchaseToken setpurchasetoken2 = ((byte2HexFormatted) c0169getOrderId2.MediaMetadataCompat.write()).RemoteActionCompatParcelizer;
                Object obj = null;
                if (setpurchasetoken2 != null) {
                    int i8 = IconCompatParcelizer + 115;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        String str = setpurchasetoken2.RemoteActionCompatParcelizer;
                        obj.hashCode();
                        throw null;
                    }
                    String str2 = setpurchasetoken2.RemoteActionCompatParcelizer;
                    if (str2 != null) {
                        BaseRxViewModelKt.read(c0169getOrderId2, c0169getOrderId2.serializer.IconCompatParcelizer(str2), new TncContentKt$$ExternalSyntheticLambda1(c0169getOrderId2, 6, str2));
                    }
                }
                int i9 = IconCompatParcelizer + 99;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        ComponentRegistry$Builder componentRegistry$Builder = this.getNavigationEventDispatcher;
        BrazeLogger brazeLoggerSerializer = ((C0169getOrderId) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).serializer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        brazeLoggerSerializer.RemoteActionCompatParcelizer(viewLifecycleOwner, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.rider.state.breakrequest.RequestBreakFragment$$ExternalSyntheticLambda4
            private static int serializer = 0;
            private static int write = 1;
            public final /* synthetic */ RequestBreakFragment read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = i2;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                RequestBreakFragment requestBreakFragment = this.read;
                if (i5 != 0) {
                    byte2HexFormatted byte2hexformatted = (byte2HexFormatted) obj;
                    byte2hexformatted.getClass();
                    setPurchaseToken setpurchasetoken = byte2hexformatted.RemoteActionCompatParcelizer;
                    if (setpurchasetoken != null) {
                        int i6 = serializer + 93;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        ItemSingleChoiceBinding itemSingleChoiceBinding2 = requestBreakFragment.getOnBackPressedDispatcher;
                        itemSingleChoiceBinding2.getClass();
                        ((getSUPPRESSannotations) itemSingleChoiceBinding2.read).setText(setpurchasetoken.write);
                        ItemSingleChoiceBinding itemSingleChoiceBinding3 = requestBreakFragment.getOnBackPressedDispatcher;
                        itemSingleChoiceBinding3.getClass();
                        ((Button) itemSingleChoiceBinding3.serializer).setEnabled(true);
                    }
                    return createfromparcel;
                }
                AdjustEventSuccess adjustEventSuccess = (AdjustEventSuccess) obj;
                adjustEventSuccess.getClass();
                if (adjustEventSuccess.equals(AdjustFactory.serializer)) {
                    requestBreakFragment.getParentFragmentManager().write(new Bundle(0), "break-request-dialog-request-key");
                    requestBreakFragment.read(false, false);
                    int i8 = serializer + 119;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else if (!(!(adjustEventSuccess instanceof getActivityHandler))) {
                    int i10 = write + 1;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getGdprUrl getgdprurl = ((getActivityHandler) adjustEventSuccess).IconCompatParcelizer;
                    dlambda0 dlambda0Var = requestBreakFragment.getSavedStateRegistry;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView = requestBreakFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, getgdprurl.write, ddefault.IconCompatParcelizer, 0, null, null, 56);
                } else if (adjustEventSuccess instanceof getAttributionHandler) {
                    ChooseOptionFragmentArguments chooseOptionFragmentArguments = ((getAttributionHandler) adjustEventSuccess).read;
                    SelectBreakDurationFragment selectBreakDurationFragment = new SelectBreakDurationFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("args-options", chooseOptionFragmentArguments);
                    selectBreakDurationFragment.setArguments(bundle2);
                    selectBreakDurationFragment.RemoteActionCompatParcelizer(requestBreakFragment.getParentFragmentManager(), "com.roadrunner.rider.state.breakrequest.SelectBreakDurationFragment");
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    createfromparcel = null;
                }
                int i12 = write + 81;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            }
        });
        isCircle.write(this, new StringsKt__StringsKt$$ExternalSyntheticLambda1(12, this));
        SharedResourcePool sharedResourcePool = ((C0169getOrderId) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.rider.state.breakrequest.RequestBreakFragment$$ExternalSyntheticLambda4
            private static int serializer = 0;
            private static int write = 1;
            public final /* synthetic */ RequestBreakFragment read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = i3;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                RequestBreakFragment requestBreakFragment = this.read;
                if (i5 != 0) {
                    byte2HexFormatted byte2hexformatted = (byte2HexFormatted) obj;
                    byte2hexformatted.getClass();
                    setPurchaseToken setpurchasetoken = byte2hexformatted.RemoteActionCompatParcelizer;
                    if (setpurchasetoken != null) {
                        int i6 = serializer + 93;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        ItemSingleChoiceBinding itemSingleChoiceBinding2 = requestBreakFragment.getOnBackPressedDispatcher;
                        itemSingleChoiceBinding2.getClass();
                        ((getSUPPRESSannotations) itemSingleChoiceBinding2.read).setText(setpurchasetoken.write);
                        ItemSingleChoiceBinding itemSingleChoiceBinding3 = requestBreakFragment.getOnBackPressedDispatcher;
                        itemSingleChoiceBinding3.getClass();
                        ((Button) itemSingleChoiceBinding3.serializer).setEnabled(true);
                    }
                    return createfromparcel;
                }
                AdjustEventSuccess adjustEventSuccess = (AdjustEventSuccess) obj;
                adjustEventSuccess.getClass();
                if (adjustEventSuccess.equals(AdjustFactory.serializer)) {
                    requestBreakFragment.getParentFragmentManager().write(new Bundle(0), "break-request-dialog-request-key");
                    requestBreakFragment.read(false, false);
                    int i8 = serializer + 119;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else if (!(!(adjustEventSuccess instanceof getActivityHandler))) {
                    int i10 = write + 1;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getGdprUrl getgdprurl = ((getActivityHandler) adjustEventSuccess).IconCompatParcelizer;
                    dlambda0 dlambda0Var = requestBreakFragment.getSavedStateRegistry;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView = requestBreakFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, getgdprurl.write, ddefault.IconCompatParcelizer, 0, null, null, 56);
                } else if (adjustEventSuccess instanceof getAttributionHandler) {
                    ChooseOptionFragmentArguments chooseOptionFragmentArguments = ((getAttributionHandler) adjustEventSuccess).read;
                    SelectBreakDurationFragment selectBreakDurationFragment = new SelectBreakDurationFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("args-options", chooseOptionFragmentArguments);
                    selectBreakDurationFragment.setArguments(bundle2);
                    selectBreakDurationFragment.RemoteActionCompatParcelizer(requestBreakFragment.getParentFragmentManager(), "com.roadrunner.rider.state.breakrequest.SelectBreakDurationFragment");
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    createfromparcel = null;
                }
                int i12 = write + 81;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            }
        });
        int i4 = onBackPressed + 117;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
