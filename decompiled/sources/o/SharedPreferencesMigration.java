package o;

import android.app.Application;
import android.content.SharedPreferences;
import coil3.ImageLoader$Builder;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatRepository;
import com.roadrunner.liveness.domain.CreateEmptyCameraImageUseCaseImpl;
import com.roadrunner.liveness.recording.domain.livenessimage.ImageCaptureUseCaseImpl;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.domain.IsRiderInsideActiveAreaBoundaryImpl;
import io.sentry.CombinedScopeView;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesMigration implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public SharedPreferencesMigration(isMainThread ismainthread, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3) {
        this.RemoteActionCompatParcelizer = 4;
        this.write = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.serializer = mergejsonobjects3;
    }

    public /* synthetic */ SharedPreferencesMigration(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.serializer = mergejsonobjects3;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.serializer;
        mergeJsonObjects mergejsonobjects2 = this.read;
        mergeJsonObjects mergejsonobjects3 = this.write;
        switch (i4) {
            case 0:
                return new CombinedScopeView((Application) mergejsonobjects3.write(), (getFragmentManager) mergejsonobjects2.write(), (getExitAnim) mergejsonobjects.write());
            case 1:
                SemanticsNodedefault semanticsNodedefault = (SemanticsNodedefault) mergejsonobjects3.write();
                addSemanticsPropertiesFrom addsemanticspropertiesfrom = (addSemanticsPropertiesFrom) SemanticsNode.read.write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects2.write();
                Application application = (Application) mergejsonobjects.write();
                semanticsNodedefault.getClass();
                addsemanticspropertiesfrom.getClass();
                transfersessionpackagei.getClass();
                application.getClass();
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
                imageLoader$Builder.RemoteActionCompatParcelizer = semanticsNodedefault;
                imageLoader$Builder.IconCompatParcelizer = addsemanticspropertiesfrom;
                imageLoader$Builder.read = transfersessionpackagei;
                imageLoader$Builder.serializer = application;
                return imageLoader$Builder;
            case 2:
                return new forEachUnmergedChild((SemanticsNodedefault) mergejsonobjects3.write(), (resetTransientState) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 3:
                return new onAutofillTextdefault((transferSessionPackageI) mergejsonobjects3.write(), (setTransactionSuccessful) mergejsonobjects2.write(), (getCustomActionsdelegate) mergejsonobjects.write());
            case 4:
                TextUnitType textUnitType = (TextUnitType) mergejsonobjects3.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects2.write();
                transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) mergejsonobjects.write();
                textUnitType.getClass();
                settransactionsuccessful.getClass();
                transfersessionpackagei2.getClass();
                return new CustomerChatRepository(textUnitType, settransactionsuccessful, transfersessionpackagei2);
            case 5:
                return new r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE((Application) mergejsonobjects3.write(), (SharedPreferences) mergejsonobjects2.write(), (registerOnChangedCallback) mergejsonobjects.write());
            case 6:
                return new NonNullValueClassSaver((registerOnChangedCallback) mergejsonobjects3.write(), (getScreenOffsetnOccac) mergejsonobjects2.write(), (r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE) mergejsonobjects.write());
            case 7:
                return new ParagraphInfo((TextUnitType) mergejsonobjects3.write(), (minIntrinsicWidth_delegatelambda0) mergejsonobjects2.write(), (getInfoListui_text) mergejsonobjects.write());
            case 8:
                return new getTextDirections_7Xco((registerOnChangedCallback) mergejsonobjects3.write(), (setTransactionSuccessful) mergejsonobjects2.write(), (SharedPreferences) mergejsonobjects.write());
            case 9:
                return new TextRangeKt((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 10:
                return new getSubpixelTextPositioningui_text((decode) mergejsonobjects3.write(), (FontEj4NQ78default) mergejsonobjects2.write(), (Clock) mergejsonobjects.write());
            case 11:
                return new getStartEllipsisgIe3tQ8annotations((Application) mergejsonobjects3.write(), (TextOverflowCompanion) mergejsonobjects2.write(), (getEllipsisgIe3tQ8annotations) mergejsonobjects.write());
            case 12:
                return new ImageCaptureUseCaseImpl((onUpgrade) mergejsonobjects3.write(), (CreateEmptyCameraImageUseCaseImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 13:
                removeRearDisplayStatusListener removereardisplaystatuslistener = new removeRearDisplayStatusListener((GetLocationUpdatesUseCaseImpl) mergejsonobjects3.write(), (removeRearDisplayPresentationStatusListener) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
                int i5 = IconCompatParcelizer + 103;
                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 95 / 0;
                }
                return removereardisplaystatuslistener;
            case 14:
                return new getVersion((Application) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 15:
                return new IsRiderInsideActiveAreaBoundaryImpl((OpportunitiesRepository) mergejsonobjects3.write(), (removeRearDisplayPresentationStatusListener) mergejsonobjects2.write(), (IsRiderInsideAreaUseCaseImpl) mergejsonobjects.write());
            case 16:
                return new CombinedScopeView((x1) mergejsonobjects3.write(), (vg) mergejsonobjects2.write(), (subscribeToBannersUpdateslambda2) mergejsonobjects.write());
            case 17:
                return new DiskLruCacheEditor((Application) mergejsonobjects3.write(), (getContentViewGroupParentLayout) mergejsonobjects2.write(), (StaticImageDecoder) mergejsonobjects.write());
            case 18:
                return new access1000((decode) mergejsonobjects3.write(), (WebViewBuilderException) mergejsonobjects2.write(), (getError) mergejsonobjects.write());
            case 19:
                accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp = new accessgetSdkEnablementProvidercp((SemanticsOwner) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
                int i7 = MediaSessionCompatQueueItem + 57;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return accessgetsdkenablementprovidercp;
            default:
                CombinedScopeView combinedScopeView = new CombinedScopeView((accesssetShouldRequestFrameworkListenToNetworkUpdatescp) mergejsonobjects3.write(), (IsRiderInsideAreaUseCaseImpl) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
                int i9 = IconCompatParcelizer + 67;
                MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return combinedScopeView;
        }
    }
}
