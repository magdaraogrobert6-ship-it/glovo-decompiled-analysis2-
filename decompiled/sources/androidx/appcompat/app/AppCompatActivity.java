package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.adjust.sdk.AdjustInstance$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import kotlin.LazyKt__LazyJVMKt;
import o.ContextMenuSpec;
import o.OnBackPressedCallback;
import o.SystemBarStyleCompanion;
import o.accessgetUpcp;
import o.ensureSubDecor;
import o.getCacheKey;
import o.getDifferencertfAjoo;
import o.getIndexOfFirstFeature;
import o.getLocalHtmlUrlFromRemoteUrllambda5;
import o.getSupportCompoundDrawablesTintMode;
import o.handleOnBackPressed;
import o.handleOnBackStarted;
import o.hasNonInteropFocusableContent;
import o.hasPendingInvalidation;
import o.onRetainNonConfigurationInstance;
import o.onTrimMemory;
import o.removeMenuProvider;
import o.removeOnMultiWindowModeChangedListener;
import o.removeOnNewIntentListener;
import o.removeOnPictureInPictureModeChangedListener;
import o.run;
import o.setPictureInPictureParams;
import o.setSupportAllCaps;
import o.startActivityForResult;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements removeOnMultiWindowModeChangedListener {
    private removeOnPictureInPictureModeChangedListener MediaBrowserCompatMediaItem;
    private Resources MediaDescriptionCompat;

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    public Intent getSupportParentActivityIntent() {
        return LazyKt__LazyJVMKt.IconCompatParcelizer(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(hasPendingInvalidation haspendinginvalidation) {
        haspendinginvalidation.IconCompatParcelizer(this);
    }

    public void onLocalesChanged(hasNonInteropFocusableContent hasnoninteropfocusablecontent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(hasPendingInvalidation haspendinginvalidation) {
    }

    @Override // o.removeOnMultiWindowModeChangedListener
    public void onSupportActionModeFinished(handleOnBackPressed handleonbackpressed) {
    }

    @Override // o.removeOnMultiWindowModeChangedListener
    public void onSupportActionModeStarted(handleOnBackPressed handleonbackpressed) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    @Override // o.removeOnMultiWindowModeChangedListener
    public handleOnBackPressed onWindowStartingSupportActionMode(handleOnBackStarted handleonbackstarted) {
        return null;
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public AppCompatActivity() {
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        startactivityforresult.ensureSubDecor();
        ((ViewGroup) startactivityforresult.addMenuProvider.findViewById(R.id.content)).addView(view, layoutParams);
        startactivityforresult.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(startactivityforresult.getLastCustomNonConfigurationInstance.getCallback());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        if (startactivityforresult.createFullyDrawnExecutor && startactivityforresult.addOnConfigurationChangedListener) {
            startactivityforresult.serializer();
            onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
            if (ontrimmemory != null) {
                ontrimmemory.RatingCompat();
            }
        }
        ensureSubDecor ensuresubdecorWrite = ensureSubDecor.write();
        Context context = startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        synchronized (ensuresubdecorWrite) {
            getSupportCompoundDrawablesTintMode getsupportcompounddrawablestintmode = ensuresubdecorWrite.write;
            synchronized (getsupportcompounddrawablestintmode) {
                ContextMenuSpec contextMenuSpec = (ContextMenuSpec) getsupportcompounddrawablestintmode.write.get(context);
                if (contextMenuSpec != null) {
                    contextMenuSpec.RemoteActionCompatParcelizer();
                }
            }
        }
        startactivityforresult._init_lambda1 = new Configuration(startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getResources().getConfiguration());
        startactivityforresult.write(false, false);
        if (this.MediaDescriptionCompat != null) {
            this.MediaDescriptionCompat.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().IconCompatParcelizer();
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((startActivityForResult) getDelegate()).ensureSubDecor();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        startactivityforresult.serializer();
        onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
        if (ontrimmemory != null) {
            ontrimmemory.write(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((startActivityForResult) getDelegate()).write(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        startactivityforresult.serializer();
        onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
        if (ontrimmemory != null) {
            ontrimmemory.write(false);
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().read(charSequence);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().RemoteActionCompatParcelizer(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((startActivityForResult) getDelegate()).addOnTrimMemoryListener = i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0190  */
    /* JADX WARN: Code duplicated, block: B:104:0x0198  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        getIndexOfFirstFeature getindexoffirstfeature;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        int i37 = 1;
        startactivityforresult.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        int i38 = startactivityforresult.fullyDrawnReporter_delegatelambda00;
        if (i38 == -100) {
            i38 = removeOnPictureInPictureModeChangedListener.read;
        }
        int iRemoteActionCompatParcelizer = startactivityforresult.RemoteActionCompatParcelizer(context, i38);
        if (removeOnPictureInPictureModeChangedListener.serializer(context) && removeOnPictureInPictureModeChangedListener.serializer(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (removeOnPictureInPictureModeChangedListener.write) {
                    hasNonInteropFocusableContent hasnoninteropfocusablecontent = removeOnPictureInPictureModeChangedListener.MediaSessionCompatQueueItem;
                    if (hasnoninteropfocusablecontent == null) {
                        if (removeOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem == null) {
                            removeOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem = hasNonInteropFocusableContent.RemoteActionCompatParcelizer(accessgetUpcp.RemoteActionCompatParcelizer(context));
                        }
                        if (!removeOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem.read.RemoteActionCompatParcelizer.isEmpty()) {
                            removeOnPictureInPictureModeChangedListener.MediaSessionCompatQueueItem = removeOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem;
                        }
                    } else if (!hasnoninteropfocusablecontent.equals(removeOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem)) {
                        hasNonInteropFocusableContent hasnoninteropfocusablecontent2 = removeOnPictureInPictureModeChangedListener.MediaSessionCompatQueueItem;
                        removeOnPictureInPictureModeChangedListener.MediaBrowserCompatMediaItem = hasnoninteropfocusablecontent2;
                        accessgetUpcp.read(context, hasnoninteropfocusablecontent2.read.RemoteActionCompatParcelizer.toLanguageTags());
                    }
                }
            } else if (!removeOnPictureInPictureModeChangedListener.MediaMetadataCompat) {
                removeOnPictureInPictureModeChangedListener.RatingCompat.execute(new AdjustInstance$$ExternalSyntheticLambda1(context, i37));
            }
        }
        hasNonInteropFocusableContent hasnoninteropfocusablecontentIconCompatParcelizer = startActivityForResult.IconCompatParcelizer(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(startActivityForResult.IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof getIndexOfFirstFeature) {
                    try {
                        ((getIndexOfFirstFeature) context).write(startActivityForResult.IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, null, false));
                    } catch (IllegalStateException unused2) {
                        if (startActivityForResult.MediaDescriptionCompat) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    setPictureInPictureParams.read(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout;
                                    i18 = configuration2.screenLayout & 15;
                                    if ((i17 & 15) != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout;
                                    i20 = configuration2.screenLayout & 192;
                                    if ((i19 & 192) != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout;
                                    i22 = configuration2.screenLayout & 48;
                                    if ((i21 & 48) != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout;
                                    i24 = configuration2.screenLayout & 768;
                                    if ((i23 & 768) != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    getCacheKey.read(configuration, configuration2, configuration3);
                                    i25 = configuration.uiMode;
                                    i26 = configuration2.uiMode & 15;
                                    if ((i25 & 15) != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode;
                                    i28 = configuration2.uiMode & 48;
                                    if ((i27 & 48) != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationIconCompatParcelizer = startActivityForResult.IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, configuration3, true);
                            getindexoffirstfeature = new getIndexOfFirstFeature(context, com.logistics.rider.glovo.R.style.Theme_AppCompat_Empty);
                            getindexoffirstfeature.write(configurationIconCompatParcelizer);
                            try {
                                if (context.getTheme() != null) {
                                    getLocalHtmlUrlFromRemoteUrllambda5.serializer(getindexoffirstfeature.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = getindexoffirstfeature;
                        }
                    }
                } else if (startActivityForResult.MediaDescriptionCompat) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            setPictureInPictureParams.read(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout;
                            i18 = configuration2.screenLayout & 15;
                            if ((i17 & 15) != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout;
                            i20 = configuration2.screenLayout & 192;
                            if ((i19 & 192) != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout;
                            i22 = configuration2.screenLayout & 48;
                            if ((i21 & 48) != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout;
                            i24 = configuration2.screenLayout & 768;
                            if ((i23 & 768) != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            getCacheKey.read(configuration, configuration2, configuration3);
                            i25 = configuration.uiMode;
                            i26 = configuration2.uiMode & 15;
                            if ((i25 & 15) != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode;
                            i28 = configuration2.uiMode & 48;
                            if ((i27 & 48) != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    }
                    Configuration configurationIconCompatParcelizer2 = startActivityForResult.IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, configuration3, true);
                    getindexoffirstfeature = new getIndexOfFirstFeature(context, com.logistics.rider.glovo.R.style.Theme_AppCompat_Empty);
                    getindexoffirstfeature.write(configurationIconCompatParcelizer2);
                    if (context.getTheme() != null) {
                        getLocalHtmlUrlFromRemoteUrllambda5.serializer(getindexoffirstfeature.getTheme());
                    }
                    context = getindexoffirstfeature;
                }
            }
        } else if (context instanceof getIndexOfFirstFeature) {
            ((getIndexOfFirstFeature) context).write(startActivityForResult.IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, null, false));
        } else if (startActivityForResult.MediaDescriptionCompat) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    setPictureInPictureParams.read(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout;
                    i18 = configuration2.screenLayout & 15;
                    if ((i17 & 15) != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout;
                    i20 = configuration2.screenLayout & 192;
                    if ((i19 & 192) != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout;
                    i22 = configuration2.screenLayout & 48;
                    if ((i21 & 48) != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout;
                    i24 = configuration2.screenLayout & 768;
                    if ((i23 & 768) != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    getCacheKey.read(configuration, configuration2, configuration3);
                    i25 = configuration.uiMode;
                    i26 = configuration2.uiMode & 15;
                    if ((i25 & 15) != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode;
                    i28 = configuration2.uiMode & 48;
                    if ((i27 & 48) != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            }
            Configuration configurationIconCompatParcelizer3 = startActivityForResult.IconCompatParcelizer(context, iRemoteActionCompatParcelizer, hasnoninteropfocusablecontentIconCompatParcelizer, configuration3, true);
            getindexoffirstfeature = new getIndexOfFirstFeature(context, com.logistics.rider.glovo.R.style.Theme_AppCompat_Empty);
            getindexoffirstfeature.write(configurationIconCompatParcelizer3);
            if (context.getTheme() != null) {
                getLocalHtmlUrlFromRemoteUrllambda5.serializer(getindexoffirstfeature.getTheme());
            }
            context = getindexoffirstfeature;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        onTrimMemory supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.write()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        onTrimMemory supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.serializer(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        startactivityforresult.ensureSubDecor();
        return (T) startactivityforresult.getLastCustomNonConfigurationInstance.findViewById(i);
    }

    public removeOnPictureInPictureModeChangedListener getDelegate() {
        if (this.MediaBrowserCompatMediaItem == null) {
            getDifferencertfAjoo getdifferencertfajoo = removeOnPictureInPictureModeChangedListener.RatingCompat;
            this.MediaBrowserCompatMediaItem = new startActivityForResult(this, null, this, this);
        }
        return this.MediaBrowserCompatMediaItem;
    }

    public onRetainNonConfigurationInstance getDrawerToggleDelegate() {
        ((startActivityForResult) getDelegate()).getClass();
        return new Timestamp.Companion();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        if (startactivityforresult.onBackPressedDispatcher_delegatelambda00 == null) {
            startactivityforresult.serializer();
            onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
            startactivityforresult.onBackPressedDispatcher_delegatelambda00 = new SystemBarStyleCompanion(ontrimmemory != null ? ontrimmemory.read() : startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        return startactivityforresult.onBackPressedDispatcher_delegatelambda00;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.MediaDescriptionCompat;
        if (resources == null) {
            int i = setSupportAllCaps.RemoteActionCompatParcelizer;
        }
        return resources == null ? super.getResources() : resources;
    }

    public onTrimMemory getSupportActionBar() {
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        startactivityforresult.serializer();
        return startactivityforresult.PlaybackStateCompatCustomAction;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().read();
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        onTrimMemory supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.MediaMetadataCompat()) {
                super.openOptionsMenu();
            }
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        startActivityForResult startactivityforresult = (startActivityForResult) getDelegate();
        if (startactivityforresult.defaultViewModelProviderFactory_delegatelambda0 instanceof Activity) {
            startactivityforresult.serializer();
            onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
            if (ontrimmemory instanceof run) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            startactivityforresult.onBackPressedDispatcher_delegatelambda00 = null;
            if (ontrimmemory != null) {
                ontrimmemory.MediaDescriptionCompat();
            }
            startactivityforresult.PlaybackStateCompatCustomAction = null;
            if (toolbar != null) {
                Object obj = startactivityforresult.defaultViewModelProviderFactory_delegatelambda0;
                OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : startactivityforresult.addOnPictureInPictureUiStateChangedListener, startactivityforresult.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                startactivityforresult.PlaybackStateCompatCustomAction = onBackPressedCallback;
                startactivityforresult.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write = onBackPressedCallback.IconCompatParcelizer;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                startactivityforresult.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write = null;
            }
            startactivityforresult.read();
        }
    }

    public handleOnBackPressed startSupportActionMode(handleOnBackStarted handleonbackstarted) {
        return getDelegate().IconCompatParcelizer(handleonbackstarted);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().read();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().serializer(i);
    }

    private void initDelegate() {
        getSavedStateRegistry().RemoteActionCompatParcelizer("androidx:appcompat", new removeMenuProvider(this));
        addOnContextAvailableListener(new removeOnNewIntentListener(this));
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        hasPendingInvalidation haspendinginvalidationSerializer = hasPendingInvalidation.serializer(this);
        onCreateSupportNavigateUpTaskStack(haspendinginvalidationSerializer);
        onPrepareSupportNavigateUpTaskStack(haspendinginvalidationSerializer);
        haspendinginvalidationSerializer.RemoteActionCompatParcelizer();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        onTrimMemory supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.serializer() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().serializer(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().serializer(view, layoutParams);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
