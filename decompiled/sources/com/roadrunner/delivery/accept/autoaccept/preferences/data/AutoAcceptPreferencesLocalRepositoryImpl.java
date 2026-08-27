package com.roadrunner.delivery.accept.autoaccept.preferences.data;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.TextRangeKt;
import o.createFromParcel;
import o.getTextForegroundStyleui_text;
import o.inCompatibilityMode;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptPreferencesLocalRepositoryImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final TextRangeKt RemoteActionCompatParcelizer;
    public final AutoAcceptPreferencesDataStoreImpl serializer;

    public AutoAcceptPreferencesLocalRepositoryImpl(AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl, TextRangeKt textRangeKt) {
        autoAcceptPreferencesDataStoreImpl.getClass();
        textRangeKt.getClass();
        this.serializer = autoAcceptPreferencesDataStoreImpl;
        this.RemoteActionCompatParcelizer = textRangeKt;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4
  0x002b: PHI (r1v9 o.getTextForegroundStyleui_text) = (r1v8 o.getTextForegroundStyleui_text), (r1v11 o.getTextForegroundStyleui_text) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v4 int) = (r4v3 int), (r4v6 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public final Object setAutoAcceptOpted(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        getTextForegroundStyleui_text gettextforegroundstyleui_text;
        int i;
        int i2 = 2 % 2;
        int i3 = 0;
        if (continuationImpl instanceof getTextForegroundStyleui_text) {
            int i4 = IconCompatParcelizer + 43;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                gettextforegroundstyleui_text = (getTextForegroundStyleui_text) continuationImpl;
                i = gettextforegroundstyleui_text.RemoteActionCompatParcelizer;
                int i5 = 88 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i6 = read + 91;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    gettextforegroundstyleui_text.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    gettextforegroundstyleui_text = new getTextForegroundStyleui_text(this, continuationImpl);
                }
            } else {
                gettextforegroundstyleui_text = (getTextForegroundStyleui_text) continuationImpl;
                i = gettextforegroundstyleui_text.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i8 = read + 91;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    gettextforegroundstyleui_text.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    gettextforegroundstyleui_text = new getTextForegroundStyleui_text(this, continuationImpl);
                }
            }
        } else {
            gettextforegroundstyleui_text = new getTextForegroundStyleui_text(this, continuationImpl);
        }
        Object obj = gettextforegroundstyleui_text.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = gettextforegroundstyleui_text.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            gettextforegroundstyleui_text.write = z;
            gettextforegroundstyleui_text.RemoteActionCompatParcelizer = 1;
            AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl = this.serializer;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(autoAcceptPreferencesDataStoreImpl.read, new AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2(autoAcceptPreferencesDataStoreImpl, z, shortNewsContentCardView, i3), gettextforegroundstyleui_text);
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer == coroutineSingletons) {
                int i11 = read + 91;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 4 / 2;
                }
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = gettextforegroundstyleui_text.write;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        gettextforegroundstyleui_text.write = z;
        gettextforegroundstyleui_text.RemoteActionCompatParcelizer = 2;
        TextRangeKt textRangeKt = this.RemoteActionCompatParcelizer;
        ((inCompatibilityMode) textRangeKt.IconCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new TextFieldSelectionManager$copy$1(textRangeKt, z, shortNewsContentCardView, 3), gettextforegroundstyleui_text);
        if (objWithContext != coroutineSingletons) {
            objWithContext = createfromparcel;
        }
        return objWithContext == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }
}
