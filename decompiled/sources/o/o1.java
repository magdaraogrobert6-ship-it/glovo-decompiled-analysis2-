package o;

import com.mapbox.search.SearchEngineImpl;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.map.integration.search.InitialiseMapboxSearch;
import com.roadrunner.realtime.data.SocketIoGuard;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.rider.state.realtime.RealtimeStatusUpdateManagerImpl;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer = 1;
    public final mergeJsonObjects write;

    public o1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        lambdaverifyplaystorepurchase45.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = lambdaverifyplaystorepurchase45;
        this.write = mergejsonobjects;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public o1(getEditableText geteditabletext, lineEndToVisibleEnd lineendtovisibleend, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, mergeJsonObjects mergejsonobjects) {
        geteditabletext.getClass();
        lineendtovisibleend.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        this.read = geteditabletext;
        this.IconCompatParcelizer = lineendtovisibleend;
        this.RemoteActionCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.write = mergejsonobjects;
    }

    public o1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = setpresentationview;
        this.write = mergejsonobjects;
    }

    public o1(transformCanvas transformcanvas, AbsSavedState absSavedState, mergeJsonObjects mergejsonobjects, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1) {
        transformcanvas.getClass();
        absSavedState.getClass();
        requestsinglelocationupdatelambda1.getClass();
        this.read = transformcanvas;
        this.IconCompatParcelizer = absSavedState;
        this.write = mergejsonobjects;
        this.RemoteActionCompatParcelizer = requestsinglelocationupdatelambda1;
    }

    public o1(mergeJsonObjects mergejsonobjects, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        requestsinglelocationupdatelambda1.getClass();
        postanimationrunner.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = mergejsonobjects;
        this.read = requestsinglelocationupdatelambda1;
        this.IconCompatParcelizer = postanimationrunner;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.read;
        mergeJsonObjects mergejsonobjects = this.write;
        if (i2 == 0) {
            Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite.getClass();
            Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite2.getClass();
            Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite3.getClass();
            Object objWrite4 = mergejsonobjects.write();
            objWrite4.getClass();
            ng ngVar = new ng((InitialiseMapboxSearch) objWrite, (getContentViewGroupParentLayout) objWrite2, (isOpenInternalroom_runtime) objWrite3, (SearchEngineImpl) objWrite4);
            int i3 = MediaBrowserCompatMediaItem + 77;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return ngVar;
        }
        if (i2 == 1) {
            Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite5.getClass();
            Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite6.getClass();
            Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite7.getClass();
            Object objWrite8 = mergejsonobjects.write();
            objWrite8.getClass();
            PlatformParagraphStyleSaverlambda1 platformParagraphStyleSaverlambda1 = new PlatformParagraphStyleSaverlambda1((r8lambdachPO4eWAQ7w61QZHJUYsstdg5A4) objWrite5, (LineBreakSaverlambda0) objWrite6, (FontVariationSetting) objWrite7, (Savers_androidKt) objWrite8);
            int i5 = MediaMetadataCompat + 105;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return platformParagraphStyleSaverlambda1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 == 2) {
            Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite9.getClass();
            Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite10.getClass();
            Object objWrite11 = mergejsonobjects.write();
            objWrite11.getClass();
            Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite12.getClass();
            return new BackToBackOrdersDataRepositoryImpl((getAnyOverlap) objWrite9, (copyO0kMr_c) objWrite10, (restoreChildFragmentState) objWrite11, (UpdateStateUseCaseImpl) objWrite12);
        }
        if (i2 != 3) {
            Object objWrite13 = mergejsonobjects.write();
            objWrite13.getClass();
            Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
            lazySerializer.getClass();
            Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite14.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
            return new RealtimeStatusUpdateManagerImpl((launchEventResponseTasksI) objWrite13, r8lambdaktwlyipskq3tfa9ey3gatonixfq3, lazySerializer, (getContentViewGroupParentLayout) objWrite14);
        }
        Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite15.getClass();
        Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite16.getClass();
        Object objWrite17 = mergejsonobjects.write();
        objWrite17.getClass();
        Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite18.getClass();
        return new launchEventResponseTasksI((SocketIoGuard) objWrite15, (lambdatrackThirdPartySharing37) objWrite16, (launchDeeplinkMain) objWrite17, (getContentViewGroupParentLayout) objWrite18);
    }
}
