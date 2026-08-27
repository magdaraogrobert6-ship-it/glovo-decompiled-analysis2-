package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class removeOnContextAvailableListener extends EdgeToEdgeExternalSyntheticLambda0 implements DialogInterface {
    public final onSaveInstanceState write;

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.write.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (nestedScrollView == null || !nestedScrollView.IconCompatParcelizer(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.write.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (nestedScrollView == null || !nestedScrollView.IconCompatParcelizer(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // o.EdgeToEdgeExternalSyntheticLambda0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        onSaveInstanceState onsaveinstancestate = this.write;
        onsaveinstancestate.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = charSequence;
        TextView textView = onsaveinstancestate.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public removeOnContextAvailableListener(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, read(contextThemeWrapper, i));
        this.write = new onSaveInstanceState(getContext(), this, getWindow());
    }

    @Override // o.EdgeToEdgeExternalSyntheticLambda0, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        onSaveInstanceState onsaveinstancestate = this.write;
        onsaveinstancestate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.setContentView(onsaveinstancestate.write);
        Context context = onsaveinstancestate.PlaybackStateCompat;
        Window window = onsaveinstancestate._init_lambda1;
        View viewFindViewById2 = window.findViewById(com.logistics.rider.glovo.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.logistics.rider.glovo.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.logistics.rider.glovo.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.logistics.rider.glovo.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.logistics.rider.glovo.R.id.customPanel);
        View view = onsaveinstancestate.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !onSaveInstanceState.RemoteActionCompatParcelizer(view)) {
            window.setFlags(androidx.compose.ui.graphics.Fields.RenderEffect, androidx.compose.ui.graphics.Fields.RenderEffect);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.logistics.rider.glovo.R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (onsaveinstancestate.accessensureViewModelStore) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                ((LinearLayout.LayoutParams) ((setWindowTitle) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.logistics.rider.glovo.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.logistics.rider.glovo.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.logistics.rider.glovo.R.id.buttonPanel);
        ViewGroup viewGroupWrite = onSaveInstanceState.write(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupWrite2 = onSaveInstanceState.write(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupWrite3 = onSaveInstanceState.write(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.logistics.rider.glovo.R.id.scrollView);
        onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupWrite2.findViewById(android.R.id.message);
        onsaveinstancestate.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = textView;
        if (textView != null) {
            CharSequence charSequence = onsaveinstancestate.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.removeView(onsaveinstancestate.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                if (onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                    ViewGroup viewGroup2 = (ViewGroup) onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupWrite2.setVisibility(8);
                }
            }
        }
        android.widget.Button button = (android.widget.Button) viewGroupWrite3.findViewById(android.R.id.button1);
        onsaveinstancestate.MediaMetadataCompat = button;
        androidx.appcompat.widget.Toolbar.AnonymousClass4 anonymousClass4 = onsaveinstancestate.serializer;
        button.setOnClickListener(anonymousClass4);
        boolean zIsEmpty = TextUtils.isEmpty(onsaveinstancestate.PlaybackStateCompatCustomAction);
        android.widget.Button button2 = onsaveinstancestate.MediaMetadataCompat;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(onsaveinstancestate.PlaybackStateCompatCustomAction);
            onsaveinstancestate.MediaMetadataCompat.setVisibility(0);
            i = 1;
        }
        android.widget.Button button3 = (android.widget.Button) viewGroupWrite3.findViewById(android.R.id.button2);
        onsaveinstancestate.RemoteActionCompatParcelizer = button3;
        button3.setOnClickListener(anonymousClass4);
        boolean zIsEmpty2 = TextUtils.isEmpty(onsaveinstancestate.RatingCompat);
        android.widget.Button button4 = onsaveinstancestate.RemoteActionCompatParcelizer;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(onsaveinstancestate.RatingCompat);
            onsaveinstancestate.RemoteActionCompatParcelizer.setVisibility(0);
            i |= 2;
        }
        android.widget.Button button5 = (android.widget.Button) viewGroupWrite3.findViewById(android.R.id.button3);
        onsaveinstancestate.MediaBrowserCompatMediaItem = button5;
        button5.setOnClickListener(anonymousClass4);
        boolean zIsEmpty3 = TextUtils.isEmpty(onsaveinstancestate.MediaDescriptionCompat);
        android.widget.Button button6 = onsaveinstancestate.MediaBrowserCompatMediaItem;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(onsaveinstancestate.MediaDescriptionCompat);
            onsaveinstancestate.MediaBrowserCompatMediaItem.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                android.widget.Button button7 = onsaveinstancestate.MediaMetadataCompat;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                android.widget.Button button8 = onsaveinstancestate.RemoteActionCompatParcelizer;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                android.widget.Button button9 = onsaveinstancestate.MediaBrowserCompatMediaItem;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupWrite3.setVisibility(8);
        }
        if (onsaveinstancestate.MediaSessionCompatResultReceiverWrapper != null) {
            viewGroupWrite.addView(onsaveinstancestate.MediaSessionCompatResultReceiverWrapper, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.logistics.rider.glovo.R.id.title_template).setVisibility(8);
        } else {
            onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(onsaveinstancestate.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) || !onsaveinstancestate.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
                window.findViewById(com.logistics.rider.glovo.R.id.title_template).setVisibility(8);
                onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(8);
                viewGroupWrite.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.logistics.rider.glovo.R.id.alertTitle);
                onsaveinstancestate.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = textView2;
                textView2.setText(onsaveinstancestate.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                Drawable drawable = onsaveinstancestate.ResultReceiver;
                if (drawable != null) {
                    onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setImageDrawable(drawable);
                } else {
                    onsaveinstancestate.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setPadding(onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getPaddingLeft(), onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getPaddingTop(), onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getPaddingRight(), onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getPaddingBottom());
                    onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupWrite == null || viewGroupWrite.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupWrite3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupWrite2.findViewById(com.logistics.rider.glovo.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (onsaveinstancestate.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null && onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) ? null : viewGroupWrite.findViewById(com.logistics.rider.glovo.R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupWrite2.findViewById(com.logistics.rider.glovo.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        peekAvailableContext peekavailablecontext = onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (peekavailablecontext != null && (!z3 || i2 == 0)) {
            peekavailablecontext.setPadding(peekavailablecontext.getPaddingLeft(), i2 != 0 ? peekavailablecontext.getPaddingTop() : peekavailablecontext.RemoteActionCompatParcelizer, peekavailablecontext.getPaddingRight(), z3 ? peekavailablecontext.getPaddingBottom() : peekavailablecontext.write);
        }
        if (!z2) {
            View view2 = onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (view2 == null) {
                view2 = onsaveinstancestate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(com.logistics.rider.glovo.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.logistics.rider.glovo.R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupWrite2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupWrite2.removeView(viewFindViewById12);
                }
            }
        }
        peekAvailableContext peekavailablecontext2 = onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (peekavailablecontext2 == null || (listAdapter = onsaveinstancestate.read) == null) {
            return;
        }
        peekavailablecontext2.setAdapter(listAdapter);
        int i4 = onsaveinstancestate.ParcelableVolumeInfo;
        if (i4 > -1) {
            peekavailablecontext2.setItemChecked(i4, true);
            peekavailablecontext2.setSelection(i4);
        }
    }

    public static int read(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }
}
