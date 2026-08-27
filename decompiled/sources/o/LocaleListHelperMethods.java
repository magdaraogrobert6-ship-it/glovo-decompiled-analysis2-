package o;

import android.app.Application;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class LocaleListHelperMethods implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;

    public LocaleListHelperMethods(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i == 27) {
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 29) {
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        switch (i) {
            case 2:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 3:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 4:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 5:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 6:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 7:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 8:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            default:
                switch (i) {
                    case 14:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 15:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 16:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 17:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 18:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    default:
                        switch (i) {
                            case 23:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            case 24:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            case 25:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            default:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public LocaleListHelperMethods(setPresentationView setpresentationview, int i) {
        this.IconCompatParcelizer = i;
        setpresentationview.getClass();
        if (i != 26) {
            this.RemoteActionCompatParcelizer = setpresentationview;
        } else {
            this.RemoteActionCompatParcelizer = setpresentationview;
        }
    }

    public LocaleListHelperMethods(q0 q0Var) {
        this.IconCompatParcelizer = 28;
        q0Var.getClass();
        this.RemoteActionCompatParcelizer = q0Var;
    }

    public LocaleListHelperMethods(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        if (i != 20) {
            this.RemoteActionCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        } else {
            this.RemoteActionCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        }
    }

    public LocaleListHelperMethods(requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1) {
        this.IconCompatParcelizer = 1;
        requestgeofencesinitializationlambda1.getClass();
        this.RemoteActionCompatParcelizer = requestgeofencesinitializationlambda1;
    }

    public LocaleListHelperMethods(accessgetTextBottomcp accessgettextbottomcp) {
        this.IconCompatParcelizer = 12;
        accessgettextbottomcp.getClass();
        this.RemoteActionCompatParcelizer = accessgettextbottomcp;
    }

    public LocaleListHelperMethods(accessgetTextBottomcp accessgettextbottomcp, byte b) {
        this.IconCompatParcelizer = 21;
        accessgettextbottomcp.getClass();
        this.RemoteActionCompatParcelizer = accessgettextbottomcp;
    }

    public LocaleListHelperMethods(SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1) {
        this.IconCompatParcelizer = 13;
        semanticsPropertiesLinkTestMarker1.getClass();
        this.RemoteActionCompatParcelizer = semanticsPropertiesLinkTestMarker1;
    }

    public LocaleListHelperMethods(isMainThread ismainthread, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.IconCompatParcelizer = 9;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.RemoteActionCompatParcelizer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public LocaleListHelperMethods(r8lambdaL2KhZ8WIdczgPrnf6hiwq8mR014 r8lambdal2khz8widczgprnf6hiwq8mr014, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.IconCompatParcelizer = 10;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.RemoteActionCompatParcelizer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public LocaleListHelperMethods(hasNestedScrollingParent hasnestedscrollingparent) {
        this.IconCompatParcelizer = 19;
        hasnestedscrollingparent.getClass();
        this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        int i3 = 1;
        int i4 = 8;
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                PlaceholderExtensions_androidKt placeholderExtensions_androidKt = new PlaceholderExtensions_androidKt((FontEj4NQ78) objWrite, new io.sentry.util.MediaBrowserCompatMediaItem(i4));
                int i5 = read + 125;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return placeholderExtensions_androidKt;
            case 1:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new SaveHeatmapUrlImpl(i3, (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) objWrite2);
            case 2:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new accessgetEmptycp((accessrequireViewFactoryHolder) objWrite3);
            case 3:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new PlatformLocaleannotations((transferSessionPackageI) objWrite4);
            case 4:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206 = new BrazeExternalSyntheticLambda206((transferSessionPackageI) objWrite5, false, (byte) 0);
                int i7 = serializer + 27;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return brazeExternalSyntheticLambda206;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 5:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new getBrushui_textannotations((accessrequireViewFactoryHolder) objWrite6);
            case 6:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                return new M((setTransactionSuccessful) objWrite7, 1);
            case 7:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new getFontLoadState((FontEj4NQ78) objWrite8);
            case 8:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new toURLSpan((decode) objWrite9, new io.sentry.util.MediaBrowserCompatMediaItem(i4));
            case 9:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite10;
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite11 = getidentifiersvalidationsenabled.write().write(getSpanUnitR2X_6oannotations.class);
                objWrite11.getClass();
                return (getSpanUnitR2X_6oannotations) objWrite11;
            case 10:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = (getIdentifiersValidationsEnabled) objWrite12;
                getidentifiersvalidationsenabled2.write("http://localhost/");
                Object objWrite13 = getidentifiersvalidationsenabled2.write().write(setBackgroundRPmYEkk.class);
                objWrite13.getClass();
                return (setBackgroundRPmYEkk) objWrite13;
            case 11:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new GraphicsLayerCompanion((verifyAndTrackPlayStorePurchaseI) objWrite14);
            case 12:
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new SaveHeatmapUrlImpl(getactionviewintentlambda0, (getRearDisplayMetrics) objWrite15);
            case 13:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new setSpanStyles((TextPaintExtensions_androidKt) objWrite16);
            case 14:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new applySpanStyle((transferSessionPackageI) objWrite17);
            case 15:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new setTextMotion((accessrequireViewFactoryHolder) objWrite18);
            case 16:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return getSubscripty9eOQZsannotations.RemoteActionCompatParcelizer((NestComponentRepositoryImpl) objWrite19);
            case 17:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new InitializeAppStartupItemsImpl((getHeadingrAG3T2k) objWrite20);
            case 18:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                return new LineBreakStrictnessCompanion((SemanticsOwner) objWrite21);
            case 19:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                isSpecifiedCZqVlQI.RemoteActionCompatParcelizer.getClass();
                return new SettingsOnboardingDataStore((performCustomExitMxy_nc0) isSpecifiedCZqVlQI.IconCompatParcelizer.getValue((Application) objWrite22, isSpecifiedCZqVlQI.write[0]));
            case 20:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new GraphicsLayerCompanion((verifyAndTrackPlayStorePurchaseI) objWrite23);
            case 21:
                AndroidUiFrameClock androidUiFrameClock = new AndroidUiFrameClock();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new accessgetContentOrLtrcp(androidUiFrameClock, (Nonelambda0) objWrite24);
            case 22:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                return new init((Clock) objWrite25);
            case 23:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                return new unpackInt2((transferSessionPackageI) objWrite26, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            case 24:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new unpackInt2((transferSessionPackageI) objWrite27, b, objArr3 == true ? 1 : 0);
            case 25:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new initlambda2((transferSessionPackageI) objWrite28);
            case 26:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new initlambda20((Clock) objWrite29);
            case 27:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new initlambda200((transferSessionPackageI) objWrite30);
            case 28:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new initlambda2020((EnumColumnAdapter) objWrite31);
            default:
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new ObservePuDoDeliveriesResponseImpl((accessrequireViewFactoryHolder) objWrite32);
        }
    }
}
