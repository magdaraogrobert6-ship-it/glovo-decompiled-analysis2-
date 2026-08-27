package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.roadrunner.settings.SettingsFragment;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;
import com.roadrunner.settings.subscreens.chatLanguageSelector.ChatLanguageSelectorFragment;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP implements areJsonObjectsEqual {
    private static int read = 0;
    private static int write = 1;
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION serializer;

    public /* synthetic */ getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 r8lambdalz7kyob69dcxfwdlkmjr4_8s_34, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = getstyleable_vector_drawable_group_rotation;
        this.IconCompatParcelizer = r8lambdalz7kyob69dcxfwdlkmjr4_8s_34;
    }

    @Override // o.areJsonObjectsEqual
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 serializer(Object obj) {
        int i = 2 % 2;
        int i2 = read + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 r8lambdalz7kyob69dcxfwdlkmjr4_8s_34 = this.IconCompatParcelizer;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = this.serializer;
        if (i4 == 0) {
            ((SettingsFragment) obj).getClass();
            androidx.transition.TransitionValuesMaps transitionValuesMaps = new androidx.transition.TransitionValuesMaps(getstyleable_vector_drawable_group_rotation, (E$b) r8lambdalz7kyob69dcxfwdlkmjr4_8s_34);
            int i5 = read + 55;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return transitionValuesMaps;
        }
        if (i4 == 1) {
            ((AppearanceFragment) obj).getClass();
            return new i$d(getstyleable_vector_drawable_group_rotation, (E$b) r8lambdalz7kyob69dcxfwdlkmjr4_8s_34, 14);
        }
        if (i4 == 2) {
            ((ChatLanguageSelectorFragment) obj).getClass();
            Recorder$3 recorder$3 = new Recorder$3(getstyleable_vector_drawable_group_rotation, (E$b) r8lambdalz7kyob69dcxfwdlkmjr4_8s_34);
            int i7 = write + 113;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return recorder$3;
        }
        if (i4 != 3) {
            ((SettingsNotificationsDiagnosticsFragment) obj).getClass();
            return new i$d(getstyleable_vector_drawable_group_rotation, (accessgetTvTeletextcp) r8lambdalz7kyob69dcxfwdlkmjr4_8s_34);
        }
        ((NavigationSettingsFragment) obj).getClass();
        i$d i_d = new i$d(getstyleable_vector_drawable_group_rotation, (E$b) r8lambdalz7kyob69dcxfwdlkmjr4_8s_34, 17);
        int i9 = write + 19;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return i_d;
    }
}
