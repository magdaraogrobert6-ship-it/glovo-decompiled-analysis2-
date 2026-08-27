package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.gms.oss.licenses.zzn;

/* JADX INFO: loaded from: classes4.dex */
public final class getInflater extends setExpandedActionViewsExclusive implements initialize {
    public int IconCompatParcelizer;
    public final android.graphics.Rect RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner read;
    public CharSequence serializer;
    public setForceShowIcon write;

    @Override // o.initialize
    public final CharSequence read() {
        return this.serializer;
    }

    @Override // o.initialize
    public final void read(CharSequence charSequence) {
        this.serializer = charSequence;
    }

    @Override // o.initialize
    public final void serializer(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void MediaMetadataCompat() {
        int i;
        int i2;
        setItemInvoker setiteminvoker = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        Drawable background = setiteminvoker.getBackground();
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.read;
        android.graphics.Rect rect = appCompatSpinner.MediaMetadataCompat;
        if (background != null) {
            background.getPadding(rect);
            i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i3 = appCompatSpinner.read;
        if (i3 == -2) {
            int iWrite = appCompatSpinner.write(this.write, setiteminvoker.getBackground());
            int i4 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iWrite > i4) {
                iWrite = i4;
            }
            read(Math.max(iWrite, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            read((width - paddingLeft) - paddingRight);
        } else {
            read(i3);
        }
        if (appCompatSpinner.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) - this.IconCompatParcelizer) + i;
        } else {
            i2 = paddingLeft + this.IconCompatParcelizer + i;
        }
        this.PlaybackStateCompatCustomAction = i2;
    }

    @Override // o.initialize
    public final void write(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        setItemInvoker setiteminvoker = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        boolean zIsShowing = setiteminvoker.isShowing();
        MediaMetadataCompat();
        setiteminvoker.setInputMethodMode(2);
        b_();
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.PlaybackStateCompat;
        sethasnonembeddedtabs.setChoiceMode(1);
        sethasnonembeddedtabs.setTextDirection(i);
        sethasnonembeddedtabs.setTextAlignment(i2);
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.read;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        setHasNonEmbeddedTabs sethasnonembeddedtabs2 = this.PlaybackStateCompat;
        if (setiteminvoker.isShowing() && sethasnonembeddedtabs2 != null) {
            sethasnonembeddedtabs2.setListSelectionHidden(false);
            sethasnonembeddedtabs2.setSelection(selectedItemPosition);
            if (sethasnonembeddedtabs2.getChoiceMode() != 0) {
                sethasnonembeddedtabs2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        setTitle settitle = new setTitle(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(settitle);
        setiteminvoker.setOnDismissListener(new setSubMenuArrowVisible(this, settitle));
    }

    @Override // o.setExpandedActionViewsExclusive, o.initialize
    public final void read(ListAdapter listAdapter) {
        super.read(listAdapter);
        this.write = (setForceShowIcon) listAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getInflater(androidx.appcompat.widget.AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.spinnerStyle, 0);
        this.read = appCompatSpinner;
        this.RemoteActionCompatParcelizer = new android.graphics.Rect();
        this.RatingCompat = appCompatSpinner;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setFocusable(true);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new zzn(1, this);
    }
}
