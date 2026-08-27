package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.breakrequest.SelectBreakDurationFragment;
import com.ui.common.widget.chooseoption.entity.SelectionMode;
import com.ui.common.widget.chooseoption.entity.SelectionOptionViewEntity;
import java.util.List;
import o.isAppSetIdReadingEnabled;
import o.onViewAttachedToWindowlambda0;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class DataStoreUtilse extends ViewCompositionStrategy_androidKtExternalSyntheticLambda0 {
    public final SelectionMode read;
    public final GetAppStateImpl serializer;

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final boolean serializer(int i, Object obj) {
        ((List) obj).getClass();
        return this.read == SelectionMode.SINGLE_CHOICE;
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final void write(Object obj, final int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, List list) {
        List list2 = (List) obj;
        list2.getClass();
        viewHolder.getClass();
        list.getClass();
        createDate createdate = (createDate) viewHolder;
        createdate.MediaSessionCompatQueueItem.setOnClickListener(new View.OnClickListener() { // from class: com.ui.common.widget.chooseoption.adapter.SingleChoiceOptionItemDelegate$$ExternalSyntheticLambda0
            private static int serializer = 1;
            private static int write;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                SelectBreakDurationFragment selectBreakDurationFragment = (SelectBreakDurationFragment) this.IconCompatParcelizer.serializer.serializer;
                Object[] objArr = {new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("bundle-option-selected", selectBreakDurationFragment.MediaMetadataCompat().getOptions().get(i).getId())}};
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                selectBreakDurationFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320), "select-break-duration-dialog-result-key");
                selectBreakDurationFragment.write();
                int i3 = serializer + 3;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }
        });
        SelectionOptionViewEntity selectionOptionViewEntity = (SelectionOptionViewEntity) list2.get(i);
        selectionOptionViewEntity.getClass();
        com.common_ui.databinding.ItemSingleChoiceBinding itemSingleChoiceBinding = createdate.IconCompatParcelizer;
        ((TextView) itemSingleChoiceBinding.write).setText(selectionOptionViewEntity.getName());
        TextView textView = (TextView) itemSingleChoiceBinding.serializer;
        textView.setVisibility(selectionOptionViewEntity.getDescription() != null ? 0 : 8);
        textView.setText(selectionOptionViewEntity.getDescription());
        ((ImageView) itemSingleChoiceBinding.read).setVisibility(selectionOptionViewEntity.isSelected() ? 0 : 8);
    }

    public DataStoreUtilse(SelectionMode selectionMode, GetAppStateImpl getAppStateImpl) {
        selectionMode.getClass();
        getAppStateImpl.getClass();
        this.read = selectionMode;
        this.serializer = getAppStateImpl;
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder read(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.logistics.rider.glovo.R.layout.item_single_choice, viewGroup, false);
        int i = com.logistics.rider.glovo.R.id.checkmark;
        ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.checkmark, viewInflate);
        if (imageView != null) {
            i = com.logistics.rider.glovo.R.id.description;
            TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.description, viewInflate);
            if (textView != null) {
                i = com.logistics.rider.glovo.R.id.name;
                TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.name, viewInflate);
                if (textView2 != null) {
                    return new createDate(new com.common_ui.databinding.ItemSingleChoiceBinding((androidx.constraintlayout.widget.ConstraintLayout) viewInflate, imageView, textView, textView2, 0));
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
