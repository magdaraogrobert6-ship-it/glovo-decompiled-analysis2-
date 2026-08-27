package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class run extends onTrimMemory implements onPostCreate {
    public static final AccelerateInterpolator IconCompatParcelizer = new AccelerateInterpolator();
    public static final DecelerateInterpolator RemoteActionCompatParcelizer = new DecelerateInterpolator();
    public final ArrayList ComponentActivity;
    public onKeyDown MediaBrowserCompatMediaItem;
    public Context MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public isEnabled MediaSessionCompatToken;
    public setActionBarHideOffset ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public accessgetGreencp PlaybackStateCompatCustomAction;
    public final View RatingCompat;
    public boolean ResultReceiver;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final handleOnBackCancelled r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final handleOnBackCancelled r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public onDestroy r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final ImageCapture$1 r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public Context r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public boolean read;
    public isEnabled serializer;
    public onLocalesChanged write;

    @Override // o.onTrimMemory
    public final void MediaSessionCompatQueueItem() {
        IconCompatParcelizer(2, 2);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        int i3 = setfilters.IconCompatParcelizer;
        if ((i2 & 4) != 0) {
            this.PlaybackStateCompat = true;
        }
        setfilters.read((i & i2) | ((~i2) & i3));
    }

    @Override // o.onTrimMemory
    public final void IconCompatParcelizer(Drawable drawable) {
        this.write.setPrimaryBackground(drawable);
    }

    @Override // o.onTrimMemory
    public final void ParcelableVolumeInfo() {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        setfilters.MediaBrowserCompatMediaItem = "Close Survey";
        setfilters.IconCompatParcelizer();
    }

    @Override // o.onTrimMemory
    public final void PlaybackStateCompat() {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        setfilters.MediaMetadataCompat = null;
        setfilters.serializer();
    }

    @Override // o.onTrimMemory
    public final void RatingCompat() {
        MediaBrowserCompatMediaItem(this.MediaDescriptionCompat.getResources().getBoolean(com.logistics.rider.glovo.R.bool.abc_action_bar_embed_tabs));
    }

    public final void RatingCompat(boolean z) {
        boolean z2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 || !(this.MediaSessionCompatResultReceiverWrapper || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        boolean z3 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        ImageCapture$1 imageCapture$1 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        View view = this.RatingCompat;
        if (!z2) {
            if (z3) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
                PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = this.MediaSessionCompatQueueItem;
                if (predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 != null) {
                    predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.serializer();
                }
                int i = this.MediaMetadataCompat;
                handleOnBackCancelled handleonbackcancelled = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (i != 0 || (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && !z)) {
                    handleonbackcancelled.serializer();
                    return;
                }
                this.write.setAlpha(1.0f);
                this.write.setTransitioning(true);
                PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2 = new PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1();
                float f = -this.write.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.write.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                getRedirectui getredirectuiWrite = FocusPropertiesNode.write(this.write);
                getredirectuiWrite.IconCompatParcelizer(f);
                View view2 = (View) getredirectuiWrite.write.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(imageCapture$1 != null ? new TileMode(imageCapture$1, view2) : null);
                }
                boolean z4 = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.write;
                ArrayList arrayList = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.read;
                if (!z4) {
                    arrayList.add(getredirectuiWrite);
                }
                if (this.read && view != null) {
                    getRedirectui getredirectuiWrite2 = FocusPropertiesNode.write(view);
                    getredirectuiWrite2.IconCompatParcelizer(f);
                    if (!predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.write) {
                        arrayList.add(getredirectuiWrite2);
                    }
                }
                boolean z5 = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.write;
                if (!z5) {
                    predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.IconCompatParcelizer = IconCompatParcelizer;
                }
                if (!z5) {
                    predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.RemoteActionCompatParcelizer = 250L;
                }
                if (!z5) {
                    predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.serializer = handleonbackcancelled;
                }
                this.MediaSessionCompatQueueItem = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2;
                predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose2.IconCompatParcelizer();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose3 = this.MediaSessionCompatQueueItem;
        if (predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose3 != null) {
            predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose3.serializer();
        }
        this.write.setVisibility(0);
        int i2 = this.MediaMetadataCompat;
        handleOnBackCancelled handleonbackcancelled2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (i2 == 0 && (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 || z)) {
            this.write.setTranslationY(0.0f);
            float f2 = -this.write.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.write.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.write.setTranslationY(f2);
            PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4 = new PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1();
            getRedirectui getredirectuiWrite3 = FocusPropertiesNode.write(this.write);
            getredirectuiWrite3.IconCompatParcelizer(0.0f);
            View view3 = (View) getredirectuiWrite3.write.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(imageCapture$1 != null ? new TileMode(imageCapture$1, view3) : null);
            }
            boolean z6 = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.write;
            ArrayList arrayList2 = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.read;
            if (!z6) {
                arrayList2.add(getredirectuiWrite3);
            }
            if (this.read && view != null) {
                view.setTranslationY(f2);
                getRedirectui getredirectuiWrite4 = FocusPropertiesNode.write(view);
                getredirectuiWrite4.IconCompatParcelizer(0.0f);
                if (!predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.write) {
                    arrayList2.add(getredirectuiWrite4);
                }
            }
            boolean z7 = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.write;
            if (!z7) {
                predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.IconCompatParcelizer = RemoteActionCompatParcelizer;
            }
            if (!z7) {
                predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.RemoteActionCompatParcelizer = 250L;
            }
            if (!z7) {
                predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.serializer = handleonbackcancelled2;
            }
            this.MediaSessionCompatQueueItem = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4;
            predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose4.IconCompatParcelizer();
        } else {
            this.write.setAlpha(1.0f);
            this.write.setTranslationY(0.0f);
            if (this.read && view != null) {
                view.setTranslationY(0.0f);
            }
            handleonbackcancelled2.serializer();
        }
        onDestroy ondestroy = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (ondestroy != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            ondestroy.requestApplyInsets();
        }
    }

    @Override // o.onTrimMemory
    public final void read(CharSequence charSequence) {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        setfilters.MediaSessionCompatToken = true;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        setfilters.ParcelableVolumeInfo = charSequence;
        if ((setfilters.IconCompatParcelizer & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (setfilters.MediaSessionCompatToken) {
                FocusPropertiesNode.read(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // o.onTrimMemory
    public final int serializer() {
        return ((setFilters) this.ParcelableVolumeInfo).IconCompatParcelizer;
    }

    @Override // o.onTrimMemory
    public final void serializer(float f) {
        onLocalesChanged onlocaleschanged = this.write;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        onlocaleschanged.setElevation(f);
    }

    @Override // o.onTrimMemory
    public final void write(int i) {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        Drawable drawableWrite = i != 0 ? coil3.util.IntPair.write(toolbar.getContext(), i) : null;
        setfilters.MediaDescriptionCompat = drawableWrite;
        if ((setfilters.IconCompatParcelizer & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableWrite == null) {
            drawableWrite = setfilters.RemoteActionCompatParcelizer;
        }
        toolbar.setNavigationIcon(drawableWrite);
    }

    @Override // o.onTrimMemory
    public final void write(CharSequence charSequence) {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        if (setfilters.MediaSessionCompatToken) {
            return;
        }
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        setfilters.ParcelableVolumeInfo = charSequence;
        if ((setfilters.IconCompatParcelizer & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (setfilters.MediaSessionCompatToken) {
                FocusPropertiesNode.read(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void MediaBrowserCompatMediaItem(boolean z) {
        if (!z) {
            ((setFilters) this.ParcelableVolumeInfo).getClass();
            this.write.setTabContainer(null);
        } else {
            this.write.setTabContainer(null);
            ((setFilters) this.ParcelableVolumeInfo).getClass();
        }
        ((setFilters) this.ParcelableVolumeInfo).getClass();
        ((setFilters) this.ParcelableVolumeInfo).PlaybackStateCompat.setCollapsible(false);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setHasNonEmbeddedTabs(false);
    }

    @Override // o.onTrimMemory
    public final void MediaSessionCompatToken() {
        IconCompatParcelizer(0, 8);
    }

    public final void write(View view) {
        String simpleName;
        setActionBarHideOffset wrapper;
        onDestroy ondestroy = (onDestroy) view.findViewById(com.logistics.rider.glovo.R.id.decor_content_parent);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = ondestroy;
        if (ondestroy != null) {
            ondestroy.setActionBarVisibilityCallback(this);
        }
        android.view.KeyEvent.Callback callbackFindViewById = view.findViewById(com.logistics.rider.glovo.R.id.action_bar);
        if (callbackFindViewById instanceof setActionBarHideOffset) {
            wrapper = (setActionBarHideOffset) callbackFindViewById;
        } else if (callbackFindViewById instanceof androidx.appcompat.widget.Toolbar) {
            wrapper = ((androidx.appcompat.widget.Toolbar) callbackFindViewById).getWrapper();
        } else {
            if (callbackFindViewById != null) {
                simpleName = callbackFindViewById.getClass().getSimpleName();
            } else {
                simpleName = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(simpleName));
        }
        this.ParcelableVolumeInfo = wrapper;
        this.MediaBrowserCompatMediaItem = (onKeyDown) view.findViewById(com.logistics.rider.glovo.R.id.action_context_bar);
        onLocalesChanged onlocaleschanged = (onLocalesChanged) view.findViewById(com.logistics.rider.glovo.R.id.action_bar_container);
        this.write = onlocaleschanged;
        setActionBarHideOffset setactionbarhideoffset = this.ParcelableVolumeInfo;
        if (setactionbarhideoffset != null && this.MediaBrowserCompatMediaItem != null && onlocaleschanged != null) {
            Context context = ((setFilters) setactionbarhideoffset).PlaybackStateCompat.getContext();
            this.MediaDescriptionCompat = context;
            if ((((setFilters) this.ParcelableVolumeInfo).IconCompatParcelizer & 4) != 0) {
                this.PlaybackStateCompat = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.ParcelableVolumeInfo.getClass();
            MediaBrowserCompatMediaItem(context.getResources().getBoolean(com.logistics.rider.glovo.R.bool.abc_action_bar_embed_tabs));
            TypedArray typedArrayObtainStyledAttributes = this.MediaDescriptionCompat.obtainStyledAttributes(null, onUserLeaveHint.ActionBar, com.logistics.rider.glovo.R.attr.actionBarStyle, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                onDestroy ondestroy2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if (ondestroy2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
                    this.ResultReceiver = true;
                    ondestroy2.setHideOnContentScrollEnabled(true);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                serializer(dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("WindowDecorActionBar can only be used with a compatible window decor layout");
    }

    @Override // o.onTrimMemory
    public final void serializer(boolean z) {
        if (this.PlaybackStateCompat) {
            return;
        }
        IconCompatParcelizer(z);
    }

    @Override // o.onTrimMemory
    public final handleOnBackPressed write(accessgetGreencp accessgetgreencp) {
        isEnabled isenabled = this.serializer;
        if (isenabled != null) {
            isenabled.RemoteActionCompatParcelizer();
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setHideOnContentScrollEnabled(false);
        this.MediaBrowserCompatMediaItem.read();
        isEnabled isenabled2 = new isEnabled(this, this.MediaBrowserCompatMediaItem.getContext(), accessgetgreencp);
        AlertControllerButtonHandler alertControllerButtonHandler = isenabled2.write;
        alertControllerButtonHandler.MediaDescriptionCompat();
        try {
            boolean z = ((handleOnBackStarted) isenabled2.serializer.IconCompatParcelizer).read(isenabled2, alertControllerButtonHandler);
            alertControllerButtonHandler.MediaBrowserCompatMediaItem();
            if (!z) {
                return null;
            }
            this.serializer = isenabled2;
            isenabled2.MediaBrowserCompatMediaItem();
            this.MediaBrowserCompatMediaItem.serializer(isenabled2);
            read(true);
            return isenabled2;
        } catch (Throwable th) {
            alertControllerButtonHandler.MediaBrowserCompatMediaItem();
            throw th;
        }
    }

    @Override // o.onTrimMemory
    public final void write(boolean z) {
        PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = z;
        if (z || (predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = this.MediaSessionCompatQueueItem) == null) {
            return;
        }
        predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.serializer();
    }

    public run(Activity activity, boolean z) {
        new ArrayList();
        this.ComponentActivity = new ArrayList();
        this.MediaMetadataCompat = 0;
        this.read = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new handleOnBackCancelled(this, 0);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new handleOnBackCancelled(this, 1);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new ImageCapture$1(3, this);
        View decorView = activity.getWindow().getDecorView();
        write(decorView);
        if (z) {
            return;
        }
        this.RatingCompat = decorView.findViewById(android.R.id.content);
    }

    @Override // o.onTrimMemory
    public final void IconCompatParcelizer() {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = true;
        RatingCompat(false);
    }

    @Override // o.onTrimMemory
    public final void MediaSessionCompatResultReceiverWrapper() {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.MediaSessionCompatResultReceiverWrapper = false;
            RatingCompat(false);
        }
    }

    @Override // o.onTrimMemory
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (z == this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            return;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z;
        ArrayList arrayList = this.ComponentActivity;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    @Override // o.onTrimMemory
    public final boolean RemoteActionCompatParcelizer() {
        setActionBarHideOffset setactionbarhideoffset = this.ParcelableVolumeInfo;
        if (setactionbarhideoffset == null) {
            return false;
        }
        setFilters setfilters = (setFilters) setactionbarhideoffset;
        setAllCaps setallcaps = setfilters.PlaybackStateCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (setallcaps == null || setallcaps.IconCompatParcelizer == null) {
            return false;
        }
        setAllCaps setallcaps2 = setfilters.PlaybackStateCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Keep keep = setallcaps2 == null ? null : setallcaps2.IconCompatParcelizer;
        if (keep == null) {
            return true;
        }
        keep.collapseActionView();
        return true;
    }

    @Override // o.onTrimMemory
    public final void IconCompatParcelizer(boolean z) {
        IconCompatParcelizer(z ? 4 : 0, 4);
    }

    @Override // o.onTrimMemory
    public final Context read() {
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == null) {
            TypedValue typedValue = new TypedValue();
            this.MediaDescriptionCompat.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new ContextThemeWrapper(this.MediaDescriptionCompat, i);
            } else {
                this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = this.MediaDescriptionCompat;
            }
        }
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    @Override // o.onTrimMemory
    public final boolean read(int i, android.view.KeyEvent keyEvent) {
        AlertControllerButtonHandler alertControllerButtonHandler;
        isEnabled isenabled = this.serializer;
        if (isenabled == null || (alertControllerButtonHandler = isenabled.write) == null) {
            return false;
        }
        alertControllerButtonHandler.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return alertControllerButtonHandler.performShortcut(i, keyEvent, 0);
    }

    public final void read(boolean z) {
        getRedirectui getredirectuiWrite;
        getRedirectui getredirectuiWrite2;
        boolean z2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (z) {
            if (!z2) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
                onDestroy ondestroy = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if (ondestroy != null) {
                    ondestroy.setShowingForActionMode(true);
                }
                RatingCompat(false);
            }
        } else if (z2) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
            onDestroy ondestroy2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (ondestroy2 != null) {
                ondestroy2.setShowingForActionMode(false);
            }
            RatingCompat(false);
        }
        boolean zIsLaidOut = this.write.isLaidOut();
        setActionBarHideOffset setactionbarhideoffset = this.ParcelableVolumeInfo;
        if (!zIsLaidOut) {
            if (z) {
                ((setFilters) setactionbarhideoffset).PlaybackStateCompat.setVisibility(4);
                this.MediaBrowserCompatMediaItem.setVisibility(0);
                return;
            } else {
                ((setFilters) setactionbarhideoffset).PlaybackStateCompat.setVisibility(0);
                this.MediaBrowserCompatMediaItem.setVisibility(8);
                return;
            }
        }
        if (z) {
            setFilters setfilters = (setFilters) setactionbarhideoffset;
            getredirectuiWrite2 = FocusPropertiesNode.write(setfilters.PlaybackStateCompat);
            getredirectuiWrite2.RemoteActionCompatParcelizer(0.0f);
            getredirectuiWrite2.RemoteActionCompatParcelizer(100L);
            getredirectuiWrite2.IconCompatParcelizer(new getSupportButtonTintList(setfilters, 4));
            getredirectuiWrite = this.MediaBrowserCompatMediaItem.read(0, 200L);
        } else {
            setFilters setfilters2 = (setFilters) setactionbarhideoffset;
            getredirectuiWrite = FocusPropertiesNode.write(setfilters2.PlaybackStateCompat);
            getredirectuiWrite.RemoteActionCompatParcelizer(1.0f);
            getredirectuiWrite.RemoteActionCompatParcelizer(200L);
            getredirectuiWrite.IconCompatParcelizer(new getSupportButtonTintList(setfilters2, 0));
            getredirectuiWrite2 = this.MediaBrowserCompatMediaItem.read(8, 100L);
        }
        PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = new PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1();
        ArrayList arrayList = predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.read;
        arrayList.add(getredirectuiWrite2);
        View view = (View) getredirectuiWrite2.write.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) getredirectuiWrite.write.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(getredirectuiWrite);
        predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.IconCompatParcelizer();
    }

    @Override // o.onTrimMemory
    public final void serializer(Drawable drawable) {
        setFilters setfilters = (setFilters) this.ParcelableVolumeInfo;
        setfilters.MediaDescriptionCompat = drawable;
        int i = setfilters.IconCompatParcelizer;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        if ((i & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = setfilters.RemoteActionCompatParcelizer;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public run(android.app.Dialog dialog) {
        new ArrayList();
        this.ComponentActivity = new ArrayList();
        this.MediaMetadataCompat = 0;
        this.read = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new handleOnBackCancelled(this, 0);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new handleOnBackCancelled(this, 1);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new ImageCapture$1(3, this);
        write(dialog.getWindow().getDecorView());
    }
}
