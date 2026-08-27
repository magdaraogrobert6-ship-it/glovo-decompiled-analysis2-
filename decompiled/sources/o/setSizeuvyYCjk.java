package o;

import androidx.camera.video.Recorder$3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import io.reactivex.disposables.Disposable;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class setSizeuvyYCjk implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public setSizeuvyYCjk(Object obj) {
        this.read = 2;
        this.IconCompatParcelizer = (Object[]) obj;
    }

    public /* synthetic */ setSizeuvyYCjk(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = null;
        switch (i2) {
            case 0:
                ((clipCanvasToPath) ((getMessageTextView) obj2)).write();
                return createfromparcel;
            case 1:
                float[] fArrM992unboximpl = ((androidx.compose.ui.graphics.Matrix) obj).m992unboximpl();
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) obj2;
                if (layoutCoordinates.isAttached()) {
                    int i3 = write + 117;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).mo2224transformFromEL8BTi8(layoutCoordinates, fArrM992unboximpl);
                        obj3.hashCode();
                        throw null;
                    }
                    androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).mo2224transformFromEL8BTi8(layoutCoordinates, fArrM992unboximpl);
                }
                return createfromparcel;
            case 2:
                Object obj4 = ((Object[]) obj2)[((Number) obj).intValue()];
                if (obj4 != null) {
                    return (String) obj4;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null cannot be cast to non-null type kotlin.String");
                return null;
            case 3:
                div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) ((setDropDownVerticalOffset) obj2).IconCompatParcelizer;
                if (div7ah8wj8 == null) {
                    int i4 = serializer + 99;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        SentryLogcatAdapter.serializer("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                        throw null;
                    }
                    SentryLogcatAdapter.serializer("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                } else {
                    androidx.biometric.BiometricFragment biometricFragment = (androidx.biometric.BiometricFragment) div7ah8wj8.findFragmentByTag("androidx.biometric.BiometricFragment");
                    if (biometricFragment == null) {
                        SentryLogcatAdapter.serializer("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
                    } else {
                        biometricFragment.serializer(3);
                    }
                }
                return createfromparcel;
            case 4:
                Disposable disposable = ((WebChatViewModel) obj2).addObserverForBackInvokerlambda0.read;
                if (disposable != null) {
                    disposable.dispose();
                }
                return createfromparcel;
            case 5:
                setDrawResultui setdrawresultui = (setDrawResultui) obj;
                setdrawresultui.getClass();
                Recorder$3 recorder$3 = setdrawresultui.MediaSessionCompatQueueItem;
                ClipKt clipKt = setdrawresultui.MediaMetadataCompat;
                Recorder$3.RemoteActionCompatParcelizer(recorder$3, clipKt.MediaDescriptionCompat, 0.0f, 6);
                i$d.read(setdrawresultui.RatingCompat, clipKt.read, 0.0f, 6);
                i$d i_d = setdrawresultui.IconCompatParcelizer;
                clip clipVar = (clip) obj2;
                if (clipVar == null) {
                    int i5 = serializer + 57;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        clipVar = clipKt.RemoteActionCompatParcelizer;
                        int i6 = 73 / 0;
                    } else {
                        clipVar = clipKt.RemoteActionCompatParcelizer;
                    }
                }
                i$d.read(i_d, clipVar, 0.0f, 6);
                setdrawresultui.serializer(new DrawModifierKt(null, "spread"));
                return createfromparcel;
            case 6:
                ((androidx.compose.ui.graphics.Color) obj).m732unboximpl();
                ((PopulateViewStructure_androidKtpopulate7) obj2).setValue(null);
                return createfromparcel;
            case 7:
                setDrawResultui setdrawresultui2 = (setDrawResultui) obj;
                setdrawresultui2.getClass();
                Recorder$3 recorder$4 = setdrawresultui2.MediaSessionCompatQueueItem;
                ClipKt clipKt2 = setdrawresultui2.MediaMetadataCompat;
                Recorder$3.RemoteActionCompatParcelizer(recorder$4, clipKt2.MediaDescriptionCompat, 0.0f, 6);
                i$d.read(setdrawresultui2.RatingCompat, clipKt2.read, 0.0f, 6);
                Recorder$3.RemoteActionCompatParcelizer(setdrawresultui2.RemoteActionCompatParcelizer, (CacheDrawScopeonDrawBehind1) obj2, 0.0f, 6);
                setdrawresultui2.IconCompatParcelizer(new DrawModifierKt(null, "spread"));
                return createfromparcel;
            case 8:
                ((ExecutorService) obj2).shutdown();
                return createfromparcel;
            default:
                m7 m7Var = (m7) obj2;
                m7Var.IconCompatParcelizer().cancel();
                m7Var.RemoteActionCompatParcelizer().cancel();
                return createfromparcel;
        }
    }
}
