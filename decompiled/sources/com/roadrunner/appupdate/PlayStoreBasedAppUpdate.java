package com.roadrunner.appupdate;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.sentry.hints.MediaSessionCompatQueueItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import o.createFromParcel;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getCollectionInfo;
import o.getCurrenthdzbrEE;
import o.getFilterQualityfv9h1I;
import o.getSafeDrawing;
import o.getTimeFromEpochInSeconds;
import o.handleUrlOverridelambda1;
import o.provideInsetsValuescytEWk0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.setStrokeCapBeK7IIE;
import okio.Okio;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayStoreBasedAppUpdate {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final SharedPreferences read;
    public final Application serializer;

    public PlayStoreBasedAppUpdate(Application application, SharedPreferences sharedPreferences) {
        application.getClass();
        sharedPreferences.getClass();
        this.serializer = application;
        this.read = sharedPreferences;
    }

    public final void IconCompatParcelizer(provideInsetsValuescytEWk0 provideinsetsvaluescytewk0, getSafeDrawing getsafedrawing, FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        MediaSessionCompatQueueItem.IconCompatParcelizer(fragmentActivity.getString(R.string.google_play_update_dialog_title), fragmentActivity.getString(R.string.google_play_update_dialog_message), fragmentActivity.getString(R.string.google_play_update_dialog_positive_button), fragmentActivity.getString(R.string.google_play_update_dialog_negative_button), null, false, false, false, 400).write(fragmentActivity.getSupportFragmentManager(), "AppUpdateImpl");
        getFilterQualityfv9h1I viewModelStore = fragmentActivity.getViewModelStore();
        createImageBitmap defaultViewModelProviderFactory = fragmentActivity.getDefaultViewModelProviderFactory();
        setStrokeCapBeK7IIE defaultViewModelCreationExtras = fragmentActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            getTimeFromEpochInSeconds gettimefromepochinseconds = (getTimeFromEpochInSeconds) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
            gettimefromepochinseconds.read().RemoteActionCompatParcelizer(fragmentActivity, new NavControllerImpl$$ExternalSyntheticLambda0(gettimefromepochinseconds, this, provideinsetsvaluescytewk0, getsafedrawing, fragmentActivity));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
            int i2 = IconCompatParcelizer + 99;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012c A[Catch: Exception -> 0x013a, TRY_LEAVE, TryCatch #0 {Exception -> 0x013a, blocks: (B:12:0x0036, B:26:0x0092, B:28:0x009b, B:30:0x00a3, B:32:0x00cb, B:36:0x00dc, B:42:0x012c, B:40:0x0106, B:19:0x0051), top: B:47:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final Object access$checkAppUpdateWith(PlayStoreBasedAppUpdate playStoreBasedAppUpdate, AppCompatActivity appCompatActivity, ContinuationImpl continuationImpl) {
        getCollectionInfo getcollectioninfo;
        provideInsetsValuescytEWk0 provideinsetsvaluescytewk0;
        AppCompatActivity appCompatActivity2;
        int i = 2 % 2;
        SharedPreferences sharedPreferences = playStoreBasedAppUpdate.read;
        Application application = playStoreBasedAppUpdate.serializer;
        if (continuationImpl instanceof getCollectionInfo) {
            getcollectioninfo = (getCollectionInfo) continuationImpl;
            int i2 = getcollectioninfo.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getcollectioninfo.read = i2 - Integer.MIN_VALUE;
            } else {
                getcollectioninfo = new getCollectionInfo(playStoreBasedAppUpdate, continuationImpl);
            }
        } else {
            getcollectioninfo = new getCollectionInfo(playStoreBasedAppUpdate, continuationImpl);
        }
        Object obj = getcollectioninfo.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getcollectioninfo.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                provideInsetsValuescytEWk0 provideinsetsvaluescytewk1 = (provideInsetsValuescytEWk0) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{application}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 842332784, iRemoteActionCompatParcelizer, -842332783);
                provideinsetsvaluescytewk1.getClass();
                getcollectioninfo.RemoteActionCompatParcelizer = appCompatActivity;
                getcollectioninfo.IconCompatParcelizer = provideinsetsvaluescytewk1;
                getcollectioninfo.read = 1;
                Object objRequestAppUpdateInfo = RangesKt.requestAppUpdateInfo(provideinsetsvaluescytewk1, getcollectioninfo);
                if (objRequestAppUpdateInfo == coroutineSingletons) {
                    int i4 = write + 57;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
                provideinsetsvaluescytewk0 = provideinsetsvaluescytewk1;
                obj = objRequestAppUpdateInfo;
                appCompatActivity2 = appCompatActivity;
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i5 = write + 113;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        int i6 = 77 / 0;
                    }
                    return null;
                }
                provideinsetsvaluescytewk0 = getcollectioninfo.IconCompatParcelizer;
                appCompatActivity2 = getcollectioninfo.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            getSafeDrawing getsafedrawing = (getSafeDrawing) obj;
            if (getsafedrawing.write() == 3) {
                provideinsetsvaluescytewk0.write(getsafedrawing, appCompatActivity2, getCurrenthdzbrEE.IconCompatParcelizer());
                return createfromparcel;
            }
            String string = application.getString(R.string.preference_app_update_request_date);
            string.getClass();
            String string2 = sharedPreferences.getString(string, null);
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            if (getsafedrawing.write() == 2 && getsafedrawing.IconCompatParcelizer()) {
                int i7 = IconCompatParcelizer + 107;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string2, str}, getCieXyz.write())).booleanValue();
                    int i8 = 99 / 0;
                    if (!zBooleanValue) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(string, str);
                        editorEdit.apply();
                        playStoreBasedAppUpdate.IconCompatParcelizer(provideinsetsvaluescytewk0, getsafedrawing, appCompatActivity2);
                    }
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string2, str}, getCieXyz.write())).booleanValue()) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(string, str);
                        editorEdit2.apply();
                        playStoreBasedAppUpdate.IconCompatParcelizer(provideinsetsvaluescytewk0, getsafedrawing, appCompatActivity2);
                    }
                }
            }
            return createfromparcel;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "App update flow failed.", new Object[0]);
            return createfromparcel;
        }
    }
}
