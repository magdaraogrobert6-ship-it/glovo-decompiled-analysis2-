package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class updateLayerElements extends androidx.constraintlayout.widget.ConstraintLayout {
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final com.common_ui.databinding.ItemSingleChoiceBinding RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateLayerElements(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.view_all_deliveries_expandable, this);
        int i = com.logistics.rider.glovo.R.id.view_expanded_child;
        Object obj = null;
        if (((getNetworkTimeClockannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.view_expanded_child, this)) != null) {
            i = com.logistics.rider.glovo.R.id.view_group_expanded_child;
            LinearLayout linearLayout = (LinearLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.view_group_expanded_child, this);
            if (linearLayout != null) {
                int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 19;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                formatDate formatdate = (formatDate) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.view_group_header, this);
                if (formatdate != null) {
                    this.RemoteActionCompatParcelizer = new com.common_ui.databinding.ItemSingleChoiceBinding(this, this, linearLayout, formatdate, 6);
                    int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 97;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i4 = 16 / 0;
                        return;
                    }
                    return;
                }
                i = com.logistics.rider.glovo.R.id.view_group_header;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public static void RemoteActionCompatParcelizer(updateLayerElements updatelayerelements) {
        boolean z;
        int i = 2 % 2;
        if (((LinearLayout) updatelayerelements.RemoteActionCompatParcelizer.serializer).getVisibility() == 0) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 119;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        updatelayerelements.setGroupExpand(!z);
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 27;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void setGroupExpand(boolean z) {
        float f;
        int i = 2 % 2;
        com.common_ui.databinding.ItemSingleChoiceBinding itemSingleChoiceBinding = this.RemoteActionCompatParcelizer;
        ImageButton imageButton = (ImageButton) ((formatDate) itemSingleChoiceBinding.write).findViewById(com.logistics.rider.glovo.R.id.layout_full_row_list_item_right_column_view_image_button);
        imageButton.getClass();
        if (z) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int i3 = i2 + 35;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            f = i3 % 2 == 0 ? 1.0f : 0.0f;
            int i4 = i2 + 1;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            f = -180.0f;
        }
        imageButton.animate().rotation(f).start();
        updateLayerElements updatelayerelements = (updateLayerElements) itemSingleChoiceBinding.read;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        layoutTransition.enableTransitionType(4);
        updatelayerelements.setLayoutTransition(layoutTransition);
        ((LinearLayout) itemSingleChoiceBinding.serializer).setVisibility(z ? 0 : 8);
    }

    public final void read(report reportVar) {
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2;
        int i = 2 % 2;
        reportVar.getClass();
        com.common_ui.databinding.ItemSingleChoiceBinding itemSingleChoiceBinding = this.RemoteActionCompatParcelizer;
        formatDate formatdate = (formatDate) itemSingleChoiceBinding.write;
        LinearLayout linearLayout = (LinearLayout) itemSingleChoiceBinding.serializer;
        clearBitmaps clearbitmaps = reportVar.write;
        boolean z = reportVar.serializer;
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda3 = new NetworkingCoreModule$$ExternalSyntheticLambda2(18, this);
        if (z) {
            networkingCoreModule$$ExternalSyntheticLambda2 = networkingCoreModule$$ExternalSyntheticLambda3;
        } else {
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 7;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            networkingCoreModule$$ExternalSyntheticLambda2 = null;
        }
        formatdate.read(new formatDatedefault(clearbitmaps.read, networkingCoreModule$$ExternalSyntheticLambda2, Integer.valueOf(clearbitmaps.serializer), z, z ? new toStringSafe(Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_up), networkingCoreModule$$ExternalSyntheticLambda3) : null, clearbitmaps.IconCompatParcelizer));
        linearLayout.removeAllViews();
        ArrayList<getNextEvents> arrayList = reportVar.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (getNextEvents getnextevents : arrayList) {
            arrayList2.add(new formatDateNow(getnextevents.write, getnextevents.RemoteActionCompatParcelizer, Integer.valueOf(getnextevents.serializer)));
        }
        int i4 = 0;
        for (Object obj : arrayList2) {
            if (i4 < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            formatDateNow formatdatenow = (formatDateNow) obj;
            getNetworkTimeClockannotations getnetworktimeclockannotations = new getNetworkTimeClockannotations(new ContextThemeWrapper(getContext(), com.logistics.rider.glovo.R.style.Widget_RoadRunner_FullWidthSingleRowListItem_Small), null);
            getnetworktimeclockannotations.setTag("row_list_item_tag_" + i4);
            formatdatenow.getClass();
            com.common_ui.databinding.LayoutTileBinding layoutTileBinding = getnetworktimeclockannotations.ResultReceiver;
            ((getNetworkTimeClockannotations) layoutTileBinding.MediaDescriptionCompat).setOnClickListener(new checkForSystemLogLevelPropertydefault(2, formatdatenow));
            TextView textView = (TextView) layoutTileBinding.read;
            textView.setVisibility(8);
            textView.setText((CharSequence) null);
            ImageView imageView = (ImageView) layoutTileBinding.write;
            Integer num = formatdatenow.RemoteActionCompatParcelizer;
            imageView.setVisibility(0);
            imageView.setImageDrawable(coil3.util.IntPair.write(imageView.getContext(), num.intValue()));
            ((TextView) layoutTileBinding.serializer).setText(formatdatenow.serializer);
            ((createDatedefault) layoutTileBinding.RemoteActionCompatParcelizer).write(new formatDateFromMillis(true, formatdatenow.IconCompatParcelizer, false, null));
            int dimensionPixelSize = getnetworktimeclockannotations.getContext().getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.layout_spacing_02);
            ViewGroup.LayoutParams layoutParams = getnetworktimeclockannotations.getLayoutParams();
            if ((!(layoutParams instanceof shadows4CzXIIdefault) ? null : (shadows4CzXIIdefault) layoutParams) == null) {
                shadows4CzXIIdefault shadows4czxiidefault = new shadows4CzXIIdefault(-1);
                shadows4czxiidefault.setMargins(0, dimensionPixelSize, 0, 0);
                getnetworktimeclockannotations.setLayoutParams(shadows4czxiidefault);
            }
            linearLayout.addView(getnetworktimeclockannotations);
            i4++;
        }
        setGroupExpand(false);
        int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 45;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
