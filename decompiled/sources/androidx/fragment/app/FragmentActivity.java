package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.AndroidColorSpace_androidKt;
import o.FocusOwnerImplmodifier1;
import o.NativePaintannotations;
import o.RoundRectZAM2FJodefault;
import o.accessinvalidateNodes;
import o.accessregisterComponentCallback;
import o.div7Ah8Wj8;
import o.getHeightimpl;
import o.getOnBackPressedDispatcher;
import o.getUnspecifiedNHjbRc;
import o.isSimple;
import o.toColorLong8_81llA;
import o.toPorterDuffModes9anfk8;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    public static final /* synthetic */ int write = 0;
    boolean IconCompatParcelizer;
    boolean MediaMetadataCompat;
    boolean RemoteActionCompatParcelizer;
    final isSimple read;
    public final accessregisterComponentCallback serializer;

    @Deprecated
    public NativePaintannotations getSupportLoaderManager() {
        return NativePaintannotations.serializer(this);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void setEnterSharedElementCallback(accessinvalidateNodes accessinvalidatenodes) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(accessinvalidateNodes accessinvalidatenodes) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.read.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.read.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        RoundRectZAM2FJodefault roundRectZAM2FJodefault = this.read.write;
        roundRectZAM2FJodefault.IconCompatParcelizer.read(roundRectZAM2FJodefault, roundRectZAM2FJodefault, (Fragment) null);
    }

    private static boolean markState(div7Ah8Wj8 div7ah8wj8, toColorLong8_81llA tocolorlong8_81lla) {
        boolean zMarkState = false;
        for (Fragment fragment : div7ah8wj8.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), tocolorlong8_81lla);
                }
                toPorterDuffModes9anfk8 toporterduffmodes9anfk8 = fragment.getLastCustomNonConfigurationInstance;
                if (toporterduffmodes9anfk8 != null) {
                    toporterduffmodes9anfk8.IconCompatParcelizer();
                    if (toporterduffmodes9anfk8.write.RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                        fragment.getLastCustomNonConfigurationInstance.write.RemoteActionCompatParcelizer(tocolorlong8_81lla);
                        zMarkState = true;
                    }
                }
                if (fragment.addObserverForBackInvoker.RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    fragment.addObserverForBackInvoker.RemoteActionCompatParcelizer(tocolorlong8_81lla);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.read.write.IconCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.onCreateView(view, str, context, attributeSet);
    }

    public div7Ah8Wj8 getSupportFragmentManager() {
        return this.read.write.IconCompatParcelizer;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.read.serializer();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.read.serializer();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        this.read.serializer();
        super.onResume();
        this.IconCompatParcelizer = true;
        this.read.write.IconCompatParcelizer.RemoteActionCompatParcelizer(true);
    }

    public void onResumeFragments() {
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_RESUME);
        getUnspecifiedNHjbRc getunspecifiednhjbrc = this.read.write.IconCompatParcelizer;
        getunspecifiednhjbrc.ensureViewModelStore = false;
        getunspecifiednhjbrc.addObserverForBackInvoker = false;
        getunspecifiednhjbrc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        getunspecifiednhjbrc.IconCompatParcelizer(7);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        this.read.serializer();
        super.onStart();
        this.MediaMetadataCompat = false;
        if (!this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
            getUnspecifiedNHjbRc getunspecifiednhjbrc = this.read.write.IconCompatParcelizer;
            getunspecifiednhjbrc.ensureViewModelStore = false;
            getunspecifiednhjbrc.addObserverForBackInvoker = false;
            getunspecifiednhjbrc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
            getunspecifiednhjbrc.IconCompatParcelizer(4);
        }
        this.read.write.IconCompatParcelizer.RemoteActionCompatParcelizer(true);
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_START);
        getUnspecifiedNHjbRc getunspecifiednhjbrc2 = this.read.write.IconCompatParcelizer;
        getunspecifiednhjbrc2.ensureViewModelStore = false;
        getunspecifiednhjbrc2.addObserverForBackInvoker = false;
        getunspecifiednhjbrc2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        getunspecifiednhjbrc2.IconCompatParcelizer(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.read.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_STOP);
        return new Bundle();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.RemoteActionCompatParcelizer);
            printWriter.print(" mResumed=");
            printWriter.print(this.IconCompatParcelizer);
            printWriter.print(" mStopped=");
            printWriter.print(this.MediaMetadataCompat);
            if (getApplication() != null) {
                NativePaintannotations.serializer(this).IconCompatParcelizer(str2, printWriter);
            }
            this.read.write.IconCompatParcelizer.read(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_CREATE);
        getUnspecifiedNHjbRc getunspecifiednhjbrc = this.read.write.IconCompatParcelizer;
        getunspecifiednhjbrc.ensureViewModelStore = false;
        getunspecifiednhjbrc.addObserverForBackInvoker = false;
        getunspecifiednhjbrc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        getunspecifiednhjbrc.IconCompatParcelizer(1);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.read.write.IconCompatParcelizer.write();
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_DESTROY);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), toColorLong8_81llA.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.IconCompatParcelizer = false;
        this.read.write.IconCompatParcelizer.IconCompatParcelizer(5);
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.MediaMetadataCompat = true;
        markFragmentsCreated();
        getUnspecifiedNHjbRc getunspecifiednhjbrc = this.read.write.IconCompatParcelizer;
        getunspecifiednhjbrc.addObserverForBackInvoker = true;
        getunspecifiednhjbrc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = true;
        getunspecifiednhjbrc.IconCompatParcelizer(4);
        this.serializer.serializer(AndroidColorSpace_androidKt.ON_STOP);
    }

    public FragmentActivity() {
        this.read = new isSimple(new RoundRectZAM2FJodefault(this));
        this.serializer = new accessregisterComponentCallback(this, true);
        this.MediaMetadataCompat = true;
        init();
    }

    private void init() {
        final int i = 1;
        getSavedStateRegistry().RemoteActionCompatParcelizer("android:support:lifecycle", new getHeightimpl(i, this));
        final int i2 = 0;
        addOnConfigurationChangedListener(new FocusOwnerImplmodifier1(this) { // from class: o.RoundRectZAM2FJo
            public final /* synthetic */ androidx.fragment.app.FragmentActivity serializer;

            {
                this.serializer = this;
            }

            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i3 = i2;
                androidx.fragment.app.FragmentActivity fragmentActivity = this.serializer;
                if (i3 != 0) {
                    fragmentActivity.lambda$init$2((Intent) obj);
                } else {
                    fragmentActivity.lambda$init$1((Configuration) obj);
                }
            }
        });
        addOnNewIntentListener(new FocusOwnerImplmodifier1(this) { // from class: o.RoundRectZAM2FJo
            public final /* synthetic */ androidx.fragment.app.FragmentActivity serializer;

            {
                this.serializer = this;
            }

            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i3 = i;
                androidx.fragment.app.FragmentActivity fragmentActivity = this.serializer;
                if (i3 != 0) {
                    fragmentActivity.lambda$init$2((Intent) obj);
                } else {
                    fragmentActivity.lambda$init$1((Configuration) obj);
                }
            }
        });
        addOnContextAvailableListener(new getOnBackPressedDispatcher() { // from class: o.getBoundingRect
            @Override // o.getOnBackPressedDispatcher
            public final void write(androidx.activity.ComponentActivity componentActivity) {
                this.read.lambda$init$3(componentActivity);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.read.write.IconCompatParcelizer.IconCompatParcelizer(menuItem);
        }
        return false;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public FragmentActivity(int i) {
        super(i);
        this.read = new isSimple(new RoundRectZAM2FJodefault(this));
        this.serializer = new accessregisterComponentCallback(this, true);
        this.MediaMetadataCompat = true;
        init();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
