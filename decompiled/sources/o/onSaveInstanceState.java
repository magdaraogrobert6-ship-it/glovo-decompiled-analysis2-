package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$ButtonHandler;
import androidx.core.widget.NestedScrollView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class onSaveInstanceState {
    public final AlertController$ButtonHandler ComponentActivity;
    public Message IconCompatParcelizer;
    public android.widget.Button MediaBrowserCompatMediaItem;
    public CharSequence MediaDescriptionCompat;
    public android.widget.Button MediaMetadataCompat;
    public Message MediaSessionCompatQueueItem;
    public View MediaSessionCompatResultReceiverWrapper;
    public Message MediaSessionCompatToken;
    public final Context PlaybackStateCompat;
    public CharSequence PlaybackStateCompatCustomAction;
    public CharSequence RatingCompat;
    public android.widget.Button RemoteActionCompatParcelizer;
    public Drawable ResultReceiver;
    public final Window _init_lambda1;
    public ImageView r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final removeOnContextAvailableListener r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public CharSequence r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public NestedScrollView r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public TextView r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public peekAvailableContext r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public View r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public TextView r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public CharSequence r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public ListAdapter read;
    public final int write;
    public boolean accessensureViewModelStore = false;
    public int ParcelableVolumeInfo = -1;
    public final androidx.appcompat.widget.Toolbar.AnonymousClass4 serializer = new androidx.appcompat.widget.Toolbar.AnonymousClass4(1, this);

    public static ViewGroup write(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void IconCompatParcelizer(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.ComponentActivity.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.MediaDescriptionCompat = charSequence;
            this.MediaSessionCompatQueueItem = messageObtainMessage;
        } else if (i == -2) {
            this.RatingCompat = charSequence;
            this.IconCompatParcelizer = messageObtainMessage;
        } else if (i != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Button does not exist");
        } else {
            this.PlaybackStateCompatCustomAction = charSequence;
            this.MediaSessionCompatToken = messageObtainMessage;
        }
    }

    public onSaveInstanceState(Context context, removeOnContextAvailableListener removeoncontextavailablelistener, Window window) {
        this.PlaybackStateCompat = context;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = removeoncontextavailablelistener;
        this._init_lambda1 = window;
        AlertController$ButtonHandler alertController$ButtonHandler = new AlertController$ButtonHandler();
        alertController$ButtonHandler.write = new java.lang.ref.WeakReference(removeoncontextavailablelistener);
        this.ComponentActivity = alertController$ButtonHandler;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, onUserLeaveHint.AlertDialog, com.logistics.rider.glovo.R.attr.alertDialogStyle, 0);
        this.write = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        removeoncontextavailablelistener.RemoteActionCompatParcelizer(1);
    }

    public static boolean RemoteActionCompatParcelizer(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (RemoteActionCompatParcelizer(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }
}
