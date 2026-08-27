package o;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.network.NetworkBody;
import java.nio.charset.StandardCharsets;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class getImmutablePendingIntentFlags extends FrameLayout {
    private static int ComponentActivity = 0;
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private static byte r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -112;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatResultReceiverWrapper;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public final isAdapterPositionOnScreen RatingCompat;
    public final float ResultReceiver;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public String read;
    public final int serializer;
    public final getDefaultCapKaPHkGw write;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getButtonActionClickListener() {
        return this.IconCompatParcelizer;
    }

    public final String getButtonText() {
        return this.read;
    }

    public final int getEndIcon() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getEndImageClickListener() {
        return this.MediaDescriptionCompat;
    }

    public final int getSecondaryIcon() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getSecondaryImageClickListener() {
        return this.MediaSessionCompatToken;
    }

    public final int getStartIcon() {
        return this.ParcelableVolumeInfo;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getStartImageClickListener() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final String getSubTitle() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public final String getTitle() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    private final int getHeaderViewLeft() {
        return ((Number) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).intValue();
    }

    private final int getHeaderViewRight() {
        return ((Number) this.RatingCompat.MediaSessionCompatResultReceiverWrapper()).intValue();
    }

    @SuppressLint
    private final void setTripleTapListener(brazeloglambda0 brazeloglambda0Var) {
        checkForSystemLogLevelProperty checkforsystemloglevelproperty = new checkForSystemLogLevelProperty();
        if (brazeloglambda0Var != null) {
            checkforsystemloglevelproperty.write = new StringsKt__StringsKt$$ExternalSyntheticLambda1(27, brazeloglambda0Var);
        }
        setOnTouchListener(checkforsystemloglevelproperty);
    }

    public static void write(getImmutablePendingIntentFlags getimmutablependingintentflags, int i) {
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = getimmutablependingintentflags.write;
        java.util.Locale locale = java.util.Locale.getDefault();
        locale.getClass();
        if (TextUtils.getLayoutDirectionFromLocale(locale) == 0) {
            int headerViewLeft = getimmutablependingintentflags.getHeaderViewLeft();
            int headerViewRight = getimmutablependingintentflags.getHeaderViewRight();
            FrameLayout frameLayout = (FrameLayout) getdefaultcapkaphkgw.read;
            getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) getdefaultcapkaphkgw.RemoteActionCompatParcelizer;
            ImageView imageView = (ImageView) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem;
            ImageView imageView2 = (ImageView) getdefaultcapkaphkgw.write;
            int left = frameLayout.getLeft();
            int left2 = imageView2.getLeft();
            int right = imageView.getRight();
            int left3 = getsuppressannotations.getLeft();
            if (imageView.getVisibility() == 0) {
                headerViewLeft = right;
            }
            getimmutablependingintentflags.MediaMetadataCompat = headerViewLeft + i;
            if (getsuppressannotations.getVisibility() == 0) {
                headerViewRight = left3;
            } else if (imageView2.getVisibility() == 0) {
                headerViewRight = left2;
            } else if (((FrameLayout) getdefaultcapkaphkgw.read).getVisibility() == 0) {
                headerViewRight = left;
            }
            getimmutablependingintentflags.PlaybackStateCompat = headerViewRight - i;
        } else {
            int headerViewLeft2 = getimmutablependingintentflags.getHeaderViewLeft();
            int headerViewRight2 = getimmutablependingintentflags.getHeaderViewRight();
            FrameLayout frameLayout2 = (FrameLayout) getdefaultcapkaphkgw.read;
            getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) getdefaultcapkaphkgw.RemoteActionCompatParcelizer;
            ImageView imageView3 = (ImageView) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem;
            ImageView imageView4 = (ImageView) getdefaultcapkaphkgw.write;
            int right2 = frameLayout2.getRight();
            int right3 = imageView4.getRight();
            int left4 = imageView3.getLeft();
            int right4 = getsuppressannotations2.getRight();
            if (imageView3.getVisibility() == 0) {
                headerViewRight2 = left4;
            }
            getimmutablependingintentflags.PlaybackStateCompat = headerViewRight2 - i;
            if (getsuppressannotations2.getVisibility() == 0) {
                headerViewLeft2 = right4;
            } else if (imageView4.getVisibility() == 0) {
                headerViewLeft2 = right3;
            } else if (((FrameLayout) getdefaultcapkaphkgw.read).getVisibility() == 0) {
                headerViewLeft2 = right2;
            }
            getimmutablependingintentflags.MediaMetadataCompat = headerViewLeft2 + i;
        }
        if (getimmutablependingintentflags.getHeaderViewRight() - getimmutablependingintentflags.PlaybackStateCompat > getimmutablependingintentflags.MediaMetadataCompat - getimmutablependingintentflags.getHeaderViewLeft()) {
            getimmutablependingintentflags.MediaMetadataCompat = (getimmutablependingintentflags.getHeaderViewRight() - getimmutablependingintentflags.PlaybackStateCompat) + getimmutablependingintentflags.getHeaderViewLeft();
        } else {
            getimmutablependingintentflags.PlaybackStateCompat = getimmutablependingintentflags.getHeaderViewRight() - (getimmutablependingintentflags.MediaMetadataCompat - getimmutablependingintentflags.getHeaderViewLeft());
        }
        TextView textView = (TextView) getdefaultcapkaphkgw.MediaMetadataCompat;
        TextView textView2 = (TextView) getdefaultcapkaphkgw.MediaDescriptionCompat;
        String strWrite = getimmutablependingintentflags.write(getimmutablependingintentflags.MediaMetadataCompat, getimmutablependingintentflags.PlaybackStateCompat, textView.getText().toString());
        Object[] objArr = {textView.getText().toString(), strWrite};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            textView.setText(strWrite);
        }
        String strWrite2 = getimmutablependingintentflags.write(getimmutablependingintentflags.MediaMetadataCompat, getimmutablependingintentflags.PlaybackStateCompat, textView2.getText().toString());
        Object[] objArr2 = {textView2.getText().toString(), strWrite2};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return;
        }
        textView2.setText(strWrite2);
    }

    public final void setButtonActionClickListener(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        ((getSUPPRESSannotations) this.write.RemoteActionCompatParcelizer).setOnClickListener(new getMutablePendingIntentFlags(4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final void setButtonText(String str) {
        this.read = str;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) this.write.RemoteActionCompatParcelizer;
        getsuppressannotations.setText(str);
        getsuppressannotations.setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    public final void setButtonVisible(boolean z) {
        ((getSUPPRESSannotations) this.write.RemoteActionCompatParcelizer).setVisibility(z ? 0 : 8);
    }

    public final void setElevationVisibility(boolean z) {
        setElevation(z ? this.serializer : 0);
    }

    public final void setEndIcon(int i) {
        this.MediaBrowserCompatMediaItem = i;
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.write;
        ImageView imageView = (ImageView) getdefaultcapkaphkgw.IconCompatParcelizer;
        imageView.setImageResource(i);
        ((ImageView) getdefaultcapkaphkgw.IconCompatParcelizer).setColorFilter(getContext().getColor(com.logistics.rider.glovo.R.color.primary_main));
        imageView.setVisibility(i != 0 ? 0 : 8);
    }

    public final void setEndIconVisible(boolean z) {
        ((FrameLayout) this.write.read).setVisibility(z ? 0 : 8);
    }

    public final void setEndImageClickListener(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        ((ImageView) this.write.IconCompatParcelizer).setOnClickListener(new getMutablePendingIntentFlags(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final void setSecondaryIcon(int i) {
        this.PlaybackStateCompatCustomAction = i;
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.write;
        ImageView imageView = (ImageView) getdefaultcapkaphkgw.write;
        imageView.setImageResource(i);
        ((ImageView) getdefaultcapkaphkgw.write).setColorFilter(getContext().getColor(com.logistics.rider.glovo.R.color.primary_main));
        imageView.setVisibility(i != 0 ? 0 : 8);
    }

    public final void setSecondaryIconVisible(boolean z) {
        ((ImageView) this.write.write).setVisibility(z ? 0 : 8);
    }

    public final void setSecondaryImageClickListener(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.MediaSessionCompatToken = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        ((ImageView) this.write.write).setOnClickListener(new getMutablePendingIntentFlags(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final void setStartIcon(int i) {
        this.ParcelableVolumeInfo = i;
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.write;
        ImageView imageView = (ImageView) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem;
        imageView.setImageResource(i);
        ((ImageView) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem).setColorFilter(getContext().getColor(com.logistics.rider.glovo.R.color.primary_main));
        imageView.setVisibility(i != 0 ? 0 : 8);
    }

    public final void setStartIconVisible(boolean z) {
        ((ImageView) this.write.MediaBrowserCompatMediaItem).setVisibility(z ? 0 : 8);
    }

    public final void setStartImageClickListener(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.MediaSessionCompatResultReceiverWrapper = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        ((ImageView) this.write.MediaBrowserCompatMediaItem).setOnClickListener(new getMutablePendingIntentFlags(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final void setSubTitle(String str) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
        TextView textView = (TextView) this.write.MediaDescriptionCompat;
        textView.setTag(str);
        textView.setText(str);
        textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    public final void setTitle(String str) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str;
        TextView textView = (TextView) this.write.MediaMetadataCompat;
        textView.setText(str);
        textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    public final void setButtonTextSilently(String str) {
        str.getClass();
        ((getSUPPRESSannotations) this.write.RemoteActionCompatParcelizer).setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getImmutablePendingIntentFlags(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        final int i = 0;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.addComponentAndSendBroadcastlambda00
            public final /* synthetic */ getImmutablePendingIntentFlags read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int left;
                int i2 = i;
                getImmutablePendingIntentFlags getimmutablependingintentflags = this.read;
                if (i2 != 0) {
                    int i3 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
                    left = getimmutablependingintentflags.getRight();
                } else {
                    int i4 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
                    left = getimmutablependingintentflags.getLeft();
                }
                return Integer.valueOf(left);
            }
        });
        final int i2 = 1;
        this.RatingCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.addComponentAndSendBroadcastlambda00
            public final /* synthetic */ getImmutablePendingIntentFlags read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int left;
                int i3 = i2;
                getImmutablePendingIntentFlags getimmutablependingintentflags = this.read;
                if (i3 != 0) {
                    int i4 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
                    left = getimmutablependingintentflags.getRight();
                } else {
                    int i5 = getImmutablePendingIntentFlags.RemoteActionCompatParcelizer;
                    left = getimmutablependingintentflags.getLeft();
                }
                return Integer.valueOf(left);
            }
        });
        View viewInflate = LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.view_header, (ViewGroup) this, false);
        addView(viewInflate);
        int i3 = com.logistics.rider.glovo.R.id.button;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.button, viewInflate);
        NetworkBody networkBody = null;
        if (getsuppressannotations != null) {
            i3 = com.logistics.rider.glovo.R.id.imageViewEndIcon;
            ImageView imageView = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewEndIcon, viewInflate);
            if (imageView != null) {
                i3 = com.logistics.rider.glovo.R.id.imageViewEndIconContainer;
                FrameLayout frameLayout = (FrameLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewEndIconContainer, viewInflate);
                if (frameLayout != null) {
                    i3 = com.logistics.rider.glovo.R.id.imageViewSecondaryIcon;
                    ImageView imageView2 = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewSecondaryIcon, viewInflate);
                    if (imageView2 != null) {
                        i3 = com.logistics.rider.glovo.R.id.imageViewStartIcon;
                        ImageView imageView3 = (ImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewStartIcon, viewInflate);
                        if (imageView3 != null) {
                            idefault idefaultVar = (idefault) viewInflate;
                            i3 = com.logistics.rider.glovo.R.id.rootViewContainer;
                            if (((androidx.constraintlayout.widget.ConstraintLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.rootViewContainer, viewInflate)) != null) {
                                i3 = com.logistics.rider.glovo.R.id.textViewSubtitle;
                                TextView textView = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.textViewSubtitle, viewInflate);
                                if (textView != null) {
                                    i3 = com.logistics.rider.glovo.R.id.textViewTitle;
                                    TextView textView2 = (TextView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.textViewTitle, viewInflate);
                                    if (textView2 != null) {
                                        this.write = new getDefaultCapKaPHkGw(idefaultVar, getsuppressannotations, imageView, frameLayout, imageView2, imageView3, textView, textView2);
                                        this.MediaBrowserCompatMediaItem = com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin;
                                        this.read = "";
                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetDependenciesSetp.HeaderView);
                                        typedArrayObtainStyledAttributes.getClass();
                                        setTitle(typedArrayObtainStyledAttributes.getString(8));
                                        setSubTitle(typedArrayObtainStyledAttributes.getString(7));
                                        setButtonText(typedArrayObtainStyledAttributes.getString(0));
                                        setEndIcon(typedArrayObtainStyledAttributes.getResourceId(2, 0));
                                        setStartIcon(typedArrayObtainStyledAttributes.getResourceId(6, 0));
                                        setSecondaryIcon(typedArrayObtainStyledAttributes.getResourceId(4, 0));
                                        this.serializer = (int) typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
                                        String string = typedArrayObtainStyledAttributes.getString(3);
                                        if (string != null) {
                                            Intent intent = new Intent();
                                            intent.setComponent(new ComponentName(getContext().getApplicationContext().getPackageName(), string));
                                            networkBody = new NetworkBody(this, 26, intent);
                                        }
                                        setTripleTapListener(networkBody);
                                        float dimension = typedArrayObtainStyledAttributes.getDimension(9, this.ResultReceiver);
                                        this.ResultReceiver = dimension;
                                        float f = typedArrayObtainStyledAttributes.getFloat(5, 0.48f);
                                        typedArrayObtainStyledAttributes.recycle();
                                        final int iApplyDimension = (int) TypedValue.applyDimension(0, getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.spacing_05), getResources().getDisplayMetrics());
                                        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.addComponentAndSendBroadcast
                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                                                getImmutablePendingIntentFlags.write(this.read, iApplyDimension);
                                            }
                                        });
                                        setOutlineProvider(new getLogLevelannotations(f, (int) dimension, 1));
                                        setElevationVisibility(true);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        throw null;
    }

    public final String write(int i, int i2, String str) {
        if (i2 != 0 && i != 0 && str != null && str.length() != 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.write;
            ((TextView) getdefaultcapkaphkgw.MediaMetadataCompat).getPaint().getTextBounds(str, 0, str.length() - 1, rect);
            int i3 = i2 - i;
            if (rect.width() > i3) {
                str = str.concat("...");
                for (int iWidth = rect.width(); iWidth > i3 && str.length() >= 4; iWidth = rect.width()) {
                    str = str.substring(0, str.length() - 4).concat("...");
                    ((TextView) getdefaultcapkaphkgw.MediaMetadataCompat).getPaint().getTextBounds(str, 0, str.length() - 1, rect);
                }
            }
        }
        return str;
    }

    public final void setButtonTextSilently(int i) {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = ComponentActivity + 67;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) this.write.RemoteActionCompatParcelizer;
        Context context = getsuppressannotations.getContext();
        String string = context.getString(i);
        boolean z = !string.startsWith("%('");
        CharSequence charSequence = string;
        if (!z) {
            int i5 = ComponentActivity + 111;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            String strSubstring = string.substring(3);
            Object[] objArr = new Object[1];
            a(strSubstring, objArr);
            strIntern = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                charSequence = strIntern;
                SpannableString spannableString = new SpannableString(strIntern);
                TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                charSequence = spannableString;
            }
        }
        charSequence = strIntern;
        getsuppressannotations.setText(charSequence);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
