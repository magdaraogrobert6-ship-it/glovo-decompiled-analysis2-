package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.colorResource;
import o.findFirstLineRoot;
import o.findLineRoot;
import o.findLineRootdefault;
import o.findQuadraticRoots;
import o.getStartX;
import o.getStartY;
import o.isQuadraticMonotonic;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes4.dex */
public class Preference implements Comparable<Preference> {
    public final boolean ComponentActivity;
    public final boolean PlaybackStateCompat;
    public final Context ResultReceiver;
    public Intent _init_lambda1;
    public PreferenceGroupAdapter _init_lambda2;
    public int _init_lambda3;
    public long _init_lambda4;
    public final String accessensureViewModelStore;
    public CharSequence addContentView;
    public OnPreferenceCopyListener addObserverForBackInvoker;
    public colorResource addObserverForBackInvokerlambda0;
    public boolean createFullyDrawnExecutor;
    public PreferenceGroup defaultViewModelProviderFactory_delegatelambda0;
    public int ensureViewModelStore;
    public getStartY fullyDrawnReporter_delegatelambda0;
    public final boolean fullyDrawnReporter_delegatelambda00;
    public final boolean getOnBackPressedInput;
    public final boolean getSavedStateRegistryControllerannotations;
    public final boolean menuHostHelperlambda0;
    public final int onBackPressedDispatcher_delegatelambda0;
    public final boolean onBackPressedDispatcher_delegatelambda00;
    public findLineRoot onBackPressedDispatcher_delegatelambda010;
    public CharSequence onBackPressedInput_delegatelambda0;
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final findFirstLineRoot r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final String r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public ArrayList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final Object r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final String r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public Drawable r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new findQuadraticRoots();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public final class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        public final Preference write;

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.write;
            CharSequence charSequenceMediaSessionCompatQueueItem = preference.MediaSessionCompatQueueItem();
            if (!preference.ComponentActivity || TextUtils.isEmpty(charSequenceMediaSessionCompatQueueItem)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceMediaSessionCompatQueueItem);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.write;
            Context context = preference.ResultReceiver;
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            CharSequence charSequenceMediaSessionCompatQueueItem = preference.MediaSessionCompatQueueItem();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMediaSessionCompatQueueItem));
            Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceMediaSessionCompatQueueItem), 0).show();
            return true;
        }

        public OnPreferenceCopyListener(Preference preference) {
            this.write = preference;
        }
    }

    public Parcelable IconCompatParcelizer() {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public long RemoteActionCompatParcelizer() {
        return this._init_lambda4;
    }

    public void read(Parcelable parcelable) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong state class -- expecting Preference State");
    }

    public boolean read() {
        return !MediaMetadataCompat();
    }

    public void serializer() {
    }

    public Object write(TypedArray typedArray, int i) {
        return null;
    }

    public void IconCompatParcelizer(Bundle bundle) {
        String str = this.accessensureViewModelStore;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        Parcelable parcelableIconCompatParcelizer = IconCompatParcelizer();
        if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Derived class did not call super.onSaveInstanceState()");
        } else if (parcelableIconCompatParcelizer != null) {
            bundle.putParcelable(str, parcelableIconCompatParcelizer);
        }
    }

    public void MediaDescriptionCompat() {
        PreferenceScreen preferenceScreen;
        String str = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getStartY getstarty = this.fullyDrawnReporter_delegatelambda0;
        Preference preference = (getstarty == null || (preferenceScreen = getstarty.MediaSessionCompatQueueItem) == null) ? null : preferenceScreen.read(str);
        if (preference == null) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Dependency \"", str, "\" not found for preference \"");
            sbM.append(this.accessensureViewModelStore);
            sbM.append("\" (title: \"");
            seekAnimationsanimation_core.IconCompatParcelizer(sbM, this.onBackPressedInput_delegatelambda0, "\"");
            return;
        }
        if (preference.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            preference.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ArrayList();
        }
        preference.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.add(this);
        boolean z = preference.read();
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == z) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = !z;
            write(read());
            write();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.ensureViewModelStore;
        int i2 = preference2.ensureViewModelStore;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.onBackPressedInput_delegatelambda0;
        CharSequence charSequence2 = preference2.onBackPressedInput_delegatelambda0;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.onBackPressedInput_delegatelambda0.toString());
    }

    public void read(Bundle bundle) {
        Parcelable parcelable;
        String str = this.accessensureViewModelStore;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        read(parcelable);
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Derived class did not call super.onRestoreInstanceState()");
    }

    public void serializer(getStartX getstartx) {
        Integer numValueOf;
        View view = getstartx.MediaSessionCompatQueueItem;
        view.setOnClickListener(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        view.setId(0);
        TextView textView = (TextView) getstartx.IconCompatParcelizer(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
            if (TextUtils.isEmpty(charSequenceMediaSessionCompatQueueItem)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceMediaSessionCompatQueueItem);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) getstartx.IconCompatParcelizer(android.R.id.title);
        boolean z = this.getSavedStateRegistryControllerannotations;
        if (textView2 != null) {
            CharSequence charSequence = this.onBackPressedInput_delegatelambda0;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
                    textView2.setSingleLine(this.getOnBackPressedInput);
                }
                if (!z && MediaMetadataCompat() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) getstartx.IconCompatParcelizer(android.R.id.icon);
        boolean z2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (imageView != null) {
            int i = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (i != 0 || this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
                if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
                    this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = IntPair.write(this.ResultReceiver, i);
                }
                Drawable drawable = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewIconCompatParcelizer = getstartx.IconCompatParcelizer(R.id.icon_frame);
        if (viewIconCompatParcelizer == null) {
            viewIconCompatParcelizer = getstartx.IconCompatParcelizer(android.R.id.icon_frame);
        }
        if (viewIconCompatParcelizer != null) {
            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
                viewIconCompatParcelizer.setVisibility(0);
            } else {
                viewIconCompatParcelizer.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.menuHostHelperlambda0) {
            write(view, MediaMetadataCompat());
        } else {
            write(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        getstartx.write = this.PlaybackStateCompat;
        getstartx.RemoteActionCompatParcelizer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        boolean z3 = this.ComponentActivity;
        if (z3 && this.addObserverForBackInvoker == null) {
            this.addObserverForBackInvoker = new OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.addObserverForBackInvoker : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view.setBackground(null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.onBackPressedInput_delegatelambda0;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        if (!TextUtils.isEmpty(charSequenceMediaSessionCompatQueueItem)) {
            sb.append(charSequenceMediaSessionCompatQueueItem);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void write(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                write(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.fullyDrawnReporter_delegatelambda0 == null || !this.fullyDrawnReporter_delegatelambda00 || TextUtils.isEmpty(this.accessensureViewModelStore)) ? false : true;
    }

    public boolean MediaMetadataCompat() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 && this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && this.createFullyDrawnExecutor;
    }

    public CharSequence MediaSessionCompatQueueItem() {
        findLineRoot findlineroot = this.onBackPressedDispatcher_delegatelambda010;
        return findlineroot != null ? findlineroot.RemoteActionCompatParcelizer(this) : this.addContentView;
    }

    public void RatingCompat() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (str != null) {
            getStartY getstarty = this.fullyDrawnReporter_delegatelambda0;
            Preference preference = (getstarty == null || (preferenceScreen = getstarty.MediaSessionCompatQueueItem) == null) ? null : preferenceScreen.read(str);
            if (preference == null || (arrayList = preference.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public void write() {
        int iIndexOf;
        PreferenceGroupAdapter preferenceGroupAdapter = this._init_lambda2;
        if (preferenceGroupAdapter == null || (iIndexOf = preferenceGroupAdapter.MediaDescriptionCompat.indexOf(this)) == -1) {
            return;
        }
        preferenceGroupAdapter.notifyItemChanged(iIndexOf, this);
    }

    public void write(boolean z) {
        ArrayList arrayList = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == z) {
                preference.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = !z;
                preference.write(preference.read());
                preference.write();
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.ensureViewModelStore = Integer.MAX_VALUE;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        this.getSavedStateRegistryControllerannotations = true;
        this.fullyDrawnReporter_delegatelambda00 = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        this.createFullyDrawnExecutor = true;
        this.onBackPressedDispatcher_delegatelambda00 = true;
        this.PlaybackStateCompat = true;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
        this.getOnBackPressedInput = true;
        this.menuHostHelperlambda0 = true;
        this._init_lambda3 = R.layout.preference;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new findFirstLineRoot(this);
        this.ResultReceiver = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.Preference, i, 0);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.accessensureViewModelStore = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.onBackPressedInput_delegatelambda0 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.addContentView = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.ensureViewModelStore = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this._init_lambda3 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.onBackPressedDispatcher_delegatelambda0 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.getSavedStateRegistryControllerannotations = z;
        this.fullyDrawnReporter_delegatelambda00 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.PlaybackStateCompat = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = write(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = write(typedArrayObtainStyledAttributes, 11);
        }
        this.menuHostHelperlambda0 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = zHasValue;
        if (zHasValue) {
            this.getOnBackPressedInput = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.onBackPressedDispatcher_delegatelambda00 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.ComponentActivity = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void serializer(View view) {
        Intent intent;
        PreferenceFragment preferenceFragment;
        if (MediaMetadataCompat() && this.getSavedStateRegistryControllerannotations) {
            serializer();
            colorResource colorresource = this.addObserverForBackInvokerlambda0;
            if (colorresource != null) {
                ((PreferenceGroup) colorresource.IconCompatParcelizer).write = Integer.MAX_VALUE;
                PreferenceGroupAdapter preferenceGroupAdapter = (PreferenceGroupAdapter) colorresource.write;
                Handler handler = preferenceGroupAdapter.RemoteActionCompatParcelizer;
                findLineRootdefault findlinerootdefault = preferenceGroupAdapter.IconCompatParcelizer;
                handler.removeCallbacks(findlinerootdefault);
                handler.post(findlinerootdefault);
                return;
            }
            getStartY getstarty = this.fullyDrawnReporter_delegatelambda0;
            if ((getstarty == null || (preferenceFragment = getstarty.MediaBrowserCompatMediaItem) == null || !preferenceFragment.serializer(this)) && (intent = this._init_lambda1) != null) {
                this.ResultReceiver.startActivity(intent);
            }
        }
    }

    public final String RemoteActionCompatParcelizer(String str) {
        return !MediaBrowserCompatMediaItem() ? str : this.fullyDrawnReporter_delegatelambda0.IconCompatParcelizer().getString(this.accessensureViewModelStore, str);
    }

    public final void serializer(String str) {
        if (MediaBrowserCompatMediaItem() && !TextUtils.equals(str, RemoteActionCompatParcelizer(null))) {
            SharedPreferences.Editor editor = this.fullyDrawnReporter_delegatelambda0.read();
            editor.putString(this.accessensureViewModelStore, str);
            if (this.fullyDrawnReporter_delegatelambda0.serializer) {
                return;
            }
            editor.apply();
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
