package com.foodora.courier.app.application;

import android.app.Application;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import dagger.Lazy;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler8;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.setLeft;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes2.dex */
public final class TextPrewarmInitializer implements SemanticsInfo {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read = 0;
    public final Object serializer;
    public final Object write;

    public TextPrewarmInitializer(Lazy lazy, IsUserSignedInImpl isUserSignedInImpl) {
        lazy.getClass();
        this.serializer = lazy;
        this.write = isUserSignedInImpl;
    }

    public TextPrewarmInitializer(Application application, transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.serializer = application;
        this.write = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        ActivityHandler8 activityHandler8;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.serializer;
        Object obj2 = this.write;
        if (i2 == 0) {
            if (((FirebaseRemoteConfigImpl) ((transferSessionPackageI) obj2)).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_TEXT_PREWARM_ENABLED.getFirebaseFlagName())) {
                Iterator it = SQLite.read(new Integer(R.font.notosans_regular), new Integer(R.font.notosans_bold), new Integer(R.font.notosans_medium), new Integer(R.font.notosans_semi_bold)).iterator();
                int i3 = RemoteActionCompatParcelizer + 73;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                while (it.hasNext()) {
                    int i5 = IconCompatParcelizer + 21;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        setLeft.serializer((Application) obj, ((Number) it.next()).intValue());
                        int i6 = 66 / 0;
                    } else {
                        setLeft.serializer((Application) obj, ((Number) it.next()).intValue());
                    }
                }
                StaticLayout.Builder.obtain("pre-warm text rendering off the main thread", 0, 43, new TextPaint(), 10).build();
            }
            return createfromparcel;
        }
        if (shortNewsContentCardView instanceof ActivityHandler8) {
            activityHandler8 = (ActivityHandler8) shortNewsContentCardView;
            int i7 = activityHandler8.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                activityHandler8.read = i7 - Integer.MIN_VALUE;
            } else {
                activityHandler8 = new ActivityHandler8(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            activityHandler8 = new ActivityHandler8(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object objInvoke = activityHandler8.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = activityHandler8.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            activityHandler8.read = 1;
            objInvoke = ((IsUserSignedInImpl) obj2).invoke(activityHandler8);
            if (objInvoke == coroutineSingletons) {
                int i9 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = IconCompatParcelizer + 41;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                int i11 = 95 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return createfromparcel;
        }
        ((Lazy) obj).write();
        return createfromparcel;
    }
}
