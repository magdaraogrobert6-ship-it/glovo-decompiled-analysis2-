package o;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.stats.zza;
import com.huawei.hms.location.ActivityIdentificationData;
import io.sentry.MovePreviousSession;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class startActivityForResult extends removeOnPictureInPictureModeChangedListener implements IntentSenderRequest, LayoutInflater.Factory2 {
    public boolean ComponentActivity;
    public handleOnBackPressed MediaSessionCompatToken;
    public r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ ParcelableVolumeInfo;
    public onTrimMemory PlaybackStateCompatCustomAction;
    public PopupWindow ResultReceiver;
    public Configuration _init_lambda1;
    public boolean _init_lambda3;
    public OnBackInvokedDispatcher _init_lambda4;
    public boolean accessensureViewModelStore;
    public ComponentDialog[] addContentView;
    public ViewGroup addMenuProvider;
    public boolean addObserverForBackInvoker;
    public boolean addObserverForBackInvokerlambda0;
    public boolean addOnConfigurationChangedListener;
    public ComponentDialog addOnContextAvailableListener;
    public View addOnMultiWindowModeChangedListener;
    public zza addOnNewIntentListener;
    public android.graphics.Rect addOnPictureInPictureModeChangedListener;
    public CharSequence addOnPictureInPictureUiStateChangedListener;
    public int addOnTrimMemoryListener;
    public TextView addOnUserLeaveHintListener;
    public boolean createFullyDrawnExecutor;
    public final Object defaultViewModelProviderFactory_delegatelambda0;
    public int ensureViewModelStore;
    public android.graphics.Rect enterPictureInPictureMode;
    public boolean fullyDrawnReporter_delegatelambda0;
    public final int fullyDrawnReporter_delegatelambda00;
    public boolean getDefaultViewModelCreationExtras;
    public Window getLastCustomNonConfigurationInstance;
    public boolean getOnBackPressedInput;
    public boolean getSavedStateRegistryControllerannotations;
    public r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ onBackPressedDispatcher_delegatelambda0;
    public SystemBarStyleCompanion onBackPressedDispatcher_delegatelambda00;
    public boolean onBackPressedDispatcher_delegatelambda010;
    public boolean onBackPressedInput_delegatelambda0;
    public onKeyDown r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final removeOnMultiWindowModeChangedListener r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public getOnBackPressedDispatcherannotations r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public OnBackInvokedCallback r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public androidx.appcompat.app.AppCompatViewInflater r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public getOnBackPressedDispatcherannotations r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public startIntentSenderForResult r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public onDestroy r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final Context r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public static final processDragGesture MediaSessionCompatResultReceiverWrapper = new processDragGesture(0);
    public static final int[] PlaybackStateCompat = {android.R.attr.windowBackground};
    public static final boolean MediaDescriptionCompat = !"robolectric".equals(Build.FINGERPRINT);
    public getRedirectui _init_lambda2 = null;
    public final MovePreviousSession menuHostHelperlambda0 = new MovePreviousSession(1, this);

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void write() {
        String strRemoteActionCompatParcelizer;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        write(false, true);
        RemoteActionCompatParcelizer();
        Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strRemoteActionCompatParcelizer = null;
            }
            if (strRemoteActionCompatParcelizer != null) {
                onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
                if (ontrimmemory == null) {
                    this._init_lambda3 = true;
                } else {
                    ontrimmemory.serializer(true);
                }
            }
            synchronized (removeOnPictureInPictureModeChangedListener.serializer) {
                removeOnPictureInPictureModeChangedListener.serializer(this);
                removeOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer.add(new java.lang.ref.WeakReference(this));
            }
        }
        this._init_lambda1 = new Configuration(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getResources().getConfiguration());
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void IconCompatParcelizer() {
        if (this.defaultViewModelProviderFactory_delegatelambda0 instanceof Activity) {
            synchronized (removeOnPictureInPictureModeChangedListener.serializer) {
                removeOnPictureInPictureModeChangedListener.serializer(this);
            }
        }
        if (this.fullyDrawnReporter_delegatelambda0) {
            this.getLastCustomNonConfigurationInstance.getDecorView().removeCallbacks(this.menuHostHelperlambda0);
        }
        this.accessensureViewModelStore = true;
        if (this.fullyDrawnReporter_delegatelambda00 != -100) {
            Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                MediaSessionCompatResultReceiverWrapper.put(this.defaultViewModelProviderFactory_delegatelambda0.getClass().getName(), Integer.valueOf(this.fullyDrawnReporter_delegatelambda00));
            } else {
                MediaSessionCompatResultReceiverWrapper.remove(this.defaultViewModelProviderFactory_delegatelambda0.getClass().getName());
            }
        } else {
            MediaSessionCompatResultReceiverWrapper.remove(this.defaultViewModelProviderFactory_delegatelambda0.getClass().getName());
        }
        onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
        if (ontrimmemory != null) {
            ontrimmemory.MediaDescriptionCompat();
        }
        getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (getonbackpresseddispatcherannotations != null) {
            getonbackpresseddispatcherannotations.write();
        }
        getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (getonbackpresseddispatcherannotations2 != null) {
            getonbackpresseddispatcherannotations2.write();
        }
    }

    public final void IconCompatParcelizer(ComponentDialog componentDialog, boolean z) {
        getLifecycleRegistry1 getlifecycleregistry1;
        onDestroy ondestroy;
        if (z && componentDialog.serializer == 0 && (ondestroy = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) != null && ondestroy.MediaSessionCompatQueueItem()) {
            IconCompatParcelizer(componentDialog.ParcelableVolumeInfo);
            return;
        }
        WindowManager windowManager = (WindowManager) this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getSystemService("window");
        if (windowManager != null && componentDialog.MediaSessionCompatQueueItem && (getlifecycleregistry1 = componentDialog.RemoteActionCompatParcelizer) != null) {
            windowManager.removeView(getlifecycleregistry1);
            if (z) {
                write(componentDialog.serializer, componentDialog, null);
            }
        }
        componentDialog.MediaBrowserCompatMediaItem = false;
        componentDialog.RatingCompat = false;
        componentDialog.MediaSessionCompatQueueItem = false;
        componentDialog.PlaybackStateCompat = null;
        componentDialog.MediaSessionCompatToken = true;
        if (this.addOnContextAvailableListener == componentDialog) {
            this.addOnContextAvailableListener = null;
        }
        if (componentDialog.serializer == 0) {
            MediaSessionCompatQueueItem();
        }
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void read(CharSequence charSequence) {
        this.addOnPictureInPictureUiStateChangedListener = charSequence;
        onDestroy ondestroy = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (ondestroy != null) {
            ondestroy.setWindowTitle(charSequence);
            return;
        }
        onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
        if (ontrimmemory != null) {
            ontrimmemory.write(charSequence);
            return;
        }
        TextView textView = this.addOnUserLeaveHintListener;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // o.IntentSenderRequest
    public final boolean read(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        ComponentDialog componentDialog;
        Window.Callback callback = this.getLastCustomNonConfigurationInstance.getCallback();
        if (callback != null && !this.accessensureViewModelStore) {
            AlertControllerButtonHandler alertControllerButtonHandlerIconCompatParcelizer = alertControllerButtonHandler.IconCompatParcelizer();
            ComponentDialog[] componentDialogArr = this.addContentView;
            int length = componentDialogArr != null ? componentDialogArr.length : 0;
            for (int i = 0; i < length; i++) {
                componentDialog = componentDialogArr[i];
                if (componentDialog != null && componentDialog.ParcelableVolumeInfo == alertControllerButtonHandlerIconCompatParcelizer) {
                    if (componentDialog != null) {
                        return callback.onMenuItemSelected(componentDialog.serializer, menuItem);
                    }
                }
            }
            componentDialog = null;
            if (componentDialog != null) {
                return callback.onMenuItemSelected(componentDialog.serializer, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    public final void serializer(Window window) {
        Drawable drawableIconCompatParcelizer;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.getLastCustomNonConfigurationInstance != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof startIntentSenderForResult) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("AppCompat has already installed itself into the Window");
            return;
        }
        startIntentSenderForResult startintentsenderforresult = new startIntentSenderForResult(this, callback);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = startintentsenderforresult;
        window.setCallback(startintentsenderforresult);
        Context context = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, PlaybackStateCompat);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableIconCompatParcelizer = null;
        } else {
            ensureSubDecor ensuresubdecorWrite = ensureSubDecor.write();
            synchronized (ensuresubdecorWrite) {
                drawableIconCompatParcelizer = ensuresubdecorWrite.write.IconCompatParcelizer(context, resourceId, true);
            }
        }
        if (drawableIconCompatParcelizer != null) {
            window.setBackgroundDrawable(drawableIconCompatParcelizer);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.getLastCustomNonConfigurationInstance = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this._init_lambda4) != null) {
            return;
        }
        Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null) {
            reportFullyDrawn.serializer(onBackInvokedDispatcher, onBackInvokedCallback);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this._init_lambda4 = reportFullyDrawn.T_(activity);
            } else {
                this._init_lambda4 = null;
            }
        } else {
            this._init_lambda4 = null;
        }
        MediaSessionCompatQueueItem();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c7, code lost:
    
        if (serializer(r0, r7) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
    
        if (r7 != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean write(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.startActivityForResult.write(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean write(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.accessensureViewModelStore) {
            return false;
        }
        int i2 = this.fullyDrawnReporter_delegatelambda00;
        if (i2 == -100) {
            i2 = removeOnPictureInPictureModeChangedListener.read;
        }
        Context context = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        hasNonInteropFocusableContent hasnoninteropfocusablecontentIconCompatParcelizer = i3 < 33 ? IconCompatParcelizer(context) : null;
        if (!z2 && hasnoninteropfocusablecontentIconCompatParcelizer != null) {
            hasnoninteropfocusablecontentIconCompatParcelizer = setPictureInPictureParams.IconCompatParcelizer(context.getResources().getConfiguration());
        }
        Configuration configurationIconCompatParcelizer = IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, null, false);
        boolean z4 = this.ComponentActivity;
        Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
        boolean z5 = true;
        if (z4 || !(obj instanceof Activity)) {
            this.ComponentActivity = true;
            i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
                }
                this.ComponentActivity = true;
                i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            }
        }
        Configuration configuration = this._init_lambda1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode;
        int i5 = configurationIconCompatParcelizer.uiMode & 48;
        hasNonInteropFocusableContent hasnoninteropfocusablecontentIconCompatParcelizer2 = setPictureInPictureParams.IconCompatParcelizer(configuration);
        hasNonInteropFocusableContent hasnoninteropfocusablecontentIconCompatParcelizer3 = hasnoninteropfocusablecontentIconCompatParcelizer == null ? null : setPictureInPictureParams.IconCompatParcelizer(configurationIconCompatParcelizer);
        int i6 = (i4 & 48) != i5 ? androidx.compose.ui.graphics.Fields.RotationY : 0;
        if (hasnoninteropfocusablecontentIconCompatParcelizer3 != null && !hasnoninteropfocusablecontentIconCompatParcelizer2.equals(hasnoninteropfocusablecontentIconCompatParcelizer3)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 && ((MediaDescriptionCompat || this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationIconCompatParcelizer.getLayoutDirection());
                }
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (hasnoninteropfocusablecontentIconCompatParcelizer3 != null) {
                setPictureInPictureParams.IconCompatParcelizer(configuration2, hasnoninteropfocusablecontentIconCompatParcelizer3);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.addOnTrimMemoryListener;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.addOnTrimMemoryListener, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof accessisRenderNodeCompatiblecp) {
                    if (((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) activity2).getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ && !this.accessensureViewModelStore) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof androidx.appcompat.app.AppCompatActivity)) {
            if ((i6 & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
                ((androidx.appcompat.app.AppCompatActivity) obj).onNightModeChanged(iRemoteActionCompatParcelizer);
            }
            if ((i6 & 4) != 0) {
                ((androidx.appcompat.app.AppCompatActivity) obj).onLocalesChanged(hasnoninteropfocusablecontentIconCompatParcelizer);
            }
        }
        if (hasnoninteropfocusablecontentIconCompatParcelizer3 != null) {
            setPictureInPictureParams.serializer(setPictureInPictureParams.IconCompatParcelizer(context.getResources().getConfiguration()));
        }
        getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (i2 == 0) {
            if (getonbackpresseddispatcherannotations == null) {
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new getOnBackPressedDispatcherannotations(this, androidx.navigation.NavArgsLazy.write(context));
            }
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.RemoteActionCompatParcelizer();
        } else if (getonbackpresseddispatcherannotations != null) {
            getonbackpresseddispatcherannotations.write();
        }
        getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (i2 == 3) {
            if (getonbackpresseddispatcherannotations2 == null) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getOnBackPressedDispatcherannotations(this, context);
            }
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer();
        } else if (getonbackpresseddispatcherannotations2 != null) {
            getonbackpresseddispatcherannotations2.write();
        }
        return z5;
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final handleOnBackPressed IconCompatParcelizer(handleOnBackStarted handleonbackstarted) {
        handleOnBackPressed handleonbackpressedOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (handleonbackstarted != null) {
            handleOnBackPressed handleonbackpressed = this.MediaSessionCompatToken;
            if (handleonbackpressed != null) {
                handleonbackpressed.RemoteActionCompatParcelizer();
            }
            accessgetGreencp accessgetgreencp = new accessgetGreencp(this, handleonbackstarted);
            serializer();
            onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
            removeOnMultiWindowModeChangedListener removeonmultiwindowmodechangedlistener = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (ontrimmemory != null) {
                handleOnBackPressed handleonbackpressedWrite = ontrimmemory.write(accessgetgreencp);
                this.MediaSessionCompatToken = handleonbackpressedWrite;
                if (handleonbackpressedWrite != null) {
                    removeonmultiwindowmodechangedlistener.onSupportActionModeStarted(handleonbackpressedWrite);
                }
            }
            if (this.MediaSessionCompatToken == null) {
                getRedirectui getredirectui = this._init_lambda2;
                if (getredirectui != null) {
                    getredirectui.serializer();
                }
                handleOnBackPressed handleonbackpressed2 = this.MediaSessionCompatToken;
                if (handleonbackpressed2 != null) {
                    handleonbackpressed2.RemoteActionCompatParcelizer();
                }
                if (this.accessensureViewModelStore) {
                    handleonbackpressedOnWindowStartingSupportActionMode = null;
                } else {
                    try {
                        handleonbackpressedOnWindowStartingSupportActionMode = removeonmultiwindowmodechangedlistener.onWindowStartingSupportActionMode(accessgetgreencp);
                    } catch (AbstractMethodError unused) {
                        handleonbackpressedOnWindowStartingSupportActionMode = null;
                    }
                }
                if (handleonbackpressedOnWindowStartingSupportActionMode != null) {
                    this.MediaSessionCompatToken = handleonbackpressedOnWindowStartingSupportActionMode;
                } else {
                    int i = 0;
                    int i2 = 1;
                    if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                        boolean z = this.getSavedStateRegistryControllerannotations;
                        Context context = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                getIndexOfFirstFeature getindexoffirstfeature = new getIndexOfFirstFeature(context, 0);
                                getindexoffirstfeature.getTheme().setTo(themeNewTheme);
                                context = getindexoffirstfeature;
                            }
                            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new onKeyDown(context);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.logistics.rider.glovo.R.attr.actionModePopupWindowStyle);
                            this.ResultReceiver = popupWindow;
                            fetchCustomExitaToIllAui.write(popupWindow);
                            this.ResultReceiver.setContentView(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                            this.ResultReceiver.setWidth(-1);
                            context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarSize, typedValue, true);
                            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.ResultReceiver.setHeight(-2);
                            this.addOnNewIntentListener = new zza(i2, this);
                        } else {
                            getSupportCheckMarkTintList getsupportcheckmarktintlist = (getSupportCheckMarkTintList) this.addMenuProvider.findViewById(com.logistics.rider.glovo.R.id.action_mode_bar_stub);
                            if (getsupportcheckmarktintlist != null) {
                                serializer();
                                onTrimMemory ontrimmemory2 = this.PlaybackStateCompatCustomAction;
                                Context context2 = ontrimmemory2 != null ? ontrimmemory2.read() : null;
                                if (context2 != null) {
                                    context = context2;
                                }
                                getsupportcheckmarktintlist.setLayoutInflater(LayoutInflater.from(context));
                                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (onKeyDown) getsupportcheckmarktintlist.IconCompatParcelizer();
                            }
                        }
                    }
                    if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                        getRedirectui getredirectui2 = this._init_lambda2;
                        if (getredirectui2 != null) {
                            getredirectui2.serializer();
                        }
                        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read();
                        removeCloseableactivity removecloseableactivity = new removeCloseableactivity(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getContext(), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, accessgetgreencp);
                        if (accessgetgreencp.read(removecloseableactivity, removecloseableactivity.read())) {
                            removecloseableactivity.MediaBrowserCompatMediaItem();
                            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(removecloseableactivity);
                            this.MediaSessionCompatToken = removecloseableactivity;
                            i2 = (this.addOnConfigurationChangedListener && (viewGroup = this.addMenuProvider) != null && viewGroup.isLaidOut()) ? 1 : 0;
                            onKeyDown onkeydown = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            if (i2 != 0) {
                                onkeydown.setAlpha(0.0f);
                                getRedirectui getredirectuiWrite = FocusPropertiesNode.write(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                getredirectuiWrite.RemoteActionCompatParcelizer(1.0f);
                                this._init_lambda2 = getredirectuiWrite;
                                getredirectuiWrite.IconCompatParcelizer(new removeOnUserLeaveHintListener(i, this));
                            } else {
                                onkeydown.setAlpha(1.0f);
                                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(0);
                                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getParent() instanceof View) {
                                    View view = (View) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getParent();
                                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                                    view.requestApplyInsets();
                                }
                            }
                            if (this.ResultReceiver != null) {
                                this.getLastCustomNonConfigurationInstance.getDecorView().post(this.addOnNewIntentListener);
                            }
                        } else {
                            this.MediaSessionCompatToken = null;
                        }
                    }
                }
                handleOnBackPressed handleonbackpressed3 = this.MediaSessionCompatToken;
                if (handleonbackpressed3 != null) {
                    removeonmultiwindowmodechangedlistener.onSupportActionModeStarted(handleonbackpressed3);
                }
                MediaSessionCompatQueueItem();
                this.MediaSessionCompatToken = this.MediaSessionCompatToken;
            }
            MediaSessionCompatQueueItem();
            return this.MediaSessionCompatToken;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActionMode callback can not be null.");
        return null;
    }

    public final boolean MediaDescriptionCompat() {
        boolean z = this.getOnBackPressedInput;
        this.getOnBackPressedInput = false;
        ComponentDialog componentDialogWrite = write(0);
        if (!componentDialogWrite.MediaSessionCompatQueueItem) {
            handleOnBackPressed handleonbackpressed = this.MediaSessionCompatToken;
            if (handleonbackpressed != null) {
                handleonbackpressed.RemoteActionCompatParcelizer();
                return true;
            }
            serializer();
            onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
            if (ontrimmemory == null || !ontrimmemory.RemoteActionCompatParcelizer()) {
                return false;
            }
        } else if (!z) {
            IconCompatParcelizer(componentDialogWrite, true);
            return true;
        }
        return true;
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void RemoteActionCompatParcelizer(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.addMenuProvider.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0).inflate(i, viewGroup);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(this.getLastCustomNonConfigurationInstance.getCallback());
    }

    public final void serializer() {
        ensureSubDecor();
        if (this.createFullyDrawnExecutor && this.PlaybackStateCompatCustomAction == null) {
            Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
            if (obj instanceof Activity) {
                this.PlaybackStateCompatCustomAction = new run((Activity) obj, this.onBackPressedDispatcher_delegatelambda010);
            } else if (obj instanceof android.app.Dialog) {
                this.PlaybackStateCompatCustomAction = new run((android.app.Dialog) obj);
            }
            onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
            if (ontrimmemory != null) {
                ontrimmemory.serializer(this._init_lambda3);
            }
        }
    }

    public startActivityForResult(Context context, Window window, removeOnMultiWindowModeChangedListener removeonmultiwindowmodechangedlistener, Object obj) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
        this.fullyDrawnReporter_delegatelambda00 = -100;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = context;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = removeonmultiwindowmodechangedlistener;
        this.defaultViewModelProviderFactory_delegatelambda0 = obj;
        if (obj instanceof android.app.Dialog) {
            while (context != null) {
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.fullyDrawnReporter_delegatelambda00 = ((startActivityForResult) appCompatActivity.getDelegate()).fullyDrawnReporter_delegatelambda00;
            }
        }
        if (this.fullyDrawnReporter_delegatelambda00 == -100) {
            String name = this.defaultViewModelProviderFactory_delegatelambda0.getClass().getName();
            processDragGesture processdraggesture = MediaSessionCompatResultReceiverWrapper;
            Integer num = (Integer) processdraggesture.get(name);
            if (num != null) {
                this.fullyDrawnReporter_delegatelambda00 = num.intValue();
                processdraggesture.remove(this.defaultViewModelProviderFactory_delegatelambda0.getClass().getName());
            }
        }
        if (window != null) {
            serializer(window);
        }
        ensureSubDecor.read();
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public final void IconCompatParcelizer(ComponentDialog componentDialog, android.view.KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = componentDialog.MediaSessionCompatQueueItem;
        int i2 = componentDialog.serializer;
        if (z || this.accessensureViewModelStore) {
            return;
        }
        Context context = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.getLastCustomNonConfigurationInstance.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, componentDialog.ParcelableVolumeInfo)) {
            IconCompatParcelizer(componentDialog, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && serializer(componentDialog, keyEvent)) {
            getLifecycleRegistry1 getlifecycleregistry1 = componentDialog.RemoteActionCompatParcelizer;
            int i3 = 0;
            if (getlifecycleregistry1 != null && !componentDialog.MediaSessionCompatToken) {
                View view = componentDialog.read;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                componentDialog.RatingCompat = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = componentDialog.MediaDescriptionCompat;
                layoutParams2.windowAnimations = componentDialog.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                windowManager.addView(componentDialog.RemoteActionCompatParcelizer, layoutParams2);
                componentDialog.MediaSessionCompatQueueItem = true;
                if (i2 == 0) {
                    MediaSessionCompatQueueItem();
                }
            }
            if (getlifecycleregistry1 == null) {
                serializer();
                onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
                Context context2 = ontrimmemory != null ? ontrimmemory.read() : null;
                if (context2 != null) {
                    context = context2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarPopupTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                }
                themeNewTheme.resolveAttribute(com.logistics.rider.glovo.R.attr.panelMenuListTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    themeNewTheme.applyStyle(i5, true);
                } else {
                    themeNewTheme.applyStyle(com.logistics.rider.glovo.R.style.Theme_AppCompat_CompactMenu, true);
                }
                getIndexOfFirstFeature getindexoffirstfeature = new getIndexOfFirstFeature(context, 0);
                getindexoffirstfeature.getTheme().setTo(themeNewTheme);
                componentDialog.MediaSessionCompatResultReceiverWrapper = getindexoffirstfeature;
                TypedArray typedArrayObtainStyledAttributes = getindexoffirstfeature.obtainStyledAttributes(onUserLeaveHint.AppCompatTheme);
                componentDialog.write = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                componentDialog.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                componentDialog.RemoteActionCompatParcelizer = new getLifecycleRegistry1(this, componentDialog.MediaSessionCompatResultReceiverWrapper);
                componentDialog.MediaDescriptionCompat = 81;
            } else if (componentDialog.MediaSessionCompatToken && getlifecycleregistry1.getChildCount() > 0) {
                componentDialog.RemoteActionCompatParcelizer.removeAllViews();
            }
            View view2 = componentDialog.read;
            if (view2 != null) {
                componentDialog.PlaybackStateCompat = view2;
            } else {
                if (componentDialog.ParcelableVolumeInfo != null) {
                    if (this.onBackPressedDispatcher_delegatelambda0 == null) {
                        this.onBackPressedDispatcher_delegatelambda0 = new r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ(this, i3);
                    }
                    r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ r8lambdaxxpmzzi8fnpm2sjja30vct2mbcq = this.onBackPressedDispatcher_delegatelambda0;
                    if (componentDialog.MediaMetadataCompat == null) {
                        register registerVar = new register(componentDialog.MediaSessionCompatResultReceiverWrapper);
                        componentDialog.MediaMetadataCompat = registerVar;
                        registerVar.read(r8lambdaxxpmzzi8fnpm2sjja30vct2mbcq);
                        componentDialog.ParcelableVolumeInfo.RemoteActionCompatParcelizer(componentDialog.MediaMetadataCompat);
                    }
                    View view3 = (View) componentDialog.MediaMetadataCompat.RemoteActionCompatParcelizer(componentDialog.RemoteActionCompatParcelizer);
                    componentDialog.PlaybackStateCompat = view3;
                    if (view3 != null) {
                    }
                }
                componentDialog.MediaSessionCompatToken = true;
                return;
            }
            if (componentDialog.PlaybackStateCompat != null && (componentDialog.read != null || componentDialog.MediaMetadataCompat.IconCompatParcelizer().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = componentDialog.PlaybackStateCompat.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                componentDialog.RemoteActionCompatParcelizer.setBackgroundResource(componentDialog.write);
                ViewParent parent = componentDialog.PlaybackStateCompat.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(componentDialog.PlaybackStateCompat);
                }
                componentDialog.RemoteActionCompatParcelizer.addView(componentDialog.PlaybackStateCompat, layoutParams3);
                if (!componentDialog.PlaybackStateCompat.hasFocus()) {
                    componentDialog.PlaybackStateCompat.requestFocus();
                }
            }
            componentDialog.MediaSessionCompatToken = true;
            return;
            i = -2;
            componentDialog.RatingCompat = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = componentDialog.MediaDescriptionCompat;
            layoutParams4.windowAnimations = componentDialog.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            windowManager.addView(componentDialog.RemoteActionCompatParcelizer, layoutParams4);
            componentDialog.MediaSessionCompatQueueItem = true;
            if (i2 == 0) {
                MediaSessionCompatQueueItem();
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.getLastCustomNonConfigurationInstance == null) {
            Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
            if (obj instanceof Activity) {
                serializer(((Activity) obj).getWindow());
            }
        }
        if (this.getLastCustomNonConfigurationInstance != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("We have not been given a Window");
    }

    public final void ensureSubDecor() {
        ViewGroup viewGroup;
        if (this.addOnConfigurationChangedListener) {
            return;
        }
        Context context = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int[] iArr = onUserLeaveHint.AppCompatTheme;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            serializer(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            serializer(ActivityIdentificationData.RUNNING);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            serializer(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            serializer(10);
        }
        this.getSavedStateRegistryControllerannotations = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        RemoteActionCompatParcelizer();
        this.getLastCustomNonConfigurationInstance.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = 2;
        if (this.getDefaultViewModelCreationExtras) {
            viewGroup = this.onBackPressedInput_delegatelambda0 ? (ViewGroup) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.getSavedStateRegistryControllerannotations) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.onBackPressedDispatcher_delegatelambda010 = false;
            this.createFullyDrawnExecutor = false;
        } else if (this.createFullyDrawnExecutor) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new getIndexOfFirstFeature(context, typedValue.resourceId) : context).inflate(com.logistics.rider.glovo.R.layout.abc_screen_toolbar, (ViewGroup) null);
            onDestroy ondestroy = (onDestroy) viewGroup.findViewById(com.logistics.rider.glovo.R.id.decor_content_parent);
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = ondestroy;
            ondestroy.setWindowCallback(this.getLastCustomNonConfigurationInstance.getCallback());
            if (this.onBackPressedDispatcher_delegatelambda010) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read(109);
            }
            if (this.addObserverForBackInvokerlambda0) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read(2);
            }
            if (this.addObserverForBackInvoker) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.createFullyDrawnExecutor);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.onBackPressedDispatcher_delegatelambda010);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.getSavedStateRegistryControllerannotations);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.onBackPressedInput_delegatelambda0);
            sb.append(", windowNoTitle: ");
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(sb, this.getDefaultViewModelCreationExtras, " }"));
            return;
        }
        coil3.memory.MemoryCacheService memoryCacheService = new coil3.memory.MemoryCacheService(this);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessgetCancelcp.write(viewGroup, memoryCacheService);
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
            this.addOnUserLeaveHintListener = (TextView) viewGroup.findViewById(com.logistics.rider.glovo.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        setContentHeight setcontentheight = (setContentHeight) viewGroup.findViewById(com.logistics.rider.glovo.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.getLastCustomNonConfigurationInstance.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                setcontentheight.addView(childAt);
            }
            viewGroup2.setId(-1);
            setcontentheight.setId(android.R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.getLastCustomNonConfigurationInstance.setContentView(viewGroup);
        setcontentheight.setAttachListener(new Extras$Key(i, this));
        this.addMenuProvider = viewGroup;
        Object obj = this.defaultViewModelProviderFactory_delegatelambda0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.addOnPictureInPictureUiStateChangedListener;
        if (!TextUtils.isEmpty(title)) {
            onDestroy ondestroy2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (ondestroy2 != null) {
                ondestroy2.setWindowTitle(title);
            } else {
                onTrimMemory ontrimmemory = this.PlaybackStateCompatCustomAction;
                if (ontrimmemory != null) {
                    ontrimmemory.write(title);
                } else {
                    TextView textView = this.addOnUserLeaveHintListener;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        setContentHeight setcontentheight2 = (setContentHeight) this.addMenuProvider.findViewById(android.R.id.content);
        View decorView = this.getLastCustomNonConfigurationInstance.getDecorView();
        setcontentheight2.write.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (setcontentheight2.isLaidOut()) {
            setcontentheight2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, setcontentheight2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, setcontentheight2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, setcontentheight2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, setcontentheight2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, setcontentheight2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, setcontentheight2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        setcontentheight2.requestLayout();
        this.addOnConfigurationChangedListener = true;
        ComponentDialog componentDialogWrite = write(0);
        if (this.accessensureViewModelStore || componentDialogWrite.ParcelableVolumeInfo != null) {
            return;
        }
        MediaDescriptionCompat(ActivityIdentificationData.RUNNING);
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void read() {
        if (this.PlaybackStateCompatCustomAction != null) {
            serializer();
            if (this.PlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem()) {
                return;
            }
            MediaDescriptionCompat(0);
        }
    }

    public final void read(int i) {
        ComponentDialog componentDialogWrite = write(i);
        if (componentDialogWrite.ParcelableVolumeInfo != null) {
            Bundle bundle = new Bundle();
            componentDialogWrite.ParcelableVolumeInfo.RemoteActionCompatParcelizer(bundle);
            if (bundle.size() > 0) {
                componentDialogWrite.IconCompatParcelizer = bundle;
            }
            componentDialogWrite.ParcelableVolumeInfo.MediaDescriptionCompat();
            componentDialogWrite.ParcelableVolumeInfo.clear();
        }
        componentDialogWrite.PlaybackStateCompatCustomAction = true;
        componentDialogWrite.MediaSessionCompatToken = true;
        if ((i == 108 || i == 0) && this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
            ComponentDialog componentDialogWrite2 = write(0);
            componentDialogWrite2.MediaBrowserCompatMediaItem = false;
            serializer(componentDialogWrite2, (android.view.KeyEvent) null);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View setexpandedformat;
        View view2 = null;
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
            int[] iArr = onUserLeaveHint.AppCompatTheme;
            Context context2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new androidx.appcompat.app.AppCompatViewInflater();
            } else {
                try {
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = (androidx.appcompat.app.AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new androidx.appcompat.app.AppCompatViewInflater();
                }
            }
        }
        androidx.appcompat.app.AppCompatViewInflater appCompatViewInflater = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i = setSupportAllCaps.RemoteActionCompatParcelizer;
        appCompatViewInflater.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.View, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context getindexoffirstfeature = (resourceId == 0 || ((context instanceof getIndexOfFirstFeature) && ((getIndexOfFirstFeature) context).MediaDescriptionCompat == resourceId)) ? context : new getIndexOfFirstFeature(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                setexpandedformat = new setExpandedFormat(getindexoffirstfeature, attributeSet);
                break;
            case 1:
                setexpandedformat = new onCreateView(getindexoffirstfeature, attributeSet);
                break;
            case 2:
                setexpandedformat = new getItemData(getindexoffirstfeature, attributeSet);
                break;
            case 3:
                setexpandedformat = appCompatViewInflater.RemoteActionCompatParcelizer(getindexoffirstfeature, attributeSet);
                break;
            case 4:
                setexpandedformat = new WindowCallbackWrapper(getindexoffirstfeature, attributeSet);
                break;
            case 5:
                setexpandedformat = new getWindowAnimations(getindexoffirstfeature, attributeSet);
                break;
            case 6:
                setexpandedformat = new androidx.appcompat.widget.AppCompatSpinner(getindexoffirstfeature, attributeSet);
                break;
            case 7:
                setexpandedformat = appCompatViewInflater.IconCompatParcelizer(getindexoffirstfeature, attributeSet);
                break;
            case 8:
                setexpandedformat = new setCustomView(getindexoffirstfeature, attributeSet);
                break;
            case 9:
                setexpandedformat = new androidx.appcompat.widget.AppCompatImageView(getindexoffirstfeature, attributeSet);
                break;
            case 10:
                setexpandedformat = appCompatViewInflater.write(getindexoffirstfeature, attributeSet);
                break;
            case 11:
                setexpandedformat = appCompatViewInflater.serializer(getindexoffirstfeature, attributeSet);
                break;
            case 12:
                setexpandedformat = new AppCompatDialogFragment(getindexoffirstfeature, attributeSet);
                break;
            case 13:
                setexpandedformat = appCompatViewInflater.read(getindexoffirstfeature, attributeSet);
                break;
            default:
                setexpandedformat = null;
                break;
        }
        if (setexpandedformat == null && context != getindexoffirstfeature) {
            Object[] objArr = appCompatViewInflater.MediaSessionCompatQueueItem;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = getindexoffirstfeature;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = androidx.appcompat.app.AppCompatViewInflater.serializer;
                        if (i2 < 3) {
                            View viewRemoteActionCompatParcelizer = appCompatViewInflater.RemoteActionCompatParcelizer(getindexoffirstfeature, str, strArr[i2]);
                            if (viewRemoteActionCompatParcelizer != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewRemoteActionCompatParcelizer;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewRemoteActionCompatParcelizer2 = appCompatViewInflater.RemoteActionCompatParcelizer(getindexoffirstfeature, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewRemoteActionCompatParcelizer2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            setexpandedformat = view2;
        }
        if (setexpandedformat != null) {
            Context context3 = setexpandedformat.getContext();
            if ((context3 instanceof ContextWrapper) && setexpandedformat.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, androidx.appcompat.app.AppCompatViewInflater.MediaMetadataCompat);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    setexpandedformat.setOnClickListener(new onStop(setexpandedformat, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = getindexoffirstfeature.obtainStyledAttributes(attributeSet, androidx.appcompat.app.AppCompatViewInflater.write);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).write(setexpandedformat, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = getindexoffirstfeature.obtainStyledAttributes(attributeSet, androidx.appcompat.app.AppCompatViewInflater.RemoteActionCompatParcelizer);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    FocusPropertiesNode.read(setexpandedformat, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = getindexoffirstfeature.obtainStyledAttributes(attributeSet, androidx.appcompat.app.AppCompatViewInflater.RatingCompat);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                    new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).write(setexpandedformat, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return setexpandedformat;
    }

    public final ComponentDialog write(int i) {
        ComponentDialog[] componentDialogArr = this.addContentView;
        if (componentDialogArr == null || componentDialogArr.length <= i) {
            ComponentDialog[] componentDialogArr2 = new ComponentDialog[i + 1];
            if (componentDialogArr != null) {
                System.arraycopy(componentDialogArr, 0, componentDialogArr2, 0, componentDialogArr.length);
            }
            this.addContentView = componentDialogArr2;
            componentDialogArr = componentDialogArr2;
        }
        ComponentDialog componentDialog = componentDialogArr[i];
        if (componentDialog != null) {
            return componentDialog;
        }
        ComponentDialog componentDialog2 = new ComponentDialog();
        componentDialog2.serializer = i;
        componentDialog2.MediaSessionCompatToken = false;
        componentDialogArr[i] = componentDialog2;
        return componentDialog2;
    }

    public final void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler) {
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            return;
        }
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.IconCompatParcelizer();
        Window.Callback callback = this.getLastCustomNonConfigurationInstance.getCallback();
        if (callback != null && !this.accessensureViewModelStore) {
            callback.onPanelClosed(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
        }
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = false;
    }

    public final void MediaDescriptionCompat(int i) {
        this.ensureViewModelStore = (1 << i) | this.ensureViewModelStore;
        if (this.fullyDrawnReporter_delegatelambda0) {
            return;
        }
        View decorView = this.getLastCustomNonConfigurationInstance.getDecorView();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        decorView.postOnAnimation(this.menuHostHelperlambda0);
        this.fullyDrawnReporter_delegatelambda0 = true;
    }

    public final void MediaSessionCompatQueueItem() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this._init_lambda4 != null && (write(0).MediaSessionCompatQueueItem || this.MediaSessionCompatToken != null)) {
                z = true;
            }
            if (z && this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null) {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = reportFullyDrawn.U_(this._init_lambda4, this);
            } else {
                if (z || (onBackInvokedCallback = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) == null) {
                    return;
                }
                reportFullyDrawn.serializer(this._init_lambda4, onBackInvokedCallback);
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            }
        }
    }

    public final void write(int i, ComponentDialog componentDialog, AlertControllerButtonHandler alertControllerButtonHandler) {
        if (alertControllerButtonHandler == null) {
            if (componentDialog == null && i >= 0) {
                ComponentDialog[] componentDialogArr = this.addContentView;
                if (i < componentDialogArr.length) {
                    componentDialog = componentDialogArr[i];
                }
            }
            if (componentDialog != null) {
                alertControllerButtonHandler = componentDialog.ParcelableVolumeInfo;
            }
        }
        if ((componentDialog == null || componentDialog.MediaSessionCompatQueueItem) && !this.accessensureViewModelStore) {
            startIntentSenderForResult startintentsenderforresult = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            Window.Callback callback = this.getLastCustomNonConfigurationInstance.getCallback();
            startintentsenderforresult.getClass();
            try {
                startintentsenderforresult.read = true;
                callback.onPanelClosed(i, alertControllerButtonHandler);
            } finally {
                startintentsenderforresult.read = false;
            }
        }
    }

    @Override // o.IntentSenderRequest
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        onDestroy ondestroy = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (ondestroy == null || !ondestroy.write() || (android.view.ViewConfiguration.get(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0).hasPermanentMenuKey() && !this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RemoteActionCompatParcelizer())) {
            ComponentDialog componentDialogWrite = write(0);
            componentDialogWrite.MediaSessionCompatToken = true;
            IconCompatParcelizer(componentDialogWrite, false);
            IconCompatParcelizer(componentDialogWrite, (android.view.KeyEvent) null);
            return;
        }
        Window.Callback callback = this.getLastCustomNonConfigurationInstance.getCallback();
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaSessionCompatQueueItem()) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.serializer();
            if (this.accessensureViewModelStore) {
                return;
            }
            callback.onPanelClosed(ActivityIdentificationData.RUNNING, write(0).ParcelableVolumeInfo);
            return;
        }
        if (callback == null || this.accessensureViewModelStore) {
            return;
        }
        if (this.fullyDrawnReporter_delegatelambda0 && (1 & this.ensureViewModelStore) != 0) {
            View decorView = this.getLastCustomNonConfigurationInstance.getDecorView();
            MovePreviousSession movePreviousSession = this.menuHostHelperlambda0;
            decorView.removeCallbacks(movePreviousSession);
            movePreviousSession.run();
        }
        ComponentDialog componentDialogWrite2 = write(0);
        AlertControllerButtonHandler alertControllerButtonHandler2 = componentDialogWrite2.ParcelableVolumeInfo;
        if (alertControllerButtonHandler2 == null || componentDialogWrite2.PlaybackStateCompatCustomAction || !callback.onPreparePanel(0, componentDialogWrite2.read, alertControllerButtonHandler2)) {
            return;
        }
        callback.onMenuOpened(ActivityIdentificationData.RUNNING, componentDialogWrite2.ParcelableVolumeInfo);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaBrowserCompatMediaItem();
    }

    public static hasNonInteropFocusableContent IconCompatParcelizer(Context context) {
        hasNonInteropFocusableContent hasnoninteropfocusablecontent;
        if (Build.VERSION.SDK_INT >= 33 || (hasnoninteropfocusablecontent = removeOnPictureInPictureModeChangedListener.MediaSessionCompatQueueItem) == null) {
            return null;
        }
        hasNonInteropFocusableContent hasnoninteropfocusablecontentIconCompatParcelizer = setPictureInPictureParams.IconCompatParcelizer(context.getApplicationContext().getResources().getConfiguration());
        hasNonInteropFocusableContent hasnoninteropfocusablecontentRemoteActionCompatParcelizer = ComponentDialogExternalSyntheticLambda0.RemoteActionCompatParcelizer(hasnoninteropfocusablecontent, hasnoninteropfocusablecontentIconCompatParcelizer);
        return hasnoninteropfocusablecontentRemoteActionCompatParcelizer.read.RemoteActionCompatParcelizer.isEmpty() ? hasnoninteropfocusablecontentIconCompatParcelizer : hasnoninteropfocusablecontentRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    public final boolean serializer(ComponentDialog componentDialog, android.view.KeyEvent keyEvent) {
        AlertControllerButtonHandler alertControllerButtonHandler;
        onDestroy ondestroy;
        onDestroy ondestroy2;
        Resources.Theme themeNewTheme;
        onDestroy ondestroy3;
        onDestroy ondestroy4;
        if (!this.accessensureViewModelStore) {
            boolean z = componentDialog.MediaBrowserCompatMediaItem;
            int i = componentDialog.serializer;
            int i2 = 1;
            if (z) {
                return true;
            }
            ComponentDialog componentDialog2 = this.addOnContextAvailableListener;
            if (componentDialog2 != null && componentDialog2 != componentDialog) {
                IconCompatParcelizer(componentDialog2, false);
            }
            Window.Callback callback = this.getLastCustomNonConfigurationInstance.getCallback();
            if (callback != null) {
                componentDialog.read = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (ondestroy4 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) != null) {
                ondestroy4.setMenuPrepared();
            }
            if (componentDialog.read == null && (!z2 || !(this.PlaybackStateCompatCustomAction instanceof OnBackPressedCallback))) {
                AlertControllerButtonHandler alertControllerButtonHandler2 = componentDialog.ParcelableVolumeInfo;
                if (alertControllerButtonHandler2 == null || componentDialog.PlaybackStateCompatCustomAction) {
                    if (alertControllerButtonHandler2 == null) {
                        Context context = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        if ((i == 0 || i == 108) && this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                getIndexOfFirstFeature getindexoffirstfeature = new getIndexOfFirstFeature(context, 0);
                                getindexoffirstfeature.getTheme().setTo(themeNewTheme);
                                context = getindexoffirstfeature;
                            }
                        }
                        AlertControllerButtonHandler alertControllerButtonHandler3 = new AlertControllerButtonHandler(context);
                        alertControllerButtonHandler3.write(this);
                        AlertControllerButtonHandler alertControllerButtonHandler4 = componentDialog.ParcelableVolumeInfo;
                        if (alertControllerButtonHandler3 != alertControllerButtonHandler4) {
                            if (alertControllerButtonHandler4 != null) {
                                alertControllerButtonHandler4.write(componentDialog.MediaMetadataCompat);
                            }
                            componentDialog.ParcelableVolumeInfo = alertControllerButtonHandler3;
                            register registerVar = componentDialog.MediaMetadataCompat;
                            if (registerVar != null) {
                                alertControllerButtonHandler3.RemoteActionCompatParcelizer(registerVar);
                            }
                        }
                        if (componentDialog.ParcelableVolumeInfo != null) {
                            if (z2 && (ondestroy2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) != null) {
                                if (this.ParcelableVolumeInfo == null) {
                                    this.ParcelableVolumeInfo = new r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ(this, i2);
                                }
                                ondestroy2.setMenu(componentDialog.ParcelableVolumeInfo, this.ParcelableVolumeInfo);
                            }
                            componentDialog.ParcelableVolumeInfo.MediaDescriptionCompat();
                            if (callback.onCreatePanelMenu(i, componentDialog.ParcelableVolumeInfo)) {
                                componentDialog.PlaybackStateCompatCustomAction = false;
                            } else {
                                alertControllerButtonHandler = componentDialog.ParcelableVolumeInfo;
                                if (alertControllerButtonHandler != null) {
                                    if (alertControllerButtonHandler != null) {
                                        alertControllerButtonHandler.write(componentDialog.MediaMetadataCompat);
                                    }
                                    componentDialog.ParcelableVolumeInfo = null;
                                }
                                if (z2 && (ondestroy = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) != null) {
                                    ondestroy.setMenu(null, this.ParcelableVolumeInfo);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.ParcelableVolumeInfo == null) {
                                this.ParcelableVolumeInfo = new r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ(this, i2);
                            }
                            ondestroy2.setMenu(componentDialog.ParcelableVolumeInfo, this.ParcelableVolumeInfo);
                        }
                        componentDialog.ParcelableVolumeInfo.MediaDescriptionCompat();
                        if (callback.onCreatePanelMenu(i, componentDialog.ParcelableVolumeInfo)) {
                            alertControllerButtonHandler = componentDialog.ParcelableVolumeInfo;
                            if (alertControllerButtonHandler != null) {
                                if (alertControllerButtonHandler != null) {
                                    alertControllerButtonHandler.write(componentDialog.MediaMetadataCompat);
                                }
                                componentDialog.ParcelableVolumeInfo = null;
                            }
                            if (z2) {
                                ondestroy.setMenu(null, this.ParcelableVolumeInfo);
                            }
                        } else {
                            componentDialog.PlaybackStateCompatCustomAction = false;
                        }
                    }
                }
                componentDialog.ParcelableVolumeInfo.MediaDescriptionCompat();
                Bundle bundle = componentDialog.IconCompatParcelizer;
                if (bundle != null) {
                    componentDialog.ParcelableVolumeInfo.serializer(bundle);
                    componentDialog.IconCompatParcelizer = null;
                }
                if (!callback.onPreparePanel(0, componentDialog.read, componentDialog.ParcelableVolumeInfo)) {
                    if (z2 && (ondestroy3 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) != null) {
                        ondestroy3.setMenu(null, this.ParcelableVolumeInfo);
                    }
                    componentDialog.ParcelableVolumeInfo.MediaBrowserCompatMediaItem();
                    return false;
                }
                componentDialog.ParcelableVolumeInfo.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                componentDialog.ParcelableVolumeInfo.MediaBrowserCompatMediaItem();
            }
            componentDialog.MediaBrowserCompatMediaItem = true;
            componentDialog.RatingCompat = false;
            this.addOnContextAvailableListener = componentDialog;
            return true;
        }
        return false;
    }

    public final boolean read(ComponentDialog componentDialog, int i, android.view.KeyEvent keyEvent) {
        AlertControllerButtonHandler alertControllerButtonHandler;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((componentDialog.MediaBrowserCompatMediaItem || serializer(componentDialog, keyEvent)) && (alertControllerButtonHandler = componentDialog.ParcelableVolumeInfo) != null) {
            return alertControllerButtonHandler.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final void MediaBrowserCompatMediaItem() {
        if (this.addOnConfigurationChangedListener) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public static Configuration IconCompatParcelizer(Context context, int i, hasNonInteropFocusableContent hasnoninteropfocusablecontent, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (hasnoninteropfocusablecontent != null) {
            setPictureInPictureParams.IconCompatParcelizer(configuration2, hasnoninteropfocusablecontent);
        }
        return configuration2;
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final boolean serializer(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.getDefaultViewModelCreationExtras && i == 108) {
            return false;
        }
        if (this.createFullyDrawnExecutor && i == 1) {
            this.createFullyDrawnExecutor = false;
        }
        if (i == 1) {
            MediaBrowserCompatMediaItem();
            this.getDefaultViewModelCreationExtras = true;
            return true;
        }
        if (i == 2) {
            MediaBrowserCompatMediaItem();
            this.addObserverForBackInvokerlambda0 = true;
            return true;
        }
        if (i == 5) {
            MediaBrowserCompatMediaItem();
            this.addObserverForBackInvoker = true;
            return true;
        }
        if (i == 10) {
            MediaBrowserCompatMediaItem();
            this.onBackPressedInput_delegatelambda0 = true;
            return true;
        }
        if (i == 108) {
            MediaBrowserCompatMediaItem();
            this.createFullyDrawnExecutor = true;
            return true;
        }
        if (i != 109) {
            return this.getLastCustomNonConfigurationInstance.requestFeature(i);
        }
        MediaBrowserCompatMediaItem();
        this.onBackPressedDispatcher_delegatelambda010 = true;
        return true;
    }

    public final int RemoteActionCompatParcelizer(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
                                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getOnBackPressedDispatcherannotations(this, context);
                            }
                            return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer();
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
                        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new getOnBackPressedDispatcherannotations(this, androidx.navigation.NavArgsLazy.write(context));
                    }
                    return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
                }
            }
            return i;
        }
        return -1;
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void serializer(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.addMenuProvider.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(this.getLastCustomNonConfigurationInstance.getCallback());
    }

    @Override // o.removeOnPictureInPictureModeChangedListener
    public final void serializer(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.addMenuProvider.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(this.getLastCustomNonConfigurationInstance.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
