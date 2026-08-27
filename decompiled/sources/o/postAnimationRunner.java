package o;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.login.logging.RouterLogger;
import io.sentry.util.UrlUtils;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: classes3.dex */
public final class postAnimationRunner implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public postAnimationRunner(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.IconCompatParcelizer = i;
        switch (i) {
            case 8:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 9:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 10:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 11:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 12:
            case 13:
            case 24:
            case 25:
            case 27:
            default:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 14:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 15:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 16:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 17:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 18:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 19:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 20:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 21:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 22:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 23:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 26:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 28:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 29:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
        }
    }

    public postAnimationRunner(getSharedElementTargetNames getsharedelementtargetnames) {
        this.IconCompatParcelizer = 1;
        getsharedelementtargetnames.getClass();
        this.write = getsharedelementtargetnames;
    }

    public postAnimationRunner(hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.IconCompatParcelizer = i;
        hasnestedscrollingparent.getClass();
        if (i == 13) {
            this.write = hasnestedscrollingparent;
            return;
        }
        if (i == 25) {
            this.write = hasnestedscrollingparent;
        } else if (i != 27) {
            this.write = hasnestedscrollingparent;
        } else {
            this.write = hasnestedscrollingparent;
        }
    }

    public postAnimationRunner(postAnimationRunner postanimationrunner) {
        this.IconCompatParcelizer = 7;
        postanimationrunner.getClass();
        this.write = postanimationrunner;
    }

    public postAnimationRunner(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime) {
        this.IconCompatParcelizer = 2;
        setusetemptrackingtableroom_runtime.getClass();
        this.write = setusetemptrackingtableroom_runtime;
    }

    public postAnimationRunner(setPresentationView setpresentationview) {
        this.IconCompatParcelizer = 24;
        setpresentationview.getClass();
        this.write = setpresentationview;
    }

    public postAnimationRunner(AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, setPresentationView setpresentationview) {
        this.IconCompatParcelizer = 5;
        setpresentationview.getClass();
        this.write = setpresentationview;
    }

    public postAnimationRunner(io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, hasNestedScrollingParent hasnestedscrollingparent) {
        this.IconCompatParcelizer = 6;
        hasnestedscrollingparent.getClass();
        this.write = hasnestedscrollingparent;
    }

    public postAnimationRunner(ImageHeaderParserImageType imageHeaderParserImageType, hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.IconCompatParcelizer = i;
        hasnestedscrollingparent.getClass();
        if (i != 4) {
            this.write = hasnestedscrollingparent;
        } else {
            this.write = hasnestedscrollingparent;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        int i3 = 7;
        Object obj = null;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                return new onExitLayoutOrScroll((transferSessionPackageI) objWrite);
            case 1:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new SaveHeatmapUrlImpl(i3, (setHasOptionsMenu) objWrite2);
            case 2:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new setSharedElementEnterTransition((setPopDirection) objWrite3);
            case 3:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new getAdapterPosition((Application) objWrite4);
            case 4:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new getLayoutPosition((Application) objWrite5);
            case 5:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(UrlUtils.serializer(), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
            case 6:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                Object systemService = ((Application) objWrite7).getSystemService("clipboard");
                systemService.getClass();
                return (android.content.ClipboardManager) systemService;
            case 7:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                setPageTransformer setpagetransformer = new setPageTransformer((ViewPager2SavedState1) objWrite8);
                int i4 = RemoteActionCompatParcelizer + 41;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return setpagetransformer;
                }
                obj.hashCode();
                throw null;
            case 8:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new ViewPager2SavedState1((transferSessionPackageI) objWrite9);
            case 9:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new SignInDataStore((setTransactionSuccessful) objWrite10);
            case 10:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new ApiHelperForM3((androidx.work.impl.WorkManagerImpl) objWrite11);
            case 11:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new WorkManagerInitializer((decode) objWrite12);
            case 12:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new subscribeToBannersErrorslambda0((Application) objWrite13);
            case 13:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((Application) objWrite14);
                firebaseAnalytics.getClass();
                return firebaseAnalytics;
            case 14:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new isMainThread(15, (transactionWithResult) objWrite15);
            case 15:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new rollback((transferSessionPackageI) objWrite16);
            case 16:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new RouterLogger((transferSessionPackageI) objWrite17, displayInAppMessagelambda9.write);
            case 17:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new h3((setLastHorizontalStyle) objWrite18);
            case 18:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new buildGdprPackage((setLastHorizontalStyle) objWrite19);
            case 19:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new h5((removeRearDisplayPresentationStatusListener) objWrite20);
            case 20:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                hb hbVar = new hb((transferSessionPackageI) objWrite21);
                int i5 = RemoteActionCompatParcelizer + 7;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return hbVar;
                }
                throw null;
            case 21:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new h9((setTransactionSuccessful) objWrite22);
            case 22:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new createQuery((transferSessionPackageI) objWrite23, 2);
            case 23:
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                ihExternalSyntheticLambda9 ihexternalsyntheticlambda9 = new ihExternalSyntheticLambda9((j8) objWrite24);
                int i6 = read + 105;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return ihexternalsyntheticlambda9;
            case 24:
                new AndroidUiDispatcherCompanioncurrentThread1(17);
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                return new j4();
            case 25:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                j8 j8Var = new j8();
                j8Var.read = j7.DEFAULT;
                return j8Var;
            case 26:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new shouldSkipDump((setTransactionSuccessful) objWrite27);
            case 27:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new k6((Application) objWrite28);
            case 28:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new h3((setLastHorizontalStyle) objWrite29, new j4());
            default:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new n2ExternalSyntheticLambda0((n0) objWrite30);
        }
    }
}
