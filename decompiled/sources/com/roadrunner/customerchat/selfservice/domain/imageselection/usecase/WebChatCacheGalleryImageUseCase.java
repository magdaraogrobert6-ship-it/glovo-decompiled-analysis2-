package com.roadrunner.customerchat.selfservice.domain.imageselection.usecase;

import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.Html_androidKt;
import o.ShortNewsContentCardView;
import o.fromHtmldefault;
import o.getAll_3YsG6Y;
import o.getNone_3YsG6Y;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatCacheGalleryImageUseCase implements getNone_3YsG6Y {
    private static int read = 0;
    private static int serializer = 1;
    public final DateTimeFormatter IconCompatParcelizer;
    public final SignInDataStore write;

    public WebChatCacheGalleryImageUseCase(SignInDataStore signInDataStore) {
        signInDataStore.getClass();
        this.write = signInDataStore;
        this.IconCompatParcelizer = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").withLocale(Locale.getDefault()).withZone(ZoneId.of("UTC"));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // o.getNone_3YsG6Y
    public final Object cacheGalleryImage(String str, ShortNewsContentCardView shortNewsContentCardView) {
        fromHtmldefault fromhtmldefault;
        int i = 2 % 2;
        int i2 = read + 49;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(shortNewsContentCardView instanceof fromHtmldefault)) {
            fromhtmldefault = new fromHtmldefault(this, (ContinuationImpl) shortNewsContentCardView);
        } else {
            fromhtmldefault = (fromHtmldefault) shortNewsContentCardView;
            int i4 = fromhtmldefault.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fromhtmldefault.read = i4 - Integer.MIN_VALUE;
            } else {
                fromhtmldefault = new fromHtmldefault(this, (ContinuationImpl) shortNewsContentCardView);
            }
        }
        Object objWithContext = fromhtmldefault.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = fromhtmldefault.read;
        Object obj = null;
        if (i5 != 0) {
            int i6 = read + 49;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("JPEG_GALLERY_", this.IconCompatParcelizer.format(Instant.now()));
            fromhtmldefault.read = 1;
            SignInDataStore signInDataStore = this.write;
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) signInDataStore.RemoteActionCompatParcelizer)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NavHostKt$NavHost$29$1(str, signInDataStore, strSerializer, null, 17), fromhtmldefault);
            if (objWithContext == coroutineSingletons) {
                int i8 = read + 31;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        }
        String str2 = (String) objWithContext;
        if (str2 == null) {
            return new getAll_3YsG6Y(new RuntimeException("Failed to cache image file."));
        }
        Html_androidKt html_androidKt = new Html_androidKt(str2);
        int i10 = serializer + 119;
        read = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return html_androidKt;
        }
        obj.hashCode();
        throw null;
    }
}
