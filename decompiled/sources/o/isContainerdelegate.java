package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.LogoutAlreadyStartedException;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class isContainerdelegate implements getIndexForKey {
    private static int read = 0;
    private static int write = 1;
    public final SemanticsPropertiesTestTag1 IconCompatParcelizer;
    public final AuthStateMachine RemoteActionCompatParcelizer;

    public isContainerdelegate(SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1, AuthStateMachine authStateMachine) {
        semanticsPropertiesTestTag1.getClass();
        authStateMachine.getClass();
        this.IconCompatParcelizer = semanticsPropertiesTestTag1;
        this.RemoteActionCompatParcelizer = authStateMachine;
    }

    public final void write(String str) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer.write(new setProgress(str));
        SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1 = this.IconCompatParcelizer;
        semanticsPropertiesTestTag1.getClass();
        if (!semanticsPropertiesTestTag1.IconCompatParcelizer.RemoteActionCompatParcelizer(SemanticsPropertiesShape1.IconCompatParcelizer, new SemanticsPropertiesText1(str))) {
            Timber.RemoteActionCompatParcelizer.write(new LogoutAlreadyStartedException(ff$$ExternalSyntheticOutline0.m("Failed to change authStateFlow to LOGOUT_REQUESTED state with invocation site ", str, ".")));
            int i2 = write + 17;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = read + 69;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
