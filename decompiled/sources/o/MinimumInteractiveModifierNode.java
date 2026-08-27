package o;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.roadrunner.bubble.presentation.BubbleContentKt;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import com.roadrunner.home.expandedbubblelayer.presentation.compose.ExpandedBubbleLayerContentKt;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.login.presentation.router.RouterScreenKt;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MinimumInteractiveModifierNode implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ MinimumInteractiveModifierNode(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getWindow getwindow) {
        this.serializer = 1;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
        this.IconCompatParcelizer = getwindow;
    }

    public /* synthetic */ MinimumInteractiveModifierNode(supportFinishAfterTransition supportfinishaftertransition, getFragment getfragment, HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1) {
        this.serializer = 4;
        this.IconCompatParcelizer = getfragment;
        this.RemoteActionCompatParcelizer = homeFragment$initPopupLayer$1;
    }

    public /* synthetic */ MinimumInteractiveModifierNode(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.serializer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.IconCompatParcelizer;
        if (i2 == 0) {
            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = (androidx.compose.ui.layout.SubcomposeMeasureScope) obj;
            androidx.compose.ui.unit.Constraints constraints = (androidx.compose.ui.unit.Constraints) obj2;
            return ((androidx.compose.ui.layout.MeasurePolicy) obj4).mo6measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(createfromparcel, new DragAndDropTargetModifierNode(new MinimumInteractiveModifierNode((DragAndDropTargetModifierNode) obj3, new getWindow(subcomposeMeasureScope, constraints.m3632unboximpl())), true, -431986394)), constraints.m3632unboximpl());
        }
        if (i2 == 1) {
            DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj3;
            getWindow getwindow = (getWindow) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                dragAndDropTargetModifierNode.invoke(getwindow, getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 2) {
            forEachFocusableIntersection foreachfocusableintersection = (forEachFocusableIntersection) obj4;
            clearUpdated clearupdated = (clearUpdated) obj3;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if ((iIntValue2 & 3) != 2) {
                int i3 = write + 21;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (!(!getpostalcode2.write(iIntValue2 & 1, z))) {
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(clearupdated);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new RoomDatabase$$ExternalSyntheticLambda2(16, clearupdated);
                    getpostalcode2.write(objComponentActivity);
                }
                BubbleContentKt.serializer(foreachfocusableintersection, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 0);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 3) {
            startPostponedEnterTransition startpostponedentertransition = (startPostponedEnterTransition) obj4;
            FragmentSavedState fragmentSavedState = (FragmentSavedState) obj3;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
            int iIntValue3 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                ExpandedBubbleLayerContentKt.ExpandedBubbleLayerContent(startpostponedentertransition.IconCompatParcelizer, fragmentSavedState.RemoteActionCompatParcelizer, null, getpostalcode3, 0);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 4) {
            getFragment getfragment = (getFragment) obj4;
            HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1 = (HomeFragment$initPopupLayer$1) obj3;
            getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
            int iIntValue4 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
            if (getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                int i5 = write + 47;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getGoeUduSuoannotations.RemoteActionCompatParcelizer.invoke(getfragment, homeFragment$initPopupLayer$1, getpostalcode4, 0);
            } else {
                getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i7 = read + 47;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            int i9 = read + 115;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return createfromparcel;
        }
        cdExternalSyntheticLambda0 cdexternalsyntheticlambda0 = (cdExternalSyntheticLambda0) obj4;
        RouterActivity routerActivity = (RouterActivity) obj3;
        getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
        int iIntValue5 = ((Integer) obj2).intValue();
        getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
        if (getpostalcode5.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
            boolean zIconCompatParcelizer2 = getpostalcode5.IconCompatParcelizer(routerActivity);
            Object objComponentActivity2 = getpostalcode5.ComponentActivity();
            if (!zIconCompatParcelizer2) {
                int i11 = read + 21;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1((Object) routerActivity);
                    getpostalcode5.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1((Object) routerActivity);
                getpostalcode5.write(objComponentActivity2);
            }
            RouterScreenKt.write(cdexternalsyntheticlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), getpostalcode5, 0);
        } else {
            getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
