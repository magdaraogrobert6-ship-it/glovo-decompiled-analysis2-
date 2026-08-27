package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnLoggedCallback extends androidx.appcompat.widget.AppCompatTextView {
    public final float IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatToken;
    public final float RatingCompat;
    public List RemoteActionCompatParcelizer;
    public final float read;
    public int serializer;
    public String write;

    public final String getAmountText() {
        return this.write;
    }

    public final List<Integer> getBonusIcons() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int getCircleColor() {
        return this.serializer;
    }

    public final int getPillBackgroundColor() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int getPillBackgroundStrokeColor() {
        return this.MediaMetadataCompat;
    }

    public final int getPillMarkerBackground() {
        return this.MediaSessionCompatQueueItem;
    }

    public final int getPillTextColor() {
        return this.MediaSessionCompatToken;
    }

    public getOnLoggedCallback(Context context) {
        super(context, null, 0);
        this.MediaSessionCompatQueueItem = com.logistics.rider.glovo.R.drawable.pill_marker_background;
        this.serializer = context.getColor(com.logistics.rider.glovo.R.color.error_dark_02);
        this.MediaSessionCompatToken = context.getColor(com.logistics.rider.glovo.R.color.neutral_80);
        this.MediaBrowserCompatMediaItem = context.getColor(com.logistics.rider.glovo.R.color.neutral_00);
        this.MediaMetadataCompat = context.getColor(com.logistics.rider.glovo.R.color.neutral_00);
        this.write = "";
        this.RemoteActionCompatParcelizer = instance_delegatelambda0.write;
        this.read = getResources().getDimension(com.logistics.rider.glovo.R.dimen.corner_radius_05);
        this.MediaDescriptionCompat = getResources().getDimension(com.logistics.rider.glovo.R.dimen.component_dimension_pill_shaped_marker_icon_size);
        this.IconCompatParcelizer = getResources().getDimension(com.logistics.rider.glovo.R.dimen.padding_2dp);
        this.RatingCompat = getResources().getDimension(com.logistics.rider.glovo.R.dimen.component_dimension_pill_shaped_marker_max_width);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.padding_6dp);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setTextSize(0, getResources().getDimension(com.logistics.rider.glovo.R.dimen.material_text_caption));
        setTypeface(setLeft.serializer(context, com.logistics.rider.glovo.R.font.notosans_bold));
        setIncludeFontPadding(false);
        setBackgroundResource(this.MediaSessionCompatQueueItem);
        IconCompatParcelizer();
    }

    private final float getIconsWidth() {
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            return 0.0f;
        }
        return (this.MediaDescriptionCompat * this.RemoteActionCompatParcelizer.size()) - (this.IconCompatParcelizer * (this.RemoteActionCompatParcelizer.size() - 1));
    }

    public final void RemoteActionCompatParcelizer() {
        Drawable drawableMutate;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        setTextColor(this.MediaSessionCompatToken);
        spannableStringBuilder.append((CharSequence) " ");
        Context context = getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(com.logistics.rider.glovo.R.drawable.solid_circle);
        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
            int i = (int) this.read;
            drawableMutate.setBounds(0, 0, i, i);
            drawableMutate.setTint(this.serializer);
            spannableStringBuilder.setSpan(new getLogLevel(drawableMutate, 0), 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) (" " + getFormattedText()));
        int i2 = 0;
        for (Object obj : this.RemoteActionCompatParcelizer) {
            if (i2 < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            spannableStringBuilder.append((CharSequence) " ");
            Context context2 = getContext();
            context2.getClass();
            Drawable drawable2 = context2.getDrawable(iIntValue);
            if (drawable2 != null) {
                int i3 = (int) this.MediaDescriptionCompat;
                drawable2.setBounds(0, 0, i3, i3);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new getLogLevel(drawable2, i2 > 0 ? (int) this.IconCompatParcelizer : 0), length - 1, length, 33);
            }
            i2++;
        }
        setText(spannableStringBuilder);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable background = getBackground();
        Drawable drawableMutate = background != null ? background.mutate() : null;
        GradientDrawable gradientDrawable = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(getResources().getDimension(getLineCount() > 1 ? com.logistics.rider.glovo.R.dimen.corner_radius_05 : com.logistics.rider.glovo.R.dimen.corner_radius_06));
        }
    }

    public final void setAmountText(String str) {
        str.getClass();
        Object[] objArr = {this.write, str};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.write = str;
        RemoteActionCompatParcelizer();
    }

    public final void setBonusIcons(List<Integer> list) {
        list.getClass();
        Object[] objArr = {this.RemoteActionCompatParcelizer, list};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.RemoteActionCompatParcelizer = list;
        RemoteActionCompatParcelizer();
    }

    public final void setCircleColor(int i) {
        if (this.serializer == i) {
            return;
        }
        this.serializer = i;
        RemoteActionCompatParcelizer();
    }

    public final void setPillBackgroundColor(int i) {
        if (this.MediaBrowserCompatMediaItem == i) {
            return;
        }
        this.MediaBrowserCompatMediaItem = i;
        IconCompatParcelizer();
    }

    public final void setPillBackgroundStrokeColor(int i) {
        if (this.MediaMetadataCompat == i) {
            return;
        }
        this.MediaMetadataCompat = i;
        IconCompatParcelizer();
    }

    public final void setPillMarkerBackground(int i) {
        if (this.MediaSessionCompatQueueItem == i) {
            return;
        }
        this.MediaSessionCompatQueueItem = i;
        setBackgroundResource(i);
        IconCompatParcelizer();
    }

    public final void setPillTextColor(int i) {
        if (this.MediaSessionCompatToken == i) {
            return;
        }
        this.MediaSessionCompatToken = i;
        RemoteActionCompatParcelizer();
    }

    private final String getFormattedText() {
        float dimension = getResources().getDimension(com.logistics.rider.glovo.R.dimen.layout_spacing_01);
        float f = this.read;
        float fMeasureText = getPaint().measureText(this.write);
        float iconsWidth = getIconsWidth();
        float paddingStart = getPaddingStart();
        float paddingEnd = getPaddingEnd();
        float f2 = this.RatingCompat;
        String str = this.write;
        if (fMeasureText + dimension + f + iconsWidth + paddingStart + paddingEnd <= f2) {
            return str;
        }
        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{" - "}, 2);
        if (listSerializer.size() < 2) {
            return this.write;
        }
        String str2 = listSerializer.get(0) + " -";
        String str3 = (String) listSerializer.get(1);
        return m1$$ExternalSyntheticOutline0.m(str2, "\n", str3, getPaint().measureText(str3) + getIconsWidth() > (f2 - ((float) getPaddingStart())) - ((float) getPaddingEnd()) ? "\n" : "");
    }

    public final void IconCompatParcelizer() {
        Drawable background = getBackground();
        Drawable drawableMutate = background != null ? background.mutate() : null;
        GradientDrawable gradientDrawable = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(this.MediaBrowserCompatMediaItem);
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.border_02), this.MediaMetadataCompat);
        }
    }
}
