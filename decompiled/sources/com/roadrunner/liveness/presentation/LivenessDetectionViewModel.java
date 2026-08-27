package com.roadrunner.liveness.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.logistics.rider.glovo.R;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.liveness.domain.CreateEmptyCameraImageUseCaseImpl;
import com.roadrunner.login.logging.OtpLogger;
import java.io.IOException;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.FrameworkSQLiteOpenHelperOpenHelper;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.SharedSQLiteStatement;
import o.SupportSQLiteOpenHelperCallback;
import o.SystemLifecycleSystemLifecycleCallback;
import o.generatePOSTBodyString;
import o.getKeyTemplate;
import o.getQueryContext;
import o.isAdapterPositionOnScreen;
import o.onCorruption;
import o.onOpen;
import o.onPostMigrate;
import o.setTransactionSuccessful;
import o.setWebView;

/* JADX INFO: loaded from: classes3.dex */
public final class LivenessDetectionViewModel extends ViewModel {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final getQueryContext IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final OtpLogger serializer;
    public final MutableStateFlow write;

    public final MutableStateFlow read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        MutableStateFlow mutableStateFlow = this.write;
        int i5 = i3 + 65;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getQueryContext serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 9;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getQueryContext getquerycontext = this.IconCompatParcelizer;
        int i5 = i2 + 81;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getquerycontext;
    }

    public LivenessDetectionViewModel(getQueryContext getquerycontext, OtpLogger otpLogger, CreateEmptyCameraImageUseCaseImpl createEmptyCameraImageUseCaseImpl, onOpen onopen, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback) throws IOException {
        getquerycontext.getClass();
        otpLogger.getClass();
        createEmptyCameraImageUseCaseImpl.getClass();
        onopen.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        this.IconCompatParcelizer = getquerycontext;
        this.serializer = otpLogger;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new FrameworkSQLiteOpenHelperOpenHelper("Instruction", false));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
        this.read = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(27, onopen));
        createEmptyCameraImageUseCaseImpl.RemoteActionCompatParcelizer();
        systemLifecycleSystemLifecycleCallback.read();
    }

    public final onPostMigrate IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        onPostMigrate onpostmigrate = (onPostMigrate) this.read.MediaSessionCompatResultReceiverWrapper();
        int i3 = MediaDescriptionCompat + 27;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return onpostmigrate;
        }
        throw null;
    }

    public final void RemoteActionCompatParcelizer(setWebView setwebview) {
        int i = 2 % 2;
        setwebview.getClass();
        this.IconCompatParcelizer.serializer(new onCorruption(setwebview));
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void write(getKeyTemplate getkeytemplate) {
        int i = 2 % 2;
        getkeytemplate.getClass();
        this.IconCompatParcelizer.serializer(new SupportSQLiteOpenHelperCallback(getkeytemplate.name()));
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void IconCompatParcelizer(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.RemoteActionCompatParcelizer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, new FrameworkSQLiteOpenHelperOpenHelper(((FrameworkSQLiteOpenHelperOpenHelper) obj).write, z)));
        int i2 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void read(RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2) {
        int i = 2 % 2;
        roomDatabaseperformClear11.getClass();
        roomDatabaseExternalSyntheticLambda2.getClass();
        this.IconCompatParcelizer.serializer(new SupportSQLiteOpenHelperCallback("Failure/" + roomDatabaseperformClear11 + "/" + roomDatabaseExternalSyntheticLambda2));
        int i2 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        Object obj = null;
        this.serializer.IconCompatParcelizer.logEvent("liveness_stopped", null);
        onPostMigrate onpostmigrateIconCompatParcelizer = IconCompatParcelizer();
        MutableStateFlow mutableStateFlow = onpostmigrateIconCompatParcelizer.read;
        setTransactionSuccessful settransactionsuccessful = onpostmigrateIconCompatParcelizer.serializer;
        mutableStateFlow.IconCompatParcelizer(new SharedSQLiteStatement(new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.liveness_close_dialog_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_close_dialog_description), null, null, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_close_dialog_tertiary_action), 76, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_close_dialog_warning_action))));
        int i2 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
