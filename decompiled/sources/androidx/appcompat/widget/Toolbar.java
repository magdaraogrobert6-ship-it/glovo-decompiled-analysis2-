package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.graphics.Fields;
import androidx.customview.view.AbsSavedState;
import androidx.emoji2.text.EmojiProcessor;
import coil3.util.IntPair;
import com.google.android.gms.stats.zza;
import com.google.android.material.datepicker.MaterialCalendar;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AlertControllerButtonHandler;
import o.FocusPropertiesCompanion;
import o.FocusPropertiesNode;
import o.Keep;
import o.PlaceableKt;
import o.SystemBarStyleCompanion;
import o.WindowCallbackWrapper;
import o.addCloseableactivity;
import o.getAutoSizeMaxTextSize;
import o.getAutoSizeMinTextSize;
import o.getAutoSizeStepGranularity;
import o.getAutoSizeTextType;
import o.getMinDimensionannotations;
import o.getUnsetFocusRect;
import o.handleOnBackPressed;
import o.onSaveInstanceState;
import o.onSupportActionModeStarted;
import o.onUserLeaveHint;
import o.setActionBarHideOffset;
import o.setAllCaps;
import o.setAutoSizeTextTypeWithDefaults;
import o.setCustomSelectionActionModeCallback;
import o.setDropDownVerticalOffset;
import o.setFilters;
import o.setOnExit;
import o.setSupportCompoundDrawablesTintMode;
import o.setSupportProgressBarIndeterminateVisibility;
import o.setTextAppearance;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements setOnExit {
    private static int onBackPressedDispatcher_delegatelambda0 = 0;
    private static int onBackPressedDispatcher_delegatelambda00 = 1;
    private static byte onBackPressedDispatcher_delegatelambda010 = -112;
    public final int ComponentActivity;
    public boolean IconCompatParcelizer;
    public WindowCallbackWrapper MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final CharSequence MediaMetadataCompat;
    public final Drawable MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public View PlaybackStateCompat;
    public setCustomSelectionActionModeCallback PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public OnBackInvokedDispatcher RemoteActionCompatParcelizer;
    public AppCompatImageView ResultReceiver;
    public ColorStateList _init_lambda1;
    public final zza _init_lambda2;
    public CharSequence _init_lambda3;
    public AppCompatTextView _init_lambda4;
    public int accessensureViewModelStore;
    public setFilters addContentView;
    public int addObserverForBackInvoker;
    public final int[] addObserverForBackInvokerlambda0;
    public int createFullyDrawnExecutor;
    public final ArrayList defaultViewModelProviderFactory_delegatelambda0;
    public int ensureViewModelStore;
    public int fullyDrawnReporter_delegatelambda0;
    public CharSequence fullyDrawnReporter_delegatelambda00;
    public AppCompatTextView getOnBackPressedInput;
    public ColorStateList getSavedStateRegistryControllerannotations;
    public int menuHostHelperlambda0;
    public final ArrayList r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public setAllCaps r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public setSupportProgressBarIndeterminateVisibility r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public WindowCallbackWrapper r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final FocusPropertiesCompanion r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final setSupportCompoundDrawablesTintMode r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public addCloseableactivity r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public Context r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public onSupportActionModeStarted r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public ArrayList r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public getAutoSizeMinTextSize r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final int read;
    public OnBackInvokedCallback serializer;
    public setDropDownVerticalOffset write;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$4, reason: invalid class name */
    public final class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ int serializer;
        public final /* synthetic */ Object write;

        public /* synthetic */ AnonymousClass4(int i, Object obj) {
            this.serializer = i;
            this.write = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            int i = this.serializer;
            Object obj = this.write;
            messageObtain = null;
            Message messageObtain = null;
            if (i == 0) {
                setAllCaps setallcaps = ((Toolbar) obj).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                Keep keep = setallcaps != null ? setallcaps.IconCompatParcelizer : null;
                if (keep != null) {
                    keep.collapseActionView();
                    return;
                }
                return;
            }
            if (i == 1) {
                onSaveInstanceState onsaveinstancestate = (onSaveInstanceState) obj;
                if (view == onsaveinstancestate.MediaMetadataCompat && (message3 = onsaveinstancestate.MediaSessionCompatToken) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == onsaveinstancestate.RemoteActionCompatParcelizer && (message2 = onsaveinstancestate.IconCompatParcelizer) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == onsaveinstancestate.MediaBrowserCompatMediaItem && (message = onsaveinstancestate.MediaSessionCompatQueueItem) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                onsaveinstancestate.ComponentActivity.obtainMessage(1, onsaveinstancestate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).sendToTarget();
                return;
            }
            if (i == 2) {
                ((handleOnBackPressed) obj).RemoteActionCompatParcelizer();
                return;
            }
            if (i != 3) {
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                MaterialCalendar.IconCompatParcelizer iconCompatParcelizer = materialCalendar.read;
                MaterialCalendar.IconCompatParcelizer iconCompatParcelizer2 = MaterialCalendar.IconCompatParcelizer.YEAR;
                if (iconCompatParcelizer == iconCompatParcelizer2) {
                    materialCalendar.read(MaterialCalendar.IconCompatParcelizer.DAY);
                    return;
                } else {
                    if (iconCompatParcelizer == MaterialCalendar.IconCompatParcelizer.DAY) {
                        materialCalendar.read(iconCompatParcelizer2);
                        return;
                    }
                    return;
                }
            }
            PlaceableKt placeableKt = (PlaceableKt) obj;
            if (placeableKt.RatingCompat && placeableKt.isShowing()) {
                if (!placeableKt.MediaBrowserCompatMediaItem) {
                    TypedArray typedArrayObtainStyledAttributes = placeableKt.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                    placeableKt.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    placeableKt.MediaBrowserCompatMediaItem = true;
                }
                if (placeableKt.MediaSessionCompatQueueItem) {
                    placeableKt.cancel();
                }
            }
        }
    }

    public View getNavButtonView() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public onSupportActionModeStarted getOuterActionMenuPresenter() {
        return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    public Context getPopupContext() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public int getPopupTheme() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    public CharSequence getSubtitle() {
        return this._init_lambda3;
    }

    public final TextView getSubtitleTextView() {
        return this._init_lambda4;
    }

    public CharSequence getTitle() {
        return this.fullyDrawnReporter_delegatelambda00;
    }

    public int getTitleMarginBottom() {
        return this.ensureViewModelStore;
    }

    public int getTitleMarginEnd() {
        return this.addObserverForBackInvoker;
    }

    public int getTitleMarginStart() {
        return this.createFullyDrawnExecutor;
    }

    public int getTitleMarginTop() {
        return this.fullyDrawnReporter_delegatelambda0;
    }

    public final TextView getTitleTextView() {
        return this.getOnBackPressedInput;
    }

    public void setOnMenuItemClickListener(getAutoSizeMinTextSize getautosizemintextsize) {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = getautosizemintextsize;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new getAutoSizeStepGranularity();
        public boolean RemoteActionCompatParcelizer;
        public int write;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.write = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.write);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SystemBarStyleCompanion(getContext());
    }

    public final boolean IconCompatParcelizer(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void MediaDescriptionCompat() {
        Iterator it = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write.iterator();
        while (it2.hasNext()) {
            ((getMinDimensionannotations) ((getUnsetFocusRect) it2.next())).write.write(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = currentMenuItems2;
    }

    @Override // o.setOnExit
    public final void addMenuProvider(getUnsetFocusRect getunsetfocusrect) {
        FocusPropertiesCompanion focusPropertiesCompanion = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        focusPropertiesCompanion.write.add(getunsetfocusrect);
        focusPropertiesCompanion.serializer.run();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:0x0272  */
    /* JADX WARN: Code duplicated, block: B:105:0x0275  */
    /* JADX WARN: Code duplicated, block: B:108:0x0287 A[LOOP:0: B:107:0x0285->B:108:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a3 A[LOOP:1: B:110:0x02a1->B:111:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02c3 A[LOOP:2: B:113:0x02c1->B:114:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0304 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0306  */
    /* JADX WARN: Code duplicated, block: B:120:0x030a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0311 A[LOOP:3: B:122:0x030f->B:123:0x0311, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0209  */
    /* JADX WARN: Code duplicated, block: B:93:0x020c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0212 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0217  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iRemoteActionCompatParcelizer;
        int i5;
        int iMax;
        int iMin;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        getAutoSizeTextType getautosizetexttype;
        getAutoSizeTextType getautosizetexttype2;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iRemoteActionCompatParcelizer2;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int i23;
        int measuredWidth;
        int i24;
        int i25;
        int i26;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility;
        WindowCallbackWrapper windowCallbackWrapper;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.addObserverForBackInvokerlambda0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
            WindowCallbackWrapper windowCallbackWrapper2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (z3) {
                i5 = read(windowCallbackWrapper2, i27, iMin2, iArr);
                iRemoteActionCompatParcelizer = paddingLeft;
            } else {
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(windowCallbackWrapper2, paddingLeft, iMin2, iArr);
            }
            if (IconCompatParcelizer(this.MediaBrowserCompatMediaItem)) {
                windowCallbackWrapper = this.MediaBrowserCompatMediaItem;
                if (z3) {
                    i5 = read(windowCallbackWrapper, i5, iMin2, iArr);
                } else {
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(windowCallbackWrapper, iRemoteActionCompatParcelizer, iMin2, iArr);
                }
            }
            if (IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)) {
                setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (z3) {
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setsupportprogressbarindeterminatevisibility, iRemoteActionCompatParcelizer, iMin2, iArr);
                } else {
                    i5 = read(setsupportprogressbarindeterminatevisibility, i5, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iRemoteActionCompatParcelizer);
            iArr[1] = Math.max(0, currentContentInsetRight - (i27 - i5));
            iMax = Math.max(iRemoteActionCompatParcelizer, currentContentInsetLeft);
            iMin = Math.min(i5, i27 - currentContentInsetRight);
            if (IconCompatParcelizer(this.PlaybackStateCompat)) {
                view = this.PlaybackStateCompat;
                if (z3) {
                    iMin = read(view, iMin, iMin2, iArr);
                } else {
                    iMax = RemoteActionCompatParcelizer(view, iMax, iMin2, iArr);
                }
            }
            if (IconCompatParcelizer(this.ResultReceiver)) {
                appCompatImageView = this.ResultReceiver;
                if (z3) {
                    iMin = read(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = RemoteActionCompatParcelizer(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zIconCompatParcelizer = IconCompatParcelizer(this.getOnBackPressedInput);
            zIconCompatParcelizer2 = IconCompatParcelizer(this._init_lambda4);
            if (zIconCompatParcelizer) {
                getAutoSizeTextType getautosizetexttype3 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                measuredHeight = this.getOnBackPressedInput.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) getautosizetexttype3).topMargin + ((ViewGroup.MarginLayoutParams) getautosizetexttype3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zIconCompatParcelizer2) {
                getAutoSizeTextType getautosizetexttype4 = (getAutoSizeTextType) this._init_lambda4.getLayoutParams();
                measuredHeight += this._init_lambda4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) getautosizetexttype4).topMargin + ((ViewGroup.MarginLayoutParams) getautosizetexttype4).bottomMargin;
            }
            if (!zIconCompatParcelizer || zIconCompatParcelizer2) {
                if (zIconCompatParcelizer) {
                    appCompatTextView = this.getOnBackPressedInput;
                } else {
                    appCompatTextView = this._init_lambda4;
                }
                if (zIconCompatParcelizer2) {
                    appCompatTextView2 = this._init_lambda4;
                } else {
                    appCompatTextView2 = this.getOnBackPressedInput;
                }
                getautosizetexttype = (getAutoSizeTextType) appCompatTextView.getLayoutParams();
                getautosizetexttype2 = (getAutoSizeTextType) appCompatTextView2.getLayoutParams();
                z2 = (!zIconCompatParcelizer && this.getOnBackPressedInput.getMeasuredWidth() > 0) || (zIconCompatParcelizer2 && this._init_lambda4.getMeasuredWidth() > 0);
                i6 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY & 112;
                i7 = paddingLeft;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin + this.fullyDrawnReporter_delegatelambda0;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin + this.fullyDrawnReporter_delegatelambda0;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).bottomMargin;
                        i17 = this.ensureViewModelStore;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) getautosizetexttype2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) getautosizetexttype2).bottomMargin) - this.ensureViewModelStore) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.createFullyDrawnExecutor;
                    } else {
                        i11 = 0;
                    }
                    int i28 = i11 - iArr[1];
                    iMin -= Math.max(0, i28);
                    iArr[1] = Math.max(0, -i28);
                    if (zIconCompatParcelizer) {
                        getAutoSizeTextType getautosizetexttype5 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                        int measuredWidth2 = iMin - this.getOnBackPressedInput.getMeasuredWidth();
                        int measuredHeight2 = this.getOnBackPressedInput.getMeasuredHeight() + paddingTop;
                        this.getOnBackPressedInput.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.addObserverForBackInvoker;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) getautosizetexttype5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zIconCompatParcelizer2) {
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((getAutoSizeTextType) this._init_lambda4.getLayoutParams())).topMargin;
                        this._init_lambda4.layout(iMin - this._init_lambda4.getMeasuredWidth(), i29, iMin, this._init_lambda4.getMeasuredHeight() + i29);
                        i13 = iMin - this.addObserverForBackInvoker;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                } else {
                    if (z2) {
                        i8 = this.createFullyDrawnExecutor;
                    } else {
                        i8 = 0;
                    }
                    int i30 = i8 - iArr[0];
                    iMax += Math.max(0, i30);
                    iArr[0] = Math.max(0, -i30);
                    if (zIconCompatParcelizer) {
                        getAutoSizeTextType getautosizetexttype6 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                        int measuredWidth3 = this.getOnBackPressedInput.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.getOnBackPressedInput.getMeasuredHeight() + paddingTop;
                        this.getOnBackPressedInput.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.addObserverForBackInvoker;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) getautosizetexttype6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zIconCompatParcelizer2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((getAutoSizeTextType) this._init_lambda4.getLayoutParams())).topMargin;
                        int measuredWidth4 = this._init_lambda4.getMeasuredWidth() + iMax;
                        this._init_lambda4.layout(iMax, i31, measuredWidth4, this._init_lambda4.getMeasuredHeight() + i31);
                        i10 = measuredWidth4 + this.addObserverForBackInvoker;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            } else {
                i7 = paddingLeft;
                iMin2 = iMin2;
            }
            arrayList = this.defaultViewModelProviderFactory_delegatelambda0;
            read(3, arrayList);
            size = arrayList.size();
            iRemoteActionCompatParcelizer2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((View) arrayList.get(i18), iRemoteActionCompatParcelizer2, iMin2, iArr);
            }
            i19 = iMin2;
            read(5, arrayList);
            size2 = arrayList.size();
            for (i20 = 0; i20 < size2; i20++) {
                iMin = read((View) arrayList.get(i20), iMin, i19, iArr);
            }
            read(1, arrayList);
            int i32 = iArr[0];
            int i33 = iArr[1];
            size3 = arrayList.size();
            i21 = i33;
            i22 = i32;
            i23 = 0;
            measuredWidth = 0;
            while (i23 < size3) {
                View view2 = (View) arrayList.get(i23);
                getAutoSizeTextType getautosizetexttype7 = (getAutoSizeTextType) view2.getLayoutParams();
                int i34 = ((ViewGroup.MarginLayoutParams) getautosizetexttype7).leftMargin - i22;
                int i35 = ((ViewGroup.MarginLayoutParams) getautosizetexttype7).rightMargin - i21;
                int iMax3 = Math.max(0, i34);
                int iMax4 = Math.max(0, i35);
                int iMax5 = Math.max(0, -i34);
                int iMax6 = Math.max(0, -i35);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i23++;
                i21 = iMax6;
                i22 = iMax5;
            }
            i25 = ((((width - i7) - paddingRight) / 2) + i7) - (measuredWidth / 2);
            i26 = measuredWidth + i25;
            if (i25 >= iRemoteActionCompatParcelizer2) {
                if (i26 > iMin) {
                    iRemoteActionCompatParcelizer2 = i25 - (i26 - iMin);
                } else {
                    iRemoteActionCompatParcelizer2 = i25;
                }
            }
            size4 = arrayList.size();
            for (i24 = 0; i24 < size4; i24++) {
                iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((View) arrayList.get(i24), iRemoteActionCompatParcelizer2, i19, iArr);
            }
            arrayList.clear();
        }
        iRemoteActionCompatParcelizer = paddingLeft;
        i5 = i27;
        if (IconCompatParcelizer(this.MediaBrowserCompatMediaItem)) {
            windowCallbackWrapper = this.MediaBrowserCompatMediaItem;
            if (z3) {
                i5 = read(windowCallbackWrapper, i5, iMin2, iArr);
            } else {
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(windowCallbackWrapper, iRemoteActionCompatParcelizer, iMin2, iArr);
            }
        }
        if (IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)) {
            setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (z3) {
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setsupportprogressbarindeterminatevisibility, iRemoteActionCompatParcelizer, iMin2, iArr);
            } else {
                i5 = read(setsupportprogressbarindeterminatevisibility, i5, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iRemoteActionCompatParcelizer);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - i5));
        iMax = Math.max(iRemoteActionCompatParcelizer, currentContentInsetLeft2);
        iMin = Math.min(i5, i27 - currentContentInsetRight2);
        if (IconCompatParcelizer(this.PlaybackStateCompat)) {
            view = this.PlaybackStateCompat;
            if (z3) {
                iMin = read(view, iMin, iMin2, iArr);
            } else {
                iMax = RemoteActionCompatParcelizer(view, iMax, iMin2, iArr);
            }
        }
        if (IconCompatParcelizer(this.ResultReceiver)) {
            appCompatImageView = this.ResultReceiver;
            if (z3) {
                iMin = read(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = RemoteActionCompatParcelizer(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zIconCompatParcelizer = IconCompatParcelizer(this.getOnBackPressedInput);
        zIconCompatParcelizer2 = IconCompatParcelizer(this._init_lambda4);
        if (zIconCompatParcelizer) {
            getAutoSizeTextType getautosizetexttype8 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
            measuredHeight = this.getOnBackPressedInput.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) getautosizetexttype8).topMargin + ((ViewGroup.MarginLayoutParams) getautosizetexttype8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zIconCompatParcelizer2) {
            getAutoSizeTextType getautosizetexttype9 = (getAutoSizeTextType) this._init_lambda4.getLayoutParams();
            measuredHeight += this._init_lambda4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) getautosizetexttype9).topMargin + ((ViewGroup.MarginLayoutParams) getautosizetexttype9).bottomMargin;
        }
        if (zIconCompatParcelizer) {
            if (zIconCompatParcelizer) {
                appCompatTextView = this.getOnBackPressedInput;
            } else {
                appCompatTextView = this._init_lambda4;
            }
            if (zIconCompatParcelizer2) {
                appCompatTextView2 = this._init_lambda4;
            } else {
                appCompatTextView2 = this.getOnBackPressedInput;
            }
            getautosizetexttype = (getAutoSizeTextType) appCompatTextView.getLayoutParams();
            getautosizetexttype2 = (getAutoSizeTextType) appCompatTextView2.getLayoutParams();
            if (zIconCompatParcelizer) {
            }
            i6 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY & 112;
            i7 = paddingLeft;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin + this.fullyDrawnReporter_delegatelambda0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin + this.fullyDrawnReporter_delegatelambda0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).bottomMargin;
                    i17 = this.ensureViewModelStore;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) getautosizetexttype2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) getautosizetexttype2).bottomMargin) - this.ensureViewModelStore) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.createFullyDrawnExecutor;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zIconCompatParcelizer) {
                    getAutoSizeTextType getautosizetexttype10 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                    int measuredWidth5 = iMin - this.getOnBackPressedInput.getMeasuredWidth();
                    int measuredHeight4 = this.getOnBackPressedInput.getMeasuredHeight() + paddingTop;
                    this.getOnBackPressedInput.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.addObserverForBackInvoker;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) getautosizetexttype10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zIconCompatParcelizer2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((getAutoSizeTextType) this._init_lambda4.getLayoutParams())).topMargin;
                    this._init_lambda4.layout(iMin - this._init_lambda4.getMeasuredWidth(), i211, iMin, this._init_lambda4.getMeasuredHeight() + i211);
                    i13 = iMin - this.addObserverForBackInvoker;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
            } else {
                if (z2) {
                    i8 = this.createFullyDrawnExecutor;
                } else {
                    i8 = 0;
                }
                int i36 = i8 - iArr[0];
                iMax += Math.max(0, i36);
                iArr[0] = Math.max(0, -i36);
                if (zIconCompatParcelizer) {
                    getAutoSizeTextType getautosizetexttype11 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                    int measuredWidth6 = this.getOnBackPressedInput.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.getOnBackPressedInput.getMeasuredHeight() + paddingTop;
                    this.getOnBackPressedInput.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.addObserverForBackInvoker;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) getautosizetexttype11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zIconCompatParcelizer2) {
                    int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((getAutoSizeTextType) this._init_lambda4.getLayoutParams())).topMargin;
                    int measuredWidth7 = this._init_lambda4.getMeasuredWidth() + iMax;
                    this._init_lambda4.layout(iMax, i37, measuredWidth7, this._init_lambda4.getMeasuredHeight() + i37);
                    i10 = measuredWidth7 + this.addObserverForBackInvoker;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zIconCompatParcelizer) {
                appCompatTextView = this.getOnBackPressedInput;
            } else {
                appCompatTextView = this._init_lambda4;
            }
            if (zIconCompatParcelizer2) {
                appCompatTextView2 = this._init_lambda4;
            } else {
                appCompatTextView2 = this.getOnBackPressedInput;
            }
            getautosizetexttype = (getAutoSizeTextType) appCompatTextView.getLayoutParams();
            getautosizetexttype2 = (getAutoSizeTextType) appCompatTextView2.getLayoutParams();
            if (zIconCompatParcelizer) {
            }
            i6 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY & 112;
            i7 = paddingLeft;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin + this.fullyDrawnReporter_delegatelambda0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin + this.fullyDrawnReporter_delegatelambda0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).bottomMargin;
                    i17 = this.ensureViewModelStore;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) getautosizetexttype2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) getautosizetexttype2).bottomMargin) - this.ensureViewModelStore) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.createFullyDrawnExecutor;
                } else {
                    i11 = 0;
                }
                int i212 = i11 - iArr[1];
                iMin -= Math.max(0, i212);
                iArr[1] = Math.max(0, -i212);
                if (zIconCompatParcelizer) {
                    getAutoSizeTextType getautosizetexttype12 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                    int measuredWidth8 = iMin - this.getOnBackPressedInput.getMeasuredWidth();
                    int measuredHeight6 = this.getOnBackPressedInput.getMeasuredHeight() + paddingTop;
                    this.getOnBackPressedInput.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.addObserverForBackInvoker;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) getautosizetexttype12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zIconCompatParcelizer2) {
                    int i213 = paddingTop + ((ViewGroup.MarginLayoutParams) ((getAutoSizeTextType) this._init_lambda4.getLayoutParams())).topMargin;
                    this._init_lambda4.layout(iMin - this._init_lambda4.getMeasuredWidth(), i213, iMin, this._init_lambda4.getMeasuredHeight() + i213);
                    i13 = iMin - this.addObserverForBackInvoker;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
            } else {
                if (z2) {
                    i8 = this.createFullyDrawnExecutor;
                } else {
                    i8 = 0;
                }
                int i38 = i8 - iArr[0];
                iMax += Math.max(0, i38);
                iArr[0] = Math.max(0, -i38);
                if (zIconCompatParcelizer) {
                    getAutoSizeTextType getautosizetexttype13 = (getAutoSizeTextType) this.getOnBackPressedInput.getLayoutParams();
                    int measuredWidth9 = this.getOnBackPressedInput.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.getOnBackPressedInput.getMeasuredHeight() + paddingTop;
                    this.getOnBackPressedInput.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.addObserverForBackInvoker;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) getautosizetexttype13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zIconCompatParcelizer2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((getAutoSizeTextType) this._init_lambda4.getLayoutParams())).topMargin;
                    int measuredWidth10 = this._init_lambda4.getMeasuredWidth() + iMax;
                    this._init_lambda4.layout(iMax, i39, measuredWidth10, this._init_lambda4.getMeasuredHeight() + i39);
                    i10 = measuredWidth10 + this.addObserverForBackInvoker;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.defaultViewModelProviderFactory_delegatelambda0;
        read(3, arrayList);
        size = arrayList.size();
        iRemoteActionCompatParcelizer2 = iMax;
        while (i18 < size) {
            iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((View) arrayList.get(i18), iRemoteActionCompatParcelizer2, iMin2, iArr);
        }
        i19 = iMin2;
        read(5, arrayList);
        size2 = arrayList.size();
        while (i20 < size2) {
            iMin = read((View) arrayList.get(i20), iMin, i19, iArr);
        }
        read(1, arrayList);
        int i310 = iArr[0];
        int i311 = iArr[1];
        size3 = arrayList.size();
        i21 = i311;
        i22 = i310;
        i23 = 0;
        measuredWidth = 0;
        while (i23 < size3) {
            View view3 = (View) arrayList.get(i23);
            getAutoSizeTextType getautosizetexttype14 = (getAutoSizeTextType) view3.getLayoutParams();
            int i312 = ((ViewGroup.MarginLayoutParams) getautosizetexttype14).leftMargin - i22;
            int i313 = ((ViewGroup.MarginLayoutParams) getautosizetexttype14).rightMargin - i21;
            int iMax7 = Math.max(0, i312);
            int iMax8 = Math.max(0, i313);
            int iMax9 = Math.max(0, -i312);
            int iMax10 = Math.max(0, -i313);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i23++;
            i21 = iMax10;
            i22 = iMax9;
        }
        i25 = ((((width - i7) - paddingRight) / 2) + i7) - (measuredWidth / 2);
        i26 = measuredWidth + i25;
        if (i25 >= iRemoteActionCompatParcelizer2) {
            if (i26 > iMin) {
                iRemoteActionCompatParcelizer2 = i25 - (i26 - iMin);
            } else {
                iRemoteActionCompatParcelizer2 = i25;
            }
        }
        size4 = arrayList.size();
        while (i24 < size4) {
            iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((View) arrayList.get(i24), iRemoteActionCompatParcelizer2, i19, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Keep keep;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        setAllCaps setallcaps = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (setallcaps != null && (keep = setallcaps.IconCompatParcelizer) != null) {
            savedState.write = keep.MediaSessionCompatToken;
        }
        savedState.RemoteActionCompatParcelizer = MediaMetadataCompat();
        return savedState;
    }

    @Override // o.setOnExit
    public final void removeMenuProvider(getUnsetFocusRect getunsetfocusrect) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(getunsetfocusrect);
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            write();
            this.MediaBrowserCompatMediaItem.setImageDrawable(drawable);
        } else {
            WindowCallbackWrapper windowCallbackWrapper = this.MediaBrowserCompatMediaItem;
            if (windowCallbackWrapper != null) {
                windowCallbackWrapper.setImageDrawable(this.MediaSessionCompatQueueItem);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.MediaDescriptionCompat = z;
        requestLayout();
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            RemoteActionCompatParcelizer();
            if (!serializer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
                read((View) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, true);
            }
        } else {
            WindowCallbackWrapper windowCallbackWrapper = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (windowCallbackWrapper != null && serializer(windowCallbackWrapper)) {
                removeView(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            }
        }
        WindowCallbackWrapper windowCallbackWrapper2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (windowCallbackWrapper2 != null) {
            windowCallbackWrapper2.setImageDrawable(drawable);
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this._init_lambda1 = colorStateList;
        AppCompatTextView appCompatTextView = this._init_lambda4;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.ensureViewModelStore = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.addObserverForBackInvoker = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.createFullyDrawnExecutor = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.fullyDrawnReporter_delegatelambda0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.getSavedStateRegistryControllerannotations = colorStateList;
        AppCompatTextView appCompatTextView = this.getOnBackPressedInput;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.toolbarStyle);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 8388627;
        this.defaultViewModelProviderFactory_delegatelambda0 = new ArrayList();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayList();
        this.addObserverForBackInvokerlambda0 = new int[2];
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new FocusPropertiesCompanion(new getAutoSizeMaxTextSize(this, 1));
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new ArrayList();
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new setSupportCompoundDrawablesTintMode(this);
        this._init_lambda2 = new zza(5, this);
        Context context2 = getContext();
        int[] iArr = onUserLeaveHint.Toolbar;
        EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = EmojiProcessor.RemoteActionCompatParcelizer(context2, attributeSet, iArr, com.logistics.rider.glovo.R.attr.toolbarStyle);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, com.logistics.rider.glovo.R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        this.menuHostHelperlambda0 = typedArray.getResourceId(28, 0);
        this.accessensureViewModelStore = typedArray.getResourceId(19, 0);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArray.getInteger(0, 8388627);
        this.read = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.ensureViewModelStore = dimensionPixelOffset;
        this.fullyDrawnReporter_delegatelambda0 = dimensionPixelOffset;
        this.addObserverForBackInvoker = dimensionPixelOffset;
        this.createFullyDrawnExecutor = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.createFullyDrawnExecutor = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.addObserverForBackInvoker = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.fullyDrawnReporter_delegatelambda0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.ensureViewModelStore = dimensionPixelOffset5;
        }
        this.ComponentActivity = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        serializer();
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.PlaybackStateCompatCustomAction;
        setcustomselectionactionmodecallback.IconCompatParcelizer = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            setcustomselectionactionmodecallback.read = dimensionPixelSize;
            setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            setcustomselectionactionmodecallback.RemoteActionCompatParcelizer = dimensionPixelSize2;
            setcustomselectionactionmodecallback.MediaSessionCompatQueueItem = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            setcustomselectionactionmodecallback.write(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.ParcelableVolumeInfo = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.RatingCompat = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.MediaSessionCompatQueueItem = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(4);
        this.MediaMetadataCompat = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableRemoteActionCompatParcelizer = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(16);
        if (drawableRemoteActionCompatParcelizer != null) {
            setNavigationIcon(drawableRemoteActionCompatParcelizer);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableRemoteActionCompatParcelizer2 = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(11);
        if (drawableRemoteActionCompatParcelizer2 != null) {
            setLogo(drawableRemoteActionCompatParcelizer2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(emojiProcessorRemoteActionCompatParcelizer.serializer(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(emojiProcessorRemoteActionCompatParcelizer.serializer(20));
        }
        if (typedArray.hasValue(14)) {
            serializer(typedArray.getResourceId(14, 0));
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public static getAutoSizeTextType read() {
        getAutoSizeTextType getautosizetexttype = new getAutoSizeTextType(-2, -2);
        getautosizetexttype.RemoteActionCompatParcelizer = 0;
        getautosizetexttype.write = 8388627;
        return getautosizetexttype;
    }

    public final void IconCompatParcelizer() {
        ensureMenuView();
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (setsupportprogressbarindeterminatevisibility.serializer == null) {
            AlertControllerButtonHandler alertControllerButtonHandler = (AlertControllerButtonHandler) setsupportprogressbarindeterminatevisibility.getMenu();
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new setAllCaps(this);
            }
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setExpandedActionViewsExclusive(true);
            alertControllerButtonHandler.RemoteActionCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            MediaBrowserCompatMediaItem();
        }
    }

    public Menu getMenu() {
        IconCompatParcelizer();
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getMenu();
    }

    public Drawable getOverflowIcon() {
        IconCompatParcelizer();
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaBrowserCompatMediaItem();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this._init_lambda2);
        MediaBrowserCompatMediaItem();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        serializer();
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.PlaybackStateCompatCustomAction;
        boolean z = i == 1;
        if (z == setcustomselectionactionmodecallback.serializer) {
            return;
        }
        setcustomselectionactionmodecallback.serializer = z;
        if (!setcustomselectionactionmodecallback.IconCompatParcelizer) {
            setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem = setcustomselectionactionmodecallback.read;
            setcustomselectionactionmodecallback.MediaSessionCompatQueueItem = setcustomselectionactionmodecallback.RemoteActionCompatParcelizer;
            return;
        }
        if (z) {
            int i2 = setcustomselectionactionmodecallback.write;
            if (i2 == Integer.MIN_VALUE) {
                i2 = setcustomselectionactionmodecallback.read;
            }
            setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem = i2;
            int i3 = setcustomselectionactionmodecallback.RatingCompat;
            if (i3 == Integer.MIN_VALUE) {
                i3 = setcustomselectionactionmodecallback.RemoteActionCompatParcelizer;
            }
            setcustomselectionactionmodecallback.MediaSessionCompatQueueItem = i3;
            return;
        }
        int i4 = setcustomselectionactionmodecallback.RatingCompat;
        if (i4 == Integer.MIN_VALUE) {
            i4 = setcustomselectionactionmodecallback.read;
        }
        setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem = i4;
        int i5 = setcustomselectionactionmodecallback.write;
        if (i5 == Integer.MIN_VALUE) {
            i5 = setcustomselectionactionmodecallback.RemoteActionCompatParcelizer;
        }
        setcustomselectionactionmodecallback.MediaSessionCompatQueueItem = i5;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        RemoteActionCompatParcelizer();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        IconCompatParcelizer();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setOverflowIcon(drawable);
    }

    public static int read(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int write(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight + paddingLeft + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingBottom + paddingTop + i6 + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean MediaMetadataCompat() {
        onSupportActionModeStarted onsupportactionmodestarted;
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        return (setsupportprogressbarindeterminatevisibility == null || (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) == null || !onsupportactionmodestarted.write()) ? false : true;
    }

    public final boolean RatingCompat() {
        onSupportActionModeStarted onsupportactionmodestarted;
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        return (setsupportprogressbarindeterminatevisibility == null || (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) == null || !onsupportactionmodestarted.serializer()) ? false : true;
    }

    public final int RemoteActionCompatParcelizer(View view, int i, int i2, int[] iArr) {
        getAutoSizeTextType getautosizetexttype = (getAutoSizeTextType) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iWrite = write(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iWrite, iMax + measuredWidth, view.getMeasuredHeight() + iWrite);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) getautosizetexttype).rightMargin + iMax;
    }

    public CharSequence getCollapseContentDescription() {
        WindowCallbackWrapper windowCallbackWrapper = this.MediaBrowserCompatMediaItem;
        if (windowCallbackWrapper != null) {
            return windowCallbackWrapper.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        WindowCallbackWrapper windowCallbackWrapper = this.MediaBrowserCompatMediaItem;
        if (windowCallbackWrapper != null) {
            return windowCallbackWrapper.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.PlaybackStateCompatCustomAction;
        if (setcustomselectionactionmodecallback != null) {
            return setcustomselectionactionmodecallback.serializer ? setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem : setcustomselectionactionmodecallback.MediaSessionCompatQueueItem;
        }
        return 0;
    }

    public int getContentInsetLeft() {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.PlaybackStateCompatCustomAction;
        if (setcustomselectionactionmodecallback != null) {
            return setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem;
        }
        return 0;
    }

    public int getContentInsetRight() {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.PlaybackStateCompatCustomAction;
        if (setcustomselectionactionmodecallback != null) {
            return setcustomselectionactionmodecallback.MediaSessionCompatQueueItem;
        }
        return 0;
    }

    public int getContentInsetStart() {
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.PlaybackStateCompatCustomAction;
        if (setcustomselectionactionmodecallback != null) {
            return setcustomselectionactionmodecallback.serializer ? setcustomselectionactionmodecallback.MediaSessionCompatQueueItem : setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem;
        }
        return 0;
    }

    public int getCurrentContentInsetEnd() {
        AlertControllerButtonHandler alertControllerButtonHandler;
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        return (setsupportprogressbarindeterminatevisibility == null || (alertControllerButtonHandler = setsupportprogressbarindeterminatevisibility.serializer) == null || !alertControllerButtonHandler.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.RatingCompat, 0));
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.ResultReceiver;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.ResultReceiver;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        WindowCallbackWrapper windowCallbackWrapper = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (windowCallbackWrapper != null) {
            return windowCallbackWrapper.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        WindowCallbackWrapper windowCallbackWrapper = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (windowCallbackWrapper != null) {
            return windowCallbackWrapper.getDrawable();
        }
        return null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.IconCompatParcelizer);
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        AlertControllerButtonHandler alertControllerButtonHandler = setsupportprogressbarindeterminatevisibility != null ? setsupportprogressbarindeterminatevisibility.serializer : null;
        int i = savedState.write;
        if (i != 0 && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null && alertControllerButtonHandler != null && (menuItemFindItem = alertControllerButtonHandler.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.RemoteActionCompatParcelizer) {
            zza zzaVar = this._init_lambda2;
            removeCallbacks(zzaVar);
            post(zzaVar);
        }
    }

    public final int read(View view, int i, int i2, int[] iArr) {
        getAutoSizeTextType getautosizetexttype = (getAutoSizeTextType) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iWrite = write(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iWrite, iMax, view.getMeasuredHeight() + iWrite);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) getautosizetexttype).leftMargin);
    }

    public final int serializer(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        int paddingLeft = getPaddingLeft();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + paddingLeft + iMax + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i3, paddingBottom + paddingTop + i7 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void serializer(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            MediaBrowserCompatMediaItem();
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.RatingCompat) {
            this.RatingCompat = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.ParcelableVolumeInfo) {
            this.ParcelableVolumeInfo = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setPopupTheme(int i) {
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != i) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i;
            if (i == 0) {
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getContext();
            } else {
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this._init_lambda4;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this._init_lambda4 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this._init_lambda4.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.accessensureViewModelStore;
                if (i != 0) {
                    this._init_lambda4.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this._init_lambda1;
                if (colorStateList != null) {
                    this._init_lambda4.setTextColor(colorStateList);
                }
            }
            if (!serializer(this._init_lambda4)) {
                read((View) this._init_lambda4, true);
            }
        } else if (appCompatTextView != null && serializer(appCompatTextView)) {
            removeView(this._init_lambda4);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(this._init_lambda4);
        }
        AppCompatTextView appCompatTextView3 = this._init_lambda4;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this._init_lambda3 = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.getOnBackPressedInput;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.getOnBackPressedInput = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.getOnBackPressedInput.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.menuHostHelperlambda0;
                if (i != 0) {
                    this.getOnBackPressedInput.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.getSavedStateRegistryControllerannotations;
                if (colorStateList != null) {
                    this.getOnBackPressedInput.setTextColor(colorStateList);
                }
            }
            if (!serializer(this.getOnBackPressedInput)) {
                read((View) this.getOnBackPressedInput, true);
            }
        } else if (appCompatTextView != null && serializer(appCompatTextView)) {
            removeView(this.getOnBackPressedInput);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(this.getOnBackPressedInput);
        }
        AppCompatTextView appCompatTextView3 = this.getOnBackPressedInput;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.fullyDrawnReporter_delegatelambda00 = charSequence;
    }

    public final int write(int i, View view) {
        getAutoSizeTextType getautosizetexttype = (getAutoSizeTextType) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = getautosizetexttype.write & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) getautosizetexttype).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) getautosizetexttype).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void MediaBrowserCompatMediaItem() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherW_ = setTextAppearance.W_(this);
            setAllCaps setallcaps = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            int i = 0;
            boolean z = (setallcaps == null || setallcaps.IconCompatParcelizer == null || onBackInvokedDispatcherW_ == null || !isAttachedToWindow() || !this.IconCompatParcelizer) ? false : true;
            if (z && this.RemoteActionCompatParcelizer == null) {
                if (this.serializer == null) {
                    this.serializer = setTextAppearance.X_(new getAutoSizeMaxTextSize(this, i));
                }
                setTextAppearance.RemoteActionCompatParcelizer(onBackInvokedDispatcherW_, this.serializer);
                this.RemoteActionCompatParcelizer = onBackInvokedDispatcherW_;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.RemoteActionCompatParcelizer) == null) {
                return;
            }
            setTextAppearance.IconCompatParcelizer(onBackInvokedDispatcher, this.serializer);
            this.RemoteActionCompatParcelizer = null;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new WindowCallbackWrapper(getContext(), null, com.logistics.rider.glovo.R.attr.toolbarNavigationButtonStyle);
            getAutoSizeTextType getautosizetexttype = read();
            getautosizetexttype.write = (this.read & 112) | 8388611;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setLayoutParams(getautosizetexttype);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof getAutoSizeTextType);
    }

    public final void ensureMenuView() {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = new setSupportProgressBarIndeterminateVisibility(getContext(), null);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = setsupportprogressbarindeterminatevisibility;
            setsupportprogressbarindeterminatevisibility.setPopupTheme(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setOnMenuItemClickListener(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
            setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            setDropDownVerticalOffset setdropdownverticaloffset = this.write;
            setSupportCompoundDrawablesTintMode setsupportcompounddrawablestintmode = new setSupportCompoundDrawablesTintMode(this);
            setsupportprogressbarindeterminatevisibility2.IconCompatParcelizer = setdropdownverticaloffset;
            setsupportprogressbarindeterminatevisibility2.MediaSessionCompatQueueItem = setsupportcompounddrawablestintmode;
            getAutoSizeTextType getautosizetexttype = read();
            getautosizetexttype.write = (this.read & 112) | 8388613;
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setLayoutParams(getautosizetexttype);
            read((View) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, false);
        }
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.ParcelableVolumeInfo, 0)) : getContentInsetStart();
    }

    public final void read(View view, boolean z) {
        getAutoSizeTextType getautosizetexttypeSerializer;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            getautosizetexttypeSerializer = read();
        } else {
            getautosizetexttypeSerializer = !checkLayoutParams(layoutParams) ? serializer(layoutParams) : (getAutoSizeTextType) layoutParams;
        }
        getautosizetexttypeSerializer.RemoteActionCompatParcelizer = 1;
        if (!z || this.PlaybackStateCompat == null) {
            addView(view, getautosizetexttypeSerializer);
        } else {
            view.setLayoutParams(getautosizetexttypeSerializer);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(view);
        }
    }

    public final void serializer() {
        if (this.PlaybackStateCompatCustomAction == null) {
            setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = new setCustomSelectionActionModeCallback();
            setcustomselectionactionmodecallback.MediaBrowserCompatMediaItem = 0;
            setcustomselectionactionmodecallback.MediaSessionCompatQueueItem = 0;
            setcustomselectionactionmodecallback.RatingCompat = Integer.MIN_VALUE;
            setcustomselectionactionmodecallback.write = Integer.MIN_VALUE;
            setcustomselectionactionmodecallback.read = 0;
            setcustomselectionactionmodecallback.RemoteActionCompatParcelizer = 0;
            setcustomselectionactionmodecallback.serializer = false;
            setcustomselectionactionmodecallback.IconCompatParcelizer = false;
            this.PlaybackStateCompatCustomAction = setcustomselectionactionmodecallback;
        }
    }

    public final boolean serializer(View view) {
        return view.getParent() == this || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(view);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            write();
        }
        WindowCallbackWrapper windowCallbackWrapper = this.MediaBrowserCompatMediaItem;
        if (windowCallbackWrapper != null) {
            windowCallbackWrapper.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.ResultReceiver == null) {
            this.ResultReceiver = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.ResultReceiver;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            RemoteActionCompatParcelizer();
        }
        WindowCallbackWrapper windowCallbackWrapper = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (windowCallbackWrapper != null) {
            windowCallbackWrapper.setContentDescription(charSequence);
            setAutoSizeTextTypeWithDefaults.serializer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, charSequence);
        }
    }

    public final void write() {
        if (this.MediaBrowserCompatMediaItem == null) {
            WindowCallbackWrapper windowCallbackWrapper = new WindowCallbackWrapper(getContext(), null, com.logistics.rider.glovo.R.attr.toolbarNavigationButtonStyle);
            this.MediaBrowserCompatMediaItem = windowCallbackWrapper;
            windowCallbackWrapper.setImageDrawable(this.MediaSessionCompatQueueItem);
            this.MediaBrowserCompatMediaItem.setContentDescription(this.MediaMetadataCompat);
            getAutoSizeTextType getautosizetexttype = read();
            getautosizetexttype.write = (this.read & 112) | 8388611;
            getautosizetexttype.RemoteActionCompatParcelizer = 2;
            this.MediaBrowserCompatMediaItem.setLayoutParams(getautosizetexttype);
            this.MediaBrowserCompatMediaItem.setOnClickListener(new AnonymousClass4(0, this));
        }
    }

    public static getAutoSizeTextType serializer(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof getAutoSizeTextType;
        if (z) {
            getAutoSizeTextType getautosizetexttype = (getAutoSizeTextType) layoutParams;
            getAutoSizeTextType getautosizetexttype2 = new getAutoSizeTextType(getautosizetexttype);
            getautosizetexttype2.RemoteActionCompatParcelizer = 0;
            getautosizetexttype2.RemoteActionCompatParcelizer = getautosizetexttype.RemoteActionCompatParcelizer;
            return getautosizetexttype2;
        }
        if (z) {
            getAutoSizeTextType getautosizetexttype3 = new getAutoSizeTextType((getAutoSizeTextType) layoutParams);
            getautosizetexttype3.RemoteActionCompatParcelizer = 0;
            return getautosizetexttype3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            getAutoSizeTextType getautosizetexttype4 = new getAutoSizeTextType(layoutParams);
            getautosizetexttype4.RemoteActionCompatParcelizer = 0;
            return getautosizetexttype4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        getAutoSizeTextType getautosizetexttype5 = new getAutoSizeTextType(marginLayoutParams);
        getautosizetexttype5.RemoteActionCompatParcelizer = 0;
        ((ViewGroup.MarginLayoutParams) getautosizetexttype5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) getautosizetexttype5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) getautosizetexttype5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) getautosizetexttype5).bottomMargin = marginLayoutParams.bottomMargin;
        return getautosizetexttype5;
    }

    public int getContentInsetEndWithActions() {
        int i = this.RatingCompat;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.ParcelableVolumeInfo;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public setActionBarHideOffset getWrapper() {
        if (this.addContentView == null) {
            this.addContentView = new setFilters(this, true);
        }
        return this.addContentView;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.MediaSessionCompatToken = false;
        }
        if (!this.MediaSessionCompatToken) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.MediaSessionCompatToken = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.MediaSessionCompatToken = false;
        return true;
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.ResultReceiver;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.ResultReceiver = new AppCompatImageView(getContext(), null);
            }
            if (!serializer(this.ResultReceiver)) {
                read((View) this.ResultReceiver, true);
            }
        } else if (appCompatImageView != null && serializer(appCompatImageView)) {
            removeView(this.ResultReceiver);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(this.ResultReceiver);
        }
        AppCompatImageView appCompatImageView2 = this.ResultReceiver;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.MediaSessionCompatResultReceiverWrapper = false;
        }
        if (!this.MediaSessionCompatResultReceiverWrapper) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.MediaSessionCompatResultReceiverWrapper = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.MediaSessionCompatResultReceiverWrapper = false;
        return true;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void read(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                getAutoSizeTextType getautosizetexttype = (getAutoSizeTextType) childAt.getLayoutParams();
                if (getautosizetexttype.RemoteActionCompatParcelizer == 0 && IconCompatParcelizer(childAt)) {
                    int i3 = getautosizetexttype.write;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            getAutoSizeTextType getautosizetexttype2 = (getAutoSizeTextType) childAt2.getLayoutParams();
            if (getautosizetexttype2.RemoteActionCompatParcelizer == 0 && IconCompatParcelizer(childAt2)) {
                int i5 = getautosizetexttype2.write;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iWrite;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
            IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, i, 0, i2, this.ComponentActivity);
            measuredWidth = read(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) + this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getMeasuredWidth();
            iMax = Math.max(0, write(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) + this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (IconCompatParcelizer(this.MediaBrowserCompatMediaItem)) {
            IconCompatParcelizer(this.MediaBrowserCompatMediaItem, i, 0, i2, this.ComponentActivity);
            measuredWidth = read(this.MediaBrowserCompatMediaItem) + this.MediaBrowserCompatMediaItem.getMeasuredWidth();
            iMax = Math.max(iMax, write(this.MediaBrowserCompatMediaItem) + this.MediaBrowserCompatMediaItem.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.MediaBrowserCompatMediaItem.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        int iMax4 = Math.max(0, currentContentInsetStart - measuredWidth);
        int[] iArr = this.addObserverForBackInvokerlambda0;
        iArr[c2] = iMax4;
        if (IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)) {
            IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, i, iMax3, i2, this.ComponentActivity);
            measuredWidth2 = read(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getMeasuredWidth();
            iMax = Math.max(iMax, write(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (IconCompatParcelizer(this.PlaybackStateCompat)) {
            iMax5 += serializer(this.PlaybackStateCompat, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, write(this.PlaybackStateCompat) + this.PlaybackStateCompat.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.PlaybackStateCompat.getMeasuredState());
        }
        if (IconCompatParcelizer(this.ResultReceiver)) {
            iMax5 += serializer(this.ResultReceiver, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, write(this.ResultReceiver) + this.ResultReceiver.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.ResultReceiver.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((getAutoSizeTextType) childAt.getLayoutParams()).RemoteActionCompatParcelizer == 0 && IconCompatParcelizer(childAt)) {
                iMax5 += serializer(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, write(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.fullyDrawnReporter_delegatelambda0 + this.ensureViewModelStore;
        int i6 = this.createFullyDrawnExecutor + this.addObserverForBackInvoker;
        if (IconCompatParcelizer(this.getOnBackPressedInput)) {
            serializer(this.getOnBackPressedInput, i, iMax5 + i6, i2, i5, iArr);
            int measuredWidth3 = this.getOnBackPressedInput.getMeasuredWidth();
            int i7 = read(this.getOnBackPressedInput);
            iWrite = write(this.getOnBackPressedInput) + this.getOnBackPressedInput.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.getOnBackPressedInput.getMeasuredState());
            iMax2 = i7 + measuredWidth3;
        } else {
            iWrite = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (IconCompatParcelizer(this._init_lambda4)) {
            iMax2 = Math.max(iMax2, serializer(this._init_lambda4, i, iMax5 + i6, i2, i5 + iWrite, iArr));
            iWrite += write(this._init_lambda4) + this._init_lambda4.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this._init_lambda4.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iWrite);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + paddingLeft + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom + paddingTop + iMax6, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.MediaDescriptionCompat) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (IconCompatParcelizer(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return read();
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        String string;
        String strIntern;
        int i2 = 2 % 2;
        if (i != 0) {
            int i3 = onBackPressedDispatcher_delegatelambda0 + 43;
            onBackPressedDispatcher_delegatelambda00 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                getContext().getString(i).startsWith("%('");
                throw null;
            }
            Context context = getContext();
            string = context.getString(i);
            if (string.startsWith("%('")) {
                String strSubstring = string.substring(3);
                Object[] objArr = new Object[1];
                a(strSubstring, objArr);
                strIntern = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    charSequence = string;
                    charSequence = strIntern;
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                }
            }
        } else {
            int i4 = onBackPressedDispatcher_delegatelambda00 + 17;
            onBackPressedDispatcher_delegatelambda0 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            charSequence = null;
        }
        charSequence = string;
        charSequence = strIntern;
        charSequence = string;
        setCollapseContentDescription(charSequence);
        int i6 = onBackPressedDispatcher_delegatelambda00 + 83;
        onBackPressedDispatcher_delegatelambda0 = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(IntPair.write(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        String string;
        String strIntern;
        int i2 = 2 % 2;
        int i3 = onBackPressedDispatcher_delegatelambda0 + 31;
        int i4 = i3 % Fields.SpotShadowColor;
        onBackPressedDispatcher_delegatelambda00 = i4;
        int i5 = i3 % 2;
        if (i != 0) {
            int i6 = i4 + 63;
            onBackPressedDispatcher_delegatelambda0 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Context context = getContext();
            string = context.getString(i);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                strIntern = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    charSequence = string;
                    charSequence = strIntern;
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                }
            }
        } else {
            charSequence = null;
        }
        charSequence = string;
        charSequence = strIntern;
        charSequence = string;
        setNavigationContentDescription(charSequence);
        int i8 = onBackPressedDispatcher_delegatelambda0 + 93;
        onBackPressedDispatcher_delegatelambda00 = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ onBackPressedDispatcher_delegatelambda010);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public void setLogoDescription(int i) {
        String strIntern;
        int i2 = 2 % 2;
        Context context = getContext();
        String string = context.getString(i);
        boolean zStartsWith = string.startsWith("%('");
        CharSequence charSequence = string;
        if (zStartsWith) {
            int i3 = onBackPressedDispatcher_delegatelambda0 + 25;
            onBackPressedDispatcher_delegatelambda00 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
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
        setLogoDescription(charSequence);
        int i5 = onBackPressedDispatcher_delegatelambda0 + 27;
        onBackPressedDispatcher_delegatelambda00 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(IntPair.write(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(IntPair.write(getContext(), i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        getAutoSizeTextType getautosizetexttype = new getAutoSizeTextType(context, attributeSet);
        getautosizetexttype.write = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.ActionBarLayout);
        getautosizetexttype.write = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        getautosizetexttype.RemoteActionCompatParcelizer = 0;
        return getautosizetexttype;
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return serializer(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1 r5
  0x0033: PHI (r1v5 android.content.Context) = (r1v4 android.content.Context), (r1v8 android.content.Context) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r5v2 java.lang.String) = (r5v6 java.lang.String), (r5v7 java.lang.String) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSubtitle(int i) {
        Context context;
        String string;
        CharSequence charSequence;
        String str;
        String strIntern;
        CharSequence text;
        String string2;
        int i2 = 2 % 2;
        int i3 = onBackPressedDispatcher_delegatelambda00 + 43;
        onBackPressedDispatcher_delegatelambda0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            context = getContext();
            string2 = context.getString(i);
            int i4 = 29 / 0;
            if (string2.startsWith("%('")) {
                str = string;
                charSequence = string;
                str = string2;
                charSequence = string2;
                Object[] objArr = new Object[1];
                a(str.substring(3), objArr);
                strIntern = ((String) objArr[0]).intern();
                text = context.getText(i);
                charSequence = strIntern;
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                    int i5 = onBackPressedDispatcher_delegatelambda0 + 95;
                    onBackPressedDispatcher_delegatelambda00 = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    charSequence = spannableString;
                }
            }
        } else {
            context = getContext();
            string = context.getString(i);
            if (!(!string.startsWith("%('"))) {
                str = string;
                charSequence = string;
                str = string2;
                charSequence = string2;
                Object[] objArr2 = new Object[1];
                a(str.substring(3), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                text = context.getText(i);
                charSequence = strIntern;
                if (text instanceof Spanned) {
                    SpannableString spannableString2 = new SpannableString(strIntern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString2, 0);
                    int i7 = onBackPressedDispatcher_delegatelambda0 + 95;
                    onBackPressedDispatcher_delegatelambda00 = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    charSequence = spannableString2;
                }
            }
        }
        str = string;
        charSequence = string;
        str = string2;
        charSequence = string2;
        setSubtitle(charSequence);
    }

    public void setTitle(int i) {
        String strIntern;
        int i2 = 2 % 2;
        Context context = getContext();
        String string = context.getString(i);
        boolean zStartsWith = string.startsWith("%('");
        CharSequence charSequence = string;
        if (zStartsWith) {
            int i3 = onBackPressedDispatcher_delegatelambda0 + 9;
            onBackPressedDispatcher_delegatelambda00 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                String strSubstring = string.substring(3);
                Object[] objArr = new Object[1];
                a(strSubstring, objArr);
                ((String) objArr[0]).intern();
                boolean z = context.getText(i) instanceof Spanned;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                charSequence = strIntern;
                SpannableString spannableString = new SpannableString(strIntern);
                TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                int i4 = onBackPressedDispatcher_delegatelambda0 + 101;
                onBackPressedDispatcher_delegatelambda00 = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                charSequence = spannableString;
            }
        }
        charSequence = strIntern;
        setTitle(charSequence);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
