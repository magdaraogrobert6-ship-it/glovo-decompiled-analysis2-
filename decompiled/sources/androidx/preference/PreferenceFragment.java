package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import o.findLineRootdefault;
import o.getEndX;
import o.getIntrinsicSizeNHjbRc;
import o.getStartX;
import o.getStartY;
import o.isQuadraticMonotonic;
import o.toAutofillIdCompat;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class PreferenceFragment extends Fragment {
    private Runnable MediaBrowserCompatMediaItem;
    private Context MediaDescriptionCompat;
    private getStartY MediaMetadataCompat;
    private boolean RemoteActionCompatParcelizer;
    public RecyclerView read;
    private boolean write;
    private final DividerDecoration IconCompatParcelizer = new DividerDecoration();
    private int MediaSessionCompatQueueItem = R.layout.preference_list_fragment;
    private final Handler serializer = new toAutofillIdCompat(this);
    private final Runnable RatingCompat = new findLineRootdefault(0, this);

    public void IconCompatParcelizer() {
    }

    @Deprecated
    public abstract void IconCompatParcelizer(Bundle bundle, String str);

    public void MediaDescriptionCompat() {
    }

    @Deprecated
    public final RecyclerView serializer() {
        return this.read;
    }

    public Fragment write() {
        return null;
    }

    public final class DividerDecoration extends RecyclerView.ItemDecoration {
        public Drawable RemoteActionCompatParcelizer;
        public boolean read = true;
        public int write;

        public DividerDecoration() {
        }

        public final boolean read(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof getStartX) || !((getStartX) childViewHolder).RemoteActionCompatParcelizer) {
                return false;
            }
            boolean z = this.read;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z;
            }
            RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            return (childViewHolder2 instanceof getStartX) && ((getStartX) childViewHolder2).write;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            if (this.RemoteActionCompatParcelizer == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (read(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.RemoteActionCompatParcelizer.setBounds(0, height, width, this.write + height);
                    this.RemoteActionCompatParcelizer.draw(canvas);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            if (read(view, recyclerView)) {
                rect.bottom = this.write;
            }
        }
    }

    @Deprecated
    public RecyclerView.LayoutManager MediaBrowserCompatMediaItem() {
        getActivity();
        return new LinearLayoutManager(1);
    }

    @Deprecated
    public PreferenceScreen RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat.MediaSessionCompatQueueItem;
    }

    @Deprecated
    public RecyclerView.Adapter RemoteActionCompatParcelizer(PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.serializer.removeCallbacks(this.RatingCompat);
        this.serializer.removeMessages(1);
        if (this.write) {
            MediaMetadataCompat();
        }
        this.read = null;
        super.onDestroyView();
    }

    @Deprecated
    public RecyclerView serializer(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (this.MediaDescriptionCompat.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(MediaBrowserCompatMediaItem());
        recyclerView2.setAccessibilityDelegateCompat(new getEndX(recyclerView2));
        return recyclerView2;
    }

    @Deprecated
    public void setDividerHeight(int i) {
        DividerDecoration dividerDecoration = this.IconCompatParcelizer;
        dividerDecoration.write = i;
        RecyclerView recyclerView = PreferenceFragment.this.read;
        if (recyclerView.addObserverForBackInvokerlambda0.size() == 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager.read("Cannot invalidate item decorations during a scroll or layout");
        }
        recyclerView.markItemDecorInsetsDirty();
        recyclerView.requestLayout();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (preferenceScreenRemoteActionCompatParcelizer != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenRemoteActionCompatParcelizer.IconCompatParcelizer(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        getStartY getstarty = this.MediaMetadataCompat;
        getstarty.MediaBrowserCompatMediaItem = this;
        getstarty.read = this;
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        getStartY getstarty = this.MediaMetadataCompat;
        getstarty.MediaBrowserCompatMediaItem = null;
        getstarty.read = null;
    }

    @Deprecated
    public void read(Preference preference) {
        DialogFragment dialogFragmentIconCompatParcelizer;
        write();
        getActivity();
        if (getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            dialogFragmentIconCompatParcelizer = EditTextPreferenceDialogFragment.serializer(preference.accessensureViewModelStore);
        } else if (preference instanceof ListPreference) {
            dialogFragmentIconCompatParcelizer = ListPreferenceDialogFragment.serializer(preference.accessensureViewModelStore);
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                return;
            }
            dialogFragmentIconCompatParcelizer = MultiSelectListPreferenceDialogFragment.IconCompatParcelizer(preference.accessensureViewModelStore);
        }
        dialogFragmentIconCompatParcelizer.setTargetFragment(this, 0);
        dialogFragmentIconCompatParcelizer.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    @Deprecated
    public void serializer(PreferenceScreen preferenceScreen) {
        write();
        getActivity();
    }

    @Deprecated
    public void setDivider(Drawable drawable) {
        DividerDecoration dividerDecoration = this.IconCompatParcelizer;
        if (drawable != null) {
            dividerDecoration.getClass();
            dividerDecoration.write = drawable.getIntrinsicHeight();
        } else {
            dividerDecoration.write = 0;
        }
        dividerDecoration.RemoteActionCompatParcelizer = drawable;
        RecyclerView recyclerView = PreferenceFragment.this.read;
        if (recyclerView.addObserverForBackInvokerlambda0.size() == 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager.read("Cannot invalidate item decorations during a scroll or layout");
        }
        recyclerView.markItemDecorInsetsDirty();
        recyclerView.requestLayout();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.MediaDescriptionCompat = contextThemeWrapper;
        getStartY getstarty = new getStartY(contextThemeWrapper);
        this.MediaMetadataCompat = getstarty;
        getstarty.RatingCompat = this;
        IconCompatParcelizer(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Deprecated
    public boolean serializer(Preference preference) {
        if (preference.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
            return false;
        }
        write();
        getActivity();
        return false;
    }

    private void MediaMetadataCompat() {
        PreferenceScreen preferenceScreenRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (preferenceScreenRemoteActionCompatParcelizer != null) {
            preferenceScreenRemoteActionCompatParcelizer.RatingCompat();
        }
        MediaDescriptionCompat();
    }

    @Deprecated
    public <T extends Preference> T IconCompatParcelizer(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        getStartY getstarty = this.MediaMetadataCompat;
        if (getstarty == null || (preferenceScreen = getstarty.MediaSessionCompatQueueItem) == null) {
            return null;
        }
        return (T) preferenceScreen.read(charSequence);
    }

    public void read() {
        PreferenceScreen preferenceScreenRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (preferenceScreenRemoteActionCompatParcelizer != null) {
            serializer().setAdapter(RemoteActionCompatParcelizer(preferenceScreenRemoteActionCompatParcelizer));
            preferenceScreenRemoteActionCompatParcelizer.MediaDescriptionCompat();
        }
        IconCompatParcelizer();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenRemoteActionCompatParcelizer;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenRemoteActionCompatParcelizer = RemoteActionCompatParcelizer()) != null) {
            preferenceScreenRemoteActionCompatParcelizer.read(bundle2);
        }
        if (this.write) {
            read();
            Runnable runnable = this.MediaBrowserCompatMediaItem;
            if (runnable != null) {
                runnable.run();
                this.MediaBrowserCompatMediaItem = null;
            }
        }
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.MediaDescriptionCompat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, isQuadraticMonotonic.PreferenceFragment, ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getResourceId(0, this.MediaSessionCompatQueueItem);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.MediaDescriptionCompat);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.MediaSessionCompatQueueItem, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewSerializer = serializer(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewSerializer == null) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Could not create RecyclerView");
            return null;
        }
        this.read = recyclerViewSerializer;
        recyclerViewSerializer.addItemDecoration(this.IconCompatParcelizer);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.IconCompatParcelizer.read = z;
        if (this.read.getParent() == null) {
            viewGroup2.addView(this.read);
        }
        this.serializer.post(this.RatingCompat);
        return viewInflate;
    }
}
