package com.roadrunner.order.history.presentation.main;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.navigation.fragment.FragmentKt;
import androidx.navigation.internal.NavContext;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.order.history.databinding.LayoutNoDeliveryBinding;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;
import com.roadrunner.settings.SettingsFragment;
import com.ui.common.base.BaseInjectionFragment;
import com.ui.common.widget.calendar.CalendarView;
import com.ui.common.widget.calendar.DefaultCalendarManager;
import io.grpc.internal.SharedResourcePool;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.LazyKt__LazyJVMKt;
import o.BrazeContentCardsManager;
import o.BrazeExternalSyntheticLambda28;
import o.BrazeLogger;
import o.ExtrasKt;
import o.accessisRenderNodeCompatiblecp;
import o.accessupdateSelectedPaymentOption;
import o.addOval;
import o.createFromParcel;
import o.cubicTo;
import o.ddefault;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.formatDate;
import o.formatDatedefault;
import o.getDefaultCapKaPHkGw;
import o.getOffVariationName;
import o.getVERBOSEannotations;
import o.initializeComponents;
import o.internalConicToQuadratics;
import o.isAdapterPositionOnScreen;
import o.isAppSetIdReadingEnabled;
import o.isRendererInitialised;
import o.jsonStringToList;
import o.lambdanew2;
import o.nowInSeconds;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.opN5in7k0;
import o.quadraticBezierTo;
import o.r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.relativeMoveTo;
import o.removeLayers;
import o.removeNodeAtDepth;
import o.setAccuracyRadius;
import o.setNativeShader;
import o.setOnLoggedCallback;
import o.styleAccuracy;
import o.toAndroidTileMode0vamqd0;
import o.toStringSafe;
import o.transform58bKbWc;
import o.vdefault;
import o.z7ExternalSyntheticLambda0;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryFragment extends BaseInjectionFragment {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public getDefaultCapKaPHkGw IconCompatParcelizer;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaBrowserCompatMediaItem;
    public final ComponentRegistry$Builder MediaDescriptionCompat;
    public dlambda0 MediaMetadataCompat;
    public jsonStringToList RemoteActionCompatParcelizer;
    public BrazeExternalSyntheticLambda28 read;
    public final r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs serializer;
    public final isAdapterPositionOnScreen write;

    public HistoryFragment() {
        super(R.layout.fragment_main_history);
        HistoryFragment$$ExternalSyntheticLambda0 historyFragment$$ExternalSyntheticLambda0 = new HistoryFragment$$ExternalSyntheticLambda0(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(26, new internalConicToQuadratics(25, this)));
        this.MediaDescriptionCompat = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(ExtrasKt.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 13), historyFragment$$ExternalSyntheticLambda0, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 14));
        this.serializer = new r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs();
        this.write = new isAdapterPositionOnScreen(new HistoryFragment$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 59;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            this.IconCompatParcelizer = null;
        } else {
            super.onDestroyView();
            this.IconCompatParcelizer = null;
            int i3 = 60 / 0;
        }
    }

    public final ExtrasKt write() {
        ExtrasKt extrasKt;
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            extrasKt = (ExtrasKt) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
            int i3 = 92 / 0;
        } else {
            extrasKt = (ExtrasKt) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = RatingCompat + 3;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return extrasKt;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        getDefaultCapKaPHkGw getdefaultcapkaphkgwIconCompatParcelizer = getDefaultCapKaPHkGw.IconCompatParcelizer(layoutInflater, viewGroup);
        this.IconCompatParcelizer = getdefaultcapkaphkgwIconCompatParcelizer;
        CoordinatorLayout coordinatorLayout = getdefaultcapkaphkgwIconCompatParcelizer.read();
        coordinatorLayout.getClass();
        int i4 = RatingCompat + 91;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return coordinatorLayout;
        }
        throw null;
    }

    public final void read(isRendererInitialised isrendererinitialised) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 25;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.IconCompatParcelizer;
            getdefaultcapkaphkgw.getClass();
            ((z7ExternalSyntheticLambda0) getdefaultcapkaphkgw.read).read();
            isrendererinitialised.serializer();
            throw null;
        }
        getDefaultCapKaPHkGw getdefaultcapkaphkgw2 = this.IconCompatParcelizer;
        getdefaultcapkaphkgw2.getClass();
        LinearLayout linearLayout = ((z7ExternalSyntheticLambda0) getdefaultcapkaphkgw2.read).read();
        if (!isrendererinitialised.serializer()) {
            i = 8;
        } else {
            int i4 = MediaSessionCompatQueueItem + 17;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onResume();
        write().RemoteActionCompatParcelizer();
        write().serializer(((DefaultCalendarManager) this.write.MediaSessionCompatResultReceiverWrapper()).MediaDescriptionCompat());
        int i4 = MediaSessionCompatQueueItem + 71;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void serializer(isRendererInitialised isrendererinitialised) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 105;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.IconCompatParcelizer;
        getdefaultcapkaphkgw.getClass();
        NestedScrollView nestedScrollView = (NestedScrollView) getdefaultcapkaphkgw.write;
        if (isrendererinitialised.serializer()) {
            i = 8;
        } else {
            int i5 = RatingCompat + 79;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            i = i5 % 2 == 0 ? 1 : 0;
        }
        nestedScrollView.setVisibility(i);
        ((ConstraintLayout) ((ItemSingleChoiceBinding) getdefaultcapkaphkgw.IconCompatParcelizer).read).setVisibility(isrendererinitialised.read() ? 0 : 8);
        ((ConstraintLayout) ((LayoutNoDeliveryBinding) getdefaultcapkaphkgw.MediaDescriptionCompat).serializer).setVisibility(isrendererinitialised.read() ? 8 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 2;
        int i2 = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.IconCompatParcelizer;
        getdefaultcapkaphkgw.getClass();
        RecyclerView recyclerView = (RecyclerView) ((ItemSingleChoiceBinding) getdefaultcapkaphkgw.IconCompatParcelizer).serializer;
        setOnLoggedCallback.IconCompatParcelizer(recyclerView, new vdefault());
        recyclerView.setAdapter(this.serializer);
        CalendarView calendarView = (CalendarView) getdefaultcapkaphkgw.RemoteActionCompatParcelizer;
        calendarView.setOnDateSelected(new SettingsFragment.AnonymousClass1(this));
        calendarView.setCalendarBehaviour((DefaultCalendarManager) this.write.MediaSessionCompatResultReceiverWrapper());
        ((getVERBOSEannotations) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem).read(new HistoryFragment$$ExternalSyntheticLambda0(this, 2));
        BrazeLogger brazeLoggerWrite = write().write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i3 = 0;
        brazeLoggerWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ HistoryFragment read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i4;
                opN5in7k0 opn5in7k0;
                Bundle bundle2;
                transform58bKbWc transform58bkbwc;
                int i5;
                Object obj2;
                int i6 = 2 % 2;
                int i7 = i3;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                HistoryFragment historyFragment = this.read;
                if (i7 == 0) {
                    isRendererInitialised isrendererinitialised = (isRendererInitialised) obj;
                    isrendererinitialised.getClass();
                    if (isrendererinitialised.equals(initializeComponents.write)) {
                        historyFragment.read(isrendererinitialised);
                    } else if (!(!(isrendererinitialised instanceof removeLayers))) {
                        int i8 = IconCompatParcelizer + 77;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        removeLayers removelayers = (removeLayers) isrendererinitialised;
                        boolean z = removelayers.read;
                        historyFragment.read(removelayers);
                        historyFragment.serializer(removelayers);
                        historyFragment.serializer.write.IconCompatParcelizer(removelayers.IconCompatParcelizer, null);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw2 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw2.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw2.MediaMetadataCompat).setSummation(removelayers.MediaBrowserCompatMediaItem);
                        accessupdateSelectedPaymentOption accessupdateselectedpaymentoption = (accessupdateSelectedPaymentOption) ((ItemSingleChoiceBinding) getdefaultcapkaphkgw2.IconCompatParcelizer).write;
                        if (z) {
                            int i10 = serializer + 39;
                            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        accessupdateselectedpaymentoption.setVisibility(i4);
                        if (z) {
                            int i12 = serializer + 97;
                            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            setAccuracyRadius setaccuracyradius = removelayers.write;
                            if (setaccuracyradius == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                                return null;
                            }
                            ((formatDate) accessupdateselectedpaymentoption.IconCompatParcelizer.serializer).read(new formatDatedefault(setaccuracyradius.serializer, setaccuracyradius.RemoteActionCompatParcelizer, Integer.valueOf(setaccuracyradius.read), true, new toStringSafe(Integer.valueOf(R.drawable.ic_bold_large_essentials_warning), setaccuracyradius.IconCompatParcelizer), setaccuracyradius.write));
                        }
                    } else {
                        if (!(isrendererinitialised instanceof styleAccuracy)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        styleAccuracy styleaccuracy = (styleAccuracy) isrendererinitialised;
                        historyFragment.read(styleaccuracy);
                        historyFragment.serializer(styleaccuracy);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw3 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw3.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw3.MediaMetadataCompat).setSummation(styleaccuracy.IconCompatParcelizer);
                    }
                    getDefaultCapKaPHkGw getdefaultcapkaphkgw4 = historyFragment.IconCompatParcelizer;
                    getdefaultcapkaphkgw4.getClass();
                    ((getVERBOSEannotations) getdefaultcapkaphkgw4.MediaBrowserCompatMediaItem).setRefreshing(false);
                    return createfromparcel;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        LocalDate localDate = (LocalDate) obj;
                        localDate.getClass();
                        historyFragment.write().IconCompatParcelizer(localDate);
                        return createfromparcel;
                    }
                    String str = (String) obj;
                    str.getClass();
                    dlambda0 dlambda0Var = historyFragment.MediaMetadataCompat;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView = historyFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefault.IconCompatParcelizer, 0, null, null, 56);
                    return createfromparcel;
                }
                Parcelable parcelable = (OrderDetails) obj;
                parcelable.getClass();
                relativeMoveTo relativemovetoWrite = FragmentKt.write(historyFragment);
                relativemovetoWrite.getClass();
                toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemovetoWrite.read;
                opN5in7k0 opn5in7k0Write = toandroidtilemode0vamqd0.write();
                BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
                if (opn5in7k0Write == null || opn5in7k0Write.serializer() == null) {
                    return createfromparcel;
                }
                Bundle bundle3 = new Bundle();
                if (!Parcelable.class.isAssignableFrom(OrderDetails.class)) {
                    if (Serializable.class.isAssignableFrom(OrderDetails.class)) {
                        bundle3.putSerializable("orderDetails", (Serializable) parcelable);
                    } else {
                        IBraze$$ExternalSyntheticBUOutline0.m(OrderDetails.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    return null;
                }
                bundle3.putParcelable("orderDetails", parcelable);
                NavContext navContext = relativemovetoWrite.MediaMetadataCompat;
                if (brazeContentCardsManager.isEmpty()) {
                    int i14 = IconCompatParcelizer + 75;
                    serializer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    opn5in7k0 = toandroidtilemode0vamqd0.write;
                } else {
                    opn5in7k0 = ((cubicTo) brazeContentCardsManager.serializer()).IconCompatParcelizer;
                }
                if (opn5in7k0 == null) {
                    throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + relativemovetoWrite + '.');
                }
                addOval addovalSerializer = opn5in7k0.serializer();
                if (addovalSerializer != null) {
                    transform58bkbwc = addovalSerializer.write;
                    i5 = addovalSerializer.serializer;
                    Bundle bundle4 = addovalSerializer.RemoteActionCompatParcelizer;
                    if (bundle4 != null) {
                        int i16 = IconCompatParcelizer + 99;
                        serializer = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 == 0) {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        } else {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        }
                        bundle2 = (Bundle) obj2;
                        bundle2.putAll(bundle4);
                    } else {
                        bundle2 = null;
                    }
                } else {
                    bundle2 = null;
                    transform58bkbwc = null;
                    i5 = R.id.show_order_details;
                }
                if (bundle2 == null) {
                    bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                }
                bundle2.putAll(bundle3);
                if (i5 == 0 && transform58bkbwc != null) {
                    boolean z2 = transform58bkbwc.MediaSessionCompatQueueItem;
                    String str2 = transform58bkbwc.MediaMetadataCompat;
                    int i17 = transform58bkbwc.read;
                    if (i17 != -1 || str2 != null) {
                        if (str2 != null) {
                            relativeMoveTo.RemoteActionCompatParcelizer(relativemovetoWrite, str2, z2);
                            return createfromparcel;
                        }
                        if (i17 == -1 || !toandroidtilemode0vamqd0.write(i17, z2, false)) {
                            return createfromparcel;
                        }
                        toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
                        return createfromparcel;
                    }
                }
                if (i5 != 0) {
                    opN5in7k0 opn5in7k0IconCompatParcelizer = toandroidtilemode0vamqd0.IconCompatParcelizer(i5, null);
                    if (opn5in7k0IconCompatParcelizer != null) {
                        toandroidtilemode0vamqd0.serializer(opn5in7k0IconCompatParcelizer, bundle2, transform58bkbwc);
                        return createfromparcel;
                    }
                    int i18 = IconCompatParcelizer + 39;
                    serializer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    int i20 = opN5in7k0.write;
                    String strSerializer = quadraticBezierTo.serializer(navContext, i5);
                    if (addovalSerializer != null) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Navigation destination ", strSerializer, " referenced from action ");
                        sbM.append(quadraticBezierTo.serializer(navContext, R.id.show_order_details));
                        sbM.append(" cannot be found from the current destination ");
                        sbM.append(opn5in7k0);
                        throw new IllegalArgumentException(sbM.toString().toString());
                    }
                    getOffVariationName.read("Navigation action/destination ", strSerializer, " cannot be found from the current destination ", opn5in7k0);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
                return null;
            }
        });
        SharedResourcePool sharedResourcePoolSerializer = write().serializer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        final int i4 = 1;
        sharedResourcePoolSerializer.RemoteActionCompatParcelizer(viewLifecycleOwner2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ HistoryFragment read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i5;
                opN5in7k0 opn5in7k0;
                Bundle bundle2;
                transform58bKbWc transform58bkbwc;
                int i6;
                Object obj2;
                int i7 = 2 % 2;
                int i8 = i4;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                HistoryFragment historyFragment = this.read;
                if (i8 == 0) {
                    isRendererInitialised isrendererinitialised = (isRendererInitialised) obj;
                    isrendererinitialised.getClass();
                    if (isrendererinitialised.equals(initializeComponents.write)) {
                        historyFragment.read(isrendererinitialised);
                    } else if (!(!(isrendererinitialised instanceof removeLayers))) {
                        int i9 = IconCompatParcelizer + 77;
                        serializer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        removeLayers removelayers = (removeLayers) isrendererinitialised;
                        boolean z = removelayers.read;
                        historyFragment.read(removelayers);
                        historyFragment.serializer(removelayers);
                        historyFragment.serializer.write.IconCompatParcelizer(removelayers.IconCompatParcelizer, null);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw2 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw2.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw2.MediaMetadataCompat).setSummation(removelayers.MediaBrowserCompatMediaItem);
                        accessupdateSelectedPaymentOption accessupdateselectedpaymentoption = (accessupdateSelectedPaymentOption) ((ItemSingleChoiceBinding) getdefaultcapkaphkgw2.IconCompatParcelizer).write;
                        if (z) {
                            int i11 = serializer + 39;
                            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        accessupdateselectedpaymentoption.setVisibility(i5);
                        if (z) {
                            int i13 = serializer + 97;
                            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            setAccuracyRadius setaccuracyradius = removelayers.write;
                            if (setaccuracyradius == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                                return null;
                            }
                            ((formatDate) accessupdateselectedpaymentoption.IconCompatParcelizer.serializer).read(new formatDatedefault(setaccuracyradius.serializer, setaccuracyradius.RemoteActionCompatParcelizer, Integer.valueOf(setaccuracyradius.read), true, new toStringSafe(Integer.valueOf(R.drawable.ic_bold_large_essentials_warning), setaccuracyradius.IconCompatParcelizer), setaccuracyradius.write));
                        }
                    } else {
                        if (!(isrendererinitialised instanceof styleAccuracy)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        styleAccuracy styleaccuracy = (styleAccuracy) isrendererinitialised;
                        historyFragment.read(styleaccuracy);
                        historyFragment.serializer(styleaccuracy);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw3 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw3.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw3.MediaMetadataCompat).setSummation(styleaccuracy.IconCompatParcelizer);
                    }
                    getDefaultCapKaPHkGw getdefaultcapkaphkgw4 = historyFragment.IconCompatParcelizer;
                    getdefaultcapkaphkgw4.getClass();
                    ((getVERBOSEannotations) getdefaultcapkaphkgw4.MediaBrowserCompatMediaItem).setRefreshing(false);
                    return createfromparcel;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        LocalDate localDate = (LocalDate) obj;
                        localDate.getClass();
                        historyFragment.write().IconCompatParcelizer(localDate);
                        return createfromparcel;
                    }
                    String str = (String) obj;
                    str.getClass();
                    dlambda0 dlambda0Var = historyFragment.MediaMetadataCompat;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView = historyFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefault.IconCompatParcelizer, 0, null, null, 56);
                    return createfromparcel;
                }
                Parcelable parcelable = (OrderDetails) obj;
                parcelable.getClass();
                relativeMoveTo relativemovetoWrite = FragmentKt.write(historyFragment);
                relativemovetoWrite.getClass();
                toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemovetoWrite.read;
                opN5in7k0 opn5in7k0Write = toandroidtilemode0vamqd0.write();
                BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
                if (opn5in7k0Write == null || opn5in7k0Write.serializer() == null) {
                    return createfromparcel;
                }
                Bundle bundle3 = new Bundle();
                if (!Parcelable.class.isAssignableFrom(OrderDetails.class)) {
                    if (Serializable.class.isAssignableFrom(OrderDetails.class)) {
                        bundle3.putSerializable("orderDetails", (Serializable) parcelable);
                    } else {
                        IBraze$$ExternalSyntheticBUOutline0.m(OrderDetails.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    return null;
                }
                bundle3.putParcelable("orderDetails", parcelable);
                NavContext navContext = relativemovetoWrite.MediaMetadataCompat;
                if (brazeContentCardsManager.isEmpty()) {
                    int i15 = IconCompatParcelizer + 75;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    opn5in7k0 = toandroidtilemode0vamqd0.write;
                } else {
                    opn5in7k0 = ((cubicTo) brazeContentCardsManager.serializer()).IconCompatParcelizer;
                }
                if (opn5in7k0 == null) {
                    throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + relativemovetoWrite + '.');
                }
                addOval addovalSerializer = opn5in7k0.serializer();
                if (addovalSerializer != null) {
                    transform58bkbwc = addovalSerializer.write;
                    i6 = addovalSerializer.serializer;
                    Bundle bundle4 = addovalSerializer.RemoteActionCompatParcelizer;
                    if (bundle4 != null) {
                        int i17 = IconCompatParcelizer + 99;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        } else {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        }
                        bundle2 = (Bundle) obj2;
                        bundle2.putAll(bundle4);
                    } else {
                        bundle2 = null;
                    }
                } else {
                    bundle2 = null;
                    transform58bkbwc = null;
                    i6 = R.id.show_order_details;
                }
                if (bundle2 == null) {
                    bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                }
                bundle2.putAll(bundle3);
                if (i6 == 0 && transform58bkbwc != null) {
                    boolean z2 = transform58bkbwc.MediaSessionCompatQueueItem;
                    String str2 = transform58bkbwc.MediaMetadataCompat;
                    int i18 = transform58bkbwc.read;
                    if (i18 != -1 || str2 != null) {
                        if (str2 != null) {
                            relativeMoveTo.RemoteActionCompatParcelizer(relativemovetoWrite, str2, z2);
                            return createfromparcel;
                        }
                        if (i18 == -1 || !toandroidtilemode0vamqd0.write(i18, z2, false)) {
                            return createfromparcel;
                        }
                        toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
                        return createfromparcel;
                    }
                }
                if (i6 != 0) {
                    opN5in7k0 opn5in7k0IconCompatParcelizer = toandroidtilemode0vamqd0.IconCompatParcelizer(i6, null);
                    if (opn5in7k0IconCompatParcelizer != null) {
                        toandroidtilemode0vamqd0.serializer(opn5in7k0IconCompatParcelizer, bundle2, transform58bkbwc);
                        return createfromparcel;
                    }
                    int i19 = IconCompatParcelizer + 39;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    int i20 = opN5in7k0.write;
                    String strSerializer = quadraticBezierTo.serializer(navContext, i6);
                    if (addovalSerializer != null) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Navigation destination ", strSerializer, " referenced from action ");
                        sbM.append(quadraticBezierTo.serializer(navContext, R.id.show_order_details));
                        sbM.append(" cannot be found from the current destination ");
                        sbM.append(opn5in7k0);
                        throw new IllegalArgumentException(sbM.toString().toString());
                    }
                    getOffVariationName.read("Navigation action/destination ", strSerializer, " cannot be found from the current destination ", opn5in7k0);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
                return null;
            }
        });
        SharedResourcePool sharedResourcePoolIconCompatParcelizer = write().IconCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        sharedResourcePoolIconCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner3, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ HistoryFragment read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i5;
                opN5in7k0 opn5in7k0;
                Bundle bundle2;
                transform58bKbWc transform58bkbwc;
                int i6;
                Object obj2;
                int i7 = 2 % 2;
                int i8 = i;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                HistoryFragment historyFragment = this.read;
                if (i8 == 0) {
                    isRendererInitialised isrendererinitialised = (isRendererInitialised) obj;
                    isrendererinitialised.getClass();
                    if (isrendererinitialised.equals(initializeComponents.write)) {
                        historyFragment.read(isrendererinitialised);
                    } else if (!(!(isrendererinitialised instanceof removeLayers))) {
                        int i9 = IconCompatParcelizer + 77;
                        serializer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        removeLayers removelayers = (removeLayers) isrendererinitialised;
                        boolean z = removelayers.read;
                        historyFragment.read(removelayers);
                        historyFragment.serializer(removelayers);
                        historyFragment.serializer.write.IconCompatParcelizer(removelayers.IconCompatParcelizer, null);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw2 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw2.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw2.MediaMetadataCompat).setSummation(removelayers.MediaBrowserCompatMediaItem);
                        accessupdateSelectedPaymentOption accessupdateselectedpaymentoption = (accessupdateSelectedPaymentOption) ((ItemSingleChoiceBinding) getdefaultcapkaphkgw2.IconCompatParcelizer).write;
                        if (z) {
                            int i11 = serializer + 39;
                            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        accessupdateselectedpaymentoption.setVisibility(i5);
                        if (z) {
                            int i13 = serializer + 97;
                            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            setAccuracyRadius setaccuracyradius = removelayers.write;
                            if (setaccuracyradius == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                                return null;
                            }
                            ((formatDate) accessupdateselectedpaymentoption.IconCompatParcelizer.serializer).read(new formatDatedefault(setaccuracyradius.serializer, setaccuracyradius.RemoteActionCompatParcelizer, Integer.valueOf(setaccuracyradius.read), true, new toStringSafe(Integer.valueOf(R.drawable.ic_bold_large_essentials_warning), setaccuracyradius.IconCompatParcelizer), setaccuracyradius.write));
                        }
                    } else {
                        if (!(isrendererinitialised instanceof styleAccuracy)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        styleAccuracy styleaccuracy = (styleAccuracy) isrendererinitialised;
                        historyFragment.read(styleaccuracy);
                        historyFragment.serializer(styleaccuracy);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw3 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw3.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw3.MediaMetadataCompat).setSummation(styleaccuracy.IconCompatParcelizer);
                    }
                    getDefaultCapKaPHkGw getdefaultcapkaphkgw4 = historyFragment.IconCompatParcelizer;
                    getdefaultcapkaphkgw4.getClass();
                    ((getVERBOSEannotations) getdefaultcapkaphkgw4.MediaBrowserCompatMediaItem).setRefreshing(false);
                    return createfromparcel;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        LocalDate localDate = (LocalDate) obj;
                        localDate.getClass();
                        historyFragment.write().IconCompatParcelizer(localDate);
                        return createfromparcel;
                    }
                    String str = (String) obj;
                    str.getClass();
                    dlambda0 dlambda0Var = historyFragment.MediaMetadataCompat;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView = historyFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefault.IconCompatParcelizer, 0, null, null, 56);
                    return createfromparcel;
                }
                Parcelable parcelable = (OrderDetails) obj;
                parcelable.getClass();
                relativeMoveTo relativemovetoWrite = FragmentKt.write(historyFragment);
                relativemovetoWrite.getClass();
                toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemovetoWrite.read;
                opN5in7k0 opn5in7k0Write = toandroidtilemode0vamqd0.write();
                BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
                if (opn5in7k0Write == null || opn5in7k0Write.serializer() == null) {
                    return createfromparcel;
                }
                Bundle bundle3 = new Bundle();
                if (!Parcelable.class.isAssignableFrom(OrderDetails.class)) {
                    if (Serializable.class.isAssignableFrom(OrderDetails.class)) {
                        bundle3.putSerializable("orderDetails", (Serializable) parcelable);
                    } else {
                        IBraze$$ExternalSyntheticBUOutline0.m(OrderDetails.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    return null;
                }
                bundle3.putParcelable("orderDetails", parcelable);
                NavContext navContext = relativemovetoWrite.MediaMetadataCompat;
                if (brazeContentCardsManager.isEmpty()) {
                    int i15 = IconCompatParcelizer + 75;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    opn5in7k0 = toandroidtilemode0vamqd0.write;
                } else {
                    opn5in7k0 = ((cubicTo) brazeContentCardsManager.serializer()).IconCompatParcelizer;
                }
                if (opn5in7k0 == null) {
                    throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + relativemovetoWrite + '.');
                }
                addOval addovalSerializer = opn5in7k0.serializer();
                if (addovalSerializer != null) {
                    transform58bkbwc = addovalSerializer.write;
                    i6 = addovalSerializer.serializer;
                    Bundle bundle4 = addovalSerializer.RemoteActionCompatParcelizer;
                    if (bundle4 != null) {
                        int i17 = IconCompatParcelizer + 99;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        } else {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        }
                        bundle2 = (Bundle) obj2;
                        bundle2.putAll(bundle4);
                    } else {
                        bundle2 = null;
                    }
                } else {
                    bundle2 = null;
                    transform58bkbwc = null;
                    i6 = R.id.show_order_details;
                }
                if (bundle2 == null) {
                    bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                }
                bundle2.putAll(bundle3);
                if (i6 == 0 && transform58bkbwc != null) {
                    boolean z2 = transform58bkbwc.MediaSessionCompatQueueItem;
                    String str2 = transform58bkbwc.MediaMetadataCompat;
                    int i18 = transform58bkbwc.read;
                    if (i18 != -1 || str2 != null) {
                        if (str2 != null) {
                            relativeMoveTo.RemoteActionCompatParcelizer(relativemovetoWrite, str2, z2);
                            return createfromparcel;
                        }
                        if (i18 == -1 || !toandroidtilemode0vamqd0.write(i18, z2, false)) {
                            return createfromparcel;
                        }
                        toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
                        return createfromparcel;
                    }
                }
                if (i6 != 0) {
                    opN5in7k0 opn5in7k0IconCompatParcelizer = toandroidtilemode0vamqd0.IconCompatParcelizer(i6, null);
                    if (opn5in7k0IconCompatParcelizer != null) {
                        toandroidtilemode0vamqd0.serializer(opn5in7k0IconCompatParcelizer, bundle2, transform58bkbwc);
                        return createfromparcel;
                    }
                    int i19 = IconCompatParcelizer + 39;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    int i20 = opN5in7k0.write;
                    String strSerializer = quadraticBezierTo.serializer(navContext, i6);
                    if (addovalSerializer != null) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Navigation destination ", strSerializer, " referenced from action ");
                        sbM.append(quadraticBezierTo.serializer(navContext, R.id.show_order_details));
                        sbM.append(" cannot be found from the current destination ");
                        sbM.append(opn5in7k0);
                        throw new IllegalArgumentException(sbM.toString().toString());
                    }
                    getOffVariationName.read("Navigation action/destination ", strSerializer, " cannot be found from the current destination ", opn5in7k0);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
                return null;
            }
        });
        SharedResourcePool sharedResourcePool = write().read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        final int i5 = 3;
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner4, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ HistoryFragment read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i6;
                opN5in7k0 opn5in7k0;
                Bundle bundle2;
                transform58bKbWc transform58bkbwc;
                int i7;
                Object obj2;
                int i8 = 2 % 2;
                int i9 = i5;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                HistoryFragment historyFragment = this.read;
                if (i9 == 0) {
                    isRendererInitialised isrendererinitialised = (isRendererInitialised) obj;
                    isrendererinitialised.getClass();
                    if (isrendererinitialised.equals(initializeComponents.write)) {
                        historyFragment.read(isrendererinitialised);
                    } else if (!(!(isrendererinitialised instanceof removeLayers))) {
                        int i10 = IconCompatParcelizer + 77;
                        serializer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        removeLayers removelayers = (removeLayers) isrendererinitialised;
                        boolean z = removelayers.read;
                        historyFragment.read(removelayers);
                        historyFragment.serializer(removelayers);
                        historyFragment.serializer.write.IconCompatParcelizer(removelayers.IconCompatParcelizer, null);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw2 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw2.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw2.MediaMetadataCompat).setSummation(removelayers.MediaBrowserCompatMediaItem);
                        accessupdateSelectedPaymentOption accessupdateselectedpaymentoption = (accessupdateSelectedPaymentOption) ((ItemSingleChoiceBinding) getdefaultcapkaphkgw2.IconCompatParcelizer).write;
                        if (z) {
                            int i12 = serializer + 39;
                            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        accessupdateselectedpaymentoption.setVisibility(i6);
                        if (z) {
                            int i14 = serializer + 97;
                            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            setAccuracyRadius setaccuracyradius = removelayers.write;
                            if (setaccuracyradius == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                                return null;
                            }
                            ((formatDate) accessupdateselectedpaymentoption.IconCompatParcelizer.serializer).read(new formatDatedefault(setaccuracyradius.serializer, setaccuracyradius.RemoteActionCompatParcelizer, Integer.valueOf(setaccuracyradius.read), true, new toStringSafe(Integer.valueOf(R.drawable.ic_bold_large_essentials_warning), setaccuracyradius.IconCompatParcelizer), setaccuracyradius.write));
                        }
                    } else {
                        if (!(isrendererinitialised instanceof styleAccuracy)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        styleAccuracy styleaccuracy = (styleAccuracy) isrendererinitialised;
                        historyFragment.read(styleaccuracy);
                        historyFragment.serializer(styleaccuracy);
                        getDefaultCapKaPHkGw getdefaultcapkaphkgw3 = historyFragment.IconCompatParcelizer;
                        getdefaultcapkaphkgw3.getClass();
                        ((nowInSeconds) getdefaultcapkaphkgw3.MediaMetadataCompat).setSummation(styleaccuracy.IconCompatParcelizer);
                    }
                    getDefaultCapKaPHkGw getdefaultcapkaphkgw4 = historyFragment.IconCompatParcelizer;
                    getdefaultcapkaphkgw4.getClass();
                    ((getVERBOSEannotations) getdefaultcapkaphkgw4.MediaBrowserCompatMediaItem).setRefreshing(false);
                    return createfromparcel;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        LocalDate localDate = (LocalDate) obj;
                        localDate.getClass();
                        historyFragment.write().IconCompatParcelizer(localDate);
                        return createfromparcel;
                    }
                    String str = (String) obj;
                    str.getClass();
                    dlambda0 dlambda0Var = historyFragment.MediaMetadataCompat;
                    if (dlambda0Var == null) {
                        removeNodeAtDepth.serializer("snackBarManager");
                        throw null;
                    }
                    View viewRequireView = historyFragment.requireView();
                    viewRequireView.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefault.IconCompatParcelizer, 0, null, null, 56);
                    return createfromparcel;
                }
                Parcelable parcelable = (OrderDetails) obj;
                parcelable.getClass();
                relativeMoveTo relativemovetoWrite = FragmentKt.write(historyFragment);
                relativemovetoWrite.getClass();
                toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemovetoWrite.read;
                opN5in7k0 opn5in7k0Write = toandroidtilemode0vamqd0.write();
                BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
                if (opn5in7k0Write == null || opn5in7k0Write.serializer() == null) {
                    return createfromparcel;
                }
                Bundle bundle3 = new Bundle();
                if (!Parcelable.class.isAssignableFrom(OrderDetails.class)) {
                    if (Serializable.class.isAssignableFrom(OrderDetails.class)) {
                        bundle3.putSerializable("orderDetails", (Serializable) parcelable);
                    } else {
                        IBraze$$ExternalSyntheticBUOutline0.m(OrderDetails.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    return null;
                }
                bundle3.putParcelable("orderDetails", parcelable);
                NavContext navContext = relativemovetoWrite.MediaMetadataCompat;
                if (brazeContentCardsManager.isEmpty()) {
                    int i16 = IconCompatParcelizer + 75;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    opn5in7k0 = toandroidtilemode0vamqd0.write;
                } else {
                    opn5in7k0 = ((cubicTo) brazeContentCardsManager.serializer()).IconCompatParcelizer;
                }
                if (opn5in7k0 == null) {
                    throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + relativemovetoWrite + '.');
                }
                addOval addovalSerializer = opn5in7k0.serializer();
                if (addovalSerializer != null) {
                    transform58bkbwc = addovalSerializer.write;
                    i7 = addovalSerializer.serializer;
                    Bundle bundle4 = addovalSerializer.RemoteActionCompatParcelizer;
                    if (bundle4 != null) {
                        int i18 = IconCompatParcelizer + 99;
                        serializer = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 == 0) {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        } else {
                            obj2 = setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        }
                        bundle2 = (Bundle) obj2;
                        bundle2.putAll(bundle4);
                    } else {
                        bundle2 = null;
                    }
                } else {
                    bundle2 = null;
                    transform58bkbwc = null;
                    i7 = R.id.show_order_details;
                }
                if (bundle2 == null) {
                    bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                }
                bundle2.putAll(bundle3);
                if (i7 == 0 && transform58bkbwc != null) {
                    boolean z2 = transform58bkbwc.MediaSessionCompatQueueItem;
                    String str2 = transform58bkbwc.MediaMetadataCompat;
                    int i19 = transform58bkbwc.read;
                    if (i19 != -1 || str2 != null) {
                        if (str2 != null) {
                            relativeMoveTo.RemoteActionCompatParcelizer(relativemovetoWrite, str2, z2);
                            return createfromparcel;
                        }
                        if (i19 == -1 || !toandroidtilemode0vamqd0.write(i19, z2, false)) {
                            return createfromparcel;
                        }
                        toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
                        return createfromparcel;
                    }
                }
                if (i7 != 0) {
                    opN5in7k0 opn5in7k0IconCompatParcelizer = toandroidtilemode0vamqd0.IconCompatParcelizer(i7, null);
                    if (opn5in7k0IconCompatParcelizer != null) {
                        toandroidtilemode0vamqd0.serializer(opn5in7k0IconCompatParcelizer, bundle2, transform58bkbwc);
                        return createfromparcel;
                    }
                    int i110 = IconCompatParcelizer + 39;
                    serializer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    int i20 = opN5in7k0.write;
                    String strSerializer = quadraticBezierTo.serializer(navContext, i7);
                    if (addovalSerializer != null) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Navigation destination ", strSerializer, " referenced from action ");
                        sbM.append(quadraticBezierTo.serializer(navContext, R.id.show_order_details));
                        sbM.append(" cannot be found from the current destination ");
                        sbM.append(opn5in7k0);
                        throw new IllegalArgumentException(sbM.toString().toString());
                    }
                    getOffVariationName.read("Navigation action/destination ", strSerializer, " cannot be found from the current destination ", opn5in7k0);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
                return null;
            }
        });
        int i6 = RatingCompat + 83;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
