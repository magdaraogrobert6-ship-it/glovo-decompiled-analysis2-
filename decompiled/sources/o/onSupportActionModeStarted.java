package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class onSupportActionModeStarted implements getResources {
    public Context IconCompatParcelizer;
    public AlertControllerButtonHandler MediaBrowserCompatMediaItem;
    public boolean MediaMetadataCompat;
    public onTitleChanged MediaSessionCompatResultReceiverWrapper;
    public openOptionsMenu MediaSessionCompatToken;
    public Drawable ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public onCreateSupportNavigateUpTaskStack PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public onSupportNavigateUp ResultReceiver;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public onSupportContentChanged r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public LayoutInflater r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public Context r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public int read;
    public openOptionsMenu serializer;
    public getDrawerToggleDelegate write;
    public int MediaSessionCompatQueueItem = com.logistics.rider.glovo.R.layout.abc_action_menu_layout;
    public int MediaDescriptionCompat = com.logistics.rider.glovo.R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray RemoteActionCompatParcelizer = new SparseBooleanArray();
    public final ImageCapture$1 ComponentActivity = new ImageCapture$1(6, this);

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(Keep keep) {
        return false;
    }

    @Override // o.getResources
    public final boolean write(Keep keep) {
        return false;
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(Context context, AlertControllerButtonHandler alertControllerButtonHandler) {
        this.IconCompatParcelizer = context;
        LayoutInflater.from(context);
        this.MediaBrowserCompatMediaItem = alertControllerButtonHandler;
        Resources resources = context.getResources();
        if (!this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
        }
        int i = 2;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.RatingCompat = i;
        int measuredWidth = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                onTitleChanged ontitlechanged = new onTitleChanged(this, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                this.MediaSessionCompatResultReceiverWrapper = ontitlechanged;
                if (this.PlaybackStateCompat) {
                    ontitlechanged.setImageDrawable(this.ParcelableVolumeInfo);
                    this.ParcelableVolumeInfo = null;
                    this.PlaybackStateCompat = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.MediaSessionCompatResultReceiverWrapper.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.MediaSessionCompatResultReceiverWrapper.getMeasuredWidth();
        } else {
            this.MediaSessionCompatResultReceiverWrapper = null;
        }
        this.read = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getResources
    public final void MediaDescriptionCompat() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.PlaybackStateCompatCustomAction;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            AlertControllerButtonHandler alertControllerButtonHandler = this.MediaBrowserCompatMediaItem;
            if (alertControllerButtonHandler != null) {
                alertControllerButtonHandler.serializer();
                ArrayList arrayListRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                int size = arrayListRemoteActionCompatParcelizer.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    Keep keep = (Keep) arrayListRemoteActionCompatParcelizer.get(i2);
                    if ((keep.RatingCompat & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        Keep itemData = childAt instanceof getSupportActionBar ? ((getSupportActionBar) childAt).getItemData() : null;
                        View viewSerializer = serializer(keep, childAt, viewGroup);
                        if (keep != itemData) {
                            viewSerializer.setPressed(false);
                            viewSerializer.jumpDrawablesToCurrentState();
                        }
                        if (viewSerializer != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewSerializer.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewSerializer);
                            }
                            ((ViewGroup) this.PlaybackStateCompatCustomAction).addView(viewSerializer, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.MediaSessionCompatResultReceiverWrapper) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.PlaybackStateCompatCustomAction).requestLayout();
        AlertControllerButtonHandler alertControllerButtonHandler2 = this.MediaBrowserCompatMediaItem;
        if (alertControllerButtonHandler2 != null) {
            alertControllerButtonHandler2.serializer();
            ArrayList arrayList2 = alertControllerButtonHandler2.serializer;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                attachBaseContext attachbasecontext = ((Keep) arrayList2.get(i3)).IconCompatParcelizer;
            }
        }
        AlertControllerButtonHandler alertControllerButtonHandler3 = this.MediaBrowserCompatMediaItem;
        if (alertControllerButtonHandler3 != null) {
            alertControllerButtonHandler3.serializer();
            arrayList = alertControllerButtonHandler3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((Keep) arrayList.get(0)).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            } else if (size3 > 0) {
                z = true;
            }
        }
        onTitleChanged ontitlechanged = this.MediaSessionCompatResultReceiverWrapper;
        if (z) {
            if (ontitlechanged == null) {
                this.MediaSessionCompatResultReceiverWrapper = new onTitleChanged(this, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.MediaSessionCompatResultReceiverWrapper.getParent();
            if (viewGroup3 != this.PlaybackStateCompatCustomAction) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.MediaSessionCompatResultReceiverWrapper);
                }
                setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = (setSupportProgressBarIndeterminateVisibility) this.PlaybackStateCompatCustomAction;
                onTitleChanged ontitlechanged2 = this.MediaSessionCompatResultReceiverWrapper;
                setsupportprogressbarindeterminatevisibility.getClass();
                setSupportProgress setsupportprogressSerializer = setSupportProgressBarIndeterminateVisibility.serializer();
                setsupportprogressSerializer.serializer = true;
                setsupportprogressbarindeterminatevisibility.addView(ontitlechanged2, setsupportprogressSerializer);
            }
        } else if (ontitlechanged != null) {
            Object parent = ontitlechanged.getParent();
            Object obj = this.PlaybackStateCompatCustomAction;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.MediaSessionCompatResultReceiverWrapper);
            }
        }
        ((setSupportProgressBarIndeterminateVisibility) this.PlaybackStateCompatCustomAction).setOverflowReserved(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
    }

    @Override // o.getResources
    public final boolean read() {
        int size;
        ArrayList arrayListRemoteActionCompatParcelizer;
        int i;
        boolean z;
        onSupportActionModeStarted onsupportactionmodestarted = this;
        AlertControllerButtonHandler alertControllerButtonHandler = onsupportactionmodestarted.MediaBrowserCompatMediaItem;
        if (alertControllerButtonHandler != null) {
            arrayListRemoteActionCompatParcelizer = alertControllerButtonHandler.RemoteActionCompatParcelizer();
            size = arrayListRemoteActionCompatParcelizer.size();
        } else {
            size = 0;
            arrayListRemoteActionCompatParcelizer = null;
        }
        int i2 = onsupportactionmodestarted.RatingCompat;
        int i3 = onsupportactionmodestarted.read;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) onsupportactionmodestarted.PlaybackStateCompatCustomAction;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            Keep keep = (Keep) arrayListRemoteActionCompatParcelizer.get(i4);
            int i7 = keep.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (onsupportactionmodestarted.MediaMetadataCompat && keep.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                i2 = 0;
            }
            i4++;
        }
        if (onsupportactionmodestarted.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = onsupportactionmodestarted.RemoteActionCompatParcelizer;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            Keep keep2 = (Keep) arrayListRemoteActionCompatParcelizer.get(i9);
            int i11 = keep2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = keep2.MediaSessionCompatQueueItem;
            if (z3) {
                View viewSerializer = onsupportactionmodestarted.serializer(keep2, null, viewGroup);
                viewSerializer.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewSerializer.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                keep2.write(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewSerializer2 = onsupportactionmodestarted.serializer(keep2, null, viewGroup);
                        viewSerializer2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewSerializer2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            Keep keep3 = (Keep) arrayListRemoteActionCompatParcelizer.get(i13);
                            if (keep3.MediaSessionCompatQueueItem == i12) {
                                if ((keep3.RatingCompat & 32) == 32) {
                                    i8++;
                                }
                                keep3.write(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    keep2.write(z5);
                } else {
                    keep2.write(false);
                }
                i9++;
                i = 2;
                onsupportactionmodestarted = this;
                z = true;
            }
            i9++;
            i = 2;
            onsupportactionmodestarted = this;
            z = true;
        }
        return z;
    }

    public onSupportActionModeStarted(Context context) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = context;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = LayoutInflater.from(context);
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        RemoteActionCompatParcelizer();
        openOptionsMenu openoptionsmenu = this.serializer;
        if (openoptionsmenu != null && openoptionsmenu.serializer()) {
            openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
        getDrawerToggleDelegate getdrawertoggledelegate = this.write;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.read(alertControllerButtonHandler, z);
        }
    }

    public final boolean serializer() {
        AlertControllerButtonHandler alertControllerButtonHandler;
        if (!this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus || write() || (alertControllerButtonHandler = this.MediaBrowserCompatMediaItem) == null || this.PlaybackStateCompatCustomAction == null || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            return false;
        }
        alertControllerButtonHandler.serializer();
        if (alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.isEmpty()) {
            return false;
        }
        onSupportContentChanged onsupportcontentchanged = new onSupportContentChanged(this, new openOptionsMenu(this, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatResultReceiverWrapper));
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = onsupportcontentchanged;
        ((View) this.PlaybackStateCompatCustomAction).post(onsupportcontentchanged);
        return true;
    }

    public final boolean write() {
        openOptionsMenu openoptionsmenu = this.MediaSessionCompatToken;
        return openoptionsmenu != null && openoptionsmenu.serializer();
    }

    public final boolean RemoteActionCompatParcelizer() {
        Object obj;
        onSupportContentChanged onsupportcontentchanged = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (onsupportcontentchanged != null && (obj = this.PlaybackStateCompatCustomAction) != null) {
            ((View) obj).removeCallbacks(onsupportcontentchanged);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            return true;
        }
        openOptionsMenu openoptionsmenu = this.MediaSessionCompatToken;
        if (openoptionsmenu == null) {
            return false;
        }
        if (openoptionsmenu.serializer()) {
            openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View serializer(Keep keep, View view, ViewGroup viewGroup) {
        View actionView = keep.getActionView();
        if (actionView == null || keep.IconCompatParcelizer()) {
            getSupportActionBar getsupportactionbar = view instanceof getSupportActionBar ? (getSupportActionBar) view : (getSupportActionBar) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.inflate(this.MediaDescriptionCompat, viewGroup, false);
            getsupportactionbar.initialize(keep);
            accessgetLaunchedKeysp accessgetlaunchedkeysp = (accessgetLaunchedKeysp) getsupportactionbar;
            accessgetlaunchedkeysp.setItemInvoker((setSupportProgressBarIndeterminateVisibility) this.PlaybackStateCompatCustomAction);
            if (this.ResultReceiver == null) {
                this.ResultReceiver = new onSupportNavigateUp(this);
            }
            accessgetlaunchedkeysp.setPopupCallback(this.ResultReceiver);
            actionView = (View) getsupportactionbar;
        }
        actionView.setVisibility(keep.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((setSupportProgressBarIndeterminateVisibility) viewGroup).getClass();
        if (!(layoutParams instanceof setSupportProgress)) {
            actionView.setLayoutParams(setSupportProgressBarIndeterminateVisibility.IconCompatParcelizer(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(onNightModeChanged onnightmodechanged) {
        View childAt;
        boolean z;
        if (onnightmodechanged.hasVisibleItems()) {
            onNightModeChanged onnightmodechanged2 = onnightmodechanged;
            while (true) {
                AlertControllerButtonHandler alertControllerButtonHandler = onnightmodechanged2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (alertControllerButtonHandler == this.MediaBrowserCompatMediaItem) {
                    break;
                }
                onnightmodechanged2 = (onNightModeChanged) alertControllerButtonHandler;
            }
            Keep keep = onnightmodechanged2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            ViewGroup viewGroup = (ViewGroup) this.PlaybackStateCompatCustomAction;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = 0;
                        break;
                    }
                    childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof getSupportActionBar) && ((getSupportActionBar) childAt).getItemData() == keep) {
                        break;
                    }
                    i++;
                }
            } else {
                childAt = 0;
                break;
            }
            if (childAt != 0) {
                onnightmodechanged.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getClass();
                int size = onnightmodechanged.ParcelableVolumeInfo.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = onnightmodechanged.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                openOptionsMenu openoptionsmenu = new openOptionsMenu(this, this.IconCompatParcelizer, onnightmodechanged, childAt);
                this.serializer = openoptionsmenu;
                openoptionsmenu.write = z;
                findViewById findviewbyid = openoptionsmenu.MediaMetadataCompat;
                if (findviewbyid != null) {
                    findviewbyid.RemoteActionCompatParcelizer(z);
                }
                openOptionsMenu openoptionsmenu2 = this.serializer;
                if (!openoptionsmenu2.serializer()) {
                    if (openoptionsmenu2.serializer == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    openoptionsmenu2.write(0, 0, false, false);
                }
                getDrawerToggleDelegate getdrawertoggledelegate = this.write;
                if (getdrawertoggledelegate != null) {
                    getdrawertoggledelegate.read(onnightmodechanged);
                }
                return true;
            }
        }
        return false;
    }
}
