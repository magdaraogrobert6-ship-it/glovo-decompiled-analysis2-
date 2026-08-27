package o;

import com.roadrunner.auth.domain.logout.LogoutUserUseCaseImpl;
import com.roadrunner.auth.logout.presentation.LogoutViewModel;
import com.roadrunner.auth.statemachine.AuthStateMachine;

/* JADX INFO: loaded from: classes3.dex */
public final class setEditableText implements setFillableData {
    private static int read = 0;
    private static int write = 1;
    public final androidx.lifecycle.BlockRunner IconCompatParcelizer;

    public setEditableText(androidx.lifecycle.BlockRunner blockRunner) {
        this.IconCompatParcelizer = blockRunner;
    }

    public final LogoutViewModel read(String str) {
        int i = 2 % 2;
        androidx.lifecycle.BlockRunner blockRunner = this.IconCompatParcelizer;
        LogoutViewModel logoutViewModel = new LogoutViewModel(str, (LogoutUserUseCaseImpl) ((mergeJsonObjects) blockRunner.read).write(), (SemanticsPropertiesTestTag1) ((mergeJsonObjects) blockRunner.serializer).write(), (AuthStateMachine) ((mergeJsonObjects) blockRunner.RatingCompat).write(), (transferSessionPackageI) ((mergeJsonObjects) blockRunner.write).write(), (setTransactionSuccessful) ((mergeJsonObjects) blockRunner.RemoteActionCompatParcelizer).write(), (getDisabled) ((mergeJsonObjects) blockRunner.IconCompatParcelizer).write(), new getQueryContext());
        int i2 = write + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return logoutViewModel;
    }
}
