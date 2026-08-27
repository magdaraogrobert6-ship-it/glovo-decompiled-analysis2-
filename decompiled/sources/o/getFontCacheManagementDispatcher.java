package o;

import com.roadrunner.delivery.ontheway.navigation.domain.GetNavigationButtonAction;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.NavigationSettingsDialogManagerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShowNavigationSettingsTooltipUseCaseImpl;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getFontCacheManagementDispatcher {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final access500 read;

    public getFontCacheManagementDispatcher(access500 access500Var) {
        this.read = access500Var;
    }

    public final NavigationButtonUiModelImpl IconCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        access500 access500Var = this.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.RatingCompat).write();
        objWrite.getClass();
        onInitialized oninitialized = (onInitialized) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.serializer).write();
        objWrite2.getClass();
        setBrush12SF9DM setbrush12sf9dm = (setBrush12SF9DM) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.IconCompatParcelizer).write();
        objWrite3.getClass();
        GetNavigationButtonAction getNavigationButtonAction = (GetNavigationButtonAction) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.MediaDescriptionCompat).write();
        objWrite4.getClass();
        accessgetParagraphcp accessgetparagraphcp = (accessgetParagraphcp) objWrite4;
        getQueryContext getquerycontext = new getQueryContext();
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.write).write();
        objWrite5.getClass();
        LineBreakStrictnessCompanion lineBreakStrictnessCompanion = (LineBreakStrictnessCompanion) objWrite5;
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.MediaSessionCompatQueueItem).write();
        objWrite6.getClass();
        NavigationSettingsDialogManagerImpl navigationSettingsDialogManagerImpl = (NavigationSettingsDialogManagerImpl) objWrite6;
        Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.read).write();
        objWrite7.getClass();
        getFontLoaded getfontloaded = (getFontLoaded) objWrite7;
        Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) access500Var.MediaMetadataCompat).write();
        objWrite8.getClass();
        NavigationButtonUiModelImpl navigationButtonUiModelImpl = new NavigationButtonUiModelImpl(oninitialized, setbrush12sf9dm, getNavigationButtonAction, accessgetparagraphcp, contextScope, getquerycontext, lineBreakStrictnessCompanion, navigationSettingsDialogManagerImpl, getfontloaded, (ShowNavigationSettingsTooltipUseCaseImpl) objWrite8, (CallTracer) ((onCapabilitiesChanged) access500Var.RemoteActionCompatParcelizer).write());
        int i2 = RemoteActionCompatParcelizer + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return navigationButtonUiModelImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
