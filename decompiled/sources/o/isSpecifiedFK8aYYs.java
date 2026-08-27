package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class isSpecifiedFK8aYYs extends setCheckable {
    public static final int[][] read = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList MediaBrowserCompatMediaItem;
    public boolean MediaMetadataCompat;

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.MediaMetadataCompat && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.MediaMetadataCompat = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public isSpecifiedFK8aYYs(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.radioButtonStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, setMeasuredSizeozmzZPI.MaterialRadioButton, com.logistics.rider.glovo.R.attr.radioButtonStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArray.hasValue(0)) {
            setButtonTintList(ScaleFactorKt.IconCompatParcelizer(context2, typedArray, 0));
        }
        this.MediaMetadataCompat = typedArray.getBoolean(1, false);
        typedArray.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.MediaBrowserCompatMediaItem == null) {
            int iRemoteActionCompatParcelizer = mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorControlActivated, this);
            int iRemoteActionCompatParcelizer2 = mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorOnSurface, this);
            int iRemoteActionCompatParcelizer3 = mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorSurface, this);
            this.MediaBrowserCompatMediaItem = new ColorStateList(read, new int[]{mergeRulerValues.write(1.0f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer), mergeRulerValues.write(0.54f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2), mergeRulerValues.write(0.38f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2), mergeRulerValues.write(0.38f, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2)});
        }
        return this.MediaBrowserCompatMediaItem;
    }
}
