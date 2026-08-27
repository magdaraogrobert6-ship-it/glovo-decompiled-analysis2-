package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getBottomimpl extends ArrayAdapter {
    public ColorStateList RemoteActionCompatParcelizer;
    public final /* synthetic */ TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 read;
    public ColorStateList serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBottomimpl(TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.read = testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111;
        read();
    }

    public final void read() {
        ColorStateList colorStateList;
        TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 = this.read;
        ColorStateList colorStateList2 = testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.MediaSessionCompatResultReceiverWrapper;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {android.R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.RemoteActionCompatParcelizer = colorStateList;
        if (testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.RatingCompat != 0 && testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.MediaSessionCompatResultReceiverWrapper != null) {
            int[] iArr2 = {android.R.attr.state_hovered, -16842919};
            int[] iArr3 = {android.R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{setPrevious.RemoteActionCompatParcelizer(testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.MediaSessionCompatResultReceiverWrapper.getColorForState(iArr3, 0), testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.RatingCompat), setPrevious.RemoteActionCompatParcelizer(testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.MediaSessionCompatResultReceiverWrapper.getColorForState(iArr2, 0), testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.RatingCompat), testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.RatingCompat});
        }
        this.serializer = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 = this.read;
            Drawable rippleDrawable = null;
            if (testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.getText().toString().contentEquals(textView.getText()) && testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.RatingCompat != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.RatingCompat);
                if (this.RemoteActionCompatParcelizer != null) {
                    colorDrawable.setTintList(this.serializer);
                    rippleDrawable = new RippleDrawable(this.RemoteActionCompatParcelizer, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
