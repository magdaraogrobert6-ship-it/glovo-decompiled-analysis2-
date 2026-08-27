package o;

import android.app.Application;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.delivery.accept.domain.DeclineDeliveriesUseCaseImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import com.roadrunner.delivery.overdue.data.IssueRepository;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.CreateHomeScope;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutCompat implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final /* synthetic */ int read;

    public LayoutCompat(getActionViewIntentlambda0 getactionviewintentlambda0, hasNestedScrollingParent hasnestedscrollingparent) {
        this.read = 8;
        this.IconCompatParcelizer = hasnestedscrollingparent;
    }

    public /* synthetic */ LayoutCompat(mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.IconCompatParcelizer = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        mergeJsonObjects mergejsonobjects = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                getSecondaryUpstream getsecondaryupstream = new getSecondaryUpstream((TextRangeKt) mergejsonobjects.write());
                int i3 = write + 53;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return getsecondaryupstream;
            case 1:
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) mergejsonobjects.write(), 1);
            case 2:
                return new hasSameLayoutAffectingAttributes((accessrequireViewFactoryHolder) mergejsonobjects.write(), (IsFixableByRetry) getSpanStyleui_text.write.write());
            case 3:
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new DeclineDeliveriesUseCaseImpl((IssueRepository) objWrite);
            case 4:
                return new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 0);
            case 5:
                return new unpackInt1((transferSessionPackageI) mergejsonobjects.write());
            case 6:
                return new InternalPlatformTextApi((TextRangeKt) mergejsonobjects.write());
            case 7:
                getDEFAULT_TEXT_DIRECTION_HEURISTICui_text getdefault_text_direction_heuristicui_text = new getDEFAULT_TEXT_DIRECTION_HEURISTICui_text((TextRangeKt) mergejsonobjects.write());
                int i5 = RemoteActionCompatParcelizer + 67;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return getdefault_text_direction_heuristicui_text;
            case 8:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                return androidx.datastore.preferences.core.PreferencesSerializer.write(null, new subscribeToContentCardsUpdateslambda30(application, 3), 7);
            case 9:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer.getClass();
                return new TypefaceSpan(lazySerializer);
            case 10:
                Object objWrite2 = mergejsonobjects.write();
                objWrite2.getClass();
                return new CreateHomeScope((FontEj4NQ78) objWrite2);
            case 11:
                Object objWrite3 = mergejsonobjects.write();
                objWrite3.getClass();
                return new zzz((AndroidFontResolveInterceptor_androidKt) objWrite3);
            case 12:
                return new SystemFontFamily((StateDataStoreImpl) mergejsonobjects.write());
            case 13:
                return new getNoneeUduSuo((transferSessionPackageI) mergejsonobjects.write());
            case 14:
                return new AndroidGenericFontFamilyTypeface((transferSessionPackageI) mergejsonobjects.write());
            case 15:
                return new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 2);
            case 16:
                Object objWrite4 = mergejsonobjects.write();
                objWrite4.getClass();
                return new packBytes((SettingsOnboardingDataStore) objWrite4);
            case 17:
                Object objWrite5 = mergejsonobjects.write();
                objWrite5.getClass();
                return new SendTestPushUseCase((nExternalSyntheticLambda2) objWrite5);
            case 18:
                Object objWrite6 = mergejsonobjects.write();
                objWrite6.getClass();
                return new SendTestPushUseCase((n0) objWrite6);
            case 19:
                Object objWrite7 = mergejsonobjects.write();
                objWrite7.getClass();
                return new SendTestPushUseCase((ib) objWrite7);
            case 20:
                Object objWrite8 = mergejsonobjects.write();
                objWrite8.getClass();
                return new SendTestPushUseCase((nExternalSyntheticLambda4) objWrite8);
            case 21:
                return new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 3);
            case 22:
                return new TextIndentKt((setVerticalStyle) mergejsonobjects.write());
            case 23:
                return new TextMotion((transferSessionPackageI) mergejsonobjects.write());
            case 24:
                return new getLinearity4e0Vf04ui_text((Application) mergejsonobjects.write(), new accessisMainThread());
            case 25:
                return new accessgetLinearcp((TextMotionCompanion) mergejsonobjects.write());
            case 26:
                return new accessgetEllipsiscp((transferSessionPackageI) mergejsonobjects.write());
            case 27:
                accessgetMiddleEllipsiscp accessgetmiddleellipsiscp = new accessgetMiddleEllipsiscp((accessrequireViewFactoryHolder) mergejsonobjects.write(), 0);
                int i7 = write + 49;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return accessgetmiddleellipsiscp;
            case 28:
                return new TextOverflowCompanion((Application) mergejsonobjects.write());
            default:
                return new getEllipsisgIe3tQ8annotations((Application) mergejsonobjects.write());
        }
    }
}
