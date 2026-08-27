package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class HandlerUtils extends HorizontalScrollView {
    public final int read;
    public final androidx.constraintlayout.widget.ConstraintLayout write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerUtils(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.read = getResources().getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.component_spacing_tile_horizontal_list_spacing);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = new androidx.constraintlayout.widget.ConstraintLayout(context, attributeSet);
        constraintLayout.setId(View.generateViewId());
        this.write = constraintLayout;
        setFillViewport(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(constraintLayout);
    }

    public final void setTiles(r8lambdaggfEkPE61mQohm49Y8NPYjeuyH0 r8lambdaggfekpe61mqohm49y8npyjeuyh0) {
        r8lambdaggfekpe61mqohm49y8npyjeuyh0.getClass();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.write;
        constraintLayout.removeAllViews();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaggfekpe61mqohm49y8npyjeuyh0, 10));
        for (getRandom getrandom : r8lambdaggfekpe61mqohm49y8npyjeuyh0.read) {
            Context context = getContext();
            context.getClass();
            createHandler createhandler = new createHandler(context, null);
            createhandler.setId(View.generateViewId());
            getrandom.getClass();
            com.common_ui.databinding.LayoutTileBinding layoutTileBinding = createhandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            TextView textView = (TextView) layoutTileBinding.read;
            getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer;
            textView.setText(getrandom.read);
            ((TextView) layoutTileBinding.serializer).setText(getrandom.serializer);
            ((ImageView) layoutTileBinding.write).setImageDrawable(coil3.util.IntPair.write(createhandler.getContext(), getrandom.RemoteActionCompatParcelizer));
            getsuppressannotations.setVisibility(8);
            getsuppressannotations.setText((CharSequence) null);
            getsuppressannotations.setOnClickListener(new checkForSystemLogLevelPropertydefault(3, getrandom));
            arrayList.add(createhandler);
        }
        int i = 0;
        int i2 = 0;
        for (Object obj : arrayList) {
            if (i2 < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            createHandler createhandler2 = (createHandler) obj;
            createhandler2.setTag("tile_tag_" + i2);
            constraintLayout.addView(createhandler2);
            i2++;
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.read(constraintLayout);
        if (arrayList.size() == 1) {
            createHandler createhandler3 = (createHandler) arrayList.get(0);
            constraintSet.write(createhandler3.getId(), 6, 0, 6, this.read);
            constraintSet.write(createhandler3.getId(), 7, 0, 7, this.read);
        } else {
            int size = arrayList.size() - 1;
            while (i < size) {
                int i3 = i + 1;
                createHandler createhandler4 = (createHandler) arrayList.get(i);
                createHandler createhandler5 = (createHandler) arrayList.get(i3);
                if (i == 0) {
                    constraintSet.write(createhandler4.getId(), 6, 0, 6, this.read);
                }
                constraintSet.write(createhandler4.getId(), 7, createhandler5.getId(), 6, this.read);
                int id = createhandler5.getId();
                int id2 = createhandler4.getId();
                HashMap map = constraintSet.RemoteActionCompatParcelizer;
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new ShadowScope());
                }
                ShadowScope shadowScope = (ShadowScope) map.get(Integer.valueOf(id));
                if (shadowScope != null) {
                    SimpleDropShadowElement simpleDropShadowElement = shadowScope.IconCompatParcelizer;
                    simpleDropShadowElement.addOnTrimMemoryListener = id2;
                    simpleDropShadowElement.addOnPictureInPictureModeChangedListener = -1;
                }
                if (i3 == size) {
                    constraintSet.write(createhandler5.getId(), 7, 0, 7, this.read);
                }
                i = i3;
            }
        }
        constraintSet.applyToInternal(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }
}
