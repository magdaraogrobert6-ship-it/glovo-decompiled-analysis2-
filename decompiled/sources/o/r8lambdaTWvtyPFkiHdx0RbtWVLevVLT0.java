package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.camera.core.ImageCapture$1;
import bo.app.af$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0 extends findViewById implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean ComponentActivity;
    public final Context IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final setTitle MediaDescriptionCompat;
    public int MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public PopupWindow.OnDismissListener ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public boolean RatingCompat;
    public View RemoteActionCompatParcelizer;
    public getDrawerToggleDelegate ResultReceiver;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public ViewTreeObserver r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final Handler r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public View r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final onMenuOpened read;
    public final ArrayList PlaybackStateCompatCustomAction = new ArrayList();
    public final ArrayList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new ArrayList();
    public final ImageCapture$1 MediaMetadataCompat = new ImageCapture$1(4, this);
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
    public int write = 0;
    public boolean serializer = false;

    @Override // o.findViewById
    public final void IconCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.ParcelableVolumeInfo = onDismissListener;
    }

    @Override // o.findViewById
    public final void IconCompatParcelizer(boolean z) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
    }

    @Override // o.findViewById
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.serializer = z;
    }

    @Override // o.findViewById
    public final void read(int i) {
        this.MediaBrowserCompatMediaItem = true;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
    }

    @Override // o.getResources
    public final void read(getDrawerToggleDelegate getdrawertoggledelegate) {
        this.ResultReceiver = getdrawertoggledelegate;
    }

    @Override // o.getResources
    public final boolean read() {
        return false;
    }

    @Override // o.findViewById
    public final void write(int i) {
        this.RatingCompat = true;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i;
    }

    @Override // o.getResources
    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (alertControllerButtonHandler == ((dispatchResult) arrayList.get(i)).serializer) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((dispatchResult) arrayList.get(i2)).serializer.RemoteActionCompatParcelizer(false);
        }
        dispatchResult dispatchresult = (dispatchResult) arrayList.remove(i);
        AlertControllerButtonHandler alertControllerButtonHandler2 = dispatchresult.serializer;
        getSupportBackgroundTintList getsupportbackgroundtintlist = dispatchresult.IconCompatParcelizer;
        setItemInvoker setiteminvoker = getsupportbackgroundtintlist.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        alertControllerButtonHandler2.write(this);
        if (this.ComponentActivity) {
            getSupportCompoundDrawablesTintList.RemoteActionCompatParcelizer(setiteminvoker, null);
            setiteminvoker.setAnimationStyle(0);
        }
        getsupportbackgroundtintlist.RemoteActionCompatParcelizer();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.MediaSessionCompatQueueItem = ((dispatchResult) arrayList.get(size2 - 1)).RemoteActionCompatParcelizer;
        } else {
            this.MediaSessionCompatQueueItem = this.RemoteActionCompatParcelizer.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((dispatchResult) arrayList.get(0)).serializer.RemoteActionCompatParcelizer(false);
                return;
            }
            return;
        }
        RemoteActionCompatParcelizer();
        getDrawerToggleDelegate getdrawertoggledelegate = this.ResultReceiver;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.read(alertControllerButtonHandler, true);
        }
        ViewTreeObserver viewTreeObserver = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.removeGlobalOnLayoutListener(this.MediaDescriptionCompat);
            }
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.removeOnAttachStateChangeListener(this.read);
        this.ParcelableVolumeInfo.onDismiss();
    }

    @Override // o.getResources
    public final void MediaDescriptionCompat() {
        Iterator it = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((dispatchResult) it.next()).IconCompatParcelizer.PlaybackStateCompat.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((onRestoreInstanceState) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.invalidateOptionsMenu
    public final void RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        dispatchResult[] dispatchresultArr = (dispatchResult[]) arrayList.toArray(new dispatchResult[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            dispatchResult dispatchresult = dispatchresultArr[size];
            if (dispatchresult.IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing()) {
                dispatchresult.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(onNightModeChanged onnightmodechanged) {
        for (dispatchResult dispatchresult : this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            if (onnightmodechanged == dispatchresult.serializer) {
                dispatchresult.IconCompatParcelizer.PlaybackStateCompat.requestFocus();
                return true;
            }
        }
        if (!onnightmodechanged.hasVisibleItems()) {
            return false;
        }
        write(onnightmodechanged);
        getDrawerToggleDelegate getdrawertoggledelegate = this.ResultReceiver;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.read(onnightmodechanged);
        }
        return true;
    }

    @Override // o.invalidateOptionsMenu
    public final setHasNonEmbeddedTabs a_() {
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((dispatchResult) af$$ExternalSyntheticOutline0.m(1, arrayList)).IconCompatParcelizer.PlaybackStateCompat;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        dispatchResult dispatchresult;
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dispatchresult = null;
                break;
            }
            dispatchresult = (dispatchResult) arrayList.get(i);
            if (!dispatchresult.IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dispatchresult != null) {
            dispatchresult.serializer.RemoteActionCompatParcelizer(false);
        }
    }

    @Override // o.invalidateOptionsMenu
    public final boolean serializer() {
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return arrayList.size() > 0 && ((dispatchResult) arrayList.get(0)).IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing();
    }

    @Override // o.findViewById
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        alertControllerButtonHandler.RemoteActionCompatParcelizer(this, this.IconCompatParcelizer);
        if (serializer()) {
            read(alertControllerButtonHandler);
        } else {
            this.PlaybackStateCompatCustomAction.add(alertControllerButtonHandler);
        }
    }

    @Override // o.findViewById
    public final void IconCompatParcelizer(int i) {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != i) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
            this.write = Gravity.getAbsoluteGravity(i, this.RemoteActionCompatParcelizer.getLayoutDirection());
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    public final void read(AlertControllerButtonHandler alertControllerButtonHandler) {
        boolean z;
        View childAt;
        dispatchResult dispatchresult;
        int i;
        int i2;
        MenuItem item;
        onRestoreInstanceState onrestoreinstancestate;
        int headersCount;
        Context context = this.IconCompatParcelizer;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        onRestoreInstanceState onrestoreinstancestate2 = new onRestoreInstanceState(alertControllerButtonHandler, layoutInflaterFrom, this.MediaSessionCompatToken, com.logistics.rider.glovo.R.layout.abc_cascading_menu_item_layout);
        if (!serializer() && this.serializer) {
            onrestoreinstancestate2.serializer = true;
        } else if (serializer()) {
            int size = alertControllerButtonHandler.ParcelableVolumeInfo.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = alertControllerButtonHandler.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            onrestoreinstancestate2.serializer = z;
        }
        int iRemoteActionCompatParcelizer = findViewById.RemoteActionCompatParcelizer(onrestoreinstancestate2, context, this.MediaSessionCompatResultReceiverWrapper);
        getSupportBackgroundTintList getsupportbackgroundtintlist = new getSupportBackgroundTintList(context, null, this.PlaybackStateCompat, 0);
        getsupportbackgroundtintlist.write = this.MediaMetadataCompat;
        getsupportbackgroundtintlist.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this;
        setItemInvoker setiteminvoker = getsupportbackgroundtintlist.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        setiteminvoker.setOnDismissListener(this);
        getsupportbackgroundtintlist.RatingCompat = this.RemoteActionCompatParcelizer;
        getsupportbackgroundtintlist.ParcelableVolumeInfo = this.write;
        getsupportbackgroundtintlist.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        setiteminvoker.setFocusable(true);
        setiteminvoker.setInputMethodMode(2);
        getsupportbackgroundtintlist.read(onrestoreinstancestate2);
        getsupportbackgroundtintlist.read(iRemoteActionCompatParcelizer);
        getsupportbackgroundtintlist.ParcelableVolumeInfo = this.write;
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (arrayList.size() > 0) {
            dispatchresult = (dispatchResult) af$$ExternalSyntheticOutline0.m(1, arrayList);
            AlertControllerButtonHandler alertControllerButtonHandler2 = dispatchresult.serializer;
            int size2 = alertControllerButtonHandler2.ParcelableVolumeInfo.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = alertControllerButtonHandler2.getItem(i4);
                if (item.hasSubMenu() && alertControllerButtonHandler == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                setHasNonEmbeddedTabs sethasnonembeddedtabs = dispatchresult.IconCompatParcelizer.PlaybackStateCompat;
                ListAdapter adapter = sethasnonembeddedtabs.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    onrestoreinstancestate = (onRestoreInstanceState) headerViewListAdapter.getWrappedAdapter();
                } else {
                    onrestoreinstancestate = (onRestoreInstanceState) adapter;
                    headersCount = 0;
                }
                int count = onrestoreinstancestate.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == onrestoreinstancestate.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    childAt = null;
                } else {
                    int firstVisiblePosition = (i5 + headersCount) - sethasnonembeddedtabs.getFirstVisiblePosition();
                    if (firstVisiblePosition < 0 || firstVisiblePosition >= sethasnonembeddedtabs.getChildCount()) {
                        childAt = null;
                    } else {
                        childAt = sethasnonembeddedtabs.getChildAt(firstVisiblePosition);
                    }
                }
            }
        } else {
            childAt = null;
            dispatchresult = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = getSupportBackgroundTintList.IconCompatParcelizer;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        try {
                            objArr[0] = Boolean.FALSE;
                            method.invoke(setiteminvoker, objArr);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                }
            } else {
                getSupportBackgroundTintMode.RemoteActionCompatParcelizer(setiteminvoker, false);
            }
            getSupportCompoundDrawablesTintList.IconCompatParcelizer(setiteminvoker, null);
            setHasNonEmbeddedTabs sethasnonembeddedtabs2 = ((dispatchResult) arrayList.get(arrayList.size() - 1)).IconCompatParcelizer.PlaybackStateCompat;
            int[] iArr = new int[2];
            sethasnonembeddedtabs2.getLocationOnScreen(iArr);
            android.graphics.Rect rect = new android.graphics.Rect();
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getWindowVisibleDisplayFrame(rect);
            if (this.MediaSessionCompatQueueItem == 1) {
                if (sethasnonembeddedtabs2.getWidth() + iArr[0] + iRemoteActionCompatParcelizer > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iRemoteActionCompatParcelizer < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.MediaSessionCompatQueueItem = i;
            getsupportbackgroundtintlist.RatingCompat = childAt;
            if ((this.write & 5) != 5) {
                i2 = 0;
                iRemoteActionCompatParcelizer = z2 ? childAt.getWidth() : 0 - iRemoteActionCompatParcelizer;
            } else if (z2) {
                i2 = 0;
            } else {
                i2 = 0;
                iRemoteActionCompatParcelizer = 0 - childAt.getWidth();
            }
            getsupportbackgroundtintlist.PlaybackStateCompatCustomAction = iRemoteActionCompatParcelizer;
            getsupportbackgroundtintlist.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
            getsupportbackgroundtintlist.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
            getsupportbackgroundtintlist.write(i2);
        } else {
            if (this.MediaBrowserCompatMediaItem) {
                getsupportbackgroundtintlist.PlaybackStateCompatCustomAction = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            }
            if (this.RatingCompat) {
                getsupportbackgroundtintlist.write(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            }
            android.graphics.Rect rect2 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            getsupportbackgroundtintlist.ComponentActivity = rect2 != null ? new android.graphics.Rect(rect2) : null;
        }
        arrayList.add(new dispatchResult(getsupportbackgroundtintlist, alertControllerButtonHandler, this.MediaSessionCompatQueueItem));
        getsupportbackgroundtintlist.b_();
        setHasNonEmbeddedTabs sethasnonembeddedtabs3 = getsupportbackgroundtintlist.PlaybackStateCompat;
        sethasnonembeddedtabs3.setOnKeyListener(this);
        if (dispatchresult == null && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && alertControllerButtonHandler.MediaMetadataCompat != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.abc_popup_menu_header_item_layout, (ViewGroup) sethasnonembeddedtabs3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(alertControllerButtonHandler.MediaMetadataCompat);
            sethasnonembeddedtabs3.addHeaderView(frameLayout, null, false);
            getsupportbackgroundtintlist.b_();
        }
    }

    @Override // o.findViewById
    public final void serializer(View view) {
        if (this.RemoteActionCompatParcelizer != view) {
            this.RemoteActionCompatParcelizer = view;
            this.write = Gravity.getAbsoluteGravity(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, view.getLayoutDirection());
        }
    }

    public r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0(Context context, View view, int i, boolean z) {
        int i2 = 1;
        this.MediaDescriptionCompat = new setTitle(i2, this);
        this.read = new onMenuOpened(i2, this);
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = view;
        this.PlaybackStateCompat = i;
        this.MediaSessionCompatToken = z;
        this.MediaSessionCompatQueueItem = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.MediaSessionCompatResultReceiverWrapper = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.abc_config_prefDialogWidth));
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Handler();
    }

    @Override // o.invalidateOptionsMenu
    public final void b_() {
        if (serializer()) {
            return;
        }
        ArrayList arrayList = this.PlaybackStateCompatCustomAction;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            read((AlertControllerButtonHandler) it.next());
        }
        arrayList.clear();
        View view = this.RemoteActionCompatParcelizer;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = view;
        if (view != null) {
            boolean z = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.MediaDescriptionCompat);
            }
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.addOnAttachStateChangeListener(this.read);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        RemoteActionCompatParcelizer();
        return true;
    }
}
