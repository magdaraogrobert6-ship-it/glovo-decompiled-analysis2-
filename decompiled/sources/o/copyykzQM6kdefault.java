package o;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.graphics.Fields;
import bo.app.n$$ExternalSyntheticLambda3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import o.AndroidGraphicsContext2;
import o.copyNH1kkwU;
import o.copyciSxzs0;
import o.copyykzQM6kdefault;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class copyykzQM6kdefault {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final onBackPressed IconCompatParcelizer;
    public final onBackPressed read;
    public final AndroidGraphicsContext2 write;

    public final AndroidGraphicsContext2 write() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        AndroidGraphicsContext2 androidGraphicsContext2 = this.write;
        int i5 = i3 + 7;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return androidGraphicsContext2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public copyykzQM6kdefault(androidx.activity.result.ActivityResultRegistry activityResultRegistry) {
        activityResultRegistry.getClass();
        this.write = new AndroidGraphicsContext2();
        final int i = 1;
        final int i2 = 0;
        activityResultRegistry.register("Image Picker", new onPictureInPictureModeChanged(i), new getNavigationEventDispatcher(this) { // from class: com.roadrunner.customerchat.selfservice.presentation.navigator.ImageSelectionNavigator$$ExternalSyntheticLambda0
            private static int serializer = 1;
            private static int write;
            public final /* synthetic */ copyykzQM6kdefault IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getNavigationEventDispatcher
            public final void onActivityResult(Object obj) {
                Uri data;
                int i3 = 2 % 2;
                int i4 = serializer + 3;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                Object copynh1kkwu = copyciSxzs0.serializer;
                copyykzQM6kdefault copyykzqm6kdefault = this.IconCompatParcelizer;
                if (i6 == 0) {
                    Uri uri = (Uri) obj;
                    AndroidGraphicsContext2 androidGraphicsContext2 = copyykzqm6kdefault.write;
                    if (uri != null) {
                        copynh1kkwu = new copyNH1kkwU(55661, uri);
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(copynh1kkwu);
                    return;
                }
                if (i6 == 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AndroidGraphicsContext2 androidGraphicsContext3 = copyykzqm6kdefault.write;
                    if (zBooleanValue) {
                        copynh1kkwu = new copyNH1kkwU(55660, null);
                    }
                    androidGraphicsContext3.RemoteActionCompatParcelizer(copynh1kkwu);
                    return;
                }
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                AndroidGraphicsContext2 androidGraphicsContext4 = copyykzqm6kdefault.write;
                if (activityResult.write == -1) {
                    int i7 = write + 3;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    if (intent != null) {
                        data = intent.getData();
                        int i9 = serializer + 55;
                        write = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    } else {
                        data = null;
                    }
                    copynh1kkwu = data != null ? new copyNH1kkwU(55662, data) : new copyNH1kkwU(55662, null);
                }
                androidGraphicsContext4.RemoteActionCompatParcelizer(copynh1kkwu);
            }
        });
        this.read = activityResultRegistry.register("Camera", new onPictureInPictureModeChanged(0 == true ? 1 : 0, 0 == true ? 1 : 0), new getNavigationEventDispatcher(this) { // from class: com.roadrunner.customerchat.selfservice.presentation.navigator.ImageSelectionNavigator$$ExternalSyntheticLambda0
            private static int serializer = 1;
            private static int write;
            public final /* synthetic */ copyykzQM6kdefault IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getNavigationEventDispatcher
            public final void onActivityResult(Object obj) {
                Uri data;
                int i3 = 2 % 2;
                int i4 = serializer + 3;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i;
                Object copynh1kkwu = copyciSxzs0.serializer;
                copyykzQM6kdefault copyykzqm6kdefault = this.IconCompatParcelizer;
                if (i6 == 0) {
                    Uri uri = (Uri) obj;
                    AndroidGraphicsContext2 androidGraphicsContext2 = copyykzqm6kdefault.write;
                    if (uri != null) {
                        copynh1kkwu = new copyNH1kkwU(55661, uri);
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(copynh1kkwu);
                    return;
                }
                if (i6 == 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AndroidGraphicsContext2 androidGraphicsContext3 = copyykzqm6kdefault.write;
                    if (zBooleanValue) {
                        copynh1kkwu = new copyNH1kkwU(55660, null);
                    }
                    androidGraphicsContext3.RemoteActionCompatParcelizer(copynh1kkwu);
                    return;
                }
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                AndroidGraphicsContext2 androidGraphicsContext4 = copyykzqm6kdefault.write;
                if (activityResult.write == -1) {
                    int i7 = write + 3;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    if (intent != null) {
                        data = intent.getData();
                        int i9 = serializer + 55;
                        write = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    } else {
                        data = null;
                    }
                    copynh1kkwu = data != null ? new copyNH1kkwU(55662, data) : new copyNH1kkwU(55662, null);
                }
                androidGraphicsContext4.RemoteActionCompatParcelizer(copynh1kkwu);
            }
        });
        final int i3 = 2;
        this.IconCompatParcelizer = activityResultRegistry.register("Chooser", new times7Ah8Wj8(i3), new getNavigationEventDispatcher(this) { // from class: com.roadrunner.customerchat.selfservice.presentation.navigator.ImageSelectionNavigator$$ExternalSyntheticLambda0
            private static int serializer = 1;
            private static int write;
            public final /* synthetic */ copyykzQM6kdefault IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getNavigationEventDispatcher
            public final void onActivityResult(Object obj) {
                Uri data;
                int i4 = 2 % 2;
                int i5 = serializer + 3;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                Object copynh1kkwu = copyciSxzs0.serializer;
                copyykzQM6kdefault copyykzqm6kdefault = this.IconCompatParcelizer;
                if (i7 == 0) {
                    Uri uri = (Uri) obj;
                    AndroidGraphicsContext2 androidGraphicsContext2 = copyykzqm6kdefault.write;
                    if (uri != null) {
                        copynh1kkwu = new copyNH1kkwU(55661, uri);
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(copynh1kkwu);
                    return;
                }
                if (i7 == 1) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AndroidGraphicsContext2 androidGraphicsContext3 = copyykzqm6kdefault.write;
                    if (zBooleanValue) {
                        copynh1kkwu = new copyNH1kkwU(55660, null);
                    }
                    androidGraphicsContext3.RemoteActionCompatParcelizer(copynh1kkwu);
                    return;
                }
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                AndroidGraphicsContext2 androidGraphicsContext4 = copyykzqm6kdefault.write;
                if (activityResult.write == -1) {
                    int i8 = write + 3;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    if (intent != null) {
                        data = intent.getData();
                        int i10 = serializer + 55;
                        write = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else {
                        data = null;
                    }
                    copynh1kkwu = data != null ? new copyNH1kkwU(55662, data) : new copyNH1kkwU(55662, null);
                }
                androidGraphicsContext4.RemoteActionCompatParcelizer(copynh1kkwu);
            }
        });
    }

    public final void RemoteActionCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, mergedefault mergedefaultVar) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        selfServiceCustomerChatActivity.getClass();
        boolean z = mergedefaultVar instanceof copyElsmlbk;
        if (!z) {
            if (!(mergedefaultVar instanceof getLineBreakLgCVezo)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            try {
                new n$$ExternalSyntheticLambda3(this, selfServiceCustomerChatActivity, mergedefaultVar, 17).invoke();
                return;
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Image selection failed. selectionType=".concat(z ? "Camera" : "NativeChooser"), new Object[0]);
                Toast.makeText(selfServiceCustomerChatActivity, selfServiceCustomerChatActivity.getText(com.logistics.rider.glovo.R.string.all_error_message), 0).show();
                return;
            }
        }
        int i4 = serializer + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i4 % 2 != 0) {
                this.read.write(((copyElsmlbk) mergedefaultVar).serializer);
            } else {
                this.read.write(((copyElsmlbk) mergedefaultVar).serializer);
                int i5 = 18 / 0;
            }
        } catch (Exception e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Image selection failed. selectionType=".concat("Camera"), new Object[0]);
            Toast.makeText(selfServiceCustomerChatActivity, selfServiceCustomerChatActivity.getText(com.logistics.rider.glovo.R.string.all_error_message), 0).show();
        }
    }
}
