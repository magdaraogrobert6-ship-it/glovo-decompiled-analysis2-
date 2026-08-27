package o;

import android.graphics.Bitmap;
import java.time.LocalDate;
import java.util.List;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class downloadFileToPathlambda1 {
    public static final Bitmap RemoteActionCompatParcelizer(accessrewindjd accessrewindjdVar, getBlurRadiusannotations getblurradiusannotations, List list) {
        if (accessrewindjdVar instanceof accessiteratorjd) {
            Bitmap bitmap = ((accessiteratorjd) accessrewindjdVar).serializer;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            if (onContentCardClicked.IconCompatParcelizer(accessgetBevelcp.write, config)) {
                return bitmap;
            }
        }
        return setNativeShader.read(RegexKt.RemoteActionCompatParcelizer(accessrewindjdVar, getblurradiusannotations.write.getResources()), (Bitmap.Config) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.IconCompatParcelizer), getblurradiusannotations.MediaSessionCompatQueueItem, getblurradiusannotations.MediaBrowserCompatMediaItem, (accessgetLayerBlockp) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOUdefault.write), getblurradiusannotations.MediaDescriptionCompat == getNoneannotations.INEXACT);
    }

    public static final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release serializer(InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1, deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda0) {
        inAppMessageManagerBaseExternalSyntheticLambda1.getClass();
        LocalDate localDate = inAppMessageManagerBaseExternalSyntheticLambda1.value;
        return new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), deletesharedpreferencesfilelambda0.a, deletesharedpreferencesfilelambda0.b);
    }
}
