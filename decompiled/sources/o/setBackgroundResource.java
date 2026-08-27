package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class setBackgroundResource {
    public final TextView RatingCompat;
    public boolean write;
    public ColorStateList read = null;
    public PorterDuff.Mode IconCompatParcelizer = null;
    public boolean serializer = false;
    public boolean RemoteActionCompatParcelizer = false;

    public /* synthetic */ setBackgroundResource(TextView textView) {
        this.RatingCompat = textView;
    }

    public void IconCompatParcelizer() {
        onCreateView oncreateview = (onCreateView) this.RatingCompat;
        Drawable checkMarkDrawable = oncreateview.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.serializer || this.RemoteActionCompatParcelizer) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.serializer) {
                    drawableMutate.setTintList(this.read);
                }
                if (this.RemoteActionCompatParcelizer) {
                    drawableMutate.setTintMode(this.IconCompatParcelizer);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(oncreateview.getDrawableState());
                }
                oncreateview.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void write() {
        CompoundButton compoundButton = (CompoundButton) this.RatingCompat;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.serializer || this.RemoteActionCompatParcelizer) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.serializer) {
                    drawableMutate.setTintList(this.read);
                }
                if (this.RemoteActionCompatParcelizer) {
                    drawableMutate.setTintMode(this.IconCompatParcelizer);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void serializer(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.RatingCompat;
        Context context = compoundButton.getContext();
        int[] iArr = onUserLeaveHint.CompoundButton;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        FocusPropertiesNode.IconCompatParcelizer(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(coil3.util.IntPair.write(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(coil3.util.IntPair.write(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(coil3.util.IntPair.write(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(emojiProcessorRemoteActionCompatParcelizer.serializer(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(3, -1), null));
            }
        } finally {
            emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }
}
