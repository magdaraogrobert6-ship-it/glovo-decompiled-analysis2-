package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.colorResource;
import o.evaluateLine;
import o.findLineRootdefault;
import o.getStartX;
import o.isQuadraticMonotonic;

/* JADX INFO: loaded from: classes4.dex */
public final class PreferenceGroupAdapter extends RecyclerView.Adapter {
    public ArrayList MediaDescriptionCompat;
    public final ArrayList read;
    public final PreferenceGroup serializer;
    public ArrayList write;
    public final findLineRootdefault IconCompatParcelizer = new findLineRootdefault(1, this);
    public final Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());

    public final class PreferenceResourceDescriptor {
        public final int RemoteActionCompatParcelizer;
        public final String read;
        public final int serializer;

        public final int hashCode() {
            int i = this.RemoteActionCompatParcelizer;
            return this.read.hashCode() + ((((i + 527) * 31) + this.serializer) * 31);
        }

        public PreferenceResourceDescriptor(Preference preference) {
            this.read = preference.getClass().getName();
            this.RemoteActionCompatParcelizer = preference._init_lambda3;
            this.serializer = preference.onBackPressedDispatcher_delegatelambda0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PreferenceResourceDescriptor)) {
                return false;
            }
            PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) obj;
            return this.RemoteActionCompatParcelizer == preferenceResourceDescriptor.RemoteActionCompatParcelizer && this.serializer == preferenceResourceDescriptor.serializer && TextUtils.equals(this.read, preferenceResourceDescriptor.read);
        }
    }

    public final void IconCompatParcelizer(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.MediaSessionCompatQueueItem);
        }
        int size = preferenceGroup.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceRemoteActionCompatParcelizer = preferenceGroup.RemoteActionCompatParcelizer(i);
            arrayList.add(preferenceRemoteActionCompatParcelizer);
            PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(preferenceRemoteActionCompatParcelizer);
            if (!this.read.contains(preferenceResourceDescriptor)) {
                this.read.add(preferenceResourceDescriptor);
            }
            if (preferenceRemoteActionCompatParcelizer instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceRemoteActionCompatParcelizer;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    IconCompatParcelizer(arrayList, preferenceGroup2);
                }
            }
            preferenceRemoteActionCompatParcelizer._init_lambda2 = this;
        }
    }

    public final void IconCompatParcelizer() {
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            ((Preference) it.next())._init_lambda2 = null;
        }
        ArrayList arrayList = new ArrayList(this.write.size());
        this.write = arrayList;
        PreferenceGroup preferenceGroup = this.serializer;
        IconCompatParcelizer(arrayList, preferenceGroup);
        this.MediaDescriptionCompat = write(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.write.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.MediaDescriptionCompat.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        getStartX getstartx = (getStartX) viewHolder;
        Preference preference = read(i);
        ColorStateList colorStateList = getstartx.IconCompatParcelizer;
        Drawable background = getstartx.MediaSessionCompatQueueItem.getBackground();
        Drawable drawable = getstartx.read;
        if (background != drawable) {
            View view = getstartx.MediaSessionCompatQueueItem;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) getstartx.IconCompatParcelizer(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preference.serializer(getstartx);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) this.read.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, isQuadraticMonotonic.BackgroundStyle);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = IntPair.write(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(preferenceResourceDescriptor.RemoteActionCompatParcelizer, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = preferenceResourceDescriptor.serializer;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new getStartX(viewInflate);
    }

    public final Preference read(int i) {
        if (i < 0 || i >= this.MediaDescriptionCompat.size()) {
            return null;
        }
        return (Preference) this.MediaDescriptionCompat.get(i);
    }

    public final ArrayList write(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Preference> arrayList2 = new ArrayList();
        int size = preferenceGroup.MediaSessionCompatQueueItem.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference preferenceRemoteActionCompatParcelizer = preferenceGroup.RemoteActionCompatParcelizer(i2);
            if (preferenceRemoteActionCompatParcelizer.onBackPressedDispatcher_delegatelambda00) {
                int i3 = preferenceGroup.write;
                if (i3 == Integer.MAX_VALUE || i < i3) {
                    arrayList.add(preferenceRemoteActionCompatParcelizer);
                } else {
                    arrayList2.add(preferenceRemoteActionCompatParcelizer);
                }
                if (preferenceRemoteActionCompatParcelizer instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceRemoteActionCompatParcelizer;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.write != Integer.MAX_VALUE && preferenceGroup2.write != Integer.MAX_VALUE) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        for (Preference preference : write(preferenceGroup2)) {
                            int i4 = preferenceGroup.write;
                            if (i4 == Integer.MAX_VALUE || i < i4) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        int i5 = preferenceGroup.write;
        if (i5 == Integer.MAX_VALUE || i <= i5) {
            return arrayList;
        }
        Context context = preferenceGroup.ResultReceiver;
        long j = preferenceGroup._init_lambda4;
        evaluateLine evaluateline = new evaluateLine(context, null);
        evaluateline._init_lambda3 = com.logistics.rider.glovo.R.layout.expand_button;
        Context context2 = evaluateline.ResultReceiver;
        Drawable drawableWrite = IntPair.write(context2, com.logistics.rider.glovo.R.drawable.ic_arrow_down_24dp);
        if (evaluateline.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != drawableWrite) {
            evaluateline.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = drawableWrite;
            evaluateline.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 0;
            evaluateline.write();
        }
        evaluateline.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = com.logistics.rider.glovo.R.drawable.ic_arrow_down_24dp;
        String string = context2.getString(com.logistics.rider.glovo.R.string.expand_button_title);
        if (!TextUtils.equals(string, evaluateline.onBackPressedInput_delegatelambda0)) {
            evaluateline.onBackPressedInput_delegatelambda0 = string;
            evaluateline.write();
        }
        if (999 != evaluateline.ensureViewModelStore) {
            evaluateline.ensureViewModelStore = 999;
            PreferenceGroupAdapter preferenceGroupAdapter = evaluateline._init_lambda2;
            if (preferenceGroupAdapter != null) {
                Handler handler = preferenceGroupAdapter.RemoteActionCompatParcelizer;
                findLineRootdefault findlinerootdefault = preferenceGroupAdapter.IconCompatParcelizer;
                handler.removeCallbacks(findlinerootdefault);
                handler.post(findlinerootdefault);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        CharSequence string2 = null;
        for (Preference preference2 : arrayList2) {
            CharSequence charSequence = preference2.onBackPressedInput_delegatelambda0;
            boolean z = preference2 instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList3.add((PreferenceGroup) preference2);
            }
            if (arrayList3.contains(preference2.defaultViewModelProviderFactory_delegatelambda0)) {
                if (z) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string2 = string2 == null ? charSequence : context2.getString(com.logistics.rider.glovo.R.string.summary_collapsed_preference_list, string2, charSequence);
            }
        }
        if (evaluateline.onBackPressedDispatcher_delegatelambda010 != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Preference already has a SummaryProvider set.");
            return null;
        }
        if (!TextUtils.equals(evaluateline.addContentView, string2)) {
            evaluateline.addContentView = string2;
            evaluateline.write();
        }
        evaluateline.RemoteActionCompatParcelizer = j + 1000000;
        evaluateline.addObserverForBackInvokerlambda0 = new colorResource(this, 11, preferenceGroup);
        arrayList.add(evaluateline);
        return arrayList;
    }

    public PreferenceGroupAdapter(PreferenceScreen preferenceScreen) {
        this.serializer = preferenceScreen;
        preferenceScreen._init_lambda2 = this;
        this.write = new ArrayList();
        this.MediaDescriptionCompat = new ArrayList();
        this.read = new ArrayList();
        setHasStableIds(preferenceScreen.MediaDescriptionCompat);
        IconCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(read(i));
        ArrayList arrayList = this.read;
        int iIndexOf = arrayList.indexOf(preferenceResourceDescriptor);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(preferenceResourceDescriptor);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return read(i).RemoteActionCompatParcelizer();
        }
        return -1L;
    }
}
