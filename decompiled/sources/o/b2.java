package o;

import com.roadrunner.customerchat.legacy.chatlist.presentation.compose.CustomerChatsScreenKt$CustomerChatsScreen$1$1;
import com.roadrunner.login.presentation.navigation.LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public final /* synthetic */ androidx.compose.material3.SnackbarHostState serializer;
    public final /* synthetic */ getContentViewGroupParentLayout write;

    public /* synthetic */ b2(getContentViewGroupParentLayout getcontentviewgroupparentlayout, androidx.compose.material3.SnackbarHostState snackbarHostState, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.IconCompatParcelizer = i;
        this.write = getcontentviewgroupparentlayout;
        this.serializer = snackbarHostState;
        this.read = populateViewStructure_androidKtpopulate7;
    }

    public /* synthetic */ b2(getContentViewGroupParentLayout getcontentviewgroupparentlayout, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, androidx.compose.material3.SnackbarHostState snackbarHostState, int i) {
        this.IconCompatParcelizer = i;
        this.write = getcontentviewgroupparentlayout;
        this.read = populateViewStructure_androidKtpopulate7;
        this.serializer = snackbarHostState;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.write;
        if (i3 == 0) {
            setWebView setwebview = (setWebView) obj;
            setwebview.getClass();
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.serializer, this.read, setwebview, (ShortNewsContentCardView) null, 0), 3);
            return createfromparcel2;
        }
        if (i3 == 1) {
            setWebView setwebview2 = (setWebView) obj;
            setwebview2.getClass();
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.serializer, this.read, setwebview2, (ShortNewsContentCardView) null, 1), 3);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ActivityHandler33 activityHandler33 = (ActivityHandler33) obj;
            activityHandler33.getClass();
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ReconnectScheduler$schedule$1(this.read, activityHandler33, this.serializer, null, 28), 3);
            int i4 = MediaSessionCompatQueueItem + 39;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        if (i3 == 3) {
            setWebView setwebview3 = (setWebView) obj;
            setwebview3.getClass();
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.read, setwebview3, this.serializer, (ShortNewsContentCardView) null, 3), 3);
            return createfromparcel2;
        }
        if (i3 != 4) {
            setCoppaComplianceInDelay setcoppacomplianceindelay = (setCoppaComplianceInDelay) obj;
            setcoppacomplianceindelay.getClass();
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ReconnectScheduler$schedule$1(this.read, setcoppacomplianceindelay, this.serializer, null, 27), 3);
            return createfromparcel2;
        }
        String str = (String) obj;
        str.getClass();
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CustomerChatsScreenKt$CustomerChatsScreen$1$1(this.read, str, this.serializer, null, 1), 3);
        return createfromparcel2;
    }
}
