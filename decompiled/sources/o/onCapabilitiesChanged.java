package o;

import android.app.Application;
import android.content.SharedPreferences;
import coil3.ImageLoader$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.delivery.accept.payatpickup.implementation.domain.StoreSelectedPaymentOption;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ShouldNavigateToRecruitmentScreenImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.sentiance.core.model.events.N$b;
import dagger.Lazy;
import io.grpc.internal.CallTracer;

/* JADX INFO: loaded from: classes3.dex */
public final class onCapabilitiesChanged implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final /* synthetic */ int write = 8;

    public onCapabilitiesChanged(newTransaction newtransaction, newTransaction newtransaction2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        newtransaction.getClass();
        newtransaction2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.serializer = newtransaction;
        this.RemoteActionCompatParcelizer = newtransaction2;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, transformCanvas transformcanvas, LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        transformcanvas.getClass();
        localeListHelperMethods.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = transformcanvas;
        this.read = localeListHelperMethods;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public onCapabilitiesChanged(SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, LayoutCompat layoutCompat) {
        semanticsPropertiesLinkTestMarker1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        layoutCompat.getClass();
        this.serializer = semanticsPropertiesLinkTestMarker1;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = layoutCompat;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, FontVariationSettingInt fontVariationSettingInt, FontVariationSettingInt fontVariationSettingInt2, FontVariationSettingInt fontVariationSettingInt3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        fontVariationSettingInt.getClass();
        fontVariationSettingInt2.getClass();
        fontVariationSettingInt3.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = fontVariationSettingInt;
        this.read = fontVariationSettingInt2;
        this.IconCompatParcelizer = fontVariationSettingInt3;
    }

    public onCapabilitiesChanged(publishErrorlambda1 publisherrorlambda1, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, transactionWithResultsuspendImpl transactionwithresultsuspendimpl) {
        publisherrorlambda1.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        transactionwithresultsuspendimpl.getClass();
        this.serializer = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = transactionwithresultsuspendimpl;
    }

    public onCapabilitiesChanged(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        convertstringjsonarraytolistlambda0.getClass();
        requestsinglelocationupdatelambda1.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = convertstringjsonarraytolistlambda0;
        this.RemoteActionCompatParcelizer = requestsinglelocationupdatelambda1;
        this.read = dataModule_ProvideSchedulerFactory;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        generateandroidfontktforapicompatibility.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = generateandroidfontktforapicompatibility;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = setpresentationview;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        generateandroidfontktforapicompatibility.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = setpresentationview;
        this.read = generateandroidfontktforapicompatibility;
        this.IconCompatParcelizer = semanticsPropertiesLinkTestMarker1;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, setPresentationView setpresentationview) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        generateandroidfontktforapicompatibility.getClass();
        setpresentationview.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = generateandroidfontktforapicompatibility;
        this.IconCompatParcelizer = setpresentationview;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }

    public onCapabilitiesChanged(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview) {
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.serializer = hasnestedscrollingparent;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = setpresentationview;
    }

    public onCapabilitiesChanged(setStateDescription setstatedescription, setStateDescription setstatedescription2, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        setstatedescription.getClass();
        setstatedescription2.getClass();
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = setstatedescription;
        this.RemoteActionCompatParcelizer = setstatedescription2;
        this.read = publisherrorlambda1;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, q0 q0Var, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        q0Var.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = q0Var;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public onCapabilitiesChanged(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, getContentDataType getcontentdatatype) {
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        getcontentdatatype.getClass();
        this.serializer = hasnestedscrollingparent;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = dataModule_ProvideSchedulerFactory;
        this.IconCompatParcelizer = getcontentdatatype;
    }

    public onCapabilitiesChanged(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, setPresentationView setpresentationview) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setpresentationview.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.IconCompatParcelizer = setpresentationview;
    }

    public onCapabilitiesChanged(ImageHeaderParserImageType imageHeaderParserImageType, postAnimationRunner postanimationrunner, setPresentationView setpresentationview, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, postAnimationRunner postanimationrunner2) {
        postanimationrunner.getClass();
        setpresentationview.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        postanimationrunner2.getClass();
        this.serializer = postanimationrunner;
        this.RemoteActionCompatParcelizer = setpresentationview;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.IconCompatParcelizer = postanimationrunner2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.serializer;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite.getClass();
                Application application = (Application) objWrite;
                j4 j4Var = new j4();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite2.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite2;
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objWrite3;
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new RouteArrowApi(application, j4Var, transfersessionpackagei, getcontentviewgroupparentlayout, (isOpenInternalroom_runtime) objWrite4);
            case 1:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite6.getClass();
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new ImageLoader$Builder((accessrequireViewFactoryHolder) objWrite5, (StoreSelectedPaymentOption) objWrite6, (PlaceholderSpan) objWrite7, (getModelzQqcRY) objWrite8);
            case 2:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite10.getClass();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                protobufEncoder.write = (decode) objWrite9;
                protobufEncoder.serializer = (TextUnitType) objWrite10;
                protobufEncoder.RemoteActionCompatParcelizer = (FontEj4NQ78default) objWrite11;
                return protobufEncoder;
            case 3:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite14.getClass();
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new accessparseLanguageTag((setTransactionSuccessful) objWrite13, (getEmpty) objWrite14, (PlatformLocaleannotations) objWrite15, (transferSessionPackageI) objWrite16);
            case 4:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite18.getClass();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new setBrush12SF9DM((decode) objWrite17, (isOpenInternalroom_runtime) objWrite18, (FontEj4NQ78default) objWrite19, (getLooseusljTpc) objWrite20);
            case 5:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new CallTracer((accessunpackByte3) objWrite21, (setTransactionSuccessful) objWrite22, (r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0) objWrite23, (packBytes) objWrite24);
            case 6:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite26.getClass();
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite27.getClass();
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new FragmentManagerLaunchedFragmentInfo((performViewCreated) objWrite25, (requestPermissions) objWrite26, (getHeadingrAG3T2k) objWrite27, (transferSessionPackageI) objWrite28);
            case 7:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite29.getClass();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite30.getClass();
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new consumeFlingInStretch((transferSessionPackageI) objWrite29, (EnumColumnAdapter) objWrite30, lazySerializer, (getContentViewGroupParentLayout) objWrite31);
            case 8:
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite32.getClass();
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite33.getClass();
                getBindingAdapterPosition getbindingadapterposition = (getBindingAdapterPosition) objWrite33;
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite34.getClass();
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite35.getClass();
                return new getBindingAdapter(getbindingadapterposition, (getAdapterPosition) objWrite32, (getOldPosition) objWrite34, (getLayoutPosition) objWrite35);
            case 9:
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite36.getClass();
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite38.getClass();
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite39.getClass();
                return getSplitTrack.read((Application) objWrite36, (SharedPreferences) objWrite37, (getAllSemanticsNodesToMap) objWrite38, (accessgetOldDependencyp) objWrite39);
            case 10:
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite40.getClass();
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite41.getClass();
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite42.getClass();
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite43.getClass();
                return new getAdidWithTimeout((com.deliveryhero.fwf_client.FwFClient) objWrite40, (Gen2FunWithFlagsConfigRepository) objWrite41, (endFirstSessionDelay) objWrite42, (isOpenInternalroom_runtime) objWrite43);
            case 11:
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite44.getClass();
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite45.getClass();
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite46.getClass();
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite47.getClass();
                SetApplicantIdUseCaseImpl setApplicantIdUseCaseImpl = new SetApplicantIdUseCaseImpl((AppEventInfoChangeHandler) objWrite44, (ApplicantRepository) objWrite45, (boundingRectInRoot) objWrite46, (setConfig) objWrite47);
                int i3 = RatingCompat + 71;
                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 8 / 0;
                }
                return setApplicantIdUseCaseImpl;
            case 12:
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite48.getClass();
                Object objWrite49 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite49.getClass();
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer2.getClass();
                Object objWrite50 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite50.getClass();
                return new ShouldNavigateToRecruitmentScreenImpl((RectManager) objWrite48, (SemanticsPropertiesContentDescription1) objWrite49, lazySerializer2, (transferSessionPackageI) objWrite50);
            case 13:
                Object objWrite51 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite51.getClass();
                Object objWrite52 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite52.getClass();
                Object objWrite53 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite53.getClass();
                Object objWrite54 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite54.getClass();
                N$b n$b = new N$b((xa) objWrite51, (v9) objWrite52, (setLastHorizontalStyle) objWrite53, (setTransactionSuccessful) objWrite54);
                int i5 = RatingCompat + 7;
                MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
                return n$b;
            case 14:
                Object objWrite55 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite55.getClass();
                Object objWrite56 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite56.getClass();
                Object objWrite57 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite57.getClass();
                Object objWrite58 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite58.getClass();
                return new getDeviceType((GetRiderStateImpl) objWrite55, (subscribeToBannersUpdateslambda2) objWrite56, (setTransactionSuccessful) objWrite57, (AttributionHandler1) objWrite58);
            default:
                Object objWrite59 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite59.getClass();
                Object objWrite60 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite60.getClass();
                Object objWrite61 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite61.getClass();
                Object objWrite62 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite62.getClass();
                return new addI((decode) objWrite59, (FontEj4NQ78default) objWrite60, (getContentViewGroupParentLayout) objWrite61, (isOpenInternalroom_runtime) objWrite62);
        }
    }
}
