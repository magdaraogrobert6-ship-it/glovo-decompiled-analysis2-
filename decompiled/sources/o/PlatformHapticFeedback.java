package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformHapticFeedback extends FrameLayout {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] RemoteActionCompatParcelizer = {new MutablePropertyReference1Impl(PlatformHapticFeedback.class, "onRetryClickListener", "getOnRetryClickListener()Landroid/view/View$OnClickListener;", 0)};
    public final TextView read;
    public final TextView serializer;
    public final setGraphicsContextProviderui write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformHapticFeedback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.default_error_layout_content, (ViewGroup) this, true);
        View viewFindViewById = findViewById(com.logistics.rider.glovo.R.id.loadingView_errorState_message);
        viewFindViewById.getClass();
        this.serializer = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(com.logistics.rider.glovo.R.id.loadingView_errorState_retryButton);
        viewFindViewById2.getClass();
        this.read = (TextView) viewFindViewById2;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, getToggleOn5zf0vsI.LoadingView, 0, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                setErrorMessage(string);
                int i = RatingCompat + 97;
                MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i2 = i % 2;
                int i3 = 2 % 2;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            if (string2 != null) {
                setRetryButtonLabel(string2);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.write = new setGraphicsContextProviderui(this);
            int i4 = MediaMetadataCompat + 121;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setErrorMessage(String str) {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            this.serializer.setText(str);
            throw null;
        }
        str.getClass();
        this.serializer.setText(str);
        int i3 = RatingCompat + 59;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setRetryButtonLabel(String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 13;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            this.read.setText(str);
        } else {
            str.getClass();
            this.read.setText(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IconCompatParcelizer + 15;
        MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.getText().toString();
        }
        this.serializer.getText().toString();
        throw null;
    }

    public final String getRetryButtonLabel() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 25;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String string = this.read.getText().toString();
        int i4 = MediaMetadataCompat + 113;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final void setOnRetryClickListener(View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write.setValue(this, RemoteActionCompatParcelizer[0], onClickListener);
        int i4 = MediaMetadataCompat + 11;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    public final View.OnClickListener getOnRetryClickListener() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        View.OnClickListener onClickListener = (View.OnClickListener) this.write.getValue(this, RemoteActionCompatParcelizer[0]);
        int i4 = MediaMetadataCompat + 99;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onClickListener;
        }
        throw null;
    }
}
