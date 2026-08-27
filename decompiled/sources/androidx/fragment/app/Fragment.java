package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import bo.app.a5$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.domain.util.RetryWithDelay;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.ActualImageBitmapx__hDU;
import o.AndroidColorFilter_androidKt;
import o.AndroidColorSpace_androidKt;
import o.AndroidGraphicsContext2;
import o.NativePaintannotations;
import o.RoundRectCompanion;
import o.RoundRectKt;
import o.RoundRectZAM2FJodefault;
import o.accessinvalidateNodes;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.accessunregisterComponentCallback;
import o.asFrameworkPaint;
import o.asImageBitmap;
import o.component6kKHJgLs;
import o.component7kKHJgLs;
import o.component8kKHJgLs;
import o.copyMDFrsts;
import o.createImageBitmap;
import o.div7Ah8Wj8;
import o.getBottomLeftCornerRadiuskKHJgLs;
import o.getBottomRightCornerRadiuskKHJgLs;
import o.getCenteruvyYCjkannotations;
import o.getFilterQualityfv9h1I;
import o.getLightGray0d7_KjU;
import o.getMaxDimensionannotations;
import o.getNavigationEventDispatcher;
import o.getOnFocusChanged;
import o.getRed0d7_KjU;
import o.getSafeInnerRect;
import o.getTopLeftCornerRadiuskKHJgLs;
import o.getTopRightCornerRadiuskKHJgLs;
import o.getTransparent0d7_KjU;
import o.getUnspecifiedNHjbRc;
import o.getWhite0d7_KjU;
import o.getZeroNHjbRc;
import o.isEllipse;
import o.isFiniteannotations;
import o.isSpecifieduvyYCjkannotations;
import o.onBackPressed;
import o.onNewIntent;
import o.prepareToDraw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.seekAnimationsanimation_core;
import o.setStrokeCapBeK7IIE;
import o.setStrokeMiterLimit;
import o.setTextClassifier;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;
import o.toPorterDuffModes9anfk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, accessisRenderNodeCompatiblecp, asFrameworkPaint, AndroidColorFilter_androidKt, getTransparent0d7_KjU {
    private static int MediaDescriptionCompat = 1;
    private static byte MediaSessionCompatQueueItem;
    private static int RatingCompat;
    static final Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public getTopLeftCornerRadiuskKHJgLs ComponentActivity;
    private final AtomicInteger IconCompatParcelizer;
    private final getBottomRightCornerRadiuskKHJgLs MediaMetadataCompat;
    private final ArrayList<getBottomRightCornerRadiuskKHJgLs> RemoteActionCompatParcelizer;
    public boolean _init_lambda1;
    public boolean _init_lambda2;
    public boolean _init_lambda3;
    public isEllipse _init_lambda4;
    public boolean accessensureViewModelStore;
    public boolean addContentView;
    public getWhite0d7_KjU addMenuProvider;
    accessregisterComponentCallback addObserverForBackInvoker;
    public boolean addObserverForBackInvokerlambda0;
    public Bundle addOnConfigurationChangedListener;
    public boolean addOnContextAvailableListener;
    public Bundle addOnMultiWindowModeChangedListener;
    public Boolean addOnNewIntentListener;
    public SparseArray<Parcelable> addOnPictureInPictureModeChangedListener;
    public int addOnPictureInPictureUiStateChangedListener;
    public Fragment addOnTrimMemoryListener;
    public String addOnUserLeaveHintListener;
    public boolean createFullyDrawnExecutor;
    public boolean defaultViewModelProviderFactory_delegatelambda0;
    LayoutInflater ensureViewModelStore;
    public int enterPictureInPictureMode;
    public Fragment fullyDrawnReporter_delegatelambda0;
    public boolean fullyDrawnReporter_delegatelambda00;
    public View getActivityResultRegistry;
    public boolean getDefaultViewModelCreationExtras;
    public String getDefaultViewModelProviderFactory;
    public boolean getFullyDrawnReporter;
    public toPorterDuffModes9anfk8 getLastCustomNonConfigurationInstance;
    public AndroidGraphicsContext2 getLifecycle;
    public boolean getOnBackPressedInput;
    public toColorLong8_81llA getSavedStateRegistryControllerannotations;
    public String getViewModelStore;
    Runnable menuHostHelperlambda0;
    Handler onBackPressedDispatcher_delegatelambda0;
    public boolean onBackPressedDispatcher_delegatelambda00;
    public boolean onBackPressedDispatcher_delegatelambda010;
    public String onBackPressedInput_delegatelambda0;
    public Bundle r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public div7Ah8Wj8 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public ViewGroup r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public createImageBitmap r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public div7Ah8Wj8 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private Boolean read;
    private boolean serializer;
    private int write;

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$3, reason: invalid class name */
    public final class AnonymousClass3 implements Runnable {
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ Object serializer;

        public /* synthetic */ AnonymousClass3(int i, Object obj) {
            this.IconCompatParcelizer = i;
            this.serializer = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.IconCompatParcelizer;
            Object obj = this.serializer;
            if (i == 0) {
                ((Fragment) obj).callStartTransitionListener(false);
                return;
            }
            if (i == 1) {
                DialogFragment dialogFragment = (DialogFragment) obj;
                dialogFragment.PlaybackStateCompatCustomAction.onDismiss(dialogFragment.read);
            } else {
                isFiniteannotations isfiniteannotations = (isFiniteannotations) obj;
                if (isfiniteannotations.RemoteActionCompatParcelizer.isEmpty()) {
                    return;
                }
                isfiniteannotations.write();
            }
        }
    }

    public class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @SuppressLint
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new getTopRightCornerRadiuskKHJgLs();
        public final Bundle read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.read);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.read = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    public Activity MediaBrowserCompatMediaItem() {
        return getActivity();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final Bundle getArguments() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Deprecated
    public final div7Ah8Wj8 getFragmentManager() {
        return this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    }

    public final int getId() {
        return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public supportsColorMatrixQuery getLifecycle() {
        return this.addObserverForBackInvoker;
    }

    @Deprecated
    public NativePaintannotations getLoaderManager() {
        return NativePaintannotations.serializer(this);
    }

    public final Fragment getParentFragment() {
        return this.fullyDrawnReporter_delegatelambda0;
    }

    public final String getTag() {
        return this.addOnUserLeaveHintListener;
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.getFullyDrawnReporter;
    }

    public View getView() {
        return this.getActivityResultRegistry;
    }

    public accessunregisterComponentCallback getViewLifecycleOwnerLiveData() {
        return this.getLifecycle;
    }

    @SuppressLint
    public final boolean hasOptionsMenu() {
        return this.accessensureViewModelStore;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean isDetached() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    public final boolean isInBackStack() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 > 0;
    }

    public final boolean isInLayout() {
        return this.defaultViewModelProviderFactory_delegatelambda0;
    }

    public final boolean isRemoving() {
        return this.onBackPressedDispatcher_delegatelambda010;
    }

    public final boolean isResumed() {
        return this.enterPictureInPictureMode >= 7;
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.serializer = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.serializer = true;
        isEllipse isellipse = this._init_lambda4;
        FragmentActivity fragmentActivity = isellipse == null ? null : isellipse.read;
        if (fragmentActivity != null) {
            this.serializer = false;
            onAttach((Activity) fragmentActivity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.serializer = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.serializer = true;
        restoreChildFragmentState();
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (div7ah8wj8.RatingCompat >= 1) {
            return;
        }
        div7ah8wj8.ensureViewModelStore = false;
        div7ah8wj8.addObserverForBackInvoker = false;
        div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        div7ah8wj8.IconCompatParcelizer(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroy() {
        this.serializer = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.serializer = true;
    }

    public void onDetach() {
        this.serializer = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.serializer = true;
        isEllipse isellipse = this._init_lambda4;
        FragmentActivity fragmentActivity = isellipse == null ? null : isellipse.read;
        if (fragmentActivity != null) {
            this.serializer = false;
            onInflate((Activity) fragmentActivity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.serializer = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.serializer = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.serializer = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.serializer = true;
    }

    public void onStop() {
        this.serializer = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.serializer = true;
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void performDetach() {
        this.enterPictureInPictureMode = -1;
        this.serializer = false;
        onDetach();
        this.ensureViewModelStore = null;
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (div7ah8wj8.MediaDescriptionCompat) {
            return;
        }
        div7ah8wj8.write();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getUnspecifiedNHjbRc();
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final div7Ah8Wj8 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    static {
        MediaSessionCompatQueueItem();
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new Object();
    }

    public getSafeInnerRect createFragmentContainer() {
        return new component8kKHJgLs(this);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.getViewModelStore) ? this : this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str);
    }

    public final int getMinimumMaxLifecycleState() {
        toColorLong8_81llA tocolorlong8_81lla = this.getSavedStateRegistryControllerannotations;
        return (tocolorlong8_81lla == toColorLong8_81llA.INITIALIZED || this.fullyDrawnReporter_delegatelambda0 == null) ? tocolorlong8_81lla.ordinal() : Math.min(tocolorlong8_81lla.ordinal(), this.fullyDrawnReporter_delegatelambda0.getMinimumMaxLifecycleState());
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        return this.addMenuProvider.read;
    }

    public final Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.IconCompatParcelizer(this);
        }
        Fragment fragment = this.addOnTrimMemoryListener;
        if (fragment != null) {
            return fragment;
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 == null || (str = this.getDefaultViewModelProviderFactory) == null) {
            return null;
        }
        return div7ah8wj8.PlaybackStateCompatCustomAction.IconCompatParcelizer(str);
    }

    public void noteStateNotSaved() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompat();
    }

    public void performActivityCreated(Bundle bundle) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompat();
        this.enterPictureInPictureMode = 3;
        this.serializer = false;
        onActivityCreated(bundle);
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            toString();
        }
        if (this.getActivityResultRegistry != null) {
            Bundle bundle2 = this.addOnMultiWindowModeChangedListener;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.addOnMultiWindowModeChangedListener = null;
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        div7ah8wj8.ensureViewModelStore = false;
        div7ah8wj8.addObserverForBackInvoker = false;
        div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        div7ah8wj8.IconCompatParcelizer(4);
    }

    public void performAttach() {
        Iterator<getBottomRightCornerRadiuskKHJgLs> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().write();
        }
        this.RemoteActionCompatParcelizer.clear();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(this._init_lambda4, createFragmentContainer(), this);
        this.enterPictureInPictureMode = 0;
        this.serializer = false;
        onAttach((Context) this._init_lambda4.RemoteActionCompatParcelizer);
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        Iterator it2 = div7ah8wj8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.iterator();
        while (it2.hasNext()) {
            ((getCenteruvyYCjkannotations) it2.next()).read(div7ah8wj8, this);
        }
        div7Ah8Wj8 div7ah8wj9 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        div7ah8wj9.ensureViewModelStore = false;
        div7ah8wj9.addObserverForBackInvoker = false;
        div7ah8wj9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        div7ah8wj9.IconCompatParcelizer(0);
    }

    public void performCreate(Bundle bundle) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompat();
        this.enterPictureInPictureMode = 1;
        this.serializer = false;
        this.addObserverForBackInvoker.IconCompatParcelizer(new copyMDFrsts(this));
        onCreate(bundle);
        this.addObserverForBackInvokerlambda0 = true;
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.addObserverForBackInvoker.serializer(AndroidColorSpace_androidKt.ON_CREATE);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompat();
        this.fullyDrawnReporter_delegatelambda00 = true;
        this.getLastCustomNonConfigurationInstance = new toPorterDuffModes9anfk8(this, getViewModelStore(), new Fragment$$ExternalSyntheticLambda2(this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.getActivityResultRegistry = viewOnCreateView;
        toPorterDuffModes9anfk8 toporterduffmodes9anfk8 = this.getLastCustomNonConfigurationInstance;
        if (viewOnCreateView == null) {
            if (toporterduffmodes9anfk8.write == null) {
                this.getLastCustomNonConfigurationInstance = null;
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        toporterduffmodes9anfk8.IconCompatParcelizer();
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            Objects.toString(this.getActivityResultRegistry);
            toString();
        }
        removeNodeAtDepth.write(this.getActivityResultRegistry, (accessisRenderNodeCompatiblecp) this.getLastCustomNonConfigurationInstance);
        View view = this.getActivityResultRegistry;
        toPorterDuffModes9anfk8 toporterduffmodes9anfk9 = this.getLastCustomNonConfigurationInstance;
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, toporterduffmodes9anfk9);
        View view2 = this.getActivityResultRegistry;
        toPorterDuffModes9anfk8 toporterduffmodes9anfk10 = this.getLastCustomNonConfigurationInstance;
        view2.getClass();
        view2.setTag(R.id.view_tree_saved_state_registry_owner, toporterduffmodes9anfk10);
        this.getLifecycle.RemoteActionCompatParcelizer(this.getLastCustomNonConfigurationInstance);
    }

    public void performDestroy() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write();
        this.addObserverForBackInvoker.serializer(AndroidColorSpace_androidKt.ON_DESTROY);
        this.enterPictureInPictureMode = 0;
        this.serializer = false;
        this.addObserverForBackInvokerlambda0 = false;
        onDestroy();
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getClass();
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(this);
        Boolean bool = this.read;
        if (bool == null || bool.booleanValue() != zRemoteActionCompatParcelizer) {
            this.read = Boolean.valueOf(zRemoteActionCompatParcelizer);
            onPrimaryNavigationFragmentChanged(zRemoteActionCompatParcelizer);
            div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            div7ah8wj8.ParcelableVolumeInfo();
            div7ah8wj8.MediaDescriptionCompat(div7ah8wj8._init_lambda3);
        }
    }

    public void performResume() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompat();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer(true);
        this.enterPictureInPictureMode = 7;
        this.serializer = false;
        onResume();
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        accessregisterComponentCallback accessregistercomponentcallback = this.addObserverForBackInvoker;
        AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_RESUME;
        accessregistercomponentcallback.serializer(androidColorSpace_androidKt);
        if (this.getActivityResultRegistry != null) {
            this.getLastCustomNonConfigurationInstance.write.serializer(androidColorSpace_androidKt);
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        div7ah8wj8.ensureViewModelStore = false;
        div7ah8wj8.addObserverForBackInvoker = false;
        div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        div7ah8wj8.IconCompatParcelizer(7);
    }

    public void performStart() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompat();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer(true);
        this.enterPictureInPictureMode = 5;
        this.serializer = false;
        onStart();
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        accessregisterComponentCallback accessregistercomponentcallback = this.addObserverForBackInvoker;
        AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_START;
        accessregistercomponentcallback.serializer(androidColorSpace_androidKt);
        if (this.getActivityResultRegistry != null) {
            this.getLastCustomNonConfigurationInstance.write.serializer(androidColorSpace_androidKt);
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        div7ah8wj8.ensureViewModelStore = false;
        div7ah8wj8.addObserverForBackInvoker = false;
        div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        div7ah8wj8.IconCompatParcelizer(5);
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            FragmentStrictMode.write(this, fragment, i);
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        div7Ah8Wj8 div7ah8wj9 = fragment != null ? fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 : null;
        if (div7ah8wj8 != null && div7ah8wj9 != null && div7ah8wj8 != div7ah8wj9) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Setting ", fragment, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (fragment == null) {
            this.getDefaultViewModelProviderFactory = null;
            this.addOnTrimMemoryListener = null;
        } else if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null || fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            this.getDefaultViewModelProviderFactory = null;
            this.addOnTrimMemoryListener = fragment;
        } else {
            this.getDefaultViewModelProviderFactory = fragment.getViewModelStore;
            this.addOnTrimMemoryListener = null;
        }
        this.addOnPictureInPictureUiStateChangedListener = i;
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this._init_lambda4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.defaultViewModelProviderFactory_delegatelambda0 == null) {
            isEllipse isellipse = parentFragmentManager.PlaybackStateCompat;
            isellipse.getClass();
            intentSender.getClass();
            if (i != -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
            FragmentActivity fragmentActivity = isellipse.read;
            if (fragmentActivity != null) {
                fragmentActivity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        RetryWithDelay retryWithDelay = new RetryWithDelay(intentSender);
        retryWithDelay.serializer(intent2);
        retryWithDelay.serializer(i3, i2);
        IntentSenderRequest intentSenderRequestWrite = retryWithDelay.write();
        parentFragmentManager.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.addLast(new FragmentManager$LaunchedFragmentInfo(this.getViewModelStore, i));
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
        }
        parentFragmentManager.defaultViewModelProviderFactory_delegatelambda0.write(intentSenderRequestWrite);
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.serializer(this);
        return this.onBackPressedDispatcher_delegatelambda00;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.RemoteActionCompatParcelizer(this);
        return this.addOnPictureInPictureUiStateChangedListener;
    }

    public final void initLifecycle() {
        this.addObserverForBackInvoker = new accessregisterComponentCallback(this, true);
        this.addMenuProvider = new getWhite0d7_KjU(new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this)));
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
        if (this.RemoteActionCompatParcelizer.contains(this.MediaMetadataCompat)) {
            return;
        }
        getBottomRightCornerRadiuskKHJgLs getbottomrightcornerradiuskkhjgls = this.MediaMetadataCompat;
        if (this.enterPictureInPictureMode >= 0) {
            getbottomrightcornerradiuskkhjgls.write();
        } else {
            this.RemoteActionCompatParcelizer.add(getbottomrightcornerradiuskkhjgls);
        }
    }

    public void initState() {
        initLifecycle();
        this.onBackPressedInput_delegatelambda0 = this.getViewModelStore;
        this.getViewModelStore = UUID.randomUUID().toString();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        this.onBackPressedDispatcher_delegatelambda010 = false;
        this._init_lambda1 = false;
        this.defaultViewModelProviderFactory_delegatelambda0 = false;
        this.addContentView = false;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getUnspecifiedNHjbRc();
        this._init_lambda4 = null;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 0;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0;
        this.addOnUserLeaveHintListener = null;
        this._init_lambda2 = false;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = false;
    }

    public void performDestroyView() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(1);
        if (this.getActivityResultRegistry != null) {
            toPorterDuffModes9anfk8 toporterduffmodes9anfk8 = this.getLastCustomNonConfigurationInstance;
            toporterduffmodes9anfk8.IconCompatParcelizer();
            if (toporterduffmodes9anfk8.write.RatingCompat.isAtLeast(toColorLong8_81llA.CREATED)) {
                this.getLastCustomNonConfigurationInstance.IconCompatParcelizer(AndroidColorSpace_androidKt.ON_DESTROY);
            }
        }
        this.enterPictureInPictureMode = 1;
        this.serializer = false;
        onDestroyView();
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        NativePaintannotations.serializer(this).RemoteActionCompatParcelizer();
        this.fullyDrawnReporter_delegatelambda00 = false;
    }

    public void performPause() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(5);
        if (this.getActivityResultRegistry != null) {
            this.getLastCustomNonConfigurationInstance.IconCompatParcelizer(AndroidColorSpace_androidKt.ON_PAUSE);
        }
        this.addObserverForBackInvoker.serializer(AndroidColorSpace_androidKt.ON_PAUSE);
        this.enterPictureInPictureMode = 6;
        this.serializer = false;
        onPause();
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performStop() {
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        div7ah8wj8.addObserverForBackInvoker = true;
        div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = true;
        div7ah8wj8.IconCompatParcelizer(4);
        if (this.getActivityResultRegistry != null) {
            this.getLastCustomNonConfigurationInstance.IconCompatParcelizer(AndroidColorSpace_androidKt.ON_STOP);
        }
        this.addObserverForBackInvoker.serializer(AndroidColorSpace_androidKt.ON_STOP);
        this.enterPictureInPictureMode = 4;
        this.serializer = false;
        onStop();
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public final <I, O> onBackPressed registerForActivityResult(onNewIntent onnewintent, getNavigationEventDispatcher getnavigationeventdispatcher) {
        return prepareCallInternal(onnewintent, new RoundRectKt(0, this), getnavigationeventdispatcher);
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.read(this);
        this.onBackPressedDispatcher_delegatelambda00 = z;
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 == null) {
            this.addOnContextAvailableListener = true;
            return;
        }
        getZeroNHjbRc getzeronhjbrc = div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (z) {
            getzeronhjbrc.write(this);
        } else {
            getzeronhjbrc.IconCompatParcelizer(this);
        }
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        gettopleftcornerradiuskkhjgls.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = arrayList;
        gettopleftcornerradiuskkhjgls.ResultReceiver = arrayList2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode.IconCompatParcelizer(this, z);
        if (!this.getFullyDrawnReporter && z && this.enterPictureInPictureMode < 5 && this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null && isAdded() && this.addObserverForBackInvokerlambda0) {
            div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            isSpecifieduvyYCjkannotations isspecifieduvyycjkannotationsIconCompatParcelizer = div7ah8wj8.IconCompatParcelizer(this);
            Fragment fragment = isspecifieduvyycjkannotationsIconCompatParcelizer.RemoteActionCompatParcelizer;
            if (fragment.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                if (div7ah8wj8.MediaSessionCompatResultReceiverWrapper) {
                    div7ah8wj8.MediaSessionCompatToken = true;
                } else {
                    fragment.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
                    isspecifieduvyycjkannotationsIconCompatParcelizer.MediaDescriptionCompat();
                }
            }
        }
        this.getFullyDrawnReporter = z;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.enterPictureInPictureMode < 5 && !z;
        if (this.addOnMultiWindowModeChangedListener != null) {
            this.addOnNewIntentListener = Boolean.valueOf(z);
        }
    }

    public Fragment() {
        this.enterPictureInPictureMode = -1;
        this.getViewModelStore = UUID.randomUUID().toString();
        this.getDefaultViewModelProviderFactory = null;
        this.read = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getUnspecifiedNHjbRc();
        this.getOnBackPressedInput = true;
        this.getFullyDrawnReporter = true;
        this.menuHostHelperlambda0 = new component6kKHJgLs(0, this);
        this.getSavedStateRegistryControllerannotations = toColorLong8_81llA.RESUMED;
        this.getLifecycle = new AndroidGraphicsContext2();
        this.IconCompatParcelizer = new AtomicInteger();
        this.RemoteActionCompatParcelizer = new ArrayList<>();
        this.MediaMetadataCompat = new component7kKHJgLs(this);
        initLifecycle();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) getMaxDimensionannotations.serializer(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new InstantiationException(ff$$ExternalSyntheticOutline0.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException(ff$$ExternalSyntheticOutline0.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(ff$$ExternalSyntheticOutline0.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(ff$$ExternalSyntheticOutline0.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.getViewModelStore + "_rq#" + this.IconCompatParcelizer.getAndIncrement();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null || (bool = gettopleftcornerradiuskkhjgls.write) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null || (bool = gettopleftcornerradiuskkhjgls.IconCompatParcelizer) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final div7Ah8Wj8 getChildFragmentManager() {
        if (this._init_lambda4 != null) {
            return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " has not been attached yet."));
        return null;
    }

    @Override // o.AndroidColorFilter_androidKt
    public setStrokeCapBeK7IIE getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        setStrokeMiterLimit setstrokemiterlimit = new setStrokeMiterLimit(0);
        LinkedHashMap linkedHashMap = setstrokemiterlimit.read;
        if (application != null) {
            linkedHashMap.put(asImageBitmap.IconCompatParcelizer, application);
        }
        linkedHashMap.put(prepareToDraw.read, this);
        linkedHashMap.put(prepareToDraw.write, this);
        if (getArguments() != null) {
            linkedHashMap.put(prepareToDraw.RemoteActionCompatParcelizer, getArguments());
        }
        return setstrokemiterlimit;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        isEllipse isellipse = this._init_lambda4;
        if (isellipse == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        FragmentActivity fragmentActivity = ((RoundRectZAM2FJodefault) isellipse).write;
        LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        layoutInflaterCloneInContext.setFactory2(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        return layoutInflaterCloneInContext;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        return (gettopleftcornerradiuskkhjgls == null || (arrayList = gettopleftcornerradiuskkhjgls.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        return (gettopleftcornerradiuskkhjgls == null || (arrayList = gettopleftcornerradiuskkhjgls.ResultReceiver) == null) ? new ArrayList<>() : arrayList;
    }

    public final boolean isAdded() {
        return this._init_lambda4 != null && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final boolean isHidden() {
        if (this._init_lambda2) {
            return true;
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 == null) {
            return false;
        }
        Fragment fragment = this.fullyDrawnReporter_delegatelambda0;
        div7ah8wj8.getClass();
        return fragment != null && fragment.isHidden();
    }

    public final boolean isMenuVisible() {
        Fragment fragment;
        if (this.getOnBackPressedInput) {
            return this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null || (fragment = this.fullyDrawnReporter_delegatelambda0) == null || fragment.isMenuVisible();
        }
        return false;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this._init_lambda2) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(menuItem);
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.ensureViewModelStore = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this._init_lambda2) {
            return false;
        }
        if (this.accessensureViewModelStore && this.getOnBackPressedInput && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this._init_lambda2) {
            return;
        }
        if (this.accessensureViewModelStore && this.getOnBackPressedInput) {
            onOptionsMenuClosed(menu);
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(menu);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this._init_lambda4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager._init_lambda4 == null) {
            parentFragmentManager.PlaybackStateCompat.getClass();
            strArr.getClass();
        } else {
            parentFragmentManager.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.addLast(new FragmentManager$LaunchedFragmentInfo(this.getViewModelStore, i));
            parentFragmentManager._init_lambda4.write(strArr);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.addOnPictureInPictureModeChangedListener;
        if (sparseArray != null) {
            this.getActivityResultRegistry.restoreHierarchyState(sparseArray);
            this.addOnPictureInPictureModeChangedListener = null;
        }
        this.serializer = false;
        onViewStateRestored(bundle);
        if (!this.serializer) {
            throw new SuperNotCalledException(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.getActivityResultRegistry != null) {
            this.getLastCustomNonConfigurationInstance.IconCompatParcelizer(AndroidColorSpace_androidKt.ON_CREATE);
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null || !isStateSaved()) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = bundle;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(accessinvalidateNodes accessinvalidatenodes) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().read = obj;
    }

    public void setExitSharedElementCallback(accessinvalidateNodes accessinvalidatenodes) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().RatingCompat = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().MediaSessionCompatQueueItem = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.accessensureViewModelStore != z) {
            this.accessensureViewModelStore = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((RoundRectZAM2FJodefault) this._init_lambda4).write.invalidateMenu();
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.getOnBackPressedInput != z) {
            this.getOnBackPressedInput = z;
            if (this.accessensureViewModelStore && isAdded() && !isHidden()) {
                ((RoundRectZAM2FJodefault) this._init_lambda4).write.invalidateMenu();
            }
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().ParcelableVolumeInfo = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().PlaybackStateCompatCustomAction = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().PlaybackStateCompat = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().r8lambda54BeH8ZsBru0CXI2CCSP2syNys = obj;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        isEllipse isellipse = this._init_lambda4;
        if (isellipse != null) {
            return getOnFocusChanged.serializer(((RoundRectZAM2FJodefault) isellipse).write, str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        isEllipse isellipse = this._init_lambda4;
        if (isellipse == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            isellipse.RemoteActionCompatParcelizer.startActivity(intent, bundle);
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this._init_lambda4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.createFullyDrawnExecutor != null) {
            parentFragmentManager.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.addLast(new FragmentManager$LaunchedFragmentInfo(this.getViewModelStore, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.createFullyDrawnExecutor.write(intent);
            return;
        }
        isEllipse isellipse = parentFragmentManager.PlaybackStateCompat;
        isellipse.getClass();
        intent.getClass();
        if (i == -1) {
            isellipse.RemoteActionCompatParcelizer.startActivity(intent, bundle);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public void startPostponedEnterTransition() {
        if (this.ComponentActivity == null || !ensureAnimationInfo().RemoteActionCompatParcelizer) {
            return;
        }
        int i = 0;
        if (this._init_lambda4 == null) {
            ensureAnimationInfo().RemoteActionCompatParcelizer = false;
        } else if (Looper.myLooper() != this._init_lambda4.serializer.getLooper()) {
            this._init_lambda4.serializer.postAtFrontOfQueue(new AnonymousClass3(i, this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Fields.SpotShadowColor);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.getViewModelStore);
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw));
        }
        if (this.addOnUserLeaveHintListener != null) {
            sb.append(" tag=");
            sb.append(this.addOnUserLeaveHintListener);
        }
        sb.append(")");
        return sb.toString();
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        div7Ah8Wj8 div7ah8wj8;
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls != null) {
            gettopleftcornerradiuskkhjgls.RemoteActionCompatParcelizer = false;
        }
        if (this.getActivityResultRegistry == null || (viewGroup = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) == null || (div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) == null) {
            return;
        }
        isFiniteannotations isfiniteannotations = isFiniteannotations.read(viewGroup, div7ah8wj8);
        isfiniteannotations.serializer();
        if (z) {
            this._init_lambda4.serializer.post(new AnonymousClass3(2, isfiniteannotations));
        } else {
            isfiniteannotations.write();
        }
        Handler handler = this.onBackPressedDispatcher_delegatelambda0;
        if (handler != null) {
            handler.removeCallbacks(this.menuHostHelperlambda0);
            this.onBackPressedDispatcher_delegatelambda0 = null;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg));
        printWriter.print(" mTag=");
        printWriter.println(this.addOnUserLeaveHintListener);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.enterPictureInPictureMode);
        printWriter.print(" mWho=");
        printWriter.print(this.getViewModelStore);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        printWriter.print(" mRemoving=");
        printWriter.print(this.onBackPressedDispatcher_delegatelambda010);
        printWriter.print(" mFromLayout=");
        printWriter.print(this._init_lambda1);
        printWriter.print(" mInLayout=");
        printWriter.println(this.defaultViewModelProviderFactory_delegatelambda0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this._init_lambda2);
        printWriter.print(" mDetached=");
        printWriter.print(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.getOnBackPressedInput);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.accessensureViewModelStore);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.onBackPressedDispatcher_delegatelambda00);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.getFullyDrawnReporter);
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        if (this._init_lambda4 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this._init_lambda4);
        }
        if (this.fullyDrawnReporter_delegatelambda0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.fullyDrawnReporter_delegatelambda0);
        }
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
        if (this.addOnMultiWindowModeChangedListener != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.addOnMultiWindowModeChangedListener);
        }
        if (this.addOnPictureInPictureModeChangedListener != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.addOnPictureInPictureModeChangedListener);
        }
        if (this.addOnConfigurationChangedListener != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.addOnConfigurationChangedListener);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.addOnPictureInPictureUiStateChangedListener);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
        if (this.getActivityResultRegistry != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.getActivityResultRegistry);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            NativePaintannotations.serializer(this).IconCompatParcelizer(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + ":");
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, "  "), fileDescriptor, printWriter, strArr);
    }

    @Override // o.AndroidColorFilter_androidKt
    public createImageBitmap getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new ActualImageBitmapx__hDU(application, this, getArguments());
        }
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    @Override // o.asFrameworkPaint
    public getFilterQualityfv9h1I getViewModelStore() {
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't access ViewModels from detached fragment");
            return null;
        }
        if (getMinimumMaxLifecycleState() == toColorLong8_81llA.INITIALIZED.ordinal()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaBrowserCompatMediaItem;
        getFilterQualityfv9h1I getfilterqualityfv9h1i = (getFilterQualityfv9h1I) map.get(this.getViewModelStore);
        if (getfilterqualityfv9h1i != null) {
            return getfilterqualityfv9h1i;
        }
        getFilterQualityfv9h1I getfilterqualityfv9h1i2 = new getFilterQualityfv9h1I();
        map.put(this.getViewModelStore, getfilterqualityfv9h1i2);
        return getfilterqualityfv9h1i2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.write;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this._init_lambda2) {
            return false;
        }
        if (this.accessensureViewModelStore && this.getOnBackPressedInput) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(menu, menuInflater) | z;
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this._init_lambda2) {
            return false;
        }
        if (this.accessensureViewModelStore && this.getOnBackPressedInput) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer(menu) | z;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().RemoteActionCompatParcelizer = true;
        Handler handler = this.onBackPressedDispatcher_delegatelambda0;
        if (handler != null) {
            handler.removeCallbacks(this.menuHostHelperlambda0);
        }
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 != null) {
            this.onBackPressedDispatcher_delegatelambda0 = div7ah8wj8.PlaybackStateCompat.serializer;
        } else {
            this.onBackPressedDispatcher_delegatelambda0 = new Handler(Looper.getMainLooper());
        }
        this.onBackPressedDispatcher_delegatelambda0.removeCallbacks(this.menuHostHelperlambda0);
        this.onBackPressedDispatcher_delegatelambda0.postDelayed(this.menuHostHelperlambda0, timeUnit.toMillis(j));
    }

    public void setPopDirection(boolean z) {
        if (this.ComponentActivity == null) {
            return;
        }
        ensureAnimationInfo().MediaBrowserCompatMediaItem = z;
    }

    public final getTopLeftCornerRadiuskKHJgLs ensureAnimationInfo() {
        if (this.ComponentActivity == null) {
            getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = new getTopLeftCornerRadiuskKHJgLs();
            gettopleftcornerradiuskkhjgls.read = null;
            Object obj = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            gettopleftcornerradiuskkhjgls.PlaybackStateCompat = obj;
            gettopleftcornerradiuskkhjgls.RatingCompat = null;
            gettopleftcornerradiuskkhjgls.PlaybackStateCompatCustomAction = obj;
            gettopleftcornerradiuskkhjgls.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            gettopleftcornerradiuskkhjgls.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = obj;
            gettopleftcornerradiuskkhjgls.ParcelableVolumeInfo = 1.0f;
            gettopleftcornerradiuskkhjgls.MediaSessionCompatQueueItem = null;
            this.ComponentActivity = gettopleftcornerradiuskkhjgls;
        }
        return this.ComponentActivity;
    }

    public final FragmentActivity getActivity() {
        isEllipse isellipse = this._init_lambda4;
        if (isellipse == null) {
            return null;
        }
        return isellipse.read;
    }

    public View getAnimatingAway() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        gettopleftcornerradiuskkhjgls.getClass();
        return null;
    }

    public Context getContext() {
        isEllipse isellipse = this._init_lambda4;
        if (isellipse == null) {
            return null;
        }
        return isellipse.RemoteActionCompatParcelizer;
    }

    public int getEnterAnim() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return 0;
        }
        return gettopleftcornerradiuskkhjgls.serializer;
    }

    public Object getEnterTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        return gettopleftcornerradiuskkhjgls.read;
    }

    public accessinvalidateNodes getEnterTransitionCallback() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        gettopleftcornerradiuskkhjgls.getClass();
        return null;
    }

    public int getExitAnim() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return 0;
        }
        return gettopleftcornerradiuskkhjgls.MediaDescriptionCompat;
    }

    public Object getExitTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        return gettopleftcornerradiuskkhjgls.RatingCompat;
    }

    public accessinvalidateNodes getExitTransitionCallback() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        gettopleftcornerradiuskkhjgls.getClass();
        return null;
    }

    public View getFocusedView() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        return gettopleftcornerradiuskkhjgls.MediaSessionCompatQueueItem;
    }

    public final Object getHost() {
        isEllipse isellipse = this._init_lambda4;
        if (isellipse == null) {
            return null;
        }
        return ((RoundRectZAM2FJodefault) isellipse).write;
    }

    public int getNextTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return 0;
        }
        return gettopleftcornerradiuskkhjgls.MediaMetadataCompat;
    }

    public boolean getPopDirection() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return false;
        }
        return gettopleftcornerradiuskkhjgls.MediaBrowserCompatMediaItem;
    }

    public int getPopEnterAnim() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return 0;
        }
        return gettopleftcornerradiuskkhjgls.MediaSessionCompatResultReceiverWrapper;
    }

    public int getPopExitAnim() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return 0;
        }
        return gettopleftcornerradiuskkhjgls.MediaSessionCompatToken;
    }

    public Object getReenterTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        Object obj = gettopleftcornerradiuskkhjgls.PlaybackStateCompatCustomAction;
        return obj == r8lambda7IJBVrN0sHyidCAZufWEJFc7yY ? getExitTransition() : obj;
    }

    public Object getReturnTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        Object obj = gettopleftcornerradiuskkhjgls.PlaybackStateCompat;
        return obj == r8lambda7IJBVrN0sHyidCAZufWEJFc7yY ? getEnterTransition() : obj;
    }

    public Object getSharedElementEnterTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        return gettopleftcornerradiuskkhjgls.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    public Object getSharedElementReturnTransition() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return null;
        }
        Object obj = gettopleftcornerradiuskkhjgls.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        return obj == r8lambda7IJBVrN0sHyidCAZufWEJFc7yY ? getSharedElementEnterTransition() : obj;
    }

    public boolean isPostponed() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return false;
        }
        return gettopleftcornerradiuskkhjgls.RemoteActionCompatParcelizer;
    }

    public final boolean isStateSaved() {
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 == null) {
            return false;
        }
        return div7ah8wj8.MediaBrowserCompatMediaItem();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.getActivityResultRegistry) == null || view.getWindowToken() == null || this.getActivityResultRegistry.getVisibility() != 0) ? false : true;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        seekAnimationsanimation_core.IconCompatParcelizer(sb, " is not a child Fragment, it is directly attached to ", getContext());
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.addOnMultiWindowModeChangedListener;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(bundle);
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        div7ah8wj8.ensureViewModelStore = false;
        div7ah8wj8.addObserverForBackInvoker = false;
        div7ah8wj8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        div7ah8wj8.IconCompatParcelizer(1);
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Fragment already added");
            return;
        }
        if (savedState == null || (bundle = savedState.read) == null) {
            bundle = null;
        }
        this.addOnMultiWindowModeChangedListener = bundle;
    }

    public float getPostOnViewCreatedAlpha() {
        getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = this.ComponentActivity;
        if (gettopleftcornerradiuskkhjgls == null) {
            return 1.0f;
        }
        return gettopleftcornerradiuskkhjgls.ParcelableVolumeInfo;
    }

    public void performViewCreated() {
        Bundle bundle = this.addOnMultiWindowModeChangedListener;
        onViewCreated(this.getActivityResultRegistry, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(2);
    }

    public final getBottomLeftCornerRadiuskKHJgLs prepareCallInternal(onNewIntent onnewintent, setTextClassifier settextclassifier, getNavigationEventDispatcher getnavigationeventdispatcher) {
        if (this.enterPictureInPictureMode > 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        RoundRectCompanion roundRectCompanion = new RoundRectCompanion(this, settextclassifier, atomicReference, onnewintent, getnavigationeventdispatcher);
        if (this.enterPictureInPictureMode >= 0) {
            roundRectCompanion.write();
        } else {
            this.RemoteActionCompatParcelizer.add(roundRectCompanion);
        }
        return new getBottomLeftCornerRadiuskKHJgLs(atomicReference);
    }

    public void setNextTransition(int i) {
        if (this.ComponentActivity == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.ComponentActivity.MediaMetadataCompat = i;
    }

    public final String getString(int i) {
        int i2 = 2 % 2;
        String string = getResources().getString(i);
        if (!string.startsWith("%('")) {
            return string;
        }
        int i3 = RatingCompat + 49;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(string.substring(3), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = MediaDescriptionCompat + 101;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return strIntern;
    }

    public final CharSequence getText(int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 13;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            getResources().getString(i).startsWith("%('");
            obj.hashCode();
            throw null;
        }
        Resources resources = getResources();
        String string = resources.getString(i);
        if (!string.startsWith("%('")) {
            return string;
        }
        int i4 = MediaDescriptionCompat + 21;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            ((String) objArr[0]).intern();
            boolean z = resources.getText(i) instanceof Spanned;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = new Object[1];
        a(string.substring(3), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        CharSequence text = resources.getText(i);
        if (text instanceof Spanned) {
            SpannableString spannableString = new SpannableString(strIntern);
            TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
            return spannableString;
        }
        int i5 = MediaDescriptionCompat + 119;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        int i6 = 4 % 4;
        return strIntern;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().write = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().IconCompatParcelizer = Boolean.valueOf(z);
    }

    public final div7Ah8Wj8 getParentFragmentManager() {
        div7Ah8Wj8 div7ah8wj8 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 != null) {
            return div7ah8wj8;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final String getString(int i, Object... objArr) {
        Locale locale;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 63;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
            int i5 = MediaDescriptionCompat + 55;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            locale = configuration.locale;
        }
        String string = resources.getString(i);
        if (string.startsWith("%('")) {
            int i7 = RatingCompat + 105;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        return String.format(locale, string, objArr);
    }

    public accessisRenderNodeCompatiblecp getViewLifecycleOwner() {
        toPorterDuffModes9anfk8 toporterduffmodes9anfk8 = this.getLastCustomNonConfigurationInstance;
        if (toporterduffmodes9anfk8 != null) {
            return toporterduffmodes9anfk8;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final <I, O> onBackPressed registerForActivityResult(onNewIntent onnewintent, ActivityResultRegistry activityResultRegistry, getNavigationEventDispatcher getnavigationeventdispatcher) {
        return prepareCallInternal(onnewintent, new RoundRectKt(1, activityResultRegistry), getnavigationeventdispatcher);
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.ComponentActivity == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().serializer = i;
        ensureAnimationInfo().MediaDescriptionCompat = i2;
        ensureAnimationInfo().MediaSessionCompatResultReceiverWrapper = i3;
        ensureAnimationInfo().MediaSessionCompatToken = i4;
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.serializer = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.serializer = true;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ MediaSessionCompatQueueItem);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.ensureViewModelStore;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().RemoteActionCompatParcelizer = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public Fragment(int i) {
        this();
        this.write = i;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    static void MediaSessionCompatQueueItem() {
        MediaSessionCompatQueueItem = (byte) -112;
    }
}
