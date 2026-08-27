package com.ui.common.widget;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.fragment.FragmentKt;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuverView;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuversList;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.ui.common.widget.chooseoption.ChooseOptionFragment;
import io.socket.client.Manager$7;
import java.util.Timer;
import o.AsyncImage76YX9Dk;
import o.ValueInsets;
import o.containsAll;
import o.createDatedefault;
import o.formatDate;
import o.formatDatedefault;
import o.getSUPPRESSannotations;
import o.obtainBrushFromComplexColor;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeIf;
import o.toStringSafe;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThrottledButton$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ThrottledButton$$ExternalSyntheticLambda0(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        Object obj = this.read;
        Object obj2 = null;
        int i6 = 0;
        switch (i5) {
            case 0:
                getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) obj;
                if (getsuppressannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    int i7 = RemoteActionCompatParcelizer + 25;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    getsuppressannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
                    View.OnClickListener onClickListener = getsuppressannotations.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    if (onClickListener != null) {
                        int i9 = IconCompatParcelizer + 91;
                        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            onClickListener.onClick(getsuppressannotations);
                            obj2.hashCode();
                            throw null;
                        }
                        onClickListener.onClick(getsuppressannotations);
                    }
                    new Timer().schedule(new Manager$7(i, getsuppressannotations), getsuppressannotations.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                    return;
                }
                return;
            case 1:
                DefaultInAppMessageViewWrapper.createClickListener$lambda$0((DefaultInAppMessageViewWrapper) obj, view);
                return;
            case 2:
                DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$1((DefaultInAppMessageModalViewFactory) obj, view);
                return;
            case 3:
                InAppMessageModalView.resetMessageMargins$lambda$0((InAppMessageModalView) obj, view);
                return;
            case 4:
                ((obtainBrushFromComplexColor) obj).RemoteActionCompatParcelizer.invoke();
                return;
            case 5:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) obj;
                materialDatePicker.onActivityResult.setEnabled(((SingleDateSelector) materialDatePicker.serializer()).IconCompatParcelizer != null);
                materialDatePicker.onCreatePanelMenu.toggle();
                if (materialDatePicker.onMenuItemSelected == 1) {
                    int i10 = IconCompatParcelizer + 33;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    i6 = i10 % 2 != 0 ? 1 : 0;
                }
                materialDatePicker.onMenuItemSelected = i6;
                materialDatePicker.IconCompatParcelizer(materialDatePicker.onCreatePanelMenu);
                materialDatePicker.RatingCompat();
                return;
            case 6:
                containsAll containsall = (containsAll) obj;
                EditText editText = containsall.IconCompatParcelizer;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                containsall.MediaSessionCompatToken();
                return;
            case 7:
                ((removeIf) obj).MediaSessionCompatQueueItem();
                return;
            case 8:
                ValueInsets valueInsets = (ValueInsets) obj;
                EditText editText2 = valueInsets.serializer;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = valueInsets.serializer;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    i6 = 1;
                }
                EditText editText4 = valueInsets.serializer;
                if (i6 != 0) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    int i11 = RemoteActionCompatParcelizer + 117;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        valueInsets.serializer.setSelection(selectionEnd);
                        obj2.hashCode();
                        throw null;
                    }
                    valueInsets.serializer.setSelection(selectionEnd);
                }
                valueInsets.MediaSessionCompatToken();
                return;
            case 9:
                MapboxManeuverView mapboxManeuverView = (MapboxManeuverView) obj;
                ItemSingleChoiceBinding itemSingleChoiceBinding = mapboxManeuverView.binding;
                if (!mapboxManeuverView.upcomingManeuverRenderingEnabled) {
                    return;
                }
                int i12 = RemoteActionCompatParcelizer + 71;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0 ? ((MapboxManeuversList) itemSingleChoiceBinding.write).getVisibility() != 8 : ((MapboxManeuversList) itemSingleChoiceBinding.write).getVisibility() != 10) {
                    mapboxManeuverView.updateUpcomingManeuversVisibility(8);
                    ((MapboxManeuversList) itemSingleChoiceBinding.write).smoothScrollToPosition(0);
                    ((ConstraintLayout) itemSingleChoiceBinding.serializer).setVisibility(((ConstraintLayout) itemSingleChoiceBinding.serializer).getVisibility());
                    return;
                } else {
                    int i13 = RemoteActionCompatParcelizer + 61;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        mapboxManeuverView.updateUpcomingManeuversVisibility(1);
                        return;
                    } else {
                        mapboxManeuverView.updateUpcomingManeuversVisibility(0);
                        return;
                    }
                }
            case 10:
                HelpCenterActivity.RemoteActionCompatParcelizer((HelpCenterActivity) obj, view);
                return;
            case 11:
                FragmentKt.write((OrderDetailsFragment) obj).write();
                return;
            case 12:
                ((AsyncImage76YX9Dk) obj).serializer.invoke();
                return;
            case 13:
                ((ChooseOptionFragment) obj).write();
                return;
            case 14:
                toStringSafe tostringsafe = (toStringSafe) obj;
                int i14 = createDatedefault.RemoteActionCompatParcelizer;
                if (tostringsafe != null) {
                    int i15 = RemoteActionCompatParcelizer + 111;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    tostringsafe.write.invoke();
                    return;
                }
                return;
            default:
                int i17 = formatDate.RemoteActionCompatParcelizer;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = ((formatDatedefault) obj).IconCompatParcelizer;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    return;
                }
                return;
        }
    }
}
