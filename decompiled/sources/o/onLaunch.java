package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class onLaunch extends LinearLayout implements getSupportActionBar, AbsListView.SelectionBoundsAdjuster {
    public LinearLayout IconCompatParcelizer;
    public ImageView MediaBrowserCompatMediaItem;
    public Keep MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public LayoutInflater MediaSessionCompatQueueItem;
    public ImageView MediaSessionCompatResultReceiverWrapper;
    public final Drawable MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public android.widget.RadioButton PlaybackStateCompat;
    public TextView PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public ImageView RemoteActionCompatParcelizer;
    public final Context ResultReceiver;
    public TextView r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final Drawable read;
    public boolean serializer;
    public CheckBox write;

    @Override // o.getSupportActionBar
    public Keep getItemData() {
        return this.MediaDescriptionCompat;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // o.getSupportActionBar
    public final void initialize(Keep keep) {
        boolean z;
        int i;
        String string;
        this.MediaDescriptionCompat = keep;
        boolean zIsVisible = keep.isVisible();
        AlertControllerButtonHandler alertControllerButtonHandler = keep.ResultReceiver;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(keep.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        setCheckable(keep.isCheckable());
        if (alertControllerButtonHandler.MediaMetadataCompat()) {
            if ((alertControllerButtonHandler.RatingCompat() ? keep.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss : keep.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        alertControllerButtonHandler.RatingCompat();
        if (z) {
            Keep keep2 = this.MediaDescriptionCompat;
            AlertControllerButtonHandler alertControllerButtonHandler2 = keep2.ResultReceiver;
            if (alertControllerButtonHandler2.MediaMetadataCompat()) {
                i = (alertControllerButtonHandler2.RatingCompat() ? keep2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss : keep2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.PlaybackStateCompatCustomAction;
            Keep keep3 = this.MediaDescriptionCompat;
            AlertControllerButtonHandler alertControllerButtonHandler3 = keep3.ResultReceiver;
            Context context = alertControllerButtonHandler3.write;
            char c = alertControllerButtonHandler3.RatingCompat() ? keep3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss : keep3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (android.view.ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.logistics.rider.glovo.R.string.abc_prepend_shortcut_label));
                }
                int i2 = alertControllerButtonHandler3.RatingCompat() ? keep3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : keep3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                Keep.serializer(i2, 65536, resources.getString(com.logistics.rider.glovo.R.string.abc_menu_meta_shortcut_label), sb);
                Keep.serializer(i2, androidx.compose.ui.graphics.Fields.TransformOrigin, resources.getString(com.logistics.rider.glovo.R.string.abc_menu_ctrl_shortcut_label), sb);
                Keep.serializer(i2, 2, resources.getString(com.logistics.rider.glovo.R.string.abc_menu_alt_shortcut_label), sb);
                Keep.serializer(i2, 1, resources.getString(com.logistics.rider.glovo.R.string.abc_menu_shift_shortcut_label), sb);
                Keep.serializer(i2, 4, resources.getString(com.logistics.rider.glovo.R.string.abc_menu_sym_shortcut_label), sb);
                Keep.serializer(i2, 8, resources.getString(com.logistics.rider.glovo.R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(com.logistics.rider.glovo.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(com.logistics.rider.glovo.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(com.logistics.rider.glovo.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.PlaybackStateCompatCustomAction.getVisibility() != i) {
            this.PlaybackStateCompatCustomAction.setVisibility(i);
        }
        setIcon(keep.getIcon());
        setEnabled(keep.isEnabled());
        setSubMenuArrowVisible(keep.hasSubMenu());
        setContentDescription(keep.read);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.PlaybackStateCompat == null && this.write == null) {
            return;
        }
        if ((this.MediaDescriptionCompat.RatingCompat & 4) != 0) {
            if (this.PlaybackStateCompat == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.logistics.rider.glovo.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.PlaybackStateCompat = radioButton;
                LinearLayout linearLayout = this.IconCompatParcelizer;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.PlaybackStateCompat;
            view = this.write;
        } else {
            if (this.write == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.logistics.rider.glovo.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.write = checkBox;
                LinearLayout linearLayout2 = this.IconCompatParcelizer;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.write;
            view = this.PlaybackStateCompat;
        }
        if (z) {
            compoundButton.setChecked(this.MediaDescriptionCompat.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.write;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        android.widget.RadioButton radioButton2 = this.PlaybackStateCompat;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.MediaDescriptionCompat.RatingCompat & 4) != 0) {
            if (this.PlaybackStateCompat == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.logistics.rider.glovo.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.PlaybackStateCompat = radioButton;
                LinearLayout linearLayout = this.IconCompatParcelizer;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.PlaybackStateCompat;
        } else {
            if (this.write == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.logistics.rider.glovo.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.write = checkBox;
                LinearLayout linearLayout2 = this.IconCompatParcelizer;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.write;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.serializer = z;
        this.RatingCompat = z;
    }

    public void setIcon(Drawable drawable) {
        AlertControllerButtonHandler alertControllerButtonHandler = this.MediaDescriptionCompat.ResultReceiver;
        boolean z = this.serializer;
        if (z || this.RatingCompat) {
            ImageView imageView = this.MediaBrowserCompatMediaItem;
            if (imageView == null && drawable == null && !this.RatingCompat) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.logistics.rider.glovo.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.MediaBrowserCompatMediaItem = imageView2;
                LinearLayout linearLayout = this.IconCompatParcelizer;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.RatingCompat) {
                this.MediaBrowserCompatMediaItem.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.MediaBrowserCompatMediaItem;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.MediaBrowserCompatMediaItem.getVisibility() != 0) {
                this.MediaBrowserCompatMediaItem.setVisibility(0);
            }
        }
    }

    public onLaunch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(getContext(), attributeSet, onUserLeaveHint.MenuView, com.logistics.rider.glovo.R.attr.listMenuViewStyle);
        this.read = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(5);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        this.ParcelableVolumeInfo = typedArray.getResourceId(1, -1);
        this.RatingCompat = typedArray.getBoolean(7, false);
        this.ResultReceiver = context;
        this.MediaSessionCompatToken = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.logistics.rider.glovo.R.attr.dropDownListViewStyle, 0);
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.hasValue(0);
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.read);
        TextView textView = (TextView) findViewById(com.logistics.rider.glovo.R.id.title);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = textView;
        int i = this.ParcelableVolumeInfo;
        if (i != -1) {
            textView.setTextAppearance(this.ResultReceiver, i);
        }
        this.PlaybackStateCompatCustomAction = (TextView) findViewById(com.logistics.rider.glovo.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.logistics.rider.glovo.R.id.submenuarrow);
        this.MediaSessionCompatResultReceiverWrapper = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.MediaSessionCompatToken);
        }
        this.RemoteActionCompatParcelizer = (ImageView) findViewById(com.logistics.rider.glovo.R.id.group_divider);
        this.IconCompatParcelizer = (LinearLayout) findViewById(com.logistics.rider.glovo.R.id.content);
    }

    private LayoutInflater getInflater() {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = LayoutInflater.from(getContext());
        }
        return this.MediaSessionCompatQueueItem;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        ImageView imageView = this.RemoteActionCompatParcelizer;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.RemoteActionCompatParcelizer.getLayoutParams();
        rect.top = this.RemoteActionCompatParcelizer.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.MediaBrowserCompatMediaItem != null && this.RatingCompat) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.MediaBrowserCompatMediaItem.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.RemoteActionCompatParcelizer;
        if (imageView != null) {
            imageView.setVisibility((this.MediaMetadataCompat || !z) ? 8 : 0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getVisibility() != 0) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(0);
            }
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.MediaSessionCompatResultReceiverWrapper;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }
}
