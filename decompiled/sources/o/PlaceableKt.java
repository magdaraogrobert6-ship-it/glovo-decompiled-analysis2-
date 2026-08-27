package o;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.MaterialCalendar;
import io.sentry.SentryUUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceableKt extends EdgeToEdgeExternalSyntheticLambda0 {
    public boolean MediaBrowserCompatMediaItem;
    public final placeWithLayeraW9wM MediaDescriptionCompat;
    public FrameLayout MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public androidx.coordinatorlayout.widget.CoordinatorLayout MediaSessionCompatResultReceiverWrapper;
    public PlacementScopeMarker ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public boolean RatingCompat;
    public accessgetTvTeletextcp RemoteActionCompatParcelizer;
    public BottomSheetBehavior read;
    public FrameLayout write;

    @Override // o.EdgeToEdgeExternalSyntheticLambda0, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(write(view, 0, null));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        IconCompatParcelizer();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.PlaybackStateCompat && android.graphics.Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.MediaMetadataCompat;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.MediaSessionCompatResultReceiverWrapper;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            SentryUUID.read(window, !z);
            PlacementScopeMarker placementScopeMarker = this.ParcelableVolumeInfo;
            if (placementScopeMarker != null) {
                placementScopeMarker.IconCompatParcelizer(window);
            }
        }
        accessgetTvTeletextcp accessgettvteletextcp = this.RemoteActionCompatParcelizer;
        if (accessgettvteletextcp == null) {
            return;
        }
        View view = (View) accessgettvteletextcp.write;
        boolean z2 = this.RatingCompat;
        getReusedNjRlDlw getreusednjrldlw = (getReusedNjRlDlw) accessgettvteletextcp.RemoteActionCompatParcelizer;
        if (z2) {
            if (getreusednjrldlw != null) {
                getreusednjrldlw.write((getSlotToReusedFromOnReuseNjRlDlw) accessgettvteletextcp.serializer, view, false);
            }
        } else if (getreusednjrldlw != null) {
            getreusednjrldlw.RemoteActionCompatParcelizer(view);
        }
    }

    @Override // o.EdgeToEdgeExternalSyntheticLambda0, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.read;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.read.setState(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        accessgetTvTeletextcp accessgettvteletextcp;
        super.setCancelable(z);
        if (this.RatingCompat != z) {
            this.RatingCompat = z;
            BottomSheetBehavior bottomSheetBehavior = this.read;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
            if (getWindow() == null || (accessgettvteletextcp = this.RemoteActionCompatParcelizer) == null) {
                return;
            }
            View view = (View) accessgettvteletextcp.write;
            boolean z2 = this.RatingCompat;
            getReusedNjRlDlw getreusednjrldlw = (getReusedNjRlDlw) accessgettvteletextcp.RemoteActionCompatParcelizer;
            if (z2) {
                if (getreusednjrldlw != null) {
                    getreusednjrldlw.write((getSlotToReusedFromOnReuseNjRlDlw) accessgettvteletextcp.serializer, view, false);
                }
            } else if (getreusednjrldlw != null) {
                getreusednjrldlw.RemoteActionCompatParcelizer(view);
            }
        }
    }

    public final FrameLayout write(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RemoteActionCompatParcelizer();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.MediaMetadataCompat.findViewById(com.logistics.rider.glovo.R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.PlaybackStateCompat) {
            FrameLayout frameLayout = this.write;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(15, this);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            accessgetCancelcp.write(frameLayout, pinnableContainerKtLocalPinnableContainer1);
        }
        this.write.removeAllViews();
        FrameLayout frameLayout2 = this.write;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(com.logistics.rider.glovo.R.id.touch_outside).setOnClickListener(new androidx.appcompat.widget.Toolbar.AnonymousClass4(3, this));
        FocusPropertiesNode.write(this.write, new MaterialCalendar.AnonymousClass6(2, this));
        this.write.setOnTouchListener(new withMotionFrameOfReferencePlacement(0));
        return this.MediaMetadataCompat;
    }

    public final BottomSheetBehavior IconCompatParcelizer() {
        if (this.read == null) {
            RemoteActionCompatParcelizer();
        }
        return this.read;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.MediaMetadataCompat == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), com.logistics.rider.glovo.R.layout.design_bottom_sheet_dialog, null);
            this.MediaMetadataCompat = frameLayout;
            this.MediaSessionCompatResultReceiverWrapper = (androidx.coordinatorlayout.widget.CoordinatorLayout) frameLayout.findViewById(com.logistics.rider.glovo.R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.MediaMetadataCompat.findViewById(com.logistics.rider.glovo.R.id.design_bottom_sheet);
            this.write = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
            this.read = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.MediaDescriptionCompat);
            this.read.setHideable(this.RatingCompat);
            this.RemoteActionCompatParcelizer = new accessgetTvTeletextcp(this.read, this.write);
        }
    }

    public PlaceableKt(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : com.logistics.rider.glovo.R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.RatingCompat = true;
        this.MediaSessionCompatQueueItem = true;
        this.MediaDescriptionCompat = new placeWithLayeraW9wM(this);
        RemoteActionCompatParcelizer(1);
        this.PlaybackStateCompat = getContext().getTheme().obtainStyledAttributes(new int[]{com.logistics.rider.glovo.R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        getReusedNjRlDlw getreusednjrldlw;
        PlacementScopeMarker placementScopeMarker = this.ParcelableVolumeInfo;
        if (placementScopeMarker != null) {
            placementScopeMarker.IconCompatParcelizer(null);
        }
        accessgetTvTeletextcp accessgettvteletextcp = this.RemoteActionCompatParcelizer;
        if (accessgettvteletextcp == null || (getreusednjrldlw = (getReusedNjRlDlw) accessgettvteletextcp.RemoteActionCompatParcelizer) == null) {
            return;
        }
        getreusednjrldlw.RemoteActionCompatParcelizer((View) accessgettvteletextcp.write);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.RatingCompat) {
            this.RatingCompat = true;
        }
        this.MediaSessionCompatQueueItem = z;
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // o.EdgeToEdgeExternalSyntheticLambda0, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(write(null, i, null));
    }

    @Override // o.EdgeToEdgeExternalSyntheticLambda0, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(write(view, 0, layoutParams));
    }
}
