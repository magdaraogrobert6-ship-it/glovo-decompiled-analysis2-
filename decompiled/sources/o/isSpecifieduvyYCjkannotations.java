package o;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.cardview.widget.CardView$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class isSpecifieduvyYCjkannotations {
    public final androidx.fragment.app.Fragment RemoteActionCompatParcelizer;
    public final CardView$1 serializer;
    public final isSpecifieduvyYCjk write;
    public boolean IconCompatParcelizer = false;
    public int read = -1;

    public final void IconCompatParcelizer() {
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(3);
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            Objects.toString(fragment);
        }
        androidx.fragment.app.Fragment fragment2 = fragment.addOnTrimMemoryListener;
        isSpecifieduvyYCjk isspecifieduvyycjk = this.write;
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations = null;
        if (fragment2 != null) {
            isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations2 = (isSpecifieduvyYCjkannotations) isspecifieduvyycjk.write.get(fragment2.getViewModelStore);
            if (isspecifieduvyycjkannotations2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                androidx.fragment.app.Fragment fragment3 = fragment.addOnTrimMemoryListener;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.getDefaultViewModelProviderFactory = fragment.addOnTrimMemoryListener.getViewModelStore;
            fragment.addOnTrimMemoryListener = null;
            isspecifieduvyycjkannotations = isspecifieduvyycjkannotations2;
        } else {
            String str = fragment.getDefaultViewModelProviderFactory;
            if (str != null && (isspecifieduvyycjkannotations = (isSpecifieduvyYCjkannotations) isspecifieduvyycjk.write.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m(sb2, fragment.getDefaultViewModelProviderFactory, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (isspecifieduvyycjkannotations != null) {
            isspecifieduvyycjkannotations.MediaDescriptionCompat();
        }
        div7Ah8Wj8 div7ah8wj8 = fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        fragment._init_lambda4 = div7ah8wj8.PlaybackStateCompat;
        fragment.fullyDrawnReporter_delegatelambda0 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        CardView$1 cardView$1 = this.serializer;
        cardView$1.IconCompatParcelizer(fragment, false);
        fragment.performAttach();
        cardView$1.RemoteActionCompatParcelizer(fragment, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final void MediaBrowserCompatMediaItem() {
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(3);
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.getActivityResultRegistry) {
                focusedView.requestFocus();
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.getActivityResultRegistry.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.getActivityResultRegistry) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.getActivityResultRegistry.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.serializer.RatingCompat(fragment, false);
        this.write.IconCompatParcelizer(null, fragment.getViewModelStore);
        fragment.addOnMultiWindowModeChangedListener = null;
        fragment.addOnPictureInPictureModeChangedListener = null;
        fragment.addOnConfigurationChangedListener = null;
    }

    public final void MediaSessionCompatQueueItem() {
        View view;
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(3);
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (viewGroup != null && (view = fragment.getActivityResultRegistry) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.serializer.MediaDescriptionCompat(fragment, false);
        fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        fragment.getActivityResultRegistry = null;
        fragment.getLastCustomNonConfigurationInstance = null;
        fragment.getLifecycle.RemoteActionCompatParcelizer((Object) null);
        fragment.defaultViewModelProviderFactory_delegatelambda0 = false;
    }

    public final void RatingCompat() {
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(3);
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.serializer.write(fragment, false);
        fragment.enterPictureInPictureMode = -1;
        fragment._init_lambda4 = null;
        fragment.fullyDrawnReporter_delegatelambda0 = null;
        fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
        if (!fragment.onBackPressedDispatcher_delegatelambda010 || fragment.isInBackStack()) {
            getZeroNHjbRc getzeronhjbrc = this.write.serializer;
            if (getzeronhjbrc.RemoteActionCompatParcelizer.containsKey(fragment.getViewModelStore) && getzeronhjbrc.MediaDescriptionCompat && !getzeronhjbrc.serializer) {
                return;
            }
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void read() {
        androidx.fragment.app.Fragment fragmentIconCompatParcelizer;
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(3);
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.onBackPressedDispatcher_delegatelambda010 && !fragment.isInBackStack();
        isSpecifieduvyYCjk isspecifieduvyycjk = this.write;
        if (z && !fragment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            isspecifieduvyycjk.IconCompatParcelizer(null, fragment.getViewModelStore);
        }
        if (!z) {
            getZeroNHjbRc getzeronhjbrc = isspecifieduvyycjk.serializer;
            if (getzeronhjbrc.RemoteActionCompatParcelizer.containsKey(fragment.getViewModelStore) && getzeronhjbrc.MediaDescriptionCompat && !getzeronhjbrc.serializer) {
                String str = fragment.getDefaultViewModelProviderFactory;
                if (str != null && (fragmentIconCompatParcelizer = isspecifieduvyycjk.IconCompatParcelizer(str)) != null && fragmentIconCompatParcelizer.onBackPressedDispatcher_delegatelambda00) {
                    fragment.addOnTrimMemoryListener = fragmentIconCompatParcelizer;
                }
                fragment.enterPictureInPictureMode = 0;
                return;
            }
        }
        isEllipse isellipse = fragment._init_lambda4;
        if (isellipse instanceof asFrameworkPaint) {
            zIsChangingConfigurations = isspecifieduvyycjk.serializer.serializer;
        } else {
            androidx.fragment.app.FragmentActivity fragmentActivity = isellipse.RemoteActionCompatParcelizer;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z && !fragment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) || zIsChangingConfigurations) {
            getZeroNHjbRc getzeronhjbrc2 = isspecifieduvyycjk.serializer;
            getzeronhjbrc2.getClass();
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                Objects.toString(fragment);
            }
            getzeronhjbrc2.RemoteActionCompatParcelizer(fragment.getViewModelStore, false);
        }
        fragment.performDestroy();
        this.serializer.serializer(fragment, false);
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : isspecifieduvyycjk.read()) {
            if (isspecifieduvyycjkannotations != null) {
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                if (fragment.getViewModelStore.equals(fragment2.getDefaultViewModelProviderFactory)) {
                    fragment2.addOnTrimMemoryListener = fragment;
                    fragment2.getDefaultViewModelProviderFactory = null;
                }
            }
        }
        String str2 = fragment.getDefaultViewModelProviderFactory;
        if (str2 != null) {
            fragment.addOnTrimMemoryListener = isspecifieduvyycjk.IconCompatParcelizer(str2);
        }
        isspecifieduvyycjk.RemoteActionCompatParcelizer(this);
    }

    public final void MediaMetadataCompat() {
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (fragment._init_lambda1 && fragment.defaultViewModelProviderFactory_delegatelambda0 && !fragment.fullyDrawnReporter_delegatelambda00) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.addOnMultiWindowModeChangedListener;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.getActivityResultRegistry;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.getActivityResultRegistry.setTag(com.logistics.rider.glovo.R.id.fragment_container_view_tag, fragment);
                if (fragment._init_lambda2) {
                    fragment.getActivityResultRegistry.setVisibility(8);
                }
                fragment.performViewCreated();
                this.serializer.IconCompatParcelizer(fragment, fragment.getActivityResultRegistry, bundle2, false);
                fragment.enterPictureInPictureMode = 2;
            }
        }
    }

    public final Bundle MediaSessionCompatToken() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (fragment.enterPictureInPictureMode == -1 && (bundle = fragment.addOnMultiWindowModeChangedListener) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new androidx.fragment.app.FragmentState(fragment));
        if (fragment.enterPictureInPictureMode > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.serializer.RemoteActionCompatParcelizer(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.addMenuProvider.read(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundlePlaybackStateCompatCustomAction = fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompatCustomAction();
            if (!bundlePlaybackStateCompatCustomAction.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundlePlaybackStateCompatCustomAction);
            }
            if (fragment.getActivityResultRegistry != null) {
                ParcelableVolumeInfo();
            }
            SparseArray<Parcelable> sparseArray = fragment.addOnPictureInPictureModeChangedListener;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.addOnConfigurationChangedListener;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void ParcelableVolumeInfo() {
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (fragment.getActivityResultRegistry == null) {
            return;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.getActivityResultRegistry);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.getActivityResultRegistry.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.addOnPictureInPictureModeChangedListener = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.getLastCustomNonConfigurationInstance.read.read(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.addOnConfigurationChangedListener = bundle;
    }

    public final void RemoteActionCompatParcelizer() {
        String resourceName;
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (fragment._init_lambda1) {
            return;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.addOnMultiWindowModeChangedListener;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (i != 0) {
                if (i == -1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer.IconCompatParcelizer(i);
                if (viewGroup == null) {
                    if (!fragment.addContentView && !fragment.createFullyDrawnExecutor) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = SystemUtils.UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof androidx.fragment.app.FragmentContainerView)) {
                    androidx.fragment.app.strictmode.FragmentStrictMode.write(fragment, viewGroup);
                }
            }
        }
        fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.getActivityResultRegistry != null) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                Objects.toString(fragment);
            }
            fragment.getActivityResultRegistry.setSaveFromParentEnabled(false);
            fragment.getActivityResultRegistry.setTag(com.logistics.rider.glovo.R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                serializer();
            }
            if (fragment._init_lambda2) {
                fragment.getActivityResultRegistry.setVisibility(8);
            }
            boolean zIsAttachedToWindow = fragment.getActivityResultRegistry.isAttachedToWindow();
            View view = fragment.getActivityResultRegistry;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new lerpVgWVRYQ(view));
            }
            fragment.performViewCreated();
            this.serializer.IconCompatParcelizer(fragment, fragment.getActivityResultRegistry, bundle2, false);
            int visibility = fragment.getActivityResultRegistry.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.getActivityResultRegistry.getAlpha());
            if (fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null && visibility == 0) {
                View viewFindFocus = fragment.getActivityResultRegistry.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.getActivityResultRegistry.setAlpha(0.0f);
            }
        }
        fragment.enterPictureInPictureMode = 2;
    }

    public final void serializer() {
        int iIndexOfChild;
        View view;
        View view2;
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        androidx.fragment.app.Fragment fragmentWrite = div7Ah8Wj8.write(fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        if (fragmentWrite != null && !fragmentWrite.equals(parentFragment)) {
            androidx.fragment.app.strictmode.FragmentStrictMode.serializer(fragment, fragmentWrite, fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        }
        ArrayList arrayList = this.write.RemoteActionCompatParcelizer;
        ViewGroup viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (viewGroup == null) {
            iIndexOfChild = -1;
        } else {
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayList.get(i);
                if (fragment2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == viewGroup && (view2 = fragment2.getActivityResultRegistry) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) arrayList.get(iIndexOf);
                if (fragment3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == viewGroup && (view = fragment3.getActivityResultRegistry) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                }
            }
            iIndexOfChild = -1;
        }
        fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.addView(fragment.getActivityResultRegistry, iIndexOfChild);
    }

    public final int write() {
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            return fragment.enterPictureInPictureMode;
        }
        int iMin = this.read;
        int i = isUnspecifieduvyYCjkannotations.read[fragment.getSavedStateRegistryControllerannotations.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (fragment._init_lambda1) {
            boolean z = fragment.defaultViewModelProviderFactory_delegatelambda0;
            int i2 = this.read;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = fragment.getActivityResultRegistry;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, fragment.enterPictureInPictureMode) : Math.min(iMin, 1);
            }
        }
        if (fragment.createFullyDrawnExecutor && fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        drawLines drawlines = null;
        if (viewGroup != null) {
            isFiniteannotations isfiniteannotations = isFiniteannotations.read(viewGroup, fragment.getParentFragmentManager());
            getInternalCanvasannotations getinternalcanvasannotationsRemoteActionCompatParcelizer = isfiniteannotations.RemoteActionCompatParcelizer(fragment);
            drawLines drawlines2 = getinternalcanvasannotationsRemoteActionCompatParcelizer != null ? getinternalcanvasannotationsRemoteActionCompatParcelizer.ParcelableVolumeInfo : null;
            getInternalCanvasannotations getinternalcanvasannotationsSerializer = isfiniteannotations.serializer(fragment);
            drawlines = getinternalcanvasannotationsSerializer != null ? getinternalcanvasannotationsSerializer.ParcelableVolumeInfo : null;
            int i3 = drawlines2 == null ? -1 : concat58bKbWc.serializer[drawlines2.ordinal()];
            if (i3 != -1 && i3 != 1) {
                drawlines = drawlines2;
            }
        }
        if (drawlines == drawLines.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (drawlines == drawLines.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.onBackPressedDispatcher_delegatelambda010) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 && fragment.enterPictureInPictureMode < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.getDefaultViewModelCreationExtras) {
            iMin = Math.max(iMin, 3);
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void write(ClassLoader classLoader) {
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        Bundle bundle = fragment.addOnMultiWindowModeChangedListener;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.addOnMultiWindowModeChangedListener.getBundle("savedInstanceState") == null) {
            fragment.addOnMultiWindowModeChangedListener.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.addOnPictureInPictureModeChangedListener = fragment.addOnMultiWindowModeChangedListener.getSparseParcelableArray("viewState");
            fragment.addOnConfigurationChangedListener = fragment.addOnMultiWindowModeChangedListener.getBundle("viewRegistryState");
            androidx.fragment.app.FragmentState fragmentState = (androidx.fragment.app.FragmentState) fragment.addOnMultiWindowModeChangedListener.getParcelable("state");
            if (fragmentState != null) {
                fragment.getDefaultViewModelProviderFactory = fragmentState.ParcelableVolumeInfo;
                fragment.addOnPictureInPictureUiStateChangedListener = fragmentState.MediaSessionCompatResultReceiverWrapper;
                Boolean bool = fragment.addOnNewIntentListener;
                if (bool != null) {
                    fragment.getFullyDrawnReporter = bool.booleanValue();
                    fragment.addOnNewIntentListener = null;
                } else {
                    fragment.getFullyDrawnReporter = fragmentState.MediaSessionCompatToken;
                }
            }
            if (fragment.getFullyDrawnReporter) {
                return;
            }
            fragment.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
        }
    }

    public final void MediaDescriptionCompat() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z = this.IconCompatParcelizer;
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        if (z) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.IconCompatParcelizer = true;
            boolean z2 = false;
            while (true) {
                int iWrite = write();
                int i = fragment.enterPictureInPictureMode;
                isSpecifieduvyYCjk isspecifieduvyycjk = this.write;
                if (iWrite == i) {
                    if (!z2 && i == -1 && fragment.onBackPressedDispatcher_delegatelambda010 && !fragment.isInBackStack() && !fragment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                            Objects.toString(fragment);
                        }
                        getZeroNHjbRc getzeronhjbrc = isspecifieduvyycjk.serializer;
                        getzeronhjbrc.getClass();
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                            Objects.toString(fragment);
                        }
                        getzeronhjbrc.RemoteActionCompatParcelizer(fragment.getViewModelStore, true);
                        isspecifieduvyycjk.RemoteActionCompatParcelizer(this);
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment._init_lambda3) {
                        if (fragment.getActivityResultRegistry != null && (viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                            isFiniteannotations isfiniteannotations = isFiniteannotations.read(viewGroup, fragment.getParentFragmentManager());
                            if (fragment._init_lambda2) {
                                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                    Objects.toString(fragment);
                                }
                                isfiniteannotations.RemoteActionCompatParcelizer(clipRectN_I0leg.GONE, drawLines.NONE, this);
                            } else {
                                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                    Objects.toString(fragment);
                                }
                                isfiniteannotations.RemoteActionCompatParcelizer(clipRectN_I0leg.VISIBLE, drawLines.NONE, this);
                            }
                        }
                        div7Ah8Wj8 div7ah8wj8 = fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        if (div7ah8wj8 != null && fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && div7Ah8Wj8.read(fragment)) {
                            div7ah8wj8.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
                        }
                        fragment._init_lambda3 = false;
                        fragment.onHiddenChanged(fragment._init_lambda2);
                        fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer();
                    }
                    return;
                }
                CardView$1 cardView$1 = this.serializer;
                if (iWrite > i) {
                    switch (i + 1) {
                        case 0:
                            IconCompatParcelizer();
                            break;
                        case 1:
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle2 = fragment.addOnMultiWindowModeChangedListener;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!fragment.addObserverForBackInvokerlambda0) {
                                cardView$1.IconCompatParcelizer(fragment, bundle, false);
                                fragment.performCreate(bundle);
                                cardView$1.write(fragment, bundle, false);
                            } else {
                                fragment.enterPictureInPictureMode = 1;
                                fragment.restoreChildFragmentState();
                            }
                            break;
                        case 2:
                            MediaMetadataCompat();
                            RemoteActionCompatParcelizer();
                            break;
                        case 3:
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.addOnMultiWindowModeChangedListener;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment.performActivityCreated(bundle);
                            cardView$1.serializer(fragment, bundle, false);
                            break;
                        case 4:
                            if (fragment.getActivityResultRegistry != null && (viewGroup3 = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                                isFiniteannotations isfiniteannotations2 = isFiniteannotations.read(viewGroup3, fragment.getParentFragmentManager());
                                clipRectN_I0leg cliprectn_i0legFrom = clipRectN_I0leg.from(fragment.getActivityResultRegistry.getVisibility());
                                cliprectn_i0legFrom.getClass();
                                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                    Objects.toString(fragment);
                                }
                                isfiniteannotations2.RemoteActionCompatParcelizer(cliprectn_i0legFrom, drawLines.ADDING, this);
                            }
                            fragment.enterPictureInPictureMode = 4;
                            break;
                        case 5:
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            cardView$1.MediaBrowserCompatMediaItem(fragment, false);
                            break;
                        case 6:
                            fragment.enterPictureInPictureMode = 6;
                            break;
                        case 7:
                            MediaBrowserCompatMediaItem();
                            break;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            RatingCompat();
                            break;
                        case 0:
                            if (fragment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                                if (((Bundle) isspecifieduvyycjk.IconCompatParcelizer.get(fragment.getViewModelStore)) == null) {
                                    isspecifieduvyycjk.IconCompatParcelizer(MediaSessionCompatToken(), fragment.getViewModelStore);
                                }
                            }
                            read();
                            break;
                        case 1:
                            MediaSessionCompatQueueItem();
                            fragment.enterPictureInPictureMode = 1;
                            break;
                        case 2:
                            fragment.defaultViewModelProviderFactory_delegatelambda0 = false;
                            fragment.enterPictureInPictureMode = 2;
                            break;
                        case 3:
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                                isspecifieduvyycjk.IconCompatParcelizer(MediaSessionCompatToken(), fragment.getViewModelStore);
                            } else if (fragment.getActivityResultRegistry != null && fragment.addOnPictureInPictureModeChangedListener == null) {
                                ParcelableVolumeInfo();
                            }
                            if (fragment.getActivityResultRegistry != null && (viewGroup2 = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                                isFiniteannotations isfiniteannotations3 = isFiniteannotations.read(viewGroup2, fragment.getParentFragmentManager());
                                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                    Objects.toString(fragment);
                                }
                                isfiniteannotations3.RemoteActionCompatParcelizer(clipRectN_I0leg.REMOVED, drawLines.REMOVING, this);
                            }
                            fragment.enterPictureInPictureMode = 3;
                            break;
                        case 4:
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            cardView$1.MediaMetadataCompat(fragment, false);
                            break;
                        case 5:
                            fragment.enterPictureInPictureMode = 5;
                            break;
                        case 6:
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            cardView$1.read(fragment, false);
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.IconCompatParcelizer = false;
        }
    }

    public isSpecifieduvyYCjkannotations(CardView$1 cardView$1, isSpecifieduvyYCjk isspecifieduvyycjk, ClassLoader classLoader, getMaxDimensionannotations getmaxdimensionannotations, Bundle bundle) {
        this.serializer = cardView$1;
        this.write = isspecifieduvyycjk;
        androidx.fragment.app.Fragment fragmentRemoteActionCompatParcelizer = ((androidx.fragment.app.FragmentState) bundle.getParcelable("state")).RemoteActionCompatParcelizer(getmaxdimensionannotations);
        this.RemoteActionCompatParcelizer = fragmentRemoteActionCompatParcelizer;
        fragmentRemoteActionCompatParcelizer.addOnMultiWindowModeChangedListener = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentRemoteActionCompatParcelizer.setArguments(bundle2);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(fragmentRemoteActionCompatParcelizer);
        }
    }

    public isSpecifieduvyYCjkannotations(CardView$1 cardView$1, isSpecifieduvyYCjk isspecifieduvyycjk, androidx.fragment.app.Fragment fragment) {
        this.serializer = cardView$1;
        this.write = isspecifieduvyycjk;
        this.RemoteActionCompatParcelizer = fragment;
    }

    public isSpecifieduvyYCjkannotations(CardView$1 cardView$1, isSpecifieduvyYCjk isspecifieduvyycjk, androidx.fragment.app.Fragment fragment, Bundle bundle) {
        this.serializer = cardView$1;
        this.write = isspecifieduvyycjk;
        this.RemoteActionCompatParcelizer = fragment;
        fragment.addOnPictureInPictureModeChangedListener = null;
        fragment.addOnConfigurationChangedListener = null;
        fragment.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
        fragment.defaultViewModelProviderFactory_delegatelambda0 = false;
        fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        androidx.fragment.app.Fragment fragment2 = fragment.addOnTrimMemoryListener;
        fragment.getDefaultViewModelProviderFactory = fragment2 != null ? fragment2.getViewModelStore : null;
        fragment.addOnTrimMemoryListener = null;
        fragment.addOnMultiWindowModeChangedListener = bundle;
        fragment.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = bundle.getBundle("arguments");
    }
}
