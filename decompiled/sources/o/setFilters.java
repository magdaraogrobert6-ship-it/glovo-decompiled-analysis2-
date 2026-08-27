package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class setFilters implements setActionBarHideOffset {
    private static int ResultReceiver = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static byte r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -112;
    public int IconCompatParcelizer;
    public CharSequence MediaBrowserCompatMediaItem;
    public Drawable MediaDescriptionCompat;
    public Drawable MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final CharSequence MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public CharSequence ParcelableVolumeInfo;
    public final androidx.appcompat.widget.Toolbar PlaybackStateCompat;
    public Window.Callback PlaybackStateCompatCustomAction;
    public Drawable RatingCompat;
    public final Drawable RemoteActionCompatParcelizer;
    public final View read;
    public final int serializer;
    public onSupportActionModeStarted write;

    public final void read(int i) {
        View view;
        int i2 = this.IconCompatParcelizer ^ i;
        this.IconCompatParcelizer = i;
        if (i2 != 0) {
            androidx.appcompat.widget.Toolbar toolbar = this.PlaybackStateCompat;
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    IconCompatParcelizer();
                }
                if ((this.IconCompatParcelizer & 4) != 0) {
                    Drawable drawable = this.MediaDescriptionCompat;
                    if (drawable == null) {
                        drawable = this.RemoteActionCompatParcelizer;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                serializer();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.ParcelableVolumeInfo);
                    toolbar.setSubtitle(this.MediaSessionCompatResultReceiverWrapper);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.read) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108 A[PHI: r5 r7
  0x0108: PHI (r5v25 android.view.View) = (r5v24 android.view.View), (r5v29 android.view.View) binds: [B:46:0x0106, B:43:0x00f5] A[DONT_GENERATE, DONT_INLINE]
  0x0108: PHI (r7v17 android.view.View) = (r7v16 android.view.View), (r7v22 android.view.View) binds: [B:46:0x0106, B:43:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    public setFilters(androidx.appcompat.widget.Toolbar toolbar, boolean z) {
        boolean z2;
        View viewInflate;
        View view;
        this.serializer = 0;
        this.PlaybackStateCompat = toolbar;
        this.ParcelableVolumeInfo = toolbar.getTitle();
        this.MediaSessionCompatResultReceiverWrapper = toolbar.getSubtitle();
        if (this.ParcelableVolumeInfo != null) {
            int i = 2 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        this.MediaSessionCompatToken = z2;
        this.MediaDescriptionCompat = toolbar.getNavigationIcon();
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(toolbar.getContext(), (AttributeSet) null, onUserLeaveHint.ActionBar, com.logistics.rider.glovo.R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        int i2 = 15;
        Drawable drawableRemoteActionCompatParcelizer = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(15);
        this.RemoteActionCompatParcelizer = drawableRemoteActionCompatParcelizer;
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.MediaSessionCompatToken = true;
                this.ParcelableVolumeInfo = text;
                if ((this.IconCompatParcelizer & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.MediaSessionCompatToken) {
                        int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 117;
                        ResultReceiver = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        FocusPropertiesNode.read(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                int i5 = ResultReceiver + 113;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    this.MediaSessionCompatResultReceiverWrapper = text2;
                    if ((this.IconCompatParcelizer & 60) != 0) {
                        toolbar.setSubtitle(text2);
                    }
                } else {
                    this.MediaSessionCompatResultReceiverWrapper = text2;
                    if ((this.IconCompatParcelizer & 8) != 0) {
                        toolbar.setSubtitle(text2);
                    }
                }
            }
            Drawable drawableRemoteActionCompatParcelizer2 = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(20);
            if (drawableRemoteActionCompatParcelizer2 != null) {
                this.MediaMetadataCompat = drawableRemoteActionCompatParcelizer2;
                serializer();
            }
            Drawable drawableRemoteActionCompatParcelizer3 = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(17);
            if (drawableRemoteActionCompatParcelizer3 != null) {
                this.RatingCompat = drawableRemoteActionCompatParcelizer3;
                serializer();
            }
            if (this.MediaDescriptionCompat == null && drawableRemoteActionCompatParcelizer != null) {
                this.MediaDescriptionCompat = drawableRemoteActionCompatParcelizer;
                if ((this.IconCompatParcelizer & 4) != 0) {
                    toolbar.setNavigationIcon(drawableRemoteActionCompatParcelizer);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            read(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 43;
                ResultReceiver = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                    view = this.read;
                    if (view != null) {
                        if ((this.IconCompatParcelizer & 16) != 0) {
                            toolbar.removeView(view);
                        }
                    }
                } else {
                    viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                    view = this.read;
                    if (view != null) {
                        if ((this.IconCompatParcelizer & 16) != 0) {
                            toolbar.removeView(view);
                        }
                    }
                }
                this.read = viewInflate;
                if (viewInflate != null && (this.IconCompatParcelizer & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                read(this.IconCompatParcelizer | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                int i7 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 37;
                ResultReceiver = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                    layoutParams.height = layoutDimension;
                    toolbar.setLayoutParams(layoutParams);
                    int i8 = 76 / 0;
                } else {
                    ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
                    layoutParams2.height = layoutDimension;
                    toolbar.setLayoutParams(layoutParams2);
                }
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.serializer();
                toolbar.PlaybackStateCompatCustomAction.write(iMax, iMax2);
                int i9 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 17;
                ResultReceiver = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.menuHostHelperlambda0 = resourceId2;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = toolbar.getOnBackPressedInput;
                if (appCompatTextView != null) {
                    int i12 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 91;
                    ResultReceiver = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.accessensureViewModelStore = resourceId3;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = toolbar._init_lambda4;
                if (appCompatTextView2 != null) {
                    int i14 = ResultReceiver + 111;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        appCompatTextView2.setTextAppearance(context2, resourceId3);
                        throw null;
                    }
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                    int i15 = 2 % 2;
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.RemoteActionCompatParcelizer = toolbar.getNavigationIcon();
                int i16 = 2 % 2;
            } else {
                i2 = 11;
            }
            this.IconCompatParcelizer = i2;
            int i17 = 2 % 2;
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        this.serializer = com.logistics.rider.glovo.R.string.abc_action_bar_up_description;
        if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
            String string = toolbar.getContext().getString(com.logistics.rider.glovo.R.string.abc_action_bar_up_description);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
            }
            this.MediaBrowserCompatMediaItem = string;
            IconCompatParcelizer();
        }
        this.MediaBrowserCompatMediaItem = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new getSupportButtonTintMode(this));
    }

    public final void IconCompatParcelizer() {
        if ((this.IconCompatParcelizer & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.MediaBrowserCompatMediaItem);
            androidx.appcompat.widget.Toolbar toolbar = this.PlaybackStateCompat;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.serializer);
            } else {
                toolbar.setNavigationContentDescription(this.MediaBrowserCompatMediaItem);
            }
        }
    }

    public final void serializer() {
        Drawable drawable;
        int i = this.IconCompatParcelizer;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.MediaMetadataCompat) == null) {
            drawable = this.RatingCompat;
        }
        this.PlaybackStateCompat.setLogo(drawable);
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
