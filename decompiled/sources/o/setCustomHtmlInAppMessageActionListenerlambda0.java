package o;

import io.sentry.android.core.AppState$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class setCustomHtmlInAppMessageActionListenerlambda0 extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final setCustomHtmlInAppMessageActionListenerlambda0 IconCompatParcelizer = new setCustomHtmlInAppMessageActionListenerlambda0(3, setCustomControlInAppMessageManagerListenerlambda0.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        setCustomControlInAppMessageManagerListenerlambda0 setcustomcontrolinappmessagemanagerlistenerlambda0 = (setCustomControlInAppMessageManagerListenerlambda0) obj;
        setBackButtonDismissesInAppMessageViewlambda0 setbackbuttondismissesinappmessageviewlambda0 = (setBackButtonDismissesInAppMessageViewlambda0) obj2;
        long j = setcustomcontrolinappmessagemanagerlistenerlambda0.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (j <= 0) {
            ((SelectImplementation) setbackbuttondismissesinappmessageviewlambda0).MediaMetadataCompat = createfromparcel;
            return createfromparcel;
        }
        AppState$$ExternalSyntheticLambda0 appState$$ExternalSyntheticLambda0 = new AppState$$ExternalSyntheticLambda0(setbackbuttondismissesinappmessageviewlambda0, 11, setcustomcontrolinappmessagemanagerlistenerlambda0);
        setbackbuttondismissesinappmessageviewlambda0.getClass();
        SelectImplementation selectImplementation = (SelectImplementation) setbackbuttondismissesinappmessageviewlambda0;
        TextAnnouncementContentCardView textAnnouncementContentCardView = selectImplementation.RemoteActionCompatParcelizer;
        selectImplementation.IconCompatParcelizer = DelayKt.serializer(textAnnouncementContentCardView).write(j, appState$$ExternalSyntheticLambda0, textAnnouncementContentCardView);
        return createfromparcel;
    }

    public setCustomHtmlInAppMessageActionListenerlambda0(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
