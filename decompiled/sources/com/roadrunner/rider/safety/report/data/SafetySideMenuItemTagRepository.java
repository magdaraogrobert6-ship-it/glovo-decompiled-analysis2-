package com.roadrunner.rider.safety.report.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import o.ShortNewsContentCardView;
import o.addCallbackParameter;
import o.createFromParcel;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class SafetySideMenuItemTagRepository {
    private static int read = 0;
    private static int write = 1;
    public final isRoot RemoteActionCompatParcelizer;
    public final SafetyPreferencesDataStore serializer;

    public SafetySideMenuItemTagRepository(SafetyPreferencesDataStore safetyPreferencesDataStore, transferSessionPackageI transfersessionpackagei) {
        safetyPreferencesDataStore.getClass();
        transfersessionpackagei.getClass();
        this.serializer = safetyPreferencesDataStore;
        this.RemoteActionCompatParcelizer = new isRoot("safety_screen_display_count");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object incrementSafetyScreenDisplayCount(ContinuationImpl continuationImpl) {
        addCallbackParameter addcallbackparameter;
        SafetySideMenuItemTagRepository safetySideMenuItemTagRepository;
        int i = 2 % 2;
        if (continuationImpl instanceof addCallbackParameter) {
            addcallbackparameter = (addCallbackParameter) continuationImpl;
            int i2 = addcallbackparameter.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = read + 7;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                addcallbackparameter.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                addcallbackparameter = new addCallbackParameter(this, continuationImpl);
            }
        } else {
            addcallbackparameter = new addCallbackParameter(this, continuationImpl);
        }
        Object obj = addcallbackparameter.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = addcallbackparameter.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            addcallbackparameter.RemoteActionCompatParcelizer = this;
            addcallbackparameter.IconCompatParcelizer = 1;
            obj = this.serializer.get(this.RemoteActionCompatParcelizer, addcallbackparameter);
            if (obj == coroutineSingletons) {
                int i6 = read + 77;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                safetySideMenuItemTagRepository = this;
            }
        }
        int i8 = write;
        int i9 = i8 + 111;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0 ? i5 != 1 : i5 != 0) {
            if (i5 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i8 + 115;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        safetySideMenuItemTagRepository = addcallbackparameter.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int iIntValue = ((Number) obj).intValue();
        addcallbackparameter.RemoteActionCompatParcelizer = null;
        addcallbackparameter.IconCompatParcelizer = 2;
        Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(safetySideMenuItemTagRepository.serializer.read, new RxConvertKt$asFlow$1(iIntValue + 1, safetySideMenuItemTagRepository.RemoteActionCompatParcelizer, (ShortNewsContentCardView) null), addcallbackparameter);
        if (objSerializer == coroutineSingletons) {
            int i11 = read + 107;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        return objSerializer == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }
}
